package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TbPepmgmEmpinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPepmgmEmpinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFdEmpidIsNull() {
            addCriterion("FD_EMPID is null");
            return (Criteria) this;
        }

        public Criteria andFdEmpidIsNotNull() {
            addCriterion("FD_EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andFdEmpidEqualTo(String value) {
            addCriterion("FD_EMPID =", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidNotEqualTo(String value) {
            addCriterion("FD_EMPID <>", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidGreaterThan(String value) {
            addCriterion("FD_EMPID >", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("FD_EMPID >=", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidLessThan(String value) {
            addCriterion("FD_EMPID <", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidLessThanOrEqualTo(String value) {
            addCriterion("FD_EMPID <=", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidLike(String value) {
            addCriterion("FD_EMPID like", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidNotLike(String value) {
            addCriterion("FD_EMPID not like", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidIn(List<String> values) {
            addCriterion("FD_EMPID in", values, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidNotIn(List<String> values) {
            addCriterion("FD_EMPID not in", values, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidBetween(String value1, String value2) {
            addCriterion("FD_EMPID between", value1, value2, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidNotBetween(String value1, String value2) {
            addCriterion("FD_EMPID not between", value1, value2, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeIsNull() {
            addCriterion("FD_EMPNME is null");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeIsNotNull() {
            addCriterion("FD_EMPNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeEqualTo(String value) {
            addCriterion("FD_EMPNME =", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeNotEqualTo(String value) {
            addCriterion("FD_EMPNME <>", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeGreaterThan(String value) {
            addCriterion("FD_EMPNME >", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_EMPNME >=", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeLessThan(String value) {
            addCriterion("FD_EMPNME <", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeLessThanOrEqualTo(String value) {
            addCriterion("FD_EMPNME <=", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeLike(String value) {
            addCriterion("FD_EMPNME like", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeNotLike(String value) {
            addCriterion("FD_EMPNME not like", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeIn(List<String> values) {
            addCriterion("FD_EMPNME in", values, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeNotIn(List<String> values) {
            addCriterion("FD_EMPNME not in", values, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeBetween(String value1, String value2) {
            addCriterion("FD_EMPNME between", value1, value2, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeNotBetween(String value1, String value2) {
            addCriterion("FD_EMPNME not between", value1, value2, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdGenderIsNull() {
            addCriterion("FD_GENDER is null");
            return (Criteria) this;
        }

        public Criteria andFdGenderIsNotNull() {
            addCriterion("FD_GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andFdGenderEqualTo(String value) {
            addCriterion("FD_GENDER =", value, "fdGender");
            return (Criteria) this;
        }

        public Criteria andFdGenderNotEqualTo(String value) {
            addCriterion("FD_GENDER <>", value, "fdGender");
            return (Criteria) this;
        }

        public Criteria andFdGenderGreaterThan(String value) {
            addCriterion("FD_GENDER >", value, "fdGender");
            return (Criteria) this;
        }

        public Criteria andFdGenderGreaterThanOrEqualTo(String value) {
            addCriterion("FD_GENDER >=", value, "fdGender");
            return (Criteria) this;
        }

        public Criteria andFdGenderLessThan(String value) {
            addCriterion("FD_GENDER <", value, "fdGender");
            return (Criteria) this;
        }

        public Criteria andFdGenderLessThanOrEqualTo(String value) {
            addCriterion("FD_GENDER <=", value, "fdGender");
            return (Criteria) this;
        }

        public Criteria andFdGenderLike(String value) {
            addCriterion("FD_GENDER like", value, "fdGender");
            return (Criteria) this;
        }

        public Criteria andFdGenderNotLike(String value) {
            addCriterion("FD_GENDER not like", value, "fdGender");
            return (Criteria) this;
        }

        public Criteria andFdGenderIn(List<String> values) {
            addCriterion("FD_GENDER in", values, "fdGender");
            return (Criteria) this;
        }

        public Criteria andFdGenderNotIn(List<String> values) {
            addCriterion("FD_GENDER not in", values, "fdGender");
            return (Criteria) this;
        }

        public Criteria andFdGenderBetween(String value1, String value2) {
            addCriterion("FD_GENDER between", value1, value2, "fdGender");
            return (Criteria) this;
        }

        public Criteria andFdGenderNotBetween(String value1, String value2) {
            addCriterion("FD_GENDER not between", value1, value2, "fdGender");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeIsNull() {
            addCriterion("FD_ORGNME is null");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeIsNotNull() {
            addCriterion("FD_ORGNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeEqualTo(String value) {
            addCriterion("FD_ORGNME =", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeNotEqualTo(String value) {
            addCriterion("FD_ORGNME <>", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeGreaterThan(String value) {
            addCriterion("FD_ORGNME >", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ORGNME >=", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeLessThan(String value) {
            addCriterion("FD_ORGNME <", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeLessThanOrEqualTo(String value) {
            addCriterion("FD_ORGNME <=", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeLike(String value) {
            addCriterion("FD_ORGNME like", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeNotLike(String value) {
            addCriterion("FD_ORGNME not like", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeIn(List<String> values) {
            addCriterion("FD_ORGNME in", values, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeNotIn(List<String> values) {
            addCriterion("FD_ORGNME not in", values, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeBetween(String value1, String value2) {
            addCriterion("FD_ORGNME between", value1, value2, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeNotBetween(String value1, String value2) {
            addCriterion("FD_ORGNME not between", value1, value2, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitnmeIsNull() {
            addCriterion("FD_UNITNME is null");
            return (Criteria) this;
        }

        public Criteria andFdUnitnmeIsNotNull() {
            addCriterion("FD_UNITNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdUnitnmeEqualTo(String value) {
            addCriterion("FD_UNITNME =", value, "fdUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitnmeNotEqualTo(String value) {
            addCriterion("FD_UNITNME <>", value, "fdUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitnmeGreaterThan(String value) {
            addCriterion("FD_UNITNME >", value, "fdUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitnmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_UNITNME >=", value, "fdUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitnmeLessThan(String value) {
            addCriterion("FD_UNITNME <", value, "fdUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitnmeLessThanOrEqualTo(String value) {
            addCriterion("FD_UNITNME <=", value, "fdUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitnmeLike(String value) {
            addCriterion("FD_UNITNME like", value, "fdUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitnmeNotLike(String value) {
            addCriterion("FD_UNITNME not like", value, "fdUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitnmeIn(List<String> values) {
            addCriterion("FD_UNITNME in", values, "fdUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitnmeNotIn(List<String> values) {
            addCriterion("FD_UNITNME not in", values, "fdUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitnmeBetween(String value1, String value2) {
            addCriterion("FD_UNITNME between", value1, value2, "fdUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitnmeNotBetween(String value1, String value2) {
            addCriterion("FD_UNITNME not between", value1, value2, "fdUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdJobnmeIsNull() {
            addCriterion("FD_JOBNME is null");
            return (Criteria) this;
        }

        public Criteria andFdJobnmeIsNotNull() {
            addCriterion("FD_JOBNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdJobnmeEqualTo(String value) {
            addCriterion("FD_JOBNME =", value, "fdJobnme");
            return (Criteria) this;
        }

        public Criteria andFdJobnmeNotEqualTo(String value) {
            addCriterion("FD_JOBNME <>", value, "fdJobnme");
            return (Criteria) this;
        }

        public Criteria andFdJobnmeGreaterThan(String value) {
            addCriterion("FD_JOBNME >", value, "fdJobnme");
            return (Criteria) this;
        }

        public Criteria andFdJobnmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_JOBNME >=", value, "fdJobnme");
            return (Criteria) this;
        }

        public Criteria andFdJobnmeLessThan(String value) {
            addCriterion("FD_JOBNME <", value, "fdJobnme");
            return (Criteria) this;
        }

        public Criteria andFdJobnmeLessThanOrEqualTo(String value) {
            addCriterion("FD_JOBNME <=", value, "fdJobnme");
            return (Criteria) this;
        }

        public Criteria andFdJobnmeLike(String value) {
            addCriterion("FD_JOBNME like", value, "fdJobnme");
            return (Criteria) this;
        }

        public Criteria andFdJobnmeNotLike(String value) {
            addCriterion("FD_JOBNME not like", value, "fdJobnme");
            return (Criteria) this;
        }

        public Criteria andFdJobnmeIn(List<String> values) {
            addCriterion("FD_JOBNME in", values, "fdJobnme");
            return (Criteria) this;
        }

        public Criteria andFdJobnmeNotIn(List<String> values) {
            addCriterion("FD_JOBNME not in", values, "fdJobnme");
            return (Criteria) this;
        }

        public Criteria andFdJobnmeBetween(String value1, String value2) {
            addCriterion("FD_JOBNME between", value1, value2, "fdJobnme");
            return (Criteria) this;
        }

        public Criteria andFdJobnmeNotBetween(String value1, String value2) {
            addCriterion("FD_JOBNME not between", value1, value2, "fdJobnme");
            return (Criteria) this;
        }

        public Criteria andFdStandardJobnmeIsNull() {
            addCriterion("FD_STANDARD_JOBNME is null");
            return (Criteria) this;
        }

        public Criteria andFdStandardJobnmeIsNotNull() {
            addCriterion("FD_STANDARD_JOBNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdStandardJobnmeEqualTo(String value) {
            addCriterion("FD_STANDARD_JOBNME =", value, "fdStandardJobnme");
            return (Criteria) this;
        }

        public Criteria andFdStandardJobnmeNotEqualTo(String value) {
            addCriterion("FD_STANDARD_JOBNME <>", value, "fdStandardJobnme");
            return (Criteria) this;
        }

        public Criteria andFdStandardJobnmeGreaterThan(String value) {
            addCriterion("FD_STANDARD_JOBNME >", value, "fdStandardJobnme");
            return (Criteria) this;
        }

        public Criteria andFdStandardJobnmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_STANDARD_JOBNME >=", value, "fdStandardJobnme");
            return (Criteria) this;
        }

        public Criteria andFdStandardJobnmeLessThan(String value) {
            addCriterion("FD_STANDARD_JOBNME <", value, "fdStandardJobnme");
            return (Criteria) this;
        }

        public Criteria andFdStandardJobnmeLessThanOrEqualTo(String value) {
            addCriterion("FD_STANDARD_JOBNME <=", value, "fdStandardJobnme");
            return (Criteria) this;
        }

        public Criteria andFdStandardJobnmeLike(String value) {
            addCriterion("FD_STANDARD_JOBNME like", value, "fdStandardJobnme");
            return (Criteria) this;
        }

        public Criteria andFdStandardJobnmeNotLike(String value) {
            addCriterion("FD_STANDARD_JOBNME not like", value, "fdStandardJobnme");
            return (Criteria) this;
        }

        public Criteria andFdStandardJobnmeIn(List<String> values) {
            addCriterion("FD_STANDARD_JOBNME in", values, "fdStandardJobnme");
            return (Criteria) this;
        }

        public Criteria andFdStandardJobnmeNotIn(List<String> values) {
            addCriterion("FD_STANDARD_JOBNME not in", values, "fdStandardJobnme");
            return (Criteria) this;
        }

        public Criteria andFdStandardJobnmeBetween(String value1, String value2) {
            addCriterion("FD_STANDARD_JOBNME between", value1, value2, "fdStandardJobnme");
            return (Criteria) this;
        }

        public Criteria andFdStandardJobnmeNotBetween(String value1, String value2) {
            addCriterion("FD_STANDARD_JOBNME not between", value1, value2, "fdStandardJobnme");
            return (Criteria) this;
        }

        public Criteria andFdJobStartdateIsNull() {
            addCriterion("FD_JOB_STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andFdJobStartdateIsNotNull() {
            addCriterion("FD_JOB_STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdJobStartdateEqualTo(String value) {
            addCriterion("FD_JOB_STARTDATE =", value, "fdJobStartdate");
            return (Criteria) this;
        }

        public Criteria andFdJobStartdateNotEqualTo(String value) {
            addCriterion("FD_JOB_STARTDATE <>", value, "fdJobStartdate");
            return (Criteria) this;
        }

        public Criteria andFdJobStartdateGreaterThan(String value) {
            addCriterion("FD_JOB_STARTDATE >", value, "fdJobStartdate");
            return (Criteria) this;
        }

        public Criteria andFdJobStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_JOB_STARTDATE >=", value, "fdJobStartdate");
            return (Criteria) this;
        }

        public Criteria andFdJobStartdateLessThan(String value) {
            addCriterion("FD_JOB_STARTDATE <", value, "fdJobStartdate");
            return (Criteria) this;
        }

        public Criteria andFdJobStartdateLessThanOrEqualTo(String value) {
            addCriterion("FD_JOB_STARTDATE <=", value, "fdJobStartdate");
            return (Criteria) this;
        }

        public Criteria andFdJobStartdateLike(String value) {
            addCriterion("FD_JOB_STARTDATE like", value, "fdJobStartdate");
            return (Criteria) this;
        }

        public Criteria andFdJobStartdateNotLike(String value) {
            addCriterion("FD_JOB_STARTDATE not like", value, "fdJobStartdate");
            return (Criteria) this;
        }

        public Criteria andFdJobStartdateIn(List<String> values) {
            addCriterion("FD_JOB_STARTDATE in", values, "fdJobStartdate");
            return (Criteria) this;
        }

        public Criteria andFdJobStartdateNotIn(List<String> values) {
            addCriterion("FD_JOB_STARTDATE not in", values, "fdJobStartdate");
            return (Criteria) this;
        }

        public Criteria andFdJobStartdateBetween(String value1, String value2) {
            addCriterion("FD_JOB_STARTDATE between", value1, value2, "fdJobStartdate");
            return (Criteria) this;
        }

        public Criteria andFdJobStartdateNotBetween(String value1, String value2) {
            addCriterion("FD_JOB_STARTDATE not between", value1, value2, "fdJobStartdate");
            return (Criteria) this;
        }

        public Criteria andFdJobidIsNull() {
            addCriterion("FD_JOBID is null");
            return (Criteria) this;
        }

        public Criteria andFdJobidIsNotNull() {
            addCriterion("FD_JOBID is not null");
            return (Criteria) this;
        }

        public Criteria andFdJobidEqualTo(String value) {
            addCriterion("FD_JOBID =", value, "fdJobid");
            return (Criteria) this;
        }

        public Criteria andFdJobidNotEqualTo(String value) {
            addCriterion("FD_JOBID <>", value, "fdJobid");
            return (Criteria) this;
        }

        public Criteria andFdJobidGreaterThan(String value) {
            addCriterion("FD_JOBID >", value, "fdJobid");
            return (Criteria) this;
        }

        public Criteria andFdJobidGreaterThanOrEqualTo(String value) {
            addCriterion("FD_JOBID >=", value, "fdJobid");
            return (Criteria) this;
        }

        public Criteria andFdJobidLessThan(String value) {
            addCriterion("FD_JOBID <", value, "fdJobid");
            return (Criteria) this;
        }

        public Criteria andFdJobidLessThanOrEqualTo(String value) {
            addCriterion("FD_JOBID <=", value, "fdJobid");
            return (Criteria) this;
        }

        public Criteria andFdJobidLike(String value) {
            addCriterion("FD_JOBID like", value, "fdJobid");
            return (Criteria) this;
        }

        public Criteria andFdJobidNotLike(String value) {
            addCriterion("FD_JOBID not like", value, "fdJobid");
            return (Criteria) this;
        }

        public Criteria andFdJobidIn(List<String> values) {
            addCriterion("FD_JOBID in", values, "fdJobid");
            return (Criteria) this;
        }

        public Criteria andFdJobidNotIn(List<String> values) {
            addCriterion("FD_JOBID not in", values, "fdJobid");
            return (Criteria) this;
        }

        public Criteria andFdJobidBetween(String value1, String value2) {
            addCriterion("FD_JOBID between", value1, value2, "fdJobid");
            return (Criteria) this;
        }

        public Criteria andFdJobidNotBetween(String value1, String value2) {
            addCriterion("FD_JOBID not between", value1, value2, "fdJobid");
            return (Criteria) this;
        }

        public Criteria andFdUnitcdeIsNull() {
            addCriterion("FD_UNITCDE is null");
            return (Criteria) this;
        }

        public Criteria andFdUnitcdeIsNotNull() {
            addCriterion("FD_UNITCDE is not null");
            return (Criteria) this;
        }

        public Criteria andFdUnitcdeEqualTo(String value) {
            addCriterion("FD_UNITCDE =", value, "fdUnitcde");
            return (Criteria) this;
        }

        public Criteria andFdUnitcdeNotEqualTo(String value) {
            addCriterion("FD_UNITCDE <>", value, "fdUnitcde");
            return (Criteria) this;
        }

        public Criteria andFdUnitcdeGreaterThan(String value) {
            addCriterion("FD_UNITCDE >", value, "fdUnitcde");
            return (Criteria) this;
        }

        public Criteria andFdUnitcdeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_UNITCDE >=", value, "fdUnitcde");
            return (Criteria) this;
        }

        public Criteria andFdUnitcdeLessThan(String value) {
            addCriterion("FD_UNITCDE <", value, "fdUnitcde");
            return (Criteria) this;
        }

        public Criteria andFdUnitcdeLessThanOrEqualTo(String value) {
            addCriterion("FD_UNITCDE <=", value, "fdUnitcde");
            return (Criteria) this;
        }

        public Criteria andFdUnitcdeLike(String value) {
            addCriterion("FD_UNITCDE like", value, "fdUnitcde");
            return (Criteria) this;
        }

        public Criteria andFdUnitcdeNotLike(String value) {
            addCriterion("FD_UNITCDE not like", value, "fdUnitcde");
            return (Criteria) this;
        }

        public Criteria andFdUnitcdeIn(List<String> values) {
            addCriterion("FD_UNITCDE in", values, "fdUnitcde");
            return (Criteria) this;
        }

        public Criteria andFdUnitcdeNotIn(List<String> values) {
            addCriterion("FD_UNITCDE not in", values, "fdUnitcde");
            return (Criteria) this;
        }

        public Criteria andFdUnitcdeBetween(String value1, String value2) {
            addCriterion("FD_UNITCDE between", value1, value2, "fdUnitcde");
            return (Criteria) this;
        }

        public Criteria andFdUnitcdeNotBetween(String value1, String value2) {
            addCriterion("FD_UNITCDE not between", value1, value2, "fdUnitcde");
            return (Criteria) this;
        }

        public Criteria andFdOrgcdeIsNull() {
            addCriterion("FD_ORGCDE is null");
            return (Criteria) this;
        }

        public Criteria andFdOrgcdeIsNotNull() {
            addCriterion("FD_ORGCDE is not null");
            return (Criteria) this;
        }

        public Criteria andFdOrgcdeEqualTo(String value) {
            addCriterion("FD_ORGCDE =", value, "fdOrgcde");
            return (Criteria) this;
        }

        public Criteria andFdOrgcdeNotEqualTo(String value) {
            addCriterion("FD_ORGCDE <>", value, "fdOrgcde");
            return (Criteria) this;
        }

        public Criteria andFdOrgcdeGreaterThan(String value) {
            addCriterion("FD_ORGCDE >", value, "fdOrgcde");
            return (Criteria) this;
        }

        public Criteria andFdOrgcdeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ORGCDE >=", value, "fdOrgcde");
            return (Criteria) this;
        }

        public Criteria andFdOrgcdeLessThan(String value) {
            addCriterion("FD_ORGCDE <", value, "fdOrgcde");
            return (Criteria) this;
        }

        public Criteria andFdOrgcdeLessThanOrEqualTo(String value) {
            addCriterion("FD_ORGCDE <=", value, "fdOrgcde");
            return (Criteria) this;
        }

        public Criteria andFdOrgcdeLike(String value) {
            addCriterion("FD_ORGCDE like", value, "fdOrgcde");
            return (Criteria) this;
        }

        public Criteria andFdOrgcdeNotLike(String value) {
            addCriterion("FD_ORGCDE not like", value, "fdOrgcde");
            return (Criteria) this;
        }

        public Criteria andFdOrgcdeIn(List<String> values) {
            addCriterion("FD_ORGCDE in", values, "fdOrgcde");
            return (Criteria) this;
        }

        public Criteria andFdOrgcdeNotIn(List<String> values) {
            addCriterion("FD_ORGCDE not in", values, "fdOrgcde");
            return (Criteria) this;
        }

        public Criteria andFdOrgcdeBetween(String value1, String value2) {
            addCriterion("FD_ORGCDE between", value1, value2, "fdOrgcde");
            return (Criteria) this;
        }

        public Criteria andFdOrgcdeNotBetween(String value1, String value2) {
            addCriterion("FD_ORGCDE not between", value1, value2, "fdOrgcde");
            return (Criteria) this;
        }

        public Criteria andFdStandjobSysnumIsNull() {
            addCriterion("FD_STANDJOB_SYSNUM is null");
            return (Criteria) this;
        }

        public Criteria andFdStandjobSysnumIsNotNull() {
            addCriterion("FD_STANDJOB_SYSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFdStandjobSysnumEqualTo(String value) {
            addCriterion("FD_STANDJOB_SYSNUM =", value, "fdStandjobSysnum");
            return (Criteria) this;
        }

        public Criteria andFdStandjobSysnumNotEqualTo(String value) {
            addCriterion("FD_STANDJOB_SYSNUM <>", value, "fdStandjobSysnum");
            return (Criteria) this;
        }

        public Criteria andFdStandjobSysnumGreaterThan(String value) {
            addCriterion("FD_STANDJOB_SYSNUM >", value, "fdStandjobSysnum");
            return (Criteria) this;
        }

        public Criteria andFdStandjobSysnumGreaterThanOrEqualTo(String value) {
            addCriterion("FD_STANDJOB_SYSNUM >=", value, "fdStandjobSysnum");
            return (Criteria) this;
        }

        public Criteria andFdStandjobSysnumLessThan(String value) {
            addCriterion("FD_STANDJOB_SYSNUM <", value, "fdStandjobSysnum");
            return (Criteria) this;
        }

        public Criteria andFdStandjobSysnumLessThanOrEqualTo(String value) {
            addCriterion("FD_STANDJOB_SYSNUM <=", value, "fdStandjobSysnum");
            return (Criteria) this;
        }

        public Criteria andFdStandjobSysnumLike(String value) {
            addCriterion("FD_STANDJOB_SYSNUM like", value, "fdStandjobSysnum");
            return (Criteria) this;
        }

        public Criteria andFdStandjobSysnumNotLike(String value) {
            addCriterion("FD_STANDJOB_SYSNUM not like", value, "fdStandjobSysnum");
            return (Criteria) this;
        }

        public Criteria andFdStandjobSysnumIn(List<String> values) {
            addCriterion("FD_STANDJOB_SYSNUM in", values, "fdStandjobSysnum");
            return (Criteria) this;
        }

        public Criteria andFdStandjobSysnumNotIn(List<String> values) {
            addCriterion("FD_STANDJOB_SYSNUM not in", values, "fdStandjobSysnum");
            return (Criteria) this;
        }

        public Criteria andFdStandjobSysnumBetween(String value1, String value2) {
            addCriterion("FD_STANDJOB_SYSNUM between", value1, value2, "fdStandjobSysnum");
            return (Criteria) this;
        }

        public Criteria andFdStandjobSysnumNotBetween(String value1, String value2) {
            addCriterion("FD_STANDJOB_SYSNUM not between", value1, value2, "fdStandjobSysnum");
            return (Criteria) this;
        }

        public Criteria andFdEmpstatIsNull() {
            addCriterion("FD_EMPSTAT is null");
            return (Criteria) this;
        }

        public Criteria andFdEmpstatIsNotNull() {
            addCriterion("FD_EMPSTAT is not null");
            return (Criteria) this;
        }

        public Criteria andFdEmpstatEqualTo(String value) {
            addCriterion("FD_EMPSTAT =", value, "fdEmpstat");
            return (Criteria) this;
        }

        public Criteria andFdEmpstatNotEqualTo(String value) {
            addCriterion("FD_EMPSTAT <>", value, "fdEmpstat");
            return (Criteria) this;
        }

        public Criteria andFdEmpstatGreaterThan(String value) {
            addCriterion("FD_EMPSTAT >", value, "fdEmpstat");
            return (Criteria) this;
        }

        public Criteria andFdEmpstatGreaterThanOrEqualTo(String value) {
            addCriterion("FD_EMPSTAT >=", value, "fdEmpstat");
            return (Criteria) this;
        }

        public Criteria andFdEmpstatLessThan(String value) {
            addCriterion("FD_EMPSTAT <", value, "fdEmpstat");
            return (Criteria) this;
        }

        public Criteria andFdEmpstatLessThanOrEqualTo(String value) {
            addCriterion("FD_EMPSTAT <=", value, "fdEmpstat");
            return (Criteria) this;
        }

        public Criteria andFdEmpstatLike(String value) {
            addCriterion("FD_EMPSTAT like", value, "fdEmpstat");
            return (Criteria) this;
        }

        public Criteria andFdEmpstatNotLike(String value) {
            addCriterion("FD_EMPSTAT not like", value, "fdEmpstat");
            return (Criteria) this;
        }

        public Criteria andFdEmpstatIn(List<String> values) {
            addCriterion("FD_EMPSTAT in", values, "fdEmpstat");
            return (Criteria) this;
        }

        public Criteria andFdEmpstatNotIn(List<String> values) {
            addCriterion("FD_EMPSTAT not in", values, "fdEmpstat");
            return (Criteria) this;
        }

        public Criteria andFdEmpstatBetween(String value1, String value2) {
            addCriterion("FD_EMPSTAT between", value1, value2, "fdEmpstat");
            return (Criteria) this;
        }

        public Criteria andFdEmpstatNotBetween(String value1, String value2) {
            addCriterion("FD_EMPSTAT not between", value1, value2, "fdEmpstat");
            return (Criteria) this;
        }

        public Criteria andFdEmptypIsNull() {
            addCriterion("FD_EMPTYP is null");
            return (Criteria) this;
        }

        public Criteria andFdEmptypIsNotNull() {
            addCriterion("FD_EMPTYP is not null");
            return (Criteria) this;
        }

        public Criteria andFdEmptypEqualTo(String value) {
            addCriterion("FD_EMPTYP =", value, "fdEmptyp");
            return (Criteria) this;
        }

        public Criteria andFdEmptypNotEqualTo(String value) {
            addCriterion("FD_EMPTYP <>", value, "fdEmptyp");
            return (Criteria) this;
        }

        public Criteria andFdEmptypGreaterThan(String value) {
            addCriterion("FD_EMPTYP >", value, "fdEmptyp");
            return (Criteria) this;
        }

        public Criteria andFdEmptypGreaterThanOrEqualTo(String value) {
            addCriterion("FD_EMPTYP >=", value, "fdEmptyp");
            return (Criteria) this;
        }

        public Criteria andFdEmptypLessThan(String value) {
            addCriterion("FD_EMPTYP <", value, "fdEmptyp");
            return (Criteria) this;
        }

        public Criteria andFdEmptypLessThanOrEqualTo(String value) {
            addCriterion("FD_EMPTYP <=", value, "fdEmptyp");
            return (Criteria) this;
        }

        public Criteria andFdEmptypLike(String value) {
            addCriterion("FD_EMPTYP like", value, "fdEmptyp");
            return (Criteria) this;
        }

        public Criteria andFdEmptypNotLike(String value) {
            addCriterion("FD_EMPTYP not like", value, "fdEmptyp");
            return (Criteria) this;
        }

        public Criteria andFdEmptypIn(List<String> values) {
            addCriterion("FD_EMPTYP in", values, "fdEmptyp");
            return (Criteria) this;
        }

        public Criteria andFdEmptypNotIn(List<String> values) {
            addCriterion("FD_EMPTYP not in", values, "fdEmptyp");
            return (Criteria) this;
        }

        public Criteria andFdEmptypBetween(String value1, String value2) {
            addCriterion("FD_EMPTYP between", value1, value2, "fdEmptyp");
            return (Criteria) this;
        }

        public Criteria andFdEmptypNotBetween(String value1, String value2) {
            addCriterion("FD_EMPTYP not between", value1, value2, "fdEmptyp");
            return (Criteria) this;
        }

        public Criteria andFdJoblineIsNull() {
            addCriterion("FD_JOBLINE is null");
            return (Criteria) this;
        }

        public Criteria andFdJoblineIsNotNull() {
            addCriterion("FD_JOBLINE is not null");
            return (Criteria) this;
        }

        public Criteria andFdJoblineEqualTo(String value) {
            addCriterion("FD_JOBLINE =", value, "fdJobline");
            return (Criteria) this;
        }

        public Criteria andFdJoblineNotEqualTo(String value) {
            addCriterion("FD_JOBLINE <>", value, "fdJobline");
            return (Criteria) this;
        }

        public Criteria andFdJoblineGreaterThan(String value) {
            addCriterion("FD_JOBLINE >", value, "fdJobline");
            return (Criteria) this;
        }

        public Criteria andFdJoblineGreaterThanOrEqualTo(String value) {
            addCriterion("FD_JOBLINE >=", value, "fdJobline");
            return (Criteria) this;
        }

        public Criteria andFdJoblineLessThan(String value) {
            addCriterion("FD_JOBLINE <", value, "fdJobline");
            return (Criteria) this;
        }

        public Criteria andFdJoblineLessThanOrEqualTo(String value) {
            addCriterion("FD_JOBLINE <=", value, "fdJobline");
            return (Criteria) this;
        }

        public Criteria andFdJoblineLike(String value) {
            addCriterion("FD_JOBLINE like", value, "fdJobline");
            return (Criteria) this;
        }

        public Criteria andFdJoblineNotLike(String value) {
            addCriterion("FD_JOBLINE not like", value, "fdJobline");
            return (Criteria) this;
        }

        public Criteria andFdJoblineIn(List<String> values) {
            addCriterion("FD_JOBLINE in", values, "fdJobline");
            return (Criteria) this;
        }

        public Criteria andFdJoblineNotIn(List<String> values) {
            addCriterion("FD_JOBLINE not in", values, "fdJobline");
            return (Criteria) this;
        }

        public Criteria andFdJoblineBetween(String value1, String value2) {
            addCriterion("FD_JOBLINE between", value1, value2, "fdJobline");
            return (Criteria) this;
        }

        public Criteria andFdJoblineNotBetween(String value1, String value2) {
            addCriterion("FD_JOBLINE not between", value1, value2, "fdJobline");
            return (Criteria) this;
        }

        public Criteria andFdOrgIdentifyIsNull() {
            addCriterion("FD_ORG_IDENTIFY is null");
            return (Criteria) this;
        }

        public Criteria andFdOrgIdentifyIsNotNull() {
            addCriterion("FD_ORG_IDENTIFY is not null");
            return (Criteria) this;
        }

        public Criteria andFdOrgIdentifyEqualTo(String value) {
            addCriterion("FD_ORG_IDENTIFY =", value, "fdOrgIdentify");
            return (Criteria) this;
        }

        public Criteria andFdOrgIdentifyNotEqualTo(String value) {
            addCriterion("FD_ORG_IDENTIFY <>", value, "fdOrgIdentify");
            return (Criteria) this;
        }

        public Criteria andFdOrgIdentifyGreaterThan(String value) {
            addCriterion("FD_ORG_IDENTIFY >", value, "fdOrgIdentify");
            return (Criteria) this;
        }

        public Criteria andFdOrgIdentifyGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ORG_IDENTIFY >=", value, "fdOrgIdentify");
            return (Criteria) this;
        }

        public Criteria andFdOrgIdentifyLessThan(String value) {
            addCriterion("FD_ORG_IDENTIFY <", value, "fdOrgIdentify");
            return (Criteria) this;
        }

        public Criteria andFdOrgIdentifyLessThanOrEqualTo(String value) {
            addCriterion("FD_ORG_IDENTIFY <=", value, "fdOrgIdentify");
            return (Criteria) this;
        }

        public Criteria andFdOrgIdentifyLike(String value) {
            addCriterion("FD_ORG_IDENTIFY like", value, "fdOrgIdentify");
            return (Criteria) this;
        }

        public Criteria andFdOrgIdentifyNotLike(String value) {
            addCriterion("FD_ORG_IDENTIFY not like", value, "fdOrgIdentify");
            return (Criteria) this;
        }

        public Criteria andFdOrgIdentifyIn(List<String> values) {
            addCriterion("FD_ORG_IDENTIFY in", values, "fdOrgIdentify");
            return (Criteria) this;
        }

        public Criteria andFdOrgIdentifyNotIn(List<String> values) {
            addCriterion("FD_ORG_IDENTIFY not in", values, "fdOrgIdentify");
            return (Criteria) this;
        }

        public Criteria andFdOrgIdentifyBetween(String value1, String value2) {
            addCriterion("FD_ORG_IDENTIFY between", value1, value2, "fdOrgIdentify");
            return (Criteria) this;
        }

        public Criteria andFdOrgIdentifyNotBetween(String value1, String value2) {
            addCriterion("FD_ORG_IDENTIFY not between", value1, value2, "fdOrgIdentify");
            return (Criteria) this;
        }

        public Criteria andFdOrgflagIsNull() {
            addCriterion("FD_ORGFLAG is null");
            return (Criteria) this;
        }

        public Criteria andFdOrgflagIsNotNull() {
            addCriterion("FD_ORGFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFdOrgflagEqualTo(String value) {
            addCriterion("FD_ORGFLAG =", value, "fdOrgflag");
            return (Criteria) this;
        }

        public Criteria andFdOrgflagNotEqualTo(String value) {
            addCriterion("FD_ORGFLAG <>", value, "fdOrgflag");
            return (Criteria) this;
        }

        public Criteria andFdOrgflagGreaterThan(String value) {
            addCriterion("FD_ORGFLAG >", value, "fdOrgflag");
            return (Criteria) this;
        }

        public Criteria andFdOrgflagGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ORGFLAG >=", value, "fdOrgflag");
            return (Criteria) this;
        }

        public Criteria andFdOrgflagLessThan(String value) {
            addCriterion("FD_ORGFLAG <", value, "fdOrgflag");
            return (Criteria) this;
        }

        public Criteria andFdOrgflagLessThanOrEqualTo(String value) {
            addCriterion("FD_ORGFLAG <=", value, "fdOrgflag");
            return (Criteria) this;
        }

        public Criteria andFdOrgflagLike(String value) {
            addCriterion("FD_ORGFLAG like", value, "fdOrgflag");
            return (Criteria) this;
        }

        public Criteria andFdOrgflagNotLike(String value) {
            addCriterion("FD_ORGFLAG not like", value, "fdOrgflag");
            return (Criteria) this;
        }

        public Criteria andFdOrgflagIn(List<String> values) {
            addCriterion("FD_ORGFLAG in", values, "fdOrgflag");
            return (Criteria) this;
        }

        public Criteria andFdOrgflagNotIn(List<String> values) {
            addCriterion("FD_ORGFLAG not in", values, "fdOrgflag");
            return (Criteria) this;
        }

        public Criteria andFdOrgflagBetween(String value1, String value2) {
            addCriterion("FD_ORGFLAG between", value1, value2, "fdOrgflag");
            return (Criteria) this;
        }

        public Criteria andFdOrgflagNotBetween(String value1, String value2) {
            addCriterion("FD_ORGFLAG not between", value1, value2, "fdOrgflag");
            return (Criteria) this;
        }

        public Criteria andFdOrglevelIsNull() {
            addCriterion("FD_ORGLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andFdOrglevelIsNotNull() {
            addCriterion("FD_ORGLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andFdOrglevelEqualTo(String value) {
            addCriterion("FD_ORGLEVEL =", value, "fdOrglevel");
            return (Criteria) this;
        }

        public Criteria andFdOrglevelNotEqualTo(String value) {
            addCriterion("FD_ORGLEVEL <>", value, "fdOrglevel");
            return (Criteria) this;
        }

        public Criteria andFdOrglevelGreaterThan(String value) {
            addCriterion("FD_ORGLEVEL >", value, "fdOrglevel");
            return (Criteria) this;
        }

        public Criteria andFdOrglevelGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ORGLEVEL >=", value, "fdOrglevel");
            return (Criteria) this;
        }

        public Criteria andFdOrglevelLessThan(String value) {
            addCriterion("FD_ORGLEVEL <", value, "fdOrglevel");
            return (Criteria) this;
        }

        public Criteria andFdOrglevelLessThanOrEqualTo(String value) {
            addCriterion("FD_ORGLEVEL <=", value, "fdOrglevel");
            return (Criteria) this;
        }

        public Criteria andFdOrglevelLike(String value) {
            addCriterion("FD_ORGLEVEL like", value, "fdOrglevel");
            return (Criteria) this;
        }

        public Criteria andFdOrglevelNotLike(String value) {
            addCriterion("FD_ORGLEVEL not like", value, "fdOrglevel");
            return (Criteria) this;
        }

        public Criteria andFdOrglevelIn(List<String> values) {
            addCriterion("FD_ORGLEVEL in", values, "fdOrglevel");
            return (Criteria) this;
        }

        public Criteria andFdOrglevelNotIn(List<String> values) {
            addCriterion("FD_ORGLEVEL not in", values, "fdOrglevel");
            return (Criteria) this;
        }

        public Criteria andFdOrglevelBetween(String value1, String value2) {
            addCriterion("FD_ORGLEVEL between", value1, value2, "fdOrglevel");
            return (Criteria) this;
        }

        public Criteria andFdOrglevelNotBetween(String value1, String value2) {
            addCriterion("FD_ORGLEVEL not between", value1, value2, "fdOrglevel");
            return (Criteria) this;
        }

        public Criteria andFdHiredateIsNull() {
            addCriterion("FD_HIREDATE is null");
            return (Criteria) this;
        }

        public Criteria andFdHiredateIsNotNull() {
            addCriterion("FD_HIREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdHiredateEqualTo(String value) {
            addCriterion("FD_HIREDATE =", value, "fdHiredate");
            return (Criteria) this;
        }

        public Criteria andFdHiredateNotEqualTo(String value) {
            addCriterion("FD_HIREDATE <>", value, "fdHiredate");
            return (Criteria) this;
        }

        public Criteria andFdHiredateGreaterThan(String value) {
            addCriterion("FD_HIREDATE >", value, "fdHiredate");
            return (Criteria) this;
        }

        public Criteria andFdHiredateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_HIREDATE >=", value, "fdHiredate");
            return (Criteria) this;
        }

        public Criteria andFdHiredateLessThan(String value) {
            addCriterion("FD_HIREDATE <", value, "fdHiredate");
            return (Criteria) this;
        }

        public Criteria andFdHiredateLessThanOrEqualTo(String value) {
            addCriterion("FD_HIREDATE <=", value, "fdHiredate");
            return (Criteria) this;
        }

        public Criteria andFdHiredateLike(String value) {
            addCriterion("FD_HIREDATE like", value, "fdHiredate");
            return (Criteria) this;
        }

        public Criteria andFdHiredateNotLike(String value) {
            addCriterion("FD_HIREDATE not like", value, "fdHiredate");
            return (Criteria) this;
        }

        public Criteria andFdHiredateIn(List<String> values) {
            addCriterion("FD_HIREDATE in", values, "fdHiredate");
            return (Criteria) this;
        }

        public Criteria andFdHiredateNotIn(List<String> values) {
            addCriterion("FD_HIREDATE not in", values, "fdHiredate");
            return (Criteria) this;
        }

        public Criteria andFdHiredateBetween(String value1, String value2) {
            addCriterion("FD_HIREDATE between", value1, value2, "fdHiredate");
            return (Criteria) this;
        }

        public Criteria andFdHiredateNotBetween(String value1, String value2) {
            addCriterion("FD_HIREDATE not between", value1, value2, "fdHiredate");
            return (Criteria) this;
        }

        public Criteria andFdJointradeDateIsNull() {
            addCriterion("FD_JOINTRADE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFdJointradeDateIsNotNull() {
            addCriterion("FD_JOINTRADE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdJointradeDateEqualTo(String value) {
            addCriterion("FD_JOINTRADE_DATE =", value, "fdJointradeDate");
            return (Criteria) this;
        }

        public Criteria andFdJointradeDateNotEqualTo(String value) {
            addCriterion("FD_JOINTRADE_DATE <>", value, "fdJointradeDate");
            return (Criteria) this;
        }

        public Criteria andFdJointradeDateGreaterThan(String value) {
            addCriterion("FD_JOINTRADE_DATE >", value, "fdJointradeDate");
            return (Criteria) this;
        }

        public Criteria andFdJointradeDateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_JOINTRADE_DATE >=", value, "fdJointradeDate");
            return (Criteria) this;
        }

        public Criteria andFdJointradeDateLessThan(String value) {
            addCriterion("FD_JOINTRADE_DATE <", value, "fdJointradeDate");
            return (Criteria) this;
        }

        public Criteria andFdJointradeDateLessThanOrEqualTo(String value) {
            addCriterion("FD_JOINTRADE_DATE <=", value, "fdJointradeDate");
            return (Criteria) this;
        }

        public Criteria andFdJointradeDateLike(String value) {
            addCriterion("FD_JOINTRADE_DATE like", value, "fdJointradeDate");
            return (Criteria) this;
        }

        public Criteria andFdJointradeDateNotLike(String value) {
            addCriterion("FD_JOINTRADE_DATE not like", value, "fdJointradeDate");
            return (Criteria) this;
        }

        public Criteria andFdJointradeDateIn(List<String> values) {
            addCriterion("FD_JOINTRADE_DATE in", values, "fdJointradeDate");
            return (Criteria) this;
        }

        public Criteria andFdJointradeDateNotIn(List<String> values) {
            addCriterion("FD_JOINTRADE_DATE not in", values, "fdJointradeDate");
            return (Criteria) this;
        }

        public Criteria andFdJointradeDateBetween(String value1, String value2) {
            addCriterion("FD_JOINTRADE_DATE between", value1, value2, "fdJointradeDate");
            return (Criteria) this;
        }

        public Criteria andFdJointradeDateNotBetween(String value1, String value2) {
            addCriterion("FD_JOINTRADE_DATE not between", value1, value2, "fdJointradeDate");
            return (Criteria) this;
        }

        public Criteria andFdStartWorkdateIsNull() {
            addCriterion("FD_START_WORKDATE is null");
            return (Criteria) this;
        }

        public Criteria andFdStartWorkdateIsNotNull() {
            addCriterion("FD_START_WORKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdStartWorkdateEqualTo(String value) {
            addCriterion("FD_START_WORKDATE =", value, "fdStartWorkdate");
            return (Criteria) this;
        }

        public Criteria andFdStartWorkdateNotEqualTo(String value) {
            addCriterion("FD_START_WORKDATE <>", value, "fdStartWorkdate");
            return (Criteria) this;
        }

        public Criteria andFdStartWorkdateGreaterThan(String value) {
            addCriterion("FD_START_WORKDATE >", value, "fdStartWorkdate");
            return (Criteria) this;
        }

        public Criteria andFdStartWorkdateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_START_WORKDATE >=", value, "fdStartWorkdate");
            return (Criteria) this;
        }

        public Criteria andFdStartWorkdateLessThan(String value) {
            addCriterion("FD_START_WORKDATE <", value, "fdStartWorkdate");
            return (Criteria) this;
        }

        public Criteria andFdStartWorkdateLessThanOrEqualTo(String value) {
            addCriterion("FD_START_WORKDATE <=", value, "fdStartWorkdate");
            return (Criteria) this;
        }

        public Criteria andFdStartWorkdateLike(String value) {
            addCriterion("FD_START_WORKDATE like", value, "fdStartWorkdate");
            return (Criteria) this;
        }

        public Criteria andFdStartWorkdateNotLike(String value) {
            addCriterion("FD_START_WORKDATE not like", value, "fdStartWorkdate");
            return (Criteria) this;
        }

        public Criteria andFdStartWorkdateIn(List<String> values) {
            addCriterion("FD_START_WORKDATE in", values, "fdStartWorkdate");
            return (Criteria) this;
        }

        public Criteria andFdStartWorkdateNotIn(List<String> values) {
            addCriterion("FD_START_WORKDATE not in", values, "fdStartWorkdate");
            return (Criteria) this;
        }

        public Criteria andFdStartWorkdateBetween(String value1, String value2) {
            addCriterion("FD_START_WORKDATE between", value1, value2, "fdStartWorkdate");
            return (Criteria) this;
        }

        public Criteria andFdStartWorkdateNotBetween(String value1, String value2) {
            addCriterion("FD_START_WORKDATE not between", value1, value2, "fdStartWorkdate");
            return (Criteria) this;
        }

        public Criteria andFdNationIsNull() {
            addCriterion("FD_NATION is null");
            return (Criteria) this;
        }

        public Criteria andFdNationIsNotNull() {
            addCriterion("FD_NATION is not null");
            return (Criteria) this;
        }

        public Criteria andFdNationEqualTo(String value) {
            addCriterion("FD_NATION =", value, "fdNation");
            return (Criteria) this;
        }

        public Criteria andFdNationNotEqualTo(String value) {
            addCriterion("FD_NATION <>", value, "fdNation");
            return (Criteria) this;
        }

        public Criteria andFdNationGreaterThan(String value) {
            addCriterion("FD_NATION >", value, "fdNation");
            return (Criteria) this;
        }

        public Criteria andFdNationGreaterThanOrEqualTo(String value) {
            addCriterion("FD_NATION >=", value, "fdNation");
            return (Criteria) this;
        }

        public Criteria andFdNationLessThan(String value) {
            addCriterion("FD_NATION <", value, "fdNation");
            return (Criteria) this;
        }

        public Criteria andFdNationLessThanOrEqualTo(String value) {
            addCriterion("FD_NATION <=", value, "fdNation");
            return (Criteria) this;
        }

        public Criteria andFdNationLike(String value) {
            addCriterion("FD_NATION like", value, "fdNation");
            return (Criteria) this;
        }

        public Criteria andFdNationNotLike(String value) {
            addCriterion("FD_NATION not like", value, "fdNation");
            return (Criteria) this;
        }

        public Criteria andFdNationIn(List<String> values) {
            addCriterion("FD_NATION in", values, "fdNation");
            return (Criteria) this;
        }

        public Criteria andFdNationNotIn(List<String> values) {
            addCriterion("FD_NATION not in", values, "fdNation");
            return (Criteria) this;
        }

        public Criteria andFdNationBetween(String value1, String value2) {
            addCriterion("FD_NATION between", value1, value2, "fdNation");
            return (Criteria) this;
        }

        public Criteria andFdNationNotBetween(String value1, String value2) {
            addCriterion("FD_NATION not between", value1, value2, "fdNation");
            return (Criteria) this;
        }

        public Criteria andFdEntryModeIsNull() {
            addCriterion("FD_ENTRY_MODE is null");
            return (Criteria) this;
        }

        public Criteria andFdEntryModeIsNotNull() {
            addCriterion("FD_ENTRY_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andFdEntryModeEqualTo(String value) {
            addCriterion("FD_ENTRY_MODE =", value, "fdEntryMode");
            return (Criteria) this;
        }

        public Criteria andFdEntryModeNotEqualTo(String value) {
            addCriterion("FD_ENTRY_MODE <>", value, "fdEntryMode");
            return (Criteria) this;
        }

        public Criteria andFdEntryModeGreaterThan(String value) {
            addCriterion("FD_ENTRY_MODE >", value, "fdEntryMode");
            return (Criteria) this;
        }

        public Criteria andFdEntryModeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ENTRY_MODE >=", value, "fdEntryMode");
            return (Criteria) this;
        }

        public Criteria andFdEntryModeLessThan(String value) {
            addCriterion("FD_ENTRY_MODE <", value, "fdEntryMode");
            return (Criteria) this;
        }

        public Criteria andFdEntryModeLessThanOrEqualTo(String value) {
            addCriterion("FD_ENTRY_MODE <=", value, "fdEntryMode");
            return (Criteria) this;
        }

        public Criteria andFdEntryModeLike(String value) {
            addCriterion("FD_ENTRY_MODE like", value, "fdEntryMode");
            return (Criteria) this;
        }

        public Criteria andFdEntryModeNotLike(String value) {
            addCriterion("FD_ENTRY_MODE not like", value, "fdEntryMode");
            return (Criteria) this;
        }

        public Criteria andFdEntryModeIn(List<String> values) {
            addCriterion("FD_ENTRY_MODE in", values, "fdEntryMode");
            return (Criteria) this;
        }

        public Criteria andFdEntryModeNotIn(List<String> values) {
            addCriterion("FD_ENTRY_MODE not in", values, "fdEntryMode");
            return (Criteria) this;
        }

        public Criteria andFdEntryModeBetween(String value1, String value2) {
            addCriterion("FD_ENTRY_MODE between", value1, value2, "fdEntryMode");
            return (Criteria) this;
        }

        public Criteria andFdEntryModeNotBetween(String value1, String value2) {
            addCriterion("FD_ENTRY_MODE not between", value1, value2, "fdEntryMode");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalStatusIsNull() {
            addCriterion("FD_POLITICAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalStatusIsNotNull() {
            addCriterion("FD_POLITICAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalStatusEqualTo(String value) {
            addCriterion("FD_POLITICAL_STATUS =", value, "fdPoliticalStatus");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalStatusNotEqualTo(String value) {
            addCriterion("FD_POLITICAL_STATUS <>", value, "fdPoliticalStatus");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalStatusGreaterThan(String value) {
            addCriterion("FD_POLITICAL_STATUS >", value, "fdPoliticalStatus");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FD_POLITICAL_STATUS >=", value, "fdPoliticalStatus");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalStatusLessThan(String value) {
            addCriterion("FD_POLITICAL_STATUS <", value, "fdPoliticalStatus");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalStatusLessThanOrEqualTo(String value) {
            addCriterion("FD_POLITICAL_STATUS <=", value, "fdPoliticalStatus");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalStatusLike(String value) {
            addCriterion("FD_POLITICAL_STATUS like", value, "fdPoliticalStatus");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalStatusNotLike(String value) {
            addCriterion("FD_POLITICAL_STATUS not like", value, "fdPoliticalStatus");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalStatusIn(List<String> values) {
            addCriterion("FD_POLITICAL_STATUS in", values, "fdPoliticalStatus");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalStatusNotIn(List<String> values) {
            addCriterion("FD_POLITICAL_STATUS not in", values, "fdPoliticalStatus");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalStatusBetween(String value1, String value2) {
            addCriterion("FD_POLITICAL_STATUS between", value1, value2, "fdPoliticalStatus");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalStatusNotBetween(String value1, String value2) {
            addCriterion("FD_POLITICAL_STATUS not between", value1, value2, "fdPoliticalStatus");
            return (Criteria) this;
        }

        public Criteria andFdHighEduIsNull() {
            addCriterion("FD_HIGH_EDU is null");
            return (Criteria) this;
        }

        public Criteria andFdHighEduIsNotNull() {
            addCriterion("FD_HIGH_EDU is not null");
            return (Criteria) this;
        }

        public Criteria andFdHighEduEqualTo(String value) {
            addCriterion("FD_HIGH_EDU =", value, "fdHighEdu");
            return (Criteria) this;
        }

        public Criteria andFdHighEduNotEqualTo(String value) {
            addCriterion("FD_HIGH_EDU <>", value, "fdHighEdu");
            return (Criteria) this;
        }

        public Criteria andFdHighEduGreaterThan(String value) {
            addCriterion("FD_HIGH_EDU >", value, "fdHighEdu");
            return (Criteria) this;
        }

        public Criteria andFdHighEduGreaterThanOrEqualTo(String value) {
            addCriterion("FD_HIGH_EDU >=", value, "fdHighEdu");
            return (Criteria) this;
        }

        public Criteria andFdHighEduLessThan(String value) {
            addCriterion("FD_HIGH_EDU <", value, "fdHighEdu");
            return (Criteria) this;
        }

        public Criteria andFdHighEduLessThanOrEqualTo(String value) {
            addCriterion("FD_HIGH_EDU <=", value, "fdHighEdu");
            return (Criteria) this;
        }

        public Criteria andFdHighEduLike(String value) {
            addCriterion("FD_HIGH_EDU like", value, "fdHighEdu");
            return (Criteria) this;
        }

        public Criteria andFdHighEduNotLike(String value) {
            addCriterion("FD_HIGH_EDU not like", value, "fdHighEdu");
            return (Criteria) this;
        }

        public Criteria andFdHighEduIn(List<String> values) {
            addCriterion("FD_HIGH_EDU in", values, "fdHighEdu");
            return (Criteria) this;
        }

        public Criteria andFdHighEduNotIn(List<String> values) {
            addCriterion("FD_HIGH_EDU not in", values, "fdHighEdu");
            return (Criteria) this;
        }

        public Criteria andFdHighEduBetween(String value1, String value2) {
            addCriterion("FD_HIGH_EDU between", value1, value2, "fdHighEdu");
            return (Criteria) this;
        }

        public Criteria andFdHighEduNotBetween(String value1, String value2) {
            addCriterion("FD_HIGH_EDU not between", value1, value2, "fdHighEdu");
            return (Criteria) this;
        }

        public Criteria andFdHighDegreeIsNull() {
            addCriterion("FD_HIGH_DEGREE is null");
            return (Criteria) this;
        }

        public Criteria andFdHighDegreeIsNotNull() {
            addCriterion("FD_HIGH_DEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andFdHighDegreeEqualTo(String value) {
            addCriterion("FD_HIGH_DEGREE =", value, "fdHighDegree");
            return (Criteria) this;
        }

        public Criteria andFdHighDegreeNotEqualTo(String value) {
            addCriterion("FD_HIGH_DEGREE <>", value, "fdHighDegree");
            return (Criteria) this;
        }

        public Criteria andFdHighDegreeGreaterThan(String value) {
            addCriterion("FD_HIGH_DEGREE >", value, "fdHighDegree");
            return (Criteria) this;
        }

        public Criteria andFdHighDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_HIGH_DEGREE >=", value, "fdHighDegree");
            return (Criteria) this;
        }

        public Criteria andFdHighDegreeLessThan(String value) {
            addCriterion("FD_HIGH_DEGREE <", value, "fdHighDegree");
            return (Criteria) this;
        }

        public Criteria andFdHighDegreeLessThanOrEqualTo(String value) {
            addCriterion("FD_HIGH_DEGREE <=", value, "fdHighDegree");
            return (Criteria) this;
        }

        public Criteria andFdHighDegreeLike(String value) {
            addCriterion("FD_HIGH_DEGREE like", value, "fdHighDegree");
            return (Criteria) this;
        }

        public Criteria andFdHighDegreeNotLike(String value) {
            addCriterion("FD_HIGH_DEGREE not like", value, "fdHighDegree");
            return (Criteria) this;
        }

        public Criteria andFdHighDegreeIn(List<String> values) {
            addCriterion("FD_HIGH_DEGREE in", values, "fdHighDegree");
            return (Criteria) this;
        }

        public Criteria andFdHighDegreeNotIn(List<String> values) {
            addCriterion("FD_HIGH_DEGREE not in", values, "fdHighDegree");
            return (Criteria) this;
        }

        public Criteria andFdHighDegreeBetween(String value1, String value2) {
            addCriterion("FD_HIGH_DEGREE between", value1, value2, "fdHighDegree");
            return (Criteria) this;
        }

        public Criteria andFdHighDegreeNotBetween(String value1, String value2) {
            addCriterion("FD_HIGH_DEGREE not between", value1, value2, "fdHighDegree");
            return (Criteria) this;
        }

        public Criteria andFdParentunitSystemnoIsNull() {
            addCriterion("FD_PARENTUNIT_SYSTEMNO is null");
            return (Criteria) this;
        }

        public Criteria andFdParentunitSystemnoIsNotNull() {
            addCriterion("FD_PARENTUNIT_SYSTEMNO is not null");
            return (Criteria) this;
        }

        public Criteria andFdParentunitSystemnoEqualTo(String value) {
            addCriterion("FD_PARENTUNIT_SYSTEMNO =", value, "fdParentunitSystemno");
            return (Criteria) this;
        }

        public Criteria andFdParentunitSystemnoNotEqualTo(String value) {
            addCriterion("FD_PARENTUNIT_SYSTEMNO <>", value, "fdParentunitSystemno");
            return (Criteria) this;
        }

        public Criteria andFdParentunitSystemnoGreaterThan(String value) {
            addCriterion("FD_PARENTUNIT_SYSTEMNO >", value, "fdParentunitSystemno");
            return (Criteria) this;
        }

        public Criteria andFdParentunitSystemnoGreaterThanOrEqualTo(String value) {
            addCriterion("FD_PARENTUNIT_SYSTEMNO >=", value, "fdParentunitSystemno");
            return (Criteria) this;
        }

        public Criteria andFdParentunitSystemnoLessThan(String value) {
            addCriterion("FD_PARENTUNIT_SYSTEMNO <", value, "fdParentunitSystemno");
            return (Criteria) this;
        }

        public Criteria andFdParentunitSystemnoLessThanOrEqualTo(String value) {
            addCriterion("FD_PARENTUNIT_SYSTEMNO <=", value, "fdParentunitSystemno");
            return (Criteria) this;
        }

        public Criteria andFdParentunitSystemnoLike(String value) {
            addCriterion("FD_PARENTUNIT_SYSTEMNO like", value, "fdParentunitSystemno");
            return (Criteria) this;
        }

        public Criteria andFdParentunitSystemnoNotLike(String value) {
            addCriterion("FD_PARENTUNIT_SYSTEMNO not like", value, "fdParentunitSystemno");
            return (Criteria) this;
        }

        public Criteria andFdParentunitSystemnoIn(List<String> values) {
            addCriterion("FD_PARENTUNIT_SYSTEMNO in", values, "fdParentunitSystemno");
            return (Criteria) this;
        }

        public Criteria andFdParentunitSystemnoNotIn(List<String> values) {
            addCriterion("FD_PARENTUNIT_SYSTEMNO not in", values, "fdParentunitSystemno");
            return (Criteria) this;
        }

        public Criteria andFdParentunitSystemnoBetween(String value1, String value2) {
            addCriterion("FD_PARENTUNIT_SYSTEMNO between", value1, value2, "fdParentunitSystemno");
            return (Criteria) this;
        }

        public Criteria andFdParentunitSystemnoNotBetween(String value1, String value2) {
            addCriterion("FD_PARENTUNIT_SYSTEMNO not between", value1, value2, "fdParentunitSystemno");
            return (Criteria) this;
        }

        public Criteria andFdParentOrgIsNull() {
            addCriterion("FD_PARENT_ORG is null");
            return (Criteria) this;
        }

        public Criteria andFdParentOrgIsNotNull() {
            addCriterion("FD_PARENT_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andFdParentOrgEqualTo(String value) {
            addCriterion("FD_PARENT_ORG =", value, "fdParentOrg");
            return (Criteria) this;
        }

        public Criteria andFdParentOrgNotEqualTo(String value) {
            addCriterion("FD_PARENT_ORG <>", value, "fdParentOrg");
            return (Criteria) this;
        }

        public Criteria andFdParentOrgGreaterThan(String value) {
            addCriterion("FD_PARENT_ORG >", value, "fdParentOrg");
            return (Criteria) this;
        }

        public Criteria andFdParentOrgGreaterThanOrEqualTo(String value) {
            addCriterion("FD_PARENT_ORG >=", value, "fdParentOrg");
            return (Criteria) this;
        }

        public Criteria andFdParentOrgLessThan(String value) {
            addCriterion("FD_PARENT_ORG <", value, "fdParentOrg");
            return (Criteria) this;
        }

        public Criteria andFdParentOrgLessThanOrEqualTo(String value) {
            addCriterion("FD_PARENT_ORG <=", value, "fdParentOrg");
            return (Criteria) this;
        }

        public Criteria andFdParentOrgLike(String value) {
            addCriterion("FD_PARENT_ORG like", value, "fdParentOrg");
            return (Criteria) this;
        }

        public Criteria andFdParentOrgNotLike(String value) {
            addCriterion("FD_PARENT_ORG not like", value, "fdParentOrg");
            return (Criteria) this;
        }

        public Criteria andFdParentOrgIn(List<String> values) {
            addCriterion("FD_PARENT_ORG in", values, "fdParentOrg");
            return (Criteria) this;
        }

        public Criteria andFdParentOrgNotIn(List<String> values) {
            addCriterion("FD_PARENT_ORG not in", values, "fdParentOrg");
            return (Criteria) this;
        }

        public Criteria andFdParentOrgBetween(String value1, String value2) {
            addCriterion("FD_PARENT_ORG between", value1, value2, "fdParentOrg");
            return (Criteria) this;
        }

        public Criteria andFdParentOrgNotBetween(String value1, String value2) {
            addCriterion("FD_PARENT_ORG not between", value1, value2, "fdParentOrg");
            return (Criteria) this;
        }

        public Criteria andFdFactUnitIsNull() {
            addCriterion("FD_FACT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andFdFactUnitIsNotNull() {
            addCriterion("FD_FACT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andFdFactUnitEqualTo(String value) {
            addCriterion("FD_FACT_UNIT =", value, "fdFactUnit");
            return (Criteria) this;
        }

        public Criteria andFdFactUnitNotEqualTo(String value) {
            addCriterion("FD_FACT_UNIT <>", value, "fdFactUnit");
            return (Criteria) this;
        }

        public Criteria andFdFactUnitGreaterThan(String value) {
            addCriterion("FD_FACT_UNIT >", value, "fdFactUnit");
            return (Criteria) this;
        }

        public Criteria andFdFactUnitGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FACT_UNIT >=", value, "fdFactUnit");
            return (Criteria) this;
        }

        public Criteria andFdFactUnitLessThan(String value) {
            addCriterion("FD_FACT_UNIT <", value, "fdFactUnit");
            return (Criteria) this;
        }

        public Criteria andFdFactUnitLessThanOrEqualTo(String value) {
            addCriterion("FD_FACT_UNIT <=", value, "fdFactUnit");
            return (Criteria) this;
        }

        public Criteria andFdFactUnitLike(String value) {
            addCriterion("FD_FACT_UNIT like", value, "fdFactUnit");
            return (Criteria) this;
        }

        public Criteria andFdFactUnitNotLike(String value) {
            addCriterion("FD_FACT_UNIT not like", value, "fdFactUnit");
            return (Criteria) this;
        }

        public Criteria andFdFactUnitIn(List<String> values) {
            addCriterion("FD_FACT_UNIT in", values, "fdFactUnit");
            return (Criteria) this;
        }

        public Criteria andFdFactUnitNotIn(List<String> values) {
            addCriterion("FD_FACT_UNIT not in", values, "fdFactUnit");
            return (Criteria) this;
        }

        public Criteria andFdFactUnitBetween(String value1, String value2) {
            addCriterion("FD_FACT_UNIT between", value1, value2, "fdFactUnit");
            return (Criteria) this;
        }

        public Criteria andFdFactUnitNotBetween(String value1, String value2) {
            addCriterion("FD_FACT_UNIT not between", value1, value2, "fdFactUnit");
            return (Criteria) this;
        }

        public Criteria andFdJobcodeIsNull() {
            addCriterion("FD_JOBCODE is null");
            return (Criteria) this;
        }

        public Criteria andFdJobcodeIsNotNull() {
            addCriterion("FD_JOBCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFdJobcodeEqualTo(String value) {
            addCriterion("FD_JOBCODE =", value, "fdJobcode");
            return (Criteria) this;
        }

        public Criteria andFdJobcodeNotEqualTo(String value) {
            addCriterion("FD_JOBCODE <>", value, "fdJobcode");
            return (Criteria) this;
        }

        public Criteria andFdJobcodeGreaterThan(String value) {
            addCriterion("FD_JOBCODE >", value, "fdJobcode");
            return (Criteria) this;
        }

        public Criteria andFdJobcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_JOBCODE >=", value, "fdJobcode");
            return (Criteria) this;
        }

        public Criteria andFdJobcodeLessThan(String value) {
            addCriterion("FD_JOBCODE <", value, "fdJobcode");
            return (Criteria) this;
        }

        public Criteria andFdJobcodeLessThanOrEqualTo(String value) {
            addCriterion("FD_JOBCODE <=", value, "fdJobcode");
            return (Criteria) this;
        }

        public Criteria andFdJobcodeLike(String value) {
            addCriterion("FD_JOBCODE like", value, "fdJobcode");
            return (Criteria) this;
        }

        public Criteria andFdJobcodeNotLike(String value) {
            addCriterion("FD_JOBCODE not like", value, "fdJobcode");
            return (Criteria) this;
        }

        public Criteria andFdJobcodeIn(List<String> values) {
            addCriterion("FD_JOBCODE in", values, "fdJobcode");
            return (Criteria) this;
        }

        public Criteria andFdJobcodeNotIn(List<String> values) {
            addCriterion("FD_JOBCODE not in", values, "fdJobcode");
            return (Criteria) this;
        }

        public Criteria andFdJobcodeBetween(String value1, String value2) {
            addCriterion("FD_JOBCODE between", value1, value2, "fdJobcode");
            return (Criteria) this;
        }

        public Criteria andFdJobcodeNotBetween(String value1, String value2) {
            addCriterion("FD_JOBCODE not between", value1, value2, "fdJobcode");
            return (Criteria) this;
        }

        public Criteria andFdNativePlaceIsNull() {
            addCriterion("FD_NATIVE_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andFdNativePlaceIsNotNull() {
            addCriterion("FD_NATIVE_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andFdNativePlaceEqualTo(String value) {
            addCriterion("FD_NATIVE_PLACE =", value, "fdNativePlace");
            return (Criteria) this;
        }

        public Criteria andFdNativePlaceNotEqualTo(String value) {
            addCriterion("FD_NATIVE_PLACE <>", value, "fdNativePlace");
            return (Criteria) this;
        }

        public Criteria andFdNativePlaceGreaterThan(String value) {
            addCriterion("FD_NATIVE_PLACE >", value, "fdNativePlace");
            return (Criteria) this;
        }

        public Criteria andFdNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("FD_NATIVE_PLACE >=", value, "fdNativePlace");
            return (Criteria) this;
        }

        public Criteria andFdNativePlaceLessThan(String value) {
            addCriterion("FD_NATIVE_PLACE <", value, "fdNativePlace");
            return (Criteria) this;
        }

        public Criteria andFdNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("FD_NATIVE_PLACE <=", value, "fdNativePlace");
            return (Criteria) this;
        }

        public Criteria andFdNativePlaceLike(String value) {
            addCriterion("FD_NATIVE_PLACE like", value, "fdNativePlace");
            return (Criteria) this;
        }

        public Criteria andFdNativePlaceNotLike(String value) {
            addCriterion("FD_NATIVE_PLACE not like", value, "fdNativePlace");
            return (Criteria) this;
        }

        public Criteria andFdNativePlaceIn(List<String> values) {
            addCriterion("FD_NATIVE_PLACE in", values, "fdNativePlace");
            return (Criteria) this;
        }

        public Criteria andFdNativePlaceNotIn(List<String> values) {
            addCriterion("FD_NATIVE_PLACE not in", values, "fdNativePlace");
            return (Criteria) this;
        }

        public Criteria andFdNativePlaceBetween(String value1, String value2) {
            addCriterion("FD_NATIVE_PLACE between", value1, value2, "fdNativePlace");
            return (Criteria) this;
        }

        public Criteria andFdNativePlaceNotBetween(String value1, String value2) {
            addCriterion("FD_NATIVE_PLACE not between", value1, value2, "fdNativePlace");
            return (Criteria) this;
        }

        public Criteria andFdBirthPlaceIsNull() {
            addCriterion("FD_BIRTH_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andFdBirthPlaceIsNotNull() {
            addCriterion("FD_BIRTH_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andFdBirthPlaceEqualTo(String value) {
            addCriterion("FD_BIRTH_PLACE =", value, "fdBirthPlace");
            return (Criteria) this;
        }

        public Criteria andFdBirthPlaceNotEqualTo(String value) {
            addCriterion("FD_BIRTH_PLACE <>", value, "fdBirthPlace");
            return (Criteria) this;
        }

        public Criteria andFdBirthPlaceGreaterThan(String value) {
            addCriterion("FD_BIRTH_PLACE >", value, "fdBirthPlace");
            return (Criteria) this;
        }

        public Criteria andFdBirthPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("FD_BIRTH_PLACE >=", value, "fdBirthPlace");
            return (Criteria) this;
        }

        public Criteria andFdBirthPlaceLessThan(String value) {
            addCriterion("FD_BIRTH_PLACE <", value, "fdBirthPlace");
            return (Criteria) this;
        }

        public Criteria andFdBirthPlaceLessThanOrEqualTo(String value) {
            addCriterion("FD_BIRTH_PLACE <=", value, "fdBirthPlace");
            return (Criteria) this;
        }

        public Criteria andFdBirthPlaceLike(String value) {
            addCriterion("FD_BIRTH_PLACE like", value, "fdBirthPlace");
            return (Criteria) this;
        }

        public Criteria andFdBirthPlaceNotLike(String value) {
            addCriterion("FD_BIRTH_PLACE not like", value, "fdBirthPlace");
            return (Criteria) this;
        }

        public Criteria andFdBirthPlaceIn(List<String> values) {
            addCriterion("FD_BIRTH_PLACE in", values, "fdBirthPlace");
            return (Criteria) this;
        }

        public Criteria andFdBirthPlaceNotIn(List<String> values) {
            addCriterion("FD_BIRTH_PLACE not in", values, "fdBirthPlace");
            return (Criteria) this;
        }

        public Criteria andFdBirthPlaceBetween(String value1, String value2) {
            addCriterion("FD_BIRTH_PLACE between", value1, value2, "fdBirthPlace");
            return (Criteria) this;
        }

        public Criteria andFdBirthPlaceNotBetween(String value1, String value2) {
            addCriterion("FD_BIRTH_PLACE not between", value1, value2, "fdBirthPlace");
            return (Criteria) this;
        }

        public Criteria andFdDomicilePlaceIsNull() {
            addCriterion("FD_DOMICILE_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andFdDomicilePlaceIsNotNull() {
            addCriterion("FD_DOMICILE_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andFdDomicilePlaceEqualTo(String value) {
            addCriterion("FD_DOMICILE_PLACE =", value, "fdDomicilePlace");
            return (Criteria) this;
        }

        public Criteria andFdDomicilePlaceNotEqualTo(String value) {
            addCriterion("FD_DOMICILE_PLACE <>", value, "fdDomicilePlace");
            return (Criteria) this;
        }

        public Criteria andFdDomicilePlaceGreaterThan(String value) {
            addCriterion("FD_DOMICILE_PLACE >", value, "fdDomicilePlace");
            return (Criteria) this;
        }

        public Criteria andFdDomicilePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("FD_DOMICILE_PLACE >=", value, "fdDomicilePlace");
            return (Criteria) this;
        }

        public Criteria andFdDomicilePlaceLessThan(String value) {
            addCriterion("FD_DOMICILE_PLACE <", value, "fdDomicilePlace");
            return (Criteria) this;
        }

        public Criteria andFdDomicilePlaceLessThanOrEqualTo(String value) {
            addCriterion("FD_DOMICILE_PLACE <=", value, "fdDomicilePlace");
            return (Criteria) this;
        }

        public Criteria andFdDomicilePlaceLike(String value) {
            addCriterion("FD_DOMICILE_PLACE like", value, "fdDomicilePlace");
            return (Criteria) this;
        }

        public Criteria andFdDomicilePlaceNotLike(String value) {
            addCriterion("FD_DOMICILE_PLACE not like", value, "fdDomicilePlace");
            return (Criteria) this;
        }

        public Criteria andFdDomicilePlaceIn(List<String> values) {
            addCriterion("FD_DOMICILE_PLACE in", values, "fdDomicilePlace");
            return (Criteria) this;
        }

        public Criteria andFdDomicilePlaceNotIn(List<String> values) {
            addCriterion("FD_DOMICILE_PLACE not in", values, "fdDomicilePlace");
            return (Criteria) this;
        }

        public Criteria andFdDomicilePlaceBetween(String value1, String value2) {
            addCriterion("FD_DOMICILE_PLACE between", value1, value2, "fdDomicilePlace");
            return (Criteria) this;
        }

        public Criteria andFdDomicilePlaceNotBetween(String value1, String value2) {
            addCriterion("FD_DOMICILE_PLACE not between", value1, value2, "fdDomicilePlace");
            return (Criteria) this;
        }

        public Criteria andFdLeaderidIsNull() {
            addCriterion("FD_LEADERID is null");
            return (Criteria) this;
        }

        public Criteria andFdLeaderidIsNotNull() {
            addCriterion("FD_LEADERID is not null");
            return (Criteria) this;
        }

        public Criteria andFdLeaderidEqualTo(String value) {
            addCriterion("FD_LEADERID =", value, "fdLeaderid");
            return (Criteria) this;
        }

        public Criteria andFdLeaderidNotEqualTo(String value) {
            addCriterion("FD_LEADERID <>", value, "fdLeaderid");
            return (Criteria) this;
        }

        public Criteria andFdLeaderidGreaterThan(String value) {
            addCriterion("FD_LEADERID >", value, "fdLeaderid");
            return (Criteria) this;
        }

        public Criteria andFdLeaderidGreaterThanOrEqualTo(String value) {
            addCriterion("FD_LEADERID >=", value, "fdLeaderid");
            return (Criteria) this;
        }

        public Criteria andFdLeaderidLessThan(String value) {
            addCriterion("FD_LEADERID <", value, "fdLeaderid");
            return (Criteria) this;
        }

        public Criteria andFdLeaderidLessThanOrEqualTo(String value) {
            addCriterion("FD_LEADERID <=", value, "fdLeaderid");
            return (Criteria) this;
        }

        public Criteria andFdLeaderidLike(String value) {
            addCriterion("FD_LEADERID like", value, "fdLeaderid");
            return (Criteria) this;
        }

        public Criteria andFdLeaderidNotLike(String value) {
            addCriterion("FD_LEADERID not like", value, "fdLeaderid");
            return (Criteria) this;
        }

        public Criteria andFdLeaderidIn(List<String> values) {
            addCriterion("FD_LEADERID in", values, "fdLeaderid");
            return (Criteria) this;
        }

        public Criteria andFdLeaderidNotIn(List<String> values) {
            addCriterion("FD_LEADERID not in", values, "fdLeaderid");
            return (Criteria) this;
        }

        public Criteria andFdLeaderidBetween(String value1, String value2) {
            addCriterion("FD_LEADERID between", value1, value2, "fdLeaderid");
            return (Criteria) this;
        }

        public Criteria andFdLeaderidNotBetween(String value1, String value2) {
            addCriterion("FD_LEADERID not between", value1, value2, "fdLeaderid");
            return (Criteria) this;
        }

        public Criteria andFdLeadernmeIsNull() {
            addCriterion("FD_LEADERNME is null");
            return (Criteria) this;
        }

        public Criteria andFdLeadernmeIsNotNull() {
            addCriterion("FD_LEADERNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdLeadernmeEqualTo(String value) {
            addCriterion("FD_LEADERNME =", value, "fdLeadernme");
            return (Criteria) this;
        }

        public Criteria andFdLeadernmeNotEqualTo(String value) {
            addCriterion("FD_LEADERNME <>", value, "fdLeadernme");
            return (Criteria) this;
        }

        public Criteria andFdLeadernmeGreaterThan(String value) {
            addCriterion("FD_LEADERNME >", value, "fdLeadernme");
            return (Criteria) this;
        }

        public Criteria andFdLeadernmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_LEADERNME >=", value, "fdLeadernme");
            return (Criteria) this;
        }

        public Criteria andFdLeadernmeLessThan(String value) {
            addCriterion("FD_LEADERNME <", value, "fdLeadernme");
            return (Criteria) this;
        }

        public Criteria andFdLeadernmeLessThanOrEqualTo(String value) {
            addCriterion("FD_LEADERNME <=", value, "fdLeadernme");
            return (Criteria) this;
        }

        public Criteria andFdLeadernmeLike(String value) {
            addCriterion("FD_LEADERNME like", value, "fdLeadernme");
            return (Criteria) this;
        }

        public Criteria andFdLeadernmeNotLike(String value) {
            addCriterion("FD_LEADERNME not like", value, "fdLeadernme");
            return (Criteria) this;
        }

        public Criteria andFdLeadernmeIn(List<String> values) {
            addCriterion("FD_LEADERNME in", values, "fdLeadernme");
            return (Criteria) this;
        }

        public Criteria andFdLeadernmeNotIn(List<String> values) {
            addCriterion("FD_LEADERNME not in", values, "fdLeadernme");
            return (Criteria) this;
        }

        public Criteria andFdLeadernmeBetween(String value1, String value2) {
            addCriterion("FD_LEADERNME between", value1, value2, "fdLeadernme");
            return (Criteria) this;
        }

        public Criteria andFdLeadernmeNotBetween(String value1, String value2) {
            addCriterion("FD_LEADERNME not between", value1, value2, "fdLeadernme");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgIsNull() {
            addCriterion("FD_DEPT_ORG is null");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgIsNotNull() {
            addCriterion("FD_DEPT_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgEqualTo(String value) {
            addCriterion("FD_DEPT_ORG =", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgNotEqualTo(String value) {
            addCriterion("FD_DEPT_ORG <>", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgGreaterThan(String value) {
            addCriterion("FD_DEPT_ORG >", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgGreaterThanOrEqualTo(String value) {
            addCriterion("FD_DEPT_ORG >=", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgLessThan(String value) {
            addCriterion("FD_DEPT_ORG <", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgLessThanOrEqualTo(String value) {
            addCriterion("FD_DEPT_ORG <=", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgLike(String value) {
            addCriterion("FD_DEPT_ORG like", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgNotLike(String value) {
            addCriterion("FD_DEPT_ORG not like", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgIn(List<String> values) {
            addCriterion("FD_DEPT_ORG in", values, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgNotIn(List<String> values) {
            addCriterion("FD_DEPT_ORG not in", values, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgBetween(String value1, String value2) {
            addCriterion("FD_DEPT_ORG between", value1, value2, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgNotBetween(String value1, String value2) {
            addCriterion("FD_DEPT_ORG not between", value1, value2, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdCredNumIsNull() {
            addCriterion("FD_CRED_NUM is null");
            return (Criteria) this;
        }

        public Criteria andFdCredNumIsNotNull() {
            addCriterion("FD_CRED_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFdCredNumEqualTo(String value) {
            addCriterion("FD_CRED_NUM =", value, "fdCredNum");
            return (Criteria) this;
        }

        public Criteria andFdCredNumNotEqualTo(String value) {
            addCriterion("FD_CRED_NUM <>", value, "fdCredNum");
            return (Criteria) this;
        }

        public Criteria andFdCredNumGreaterThan(String value) {
            addCriterion("FD_CRED_NUM >", value, "fdCredNum");
            return (Criteria) this;
        }

        public Criteria andFdCredNumGreaterThanOrEqualTo(String value) {
            addCriterion("FD_CRED_NUM >=", value, "fdCredNum");
            return (Criteria) this;
        }

        public Criteria andFdCredNumLessThan(String value) {
            addCriterion("FD_CRED_NUM <", value, "fdCredNum");
            return (Criteria) this;
        }

        public Criteria andFdCredNumLessThanOrEqualTo(String value) {
            addCriterion("FD_CRED_NUM <=", value, "fdCredNum");
            return (Criteria) this;
        }

        public Criteria andFdCredNumLike(String value) {
            addCriterion("FD_CRED_NUM like", value, "fdCredNum");
            return (Criteria) this;
        }

        public Criteria andFdCredNumNotLike(String value) {
            addCriterion("FD_CRED_NUM not like", value, "fdCredNum");
            return (Criteria) this;
        }

        public Criteria andFdCredNumIn(List<String> values) {
            addCriterion("FD_CRED_NUM in", values, "fdCredNum");
            return (Criteria) this;
        }

        public Criteria andFdCredNumNotIn(List<String> values) {
            addCriterion("FD_CRED_NUM not in", values, "fdCredNum");
            return (Criteria) this;
        }

        public Criteria andFdCredNumBetween(String value1, String value2) {
            addCriterion("FD_CRED_NUM between", value1, value2, "fdCredNum");
            return (Criteria) this;
        }

        public Criteria andFdCredNumNotBetween(String value1, String value2) {
            addCriterion("FD_CRED_NUM not between", value1, value2, "fdCredNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}