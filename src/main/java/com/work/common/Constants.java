package com.work.common;

public class Constants {
	public static final String CONTEXT_PATH = "ctx";
    public static final Integer DEFAULT_PAGE_SIZE = 10;
    public static final String SUCCESS = "200";//成功
    public static final String ERROE = "201";//错误
    public static final String SERVER_ERROE = "500";//服务器错误
    public static final String SERVER_ERROE_MSG= "服务器异常,请联系管理员";//服务器错误
    public static final String JSON_ERROE = "501";//JSON错误
    public static final String PARAM_ERROR = "502";//参数错误
    public static final String LOGIN_TIME_OUT = "401";//登陆超时
    public static final String TOKEN_ERROR = "402";//无效的TOKEN
    public static final String SERVER_MSG = "网络异常,请稍后访问";

    
    
    public static final String EMPTY = "";
    public static final String POINT = ".";
    
    public static final String HOST = "http://218.25.172.94:8090";
    
    public static final boolean IS_OPEN_API_LOG = false;
    
    public static final boolean IS_MD5 = false;
    
    public static ApiLog log;
    
    //public static final String API_FILE_URL = ContextHolderUtils.getContextPath()+"//api//";
    
    public static final String API_FILE_URL = ContextHolderUtils.getTomcatWebappsPath()+"api/";
    
    public static final String IMG_SERVICE_URL = "http://21.36.2.225:8090/ImgSvr/uploadimg";//内网图片上传
    
}
