package com.work.common;

import java.util.ResourceBundle;

/**
 * 项目参数工具类
 * 
 */
public class ResourceUtil {

	private static final ResourceBundle bundle = java.util.ResourceBundle.getBundle("config");
    
    public static String getKey(String key){
    	 return bundle.getString(key);
    }
    
    public static String getUploadUrl(){
    	String name = System.getProperties().getProperty("os.name");
    	if("Windows 7".equals(name)){
    		return getKey("upload.url.window");
    	}else{
    		return getKey("upload.url.linux");
    	}
    }
    
    public static void main(String[] args) {
	}
    
}
