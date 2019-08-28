package com.work.common;

import java.io.Serializable;
/**
 * Result : 响应的结果对象
 *
 * @author zc
 * @since 2014-09-27 16:28
 */
public class Result implements Serializable {
	
    private static final long serialVersionUID = 6288374846131788743L;
    
    /**
     * 信息
     */
    private String msg;

    /**
     * 状态码
     */
    private String status;
    
    private boolean success;
    
    public Result(){
    	
    }
    
    public Result(String msg, String status) {
		super();
		this.msg = msg;
		this.status = status;
	}
    
	public Result(String msg, String status, boolean success) {
		super();
		this.msg = msg;
		this.status = status;
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
