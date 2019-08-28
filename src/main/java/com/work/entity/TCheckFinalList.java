package com.work.entity;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.work.common.DateUtil;

public class TCheckFinalList {
    private String tbCheckFinalListId;

    private String fdFinalListSubject;

    private String fdFinalListDate;

    private String fdFinalListBodies;

    private String fdFinalListRisk;

    private String fdFinalListStatus;

    private String fdCheckFinalBewrite;

    private String fdCheckFinalBodiesId;
    
    private String fdAttachRelId;
    
    private boolean isUpdate = false; //true 可以改,  false不能改
    

    public boolean isUpdate() {
    	if(StringUtils.equals(getFdFinalListStatus(), "4")){//1已验证 2 未验证 3 已通过 4 未通过 5已经整改
    		isUpdate = true;
    	}else if(StringUtils.equals(getFdFinalListDate(), DateUtil.defaultFormat(new Date())) && !StringUtils.equals(getFdFinalListStatus(), "5")){
    		isUpdate = true;
    	}
		return isUpdate;
	}

	public void setUpdate(boolean isUpdate) {
		this.isUpdate = isUpdate;
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

	public String getFdAttachRelId() {
		return fdAttachRelId;
	}

	public void setFdAttachRelId(String fdAttachRelId) {
		this.fdAttachRelId = fdAttachRelId;
	}
}