package com.work.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.work.bean.BankCircleBean;
import com.work.bean.BankCircleCommentBean;
import com.work.bean.BankCircleImgBean;
import com.work.bean.BankCirclePariseBean;
import com.work.common.Constants;
import com.work.common.DateUtil;
import com.work.common.JSONResult;
import com.work.common.UUIDGeneratorUtil;
import com.work.entity.TBankCircle;
import com.work.entity.TBankCircleComment;
import com.work.entity.TBankCircleImg;
import com.work.entity.TBankCircleParise;
import com.work.mapper.TBankCircleCommentMapper;
import com.work.mapper.TBankCircleMapper;
import com.work.mapper.TBankCirclePariseMapper;
import com.work.mapper.TExamMapper;
import net.sf.json.JSONException;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class TBankCircleService {
	
	@Resource
	private TBankCircleMapper bankCircleMapper;
	
	@Resource
	private TExamMapper examMapper;
	
	@Resource
	private TBankCircleCommentMapper commentMapper;
	
	@Resource
	private TBankCirclePariseMapper pariseMapper;
	
	/**
	 * 添加中行圈数据
	 * @param bankCircle
	 */
	public void saveBankCircle(TBankCircle bankCircle,String[] images){
		bankCircle.setId(UUIDGeneratorUtil.generate());
		String deptOrg = examMapper.queryDeptOrgByEmpId(bankCircle.getEmpId());
		bankCircle.setCommCount("0");
		bankCircle.setPariseCount("0");
		bankCircle.setOrgOrDeptCode(deptOrg);
		bankCircle.setCreateTime(DateUtil.formatDate(new Date()));
		if(selectUserIsOrgManager(bankCircle.getEmpId())){
			bankCircle.setIsHot("1");
		}
		bankCircleMapper.insertSelective(bankCircle);
		List<String> imgs = Arrays.asList(images);
		for (String imgUrl : imgs) {
			BankCircleImgBean imgBean = new BankCircleImgBean();
			imgBean.setId(UUIDGeneratorUtil.generate());
			imgBean.setCircleId(bankCircle.getId());
			imgBean.setImgUrl(imgUrl);
			bankCircleMapper.saveBankCircleImg(imgBean);
		}
	}
	
	/**
	 * 添加到公共圈
	 */
	public JSONResult savePublicCircle(String id) {
		JSONResult result = JSONResult.getSuccess();
		try {
			TBankCircle tBankCircle = bankCircleMapper.selectByPrimaryKey(id);
			if(tBankCircle.getIsPublic().equals("1")){
				TBankCircle bankCircle = new TBankCircle();
				bankCircle.setId(id);
				bankCircle.setIsPublic("0");
				bankCircleMapper.updateByPrimaryKeySelective(bankCircle);
				result = JSONResult.getSuccess("取消推荐成功");
			}else{
				TBankCircle bankCircle = new TBankCircle();
				bankCircle.setId(id);
				bankCircle.setIsPublic("1");
				bankCircleMapper.updateByPrimaryKeySelective(bankCircle);
				result = JSONResult.getSuccess("推荐成功");
			}
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
			throw new RuntimeException("运行时出错！");
		}
		return result;
	}
	
	/**
	 * 根据用户查询部门圈
	 * @param bean
	 * @return
	 */
	public List<TBankCircle> selectListDeptBankCircle(BankCircleBean bean){
		String code = examMapper.queryOrgCodeByEmpId(bean.getEmpId());
		String deptOrg = examMapper.queryDeptOrgByEmpId(bean.getEmpId());
		if(StringUtils.equals("00007", code)){//省行领导情况,把参数设置为空，可以查询所有部门数据
			//deptOrg = "";
		}
		PageHelper.startPage(bean.getPage(), bean.getPageSize());
		Map<String, Object> map = Maps.newHashMap();
		map.put("code", deptOrg);
		List<TBankCircle> list = bankCircleMapper.selectListDeptBankCircle(map);
		for (TBankCircle tBankCircle : list) {
			List<TBankCircleImg> imgs = bankCircleMapper.selectBankCircleImgListByCId(tBankCircle.getId());
			tBankCircle.setImgs(imgs);
			PageHelper.startPage(1, 10);
			List<TBankCircleComment> comments = commentMapper.selectCommentByBankCircleId(tBankCircle.getId());
			tBankCircle.setComments(comments);
			
			Page page = PageHelper.startPage(1, 15);
			List<TBankCircleParise> parises = pariseMapper.selectPariseByBankCircleId2(tBankCircle.getId());
			tBankCircle.setParises(parises);
			BankCirclePariseBean beanPariseBean = new BankCirclePariseBean();
			beanPariseBean.setCircleId(tBankCircle.getId());
			beanPariseBean.setEmpId(bean.getEmpId());
			tBankCircle.setIsZ(selectUserIsParise(beanPariseBean));
			tBankCircle.setPariseCount(String.valueOf(page.getTotal()));
		}
		return list;
	}
	
	/**
	 * 查询公共圈
	 * @param bean
	 * @return
	 */
	public List<TBankCircle> selectListPublicBankCircle(BankCircleBean bean){
		PageHelper.startPage(bean.getPage(), bean.getPageSize());
		List<TBankCircle> list = bankCircleMapper.selectListPublicBankCircle();
		for (TBankCircle tBankCircle : list) {
			List<TBankCircleImg> imgs = bankCircleMapper.selectBankCircleImgListByCId(tBankCircle.getId());
			tBankCircle.setImgs(imgs);
			PageHelper.startPage(1, 10);
			List<TBankCircleComment> comments = commentMapper.selectCommentByBankCircleId(tBankCircle.getId());
			tBankCircle.setComments(comments);
			
			Page page = PageHelper.startPage(1, 15);
			List<TBankCircleParise> parises = pariseMapper.selectPariseByBankCircleId(tBankCircle.getId());
			tBankCircle.setParises(parises);
			BankCirclePariseBean beanPariseBean = new BankCirclePariseBean();
			beanPariseBean.setCircleId(tBankCircle.getId());
			beanPariseBean.setEmpId(bean.getEmpId());
			tBankCircle.setIsZ(selectUserIsParise(beanPariseBean));
			tBankCircle.setPariseCount(String.valueOf(page.getTotal()));
		}
		return list;
	}
	
	/**
	 * 查询热门圈
	 * @param bean
	 * @return
	 */
	public List<TBankCircle> selectListHotBankCircle(BankCircleBean bean){
		PageHelper.startPage(bean.getPage(),bean.getPageSize());
		List<TBankCircle> list = bankCircleMapper.selectListHotBankCircle();
		for (TBankCircle tBankCircle : list) {
			List<TBankCircleImg> imgs = bankCircleMapper.selectBankCircleImgListByCId(tBankCircle.getId());
			tBankCircle.setImgs(imgs);

			PageHelper.startPage(1, 10);
			List<TBankCircleComment> comments = commentMapper.selectCommentByBankCircleId(tBankCircle.getId());
			tBankCircle.setComments(comments);
			
			Page page = PageHelper.startPage(1, 15);
			List<TBankCircleParise> parises = pariseMapper.selectPariseByBankCircleId(tBankCircle.getId());
			tBankCircle.setParises(parises);
			BankCirclePariseBean beanPariseBean = new BankCirclePariseBean();
			beanPariseBean.setCircleId(tBankCircle.getId());
			beanPariseBean.setEmpId(bean.getEmpId());
			tBankCircle.setIsZ(selectUserIsParise(beanPariseBean));
			tBankCircle.setPariseCount(String.valueOf(page.getTotal()));
		}
		return list;
	}
	
	/**
	 * 添加中行圈评论
	 * @param comment
	 */
	public String saveBankComment(TBankCircleComment comment){
		//查询过滤字符
		/*List<String> list = commentMapper.selectFilterKeyWork();
		for (String key : list) {
			if (comment.getContent().contains(key)) {  
				comment.setContent(comment.getContent().replace(key, "*"));  
			}  
		}*/
		String id = UUIDGeneratorUtil.generate();
		comment.setContent(filterComment(comment.getContent()));
		comment.setId(id);
		comment.setCreateTime(DateUtil.formatDate(new Date()));
		commentMapper.insertSelective(comment);
		//修改评论数
		TBankCircle bankCircle = bankCircleMapper.selectByPrimaryKey(comment.getCircleId());
		Integer count = Integer.valueOf(StringUtils.defaultIfEmpty(bankCircle.getCommCount(), "0"));
		bankCircle.setCommCount(String.valueOf(count+1));
		bankCircleMapper.updateByPrimaryKeySelective(bankCircle);
		return id;
	}
	
	/**
	 * 过滤字符
	 * @param comment
	 * @return
	 */
	public String filterComment(String comment){
		//查询过滤字符
		List<String> list = commentMapper.selectFilterKeyWork();
		for (String key : list) {
			if (comment.contains(key)) {
				StringBuffer s = new StringBuffer();
				for (int i = 0; i < key.length(); i++) {
					s.append("*");
				}
				comment = comment.replace(key, s);  
			}  
		}
		return comment;
	}
	
	
	/**
	 * 添加中行圈赞
	 *
	 */
	public String saveBankParise(TBankCircleParise parise,boolean isZ){
		String id = UUIDGeneratorUtil.generate();
		if(!isZ){
			parise.setId(id);
			parise.setCreateTime(DateUtil.formatDate(new Date()));
			pariseMapper.insertSelective(parise);
			//修改赞数
			TBankCircle bankCircle = bankCircleMapper.selectByPrimaryKey(parise.getCircleId());
			Integer count = Integer.valueOf(StringUtils.defaultIfEmpty(bankCircle.getPariseCount(), "0"));
			bankCircle.setPariseCount(String.valueOf(count+1));
			//判断是否是省行副行长及以上的人点赞
			boolean isM = BooleanUtils.toBoolean(bankCircleMapper.selectUserIsOrgManager(parise.getEmpId()));
			if(isM){
				bankCircle.setIsHot("1");
				bankCircle.setPariseTime(DateUtil.formatDate(new Date()));
			}
			bankCircleMapper.updateByPrimaryKeySelective(bankCircle);
		}else{
			pariseMapper.deleteUserPariseById(parise);
			//修改赞数
			TBankCircle bankCircle = bankCircleMapper.selectByPrimaryKey(parise.getCircleId());
			Integer count = Integer.valueOf(StringUtils.defaultIfEmpty(bankCircle.getPariseCount(), "0"));
			bankCircle.setPariseCount(String.valueOf(count-1));
			//判断是否是省行副行长及以上的人点赞
			boolean isM = BooleanUtils.toBoolean(bankCircleMapper.selectUserIsOrgManager(parise.getEmpId()));
			if(isM){
				bankCircle.setIsHot("0");
				bankCircle.setPariseTime(null);
			}
			bankCircleMapper.updateByPrimaryKeySelective(bankCircle);
		}
		return id;
	}
	
	/**
	 * 判断用户是否是部门副总或者二级分行副行长及以上人员       sql由宋启建提供
	 * @param empId
	 * @return
	 */
	public boolean selectUserisDeptOrOrgManager(String empId){
		int count = bankCircleMapper.selectUserisDeptOrOrgManager(empId);
		if(count>=1){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * 判断用户是否是省行行长或副行长
	 * @param empId
	 * @return
	 */
	public boolean selectUserIsOrgManager(String empId){
		int count = bankCircleMapper.selectUserIsOrgManager(empId);
		if(count>=1){
			return true;
		}else{
			return false;
		}
	}
	
	
	/**
	 * 删除中行圈数据
	 * @param id
	 */
	public void deleteBankCircle(String id){
		bankCircleMapper.deleteByPrimaryKey(id);
	}
	
	/**
	 * 根据ID查询中行圈
	 * @param id
	 */
	public TBankCircle selectByPrimaryKey(String id){
		TBankCircle bankCircle = bankCircleMapper.selectByPrimaryKey(id);
		return bankCircle;
	}

	/**
	 * 判断用户是否赞过
	 * @param bean
	 * @return 
	 */
	public boolean selectUserIsParise(BankCirclePariseBean bean){
		return BooleanUtils.toBoolean(pariseMapper.selectUserIsParise(bean));
	}
	
	/**
	 * 删除评论
	 * @param bean
	 * @return
	 */
	public JSONResult deleteBankComment(BankCircleCommentBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			commentMapper.deleteByPrimaryKey(bean.getId());
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
			throw new RuntimeException("运行时出错！");
		}
		return result;
	}
	
	/**
	 * 查询自己发布的朋友圈
	 * @param bean
	 * @return
	 */
	public JSONResult selectListMyCircle(BankCircleBean bean) {
		JSONResult result = JSONResult.getSuccess();
		try {
			PageHelper.startPage(bean.getPage(),bean.getPageSize());
			List<TBankCircle> list = bankCircleMapper.selectMyListBankCircle(bean);
			for (TBankCircle tBankCircle : list) {
				List<TBankCircleImg> imgs = bankCircleMapper.selectBankCircleImgListByCId(tBankCircle.getId());
				tBankCircle.setImgs(imgs);
				
				List<TBankCircleComment> comments = commentMapper.selectCommentByBankCircleId(tBankCircle.getId());
				tBankCircle.setComments(comments);
				
				Page page = PageHelper.startPage(1, 40);
				List<TBankCircleParise> parises = pariseMapper.selectPariseByBankCircleId(tBankCircle.getId());
				tBankCircle.setParises(parises);
				BankCirclePariseBean beanPariseBean = new BankCirclePariseBean();
				beanPariseBean.setCircleId(tBankCircle.getId());
				beanPariseBean.setEmpId(bean.getUserid());
				tBankCircle.setIsZ(selectUserIsParise(beanPariseBean));
				tBankCircle.setPariseCount(String.valueOf(page.getTotal()));
			}
			result.getBody().put("list", list);
		} catch (JSONException je) {
			je.printStackTrace();
			result = JSONResult.getFail(Constants.PARAM_ERROR, "请求参数异常");
		} catch (Exception e) {
			e.printStackTrace();
			result = JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
			throw new RuntimeException("运行时出错！");
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<String> list = Lists.newArrayList();
		list.add("共产党");
		String comment = "没有共产党，就没有新中国";
		for (String key : list) {
			if (comment.contains(key)) {
				StringBuffer s = new StringBuffer();
				for (int i = 0; i < key.length(); i++) {
					s.append("*");
				}
				comment = comment.replace(key, s);  
			}  
		}
		System.out.println(comment);
	}
}
