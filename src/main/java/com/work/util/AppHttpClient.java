package com.work.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

public class AppHttpClient {
	
	public static void postSend(JSONArray arry){
		HttpClient httpclient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost("http://http://219.141.226.184:8060/TeamTale/app/v2/comm/sendMsgTo");  
        List<NameValuePair> nvps = new ArrayList<NameValuePair>(); 
        System.out.println(arry.toString());
        nvps.add(new BasicNameValuePair("params",arry.toString())); 
        try {
        	httpPost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
        	HttpResponse response = httpclient.execute(httpPost);
			if(response != null){
				HttpEntity resEntity = response.getEntity();
				if(resEntity != null){
					String result = EntityUtils.toString(resEntity,"UTF-8");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			httpclient.getConnectionManager().shutdown();
		}
	}
}
