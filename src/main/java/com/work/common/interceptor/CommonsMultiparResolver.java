package com.work.common.interceptor;

public class CommonsMultiparResolver extends org.springframework.web.multipart.commons.CommonsMultipartResolver {
    
    /**
     * {@inheritDoc}
     * 
     * @see org.springframework.web.multipart.commons.CommonsMultipartResolver#isMultipart(javax.servlet.http.HttpServletRequest)
     */
    @Override
    public boolean isMultipart(javax.servlet.http.HttpServletRequest request) {
        String uri = request.getRequestURI();
        //过滤使用百度EmEditor的URI
        if (uri.indexOf("dispatch") > 0) { 
            return false;
        }
        return super.isMultipart(request);
    }
}
