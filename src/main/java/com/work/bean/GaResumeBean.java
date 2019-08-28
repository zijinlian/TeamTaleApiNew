package com.work.bean;

public class GaResumeBean extends PageBean {
    private String id;

    private String empid;

    private String empname;

    private String sex;

    private String age;

    private String politicalstatus;

    private String nativer;

    private String graduation;

    private String education;

    private String positionhistory;

    private String inputdate;

    private String updatedate;
    
    private String code;//部门Code
    
    private String code2;
    
    private String diplomasource ;//01 内部  02 外部
    
	public String getDiplomasource() {
		return diplomasource;
	}

	public void setDiplomasource(String diplomasource) {
		this.diplomasource = diplomasource;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPoliticalstatus() {
        return politicalstatus;
    }

    public void setPoliticalstatus(String politicalstatus) {
        this.politicalstatus = politicalstatus;
    }

    public String getNativer() {
        return nativer;
    }

    public void setNativer(String nativer) {
        this.nativer = nativer;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPositionhistory() {
        return positionhistory;
    }

    public void setPositionhistory(String positionhistory) {
        this.positionhistory = positionhistory;
    }

    public String getInputdate() {
        return inputdate;
    }

    public void setInputdate(String inputdate) {
        this.inputdate = inputdate;
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }
}