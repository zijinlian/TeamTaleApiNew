package com.work.bean;

/**
 * Created by System_User on 2016/12/29.
 */
public class SuggestBean extends PageBean{
	
	private String id;

    private String empid;
    
    private String fdSugTypid;//发起建议类型
    private String fdEmpUninme;//发起人部门名称
    private String fdApproOrgnme;//反馈部门名称
    private String fdTitle;//建议标题
	private String orgId;//当前登录用户机构号
	private String fdApproOrg;//反馈部门Code
    
    
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

	public String getFdSugTypid() {
		return fdSugTypid;
	}

	public void setFdSugTypid(String fdSugTypid) {
		this.fdSugTypid = fdSugTypid;
	}

	public String getFdEmpUninme() {
		return fdEmpUninme;
	}

	public void setFdEmpUninme(String fdEmpUninme) {
		this.fdEmpUninme = fdEmpUninme;
	}

	public String getFdApproOrgnme() {
		return fdApproOrgnme;
	}

	public void setFdApproOrgnme(String fdApproOrgnme) {
		this.fdApproOrgnme = fdApproOrgnme;
	}

	public String getFdTitle() {
		return fdTitle;
	}

	public void setFdTitle(String fdTitle) {
		this.fdTitle = fdTitle;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getFdApproOrg() {
		return fdApproOrg;
	}

	public void setFdApproOrg(String fdApproOrg) {
		this.fdApproOrg = fdApproOrg;
	}
}
