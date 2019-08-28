package com.work.bean;

public class DishMenuBean extends PageBean{
	
	private String empId;
	private String dishid;
	private String dishAreaName;
	private String pxCode;//排序 0:类别 CLASSID,1人气 C
	private String pxType;//ASC or DESC
	private String keyCode;
	
	public String getKeyCode() {
		return keyCode;
	}

	public void setKeyCode(String keyCode) {
		this.keyCode = keyCode;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getDishAreaName() {
		return dishAreaName;
	}

	public void setDishAreaName(String dishAreaName) {
		this.dishAreaName = dishAreaName;
	}

	public String getPxCode() {
		return pxCode;
	}

	public void setPxCode(String pxCode) {
		this.pxCode = pxCode;
	}

	public String getPxType() {
		return pxType;
	}

	public void setPxType(String pxType) {
		this.pxType = pxType;
	}

	public String getDishid() {
		return dishid;
	}

	public void setDishid(String dishid) {
		this.dishid = dishid;
	}
	
}
