package com.work.api.v2;


import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.work.common.*;
import com.work.service.TBankCircleService;
import net.sf.json.JSONException;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.bean.CrowdBean;
import com.work.bean.DiscussionBean;
import com.work.bean.PraiseBean;
import com.work.entity.TCrowdfunding;
import com.work.entity.TDiscussion;
import com.work.entity.TLike;
import com.work.service.TCrowdfundingService;
import com.work.service.TExamService;


/**
 *  众筹
* @包名   com.work.api.v2   
* @文件名 CrowController.java   
* @作者   ZhouChang oupinzc@qq.com   
* @创建日期 2016年11月2日   
* @版本 V 2.0
 */
@RestController
@RequestMapping("app/v2/crow")
public class CrowController {
	
	@Resource
	private TCrowdfundingService crowdfundingService;
	
	@Resource
	private TExamService examService;

	@Resource
	private TBankCircleService bankCircleService;

    private static final Logger logger = LoggerFactory.getLogger(CrowController.class);
	
	/**
	 * 根据状态查询众筹列表
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "listCrow")
	@ResponseBody
	@ApiRemark("根据状态查询众筹列表")
	public JSONResult listCrow(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			CrowdBean bean = JsonUtil.toBean(req_params, CrowdBean.class);

			boolean isProManager = bankCircleService.selectUserIsOrgManager(bean.getUserid());
			String sql="";

			if(!isProManager)
			{
				sql="select cf.*  from tb_cf_crowdfunding cf "+
						" inner join (select * from tb_cf_participant tp where tp.fd_orgcode = "+
						" (select t.fd_dept_org from tb_pepmgm_empinfo t  where t.fd_empid = '"+bean.getUserid()+"')) tpa on cf.fd_cf_id = tpa.fd_cf_id ";
				//过滤屏蔽
				sql = sql +"  and  cf.fd_show_state='0' ";

				//行方提出要求查询当前发起日期在今天之前的众筹

				String today= DateUtil.defaultFormat(new Date());
				if((today != null&&!"".equals(today))){
					sql=sql +" and to_date(subStr(cf.fd_starttime,0,10),'yyyy-mm-dd') <= to_date('"+today+"','yyyy-mm-dd') ";
				}
			}
			else
			{
				sql = " select cf.*  from tb_cf_crowdfunding cf  ";

				String today= DateUtil.defaultFormat(new Date());
				if((today != null&&!"".equals(today))){
					sql=sql +" where to_date(subStr(cf.fd_starttime,0,10),'yyyy-mm-dd') <= to_date('"+today+"','yyyy-mm-dd') ";
					sql =sql+" and cf.fd_show_state='0'";
				}
				else
				{
					sql = sql +" where cf.fd_show_state='0'";
				}
			}
			String orderSql = " order by  cf.fd_top desc,cf.fd_starttime desc, cf.fd_endtime desc ";

			bean.setSql(sql+orderSql);
			List<TCrowdfunding> list = crowdfundingService.selectCrowdfundingByStateOrderByTop(bean);
			if(list!=null&&list.size()>0){
                for(int i=0;i<list.size();i++){
                    if(StringUtils.isNotBlank(list.get(i).getUrl())){
                        list.get(i).setFlag("1");
                    }else{
                        list.get(i).setFlag("0");
                    }
                }
            }

			result.getBody().put("list", list);

		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
		return result;
	}
	
	
	/**
	 * 热门众筹
	 * @param request
	 * @return
	 */
	@RequestMapping(value="crowHot")
	@ResponseBody
	@ApiRemark("热门众筹")
	public JSONResult crowHot(HttpServletRequest request) {
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			CrowdBean bean = JsonUtil.toBean(req_params, CrowdBean.class);

			String sql = "";
			sql = "select cf.*  from tb_cf_crowdfunding cf "+
			" inner join (select * from tb_cf_participant tp where tp.fd_orgcode = "+
					" (select t.fd_dept_org from tb_pepmgm_empinfo t  where t.fd_empid = '"+bean.getUserid()+"')) tpa on cf.fd_cf_id = tpa.fd_cf_id";

			boolean isProManager = bankCircleService.selectUserIsOrgManager(bean.getUserid());
			//如果是行长，则全部要看到
			if(isProManager)
			{
				sql ="select cf.*  from tb_cf_crowdfunding cf where  cf.fd_show_state='0'";
			}

			bean.setSql(sql);

			List<TCrowdfunding> hot_list = crowdfundingService.selectCrowdfundingByHot(bean);
			result.getBody().put("hot_list", hot_list);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 众筹详情
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "crowDetail")
	@ResponseBody
	@ApiRemark("众筹详情")
	public JSONResult crowDetail(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess();
		logger.info("====================进入众筹详情=====================");
		try {
			Object req_params = request.getAttribute("req_params");
			CrowdBean bean = JsonUtil.toBean(req_params, CrowdBean.class);
			TCrowdfunding crowdfunding = crowdfundingService.selectCrowdBycj(bean);
            logger.info("众筹UserID==============="+bean.getUserid());
			if(StringUtils.isNotBlank(bean.getUserid())){
                if(StringUtils.isNotBlank(crowdfunding.getUrl())){
                    String url=crowdfunding.getUrl();
                    String uid=PasswordUtils.encode(bean.getUserid());
                    crowdfunding.setUrl(url+"?"+crowdfunding.getName()+"="+uid);
                    crowdfunding.setFlag("1");
                }else{
                    crowdfunding.setFlag("0");
                }
            }else{
                crowdfunding.setUrl("");
                crowdfunding.setFlag("0");
            }
            logger.info("crowdfunding的值==============="+crowdfunding.toString());
			result.getBody().put("crowdfunding", crowdfunding);
			//评论列表
			List<TDiscussion> discussions = crowdfundingService.selectListDisByCrowId(bean);
			result.getBody().put("discussions", discussions);
			
			PraiseBean praiseBean = new PraiseBean();
			praiseBean.setType("1");
			praiseBean.setFdDissId(bean.getFdCfId());
			praiseBean.setFdEmpid(bean.getUserid());
			boolean isZ = crowdfundingService.selectUserIsLike(praiseBean);
			result.getBody().put("isZ", isZ);

			//是否为黑名单禁言了
			List<Map<String,Object>>  listBlakDatas = crowdfundingService.selectProHibitBean(bean);
			if(listBlakDatas.isEmpty())
			{
				//没有被禁言
				result.getBody().put("isProhibit","0");
			}
			else
			{
				//禁言了
				result.getBody().put("isProhibit","1");
			}
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
		return result;
	}
	
	/**
	 * 评论列表
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "listDiscussion")
	@ResponseBody
	@ApiRemark("评论列表")
	public JSONResult listDiscussion(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			CrowdBean bean = JsonUtil.toBean(req_params, CrowdBean.class);
			//评论列表
			List<TDiscussion> discussions = crowdfundingService.selectListDisByCrowId(bean);
			result.getBody().put("discussions", discussions);
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
		return result;
	}
	
	/**
	 * 添加众筹力量评论
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "addDiscussion")
	@ResponseBody
	@ApiRemark("添加众筹力量评论")
	public JSONResult addDiscussion(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess("添加成功");
		try {
			Object req_params = request.getAttribute("req_params");
			DiscussionBean bean = JsonUtil.toBean(req_params, DiscussionBean.class);
			int crowDissCount = crowdfundingService.selectDissCount(bean);
			//每个人最多不能超过3条
			if(crowDissCount<=3)
			{
				crowdfundingService.saveDiscussion(bean);
			}
			else
			{
				result = JSONResult.getFail(Constants.PARAM_ERROR, "您的评论数超过了最大限制！");
			}

		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
		return result;
	}
	
	
	/**
	 * 众筹排行
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "crowRank")
	@ResponseBody
	@ApiRemark("众筹排行")
	public JSONResult crowRank(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			CrowdBean bean = JsonUtil.toBean(req_params, CrowdBean.class);
			//排行
			List<Map<String,String>> discussions = crowdfundingService.selectListDisRankByCrowId(bean);
			result.getBody().put("discussions", discussions);
			
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
		return result;
	}
	
	/**
	 * 点赞
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "praise")
	@ResponseBody
	@ApiRemark("点赞")
	public JSONResult praise(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			PraiseBean bean = JsonUtil.toBean(req_params, PraiseBean.class);
			TLike like = new TLike();
			BeanUtils.copyProperties(like, bean);
			if(crowdfundingService.selectUserIsLike(bean)){
				result = JSONResult.getFail("您已点过赞");
			}else{
				if(StringUtils.equals("1", bean.getType())){//类型(1:众筹点赞，2：评论点赞)
					crowdfundingService.updateCrowLike(bean.getFdDissId());
				}else{
					crowdfundingService.updateDisLike(bean.getFdDissId());
				}
				crowdfundingService.saveLike(like);
			}
			
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
		return result;
	}


	/**
	 * 查询众筹评论数
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "crowDissCount")
	@ResponseBody
	@ApiRemark("众筹评论数")
	public JSONResult crowDissCount(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			DiscussionBean bean = JsonUtil.toBean(req_params, DiscussionBean.class);
			int crowDissCount = crowdfundingService.selectDissCount(bean);
			result.getBody().put("dissCount",String.valueOf(crowDissCount));
		}
		catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
		return result;
	}

}
