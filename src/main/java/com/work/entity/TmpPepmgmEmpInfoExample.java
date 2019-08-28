package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TmpPepmgmEmpInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TmpPepmgmEmpInfoExample() {
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

        public Criteria andFdEmpBirthIsNull() {
            addCriterion("FD_EMP_BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andFdEmpBirthIsNotNull() {
            addCriterion("FD_EMP_BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andFdEmpBirthEqualTo(String value) {
            addCriterion("FD_EMP_BIRTH =", value, "fdEmpBirth");
            return (Criteria) this;
        }

        public Criteria andFdEmpBirthNotEqualTo(String value) {
            addCriterion("FD_EMP_BIRTH <>", value, "fdEmpBirth");
            return (Criteria) this;
        }

        public Criteria andFdEmpBirthGreaterThan(String value) {
            addCriterion("FD_EMP_BIRTH >", value, "fdEmpBirth");
            return (Criteria) this;
        }

        public Criteria andFdEmpBirthGreaterThanOrEqualTo(String value) {
            addCriterion("FD_EMP_BIRTH >=", value, "fdEmpBirth");
            return (Criteria) this;
        }

        public Criteria andFdEmpBirthLessThan(String value) {
            addCriterion("FD_EMP_BIRTH <", value, "fdEmpBirth");
            return (Criteria) this;
        }

        public Criteria andFdEmpBirthLessThanOrEqualTo(String value) {
            addCriterion("FD_EMP_BIRTH <=", value, "fdEmpBirth");
            return (Criteria) this;
        }

        public Criteria andFdEmpBirthLike(String value) {
            addCriterion("FD_EMP_BIRTH like", value, "fdEmpBirth");
            return (Criteria) this;
        }

        public Criteria andFdEmpBirthNotLike(String value) {
            addCriterion("FD_EMP_BIRTH not like", value, "fdEmpBirth");
            return (Criteria) this;
        }

        public Criteria andFdEmpBirthIn(List<String> values) {
            addCriterion("FD_EMP_BIRTH in", values, "fdEmpBirth");
            return (Criteria) this;
        }

        public Criteria andFdEmpBirthNotIn(List<String> values) {
            addCriterion("FD_EMP_BIRTH not in", values, "fdEmpBirth");
            return (Criteria) this;
        }

        public Criteria andFdEmpBirthBetween(String value1, String value2) {
            addCriterion("FD_EMP_BIRTH between", value1, value2, "fdEmpBirth");
            return (Criteria) this;
        }

        public Criteria andFdEmpBirthNotBetween(String value1, String value2) {
            addCriterion("FD_EMP_BIRTH not between", value1, value2, "fdEmpBirth");
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

        public Criteria andFdRhqglIsNull() {
            addCriterion("FD_RHQGL is null");
            return (Criteria) this;
        }

        public Criteria andFdRhqglIsNotNull() {
            addCriterion("FD_RHQGL is not null");
            return (Criteria) this;
        }

        public Criteria andFdRhqglEqualTo(String value) {
            addCriterion("FD_RHQGL =", value, "fdRhqgl");
            return (Criteria) this;
        }

        public Criteria andFdRhqglNotEqualTo(String value) {
            addCriterion("FD_RHQGL <>", value, "fdRhqgl");
            return (Criteria) this;
        }

        public Criteria andFdRhqglGreaterThan(String value) {
            addCriterion("FD_RHQGL >", value, "fdRhqgl");
            return (Criteria) this;
        }

        public Criteria andFdRhqglGreaterThanOrEqualTo(String value) {
            addCriterion("FD_RHQGL >=", value, "fdRhqgl");
            return (Criteria) this;
        }

        public Criteria andFdRhqglLessThan(String value) {
            addCriterion("FD_RHQGL <", value, "fdRhqgl");
            return (Criteria) this;
        }

        public Criteria andFdRhqglLessThanOrEqualTo(String value) {
            addCriterion("FD_RHQGL <=", value, "fdRhqgl");
            return (Criteria) this;
        }

        public Criteria andFdRhqglLike(String value) {
            addCriterion("FD_RHQGL like", value, "fdRhqgl");
            return (Criteria) this;
        }

        public Criteria andFdRhqglNotLike(String value) {
            addCriterion("FD_RHQGL not like", value, "fdRhqgl");
            return (Criteria) this;
        }

        public Criteria andFdRhqglIn(List<String> values) {
            addCriterion("FD_RHQGL in", values, "fdRhqgl");
            return (Criteria) this;
        }

        public Criteria andFdRhqglNotIn(List<String> values) {
            addCriterion("FD_RHQGL not in", values, "fdRhqgl");
            return (Criteria) this;
        }

        public Criteria andFdRhqglBetween(String value1, String value2) {
            addCriterion("FD_RHQGL between", value1, value2, "fdRhqgl");
            return (Criteria) this;
        }

        public Criteria andFdRhqglNotBetween(String value1, String value2) {
            addCriterion("FD_RHQGL not between", value1, value2, "fdRhqgl");
            return (Criteria) this;
        }

        public Criteria andFdJrdqjgsjIsNull() {
            addCriterion("FD_JRDQJGSJ is null");
            return (Criteria) this;
        }

        public Criteria andFdJrdqjgsjIsNotNull() {
            addCriterion("FD_JRDQJGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFdJrdqjgsjEqualTo(String value) {
            addCriterion("FD_JRDQJGSJ =", value, "fdJrdqjgsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqjgsjNotEqualTo(String value) {
            addCriterion("FD_JRDQJGSJ <>", value, "fdJrdqjgsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqjgsjGreaterThan(String value) {
            addCriterion("FD_JRDQJGSJ >", value, "fdJrdqjgsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqjgsjGreaterThanOrEqualTo(String value) {
            addCriterion("FD_JRDQJGSJ >=", value, "fdJrdqjgsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqjgsjLessThan(String value) {
            addCriterion("FD_JRDQJGSJ <", value, "fdJrdqjgsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqjgsjLessThanOrEqualTo(String value) {
            addCriterion("FD_JRDQJGSJ <=", value, "fdJrdqjgsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqjgsjLike(String value) {
            addCriterion("FD_JRDQJGSJ like", value, "fdJrdqjgsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqjgsjNotLike(String value) {
            addCriterion("FD_JRDQJGSJ not like", value, "fdJrdqjgsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqjgsjIn(List<String> values) {
            addCriterion("FD_JRDQJGSJ in", values, "fdJrdqjgsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqjgsjNotIn(List<String> values) {
            addCriterion("FD_JRDQJGSJ not in", values, "fdJrdqjgsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqjgsjBetween(String value1, String value2) {
            addCriterion("FD_JRDQJGSJ between", value1, value2, "fdJrdqjgsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqjgsjNotBetween(String value1, String value2) {
            addCriterion("FD_JRDQJGSJ not between", value1, value2, "fdJrdqjgsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqyjjghzhsjIsNull() {
            addCriterion("FD_JRDQYJJGHZHSJ is null");
            return (Criteria) this;
        }

        public Criteria andFdJrdqyjjghzhsjIsNotNull() {
            addCriterion("FD_JRDQYJJGHZHSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFdJrdqyjjghzhsjEqualTo(String value) {
            addCriterion("FD_JRDQYJJGHZHSJ =", value, "fdJrdqyjjghzhsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqyjjghzhsjNotEqualTo(String value) {
            addCriterion("FD_JRDQYJJGHZHSJ <>", value, "fdJrdqyjjghzhsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqyjjghzhsjGreaterThan(String value) {
            addCriterion("FD_JRDQYJJGHZHSJ >", value, "fdJrdqyjjghzhsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqyjjghzhsjGreaterThanOrEqualTo(String value) {
            addCriterion("FD_JRDQYJJGHZHSJ >=", value, "fdJrdqyjjghzhsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqyjjghzhsjLessThan(String value) {
            addCriterion("FD_JRDQYJJGHZHSJ <", value, "fdJrdqyjjghzhsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqyjjghzhsjLessThanOrEqualTo(String value) {
            addCriterion("FD_JRDQYJJGHZHSJ <=", value, "fdJrdqyjjghzhsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqyjjghzhsjLike(String value) {
            addCriterion("FD_JRDQYJJGHZHSJ like", value, "fdJrdqyjjghzhsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqyjjghzhsjNotLike(String value) {
            addCriterion("FD_JRDQYJJGHZHSJ not like", value, "fdJrdqyjjghzhsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqyjjghzhsjIn(List<String> values) {
            addCriterion("FD_JRDQYJJGHZHSJ in", values, "fdJrdqyjjghzhsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqyjjghzhsjNotIn(List<String> values) {
            addCriterion("FD_JRDQYJJGHZHSJ not in", values, "fdJrdqyjjghzhsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqyjjghzhsjBetween(String value1, String value2) {
            addCriterion("FD_JRDQYJJGHZHSJ between", value1, value2, "fdJrdqyjjghzhsj");
            return (Criteria) this;
        }

        public Criteria andFdJrdqyjjghzhsjNotBetween(String value1, String value2) {
            addCriterion("FD_JRDQYJJGHZHSJ not between", value1, value2, "fdJrdqyjjghzhsj");
            return (Criteria) this;
        }

        public Criteria andFdOrgSysnumIsNull() {
            addCriterion("FD_ORG_SYSNUM is null");
            return (Criteria) this;
        }

        public Criteria andFdOrgSysnumIsNotNull() {
            addCriterion("FD_ORG_SYSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFdOrgSysnumEqualTo(String value) {
            addCriterion("FD_ORG_SYSNUM =", value, "fdOrgSysnum");
            return (Criteria) this;
        }

        public Criteria andFdOrgSysnumNotEqualTo(String value) {
            addCriterion("FD_ORG_SYSNUM <>", value, "fdOrgSysnum");
            return (Criteria) this;
        }

        public Criteria andFdOrgSysnumGreaterThan(String value) {
            addCriterion("FD_ORG_SYSNUM >", value, "fdOrgSysnum");
            return (Criteria) this;
        }

        public Criteria andFdOrgSysnumGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ORG_SYSNUM >=", value, "fdOrgSysnum");
            return (Criteria) this;
        }

        public Criteria andFdOrgSysnumLessThan(String value) {
            addCriterion("FD_ORG_SYSNUM <", value, "fdOrgSysnum");
            return (Criteria) this;
        }

        public Criteria andFdOrgSysnumLessThanOrEqualTo(String value) {
            addCriterion("FD_ORG_SYSNUM <=", value, "fdOrgSysnum");
            return (Criteria) this;
        }

        public Criteria andFdOrgSysnumLike(String value) {
            addCriterion("FD_ORG_SYSNUM like", value, "fdOrgSysnum");
            return (Criteria) this;
        }

        public Criteria andFdOrgSysnumNotLike(String value) {
            addCriterion("FD_ORG_SYSNUM not like", value, "fdOrgSysnum");
            return (Criteria) this;
        }

        public Criteria andFdOrgSysnumIn(List<String> values) {
            addCriterion("FD_ORG_SYSNUM in", values, "fdOrgSysnum");
            return (Criteria) this;
        }

        public Criteria andFdOrgSysnumNotIn(List<String> values) {
            addCriterion("FD_ORG_SYSNUM not in", values, "fdOrgSysnum");
            return (Criteria) this;
        }

        public Criteria andFdOrgSysnumBetween(String value1, String value2) {
            addCriterion("FD_ORG_SYSNUM between", value1, value2, "fdOrgSysnum");
            return (Criteria) this;
        }

        public Criteria andFdOrgSysnumNotBetween(String value1, String value2) {
            addCriterion("FD_ORG_SYSNUM not between", value1, value2, "fdOrgSysnum");
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

        public Criteria andFdUnitSysnumIsNull() {
            addCriterion("FD_UNIT_SYSNUM is null");
            return (Criteria) this;
        }

        public Criteria andFdUnitSysnumIsNotNull() {
            addCriterion("FD_UNIT_SYSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFdUnitSysnumEqualTo(String value) {
            addCriterion("FD_UNIT_SYSNUM =", value, "fdUnitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdUnitSysnumNotEqualTo(String value) {
            addCriterion("FD_UNIT_SYSNUM <>", value, "fdUnitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdUnitSysnumGreaterThan(String value) {
            addCriterion("FD_UNIT_SYSNUM >", value, "fdUnitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdUnitSysnumGreaterThanOrEqualTo(String value) {
            addCriterion("FD_UNIT_SYSNUM >=", value, "fdUnitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdUnitSysnumLessThan(String value) {
            addCriterion("FD_UNIT_SYSNUM <", value, "fdUnitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdUnitSysnumLessThanOrEqualTo(String value) {
            addCriterion("FD_UNIT_SYSNUM <=", value, "fdUnitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdUnitSysnumLike(String value) {
            addCriterion("FD_UNIT_SYSNUM like", value, "fdUnitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdUnitSysnumNotLike(String value) {
            addCriterion("FD_UNIT_SYSNUM not like", value, "fdUnitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdUnitSysnumIn(List<String> values) {
            addCriterion("FD_UNIT_SYSNUM in", values, "fdUnitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdUnitSysnumNotIn(List<String> values) {
            addCriterion("FD_UNIT_SYSNUM not in", values, "fdUnitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdUnitSysnumBetween(String value1, String value2) {
            addCriterion("FD_UNIT_SYSNUM between", value1, value2, "fdUnitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdUnitSysnumNotBetween(String value1, String value2) {
            addCriterion("FD_UNIT_SYSNUM not between", value1, value2, "fdUnitSysnum");
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

        public Criteria andFdOrgEngnmeIsNull() {
            addCriterion("FD_ORG_ENGNME is null");
            return (Criteria) this;
        }

        public Criteria andFdOrgEngnmeIsNotNull() {
            addCriterion("FD_ORG_ENGNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdOrgEngnmeEqualTo(String value) {
            addCriterion("FD_ORG_ENGNME =", value, "fdOrgEngnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgEngnmeNotEqualTo(String value) {
            addCriterion("FD_ORG_ENGNME <>", value, "fdOrgEngnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgEngnmeGreaterThan(String value) {
            addCriterion("FD_ORG_ENGNME >", value, "fdOrgEngnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgEngnmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ORG_ENGNME >=", value, "fdOrgEngnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgEngnmeLessThan(String value) {
            addCriterion("FD_ORG_ENGNME <", value, "fdOrgEngnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgEngnmeLessThanOrEqualTo(String value) {
            addCriterion("FD_ORG_ENGNME <=", value, "fdOrgEngnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgEngnmeLike(String value) {
            addCriterion("FD_ORG_ENGNME like", value, "fdOrgEngnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgEngnmeNotLike(String value) {
            addCriterion("FD_ORG_ENGNME not like", value, "fdOrgEngnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgEngnmeIn(List<String> values) {
            addCriterion("FD_ORG_ENGNME in", values, "fdOrgEngnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgEngnmeNotIn(List<String> values) {
            addCriterion("FD_ORG_ENGNME not in", values, "fdOrgEngnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgEngnmeBetween(String value1, String value2) {
            addCriterion("FD_ORG_ENGNME between", value1, value2, "fdOrgEngnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgEngnmeNotBetween(String value1, String value2) {
            addCriterion("FD_ORG_ENGNME not between", value1, value2, "fdOrgEngnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitnmeIsNull() {
            addCriterion("FD_FACTUNITNME is null");
            return (Criteria) this;
        }

        public Criteria andFdFactunitnmeIsNotNull() {
            addCriterion("FD_FACTUNITNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdFactunitnmeEqualTo(String value) {
            addCriterion("FD_FACTUNITNME =", value, "fdFactunitnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitnmeNotEqualTo(String value) {
            addCriterion("FD_FACTUNITNME <>", value, "fdFactunitnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitnmeGreaterThan(String value) {
            addCriterion("FD_FACTUNITNME >", value, "fdFactunitnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitnmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FACTUNITNME >=", value, "fdFactunitnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitnmeLessThan(String value) {
            addCriterion("FD_FACTUNITNME <", value, "fdFactunitnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitnmeLessThanOrEqualTo(String value) {
            addCriterion("FD_FACTUNITNME <=", value, "fdFactunitnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitnmeLike(String value) {
            addCriterion("FD_FACTUNITNME like", value, "fdFactunitnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitnmeNotLike(String value) {
            addCriterion("FD_FACTUNITNME not like", value, "fdFactunitnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitnmeIn(List<String> values) {
            addCriterion("FD_FACTUNITNME in", values, "fdFactunitnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitnmeNotIn(List<String> values) {
            addCriterion("FD_FACTUNITNME not in", values, "fdFactunitnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitnmeBetween(String value1, String value2) {
            addCriterion("FD_FACTUNITNME between", value1, value2, "fdFactunitnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitnmeNotBetween(String value1, String value2) {
            addCriterion("FD_FACTUNITNME not between", value1, value2, "fdFactunitnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitEngnmeIsNull() {
            addCriterion("FD_UNIT_ENGNME is null");
            return (Criteria) this;
        }

        public Criteria andFdUnitEngnmeIsNotNull() {
            addCriterion("FD_UNIT_ENGNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdUnitEngnmeEqualTo(String value) {
            addCriterion("FD_UNIT_ENGNME =", value, "fdUnitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitEngnmeNotEqualTo(String value) {
            addCriterion("FD_UNIT_ENGNME <>", value, "fdUnitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitEngnmeGreaterThan(String value) {
            addCriterion("FD_UNIT_ENGNME >", value, "fdUnitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitEngnmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_UNIT_ENGNME >=", value, "fdUnitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitEngnmeLessThan(String value) {
            addCriterion("FD_UNIT_ENGNME <", value, "fdUnitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitEngnmeLessThanOrEqualTo(String value) {
            addCriterion("FD_UNIT_ENGNME <=", value, "fdUnitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitEngnmeLike(String value) {
            addCriterion("FD_UNIT_ENGNME like", value, "fdUnitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitEngnmeNotLike(String value) {
            addCriterion("FD_UNIT_ENGNME not like", value, "fdUnitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitEngnmeIn(List<String> values) {
            addCriterion("FD_UNIT_ENGNME in", values, "fdUnitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitEngnmeNotIn(List<String> values) {
            addCriterion("FD_UNIT_ENGNME not in", values, "fdUnitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitEngnmeBetween(String value1, String value2) {
            addCriterion("FD_UNIT_ENGNME between", value1, value2, "fdUnitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdUnitEngnmeNotBetween(String value1, String value2) {
            addCriterion("FD_UNIT_ENGNME not between", value1, value2, "fdUnitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitSysnumIsNull() {
            addCriterion("FD_FACTUNIT_SYSNUM is null");
            return (Criteria) this;
        }

        public Criteria andFdFactunitSysnumIsNotNull() {
            addCriterion("FD_FACTUNIT_SYSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFdFactunitSysnumEqualTo(String value) {
            addCriterion("FD_FACTUNIT_SYSNUM =", value, "fdFactunitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdFactunitSysnumNotEqualTo(String value) {
            addCriterion("FD_FACTUNIT_SYSNUM <>", value, "fdFactunitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdFactunitSysnumGreaterThan(String value) {
            addCriterion("FD_FACTUNIT_SYSNUM >", value, "fdFactunitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdFactunitSysnumGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FACTUNIT_SYSNUM >=", value, "fdFactunitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdFactunitSysnumLessThan(String value) {
            addCriterion("FD_FACTUNIT_SYSNUM <", value, "fdFactunitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdFactunitSysnumLessThanOrEqualTo(String value) {
            addCriterion("FD_FACTUNIT_SYSNUM <=", value, "fdFactunitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdFactunitSysnumLike(String value) {
            addCriterion("FD_FACTUNIT_SYSNUM like", value, "fdFactunitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdFactunitSysnumNotLike(String value) {
            addCriterion("FD_FACTUNIT_SYSNUM not like", value, "fdFactunitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdFactunitSysnumIn(List<String> values) {
            addCriterion("FD_FACTUNIT_SYSNUM in", values, "fdFactunitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdFactunitSysnumNotIn(List<String> values) {
            addCriterion("FD_FACTUNIT_SYSNUM not in", values, "fdFactunitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdFactunitSysnumBetween(String value1, String value2) {
            addCriterion("FD_FACTUNIT_SYSNUM between", value1, value2, "fdFactunitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdFactunitSysnumNotBetween(String value1, String value2) {
            addCriterion("FD_FACTUNIT_SYSNUM not between", value1, value2, "fdFactunitSysnum");
            return (Criteria) this;
        }

        public Criteria andFdFactunitcdeIsNull() {
            addCriterion("FD_FACTUNITCDE is null");
            return (Criteria) this;
        }

        public Criteria andFdFactunitcdeIsNotNull() {
            addCriterion("FD_FACTUNITCDE is not null");
            return (Criteria) this;
        }

        public Criteria andFdFactunitcdeEqualTo(String value) {
            addCriterion("FD_FACTUNITCDE =", value, "fdFactunitcde");
            return (Criteria) this;
        }

        public Criteria andFdFactunitcdeNotEqualTo(String value) {
            addCriterion("FD_FACTUNITCDE <>", value, "fdFactunitcde");
            return (Criteria) this;
        }

        public Criteria andFdFactunitcdeGreaterThan(String value) {
            addCriterion("FD_FACTUNITCDE >", value, "fdFactunitcde");
            return (Criteria) this;
        }

        public Criteria andFdFactunitcdeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FACTUNITCDE >=", value, "fdFactunitcde");
            return (Criteria) this;
        }

        public Criteria andFdFactunitcdeLessThan(String value) {
            addCriterion("FD_FACTUNITCDE <", value, "fdFactunitcde");
            return (Criteria) this;
        }

        public Criteria andFdFactunitcdeLessThanOrEqualTo(String value) {
            addCriterion("FD_FACTUNITCDE <=", value, "fdFactunitcde");
            return (Criteria) this;
        }

        public Criteria andFdFactunitcdeLike(String value) {
            addCriterion("FD_FACTUNITCDE like", value, "fdFactunitcde");
            return (Criteria) this;
        }

        public Criteria andFdFactunitcdeNotLike(String value) {
            addCriterion("FD_FACTUNITCDE not like", value, "fdFactunitcde");
            return (Criteria) this;
        }

        public Criteria andFdFactunitcdeIn(List<String> values) {
            addCriterion("FD_FACTUNITCDE in", values, "fdFactunitcde");
            return (Criteria) this;
        }

        public Criteria andFdFactunitcdeNotIn(List<String> values) {
            addCriterion("FD_FACTUNITCDE not in", values, "fdFactunitcde");
            return (Criteria) this;
        }

        public Criteria andFdFactunitcdeBetween(String value1, String value2) {
            addCriterion("FD_FACTUNITCDE between", value1, value2, "fdFactunitcde");
            return (Criteria) this;
        }

        public Criteria andFdFactunitcdeNotBetween(String value1, String value2) {
            addCriterion("FD_FACTUNITCDE not between", value1, value2, "fdFactunitcde");
            return (Criteria) this;
        }

        public Criteria andFdFactunitEngnmeIsNull() {
            addCriterion("FD_FACTUNIT_ENGNME is null");
            return (Criteria) this;
        }

        public Criteria andFdFactunitEngnmeIsNotNull() {
            addCriterion("FD_FACTUNIT_ENGNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdFactunitEngnmeEqualTo(String value) {
            addCriterion("FD_FACTUNIT_ENGNME =", value, "fdFactunitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitEngnmeNotEqualTo(String value) {
            addCriterion("FD_FACTUNIT_ENGNME <>", value, "fdFactunitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitEngnmeGreaterThan(String value) {
            addCriterion("FD_FACTUNIT_ENGNME >", value, "fdFactunitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitEngnmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FACTUNIT_ENGNME >=", value, "fdFactunitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitEngnmeLessThan(String value) {
            addCriterion("FD_FACTUNIT_ENGNME <", value, "fdFactunitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitEngnmeLessThanOrEqualTo(String value) {
            addCriterion("FD_FACTUNIT_ENGNME <=", value, "fdFactunitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitEngnmeLike(String value) {
            addCriterion("FD_FACTUNIT_ENGNME like", value, "fdFactunitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitEngnmeNotLike(String value) {
            addCriterion("FD_FACTUNIT_ENGNME not like", value, "fdFactunitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitEngnmeIn(List<String> values) {
            addCriterion("FD_FACTUNIT_ENGNME in", values, "fdFactunitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitEngnmeNotIn(List<String> values) {
            addCriterion("FD_FACTUNIT_ENGNME not in", values, "fdFactunitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitEngnmeBetween(String value1, String value2) {
            addCriterion("FD_FACTUNIT_ENGNME between", value1, value2, "fdFactunitEngnme");
            return (Criteria) this;
        }

        public Criteria andFdFactunitEngnmeNotBetween(String value1, String value2) {
            addCriterion("FD_FACTUNIT_ENGNME not between", value1, value2, "fdFactunitEngnme");
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

        public Criteria andFdCountryIsNull() {
            addCriterion("FD_COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andFdCountryIsNotNull() {
            addCriterion("FD_COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andFdCountryEqualTo(String value) {
            addCriterion("FD_COUNTRY =", value, "fdCountry");
            return (Criteria) this;
        }

        public Criteria andFdCountryNotEqualTo(String value) {
            addCriterion("FD_COUNTRY <>", value, "fdCountry");
            return (Criteria) this;
        }

        public Criteria andFdCountryGreaterThan(String value) {
            addCriterion("FD_COUNTRY >", value, "fdCountry");
            return (Criteria) this;
        }

        public Criteria andFdCountryGreaterThanOrEqualTo(String value) {
            addCriterion("FD_COUNTRY >=", value, "fdCountry");
            return (Criteria) this;
        }

        public Criteria andFdCountryLessThan(String value) {
            addCriterion("FD_COUNTRY <", value, "fdCountry");
            return (Criteria) this;
        }

        public Criteria andFdCountryLessThanOrEqualTo(String value) {
            addCriterion("FD_COUNTRY <=", value, "fdCountry");
            return (Criteria) this;
        }

        public Criteria andFdCountryLike(String value) {
            addCriterion("FD_COUNTRY like", value, "fdCountry");
            return (Criteria) this;
        }

        public Criteria andFdCountryNotLike(String value) {
            addCriterion("FD_COUNTRY not like", value, "fdCountry");
            return (Criteria) this;
        }

        public Criteria andFdCountryIn(List<String> values) {
            addCriterion("FD_COUNTRY in", values, "fdCountry");
            return (Criteria) this;
        }

        public Criteria andFdCountryNotIn(List<String> values) {
            addCriterion("FD_COUNTRY not in", values, "fdCountry");
            return (Criteria) this;
        }

        public Criteria andFdCountryBetween(String value1, String value2) {
            addCriterion("FD_COUNTRY between", value1, value2, "fdCountry");
            return (Criteria) this;
        }

        public Criteria andFdCountryNotBetween(String value1, String value2) {
            addCriterion("FD_COUNTRY not between", value1, value2, "fdCountry");
            return (Criteria) this;
        }

        public Criteria andFdRaceIsNull() {
            addCriterion("FD_RACE is null");
            return (Criteria) this;
        }

        public Criteria andFdRaceIsNotNull() {
            addCriterion("FD_RACE is not null");
            return (Criteria) this;
        }

        public Criteria andFdRaceEqualTo(String value) {
            addCriterion("FD_RACE =", value, "fdRace");
            return (Criteria) this;
        }

        public Criteria andFdRaceNotEqualTo(String value) {
            addCriterion("FD_RACE <>", value, "fdRace");
            return (Criteria) this;
        }

        public Criteria andFdRaceGreaterThan(String value) {
            addCriterion("FD_RACE >", value, "fdRace");
            return (Criteria) this;
        }

        public Criteria andFdRaceGreaterThanOrEqualTo(String value) {
            addCriterion("FD_RACE >=", value, "fdRace");
            return (Criteria) this;
        }

        public Criteria andFdRaceLessThan(String value) {
            addCriterion("FD_RACE <", value, "fdRace");
            return (Criteria) this;
        }

        public Criteria andFdRaceLessThanOrEqualTo(String value) {
            addCriterion("FD_RACE <=", value, "fdRace");
            return (Criteria) this;
        }

        public Criteria andFdRaceLike(String value) {
            addCriterion("FD_RACE like", value, "fdRace");
            return (Criteria) this;
        }

        public Criteria andFdRaceNotLike(String value) {
            addCriterion("FD_RACE not like", value, "fdRace");
            return (Criteria) this;
        }

        public Criteria andFdRaceIn(List<String> values) {
            addCriterion("FD_RACE in", values, "fdRace");
            return (Criteria) this;
        }

        public Criteria andFdRaceNotIn(List<String> values) {
            addCriterion("FD_RACE not in", values, "fdRace");
            return (Criteria) this;
        }

        public Criteria andFdRaceBetween(String value1, String value2) {
            addCriterion("FD_RACE between", value1, value2, "fdRace");
            return (Criteria) this;
        }

        public Criteria andFdRaceNotBetween(String value1, String value2) {
            addCriterion("FD_RACE not between", value1, value2, "fdRace");
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

        public Criteria andFdLaborUnittypIsNull() {
            addCriterion("FD_LABOR_UNITTYP is null");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnittypIsNotNull() {
            addCriterion("FD_LABOR_UNITTYP is not null");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnittypEqualTo(String value) {
            addCriterion("FD_LABOR_UNITTYP =", value, "fdLaborUnittyp");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnittypNotEqualTo(String value) {
            addCriterion("FD_LABOR_UNITTYP <>", value, "fdLaborUnittyp");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnittypGreaterThan(String value) {
            addCriterion("FD_LABOR_UNITTYP >", value, "fdLaborUnittyp");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnittypGreaterThanOrEqualTo(String value) {
            addCriterion("FD_LABOR_UNITTYP >=", value, "fdLaborUnittyp");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnittypLessThan(String value) {
            addCriterion("FD_LABOR_UNITTYP <", value, "fdLaborUnittyp");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnittypLessThanOrEqualTo(String value) {
            addCriterion("FD_LABOR_UNITTYP <=", value, "fdLaborUnittyp");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnittypLike(String value) {
            addCriterion("FD_LABOR_UNITTYP like", value, "fdLaborUnittyp");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnittypNotLike(String value) {
            addCriterion("FD_LABOR_UNITTYP not like", value, "fdLaborUnittyp");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnittypIn(List<String> values) {
            addCriterion("FD_LABOR_UNITTYP in", values, "fdLaborUnittyp");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnittypNotIn(List<String> values) {
            addCriterion("FD_LABOR_UNITTYP not in", values, "fdLaborUnittyp");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnittypBetween(String value1, String value2) {
            addCriterion("FD_LABOR_UNITTYP between", value1, value2, "fdLaborUnittyp");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnittypNotBetween(String value1, String value2) {
            addCriterion("FD_LABOR_UNITTYP not between", value1, value2, "fdLaborUnittyp");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnitnmeIsNull() {
            addCriterion("FD_LABOR_UNITNME is null");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnitnmeIsNotNull() {
            addCriterion("FD_LABOR_UNITNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnitnmeEqualTo(String value) {
            addCriterion("FD_LABOR_UNITNME =", value, "fdLaborUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnitnmeNotEqualTo(String value) {
            addCriterion("FD_LABOR_UNITNME <>", value, "fdLaborUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnitnmeGreaterThan(String value) {
            addCriterion("FD_LABOR_UNITNME >", value, "fdLaborUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnitnmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_LABOR_UNITNME >=", value, "fdLaborUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnitnmeLessThan(String value) {
            addCriterion("FD_LABOR_UNITNME <", value, "fdLaborUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnitnmeLessThanOrEqualTo(String value) {
            addCriterion("FD_LABOR_UNITNME <=", value, "fdLaborUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnitnmeLike(String value) {
            addCriterion("FD_LABOR_UNITNME like", value, "fdLaborUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnitnmeNotLike(String value) {
            addCriterion("FD_LABOR_UNITNME not like", value, "fdLaborUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnitnmeIn(List<String> values) {
            addCriterion("FD_LABOR_UNITNME in", values, "fdLaborUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnitnmeNotIn(List<String> values) {
            addCriterion("FD_LABOR_UNITNME not in", values, "fdLaborUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnitnmeBetween(String value1, String value2) {
            addCriterion("FD_LABOR_UNITNME between", value1, value2, "fdLaborUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdLaborUnitnmeNotBetween(String value1, String value2) {
            addCriterion("FD_LABOR_UNITNME not between", value1, value2, "fdLaborUnitnme");
            return (Criteria) this;
        }

        public Criteria andFdGljsqssjIsNull() {
            addCriterion("FD_GLJSQSSJ is null");
            return (Criteria) this;
        }

        public Criteria andFdGljsqssjIsNotNull() {
            addCriterion("FD_GLJSQSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFdGljsqssjEqualTo(String value) {
            addCriterion("FD_GLJSQSSJ =", value, "fdGljsqssj");
            return (Criteria) this;
        }

        public Criteria andFdGljsqssjNotEqualTo(String value) {
            addCriterion("FD_GLJSQSSJ <>", value, "fdGljsqssj");
            return (Criteria) this;
        }

        public Criteria andFdGljsqssjGreaterThan(String value) {
            addCriterion("FD_GLJSQSSJ >", value, "fdGljsqssj");
            return (Criteria) this;
        }

        public Criteria andFdGljsqssjGreaterThanOrEqualTo(String value) {
            addCriterion("FD_GLJSQSSJ >=", value, "fdGljsqssj");
            return (Criteria) this;
        }

        public Criteria andFdGljsqssjLessThan(String value) {
            addCriterion("FD_GLJSQSSJ <", value, "fdGljsqssj");
            return (Criteria) this;
        }

        public Criteria andFdGljsqssjLessThanOrEqualTo(String value) {
            addCriterion("FD_GLJSQSSJ <=", value, "fdGljsqssj");
            return (Criteria) this;
        }

        public Criteria andFdGljsqssjLike(String value) {
            addCriterion("FD_GLJSQSSJ like", value, "fdGljsqssj");
            return (Criteria) this;
        }

        public Criteria andFdGljsqssjNotLike(String value) {
            addCriterion("FD_GLJSQSSJ not like", value, "fdGljsqssj");
            return (Criteria) this;
        }

        public Criteria andFdGljsqssjIn(List<String> values) {
            addCriterion("FD_GLJSQSSJ in", values, "fdGljsqssj");
            return (Criteria) this;
        }

        public Criteria andFdGljsqssjNotIn(List<String> values) {
            addCriterion("FD_GLJSQSSJ not in", values, "fdGljsqssj");
            return (Criteria) this;
        }

        public Criteria andFdGljsqssjBetween(String value1, String value2) {
            addCriterion("FD_GLJSQSSJ between", value1, value2, "fdGljsqssj");
            return (Criteria) this;
        }

        public Criteria andFdGljsqssjNotBetween(String value1, String value2) {
            addCriterion("FD_GLJSQSSJ not between", value1, value2, "fdGljsqssj");
            return (Criteria) this;
        }

        public Criteria andFdOriginIsNull() {
            addCriterion("FD_ORIGIN is null");
            return (Criteria) this;
        }

        public Criteria andFdOriginIsNotNull() {
            addCriterion("FD_ORIGIN is not null");
            return (Criteria) this;
        }

        public Criteria andFdOriginEqualTo(String value) {
            addCriterion("FD_ORIGIN =", value, "fdOrigin");
            return (Criteria) this;
        }

        public Criteria andFdOriginNotEqualTo(String value) {
            addCriterion("FD_ORIGIN <>", value, "fdOrigin");
            return (Criteria) this;
        }

        public Criteria andFdOriginGreaterThan(String value) {
            addCriterion("FD_ORIGIN >", value, "fdOrigin");
            return (Criteria) this;
        }

        public Criteria andFdOriginGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ORIGIN >=", value, "fdOrigin");
            return (Criteria) this;
        }

        public Criteria andFdOriginLessThan(String value) {
            addCriterion("FD_ORIGIN <", value, "fdOrigin");
            return (Criteria) this;
        }

        public Criteria andFdOriginLessThanOrEqualTo(String value) {
            addCriterion("FD_ORIGIN <=", value, "fdOrigin");
            return (Criteria) this;
        }

        public Criteria andFdOriginLike(String value) {
            addCriterion("FD_ORIGIN like", value, "fdOrigin");
            return (Criteria) this;
        }

        public Criteria andFdOriginNotLike(String value) {
            addCriterion("FD_ORIGIN not like", value, "fdOrigin");
            return (Criteria) this;
        }

        public Criteria andFdOriginIn(List<String> values) {
            addCriterion("FD_ORIGIN in", values, "fdOrigin");
            return (Criteria) this;
        }

        public Criteria andFdOriginNotIn(List<String> values) {
            addCriterion("FD_ORIGIN not in", values, "fdOrigin");
            return (Criteria) this;
        }

        public Criteria andFdOriginBetween(String value1, String value2) {
            addCriterion("FD_ORIGIN between", value1, value2, "fdOrigin");
            return (Criteria) this;
        }

        public Criteria andFdOriginNotBetween(String value1, String value2) {
            addCriterion("FD_ORIGIN not between", value1, value2, "fdOrigin");
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

        public Criteria andFdRegAddrIsNull() {
            addCriterion("FD_REG_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andFdRegAddrIsNotNull() {
            addCriterion("FD_REG_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andFdRegAddrEqualTo(String value) {
            addCriterion("FD_REG_ADDR =", value, "fdRegAddr");
            return (Criteria) this;
        }

        public Criteria andFdRegAddrNotEqualTo(String value) {
            addCriterion("FD_REG_ADDR <>", value, "fdRegAddr");
            return (Criteria) this;
        }

        public Criteria andFdRegAddrGreaterThan(String value) {
            addCriterion("FD_REG_ADDR >", value, "fdRegAddr");
            return (Criteria) this;
        }

        public Criteria andFdRegAddrGreaterThanOrEqualTo(String value) {
            addCriterion("FD_REG_ADDR >=", value, "fdRegAddr");
            return (Criteria) this;
        }

        public Criteria andFdRegAddrLessThan(String value) {
            addCriterion("FD_REG_ADDR <", value, "fdRegAddr");
            return (Criteria) this;
        }

        public Criteria andFdRegAddrLessThanOrEqualTo(String value) {
            addCriterion("FD_REG_ADDR <=", value, "fdRegAddr");
            return (Criteria) this;
        }

        public Criteria andFdRegAddrLike(String value) {
            addCriterion("FD_REG_ADDR like", value, "fdRegAddr");
            return (Criteria) this;
        }

        public Criteria andFdRegAddrNotLike(String value) {
            addCriterion("FD_REG_ADDR not like", value, "fdRegAddr");
            return (Criteria) this;
        }

        public Criteria andFdRegAddrIn(List<String> values) {
            addCriterion("FD_REG_ADDR in", values, "fdRegAddr");
            return (Criteria) this;
        }

        public Criteria andFdRegAddrNotIn(List<String> values) {
            addCriterion("FD_REG_ADDR not in", values, "fdRegAddr");
            return (Criteria) this;
        }

        public Criteria andFdRegAddrBetween(String value1, String value2) {
            addCriterion("FD_REG_ADDR between", value1, value2, "fdRegAddr");
            return (Criteria) this;
        }

        public Criteria andFdRegAddrNotBetween(String value1, String value2) {
            addCriterion("FD_REG_ADDR not between", value1, value2, "fdRegAddr");
            return (Criteria) this;
        }

        public Criteria andFdMaritalStatusIsNull() {
            addCriterion("FD_MARITAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFdMaritalStatusIsNotNull() {
            addCriterion("FD_MARITAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFdMaritalStatusEqualTo(String value) {
            addCriterion("FD_MARITAL_STATUS =", value, "fdMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andFdMaritalStatusNotEqualTo(String value) {
            addCriterion("FD_MARITAL_STATUS <>", value, "fdMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andFdMaritalStatusGreaterThan(String value) {
            addCriterion("FD_MARITAL_STATUS >", value, "fdMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andFdMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FD_MARITAL_STATUS >=", value, "fdMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andFdMaritalStatusLessThan(String value) {
            addCriterion("FD_MARITAL_STATUS <", value, "fdMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andFdMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("FD_MARITAL_STATUS <=", value, "fdMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andFdMaritalStatusLike(String value) {
            addCriterion("FD_MARITAL_STATUS like", value, "fdMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andFdMaritalStatusNotLike(String value) {
            addCriterion("FD_MARITAL_STATUS not like", value, "fdMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andFdMaritalStatusIn(List<String> values) {
            addCriterion("FD_MARITAL_STATUS in", values, "fdMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andFdMaritalStatusNotIn(List<String> values) {
            addCriterion("FD_MARITAL_STATUS not in", values, "fdMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andFdMaritalStatusBetween(String value1, String value2) {
            addCriterion("FD_MARITAL_STATUS between", value1, value2, "fdMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andFdMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("FD_MARITAL_STATUS not between", value1, value2, "fdMaritalStatus");
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

        public Criteria andFdPoliticalDateIsNull() {
            addCriterion("FD_POLITICAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalDateIsNotNull() {
            addCriterion("FD_POLITICAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalDateEqualTo(String value) {
            addCriterion("FD_POLITICAL_DATE =", value, "fdPoliticalDate");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalDateNotEqualTo(String value) {
            addCriterion("FD_POLITICAL_DATE <>", value, "fdPoliticalDate");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalDateGreaterThan(String value) {
            addCriterion("FD_POLITICAL_DATE >", value, "fdPoliticalDate");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalDateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_POLITICAL_DATE >=", value, "fdPoliticalDate");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalDateLessThan(String value) {
            addCriterion("FD_POLITICAL_DATE <", value, "fdPoliticalDate");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalDateLessThanOrEqualTo(String value) {
            addCriterion("FD_POLITICAL_DATE <=", value, "fdPoliticalDate");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalDateLike(String value) {
            addCriterion("FD_POLITICAL_DATE like", value, "fdPoliticalDate");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalDateNotLike(String value) {
            addCriterion("FD_POLITICAL_DATE not like", value, "fdPoliticalDate");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalDateIn(List<String> values) {
            addCriterion("FD_POLITICAL_DATE in", values, "fdPoliticalDate");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalDateNotIn(List<String> values) {
            addCriterion("FD_POLITICAL_DATE not in", values, "fdPoliticalDate");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalDateBetween(String value1, String value2) {
            addCriterion("FD_POLITICAL_DATE between", value1, value2, "fdPoliticalDate");
            return (Criteria) this;
        }

        public Criteria andFdPoliticalDateNotBetween(String value1, String value2) {
            addCriterion("FD_POLITICAL_DATE not between", value1, value2, "fdPoliticalDate");
            return (Criteria) this;
        }

        public Criteria andFdServiceSituationIsNull() {
            addCriterion("FD_SERVICE_SITUATION is null");
            return (Criteria) this;
        }

        public Criteria andFdServiceSituationIsNotNull() {
            addCriterion("FD_SERVICE_SITUATION is not null");
            return (Criteria) this;
        }

        public Criteria andFdServiceSituationEqualTo(String value) {
            addCriterion("FD_SERVICE_SITUATION =", value, "fdServiceSituation");
            return (Criteria) this;
        }

        public Criteria andFdServiceSituationNotEqualTo(String value) {
            addCriterion("FD_SERVICE_SITUATION <>", value, "fdServiceSituation");
            return (Criteria) this;
        }

        public Criteria andFdServiceSituationGreaterThan(String value) {
            addCriterion("FD_SERVICE_SITUATION >", value, "fdServiceSituation");
            return (Criteria) this;
        }

        public Criteria andFdServiceSituationGreaterThanOrEqualTo(String value) {
            addCriterion("FD_SERVICE_SITUATION >=", value, "fdServiceSituation");
            return (Criteria) this;
        }

        public Criteria andFdServiceSituationLessThan(String value) {
            addCriterion("FD_SERVICE_SITUATION <", value, "fdServiceSituation");
            return (Criteria) this;
        }

        public Criteria andFdServiceSituationLessThanOrEqualTo(String value) {
            addCriterion("FD_SERVICE_SITUATION <=", value, "fdServiceSituation");
            return (Criteria) this;
        }

        public Criteria andFdServiceSituationLike(String value) {
            addCriterion("FD_SERVICE_SITUATION like", value, "fdServiceSituation");
            return (Criteria) this;
        }

        public Criteria andFdServiceSituationNotLike(String value) {
            addCriterion("FD_SERVICE_SITUATION not like", value, "fdServiceSituation");
            return (Criteria) this;
        }

        public Criteria andFdServiceSituationIn(List<String> values) {
            addCriterion("FD_SERVICE_SITUATION in", values, "fdServiceSituation");
            return (Criteria) this;
        }

        public Criteria andFdServiceSituationNotIn(List<String> values) {
            addCriterion("FD_SERVICE_SITUATION not in", values, "fdServiceSituation");
            return (Criteria) this;
        }

        public Criteria andFdServiceSituationBetween(String value1, String value2) {
            addCriterion("FD_SERVICE_SITUATION between", value1, value2, "fdServiceSituation");
            return (Criteria) this;
        }

        public Criteria andFdServiceSituationNotBetween(String value1, String value2) {
            addCriterion("FD_SERVICE_SITUATION not between", value1, value2, "fdServiceSituation");
            return (Criteria) this;
        }

        public Criteria andFdFinacStartdateIsNull() {
            addCriterion("FD_FINAC_STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andFdFinacStartdateIsNotNull() {
            addCriterion("FD_FINAC_STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdFinacStartdateEqualTo(String value) {
            addCriterion("FD_FINAC_STARTDATE =", value, "fdFinacStartdate");
            return (Criteria) this;
        }

        public Criteria andFdFinacStartdateNotEqualTo(String value) {
            addCriterion("FD_FINAC_STARTDATE <>", value, "fdFinacStartdate");
            return (Criteria) this;
        }

        public Criteria andFdFinacStartdateGreaterThan(String value) {
            addCriterion("FD_FINAC_STARTDATE >", value, "fdFinacStartdate");
            return (Criteria) this;
        }

        public Criteria andFdFinacStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FINAC_STARTDATE >=", value, "fdFinacStartdate");
            return (Criteria) this;
        }

        public Criteria andFdFinacStartdateLessThan(String value) {
            addCriterion("FD_FINAC_STARTDATE <", value, "fdFinacStartdate");
            return (Criteria) this;
        }

        public Criteria andFdFinacStartdateLessThanOrEqualTo(String value) {
            addCriterion("FD_FINAC_STARTDATE <=", value, "fdFinacStartdate");
            return (Criteria) this;
        }

        public Criteria andFdFinacStartdateLike(String value) {
            addCriterion("FD_FINAC_STARTDATE like", value, "fdFinacStartdate");
            return (Criteria) this;
        }

        public Criteria andFdFinacStartdateNotLike(String value) {
            addCriterion("FD_FINAC_STARTDATE not like", value, "fdFinacStartdate");
            return (Criteria) this;
        }

        public Criteria andFdFinacStartdateIn(List<String> values) {
            addCriterion("FD_FINAC_STARTDATE in", values, "fdFinacStartdate");
            return (Criteria) this;
        }

        public Criteria andFdFinacStartdateNotIn(List<String> values) {
            addCriterion("FD_FINAC_STARTDATE not in", values, "fdFinacStartdate");
            return (Criteria) this;
        }

        public Criteria andFdFinacStartdateBetween(String value1, String value2) {
            addCriterion("FD_FINAC_STARTDATE between", value1, value2, "fdFinacStartdate");
            return (Criteria) this;
        }

        public Criteria andFdFinacStartdateNotBetween(String value1, String value2) {
            addCriterion("FD_FINAC_STARTDATE not between", value1, value2, "fdFinacStartdate");
            return (Criteria) this;
        }

        public Criteria andFdLeaveWayIsNull() {
            addCriterion("FD_LEAVE_WAY is null");
            return (Criteria) this;
        }

        public Criteria andFdLeaveWayIsNotNull() {
            addCriterion("FD_LEAVE_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andFdLeaveWayEqualTo(String value) {
            addCriterion("FD_LEAVE_WAY =", value, "fdLeaveWay");
            return (Criteria) this;
        }

        public Criteria andFdLeaveWayNotEqualTo(String value) {
            addCriterion("FD_LEAVE_WAY <>", value, "fdLeaveWay");
            return (Criteria) this;
        }

        public Criteria andFdLeaveWayGreaterThan(String value) {
            addCriterion("FD_LEAVE_WAY >", value, "fdLeaveWay");
            return (Criteria) this;
        }

        public Criteria andFdLeaveWayGreaterThanOrEqualTo(String value) {
            addCriterion("FD_LEAVE_WAY >=", value, "fdLeaveWay");
            return (Criteria) this;
        }

        public Criteria andFdLeaveWayLessThan(String value) {
            addCriterion("FD_LEAVE_WAY <", value, "fdLeaveWay");
            return (Criteria) this;
        }

        public Criteria andFdLeaveWayLessThanOrEqualTo(String value) {
            addCriterion("FD_LEAVE_WAY <=", value, "fdLeaveWay");
            return (Criteria) this;
        }

        public Criteria andFdLeaveWayLike(String value) {
            addCriterion("FD_LEAVE_WAY like", value, "fdLeaveWay");
            return (Criteria) this;
        }

        public Criteria andFdLeaveWayNotLike(String value) {
            addCriterion("FD_LEAVE_WAY not like", value, "fdLeaveWay");
            return (Criteria) this;
        }

        public Criteria andFdLeaveWayIn(List<String> values) {
            addCriterion("FD_LEAVE_WAY in", values, "fdLeaveWay");
            return (Criteria) this;
        }

        public Criteria andFdLeaveWayNotIn(List<String> values) {
            addCriterion("FD_LEAVE_WAY not in", values, "fdLeaveWay");
            return (Criteria) this;
        }

        public Criteria andFdLeaveWayBetween(String value1, String value2) {
            addCriterion("FD_LEAVE_WAY between", value1, value2, "fdLeaveWay");
            return (Criteria) this;
        }

        public Criteria andFdLeaveWayNotBetween(String value1, String value2) {
            addCriterion("FD_LEAVE_WAY not between", value1, value2, "fdLeaveWay");
            return (Criteria) this;
        }

        public Criteria andFdLeaveDateIsNull() {
            addCriterion("FD_LEAVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFdLeaveDateIsNotNull() {
            addCriterion("FD_LEAVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdLeaveDateEqualTo(String value) {
            addCriterion("FD_LEAVE_DATE =", value, "fdLeaveDate");
            return (Criteria) this;
        }

        public Criteria andFdLeaveDateNotEqualTo(String value) {
            addCriterion("FD_LEAVE_DATE <>", value, "fdLeaveDate");
            return (Criteria) this;
        }

        public Criteria andFdLeaveDateGreaterThan(String value) {
            addCriterion("FD_LEAVE_DATE >", value, "fdLeaveDate");
            return (Criteria) this;
        }

        public Criteria andFdLeaveDateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_LEAVE_DATE >=", value, "fdLeaveDate");
            return (Criteria) this;
        }

        public Criteria andFdLeaveDateLessThan(String value) {
            addCriterion("FD_LEAVE_DATE <", value, "fdLeaveDate");
            return (Criteria) this;
        }

        public Criteria andFdLeaveDateLessThanOrEqualTo(String value) {
            addCriterion("FD_LEAVE_DATE <=", value, "fdLeaveDate");
            return (Criteria) this;
        }

        public Criteria andFdLeaveDateLike(String value) {
            addCriterion("FD_LEAVE_DATE like", value, "fdLeaveDate");
            return (Criteria) this;
        }

        public Criteria andFdLeaveDateNotLike(String value) {
            addCriterion("FD_LEAVE_DATE not like", value, "fdLeaveDate");
            return (Criteria) this;
        }

        public Criteria andFdLeaveDateIn(List<String> values) {
            addCriterion("FD_LEAVE_DATE in", values, "fdLeaveDate");
            return (Criteria) this;
        }

        public Criteria andFdLeaveDateNotIn(List<String> values) {
            addCriterion("FD_LEAVE_DATE not in", values, "fdLeaveDate");
            return (Criteria) this;
        }

        public Criteria andFdLeaveDateBetween(String value1, String value2) {
            addCriterion("FD_LEAVE_DATE between", value1, value2, "fdLeaveDate");
            return (Criteria) this;
        }

        public Criteria andFdLeaveDateNotBetween(String value1, String value2) {
            addCriterion("FD_LEAVE_DATE not between", value1, value2, "fdLeaveDate");
            return (Criteria) this;
        }

        public Criteria andFdLeaveReasonIsNull() {
            addCriterion("FD_LEAVE_REASON is null");
            return (Criteria) this;
        }

        public Criteria andFdLeaveReasonIsNotNull() {
            addCriterion("FD_LEAVE_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andFdLeaveReasonEqualTo(String value) {
            addCriterion("FD_LEAVE_REASON =", value, "fdLeaveReason");
            return (Criteria) this;
        }

        public Criteria andFdLeaveReasonNotEqualTo(String value) {
            addCriterion("FD_LEAVE_REASON <>", value, "fdLeaveReason");
            return (Criteria) this;
        }

        public Criteria andFdLeaveReasonGreaterThan(String value) {
            addCriterion("FD_LEAVE_REASON >", value, "fdLeaveReason");
            return (Criteria) this;
        }

        public Criteria andFdLeaveReasonGreaterThanOrEqualTo(String value) {
            addCriterion("FD_LEAVE_REASON >=", value, "fdLeaveReason");
            return (Criteria) this;
        }

        public Criteria andFdLeaveReasonLessThan(String value) {
            addCriterion("FD_LEAVE_REASON <", value, "fdLeaveReason");
            return (Criteria) this;
        }

        public Criteria andFdLeaveReasonLessThanOrEqualTo(String value) {
            addCriterion("FD_LEAVE_REASON <=", value, "fdLeaveReason");
            return (Criteria) this;
        }

        public Criteria andFdLeaveReasonLike(String value) {
            addCriterion("FD_LEAVE_REASON like", value, "fdLeaveReason");
            return (Criteria) this;
        }

        public Criteria andFdLeaveReasonNotLike(String value) {
            addCriterion("FD_LEAVE_REASON not like", value, "fdLeaveReason");
            return (Criteria) this;
        }

        public Criteria andFdLeaveReasonIn(List<String> values) {
            addCriterion("FD_LEAVE_REASON in", values, "fdLeaveReason");
            return (Criteria) this;
        }

        public Criteria andFdLeaveReasonNotIn(List<String> values) {
            addCriterion("FD_LEAVE_REASON not in", values, "fdLeaveReason");
            return (Criteria) this;
        }

        public Criteria andFdLeaveReasonBetween(String value1, String value2) {
            addCriterion("FD_LEAVE_REASON between", value1, value2, "fdLeaveReason");
            return (Criteria) this;
        }

        public Criteria andFdLeaveReasonNotBetween(String value1, String value2) {
            addCriterion("FD_LEAVE_REASON not between", value1, value2, "fdLeaveReason");
            return (Criteria) this;
        }

        public Criteria andFdLeaveForwardIsNull() {
            addCriterion("FD_LEAVE_FORWARD is null");
            return (Criteria) this;
        }

        public Criteria andFdLeaveForwardIsNotNull() {
            addCriterion("FD_LEAVE_FORWARD is not null");
            return (Criteria) this;
        }

        public Criteria andFdLeaveForwardEqualTo(String value) {
            addCriterion("FD_LEAVE_FORWARD =", value, "fdLeaveForward");
            return (Criteria) this;
        }

        public Criteria andFdLeaveForwardNotEqualTo(String value) {
            addCriterion("FD_LEAVE_FORWARD <>", value, "fdLeaveForward");
            return (Criteria) this;
        }

        public Criteria andFdLeaveForwardGreaterThan(String value) {
            addCriterion("FD_LEAVE_FORWARD >", value, "fdLeaveForward");
            return (Criteria) this;
        }

        public Criteria andFdLeaveForwardGreaterThanOrEqualTo(String value) {
            addCriterion("FD_LEAVE_FORWARD >=", value, "fdLeaveForward");
            return (Criteria) this;
        }

        public Criteria andFdLeaveForwardLessThan(String value) {
            addCriterion("FD_LEAVE_FORWARD <", value, "fdLeaveForward");
            return (Criteria) this;
        }

        public Criteria andFdLeaveForwardLessThanOrEqualTo(String value) {
            addCriterion("FD_LEAVE_FORWARD <=", value, "fdLeaveForward");
            return (Criteria) this;
        }

        public Criteria andFdLeaveForwardLike(String value) {
            addCriterion("FD_LEAVE_FORWARD like", value, "fdLeaveForward");
            return (Criteria) this;
        }

        public Criteria andFdLeaveForwardNotLike(String value) {
            addCriterion("FD_LEAVE_FORWARD not like", value, "fdLeaveForward");
            return (Criteria) this;
        }

        public Criteria andFdLeaveForwardIn(List<String> values) {
            addCriterion("FD_LEAVE_FORWARD in", values, "fdLeaveForward");
            return (Criteria) this;
        }

        public Criteria andFdLeaveForwardNotIn(List<String> values) {
            addCriterion("FD_LEAVE_FORWARD not in", values, "fdLeaveForward");
            return (Criteria) this;
        }

        public Criteria andFdLeaveForwardBetween(String value1, String value2) {
            addCriterion("FD_LEAVE_FORWARD between", value1, value2, "fdLeaveForward");
            return (Criteria) this;
        }

        public Criteria andFdLeaveForwardNotBetween(String value1, String value2) {
            addCriterion("FD_LEAVE_FORWARD not between", value1, value2, "fdLeaveForward");
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

        public Criteria andFdJobcdeIsNull() {
            addCriterion("FD_JOBCDE is null");
            return (Criteria) this;
        }

        public Criteria andFdJobcdeIsNotNull() {
            addCriterion("FD_JOBCDE is not null");
            return (Criteria) this;
        }

        public Criteria andFdJobcdeEqualTo(String value) {
            addCriterion("FD_JOBCDE =", value, "fdJobcde");
            return (Criteria) this;
        }

        public Criteria andFdJobcdeNotEqualTo(String value) {
            addCriterion("FD_JOBCDE <>", value, "fdJobcde");
            return (Criteria) this;
        }

        public Criteria andFdJobcdeGreaterThan(String value) {
            addCriterion("FD_JOBCDE >", value, "fdJobcde");
            return (Criteria) this;
        }

        public Criteria andFdJobcdeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_JOBCDE >=", value, "fdJobcde");
            return (Criteria) this;
        }

        public Criteria andFdJobcdeLessThan(String value) {
            addCriterion("FD_JOBCDE <", value, "fdJobcde");
            return (Criteria) this;
        }

        public Criteria andFdJobcdeLessThanOrEqualTo(String value) {
            addCriterion("FD_JOBCDE <=", value, "fdJobcde");
            return (Criteria) this;
        }

        public Criteria andFdJobcdeLike(String value) {
            addCriterion("FD_JOBCDE like", value, "fdJobcde");
            return (Criteria) this;
        }

        public Criteria andFdJobcdeNotLike(String value) {
            addCriterion("FD_JOBCDE not like", value, "fdJobcde");
            return (Criteria) this;
        }

        public Criteria andFdJobcdeIn(List<String> values) {
            addCriterion("FD_JOBCDE in", values, "fdJobcde");
            return (Criteria) this;
        }

        public Criteria andFdJobcdeNotIn(List<String> values) {
            addCriterion("FD_JOBCDE not in", values, "fdJobcde");
            return (Criteria) this;
        }

        public Criteria andFdJobcdeBetween(String value1, String value2) {
            addCriterion("FD_JOBCDE between", value1, value2, "fdJobcde");
            return (Criteria) this;
        }

        public Criteria andFdJobcdeNotBetween(String value1, String value2) {
            addCriterion("FD_JOBCDE not between", value1, value2, "fdJobcde");
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

        public Criteria andFdEmpageIsNull() {
            addCriterion("FD_EMPAGE is null");
            return (Criteria) this;
        }

        public Criteria andFdEmpageIsNotNull() {
            addCriterion("FD_EMPAGE is not null");
            return (Criteria) this;
        }

        public Criteria andFdEmpageEqualTo(String value) {
            addCriterion("FD_EMPAGE =", value, "fdEmpage");
            return (Criteria) this;
        }

        public Criteria andFdEmpageNotEqualTo(String value) {
            addCriterion("FD_EMPAGE <>", value, "fdEmpage");
            return (Criteria) this;
        }

        public Criteria andFdEmpageGreaterThan(String value) {
            addCriterion("FD_EMPAGE >", value, "fdEmpage");
            return (Criteria) this;
        }

        public Criteria andFdEmpageGreaterThanOrEqualTo(String value) {
            addCriterion("FD_EMPAGE >=", value, "fdEmpage");
            return (Criteria) this;
        }

        public Criteria andFdEmpageLessThan(String value) {
            addCriterion("FD_EMPAGE <", value, "fdEmpage");
            return (Criteria) this;
        }

        public Criteria andFdEmpageLessThanOrEqualTo(String value) {
            addCriterion("FD_EMPAGE <=", value, "fdEmpage");
            return (Criteria) this;
        }

        public Criteria andFdEmpageLike(String value) {
            addCriterion("FD_EMPAGE like", value, "fdEmpage");
            return (Criteria) this;
        }

        public Criteria andFdEmpageNotLike(String value) {
            addCriterion("FD_EMPAGE not like", value, "fdEmpage");
            return (Criteria) this;
        }

        public Criteria andFdEmpageIn(List<String> values) {
            addCriterion("FD_EMPAGE in", values, "fdEmpage");
            return (Criteria) this;
        }

        public Criteria andFdEmpageNotIn(List<String> values) {
            addCriterion("FD_EMPAGE not in", values, "fdEmpage");
            return (Criteria) this;
        }

        public Criteria andFdEmpageBetween(String value1, String value2) {
            addCriterion("FD_EMPAGE between", value1, value2, "fdEmpage");
            return (Criteria) this;
        }

        public Criteria andFdEmpageNotBetween(String value1, String value2) {
            addCriterion("FD_EMPAGE not between", value1, value2, "fdEmpage");
            return (Criteria) this;
        }

        public Criteria andFdMajorIsNull() {
            addCriterion("FD_MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andFdMajorIsNotNull() {
            addCriterion("FD_MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andFdMajorEqualTo(String value) {
            addCriterion("FD_MAJOR =", value, "fdMajor");
            return (Criteria) this;
        }

        public Criteria andFdMajorNotEqualTo(String value) {
            addCriterion("FD_MAJOR <>", value, "fdMajor");
            return (Criteria) this;
        }

        public Criteria andFdMajorGreaterThan(String value) {
            addCriterion("FD_MAJOR >", value, "fdMajor");
            return (Criteria) this;
        }

        public Criteria andFdMajorGreaterThanOrEqualTo(String value) {
            addCriterion("FD_MAJOR >=", value, "fdMajor");
            return (Criteria) this;
        }

        public Criteria andFdMajorLessThan(String value) {
            addCriterion("FD_MAJOR <", value, "fdMajor");
            return (Criteria) this;
        }

        public Criteria andFdMajorLessThanOrEqualTo(String value) {
            addCriterion("FD_MAJOR <=", value, "fdMajor");
            return (Criteria) this;
        }

        public Criteria andFdMajorLike(String value) {
            addCriterion("FD_MAJOR like", value, "fdMajor");
            return (Criteria) this;
        }

        public Criteria andFdMajorNotLike(String value) {
            addCriterion("FD_MAJOR not like", value, "fdMajor");
            return (Criteria) this;
        }

        public Criteria andFdMajorIn(List<String> values) {
            addCriterion("FD_MAJOR in", values, "fdMajor");
            return (Criteria) this;
        }

        public Criteria andFdMajorNotIn(List<String> values) {
            addCriterion("FD_MAJOR not in", values, "fdMajor");
            return (Criteria) this;
        }

        public Criteria andFdMajorBetween(String value1, String value2) {
            addCriterion("FD_MAJOR between", value1, value2, "fdMajor");
            return (Criteria) this;
        }

        public Criteria andFdMajorNotBetween(String value1, String value2) {
            addCriterion("FD_MAJOR not between", value1, value2, "fdMajor");
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

        public Criteria andFdYgsfIsNull() {
            addCriterion("FD_YGSF is null");
            return (Criteria) this;
        }

        public Criteria andFdYgsfIsNotNull() {
            addCriterion("FD_YGSF is not null");
            return (Criteria) this;
        }

        public Criteria andFdYgsfEqualTo(String value) {
            addCriterion("FD_YGSF =", value, "fdYgsf");
            return (Criteria) this;
        }

        public Criteria andFdYgsfNotEqualTo(String value) {
            addCriterion("FD_YGSF <>", value, "fdYgsf");
            return (Criteria) this;
        }

        public Criteria andFdYgsfGreaterThan(String value) {
            addCriterion("FD_YGSF >", value, "fdYgsf");
            return (Criteria) this;
        }

        public Criteria andFdYgsfGreaterThanOrEqualTo(String value) {
            addCriterion("FD_YGSF >=", value, "fdYgsf");
            return (Criteria) this;
        }

        public Criteria andFdYgsfLessThan(String value) {
            addCriterion("FD_YGSF <", value, "fdYgsf");
            return (Criteria) this;
        }

        public Criteria andFdYgsfLessThanOrEqualTo(String value) {
            addCriterion("FD_YGSF <=", value, "fdYgsf");
            return (Criteria) this;
        }

        public Criteria andFdYgsfLike(String value) {
            addCriterion("FD_YGSF like", value, "fdYgsf");
            return (Criteria) this;
        }

        public Criteria andFdYgsfNotLike(String value) {
            addCriterion("FD_YGSF not like", value, "fdYgsf");
            return (Criteria) this;
        }

        public Criteria andFdYgsfIn(List<String> values) {
            addCriterion("FD_YGSF in", values, "fdYgsf");
            return (Criteria) this;
        }

        public Criteria andFdYgsfNotIn(List<String> values) {
            addCriterion("FD_YGSF not in", values, "fdYgsf");
            return (Criteria) this;
        }

        public Criteria andFdYgsfBetween(String value1, String value2) {
            addCriterion("FD_YGSF between", value1, value2, "fdYgsf");
            return (Criteria) this;
        }

        public Criteria andFdYgsfNotBetween(String value1, String value2) {
            addCriterion("FD_YGSF not between", value1, value2, "fdYgsf");
            return (Criteria) this;
        }

        public Criteria andFdZwcjbjIsNull() {
            addCriterion("FD_ZWCJBJ is null");
            return (Criteria) this;
        }

        public Criteria andFdZwcjbjIsNotNull() {
            addCriterion("FD_ZWCJBJ is not null");
            return (Criteria) this;
        }

        public Criteria andFdZwcjbjEqualTo(String value) {
            addCriterion("FD_ZWCJBJ =", value, "fdZwcjbj");
            return (Criteria) this;
        }

        public Criteria andFdZwcjbjNotEqualTo(String value) {
            addCriterion("FD_ZWCJBJ <>", value, "fdZwcjbj");
            return (Criteria) this;
        }

        public Criteria andFdZwcjbjGreaterThan(String value) {
            addCriterion("FD_ZWCJBJ >", value, "fdZwcjbj");
            return (Criteria) this;
        }

        public Criteria andFdZwcjbjGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ZWCJBJ >=", value, "fdZwcjbj");
            return (Criteria) this;
        }

        public Criteria andFdZwcjbjLessThan(String value) {
            addCriterion("FD_ZWCJBJ <", value, "fdZwcjbj");
            return (Criteria) this;
        }

        public Criteria andFdZwcjbjLessThanOrEqualTo(String value) {
            addCriterion("FD_ZWCJBJ <=", value, "fdZwcjbj");
            return (Criteria) this;
        }

        public Criteria andFdZwcjbjLike(String value) {
            addCriterion("FD_ZWCJBJ like", value, "fdZwcjbj");
            return (Criteria) this;
        }

        public Criteria andFdZwcjbjNotLike(String value) {
            addCriterion("FD_ZWCJBJ not like", value, "fdZwcjbj");
            return (Criteria) this;
        }

        public Criteria andFdZwcjbjIn(List<String> values) {
            addCriterion("FD_ZWCJBJ in", values, "fdZwcjbj");
            return (Criteria) this;
        }

        public Criteria andFdZwcjbjNotIn(List<String> values) {
            addCriterion("FD_ZWCJBJ not in", values, "fdZwcjbj");
            return (Criteria) this;
        }

        public Criteria andFdZwcjbjBetween(String value1, String value2) {
            addCriterion("FD_ZWCJBJ between", value1, value2, "fdZwcjbj");
            return (Criteria) this;
        }

        public Criteria andFdZwcjbjNotBetween(String value1, String value2) {
            addCriterion("FD_ZWCJBJ not between", value1, value2, "fdZwcjbj");
            return (Criteria) this;
        }

        public Criteria andFdWtryztIsNull() {
            addCriterion("FD_WTRYZT is null");
            return (Criteria) this;
        }

        public Criteria andFdWtryztIsNotNull() {
            addCriterion("FD_WTRYZT is not null");
            return (Criteria) this;
        }

        public Criteria andFdWtryztEqualTo(String value) {
            addCriterion("FD_WTRYZT =", value, "fdWtryzt");
            return (Criteria) this;
        }

        public Criteria andFdWtryztNotEqualTo(String value) {
            addCriterion("FD_WTRYZT <>", value, "fdWtryzt");
            return (Criteria) this;
        }

        public Criteria andFdWtryztGreaterThan(String value) {
            addCriterion("FD_WTRYZT >", value, "fdWtryzt");
            return (Criteria) this;
        }

        public Criteria andFdWtryztGreaterThanOrEqualTo(String value) {
            addCriterion("FD_WTRYZT >=", value, "fdWtryzt");
            return (Criteria) this;
        }

        public Criteria andFdWtryztLessThan(String value) {
            addCriterion("FD_WTRYZT <", value, "fdWtryzt");
            return (Criteria) this;
        }

        public Criteria andFdWtryztLessThanOrEqualTo(String value) {
            addCriterion("FD_WTRYZT <=", value, "fdWtryzt");
            return (Criteria) this;
        }

        public Criteria andFdWtryztLike(String value) {
            addCriterion("FD_WTRYZT like", value, "fdWtryzt");
            return (Criteria) this;
        }

        public Criteria andFdWtryztNotLike(String value) {
            addCriterion("FD_WTRYZT not like", value, "fdWtryzt");
            return (Criteria) this;
        }

        public Criteria andFdWtryztIn(List<String> values) {
            addCriterion("FD_WTRYZT in", values, "fdWtryzt");
            return (Criteria) this;
        }

        public Criteria andFdWtryztNotIn(List<String> values) {
            addCriterion("FD_WTRYZT not in", values, "fdWtryzt");
            return (Criteria) this;
        }

        public Criteria andFdWtryztBetween(String value1, String value2) {
            addCriterion("FD_WTRYZT between", value1, value2, "fdWtryzt");
            return (Criteria) this;
        }

        public Criteria andFdWtryztNotBetween(String value1, String value2) {
            addCriterion("FD_WTRYZT not between", value1, value2, "fdWtryzt");
            return (Criteria) this;
        }

        public Criteria andFdQjxssxIsNull() {
            addCriterion("FD_QJXSSX is null");
            return (Criteria) this;
        }

        public Criteria andFdQjxssxIsNotNull() {
            addCriterion("FD_QJXSSX is not null");
            return (Criteria) this;
        }

        public Criteria andFdQjxssxEqualTo(String value) {
            addCriterion("FD_QJXSSX =", value, "fdQjxssx");
            return (Criteria) this;
        }

        public Criteria andFdQjxssxNotEqualTo(String value) {
            addCriterion("FD_QJXSSX <>", value, "fdQjxssx");
            return (Criteria) this;
        }

        public Criteria andFdQjxssxGreaterThan(String value) {
            addCriterion("FD_QJXSSX >", value, "fdQjxssx");
            return (Criteria) this;
        }

        public Criteria andFdQjxssxGreaterThanOrEqualTo(String value) {
            addCriterion("FD_QJXSSX >=", value, "fdQjxssx");
            return (Criteria) this;
        }

        public Criteria andFdQjxssxLessThan(String value) {
            addCriterion("FD_QJXSSX <", value, "fdQjxssx");
            return (Criteria) this;
        }

        public Criteria andFdQjxssxLessThanOrEqualTo(String value) {
            addCriterion("FD_QJXSSX <=", value, "fdQjxssx");
            return (Criteria) this;
        }

        public Criteria andFdQjxssxLike(String value) {
            addCriterion("FD_QJXSSX like", value, "fdQjxssx");
            return (Criteria) this;
        }

        public Criteria andFdQjxssxNotLike(String value) {
            addCriterion("FD_QJXSSX not like", value, "fdQjxssx");
            return (Criteria) this;
        }

        public Criteria andFdQjxssxIn(List<String> values) {
            addCriterion("FD_QJXSSX in", values, "fdQjxssx");
            return (Criteria) this;
        }

        public Criteria andFdQjxssxNotIn(List<String> values) {
            addCriterion("FD_QJXSSX not in", values, "fdQjxssx");
            return (Criteria) this;
        }

        public Criteria andFdQjxssxBetween(String value1, String value2) {
            addCriterion("FD_QJXSSX between", value1, value2, "fdQjxssx");
            return (Criteria) this;
        }

        public Criteria andFdQjxssxNotBetween(String value1, String value2) {
            addCriterion("FD_QJXSSX not between", value1, value2, "fdQjxssx");
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