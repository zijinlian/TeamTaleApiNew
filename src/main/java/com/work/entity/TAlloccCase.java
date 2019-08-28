package com.work.entity;

import java.math.BigDecimal;

/**
 * Created by System_User on 2017/1/4.
 */
public class TAlloccCase {
    private String  courseid;//  VARCHAR2(32),
    private String deptcode;//  VARCHAR2(5),
    private String deptname;//  VARCHAR2(100),
    private BigDecimal studynum;//  NUMBER,
    private String orderflag;// VARCHAR2(2)

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public BigDecimal getStudynum() {
        return studynum;
    }

    public void setStudynum(BigDecimal studynum) {
        this.studynum = studynum;
    }

    public String getOrderflag() {
        return orderflag;
    }

    public void setOrderflag(String orderflag) {
        this.orderflag = orderflag;
    }

}
