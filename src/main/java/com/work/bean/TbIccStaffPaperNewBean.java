package com.work.bean;

import java.util.List;

public class TbIccStaffPaperNewBean extends PageBean {
    private String fdStaffId;

    private String paperTy;

    private String paperType;

    private String fdProblemId;

    private String fdStaffPaperDate;

    private String fdStaffAnswer;

    private String fdStaffRightAnswer;

    private List<TbIccStaffPaperNewBean> answers;

    public List<TbIccStaffPaperNewBean> getAnswers() {
        return answers;
    }

    public void setAnswers(List<TbIccStaffPaperNewBean> answers) {
        this.answers = answers;
    }


    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    private String fdStafffScore;

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

    public String getFdStaffId() {
        return fdStaffId;
    }

    public void setFdStaffId(String fdStaffId) {
        this.fdStaffId = fdStaffId;
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

    public String getPaperTy() {
        return paperTy;
    }

    public void setPaperTy(String paperTy) {
        this.paperTy = paperTy;
    }
}
