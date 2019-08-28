package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TGaResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGaResumeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNull() {
            addCriterion("EMPID is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(String value) {
            addCriterion("EMPID =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(String value) {
            addCriterion("EMPID <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(String value) {
            addCriterion("EMPID >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("EMPID >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(String value) {
            addCriterion("EMPID <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(String value) {
            addCriterion("EMPID <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLike(String value) {
            addCriterion("EMPID like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotLike(String value) {
            addCriterion("EMPID not like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<String> values) {
            addCriterion("EMPID in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<String> values) {
            addCriterion("EMPID not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(String value1, String value2) {
            addCriterion("EMPID between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(String value1, String value2) {
            addCriterion("EMPID not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNull() {
            addCriterion("EMPNAME is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("EMPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("EMPNAME =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("EMPNAME <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("EMPNAME >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPNAME >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("EMPNAME <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("EMPNAME <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("EMPNAME like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("EMPNAME not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("EMPNAME in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("EMPNAME not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("EMPNAME between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("EMPNAME not between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andGroupnamenowIsNull() {
            addCriterion("GROUPNAMENOW is null");
            return (Criteria) this;
        }

        public Criteria andGroupnamenowIsNotNull() {
            addCriterion("GROUPNAMENOW is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnamenowEqualTo(String value) {
            addCriterion("GROUPNAMENOW =", value, "groupnamenow");
            return (Criteria) this;
        }

        public Criteria andGroupnamenowNotEqualTo(String value) {
            addCriterion("GROUPNAMENOW <>", value, "groupnamenow");
            return (Criteria) this;
        }

        public Criteria andGroupnamenowGreaterThan(String value) {
            addCriterion("GROUPNAMENOW >", value, "groupnamenow");
            return (Criteria) this;
        }

        public Criteria andGroupnamenowGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPNAMENOW >=", value, "groupnamenow");
            return (Criteria) this;
        }

        public Criteria andGroupnamenowLessThan(String value) {
            addCriterion("GROUPNAMENOW <", value, "groupnamenow");
            return (Criteria) this;
        }

        public Criteria andGroupnamenowLessThanOrEqualTo(String value) {
            addCriterion("GROUPNAMENOW <=", value, "groupnamenow");
            return (Criteria) this;
        }

        public Criteria andGroupnamenowLike(String value) {
            addCriterion("GROUPNAMENOW like", value, "groupnamenow");
            return (Criteria) this;
        }

        public Criteria andGroupnamenowNotLike(String value) {
            addCriterion("GROUPNAMENOW not like", value, "groupnamenow");
            return (Criteria) this;
        }

        public Criteria andGroupnamenowIn(List<String> values) {
            addCriterion("GROUPNAMENOW in", values, "groupnamenow");
            return (Criteria) this;
        }

        public Criteria andGroupnamenowNotIn(List<String> values) {
            addCriterion("GROUPNAMENOW not in", values, "groupnamenow");
            return (Criteria) this;
        }

        public Criteria andGroupnamenowBetween(String value1, String value2) {
            addCriterion("GROUPNAMENOW between", value1, value2, "groupnamenow");
            return (Criteria) this;
        }

        public Criteria andGroupnamenowNotBetween(String value1, String value2) {
            addCriterion("GROUPNAMENOW not between", value1, value2, "groupnamenow");
            return (Criteria) this;
        }

        public Criteria andJobnamenowIsNull() {
            addCriterion("JOBNAMENOW is null");
            return (Criteria) this;
        }

        public Criteria andJobnamenowIsNotNull() {
            addCriterion("JOBNAMENOW is not null");
            return (Criteria) this;
        }

        public Criteria andJobnamenowEqualTo(String value) {
            addCriterion("JOBNAMENOW =", value, "jobnamenow");
            return (Criteria) this;
        }

        public Criteria andJobnamenowNotEqualTo(String value) {
            addCriterion("JOBNAMENOW <>", value, "jobnamenow");
            return (Criteria) this;
        }

        public Criteria andJobnamenowGreaterThan(String value) {
            addCriterion("JOBNAMENOW >", value, "jobnamenow");
            return (Criteria) this;
        }

        public Criteria andJobnamenowGreaterThanOrEqualTo(String value) {
            addCriterion("JOBNAMENOW >=", value, "jobnamenow");
            return (Criteria) this;
        }

        public Criteria andJobnamenowLessThan(String value) {
            addCriterion("JOBNAMENOW <", value, "jobnamenow");
            return (Criteria) this;
        }

        public Criteria andJobnamenowLessThanOrEqualTo(String value) {
            addCriterion("JOBNAMENOW <=", value, "jobnamenow");
            return (Criteria) this;
        }

        public Criteria andJobnamenowLike(String value) {
            addCriterion("JOBNAMENOW like", value, "jobnamenow");
            return (Criteria) this;
        }

        public Criteria andJobnamenowNotLike(String value) {
            addCriterion("JOBNAMENOW not like", value, "jobnamenow");
            return (Criteria) this;
        }

        public Criteria andJobnamenowIn(List<String> values) {
            addCriterion("JOBNAMENOW in", values, "jobnamenow");
            return (Criteria) this;
        }

        public Criteria andJobnamenowNotIn(List<String> values) {
            addCriterion("JOBNAMENOW not in", values, "jobnamenow");
            return (Criteria) this;
        }

        public Criteria andJobnamenowBetween(String value1, String value2) {
            addCriterion("JOBNAMENOW between", value1, value2, "jobnamenow");
            return (Criteria) this;
        }

        public Criteria andJobnamenowNotBetween(String value1, String value2) {
            addCriterion("JOBNAMENOW not between", value1, value2, "jobnamenow");
            return (Criteria) this;
        }

        public Criteria andEmpstatusIsNull() {
            addCriterion("EMPSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andEmpstatusIsNotNull() {
            addCriterion("EMPSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEmpstatusEqualTo(String value) {
            addCriterion("EMPSTATUS =", value, "empstatus");
            return (Criteria) this;
        }

        public Criteria andEmpstatusNotEqualTo(String value) {
            addCriterion("EMPSTATUS <>", value, "empstatus");
            return (Criteria) this;
        }

        public Criteria andEmpstatusGreaterThan(String value) {
            addCriterion("EMPSTATUS >", value, "empstatus");
            return (Criteria) this;
        }

        public Criteria andEmpstatusGreaterThanOrEqualTo(String value) {
            addCriterion("EMPSTATUS >=", value, "empstatus");
            return (Criteria) this;
        }

        public Criteria andEmpstatusLessThan(String value) {
            addCriterion("EMPSTATUS <", value, "empstatus");
            return (Criteria) this;
        }

        public Criteria andEmpstatusLessThanOrEqualTo(String value) {
            addCriterion("EMPSTATUS <=", value, "empstatus");
            return (Criteria) this;
        }

        public Criteria andEmpstatusLike(String value) {
            addCriterion("EMPSTATUS like", value, "empstatus");
            return (Criteria) this;
        }

        public Criteria andEmpstatusNotLike(String value) {
            addCriterion("EMPSTATUS not like", value, "empstatus");
            return (Criteria) this;
        }

        public Criteria andEmpstatusIn(List<String> values) {
            addCriterion("EMPSTATUS in", values, "empstatus");
            return (Criteria) this;
        }

        public Criteria andEmpstatusNotIn(List<String> values) {
            addCriterion("EMPSTATUS not in", values, "empstatus");
            return (Criteria) this;
        }

        public Criteria andEmpstatusBetween(String value1, String value2) {
            addCriterion("EMPSTATUS between", value1, value2, "empstatus");
            return (Criteria) this;
        }

        public Criteria andEmpstatusNotBetween(String value1, String value2) {
            addCriterion("EMPSTATUS not between", value1, value2, "empstatus");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("ENDDATE like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("ENDDATE not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("ENDDATE not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(String value) {
            addCriterion("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(String value) {
            addCriterion("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(String value) {
            addCriterion("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(String value) {
            addCriterion("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(String value) {
            addCriterion("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLike(String value) {
            addCriterion("STARTDATE like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotLike(String value) {
            addCriterion("STARTDATE not like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<String> values) {
            addCriterion("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<String> values) {
            addCriterion("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(String value1, String value2) {
            addCriterion("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(String value1, String value2) {
            addCriterion("STARTDATE not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNull() {
            addCriterion("GROUPNAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("GROUPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("GROUPNAME =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("GROUPNAME <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("GROUPNAME >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPNAME >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("GROUPNAME <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("GROUPNAME <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("GROUPNAME like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("GROUPNAME not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("GROUPNAME in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("GROUPNAME not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("GROUPNAME between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("GROUPNAME not between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNull() {
            addCriterion("JOBNAME is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("JOBNAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("JOBNAME =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("JOBNAME <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("JOBNAME >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("JOBNAME >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("JOBNAME <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("JOBNAME <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("JOBNAME like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("JOBNAME not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("JOBNAME in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("JOBNAME not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("JOBNAME between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("JOBNAME not between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andInputtypeIsNull() {
            addCriterion("INPUTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andInputtypeIsNotNull() {
            addCriterion("INPUTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInputtypeEqualTo(String value) {
            addCriterion("INPUTTYPE =", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotEqualTo(String value) {
            addCriterion("INPUTTYPE <>", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeGreaterThan(String value) {
            addCriterion("INPUTTYPE >", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTTYPE >=", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeLessThan(String value) {
            addCriterion("INPUTTYPE <", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeLessThanOrEqualTo(String value) {
            addCriterion("INPUTTYPE <=", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeLike(String value) {
            addCriterion("INPUTTYPE like", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotLike(String value) {
            addCriterion("INPUTTYPE not like", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeIn(List<String> values) {
            addCriterion("INPUTTYPE in", values, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotIn(List<String> values) {
            addCriterion("INPUTTYPE not in", values, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeBetween(String value1, String value2) {
            addCriterion("INPUTTYPE between", value1, value2, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotBetween(String value1, String value2) {
            addCriterion("INPUTTYPE not between", value1, value2, "inputtype");
            return (Criteria) this;
        }

        public Criteria andReferenceIsNull() {
            addCriterion("REFERENCE is null");
            return (Criteria) this;
        }

        public Criteria andReferenceIsNotNull() {
            addCriterion("REFERENCE is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceEqualTo(String value) {
            addCriterion("REFERENCE =", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotEqualTo(String value) {
            addCriterion("REFERENCE <>", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceGreaterThan(String value) {
            addCriterion("REFERENCE >", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceGreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE >=", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLessThan(String value) {
            addCriterion("REFERENCE <", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLessThanOrEqualTo(String value) {
            addCriterion("REFERENCE <=", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLike(String value) {
            addCriterion("REFERENCE like", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotLike(String value) {
            addCriterion("REFERENCE not like", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceIn(List<String> values) {
            addCriterion("REFERENCE in", values, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotIn(List<String> values) {
            addCriterion("REFERENCE not in", values, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceBetween(String value1, String value2) {
            addCriterion("REFERENCE between", value1, value2, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotBetween(String value1, String value2) {
            addCriterion("REFERENCE not between", value1, value2, "reference");
            return (Criteria) this;
        }

        public Criteria andGlobalorderIsNull() {
            addCriterion("GLOBALORDER is null");
            return (Criteria) this;
        }

        public Criteria andGlobalorderIsNotNull() {
            addCriterion("GLOBALORDER is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalorderEqualTo(String value) {
            addCriterion("GLOBALORDER =", value, "globalorder");
            return (Criteria) this;
        }

        public Criteria andGlobalorderNotEqualTo(String value) {
            addCriterion("GLOBALORDER <>", value, "globalorder");
            return (Criteria) this;
        }

        public Criteria andGlobalorderGreaterThan(String value) {
            addCriterion("GLOBALORDER >", value, "globalorder");
            return (Criteria) this;
        }

        public Criteria andGlobalorderGreaterThanOrEqualTo(String value) {
            addCriterion("GLOBALORDER >=", value, "globalorder");
            return (Criteria) this;
        }

        public Criteria andGlobalorderLessThan(String value) {
            addCriterion("GLOBALORDER <", value, "globalorder");
            return (Criteria) this;
        }

        public Criteria andGlobalorderLessThanOrEqualTo(String value) {
            addCriterion("GLOBALORDER <=", value, "globalorder");
            return (Criteria) this;
        }

        public Criteria andGlobalorderLike(String value) {
            addCriterion("GLOBALORDER like", value, "globalorder");
            return (Criteria) this;
        }

        public Criteria andGlobalorderNotLike(String value) {
            addCriterion("GLOBALORDER not like", value, "globalorder");
            return (Criteria) this;
        }

        public Criteria andGlobalorderIn(List<String> values) {
            addCriterion("GLOBALORDER in", values, "globalorder");
            return (Criteria) this;
        }

        public Criteria andGlobalorderNotIn(List<String> values) {
            addCriterion("GLOBALORDER not in", values, "globalorder");
            return (Criteria) this;
        }

        public Criteria andGlobalorderBetween(String value1, String value2) {
            addCriterion("GLOBALORDER between", value1, value2, "globalorder");
            return (Criteria) this;
        }

        public Criteria andGlobalorderNotBetween(String value1, String value2) {
            addCriterion("GLOBALORDER not between", value1, value2, "globalorder");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNull() {
            addCriterion("INPUTDATE is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("INPUTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(String value) {
            addCriterion("INPUTDATE =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(String value) {
            addCriterion("INPUTDATE <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(String value) {
            addCriterion("INPUTDATE >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTDATE >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(String value) {
            addCriterion("INPUTDATE <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(String value) {
            addCriterion("INPUTDATE <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLike(String value) {
            addCriterion("INPUTDATE like", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotLike(String value) {
            addCriterion("INPUTDATE not like", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<String> values) {
            addCriterion("INPUTDATE in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<String> values) {
            addCriterion("INPUTDATE not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(String value1, String value2) {
            addCriterion("INPUTDATE between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(String value1, String value2) {
            addCriterion("INPUTDATE not between", value1, value2, "inputdate");
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