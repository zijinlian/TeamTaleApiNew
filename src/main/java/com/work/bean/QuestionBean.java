package com.work.bean;

public class QuestionBean extends BaseRequestBean{
	
	private String examId;//考试编号
	
	private String fdPaperId;//试卷Id
	
	private String modelType;//试卷类型
	
	private String orgCode;
	
	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String getFdPaperId() {
		return fdPaperId;
	}

	public void setFdPaperId(String fdPaperId) {
		this.fdPaperId = fdPaperId;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	
}
