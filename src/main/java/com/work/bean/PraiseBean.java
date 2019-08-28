package com.work.bean;

public class PraiseBean {
	
	private String type;//类型(1:众筹点赞，2：评论点赞)
	
	private String fdDissId;//赞数据ID
	
	private String fdEmpid; //点赞人ID
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFdDissId() {
		return fdDissId;
	}

	public void setFdDissId(String fdDissId) {
		this.fdDissId = fdDissId;
	}

	public String getFdEmpid() {
		return fdEmpid;
	}

	public void setFdEmpid(String fdEmpid) {
		this.fdEmpid = fdEmpid;
	}
}
