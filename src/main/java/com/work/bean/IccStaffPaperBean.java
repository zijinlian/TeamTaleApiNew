package com.work.bean;

import java.util.List;

public class IccStaffPaperBean extends PageBean{
	private String fdStaffId; //用户ID

    private String fdPaperId;

    private String fdProblemId;

    private String fdStaffPaperDate;
    
    private String fdStaffAnswer;

    private String fdStaffRightAnswer;

    private String fdStafffScore;
    
	private List<IccStaffPaperBean> answers;
    
	public List<IccStaffPaperBean> getAnswers() {
		return answers;
	}

	public void setAnswers(List<IccStaffPaperBean> answers) {
		this.answers = answers;
	}
	
	public String getFdStaffId() {
		return fdStaffId;
	}

	public void setFdStaffId(String fdStaffId) {
		this.fdStaffId = fdStaffId;
	}

	public String getFdPaperId() {
		return fdPaperId;
	}

	public void setFdPaperId(String fdPaperId) {
		this.fdPaperId = fdPaperId;
	}

	public String getFdProblemId() {
		return fdProblemId;
	}

	public void setFdProblemId(String fdProblemId) {
		this.fdProblemId = fdProblemId;
	}

	public String getFdStaffPaperDate() {
		return fdStaffPaperDate;
	}

	public void setFdStaffPaperDate(String fdStaffPaperDate) {
		this.fdStaffPaperDate = fdStaffPaperDate;
	}

	public String getFdStaffAnswer() {
		return fdStaffAnswer;
	}

	public void setFdStaffAnswer(String fdStaffAnswer) {
		this.fdStaffAnswer = fdStaffAnswer;
	}

	public String getFdStaffRightAnswer() {
		return fdStaffRightAnswer;
	}

	public void setFdStaffRightAnswer(String fdStaffRightAnswer) {
		this.fdStaffRightAnswer = fdStaffRightAnswer;
	}

	public String getFdStafffScore() {
		return fdStafffScore;
	}

	public void setFdStafffScore(String fdStafffScore) {
		this.fdStafffScore = fdStafffScore;
	}
    
}
