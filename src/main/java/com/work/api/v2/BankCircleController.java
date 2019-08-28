package com.work.api.v2;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONException;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.bean.BankCircleBean;
import com.work.bean.BankCircleCommentBean;
import com.work.bean.BankCirclePariseBean;
import com.work.common.ApiRemark;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.entity.TBankCircle;
import com.work.entity.TBankCircleComment;
import com.work.entity.TBankCircleParise;
import com.work.service.TBankCircleService;


/**
 * 中行圈
* @包名   com.work.api.v2   
* @文件名 BankCircleController.java   
* @作者   ZhouChang oupinzc@qq.com   
* @创建日期 2016年11月16日   
* @版本 V 1.0
 */
@RestController
@RequestMapping("app/v2/circle")
public class BankCircleController {
	
	@Resource
	private TBankCircleService bankCircleService;
	
	/**
	 * 部门圈
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "listDeptCircle")
	@ResponseBody
	@ApiRemark("部门圈")
	public JSONResult listDeptCircle(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			BankCircleBean bean = JsonUtil.toBean(req_params, BankCircleBean.class);
			List<TBankCircle> list = bankCircleService.selectListDeptBankCircle(bean);
			result.getBody().put("list", list);
			boolean isManager = bankCircleService.selectUserisDeptOrOrgManager(bean.getEmpId());
			boolean isProManager = bankCircleService.selectUserIsOrgManager(bean.getEmpId());
			result.getBody().put("isProManager", isProManager);
			result.getBody().put("isManager", isManager);
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
	 * 是否是行长
	 * @param request
	 * @return
	 */
	@RequestMapping("isProManager")
	@ResponseBody
	@ApiRemark("是否是行长")
	public JSONResult isProManager(HttpServletRequest request) {
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			BankCircleBean bean = JsonUtil.toBean(req_params, BankCircleBean.class);
			boolean isProManager = bankCircleService.selectUserIsOrgManager(bean.getEmpId());
			result.getBody().put("isProManager", isProManager);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
		return result;
	}
	
	/**
	 * 公共圈
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "listPublicCircle")
	@ResponseBody
	@ApiRemark("公共圈")
	public JSONResult listPublicCircle(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			BankCircleBean bean = JsonUtil.toBean(req_params, BankCircleBean.class);
			List<TBankCircle> list = bankCircleService.selectListPublicBankCircle(bean);
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
	 * 热门圈
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "listHotCircle")
	@ResponseBody
	@ApiRemark("热门圈")
	public JSONResult listHotCircle(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			BankCircleBean bean = JsonUtil.toBean(req_params, BankCircleBean.class);
			List<TBankCircle> list = bankCircleService.selectListHotBankCircle(bean);
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
	 * 添加部门圈数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "addCircle")
	@ResponseBody
	@ApiRemark("添加部门圈数据")
	public JSONResult addCircle(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			BankCircleBean bean = JsonUtil.toBean(req_params, BankCircleBean.class);
			TBankCircle bankCircle = new TBankCircle();
			BeanUtils.copyProperties(bankCircle, bean);
			bankCircleService.saveBankCircle(bankCircle,bean.getImg().split(","));
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
	 * 添加公共圈
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "addPublicCircle")
	@ResponseBody
	@ApiRemark("添加公共圈")
	public JSONResult post(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			BankCircleBean bean = JsonUtil.toBean(req_params, BankCircleBean.class);
			return bankCircleService.savePublicCircle(bean.getId());
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
	 * 添加评论
	 * @param request
	 * @return
	 */
	
	@RequestMapping(value = "addComment")
	@ResponseBody
	@ApiRemark("添加评论")
	public JSONResult addComment(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			BankCircleCommentBean bean = JsonUtil.toBean(req_params, BankCircleCommentBean.class);
			TBankCircleComment comment = new TBankCircleComment();
			BeanUtils.copyProperties(comment, bean);
			String id = bankCircleService.saveBankComment(comment);
			result.getBody().put("id", id);
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
	 * 添加赞
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "addParise")
	@ResponseBody
	@ApiRemark("添加赞")
	public JSONResult addParise(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			BankCirclePariseBean bean = JsonUtil.toBean(req_params, BankCirclePariseBean.class);
			TBankCircleParise parise = new TBankCircleParise();
			BeanUtils.copyProperties(parise, bean);
			String id = bankCircleService.saveBankParise(parise,bankCircleService.selectUserIsParise(bean));
			result.getBody().put("id", id);
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
	 * 删除圈数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "delBankCircle")
	@ResponseBody
	@ApiRemark("删除圈数据")
	public JSONResult delBankCircle(HttpServletRequest request) {
		// TODO Auto generated method stub
		JSONResult result = JSONResult.getSuccess();
		try {
			Object req_params = request.getAttribute("req_params");
			BankCircleBean bean = JsonUtil.toBean(req_params, BankCircleBean.class);
			TBankCircle bankCircle = bankCircleService.selectByPrimaryKey(bean.getId());
			if(StringUtils.equals(bean.getEmpId(), bankCircle.getEmpId())){
				bankCircleService.deleteBankCircle(bean.getId());
			}else{
				result = JSONResult.getFail("不能删除非自己创建的数据");
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
	 * 删除评论
	 * @param request
	 * @return
	 */
	@RequestMapping("delComment")
	@ResponseBody
	@ApiRemark("删除评论")
	public JSONResult delComment(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			BankCircleCommentBean bean = JsonUtil.toBean(req_params, BankCircleCommentBean.class);
			return bankCircleService.deleteBankComment(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 查看自己发布的朋友圈
	 * @param request
	 * @return
	 */
	@RequestMapping("listMyCircle")
	@ResponseBody
	@ApiRemark("查看自己发布的朋友圈")
	public JSONResult listMyCircle(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			BankCircleBean bean = JsonUtil.toBean(req_params, BankCircleBean.class);
			return bankCircleService.selectListMyCircle(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
}
