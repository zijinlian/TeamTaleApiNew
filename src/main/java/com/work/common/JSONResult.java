package com.work.common;
import java.util.HashMap;
import java.util.Map;

import com.work.common.Constants;
import com.work.common.JSONResult;
import com.work.common.Result;


/**
 * JSONResult : Response JSONResult for RESTful,封装返回JSON格式的数据
 *
 * @author StarZou
 * @since 2014年5月26日 上午10:51:46
 */

public class JSONResult {

	/**
	 * 返回状态和消息
	 */
    private Result header = new Result();

    /**
     * 数据
     */
    private Map<String, Object> body = new HashMap<String, Object>();
    
	public Result getHeader() {
		return header;
	}

	public void setHeader(Result header) {
		this.header = header;
	}
	
	public Map<String, Object> getBody() {
		return body;
	}

	public void setBody(Map<String, Object> body) {
		this.body = body;
	}

	public JSONResult() {
		
    }
	
	
	public static JSONResult getSuccess(){
		JSONResult result = new JSONResult();
		result.header.setStatus(Constants.SUCCESS);
		result.header.setMsg("成功");
		result.header.setSuccess(true);
		return result;
	}
	
	public static JSONResult getSuccess(String msg){
		JSONResult result = new JSONResult();
		result.header.setStatus(Constants.SUCCESS);
		result.header.setMsg(msg);
		result.header.setSuccess(true);
		return result;
	}
	
	
	public static JSONResult getFail(){
		JSONResult result = new JSONResult();
		result.header.setStatus(Constants.ERROE);
		result.header.setMsg("失败");
		result.header.setSuccess(false);
		return result;
	}
	
	public static JSONResult getFail(String msg){
		JSONResult result = new JSONResult();
		result.header.setStatus(Constants.ERROE);
		result.header.setMsg(msg);
		result.header.setSuccess(false);
		return result;
	}
	
	public static JSONResult getFail(String status,String msg){
		JSONResult result = new JSONResult();
		result.header.setStatus(status);
		result.header.setMsg(msg);
		result.header.setSuccess(false);
		return result;
	}

    /**
     * 成功返回数据和消息
     *
     * @param data
     * @param message
     * @param body 
     */
    public JSONResult(String message,String statusCode, Map<String, Object> body) {
        this.body = body;
        header.setMsg(message);
        header.setStatus(statusCode);
        
    }

    /**
     * 成功返回数据
     *
     * @param data
     */
    public JSONResult(Map<String,Object> body,String statusCode) {
        this.body = body;
        header.setStatus(statusCode);
    }
    
    public JSONResult(String statusCode) {
    	 header.setStatus(statusCode);
    }
}