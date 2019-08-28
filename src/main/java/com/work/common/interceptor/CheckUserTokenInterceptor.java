package com.work.common.interceptor;

import com.work.common.Constants;
import com.work.common.md5.SecretUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;
import java.util.List;


public class CheckUserTokenInterceptor implements HandlerInterceptor {
	
	private static final Logger logger = LoggerFactory.getLogger(CheckUserTokenInterceptor.class); 
	
	private static final String host = Constants.HOST;
	
	private boolean isOpenLog = Constants.IS_OPEN_API_LOG;
	

	private List<String> excludeUrls;

	public List<String> getExcludeUrls() {
		return excludeUrls;
	}

	public void setExcludeUrls(List<String> excludeUrls) {
		this.excludeUrls = excludeUrls;
	}
	

	/**
	 * 完成页面的render后调用
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception exception) throws Exception {
	    logger.debug("afterCompletion");
	    
	}
	

	/**
	 * 在调用controller具体方法后拦截
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView modelAndView) throws Exception {
        logger.debug("postHandle");
        
        
	}
	

	/**
	 * 在调用controller具体方法前拦截
	 */
	@SuppressWarnings("deprecation")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		String requestUri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String url = requestUri.substring(contextPath.length());
		String s[] =url.split("/");
		String name = "";
		if(s.length>0){
			name = s[s.length-2];
		}
		if (excludeUrls!=null && excludeUrls.contains(url)) {
			return true;
		}
		response.setContentType("application/json;charset=utf-8");
		/*boolean isOpen = VaildConnUtils.isOpen("http://www.fangyygw.com:9094/common/api/common/isOpen", "projectName=bank");

		if(!isOpen){
			JSONResult result = JSONResult.getFail("网络异常,请联系管理员");
			response.getWriter().print(JsonUtil.fromString(result));
			response.getWriter().close();
			return false;
		}*/

		String req_params = request.getParameter("params");
		String encrypt = StringUtils.defaultIfBlank(request.getParameter("encrypt"), "");

		if(StringUtils.isNotEmpty(encrypt)&&encrypt.equals("true")){
			//req_params = SecretUtils.deParameterByRSA(req_params);
			req_params = URLDecoder.decode(req_params);
			req_params = SecretUtils.deParameterByDES(req_params);
			request.setAttribute("req_params", req_params);
			request.setAttribute("encrypt",true);
		}else{
			//req_params = URLDecoder.decode(req_params);
			request.setAttribute("req_params", req_params);
		}

		/*if(Constants.IS_MD5){
			req_params = SecretUtils.deParameterByRSA(req_params);
			req_params = URLDecoder.decode(req_params);
			request.setAttribute("req_params", req_params);
		}else{
			req_params = URLDecoder.decode(req_params);
			request.setAttribute("req_params", req_params);
		}*/
		
		/*if(isOpenLog){
			String remark = StringUtils.EMPTY;
			if(object instanceof HandlerMethod){  
				HandlerMethod method = (HandlerMethod)object;  
				ApiRemark stringResult = method.getMethodAnnotation(ApiRemark.class);
				if(stringResult!=null){
					remark = stringResult.value();
				}
			}  
			Constants.log = new ApiLog();
			Constants.log.setRemark("[remark]"+remark);
			Constants.log.setUrl("[url]"+host+requestUri);
			Constants.log.setParam("[param]params="+req_params);
			Constants.log.setResponse("[response]");
			Constants.log.setProject(contextPath);
			Constants.log.setControllerName(name);
		}*/
		
		
		/*if (true) {
			JSONResult json = new JSONResult();
			json.getHeader().setStatus(Constants.TOKEN_ERROR);
			json.getHeader().setMsg("账号异常，请重新登录");
			response.getWriter().print(JsonUtil.fromString(json));
			response.getWriter().close();
			return true;
		} else {
			TUser user = userService.selectUserByToken(bean.getToken());
			if (user==null) {
				JSONResult json = new JSONResult();
				json.getHeader().setStatus(Constants.TOKEN_ERROR);
				json.getHeader().setMsg("账号异常，请重新登录");
				response.getWriter().print(JsonUtil.toJson(json));
				response.getWriter().close();
				return false;
			}else if(user.getEditDate()==null||DateUtil.getAddDate(user.getEditDate(),30).getTime() < new Date().getTime()){
				JSONResult json = new JSONResult();
				json.getHeader().setStatus(Constants.TOKEN_ERROR);
				json.getHeader().setMsg("登录超时,请重新登录");
				response.getWriter().print(JsonUtil.toJson(json));
				response.getWriter().close();
				return false;
			}
			//更新Token失效时间
			UserBean userBean = new UserBean();
			userBean.setId(user.getID());
			userBean.setEditDate(new Date());//Token失效时间
			userService.updateUser(userBean);
		}*/
		
		return true;
	}
}
