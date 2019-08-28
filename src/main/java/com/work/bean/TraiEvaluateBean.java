package com.work.bean;

import java.util.List;

public class TraiEvaluateBean {
    private String evaluateid;

    private String teacherid;

    private String teachname;

    private String evaluatecontent;

    private String employeeid;

    private String employeename;

    private String score;
    
    private String id;//课程ID
    
    private String planId;
    
    private List<TraiEvaluateBean> teachers;
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

    public List<TraiEvaluateBean> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<TraiEvaluateBean> teachers) {
		this.teachers = teachers;
	}

	public String getEvaluateid() {
        return evaluateid;
    }

    public void setEvaluateid(String evaluateid) {
        this.evaluateid = evaluateid;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachname() {
        return teachname;
    }

    public void setTeachname(String teachname) {
        this.teachname = teachname;
    }

    public String getEvaluatecontent() {
        return evaluatecontent;
    }

    public void setEvaluatecontent(String evaluatecontent) {
        this.evaluatecontent = evaluatecontent;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}
    
    
}