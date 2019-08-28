package com.work.entity;

public class TQuestion {
	//题目编号
	private String questionId;
	//信息库编号
	private String libId;
	//题型
	private String questionType;
	//难度
	private String difficulty;
	//题目描述
	private String questionDes;
	//备选选项
	private String questionOptions;
	//正确答案
	private String rightAnswer;
	//录入人
	private String typingMan;
	//录入日期
	private String typingDate;
	//题目序号
	private String questionNo;
	//试卷编号
	private String paperId;
	//考试名称
	private String examName;
	//考试编号
	private String examId;
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getLibId() {
		return libId;
	}
	public void setLibId(String libId) {
		this.libId = libId;
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getQuestionDes() {
		return questionDes;
	}
	public void setQuestionDes(String questionDes) {
		this.questionDes = questionDes;
	}
	public String getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(String questionOptions) {
		this.questionOptions = questionOptions;
	}
	public String getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	public String getTypingMan() {
		return typingMan;
	}
	public void setTypingMan(String typingMan) {
		this.typingMan = typingMan;
	}
	public String getTypingDate() {
		return typingDate;
	}
	public void setTypingDate(String typingDate) {
		this.typingDate = typingDate;
	}
	public String getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(String questionNo) {
		this.questionNo = questionNo;
	}
	public String getPaperId() {
		return paperId;
	}
	public void setPaperId(String paperId) {
		this.paperId = paperId;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
}
