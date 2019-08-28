package com.work.common;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;




import java.util.List;

import net.sf.json.JSONArray;

import org.springframework.web.multipart.MultipartFile;

import com.google.common.collect.Lists;
import com.work.common.Constants;

/**
 * java通过模拟post方式提交表单实现图片上传功能实例
 * 其他文件类型可以传入 contentType 实现
 * @author zc
 */
public class HttpUploadFile {

    /**
     * 批量上传图片
     * 
     */
    public static List<String> uploadToImageServer(MultipartFile[] files){
    	List<String> list = Lists.newArrayList();
        String url = Constants.IMG_SERVICE_URL;
        for (MultipartFile multipartFile : files) {
        	String ret = formUpload(url, multipartFile,multipartFile.getContentType());
        	JSONArray array = JSONArray.fromObject(ret);
        	list.add(array.getJSONObject(0).getString("url"));
		}
        return list;
    }
    
    
    /**
     * 单个上传图片
     * 
     */
    public static String uploadToImageServer(MultipartFile file){
    	String url = Constants.IMG_SERVICE_URL;
		String ret = formUpload(url, file, file.getContentType());
		JSONArray array = JSONArray.fromObject(ret);
    	return array.getJSONObject(0).getString("url");
    }
    

    /**
     * 上传图片
     * @param urlStr
     * @param contentType 没有传入文件类型默认采用application/octet-stream
     * contentType非空采用filename匹配默认的图片类型
     * @return 返回response数据
     */
    public static String formUpload(String urlStr,MultipartFile file,String contentType) {
        String res = "";
        HttpURLConnection conn = null;
        // boundary就是request头和上传文件内容的分隔符
        String BOUNDARY = "---------------------------123821742118716"; 
        try {
            URL url = new URL(urlStr);
            conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(30000);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("User-Agent",
                    "Mozilla/5.0 (Windows; U; Windows NT 6.1; zh-CN; rv:1.9.2.6)");
            conn.setRequestProperty("Content-Type",
                    "multipart/form-data; boundary=" + BOUNDARY);
            OutputStream out = new DataOutputStream(conn.getOutputStream());
            // file
            if(file!= null && !file.isEmpty()){
            	String inputName = "file";
        		String filename = file.getOriginalFilename();//.substring(file.getOriginalFilename().lastIndexOf("."));   
        		contentType = file.getContentType();
        		StringBuffer strBuf = new StringBuffer();
                strBuf.append("\r\n").append("--").append(BOUNDARY)
                         .append("\r\n");
                strBuf.append("Content-Disposition: form-data; name=\"" + inputName + "\"; filename=\"" + filename
                         + "\"\r\n");
                strBuf.append("Content-Type:" + contentType + "\r\n\r\n");
                out.write(strBuf.toString().getBytes());
                InputStream in = file.getInputStream();
                int bytes = 0;
                byte[] bufferOut = new byte[1024];
                while ((bytes = in.read(bufferOut)) != -1) {
                    out.write(bufferOut, 0, bytes);
                }
                in.close();
            }
            byte[] endData = ("\r\n--" + BOUNDARY + "--\r\n").getBytes();
            out.write(endData);
            out.flush();
            out.close();
            // 读取返回数据
            StringBuffer strBuf = new StringBuffer();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()));
            String line = null;
            while ((line = reader.readLine()) != null) {
                strBuf.append(line).append("\n");
            }
            res = strBuf.toString();
            reader.close();
            reader = null;
        } catch (Exception e) {
            System.out.println("发送POST请求出错。" + urlStr);
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.disconnect();
                conn = null;
            }
         }
        return res;
    }
    
    public static void main(String[] args) {
	}
}