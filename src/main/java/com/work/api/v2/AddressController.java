package com.work.api.v2;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.bean.AddressBean;
import com.work.bean.OaApplyInfoFeebackBean;
import com.work.common.ApiRemark;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.service.AddressService;

@RestController
@RequestMapping("app/v2/address")
public class AddressController {
	
	@Resource
	private AddressService addressService;

	/**
	 * 查询通讯录用户
	 * @param request
	 * @return
	 */
	@RequestMapping("searchAddressUser")
	@ResponseBody
	@ApiRemark("查询通讯录用户")
	public JSONResult searchAddressUser(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			AddressBean bean = JsonUtil.toBean(req_params, AddressBean.class);
			return addressService.selectAddressByEmpName(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	
	/**
	 * 添加活动评价
	 * @param request
	 * @return
	 */
	@RequestMapping("saveActivityComment")
	@ResponseBody
	@ApiRemark("添加活动评价")
	public JSONResult saveActivityComment(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			OaApplyInfoFeebackBean bean = JsonUtil.toBean(req_params, OaApplyInfoFeebackBean.class);
			return addressService.saveApplyComment(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
}
