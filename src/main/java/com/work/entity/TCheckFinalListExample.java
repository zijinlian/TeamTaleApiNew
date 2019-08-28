package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TCheckFinalListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCheckFinalListExample() {
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

        public Criteria andTbCheckFinalListIdIsNull() {
            addCriterion("TB_CHECK_FINAL_LIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andTbCheckFinalListIdIsNotNull() {
            addCriterion("TB_CHECK_FINAL_LIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTbCheckFinalListIdEqualTo(String value) {
            addCriterion("TB_CHECK_FINAL_LIST_ID =", value, "tbCheckFinalListId");
            return (Criteria) this;
        }

        public Criteria andTbCheckFinalListIdNotEqualTo(String value) {
            addCriterion("TB_CHECK_FINAL_LIST_ID <>", value, "tbCheckFinalListId");
            return (Criteria) this;
        }

        public Criteria andTbCheckFinalListIdGreaterThan(String value) {
            addCriterion("TB_CHECK_FINAL_LIST_ID >", value, "tbCheckFinalListId");
            return (Criteria) this;
        }

        public Criteria andTbCheckFinalListIdGreaterThanOrEqualTo(String value) {
            addCriterion("TB_CHECK_FINAL_LIST_ID >=", value, "tbCheckFinalListId");
            return (Criteria) this;
        }

        public Criteria andTbCheckFinalListIdLessThan(String value) {
            addCriterion("TB_CHECK_FINAL_LIST_ID <", value, "tbCheckFinalListId");
            return (Criteria) this;
        }

        public Criteria andTbCheckFinalListIdLessThanOrEqualTo(String value) {
            addCriterion("TB_CHECK_FINAL_LIST_ID <=", value, "tbCheckFinalListId");
            return (Criteria) this;
        }

        public Criteria andTbCheckFinalListIdLike(String value) {
            addCriterion("TB_CHECK_FINAL_LIST_ID like", value, "tbCheckFinalListId");
            return (Criteria) this;
        }

        public Criteria andTbCheckFinalListIdNotLike(String value) {
            addCriterion("TB_CHECK_FINAL_LIST_ID not like", value, "tbCheckFinalListId");
            return (Criteria) this;
        }

        public Criteria andTbCheckFinalListIdIn(List<String> values) {
            addCriterion("TB_CHECK_FINAL_LIST_ID in", values, "tbCheckFinalListId");
            return (Criteria) this;
        }

        public Criteria andTbCheckFinalListIdNotIn(List<String> values) {
            addCriterion("TB_CHECK_FINAL_LIST_ID not in", values, "tbCheckFinalListId");
            return (Criteria) this;
        }

        public Criteria andTbCheckFinalListIdBetween(String value1, String value2) {
            addCriterion("TB_CHECK_FINAL_LIST_ID between", value1, value2, "tbCheckFinalListId");
            return (Criteria) this;
        }

        public Criteria andTbCheckFinalListIdNotBetween(String value1, String value2) {
            addCriterion("TB_CHECK_FINAL_LIST_ID not between", value1, value2, "tbCheckFinalListId");
            return (Criteria) this;
        }

        public Criteria andFdFinalListSubjectIsNull() {
            addCriterion("FD_FINAL_LIST_SUBJECT is null");
            return (Criteria) this;
        }

        public Criteria andFdFinalListSubjectIsNotNull() {
            addCriterion("FD_FINAL_LIST_SUBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andFdFinalListSubjectEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_SUBJECT =", value, "fdFinalListSubject");
            return (Criteria) this;
        }

        public Criteria andFdFinalListSubjectNotEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_SUBJECT <>", value, "fdFinalListSubject");
            return (Criteria) this;
        }

        public Criteria andFdFinalListSubjectGreaterThan(String value) {
            addCriterion("FD_FINAL_LIST_SUBJECT >", value, "fdFinalListSubject");
            return (Criteria) this;
        }

        public Criteria andFdFinalListSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_SUBJECT >=", value, "fdFinalListSubject");
            return (Criteria) this;
        }

        public Criteria andFdFinalListSubjectLessThan(String value) {
            addCriterion("FD_FINAL_LIST_SUBJECT <", value, "fdFinalListSubject");
            return (Criteria) this;
        }

        public Criteria andFdFinalListSubjectLessThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_SUBJECT <=", value, "fdFinalListSubject");
            return (Criteria) this;
        }

        public Criteria andFdFinalListSubjectLike(String value) {
            addCriterion("FD_FINAL_LIST_SUBJECT like", value, "fdFinalListSubject");
            return (Criteria) this;
        }

        public Criteria andFdFinalListSubjectNotLike(String value) {
            addCriterion("FD_FINAL_LIST_SUBJECT not like", value, "fdFinalListSubject");
            return (Criteria) this;
        }

        public Criteria andFdFinalListSubjectIn(List<String> values) {
            addCriterion("FD_FINAL_LIST_SUBJECT in", values, "fdFinalListSubject");
            return (Criteria) this;
        }

        public Criteria andFdFinalListSubjectNotIn(List<String> values) {
            addCriterion("FD_FINAL_LIST_SUBJECT not in", values, "fdFinalListSubject");
            return (Criteria) this;
        }

        public Criteria andFdFinalListSubjectBetween(String value1, String value2) {
            addCriterion("FD_FINAL_LIST_SUBJECT between", value1, value2, "fdFinalListSubject");
            return (Criteria) this;
        }

        public Criteria andFdFinalListSubjectNotBetween(String value1, String value2) {
            addCriterion("FD_FINAL_LIST_SUBJECT not between", value1, value2, "fdFinalListSubject");
            return (Criteria) this;
        }

        public Criteria andFdFinalListDateIsNull() {
            addCriterion("FD_FINAL_LIST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFdFinalListDateIsNotNull() {
            addCriterion("FD_FINAL_LIST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdFinalListDateEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_DATE =", value, "fdFinalListDate");
            return (Criteria) this;
        }

        public Criteria andFdFinalListDateNotEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_DATE <>", value, "fdFinalListDate");
            return (Criteria) this;
        }

        public Criteria andFdFinalListDateGreaterThan(String value) {
            addCriterion("FD_FINAL_LIST_DATE >", value, "fdFinalListDate");
            return (Criteria) this;
        }

        public Criteria andFdFinalListDateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_DATE >=", value, "fdFinalListDate");
            return (Criteria) this;
        }

        public Criteria andFdFinalListDateLessThan(String value) {
            addCriterion("FD_FINAL_LIST_DATE <", value, "fdFinalListDate");
            return (Criteria) this;
        }

        public Criteria andFdFinalListDateLessThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_DATE <=", value, "fdFinalListDate");
            return (Criteria) this;
        }

        public Criteria andFdFinalListDateLike(String value) {
            addCriterion("FD_FINAL_LIST_DATE like", value, "fdFinalListDate");
            return (Criteria) this;
        }

        public Criteria andFdFinalListDateNotLike(String value) {
            addCriterion("FD_FINAL_LIST_DATE not like", value, "fdFinalListDate");
            return (Criteria) this;
        }

        public Criteria andFdFinalListDateIn(List<String> values) {
            addCriterion("FD_FINAL_LIST_DATE in", values, "fdFinalListDate");
            return (Criteria) this;
        }

        public Criteria andFdFinalListDateNotIn(List<String> values) {
            addCriterion("FD_FINAL_LIST_DATE not in", values, "fdFinalListDate");
            return (Criteria) this;
        }

        public Criteria andFdFinalListDateBetween(String value1, String value2) {
            addCriterion("FD_FINAL_LIST_DATE between", value1, value2, "fdFinalListDate");
            return (Criteria) this;
        }

        public Criteria andFdFinalListDateNotBetween(String value1, String value2) {
            addCriterion("FD_FINAL_LIST_DATE not between", value1, value2, "fdFinalListDate");
            return (Criteria) this;
        }

        public Criteria andFdFinalListBodiesIsNull() {
            addCriterion("FD_FINAL_LIST_BODIES is null");
            return (Criteria) this;
        }

        public Criteria andFdFinalListBodiesIsNotNull() {
            addCriterion("FD_FINAL_LIST_BODIES is not null");
            return (Criteria) this;
        }

        public Criteria andFdFinalListBodiesEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_BODIES =", value, "fdFinalListBodies");
            return (Criteria) this;
        }

        public Criteria andFdFinalListBodiesNotEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_BODIES <>", value, "fdFinalListBodies");
            return (Criteria) this;
        }

        public Criteria andFdFinalListBodiesGreaterThan(String value) {
            addCriterion("FD_FINAL_LIST_BODIES >", value, "fdFinalListBodies");
            return (Criteria) this;
        }

        public Criteria andFdFinalListBodiesGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_BODIES >=", value, "fdFinalListBodies");
            return (Criteria) this;
        }

        public Criteria andFdFinalListBodiesLessThan(String value) {
            addCriterion("FD_FINAL_LIST_BODIES <", value, "fdFinalListBodies");
            return (Criteria) this;
        }

        public Criteria andFdFinalListBodiesLessThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_BODIES <=", value, "fdFinalListBodies");
            return (Criteria) this;
        }

        public Criteria andFdFinalListBodiesLike(String value) {
            addCriterion("FD_FINAL_LIST_BODIES like", value, "fdFinalListBodies");
            return (Criteria) this;
        }

        public Criteria andFdFinalListBodiesNotLike(String value) {
            addCriterion("FD_FINAL_LIST_BODIES not like", value, "fdFinalListBodies");
            return (Criteria) this;
        }

        public Criteria andFdFinalListBodiesIn(List<String> values) {
            addCriterion("FD_FINAL_LIST_BODIES in", values, "fdFinalListBodies");
            return (Criteria) this;
        }

        public Criteria andFdFinalListBodiesNotIn(List<String> values) {
            addCriterion("FD_FINAL_LIST_BODIES not in", values, "fdFinalListBodies");
            return (Criteria) this;
        }

        public Criteria andFdFinalListBodiesBetween(String value1, String value2) {
            addCriterion("FD_FINAL_LIST_BODIES between", value1, value2, "fdFinalListBodies");
            return (Criteria) this;
        }

        public Criteria andFdFinalListBodiesNotBetween(String value1, String value2) {
            addCriterion("FD_FINAL_LIST_BODIES not between", value1, value2, "fdFinalListBodies");
            return (Criteria) this;
        }

        public Criteria andFdFinalListRiskIsNull() {
            addCriterion("FD_FINAL_LIST_RISK is null");
            return (Criteria) this;
        }

        public Criteria andFdFinalListRiskIsNotNull() {
            addCriterion("FD_FINAL_LIST_RISK is not null");
            return (Criteria) this;
        }

        public Criteria andFdFinalListRiskEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_RISK =", value, "fdFinalListRisk");
            return (Criteria) this;
        }

        public Criteria andFdFinalListRiskNotEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_RISK <>", value, "fdFinalListRisk");
            return (Criteria) this;
        }

        public Criteria andFdFinalListRiskGreaterThan(String value) {
            addCriterion("FD_FINAL_LIST_RISK >", value, "fdFinalListRisk");
            return (Criteria) this;
        }

        public Criteria andFdFinalListRiskGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_RISK >=", value, "fdFinalListRisk");
            return (Criteria) this;
        }

        public Criteria andFdFinalListRiskLessThan(String value) {
            addCriterion("FD_FINAL_LIST_RISK <", value, "fdFinalListRisk");
            return (Criteria) this;
        }

        public Criteria andFdFinalListRiskLessThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_RISK <=", value, "fdFinalListRisk");
            return (Criteria) this;
        }

        public Criteria andFdFinalListRiskLike(String value) {
            addCriterion("FD_FINAL_LIST_RISK like", value, "fdFinalListRisk");
            return (Criteria) this;
        }

        public Criteria andFdFinalListRiskNotLike(String value) {
            addCriterion("FD_FINAL_LIST_RISK not like", value, "fdFinalListRisk");
            return (Criteria) this;
        }

        public Criteria andFdFinalListRiskIn(List<String> values) {
            addCriterion("FD_FINAL_LIST_RISK in", values, "fdFinalListRisk");
            return (Criteria) this;
        }

        public Criteria andFdFinalListRiskNotIn(List<String> values) {
            addCriterion("FD_FINAL_LIST_RISK not in", values, "fdFinalListRisk");
            return (Criteria) this;
        }

        public Criteria andFdFinalListRiskBetween(String value1, String value2) {
            addCriterion("FD_FINAL_LIST_RISK between", value1, value2, "fdFinalListRisk");
            return (Criteria) this;
        }

        public Criteria andFdFinalListRiskNotBetween(String value1, String value2) {
            addCriterion("FD_FINAL_LIST_RISK not between", value1, value2, "fdFinalListRisk");
            return (Criteria) this;
        }

        public Criteria andFdFinalListStatusIsNull() {
            addCriterion("FD_FINAL_LIST_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFdFinalListStatusIsNotNull() {
            addCriterion("FD_FINAL_LIST_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFdFinalListStatusEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_STATUS =", value, "fdFinalListStatus");
            return (Criteria) this;
        }

        public Criteria andFdFinalListStatusNotEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_STATUS <>", value, "fdFinalListStatus");
            return (Criteria) this;
        }

        public Criteria andFdFinalListStatusGreaterThan(String value) {
            addCriterion("FD_FINAL_LIST_STATUS >", value, "fdFinalListStatus");
            return (Criteria) this;
        }

        public Criteria andFdFinalListStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_STATUS >=", value, "fdFinalListStatus");
            return (Criteria) this;
        }

        public Criteria andFdFinalListStatusLessThan(String value) {
            addCriterion("FD_FINAL_LIST_STATUS <", value, "fdFinalListStatus");
            return (Criteria) this;
        }

        public Criteria andFdFinalListStatusLessThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_STATUS <=", value, "fdFinalListStatus");
            return (Criteria) this;
        }

        public Criteria andFdFinalListStatusLike(String value) {
            addCriterion("FD_FINAL_LIST_STATUS like", value, "fdFinalListStatus");
            return (Criteria) this;
        }

        public Criteria andFdFinalListStatusNotLike(String value) {
            addCriterion("FD_FINAL_LIST_STATUS not like", value, "fdFinalListStatus");
            return (Criteria) this;
        }

        public Criteria andFdFinalListStatusIn(List<String> values) {
            addCriterion("FD_FINAL_LIST_STATUS in", values, "fdFinalListStatus");
            return (Criteria) this;
        }

        public Criteria andFdFinalListStatusNotIn(List<String> values) {
            addCriterion("FD_FINAL_LIST_STATUS not in", values, "fdFinalListStatus");
            return (Criteria) this;
        }

        public Criteria andFdFinalListStatusBetween(String value1, String value2) {
            addCriterion("FD_FINAL_LIST_STATUS between", value1, value2, "fdFinalListStatus");
            return (Criteria) this;
        }

        public Criteria andFdFinalListStatusNotBetween(String value1, String value2) {
            addCriterion("FD_FINAL_LIST_STATUS not between", value1, value2, "fdFinalListStatus");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBewriteIsNull() {
            addCriterion("FD_CHECK_FINAL_BEWRITE is null");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBewriteIsNotNull() {
            addCriterion("FD_CHECK_FINAL_BEWRITE is not null");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBewriteEqualTo(String value) {
            addCriterion("FD_CHECK_FINAL_BEWRITE =", value, "fdCheckFinalBewrite");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBewriteNotEqualTo(String value) {
            addCriterion("FD_CHECK_FINAL_BEWRITE <>", value, "fdCheckFinalBewrite");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBewriteGreaterThan(String value) {
            addCriterion("FD_CHECK_FINAL_BEWRITE >", value, "fdCheckFinalBewrite");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBewriteGreaterThanOrEqualTo(String value) {
            addCriterion("FD_CHECK_FINAL_BEWRITE >=", value, "fdCheckFinalBewrite");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBewriteLessThan(String value) {
            addCriterion("FD_CHECK_FINAL_BEWRITE <", value, "fdCheckFinalBewrite");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBewriteLessThanOrEqualTo(String value) {
            addCriterion("FD_CHECK_FINAL_BEWRITE <=", value, "fdCheckFinalBewrite");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBewriteLike(String value) {
            addCriterion("FD_CHECK_FINAL_BEWRITE like", value, "fdCheckFinalBewrite");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBewriteNotLike(String value) {
            addCriterion("FD_CHECK_FINAL_BEWRITE not like", value, "fdCheckFinalBewrite");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBewriteIn(List<String> values) {
            addCriterion("FD_CHECK_FINAL_BEWRITE in", values, "fdCheckFinalBewrite");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBewriteNotIn(List<String> values) {
            addCriterion("FD_CHECK_FINAL_BEWRITE not in", values, "fdCheckFinalBewrite");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBewriteBetween(String value1, String value2) {
            addCriterion("FD_CHECK_FINAL_BEWRITE between", value1, value2, "fdCheckFinalBewrite");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBewriteNotBetween(String value1, String value2) {
            addCriterion("FD_CHECK_FINAL_BEWRITE not between", value1, value2, "fdCheckFinalBewrite");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBodiesIdIsNull() {
            addCriterion("FD_CHECK_FINAL_BODIES_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBodiesIdIsNotNull() {
            addCriterion("FD_CHECK_FINAL_BODIES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBodiesIdEqualTo(String value) {
            addCriterion("FD_CHECK_FINAL_BODIES_ID =", value, "fdCheckFinalBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBodiesIdNotEqualTo(String value) {
            addCriterion("FD_CHECK_FINAL_BODIES_ID <>", value, "fdCheckFinalBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBodiesIdGreaterThan(String value) {
            addCriterion("FD_CHECK_FINAL_BODIES_ID >", value, "fdCheckFinalBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBodiesIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_CHECK_FINAL_BODIES_ID >=", value, "fdCheckFinalBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBodiesIdLessThan(String value) {
            addCriterion("FD_CHECK_FINAL_BODIES_ID <", value, "fdCheckFinalBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBodiesIdLessThanOrEqualTo(String value) {
            addCriterion("FD_CHECK_FINAL_BODIES_ID <=", value, "fdCheckFinalBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBodiesIdLike(String value) {
            addCriterion("FD_CHECK_FINAL_BODIES_ID like", value, "fdCheckFinalBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBodiesIdNotLike(String value) {
            addCriterion("FD_CHECK_FINAL_BODIES_ID not like", value, "fdCheckFinalBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBodiesIdIn(List<String> values) {
            addCriterion("FD_CHECK_FINAL_BODIES_ID in", values, "fdCheckFinalBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBodiesIdNotIn(List<String> values) {
            addCriterion("FD_CHECK_FINAL_BODIES_ID not in", values, "fdCheckFinalBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBodiesIdBetween(String value1, String value2) {
            addCriterion("FD_CHECK_FINAL_BODIES_ID between", value1, value2, "fdCheckFinalBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdCheckFinalBodiesIdNotBetween(String value1, String value2) {
            addCriterion("FD_CHECK_FINAL_BODIES_ID not between", value1, value2, "fdCheckFinalBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdAttachRelIdIsNull() {
            addCriterion("FD_ATTACH_REL_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdAttachRelIdIsNotNull() {
            addCriterion("FD_ATTACH_REL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdAttachRelIdEqualTo(String value) {
            addCriterion("FD_ATTACH_REL_ID =", value, "fdAttachRelId");
            return (Criteria) this;
        }

        public Criteria andFdAttachRelIdNotEqualTo(String value) {
            addCriterion("FD_ATTACH_REL_ID <>", value, "fdAttachRelId");
            return (Criteria) this;
        }

        public Criteria andFdAttachRelIdGreaterThan(String value) {
            addCriterion("FD_ATTACH_REL_ID >", value, "fdAttachRelId");
            return (Criteria) this;
        }

        public Criteria andFdAttachRelIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ATTACH_REL_ID >=", value, "fdAttachRelId");
            return (Criteria) this;
        }

        public Criteria andFdAttachRelIdLessThan(String value) {
            addCriterion("FD_ATTACH_REL_ID <", value, "fdAttachRelId");
            return (Criteria) this;
        }

        public Criteria andFdAttachRelIdLessThanOrEqualTo(String value) {
            addCriterion("FD_ATTACH_REL_ID <=", value, "fdAttachRelId");
            return (Criteria) this;
        }

        public Criteria andFdAttachRelIdLike(String value) {
            addCriterion("FD_ATTACH_REL_ID like", value, "fdAttachRelId");
            return (Criteria) this;
        }

        public Criteria andFdAttachRelIdNotLike(String value) {
            addCriterion("FD_ATTACH_REL_ID not like", value, "fdAttachRelId");
            return (Criteria) this;
        }

        public Criteria andFdAttachRelIdIn(List<String> values) {
            addCriterion("FD_ATTACH_REL_ID in", values, "fdAttachRelId");
            return (Criteria) this;
        }

        public Criteria andFdAttachRelIdNotIn(List<String> values) {
            addCriterion("FD_ATTACH_REL_ID not in", values, "fdAttachRelId");
            return (Criteria) this;
        }

        public Criteria andFdAttachRelIdBetween(String value1, String value2) {
            addCriterion("FD_ATTACH_REL_ID between", value1, value2, "fdAttachRelId");
            return (Criteria) this;
        }

        public Criteria andFdAttachRelIdNotBetween(String value1, String value2) {
            addCriterion("FD_ATTACH_REL_ID not between", value1, value2, "fdAttachRelId");
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