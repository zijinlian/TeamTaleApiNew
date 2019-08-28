package com.work.bean;

public class StudyTrainBean extends PageBean{

    private String studyId;

    private String studyTitle;

    private String studyContent;

    private String empId;

    private String empName;

    private String createTime;

    private String typeCode;

    private String typeName;

    private String vadioUrl;

    private String status;//1:同意，2：拒绝

    private String approvalInfo;

    private String playCount;

    private String commentCount;
    
    private String id;//课程ID
    
    private String modeltype; //01,02一级审批,03二级审批
    
    
    
    public String getModeltype() {
		return modeltype;
	}

	public void setModeltype(String modeltype) {
		this.modeltype = modeltype;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }

    public String getStudyTitle() {
        return studyTitle;
    }

    public void setStudyTitle(String studyTitle) {
        this.studyTitle = studyTitle;
    }

    public String getStudyContent() {
        return studyContent;
    }

    public void setStudyContent(String studyContent) {
        this.studyContent = studyContent;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getVadioUrl() {
        return vadioUrl;
    }

    public void setVadioUrl(String vadioUrl) {
        this.vadioUrl = vadioUrl;
    }

    public String getApprovalInfo() {
        return approvalInfo;
    }

    public void setApprovalInfo(String approvalInfo) {
        this.approvalInfo = approvalInfo;
    }

    public String getPlayCount() {
        return playCount;
    }

    public void setPlayCount(String playCount) {
        this.playCount = playCount;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }
}