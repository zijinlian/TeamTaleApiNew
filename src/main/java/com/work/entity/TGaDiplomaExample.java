package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TGaDiplomaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGaDiplomaExample() {
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

        public Criteria andDiplomanameIsNull() {
            addCriterion("DIPLOMANAME is null");
            return (Criteria) this;
        }

        public Criteria andDiplomanameIsNotNull() {
            addCriterion("DIPLOMANAME is not null");
            return (Criteria) this;
        }

        public Criteria andDiplomanameEqualTo(String value) {
            addCriterion("DIPLOMANAME =", value, "diplomaname");
            return (Criteria) this;
        }

        public Criteria andDiplomanameNotEqualTo(String value) {
            addCriterion("DIPLOMANAME <>", value, "diplomaname");
            return (Criteria) this;
        }

        public Criteria andDiplomanameGreaterThan(String value) {
            addCriterion("DIPLOMANAME >", value, "diplomaname");
            return (Criteria) this;
        }

        public Criteria andDiplomanameGreaterThanOrEqualTo(String value) {
            addCriterion("DIPLOMANAME >=", value, "diplomaname");
            return (Criteria) this;
        }

        public Criteria andDiplomanameLessThan(String value) {
            addCriterion("DIPLOMANAME <", value, "diplomaname");
            return (Criteria) this;
        }

        public Criteria andDiplomanameLessThanOrEqualTo(String value) {
            addCriterion("DIPLOMANAME <=", value, "diplomaname");
            return (Criteria) this;
        }

        public Criteria andDiplomanameLike(String value) {
            addCriterion("DIPLOMANAME like", value, "diplomaname");
            return (Criteria) this;
        }

        public Criteria andDiplomanameNotLike(String value) {
            addCriterion("DIPLOMANAME not like", value, "diplomaname");
            return (Criteria) this;
        }

        public Criteria andDiplomanameIn(List<String> values) {
            addCriterion("DIPLOMANAME in", values, "diplomaname");
            return (Criteria) this;
        }

        public Criteria andDiplomanameNotIn(List<String> values) {
            addCriterion("DIPLOMANAME not in", values, "diplomaname");
            return (Criteria) this;
        }

        public Criteria andDiplomanameBetween(String value1, String value2) {
            addCriterion("DIPLOMANAME between", value1, value2, "diplomaname");
            return (Criteria) this;
        }

        public Criteria andDiplomanameNotBetween(String value1, String value2) {
            addCriterion("DIPLOMANAME not between", value1, value2, "diplomaname");
            return (Criteria) this;
        }

        public Criteria andDiplomasourceIsNull() {
            addCriterion("DIPLOMASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andDiplomasourceIsNotNull() {
            addCriterion("DIPLOMASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andDiplomasourceEqualTo(String value) {
            addCriterion("DIPLOMASOURCE =", value, "diplomasource");
            return (Criteria) this;
        }

        public Criteria andDiplomasourceNotEqualTo(String value) {
            addCriterion("DIPLOMASOURCE <>", value, "diplomasource");
            return (Criteria) this;
        }

        public Criteria andDiplomasourceGreaterThan(String value) {
            addCriterion("DIPLOMASOURCE >", value, "diplomasource");
            return (Criteria) this;
        }

        public Criteria andDiplomasourceGreaterThanOrEqualTo(String value) {
            addCriterion("DIPLOMASOURCE >=", value, "diplomasource");
            return (Criteria) this;
        }

        public Criteria andDiplomasourceLessThan(String value) {
            addCriterion("DIPLOMASOURCE <", value, "diplomasource");
            return (Criteria) this;
        }

        public Criteria andDiplomasourceLessThanOrEqualTo(String value) {
            addCriterion("DIPLOMASOURCE <=", value, "diplomasource");
            return (Criteria) this;
        }

        public Criteria andDiplomasourceLike(String value) {
            addCriterion("DIPLOMASOURCE like", value, "diplomasource");
            return (Criteria) this;
        }

        public Criteria andDiplomasourceNotLike(String value) {
            addCriterion("DIPLOMASOURCE not like", value, "diplomasource");
            return (Criteria) this;
        }

        public Criteria andDiplomasourceIn(List<String> values) {
            addCriterion("DIPLOMASOURCE in", values, "diplomasource");
            return (Criteria) this;
        }

        public Criteria andDiplomasourceNotIn(List<String> values) {
            addCriterion("DIPLOMASOURCE not in", values, "diplomasource");
            return (Criteria) this;
        }

        public Criteria andDiplomasourceBetween(String value1, String value2) {
            addCriterion("DIPLOMASOURCE between", value1, value2, "diplomasource");
            return (Criteria) this;
        }

        public Criteria andDiplomasourceNotBetween(String value1, String value2) {
            addCriterion("DIPLOMASOURCE not between", value1, value2, "diplomasource");
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

        public Criteria andDiplomascoreIsNull() {
            addCriterion("DIPLOMASCORE is null");
            return (Criteria) this;
        }

        public Criteria andDiplomascoreIsNotNull() {
            addCriterion("DIPLOMASCORE is not null");
            return (Criteria) this;
        }

        public Criteria andDiplomascoreEqualTo(String value) {
            addCriterion("DIPLOMASCORE =", value, "diplomascore");
            return (Criteria) this;
        }

        public Criteria andDiplomascoreNotEqualTo(String value) {
            addCriterion("DIPLOMASCORE <>", value, "diplomascore");
            return (Criteria) this;
        }

        public Criteria andDiplomascoreGreaterThan(String value) {
            addCriterion("DIPLOMASCORE >", value, "diplomascore");
            return (Criteria) this;
        }

        public Criteria andDiplomascoreGreaterThanOrEqualTo(String value) {
            addCriterion("DIPLOMASCORE >=", value, "diplomascore");
            return (Criteria) this;
        }

        public Criteria andDiplomascoreLessThan(String value) {
            addCriterion("DIPLOMASCORE <", value, "diplomascore");
            return (Criteria) this;
        }

        public Criteria andDiplomascoreLessThanOrEqualTo(String value) {
            addCriterion("DIPLOMASCORE <=", value, "diplomascore");
            return (Criteria) this;
        }

        public Criteria andDiplomascoreLike(String value) {
            addCriterion("DIPLOMASCORE like", value, "diplomascore");
            return (Criteria) this;
        }

        public Criteria andDiplomascoreNotLike(String value) {
            addCriterion("DIPLOMASCORE not like", value, "diplomascore");
            return (Criteria) this;
        }

        public Criteria andDiplomascoreIn(List<String> values) {
            addCriterion("DIPLOMASCORE in", values, "diplomascore");
            return (Criteria) this;
        }

        public Criteria andDiplomascoreNotIn(List<String> values) {
            addCriterion("DIPLOMASCORE not in", values, "diplomascore");
            return (Criteria) this;
        }

        public Criteria andDiplomascoreBetween(String value1, String value2) {
            addCriterion("DIPLOMASCORE between", value1, value2, "diplomascore");
            return (Criteria) this;
        }

        public Criteria andDiplomascoreNotBetween(String value1, String value2) {
            addCriterion("DIPLOMASCORE not between", value1, value2, "diplomascore");
            return (Criteria) this;
        }

        public Criteria andGetdateIsNull() {
            addCriterion("GETDATE is null");
            return (Criteria) this;
        }

        public Criteria andGetdateIsNotNull() {
            addCriterion("GETDATE is not null");
            return (Criteria) this;
        }

        public Criteria andGetdateEqualTo(String value) {
            addCriterion("GETDATE =", value, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateNotEqualTo(String value) {
            addCriterion("GETDATE <>", value, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateGreaterThan(String value) {
            addCriterion("GETDATE >", value, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateGreaterThanOrEqualTo(String value) {
            addCriterion("GETDATE >=", value, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateLessThan(String value) {
            addCriterion("GETDATE <", value, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateLessThanOrEqualTo(String value) {
            addCriterion("GETDATE <=", value, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateLike(String value) {
            addCriterion("GETDATE like", value, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateNotLike(String value) {
            addCriterion("GETDATE not like", value, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateIn(List<String> values) {
            addCriterion("GETDATE in", values, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateNotIn(List<String> values) {
            addCriterion("GETDATE not in", values, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateBetween(String value1, String value2) {
            addCriterion("GETDATE between", value1, value2, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateNotBetween(String value1, String value2) {
            addCriterion("GETDATE not between", value1, value2, "getdate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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