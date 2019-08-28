package com.work.bean;

import java.util.List;

public class DishEmpCheckBean {
	
    private String id;

    private String mealid;

    private String empid;

    private String empname;

    private String status;

    private String checkdate;
    
    private List<DishEmpCheckBean> checks;
    

    public List<DishEmpCheckBean> getChecks() {
		return checks;
	}

	public void setChecks(List<DishEmpCheckBean> checks) {
		this.checks = checks;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMealid() {
        return mealid;
    }

    public void setMealid(String mealid) {
        this.mealid = mealid;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
    }
}