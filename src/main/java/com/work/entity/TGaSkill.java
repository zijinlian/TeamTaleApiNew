package com.work.entity;

import java.math.BigDecimal;

public class TGaSkill {
    private String id;

    private String skilltype;

    private String skilllevel;

    private BigDecimal skillsource;

    private String empname;

    private String empid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSkilltype() {
        return skilltype;
    }

    public void setSkilltype(String skilltype) {
        this.skilltype = skilltype;
    }

    public String getSkilllevel() {
        return skilllevel;
    }

    public void setSkilllevel(String skilllevel) {
        this.skilllevel = skilllevel;
    }

    public BigDecimal getSkillsource() {
        return skillsource;
    }

    public void setSkillsource(BigDecimal skillsource) {
        this.skillsource = skillsource;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }
}