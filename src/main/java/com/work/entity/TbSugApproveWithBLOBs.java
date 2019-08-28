package com.work.entity;

public class TbSugApproveWithBLOBs extends TbSugApprove {
    private String fdApproMark;

    private String fdSugEmpMark;

    public String getFdApproMark() {
        return fdApproMark;
    }

    public void setFdApproMark(String fdApproMark) {
        this.fdApproMark = fdApproMark;
    }

    public String getFdSugEmpMark() {
        return fdSugEmpMark;
    }

    public void setFdSugEmpMark(String fdSugEmpMark) {
        this.fdSugEmpMark = fdSugEmpMark;
    }
}