package cn.autually.base;

import com.google.gson.Gson;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by fangzhen on 2016/11/27.
 */
public class JXRMapping {
    public static Gson g = new Gson();
    public static String Server = "http://www.fangyygw.com:9094/TeamTaleApi/api";
    public static String API_VERSION = "1.1";
    public static String UPLOAD_FILE = "/upload";
    public static String REQUESTER_PACKAGE="com.work.api.v3";
    public static boolean apiEnable=true;
    public static ConcurrentHashMap<String,Requester> requesterMap = new ConcurrentHashMap<>();
    //    public static ConcurrentHashMap<String,RequesterApi> requesterApiMap = new ConcurrentHashMap<>();
    public static class Requester{
        public Object obj;
        public Method method;
    }
    public static SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");

//    public static class RequesterApi {
//        public String remark="";
//        public String url="";
//        public String param="";
//        public String response="";
//    }
}
