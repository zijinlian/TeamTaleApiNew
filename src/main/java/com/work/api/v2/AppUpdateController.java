package com.work.api.v2;

import cn.autually.base.Http;
import cn.autually.base.StringTookit;
import com.work.bean.VersionUpdateBean;
import com.work.common.ApiRemark;
import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.service.AppUpdateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("app/v2/update")
public class AppUpdateController {
	
	@Resource
	private AppUpdateService appUpdateService;
	
	/**
	 * 在线升级
	 * @param request
	 * @return
	 */
	@RequestMapping("updateApp")
	@ResponseBody
	@ApiRemark("在线升级")
	public JSONResult method(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			VersionUpdateBean bean = JsonUtil.toBean(req_params, VersionUpdateBean.class);
			return appUpdateService.selectAppIsUpdate(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}
	
	/**
	 * 上传App文件
	 * @param request
	 * @return
	 */
	@RequestMapping("uploadApp")
	@ResponseBody
	@ApiRemark("上传App文件")
	public JSONResult uploadApp(HttpServletRequest request) {
		try {
			Object req_params = request.getAttribute("req_params");
			VersionUpdateBean bean = JsonUtil.toBean(req_params, VersionUpdateBean.class);
			return appUpdateService.saveUploadApp(bean);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONResult.getFail(Constants.SERVER_ERROE, "服务器异常,请联系管理员");
		}
	}

	/**
	 * 测试方法
	 **/
	public static void main(String[] args) {
		Http h = new Http("http://localhost:8080/TeamTaleApi/app/v2/update/uploadApp", Http.POST);
		h.addParam("params", "{\"phoneType\":\"android\",\"androidContent\":\"修复部分已知bug\",\"androidVersion\":\"1.0.51\",\"androidUrl\":\"http://42.56.72.205:8090/app-release.apk\"}");
		System.out.println(StringTookit.JSONStringFormat(h.execute()));
	}

}
