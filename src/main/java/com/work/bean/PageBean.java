package com.work.bean;

import com.work.common.Constants;

public class PageBean {
	private String token;
	private Integer page = 1;
	private Integer pageSize = 10;
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		if(pageSize==null){
			pageSize = Constants.DEFAULT_PAGE_SIZE;
		}
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
