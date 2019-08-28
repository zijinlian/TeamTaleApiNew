package com.work.entity;

public class TStudyTrainComment {
    private String commentId;

    private String empId;

    private String commentContent;

    private String createTime;

    private String studyId;
    
    private String fdName;
    
    private String fdHeadicon;
    
    public String getFdName() {
		return fdName;
	}

	public void setFdName(String fdName) {
		this.fdName = fdName;
	}

	public String getFdHeadicon() {
		return fdHeadicon;
	}

	public void setFdHeadicon(String fdHeadicon) {
		this.fdHeadicon = fdHeadicon;
	}

	public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }
}