package com.work.bean;

import java.math.BigDecimal;

public class MyStokeBean extends  PageBean{
    private String fdEmpid;

    private String fdDate;

    private String fdTime;

    private String fdTitle;

    private String fdComment;

    private BigDecimal fdId;

    public String getFdEmpid() {
        return fdEmpid;
    }

    public void setFdEmpid(String fdEmpid) {
        this.fdEmpid = fdEmpid;
    }

    public String getFdDate() {
        return fdDate;
    }

    public void setFdDate(String fdDate) {
        this.fdDate = fdDate;
    }

    public String getFdTime() {
        return fdTime;
    }

    public void setFdTime(String fdTime) {
        this.fdTime = fdTime;
    }

    public String getFdTitle() {
        return fdTitle;
    }

    public void setFdTitle(String fdTitle) {
        this.fdTitle = fdTitle;
    }

    public String getFdComment() {
        return fdComment;
    }

    public void setFdComment(String fdComment) {
        this.fdComment = fdComment;
    }

    public BigDecimal getFdId() {
        return fdId;
    }

    public void setFdId(BigDecimal fdId) {
        this.fdId = fdId;
    }
}