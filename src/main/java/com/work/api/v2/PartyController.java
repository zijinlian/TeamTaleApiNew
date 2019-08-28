package com.work.api.v2;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.bean.PartyBean;
import com.work.common.ApiRemark;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.service.PartyService;

/**
 * 党建文化
 * @author zhoucha
 *
 */
@RestController
@RequestMapping("app/v2/party")
public class PartyController {
	
	@Resource
	private PartyService partyService;
	
	/**
	 * 党务信息列表
	 * @param request
	 * @return
	 */
	@RequestMapping("listPartyInfo")
	@ResponseBody
	@ApiRemark("党务信息列表")
	public JSONResult listPartyInfo(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			PartyBean bean = JsonUtil.toBean(req_params, PartyBean.class);
			return partyService.selectPartyList(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}

//	/**
//	 * 成员信息列表
//	 * @param request
//	 * @return
//	 */
//	@RequestMapping("listGroupPartyInfo")
//	@ResponseBody
//	@ApiRemark("成员信息列表")
//	public JSONResult listPa(HttpServletRequest request) {
//		try {
//			Object req_params = request.getAttribute("req_params");
//			PartyBean bean = JsonUtil.toBean(req_params, PartyBean.class);
//			System.out.print("the bean is :"+bean.getPartyId());
//			return partyService.selectGroupInfoById(bean);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
//		}
//	}


	/**
	 * 党员和非党员数
	 * @param request
	 * @return
	 */
	@RequestMapping("partyPeopleCount")
	@ResponseBody
	@ApiRemark("党员和非党员数")
	public JSONResult partyPeopeleCount(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			PartyBean bean = JsonUtil.toBean(req_params, PartyBean.class);
//			System.out.print("the bean is :"+bean.getPartyId());
			return partyService.selectPartyCount(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}


	/**
	 * 党务成员信息
	 * @param request
	 * @return
	 */
	@RequestMapping("partGroupInfo")
	@ResponseBody
	@ApiRemark("党务成员")
	public JSONResult partGroupInfo(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			PartyBean bean = JsonUtil.toBean(req_params, PartyBean.class);
//			System.out.print("the bean is :"+bean.getPartyId());
			return partyService.selectGroupInfoById(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}




	/**
	 * 查询党风廉政建设
	 * @param request
	 * @return
	 */
	@RequestMapping("listPartyIncorrupt")
	@ResponseBody
	@ApiRemark("党风廉政")
	public JSONResult listPartyIncorrupt(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			PartyBean bean = JsonUtil.toBean(req_params, PartyBean.class);
			return partyService.selectPartyIncorr(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}

	
	/**
	 * 判断是否有子节点
	 * @param request
	 * @return
	 */
	@RequestMapping("selectPartyIsNode")
	@ResponseBody
	@ApiRemark("判断是否有子节点")
	public JSONResult selectPartyIsNode(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			PartyBean bean = JsonUtil.toBean(req_params, PartyBean.class);
			return partyService.selectPartyIsNode(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}


}
