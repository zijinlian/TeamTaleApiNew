package com.work.bean;

public class PartyBean extends PageBean{
	
//	private String empid;
	
	private String partyId;

	private String partyLevel;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type;


	public String getPartyLevel(){return partyLevel;}
	public void setPartyLevel(String partyLevel){this.partyLevel = partyLevel;}
	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

//	public String getEmpid() {
//		return empid;
//	}
//
//	public void setEmpid(String empid) {
//		this.empid = empid;
//	}
	
}
