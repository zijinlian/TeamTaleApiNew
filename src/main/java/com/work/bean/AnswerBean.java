package com.work.bean;

import java.util.List;

import com.work.entity.TAnswers;

public class AnswerBean extends BaseRequestBean{
	
	private String examId;//考试编号
	
	private String paperId;//试卷Id
	
	private String modelType;//试卷类型

	private List<TAnswers> answers;
	

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}
	
	public String getPaperId() {
		return paperId;
	}

	public void setPaperId(String paperId) {
		this.paperId = paperId;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public List<TAnswers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<TAnswers> answers) {
		this.answers = answers;
	}

}
