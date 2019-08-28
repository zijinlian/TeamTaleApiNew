package com.work.entity;

public class TTaskRateFeedback {
    private String id;

	private String taskId;

	private String fdStartDate;

	private String fdEndDate;

	private String fdRemark;

	private String parentId;

	private String feedEmpid;

	private String feedEmpname;

	private String fdContent;

	private String fdProcess;

	private String fdTaskinfo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getFdStartDate() {
		return fdStartDate;
	}

	public void setFdStartDate(String fdStartDate) {
		this.fdStartDate = fdStartDate;
	}

	public String getFdEndDate() {
		return fdEndDate;
	}

	public void setFdEndDate(String fdEndDate) {
		this.fdEndDate = fdEndDate;
	}

	public String getFdRemark() {
		return fdRemark;
	}

	public void setFdRemark(String fdRemark) {
		this.fdRemark = fdRemark;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getFeedEmpid() {
		return feedEmpid;
	}

	public void setFeedEmpid(String feedEmpid) {
		this.feedEmpid = feedEmpid;
	}

	public String getFeedEmpname() {
		return feedEmpname;
	}

	public void setFeedEmpname(String feedEmpname) {
		this.feedEmpname = feedEmpname;
	}

	public String getFdContent() {
		return fdContent;
	}

	public void setFdContent(String fdContent) {
		this.fdContent = fdContent;
	}

	public String getFdProcess() {
		return fdProcess;
	}

	public void setFdProcess(String fdProcess) {
		this.fdProcess = fdProcess;
	}

	public String getFdTaskinfo() {
		return fdTaskinfo;
	}

	public void setFdTaskinfo(String fdTaskinfo) {
		this.fdTaskinfo = fdTaskinfo;
	}
}