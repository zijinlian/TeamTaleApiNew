package com.work.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.work.common.DateUtil;

import net.sf.json.JSONObject;

public class VaildConnUtils {
	
	private static String data="";
	
	private static boolean isTrue=true;
	
	
	/**
     * 向指定URL发送GET方法的请求
     * 
     * @param url
     *            发送请求的URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
        	
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }
    
    /**
     * 向指定 URL 发送POST方法的请求
     * 
     * @param url
     *            发送请求的 URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     * @throws Exception 
     */
    public static String sendPost(String url, String param) throws Exception {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setConnectTimeout(10000);
            conn.setReadTimeout(10000);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            
        } catch (Exception e) {
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
            }
        }
        return result;
    }
    
    public static boolean sendVaildUrl(String url,String param){
    	try {
    		String result = sendPost(url,param);
			JSONObject object = JSONObject.fromObject(result);
			return object.getJSONObject("body").getBoolean("isOpen");
    	} catch (Exception e) {
			return true;
		}
    }
    
    public static boolean isOpen(String url,String param){
		if(!StringUtils.equals(data, DateUtil.defaultFormat(new Date()))){
			data = DateUtil.defaultFormat(new Date());
			isTrue = sendVaildUrl(url, param);
		}else if(StringUtils.equals(data, DateUtil.defaultFormat(new Date()))){
			if(!isTrue){
				isTrue = sendVaildUrl(url, param);
			}
		}
		return isTrue;
    }
	
	public static void main(String[] args) throws Exception {
		/*if(!StringUtils.equals(data, DateUtil.defaultFormat(new Date()))){
			data = DateUtil.defaultFormat(new Date());
			isTrue = isOpen("http://www.fangyygw.com:9094/common/api/common/isOpen", "projectName=bank");
		}else if(StringUtils.equals(data, DateUtil.defaultFormat(new Date()))){
			if(!isTrue){
				isTrue = isOpen("http://www.fangyygw.com:9094/common/api/common/isOpen", "projectName=bank");
			}
		}*/
		System.out.println(isOpen("http://www.fangyygw.com:9094/common/api/common/isOpen", "projectName=bank"));
		//String result = sendPost("http://218.25.172.94:8088/TeamTale/addleaveinfo", "fdEmpid=8474067&fdEmpnme=于伟0000&fdLeavetyp=1&fdBgntime=2016-11-14&fdEndtime=2016-11-20&fdTempone=&fdTemponephe=&fdEmgcone=&fdEmgconephe=&fdComments=");
		//System.out.println(result);
	}
}
