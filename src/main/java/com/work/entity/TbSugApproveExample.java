package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TbSugApproveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSugApproveExample() {
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

        public Criteria andFdUuidIsNull() {
            addCriterion("FD_UUID is null");
            return (Criteria) this;
        }

        public Criteria andFdUuidIsNotNull() {
            addCriterion("FD_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andFdUuidEqualTo(String value) {
            addCriterion("FD_UUID =", value, "fdUuid");
            return (Criteria) this;
        }

        public Criteria andFdUuidNotEqualTo(String value) {
            addCriterion("FD_UUID <>", value, "fdUuid");
            return (Criteria) this;
        }

        public Criteria andFdUuidGreaterThan(String value) {
            addCriterion("FD_UUID >", value, "fdUuid");
            return (Criteria) this;
        }

        public Criteria andFdUuidGreaterThanOrEqualTo(String value) {
            addCriterion("FD_UUID >=", value, "fdUuid");
            return (Criteria) this;
        }

        public Criteria andFdUuidLessThan(String value) {
            addCriterion("FD_UUID <", value, "fdUuid");
            return (Criteria) this;
        }

        public Criteria andFdUuidLessThanOrEqualTo(String value) {
            addCriterion("FD_UUID <=", value, "fdUuid");
            return (Criteria) this;
        }

        public Criteria andFdUuidLike(String value) {
            addCriterion("FD_UUID like", value, "fdUuid");
            return (Criteria) this;
        }

        public Criteria andFdUuidNotLike(String value) {
            addCriterion("FD_UUID not like", value, "fdUuid");
            return (Criteria) this;
        }

        public Criteria andFdUuidIn(List<String> values) {
            addCriterion("FD_UUID in", values, "fdUuid");
            return (Criteria) this;
        }

        public Criteria andFdUuidNotIn(List<String> values) {
            addCriterion("FD_UUID not in", values, "fdUuid");
            return (Criteria) this;
        }

        public Criteria andFdUuidBetween(String value1, String value2) {
            addCriterion("FD_UUID between", value1, value2, "fdUuid");
            return (Criteria) this;
        }

        public Criteria andFdUuidNotBetween(String value1, String value2) {
            addCriterion("FD_UUID not between", value1, value2, "fdUuid");
            return (Criteria) this;
        }

        public Criteria andFdApproOrgIsNull() {
            addCriterion("FD_APPRO_ORG is null");
            return (Criteria) this;
        }

        public Criteria andFdApproOrgIsNotNull() {
            addCriterion("FD_APPRO_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andFdApproOrgEqualTo(String value) {
            addCriterion("FD_APPRO_ORG =", value, "fdApproOrg");
            return (Criteria) this;
        }

        public Criteria andFdApproOrgNotEqualTo(String value) {
            addCriterion("FD_APPRO_ORG <>", value, "fdApproOrg");
            return (Criteria) this;
        }

        public Criteria andFdApproOrgGreaterThan(String value) {
            addCriterion("FD_APPRO_ORG >", value, "fdApproOrg");
            return (Criteria) this;
        }

        public Criteria andFdApproOrgGreaterThanOrEqualTo(String value) {
            addCriterion("FD_APPRO_ORG >=", value, "fdApproOrg");
            return (Criteria) this;
        }

        public Criteria andFdApproOrgLessThan(String value) {
            addCriterion("FD_APPRO_ORG <", value, "fdApproOrg");
            return (Criteria) this;
        }

        public Criteria andFdApproOrgLessThanOrEqualTo(String value) {
            addCriterion("FD_APPRO_ORG <=", value, "fdApproOrg");
            return (Criteria) this;
        }

        public Criteria andFdApproOrgLike(String value) {
            addCriterion("FD_APPRO_ORG like", value, "fdApproOrg");
            return (Criteria) this;
        }

        public Criteria andFdApproOrgNotLike(String value) {
            addCriterion("FD_APPRO_ORG not like", value, "fdApproOrg");
            return (Criteria) this;
        }

        public Criteria andFdApproOrgIn(List<String> values) {
            addCriterion("FD_APPRO_ORG in", values, "fdApproOrg");
            return (Criteria) this;
        }

        public Criteria andFdApproOrgNotIn(List<String> values) {
            addCriterion("FD_APPRO_ORG not in", values, "fdApproOrg");
            return (Criteria) this;
        }

        public Criteria andFdApproOrgBetween(String value1, String value2) {
            addCriterion("FD_APPRO_ORG between", value1, value2, "fdApproOrg");
            return (Criteria) this;
        }

        public Criteria andFdApproOrgNotBetween(String value1, String value2) {
            addCriterion("FD_APPRO_ORG not between", value1, value2, "fdApproOrg");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpIsNull() {
            addCriterion("FD_APPRO_EMP is null");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpIsNotNull() {
            addCriterion("FD_APPRO_EMP is not null");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpEqualTo(String value) {
            addCriterion("FD_APPRO_EMP =", value, "fdApproEmp");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpNotEqualTo(String value) {
            addCriterion("FD_APPRO_EMP <>", value, "fdApproEmp");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpGreaterThan(String value) {
            addCriterion("FD_APPRO_EMP >", value, "fdApproEmp");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpGreaterThanOrEqualTo(String value) {
            addCriterion("FD_APPRO_EMP >=", value, "fdApproEmp");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpLessThan(String value) {
            addCriterion("FD_APPRO_EMP <", value, "fdApproEmp");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpLessThanOrEqualTo(String value) {
            addCriterion("FD_APPRO_EMP <=", value, "fdApproEmp");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpLike(String value) {
            addCriterion("FD_APPRO_EMP like", value, "fdApproEmp");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpNotLike(String value) {
            addCriterion("FD_APPRO_EMP not like", value, "fdApproEmp");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpIn(List<String> values) {
            addCriterion("FD_APPRO_EMP in", values, "fdApproEmp");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpNotIn(List<String> values) {
            addCriterion("FD_APPRO_EMP not in", values, "fdApproEmp");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpBetween(String value1, String value2) {
            addCriterion("FD_APPRO_EMP between", value1, value2, "fdApproEmp");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpNotBetween(String value1, String value2) {
            addCriterion("FD_APPRO_EMP not between", value1, value2, "fdApproEmp");
            return (Criteria) this;
        }

        public Criteria andFdApproTimeIsNull() {
            addCriterion("FD_APPRO_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFdApproTimeIsNotNull() {
            addCriterion("FD_APPRO_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFdApproTimeEqualTo(String value) {
            addCriterion("FD_APPRO_TIME =", value, "fdApproTime");
            return (Criteria) this;
        }

        public Criteria andFdApproTimeNotEqualTo(String value) {
            addCriterion("FD_APPRO_TIME <>", value, "fdApproTime");
            return (Criteria) this;
        }

        public Criteria andFdApproTimeGreaterThan(String value) {
            addCriterion("FD_APPRO_TIME >", value, "fdApproTime");
            return (Criteria) this;
        }

        public Criteria andFdApproTimeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_APPRO_TIME >=", value, "fdApproTime");
            return (Criteria) this;
        }

        public Criteria andFdApproTimeLessThan(String value) {
            addCriterion("FD_APPRO_TIME <", value, "fdApproTime");
            return (Criteria) this;
        }

        public Criteria andFdApproTimeLessThanOrEqualTo(String value) {
            addCriterion("FD_APPRO_TIME <=", value, "fdApproTime");
            return (Criteria) this;
        }

        public Criteria andFdApproTimeLike(String value) {
            addCriterion("FD_APPRO_TIME like", value, "fdApproTime");
            return (Criteria) this;
        }

        public Criteria andFdApproTimeNotLike(String value) {
            addCriterion("FD_APPRO_TIME not like", value, "fdApproTime");
            return (Criteria) this;
        }

        public Criteria andFdApproTimeIn(List<String> values) {
            addCriterion("FD_APPRO_TIME in", values, "fdApproTime");
            return (Criteria) this;
        }

        public Criteria andFdApproTimeNotIn(List<String> values) {
            addCriterion("FD_APPRO_TIME not in", values, "fdApproTime");
            return (Criteria) this;
        }

        public Criteria andFdApproTimeBetween(String value1, String value2) {
            addCriterion("FD_APPRO_TIME between", value1, value2, "fdApproTime");
            return (Criteria) this;
        }

        public Criteria andFdApproTimeNotBetween(String value1, String value2) {
            addCriterion("FD_APPRO_TIME not between", value1, value2, "fdApproTime");
            return (Criteria) this;
        }

        public Criteria andFdApproStuIsNull() {
            addCriterion("FD_APPRO_STU is null");
            return (Criteria) this;
        }

        public Criteria andFdApproStuIsNotNull() {
            addCriterion("FD_APPRO_STU is not null");
            return (Criteria) this;
        }

        public Criteria andFdApproStuEqualTo(String value) {
            addCriterion("FD_APPRO_STU =", value, "fdApproStu");
            return (Criteria) this;
        }

        public Criteria andFdApproStuNotEqualTo(String value) {
            addCriterion("FD_APPRO_STU <>", value, "fdApproStu");
            return (Criteria) this;
        }

        public Criteria andFdApproStuGreaterThan(String value) {
            addCriterion("FD_APPRO_STU >", value, "fdApproStu");
            return (Criteria) this;
        }

        public Criteria andFdApproStuGreaterThanOrEqualTo(String value) {
            addCriterion("FD_APPRO_STU >=", value, "fdApproStu");
            return (Criteria) this;
        }

        public Criteria andFdApproStuLessThan(String value) {
            addCriterion("FD_APPRO_STU <", value, "fdApproStu");
            return (Criteria) this;
        }

        public Criteria andFdApproStuLessThanOrEqualTo(String value) {
            addCriterion("FD_APPRO_STU <=", value, "fdApproStu");
            return (Criteria) this;
        }

        public Criteria andFdApproStuLike(String value) {
            addCriterion("FD_APPRO_STU like", value, "fdApproStu");
            return (Criteria) this;
        }

        public Criteria andFdApproStuNotLike(String value) {
            addCriterion("FD_APPRO_STU not like", value, "fdApproStu");
            return (Criteria) this;
        }

        public Criteria andFdApproStuIn(List<String> values) {
            addCriterion("FD_APPRO_STU in", values, "fdApproStu");
            return (Criteria) this;
        }

        public Criteria andFdApproStuNotIn(List<String> values) {
            addCriterion("FD_APPRO_STU not in", values, "fdApproStu");
            return (Criteria) this;
        }

        public Criteria andFdApproStuBetween(String value1, String value2) {
            addCriterion("FD_APPRO_STU between", value1, value2, "fdApproStu");
            return (Criteria) this;
        }

        public Criteria andFdApproStuNotBetween(String value1, String value2) {
            addCriterion("FD_APPRO_STU not between", value1, value2, "fdApproStu");
            return (Criteria) this;
        }

        public Criteria andFdSugEmpScoreIsNull() {
            addCriterion("FD_SUG_EMP_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andFdSugEmpScoreIsNotNull() {
            addCriterion("FD_SUG_EMP_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andFdSugEmpScoreEqualTo(String value) {
            addCriterion("FD_SUG_EMP_SCORE =", value, "fdSugEmpScore");
            return (Criteria) this;
        }

        public Criteria andFdSugEmpScoreNotEqualTo(String value) {
            addCriterion("FD_SUG_EMP_SCORE <>", value, "fdSugEmpScore");
            return (Criteria) this;
        }

        public Criteria andFdSugEmpScoreGreaterThan(String value) {
            addCriterion("FD_SUG_EMP_SCORE >", value, "fdSugEmpScore");
            return (Criteria) this;
        }

        public Criteria andFdSugEmpScoreGreaterThanOrEqualTo(String value) {
            addCriterion("FD_SUG_EMP_SCORE >=", value, "fdSugEmpScore");
            return (Criteria) this;
        }

        public Criteria andFdSugEmpScoreLessThan(String value) {
            addCriterion("FD_SUG_EMP_SCORE <", value, "fdSugEmpScore");
            return (Criteria) this;
        }

        public Criteria andFdSugEmpScoreLessThanOrEqualTo(String value) {
            addCriterion("FD_SUG_EMP_SCORE <=", value, "fdSugEmpScore");
            return (Criteria) this;
        }

        public Criteria andFdSugEmpScoreLike(String value) {
            addCriterion("FD_SUG_EMP_SCORE like", value, "fdSugEmpScore");
            return (Criteria) this;
        }

        public Criteria andFdSugEmpScoreNotLike(String value) {
            addCriterion("FD_SUG_EMP_SCORE not like", value, "fdSugEmpScore");
            return (Criteria) this;
        }

        public Criteria andFdSugEmpScoreIn(List<String> values) {
            addCriterion("FD_SUG_EMP_SCORE in", values, "fdSugEmpScore");
            return (Criteria) this;
        }

        public Criteria andFdSugEmpScoreNotIn(List<String> values) {
            addCriterion("FD_SUG_EMP_SCORE not in", values, "fdSugEmpScore");
            return (Criteria) this;
        }

        public Criteria andFdSugEmpScoreBetween(String value1, String value2) {
            addCriterion("FD_SUG_EMP_SCORE between", value1, value2, "fdSugEmpScore");
            return (Criteria) this;
        }

        public Criteria andFdSugEmpScoreNotBetween(String value1, String value2) {
            addCriterion("FD_SUG_EMP_SCORE not between", value1, value2, "fdSugEmpScore");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpnmeIsNull() {
            addCriterion("FD_APPRO_EMPNME is null");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpnmeIsNotNull() {
            addCriterion("FD_APPRO_EMPNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpnmeEqualTo(String value) {
            addCriterion("FD_APPRO_EMPNME =", value, "fdApproEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpnmeNotEqualTo(String value) {
            addCriterion("FD_APPRO_EMPNME <>", value, "fdApproEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpnmeGreaterThan(String value) {
            addCriterion("FD_APPRO_EMPNME >", value, "fdApproEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpnmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_APPRO_EMPNME >=", value, "fdApproEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpnmeLessThan(String value) {
            addCriterion("FD_APPRO_EMPNME <", value, "fdApproEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpnmeLessThanOrEqualTo(String value) {
            addCriterion("FD_APPRO_EMPNME <=", value, "fdApproEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpnmeLike(String value) {
            addCriterion("FD_APPRO_EMPNME like", value, "fdApproEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpnmeNotLike(String value) {
            addCriterion("FD_APPRO_EMPNME not like", value, "fdApproEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpnmeIn(List<String> values) {
            addCriterion("FD_APPRO_EMPNME in", values, "fdApproEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpnmeNotIn(List<String> values) {
            addCriterion("FD_APPRO_EMPNME not in", values, "fdApproEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpnmeBetween(String value1, String value2) {
            addCriterion("FD_APPRO_EMPNME between", value1, value2, "fdApproEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdApproEmpnmeNotBetween(String value1, String value2) {
            addCriterion("FD_APPRO_EMPNME not between", value1, value2, "fdApproEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdApproDepnmeIsNull() {
            addCriterion("FD_APPRO_DEPNME is null");
            return (Criteria) this;
        }

        public Criteria andFdApproDepnmeIsNotNull() {
            addCriterion("FD_APPRO_DEPNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdApproDepnmeEqualTo(String value) {
            addCriterion("FD_APPRO_DEPNME =", value, "fdApproDepnme");
            return (Criteria) this;
        }

        public Criteria andFdApproDepnmeNotEqualTo(String value) {
            addCriterion("FD_APPRO_DEPNME <>", value, "fdApproDepnme");
            return (Criteria) this;
        }

        public Criteria andFdApproDepnmeGreaterThan(String value) {
            addCriterion("FD_APPRO_DEPNME >", value, "fdApproDepnme");
            return (Criteria) this;
        }

        public Criteria andFdApproDepnmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_APPRO_DEPNME >=", value, "fdApproDepnme");
            return (Criteria) this;
        }

        public Criteria andFdApproDepnmeLessThan(String value) {
            addCriterion("FD_APPRO_DEPNME <", value, "fdApproDepnme");
            return (Criteria) this;
        }

        public Criteria andFdApproDepnmeLessThanOrEqualTo(String value) {
            addCriterion("FD_APPRO_DEPNME <=", value, "fdApproDepnme");
            return (Criteria) this;
        }

        public Criteria andFdApproDepnmeLike(String value) {
            addCriterion("FD_APPRO_DEPNME like", value, "fdApproDepnme");
            return (Criteria) this;
        }

        public Criteria andFdApproDepnmeNotLike(String value) {
            addCriterion("FD_APPRO_DEPNME not like", value, "fdApproDepnme");
            return (Criteria) this;
        }

        public Criteria andFdApproDepnmeIn(List<String> values) {
            addCriterion("FD_APPRO_DEPNME in", values, "fdApproDepnme");
            return (Criteria) this;
        }

        public Criteria andFdApproDepnmeNotIn(List<String> values) {
            addCriterion("FD_APPRO_DEPNME not in", values, "fdApproDepnme");
            return (Criteria) this;
        }

        public Criteria andFdApproDepnmeBetween(String value1, String value2) {
            addCriterion("FD_APPRO_DEPNME between", value1, value2, "fdApproDepnme");
            return (Criteria) this;
        }

        public Criteria andFdApproDepnmeNotBetween(String value1, String value2) {
            addCriterion("FD_APPRO_DEPNME not between", value1, value2, "fdApproDepnme");
            return (Criteria) this;
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