package com.work.bean;

public class BankCircleCommentBean {
	private String id;

	private String circleId;

	private String empId; //评论人ID

	private String content;

	private String pEmpId; //被评论人ID

	private String createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCircleId() {
		return circleId;
	}

	public void setCircleId(String circleId) {
		this.circleId = circleId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getpEmpId() {
		return pEmpId;
	}

	public void setpEmpId(String pEmpId) {
		this.pEmpId = pEmpId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}
