package com.work.entity;


public class TaskNotice {
	
	private String id;
	
	private String taskId;
	
	private String taskName;
	
	private String taskEmpId;
	
	private String taskEmpName;
	
	private String task_type;
	
	private String taskUrl;

	private String taskUrlName;
	
	private String status;
	
	private String createTime;
	
	
	
	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

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

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskEmpId() {
		return taskEmpId;
	}

	public void setTaskEmpId(String taskEmpId) {
		this.taskEmpId = taskEmpId;
	}

	public String getTaskEmpName() {
		return taskEmpName;
	}

	public void setTaskEmpName(String taskEmpName) {
		this.taskEmpName = taskEmpName;
	}

	public String getTask_type() {
		return task_type;
	}

	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}

	public String getTaskUrl() {
		return taskUrl;
	}

	public void setTaskUrl(String taskUrl) {
		this.taskUrl = taskUrl;
	}

	public String getTaskUrlName() {
		return taskUrlName;
	}

	public void setTaskUrlName(String taskUrlName) {
		this.taskUrlName = taskUrlName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
