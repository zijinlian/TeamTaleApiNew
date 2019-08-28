package com.work.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TEmpSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TEmpSourceExample() {
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

        public Criteria andTbGaResumeIsNull() {
            addCriterion("TB_GA_RESUME is null");
            return (Criteria) this;
        }

        public Criteria andTbGaResumeIsNotNull() {
            addCriterion("TB_GA_RESUME is not null");
            return (Criteria) this;
        }

        public Criteria andTbGaResumeEqualTo(BigDecimal value) {
            addCriterion("TB_GA_RESUME =", value, "tbGaResume");
            return (Criteria) this;
        }

        public Criteria andTbGaResumeNotEqualTo(BigDecimal value) {
            addCriterion("TB_GA_RESUME <>", value, "tbGaResume");
            return (Criteria) this;
        }

        public Criteria andTbGaResumeGreaterThan(BigDecimal value) {
            addCriterion("TB_GA_RESUME >", value, "tbGaResume");
            return (Criteria) this;
        }

        public Criteria andTbGaResumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_GA_RESUME >=", value, "tbGaResume");
            return (Criteria) this;
        }

        public Criteria andTbGaResumeLessThan(BigDecimal value) {
            addCriterion("TB_GA_RESUME <", value, "tbGaResume");
            return (Criteria) this;
        }

        public Criteria andTbGaResumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_GA_RESUME <=", value, "tbGaResume");
            return (Criteria) this;
        }

        public Criteria andTbGaResumeIn(List<BigDecimal> values) {
            addCriterion("TB_GA_RESUME in", values, "tbGaResume");
            return (Criteria) this;
        }

        public Criteria andTbGaResumeNotIn(List<BigDecimal> values) {
            addCriterion("TB_GA_RESUME not in", values, "tbGaResume");
            return (Criteria) this;
        }

        public Criteria andTbGaResumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_GA_RESUME between", value1, value2, "tbGaResume");
            return (Criteria) this;
        }

        public Criteria andTbGaResumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_GA_RESUME not between", value1, value2, "tbGaResume");
            return (Criteria) this;
        }

        public Criteria andTbGaPerhonorIsNull() {
            addCriterion("TB_GA_PERHONOR is null");
            return (Criteria) this;
        }

        public Criteria andTbGaPerhonorIsNotNull() {
            addCriterion("TB_GA_PERHONOR is not null");
            return (Criteria) this;
        }

        public Criteria andTbGaPerhonorEqualTo(BigDecimal value) {
            addCriterion("TB_GA_PERHONOR =", value, "tbGaPerhonor");
            return (Criteria) this;
        }

        public Criteria andTbGaPerhonorNotEqualTo(BigDecimal value) {
            addCriterion("TB_GA_PERHONOR <>", value, "tbGaPerhonor");
            return (Criteria) this;
        }

        public Criteria andTbGaPerhonorGreaterThan(BigDecimal value) {
            addCriterion("TB_GA_PERHONOR >", value, "tbGaPerhonor");
            return (Criteria) this;
        }

        public Criteria andTbGaPerhonorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_GA_PERHONOR >=", value, "tbGaPerhonor");
            return (Criteria) this;
        }

        public Criteria andTbGaPerhonorLessThan(BigDecimal value) {
            addCriterion("TB_GA_PERHONOR <", value, "tbGaPerhonor");
            return (Criteria) this;
        }

        public Criteria andTbGaPerhonorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_GA_PERHONOR <=", value, "tbGaPerhonor");
            return (Criteria) this;
        }

        public Criteria andTbGaPerhonorIn(List<BigDecimal> values) {
            addCriterion("TB_GA_PERHONOR in", values, "tbGaPerhonor");
            return (Criteria) this;
        }

        public Criteria andTbGaPerhonorNotIn(List<BigDecimal> values) {
            addCriterion("TB_GA_PERHONOR not in", values, "tbGaPerhonor");
            return (Criteria) this;
        }

        public Criteria andTbGaPerhonorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_GA_PERHONOR between", value1, value2, "tbGaPerhonor");
            return (Criteria) this;
        }

        public Criteria andTbGaPerhonorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_GA_PERHONOR not between", value1, value2, "tbGaPerhonor");
            return (Criteria) this;
        }

        public Criteria andTbGaPerformanceIsNull() {
            addCriterion("TB_GA_PERFORMANCE is null");
            return (Criteria) this;
        }

        public Criteria andTbGaPerformanceIsNotNull() {
            addCriterion("TB_GA_PERFORMANCE is not null");
            return (Criteria) this;
        }

        public Criteria andTbGaPerformanceEqualTo(BigDecimal value) {
            addCriterion("TB_GA_PERFORMANCE =", value, "tbGaPerformance");
            return (Criteria) this;
        }

        public Criteria andTbGaPerformanceNotEqualTo(BigDecimal value) {
            addCriterion("TB_GA_PERFORMANCE <>", value, "tbGaPerformance");
            return (Criteria) this;
        }

        public Criteria andTbGaPerformanceGreaterThan(BigDecimal value) {
            addCriterion("TB_GA_PERFORMANCE >", value, "tbGaPerformance");
            return (Criteria) this;
        }

        public Criteria andTbGaPerformanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_GA_PERFORMANCE >=", value, "tbGaPerformance");
            return (Criteria) this;
        }

        public Criteria andTbGaPerformanceLessThan(BigDecimal value) {
            addCriterion("TB_GA_PERFORMANCE <", value, "tbGaPerformance");
            return (Criteria) this;
        }

        public Criteria andTbGaPerformanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_GA_PERFORMANCE <=", value, "tbGaPerformance");
            return (Criteria) this;
        }

        public Criteria andTbGaPerformanceIn(List<BigDecimal> values) {
            addCriterion("TB_GA_PERFORMANCE in", values, "tbGaPerformance");
            return (Criteria) this;
        }

        public Criteria andTbGaPerformanceNotIn(List<BigDecimal> values) {
            addCriterion("TB_GA_PERFORMANCE not in", values, "tbGaPerformance");
            return (Criteria) this;
        }

        public Criteria andTbGaPerformanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_GA_PERFORMANCE between", value1, value2, "tbGaPerformance");
            return (Criteria) this;
        }

        public Criteria andTbGaPerformanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_GA_PERFORMANCE not between", value1, value2, "tbGaPerformance");
            return (Criteria) this;
        }

        public Criteria andTbGaWorkcheckIsNull() {
            addCriterion("TB_GA_WORKCHECK is null");
            return (Criteria) this;
        }

        public Criteria andTbGaWorkcheckIsNotNull() {
            addCriterion("TB_GA_WORKCHECK is not null");
            return (Criteria) this;
        }

        public Criteria andTbGaWorkcheckEqualTo(BigDecimal value) {
            addCriterion("TB_GA_WORKCHECK =", value, "tbGaWorkcheck");
            return (Criteria) this;
        }

        public Criteria andTbGaWorkcheckNotEqualTo(BigDecimal value) {
            addCriterion("TB_GA_WORKCHECK <>", value, "tbGaWorkcheck");
            return (Criteria) this;
        }

        public Criteria andTbGaWorkcheckGreaterThan(BigDecimal value) {
            addCriterion("TB_GA_WORKCHECK >", value, "tbGaWorkcheck");
            return (Criteria) this;
        }

        public Criteria andTbGaWorkcheckGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_GA_WORKCHECK >=", value, "tbGaWorkcheck");
            return (Criteria) this;
        }

        public Criteria andTbGaWorkcheckLessThan(BigDecimal value) {
            addCriterion("TB_GA_WORKCHECK <", value, "tbGaWorkcheck");
            return (Criteria) this;
        }

        public Criteria andTbGaWorkcheckLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_GA_WORKCHECK <=", value, "tbGaWorkcheck");
            return (Criteria) this;
        }

        public Criteria andTbGaWorkcheckIn(List<BigDecimal> values) {
            addCriterion("TB_GA_WORKCHECK in", values, "tbGaWorkcheck");
            return (Criteria) this;
        }

        public Criteria andTbGaWorkcheckNotIn(List<BigDecimal> values) {
            addCriterion("TB_GA_WORKCHECK not in", values, "tbGaWorkcheck");
            return (Criteria) this;
        }

        public Criteria andTbGaWorkcheckBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_GA_WORKCHECK between", value1, value2, "tbGaWorkcheck");
            return (Criteria) this;
        }

        public Criteria andTbGaWorkcheckNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_GA_WORKCHECK not between", value1, value2, "tbGaWorkcheck");
            return (Criteria) this;
        }

        public Criteria andTbGaSkillIsNull() {
            addCriterion("TB_GA_SKILL is null");
            return (Criteria) this;
        }

        public Criteria andTbGaSkillIsNotNull() {
            addCriterion("TB_GA_SKILL is not null");
            return (Criteria) this;
        }

        public Criteria andTbGaSkillEqualTo(BigDecimal value) {
            addCriterion("TB_GA_SKILL =", value, "tbGaSkill");
            return (Criteria) this;
        }

        public Criteria andTbGaSkillNotEqualTo(BigDecimal value) {
            addCriterion("TB_GA_SKILL <>", value, "tbGaSkill");
            return (Criteria) this;
        }

        public Criteria andTbGaSkillGreaterThan(BigDecimal value) {
            addCriterion("TB_GA_SKILL >", value, "tbGaSkill");
            return (Criteria) this;
        }

        public Criteria andTbGaSkillGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_GA_SKILL >=", value, "tbGaSkill");
            return (Criteria) this;
        }

        public Criteria andTbGaSkillLessThan(BigDecimal value) {
            addCriterion("TB_GA_SKILL <", value, "tbGaSkill");
            return (Criteria) this;
        }

        public Criteria andTbGaSkillLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_GA_SKILL <=", value, "tbGaSkill");
            return (Criteria) this;
        }

        public Criteria andTbGaSkillIn(List<BigDecimal> values) {
            addCriterion("TB_GA_SKILL in", values, "tbGaSkill");
            return (Criteria) this;
        }

        public Criteria andTbGaSkillNotIn(List<BigDecimal> values) {
            addCriterion("TB_GA_SKILL not in", values, "tbGaSkill");
            return (Criteria) this;
        }

        public Criteria andTbGaSkillBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_GA_SKILL between", value1, value2, "tbGaSkill");
            return (Criteria) this;
        }

        public Criteria andTbGaSkillNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_GA_SKILL not between", value1, value2, "tbGaSkill");
            return (Criteria) this;
        }

        public Criteria andTbGupDiplomaIsNull() {
            addCriterion("TB_GUP_DIPLOMA is null");
            return (Criteria) this;
        }

        public Criteria andTbGupDiplomaIsNotNull() {
            addCriterion("TB_GUP_DIPLOMA is not null");
            return (Criteria) this;
        }

        public Criteria andTbGupDiplomaEqualTo(BigDecimal value) {
            addCriterion("TB_GUP_DIPLOMA =", value, "tbGupDiploma");
            return (Criteria) this;
        }

        public Criteria andTbGupDiplomaNotEqualTo(BigDecimal value) {
            addCriterion("TB_GUP_DIPLOMA <>", value, "tbGupDiploma");
            return (Criteria) this;
        }

        public Criteria andTbGupDiplomaGreaterThan(BigDecimal value) {
            addCriterion("TB_GUP_DIPLOMA >", value, "tbGupDiploma");
            return (Criteria) this;
        }

        public Criteria andTbGupDiplomaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_GUP_DIPLOMA >=", value, "tbGupDiploma");
            return (Criteria) this;
        }

        public Criteria andTbGupDiplomaLessThan(BigDecimal value) {
            addCriterion("TB_GUP_DIPLOMA <", value, "tbGupDiploma");
            return (Criteria) this;
        }

        public Criteria andTbGupDiplomaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_GUP_DIPLOMA <=", value, "tbGupDiploma");
            return (Criteria) this;
        }

        public Criteria andTbGupDiplomaIn(List<BigDecimal> values) {
            addCriterion("TB_GUP_DIPLOMA in", values, "tbGupDiploma");
            return (Criteria) this;
        }

        public Criteria andTbGupDiplomaNotIn(List<BigDecimal> values) {
            addCriterion("TB_GUP_DIPLOMA not in", values, "tbGupDiploma");
            return (Criteria) this;
        }

        public Criteria andTbGupDiplomaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_GUP_DIPLOMA between", value1, value2, "tbGupDiploma");
            return (Criteria) this;
        }

        public Criteria andTbGupDiplomaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_GUP_DIPLOMA not between", value1, value2, "tbGupDiploma");
            return (Criteria) this;
        }

        public Criteria andTbTeacherCountIsNull() {
            addCriterion("TB_TEACHER_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTbTeacherCountIsNotNull() {
            addCriterion("TB_TEACHER_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTbTeacherCountEqualTo(BigDecimal value) {
            addCriterion("TB_TEACHER_COUNT =", value, "tbTeacherCount");
            return (Criteria) this;
        }

        public Criteria andTbTeacherCountNotEqualTo(BigDecimal value) {
            addCriterion("TB_TEACHER_COUNT <>", value, "tbTeacherCount");
            return (Criteria) this;
        }

        public Criteria andTbTeacherCountGreaterThan(BigDecimal value) {
            addCriterion("TB_TEACHER_COUNT >", value, "tbTeacherCount");
            return (Criteria) this;
        }

        public Criteria andTbTeacherCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_TEACHER_COUNT >=", value, "tbTeacherCount");
            return (Criteria) this;
        }

        public Criteria andTbTeacherCountLessThan(BigDecimal value) {
            addCriterion("TB_TEACHER_COUNT <", value, "tbTeacherCount");
            return (Criteria) this;
        }

        public Criteria andTbTeacherCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_TEACHER_COUNT <=", value, "tbTeacherCount");
            return (Criteria) this;
        }

        public Criteria andTbTeacherCountIn(List<BigDecimal> values) {
            addCriterion("TB_TEACHER_COUNT in", values, "tbTeacherCount");
            return (Criteria) this;
        }

        public Criteria andTbTeacherCountNotIn(List<BigDecimal> values) {
            addCriterion("TB_TEACHER_COUNT not in", values, "tbTeacherCount");
            return (Criteria) this;
        }

        public Criteria andTbTeacherCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_TEACHER_COUNT between", value1, value2, "tbTeacherCount");
            return (Criteria) this;
        }

        public Criteria andTbTeacherCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_TEACHER_COUNT not between", value1, value2, "tbTeacherCount");
            return (Criteria) this;
        }

        public Criteria andTbStudyCountIsNull() {
            addCriterion("TB_STUDY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTbStudyCountIsNotNull() {
            addCriterion("TB_STUDY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTbStudyCountEqualTo(BigDecimal value) {
            addCriterion("TB_STUDY_COUNT =", value, "tbStudyCount");
            return (Criteria) this;
        }

        public Criteria andTbStudyCountNotEqualTo(BigDecimal value) {
            addCriterion("TB_STUDY_COUNT <>", value, "tbStudyCount");
            return (Criteria) this;
        }

        public Criteria andTbStudyCountGreaterThan(BigDecimal value) {
            addCriterion("TB_STUDY_COUNT >", value, "tbStudyCount");
            return (Criteria) this;
        }

        public Criteria andTbStudyCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_STUDY_COUNT >=", value, "tbStudyCount");
            return (Criteria) this;
        }

        public Criteria andTbStudyCountLessThan(BigDecimal value) {
            addCriterion("TB_STUDY_COUNT <", value, "tbStudyCount");
            return (Criteria) this;
        }

        public Criteria andTbStudyCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_STUDY_COUNT <=", value, "tbStudyCount");
            return (Criteria) this;
        }

        public Criteria andTbStudyCountIn(List<BigDecimal> values) {
            addCriterion("TB_STUDY_COUNT in", values, "tbStudyCount");
            return (Criteria) this;
        }

        public Criteria andTbStudyCountNotIn(List<BigDecimal> values) {
            addCriterion("TB_STUDY_COUNT not in", values, "tbStudyCount");
            return (Criteria) this;
        }

        public Criteria andTbStudyCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_STUDY_COUNT between", value1, value2, "tbStudyCount");
            return (Criteria) this;
        }

        public Criteria andTbStudyCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_STUDY_COUNT not between", value1, value2, "tbStudyCount");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("UPDATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UPDATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(String value) {
            addCriterion("UPDATEDATE =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(String value) {
            addCriterion("UPDATEDATE <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(String value) {
            addCriterion("UPDATEDATE >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEDATE >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(String value) {
            addCriterion("UPDATEDATE <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(String value) {
            addCriterion("UPDATEDATE <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLike(String value) {
            addCriterion("UPDATEDATE like", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotLike(String value) {
            addCriterion("UPDATEDATE not like", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<String> values) {
            addCriterion("UPDATEDATE in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<String> values) {
            addCriterion("UPDATEDATE not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(String value1, String value2) {
            addCriterion("UPDATEDATE between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(String value1, String value2) {
            addCriterion("UPDATEDATE not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andTbGaGrouphonorIsNull() {
            addCriterion("TB_GA_GROUPHONOR is null");
            return (Criteria) this;
        }

        public Criteria andTbGaGrouphonorIsNotNull() {
            addCriterion("TB_GA_GROUPHONOR is not null");
            return (Criteria) this;
        }

        public Criteria andTbGaGrouphonorEqualTo(BigDecimal value) {
            addCriterion("TB_GA_GROUPHONOR =", value, "tbGaGrouphonor");
            return (Criteria) this;
        }

        public Criteria andTbGaGrouphonorNotEqualTo(BigDecimal value) {
            addCriterion("TB_GA_GROUPHONOR <>", value, "tbGaGrouphonor");
            return (Criteria) this;
        }

        public Criteria andTbGaGrouphonorGreaterThan(BigDecimal value) {
            addCriterion("TB_GA_GROUPHONOR >", value, "tbGaGrouphonor");
            return (Criteria) this;
        }

        public Criteria andTbGaGrouphonorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_GA_GROUPHONOR >=", value, "tbGaGrouphonor");
            return (Criteria) this;
        }

        public Criteria andTbGaGrouphonorLessThan(BigDecimal value) {
            addCriterion("TB_GA_GROUPHONOR <", value, "tbGaGrouphonor");
            return (Criteria) this;
        }

        public Criteria andTbGaGrouphonorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TB_GA_GROUPHONOR <=", value, "tbGaGrouphonor");
            return (Criteria) this;
        }

        public Criteria andTbGaGrouphonorIn(List<BigDecimal> values) {
            addCriterion("TB_GA_GROUPHONOR in", values, "tbGaGrouphonor");
            return (Criteria) this;
        }

        public Criteria andTbGaGrouphonorNotIn(List<BigDecimal> values) {
            addCriterion("TB_GA_GROUPHONOR not in", values, "tbGaGrouphonor");
            return (Criteria) this;
        }

        public Criteria andTbGaGrouphonorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_GA_GROUPHONOR between", value1, value2, "tbGaGrouphonor");
            return (Criteria) this;
        }

        public Criteria andTbGaGrouphonorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TB_GA_GROUPHONOR not between", value1, value2, "tbGaGrouphonor");
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