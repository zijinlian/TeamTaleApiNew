package com.work.entity;

import java.math.BigDecimal;

public class TbOaExamDept {
    private String deptId;

    private String deptNme;

    private BigDecimal deptOrder;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptNme() {
        return deptNme;
    }

    public void setDeptNme(String deptNme) {
        this.deptNme = deptNme;
    }

    public BigDecimal getDeptOrder() {
        return deptOrder;
    }

    public void setDeptOrder(BigDecimal deptOrder) {
        this.deptOrder = deptOrder;
    }
}