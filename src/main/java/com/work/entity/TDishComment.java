package com.work.entity;

public class TDishComment {
    private String id;

    private String taste;

    private String component;

    private String costeffective;

    private String evaluation;

    private String empid;

    private String empname;

    private String dishid;

    private String totalsource = "0";
    
    private String fdHeadicon; //头像
    
    private String credate;
    
    public String getCredate() {
		return credate;
	}

	public void setCredate(String credate) {
		this.credate = credate;
	}

	public String getFdHeadicon() {
		return fdHeadicon;
	}

	public void setFdHeadicon(String fdHeadicon) {
		this.fdHeadicon = fdHeadicon;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getCosteffective() {
        return costeffective;
    }

    public void setCosteffective(String costeffective) {
        this.costeffective = costeffective;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
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

    public String getDishid() {
        return dishid;
    }

    public void setDishid(String dishid) {
        this.dishid = dishid;
    }

    public String getTotalsource() {
        return totalsource;
    }

    public void setTotalsource(String totalsource) {
        this.totalsource = totalsource;
    }
}