package com.work.api.v2;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.bean.MyStokeBean;
import com.work.common.ApiRemark;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.service.TMyStokeService;

/**
 * 日程
 * @author zhoucha
 *
 */
@RestController
@RequestMapping("app/v2/stoke")
public class StokeController {
	
	@Resource
	private TMyStokeService stokeService;
	
	/**
	 * 我的日程
	 * @param request
	 * @return
	 */
	@RequestMapping("myStoke")
	@ResponseBody
	@ApiRemark("我的日程")
	public JSONResult myStoke(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			MyStokeBean bean = JsonUtil.toBean(req_params, MyStokeBean.class);
			return stokeService.selectStokeByEmpId(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 行长日程人员列表
	 * @param request
	 * @return
	 */
	@RequestMapping("userList")
	@ResponseBody
	@ApiRemark("行长日程人员列表")
	public JSONResult userList(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			MyStokeBean bean = JsonUtil.toBean(req_params, MyStokeBean.class);
			return stokeService.selectListUser(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}

}
