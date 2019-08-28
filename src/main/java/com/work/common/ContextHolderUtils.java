package com.work.common;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
/**
* @ClassName: ContextHolderUtils 
*/
public class ContextHolderUtils {
	/**
	 * SpringMvc下获取request
	 * 
	 * @return
	 */
	public static HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return request;

	}
	/**
	 * SpringMvc下获取session
	 * 
	 * @return
	 */
	public static HttpSession getSession() {
		HttpSession session = getRequest().getSession();
		session.setMaxInactiveInterval(60*60);
		return session;
	}
	
	
	public static String getContextPath(){
		HttpServletRequest request =getRequest();
		String contextPath =request.getSession().getServletContext().getRealPath("");
		return contextPath;
	}
	
	/**
	* 获取tomcat webapps目录
	* @param request
	* @return
	*/
	public static String getTomcatWebappsPath(){
		HttpServletRequest request =getRequest();
		String tomcatRoot = request.getSession().getServletContext().getRealPath("/");
        String[] foo = tomcatRoot.split("\\\\");
        StringBuilder tomcatWebAppsBuilder = new StringBuilder();
        int i = 0;
        for(String paths : foo){
            ++i;
            if(i != foo.length){
                tomcatWebAppsBuilder.append(paths);
                tomcatWebAppsBuilder.append("//");
            }
        }
        String tomcatWebApps = tomcatWebAppsBuilder.toString();
        return tomcatWebApps;
	}
}

