package com.work.bean;

public class BankCircleBean extends BaseRequestBean{
    private String id;

    private String empId;

    private String content;

    private String commCount;

    private String pariseCount;

    private String createTime;

    private String orgOrDeptCode;

    private String isHot;

    private String isPublic;
    
    private String img="";

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCommCount() {
        return commCount;
    }

    public void setCommCount(String commCount) {
        this.commCount = commCount;
    }

    public String getPariseCount() {
        return pariseCount;
    }

    public void setPariseCount(String pariseCount) {
        this.pariseCount = pariseCount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOrgOrDeptCode() {
        return orgOrDeptCode;
    }

    public void setOrgOrDeptCode(String orgOrDeptCode) {
        this.orgOrDeptCode = orgOrDeptCode;
    }

    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }
}