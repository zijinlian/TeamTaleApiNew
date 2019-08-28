package com.work.entity;


public class TAnswers {

	//答案编号
	private String answerId;
	//考试编号
	private String examId;
	//试卷编号
	private String paperId;
	//题目编号
	private String questionId;
	//考生考号
	private String examNum;
	//考核对象
	private String examTarget;
	//答案
	private String answer;
	//得分
	private double answerScore;
	//阅卷人
	private String markingMan;
	//阅卷日期
	private String markingDate;
	
	public String getAnswerId() {
		return answerId;
	}
	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}
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
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getExamNum() {
		return examNum;
	}
	public void setExamNum(String examNum) {
		this.examNum = examNum;
	}
	public String getExamTarget() {
		return examTarget;
	}
	public void setExamTarget(String examTarget) {
		this.examTarget = examTarget;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public double getAnswerScore() {
		return answerScore;
	}
	public void setAnswerScore(double answerScore) {
		this.answerScore = answerScore;
	}
	public String getMarkingMan() {
		return markingMan;
	}
	public void setMarkingMan(String markingMan) {
		this.markingMan = markingMan;
	}
	public String getMarkingDate() {
		return markingDate;
	}
	public void setMarkingDate(String markingDate) {
		this.markingDate = markingDate;
	}
	@Override
	public String toString() {
		return "Answers [answerId=" + answerId + ", examId=" + examId + ", paperId=" + paperId + ", questionId="
				+ questionId + ", examNum=" + examNum + ", examTarget=" + examTarget + ", answer=" + answer
				+ ", answerScore=" + answerScore + ", markingMan=" + markingMan + ", markingDate=" + markingDate + "]";
	}
	public TAnswers(String answerId, String examId, String paperId, String questionId, String examNum, String examTarget,
			String answer, double answerScore, String markingMan, String markingDate) {
		super();
		this.answerId = answerId;
		this.examId = examId;
		this.paperId = paperId;
		this.questionId = questionId;
		this.examNum = examNum;
		this.examTarget = examTarget;
		this.answer = answer;
		this.answerScore = answerScore;
		this.markingMan = markingMan;
		this.markingDate = markingDate;
	}
	
	public TAnswers() {
		super();
		// TODO Auto-generated constructor stub
	}

}
