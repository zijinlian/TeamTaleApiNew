package com.work.common;

import java.util.Map;

import net.sf.json.JSONObject;

public class JsonUtil{
	
	public static String fromString(Object object){
		String json = JSONObject.fromObject(object).toString();;
		return json;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T toBean(Object object,Class<T> c){
		JSONObject jsonObject = JSONObject.fromObject(object.toString());
		return (T) JSONObject.toBean(jsonObject, c);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T toBean(Object object,Class<T> c,Map<String, Object> map){
		JSONObject jsonObject = JSONObject.fromObject(object.toString());
		return (T) JSONObject.toBean(jsonObject,c,map);
	}
	
	public static void main(String[] args) {
		/*ExamBean baseRequestBean = formObject("{\"userid\":\"zhouchang\",\"pageNo\":\"2\"}", ExamBean.class);
		baseRequestBean.getUserid();*/
	}
	
	
	
}
