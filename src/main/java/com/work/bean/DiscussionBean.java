package com.work.bean;

public class DiscussionBean extends BaseRequestBean{
	
	private String fdCfId;
	
	private String content;
	
	public String getFdCfId() {
		return fdCfId;
	}

	public void setFdCfId(String fdCfId) {
		this.fdCfId = fdCfId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
