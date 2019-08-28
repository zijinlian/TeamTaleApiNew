package com.work.common;

import javax.servlet.http.HttpServletRequest;

import com.work.entity.TUser;

public class AuthHelper {
	
	public static void setRequestSysUser(HttpServletRequest request, TUser user){
		request.getSession().setAttribute("user", user);
	}
	
	public static void removeSysUser(HttpServletRequest request){
		request.getSession().removeAttribute("user");
		request.getSession().removeAttribute("permissions");
	}
	
}
