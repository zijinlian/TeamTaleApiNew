package com.work.bean;

import java.util.List;

public class CheckFinalListBean {

	 private String tbCheckFinalListId;

    private String fdFinalListSubject;

    private String fdFinalListDate;

    private String fdFinalListBodies;

    private String fdFinalListRisk;

    private String fdFinalListStatus;

    private String fdCheckFinalBewrite;

    private String fdCheckFinalBodiesId;
    
    
    private List<CheckFinalItemsBean> items;
    
    public List<CheckFinalItemsBean> getItems() {
		return items;
	}

	public void setItems(List<CheckFinalItemsBean> items) {
		this.items = items;
	}
    
	public String getTbCheckFinalListId() {
		return tbCheckFinalListId;
	}

	public void setTbCheckFinalListId(String tbCheckFinalListId) {
		this.tbCheckFinalListId = tbCheckFinalListId;
	}

	public String getFdFinalListSubject() {
		return fdFinalListSubject;
	}

	public void setFdFinalListSubject(String fdFinalListSubject) {
		this.fdFinalListSubject = fdFinalListSubject;
	}

	public String getFdFinalListDate() {
		return fdFinalListDate;
	}

	public void setFdFinalListDate(String fdFinalListDate) {
		this.fdFinalListDate = fdFinalListDate;
	}

	public String getFdFinalListBodies() {
		return fdFinalListBodies;
	}

	public void setFdFinalListBodies(String fdFinalListBodies) {
		this.fdFinalListBodies = fdFinalListBodies;
	}

	public String getFdFinalListRisk() {
		return fdFinalListRisk;
	}

	public void setFdFinalListRisk(String fdFinalListRisk) {
		this.fdFinalListRisk = fdFinalListRisk;
	}

	public String getFdFinalListStatus() {
		return fdFinalListStatus;
	}

	public void setFdFinalListStatus(String fdFinalListStatus) {
		this.fdFinalListStatus = fdFinalListStatus;
	}

	public String getFdCheckFinalBewrite() {
		return fdCheckFinalBewrite;
	}

	public void setFdCheckFinalBewrite(String fdCheckFinalBewrite) {
		this.fdCheckFinalBewrite = fdCheckFinalBewrite;
	}

	public String getFdCheckFinalBodiesId() {
		return fdCheckFinalBodiesId;
	}

	public void setFdCheckFinalBodiesId(String fdCheckFinalBodiesId) {
		this.fdCheckFinalBodiesId = fdCheckFinalBodiesId;
	}

}