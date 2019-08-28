package com.work.bean;

public class TraiSignBean {
	private String signid;

    private String signtime;

    private String courseid;

    private String employeeid;

    private String employeename;

    private String signcourseid;
    
    private String id;//课程ID
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public String getSigncourseid() {
		return signcourseid;
	}

	public void setSigncourseid(String signcourseid) {
		this.signcourseid = signcourseid;
	}

	public String getSignid() {
        return signid;
    }

    public void setSignid(String signid) {
        this.signid = signid;
    }

    public String getSigntime() {
        return signtime;
    }

    public void setSigntime(String signtime) {
        this.signtime = signtime;
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
}