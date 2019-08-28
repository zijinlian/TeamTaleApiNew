package com.work.common;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 用户设置当前web环境上下文，用于方便如JSP页面使用
 *
 */
public class ContextPathFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String contextPath = ((HttpServletRequest) request).getContextPath();
        request.setAttribute(Constants.CONTEXT_PATH, contextPath);
        chain.doFilter(request, response);
    }
    
    @Override
    public void destroy() {
    	
    }
}
