package com.work.entity;

import java.math.BigDecimal;

public class TSugRepl {
    private String fdUuid;

    private BigDecimal fdOpertype;

    private String fdEmpId;

    private String fdTime;

    private String fdEmpnme="";

    private String fdEmpuninme="";

    private String fdReplyId;

    private String fdMark;

    public String getFdUuid() {
        return this.fdUuid;
    }

    public void setFdUuid(String fdUuid) {
        this.fdUuid = fdUuid;
    }

    public BigDecimal getFdOpertype() {
        return fdOpertype;
    }

    public void setFdOpertype(BigDecimal fdOpertype) {
        this.fdOpertype = fdOpertype;
    }

    public String getFdEmpId() {
        return this.fdEmpId;
    }

    public void setFdEmpId(String fdEmpId) {
        this.fdEmpId = fdEmpId;
    }

    public String getFdTime() {
        return fdTime;
    }

    public void setFdTime(String fdTime) {
        this.fdTime = fdTime;
    }

    public String getFdEmpnme() {
        return this.fdEmpnme;
    }

    public void setFdEmpnme(String fdEmpnme) {
        this.fdEmpnme = fdEmpnme;
    }

    public String getFdEmpuninme() {
        return this.fdEmpuninme;
    }

    public void setFdEmpuninme(String fdEmpuninme) {
        this.fdEmpuninme = fdEmpuninme;
    }

    public String getFdReplyId() {
        return this.fdReplyId;
    }

    public void setFdReplyId(String fdReplyId) {
        this.fdReplyId = fdReplyId;
    }

    public String getFdMark() {
        return this.fdMark;
    }

    public void setFdMark(String fdMark) {
        this.fdMark = fdMark;
    }
}