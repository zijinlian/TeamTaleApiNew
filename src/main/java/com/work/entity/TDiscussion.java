package com.work.entity;

import org.apache.commons.lang3.StringUtils;

import com.work.common.DateUtil;

public class TDiscussion {
    private String fdDisId;

    private String fdEmpid;

    private String fdEmpnme;

    private String fdCfId;

    private String fdContent;

    private String fdAnswertime;

    private String fdAcceptState;

    private String fdLikeCount;

    private String fdCfThrem;
    
    private String dayNum;
    
    private String fdHeadicon; //头像
    
    private Integer rownum;

    private String fdOrgnme;
    
    private String fdUnitNme;
    
	public String getFdUnitNme() {
		return fdUnitNme;
	}

	public void setFdUnitNme(String fdUnitNme) {
		this.fdUnitNme = fdUnitNme;
	}

	public String getFdOrgnme() {
		return fdOrgnme;
	}

	public void setFdOrgnme(String fdOrgnme) {
		this.fdOrgnme = fdOrgnme;
	}

	public String getDayNum() {
    	if(StringUtils.isNotEmpty(fdAnswertime)){
    		dayNum = DateUtil.getDayStrFormat(fdAnswertime,true);
    	}
		return dayNum;
	}

	public void setDayNum(String dayNum) {
		this.dayNum = dayNum;
	}

    public String getFdDisId() {
        return fdDisId;
    }

    public void setFdDisId(String fdDisId) {
        this.fdDisId = fdDisId;
    }

    public String getFdEmpid() {
        return fdEmpid;
    }

    public void setFdEmpid(String fdEmpid) {
        this.fdEmpid = fdEmpid;
    }

    public String getFdEmpnme() {
        return fdEmpnme;
    }

    public void setFdEmpnme(String fdEmpnme) {
        this.fdEmpnme = fdEmpnme;
    }

    public String getFdCfId() {
        return fdCfId;
    }

    public void setFdCfId(String fdCfId) {
        this.fdCfId = fdCfId;
    }

    public String getFdContent() {
        return fdContent;
    }

    public void setFdContent(String fdContent) {
        this.fdContent = fdContent;
    }

    public String getFdAnswertime() {
        return fdAnswertime;
    }

    public void setFdAnswertime(String fdAnswertime) {
        this.fdAnswertime = fdAnswertime;
    }

    public String getFdAcceptState() {
        return fdAcceptState;
    }

    public void setFdAcceptState(String fdAcceptState) {
        this.fdAcceptState = fdAcceptState;
    }

    public String getFdLikeCount() {
        return fdLikeCount;
    }

    public void setFdLikeCount(String fdLikeCount) {
        this.fdLikeCount = fdLikeCount;
    }

    public String getFdCfThrem() {
        return fdCfThrem;
    }

    public void setFdCfThrem(String fdCfThrem) {
        this.fdCfThrem = fdCfThrem;
    }

	public String getFdHeadicon() {
		return fdHeadicon;
	}

	public void setFdHeadicon(String fdHeadicon) {
		this.fdHeadicon = fdHeadicon;
	}

	public Integer getRownum() {
		return rownum;
	}

	public void setRownum(Integer rownum) {
		this.rownum = rownum;
	}
	
}