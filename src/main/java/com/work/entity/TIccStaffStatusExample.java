package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TIccStaffStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TIccStaffStatusExample() {
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

        public Criteria andFdStaffIdIsNull() {
            addCriterion("FD_STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdIsNotNull() {
            addCriterion("FD_STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdEqualTo(String value) {
            addCriterion("FD_STAFF_ID =", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdNotEqualTo(String value) {
            addCriterion("FD_STAFF_ID <>", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdGreaterThan(String value) {
            addCriterion("FD_STAFF_ID >", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_STAFF_ID >=", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdLessThan(String value) {
            addCriterion("FD_STAFF_ID <", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdLessThanOrEqualTo(String value) {
            addCriterion("FD_STAFF_ID <=", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdLike(String value) {
            addCriterion("FD_STAFF_ID like", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdNotLike(String value) {
            addCriterion("FD_STAFF_ID not like", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdIn(List<String> values) {
            addCriterion("FD_STAFF_ID in", values, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdNotIn(List<String> values) {
            addCriterion("FD_STAFF_ID not in", values, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdBetween(String value1, String value2) {
            addCriterion("FD_STAFF_ID between", value1, value2, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdNotBetween(String value1, String value2) {
            addCriterion("FD_STAFF_ID not between", value1, value2, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdIsNull() {
            addCriterion("FD_PAPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdIsNotNull() {
            addCriterion("FD_PAPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdEqualTo(String value) {
            addCriterion("FD_PAPER_ID =", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdNotEqualTo(String value) {
            addCriterion("FD_PAPER_ID <>", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdGreaterThan(String value) {
            addCriterion("FD_PAPER_ID >", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_PAPER_ID >=", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdLessThan(String value) {
            addCriterion("FD_PAPER_ID <", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdLessThanOrEqualTo(String value) {
            addCriterion("FD_PAPER_ID <=", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdLike(String value) {
            addCriterion("FD_PAPER_ID like", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdNotLike(String value) {
            addCriterion("FD_PAPER_ID not like", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdIn(List<String> values) {
            addCriterion("FD_PAPER_ID in", values, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdNotIn(List<String> values) {
            addCriterion("FD_PAPER_ID not in", values, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdBetween(String value1, String value2) {
            addCriterion("FD_PAPER_ID between", value1, value2, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdNotBetween(String value1, String value2) {
            addCriterion("FD_PAPER_ID not between", value1, value2, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdStaffStatusDateIsNull() {
            addCriterion("FD_STAFF_STATUS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFdStaffStatusDateIsNotNull() {
            addCriterion("FD_STAFF_STATUS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdStaffStatusDateEqualTo(String value) {
            addCriterion("FD_STAFF_STATUS_DATE =", value, "fdStaffStatusDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffStatusDateNotEqualTo(String value) {
            addCriterion("FD_STAFF_STATUS_DATE <>", value, "fdStaffStatusDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffStatusDateGreaterThan(String value) {
            addCriterion("FD_STAFF_STATUS_DATE >", value, "fdStaffStatusDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffStatusDateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_STAFF_STATUS_DATE >=", value, "fdStaffStatusDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffStatusDateLessThan(String value) {
            addCriterion("FD_STAFF_STATUS_DATE <", value, "fdStaffStatusDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffStatusDateLessThanOrEqualTo(String value) {
            addCriterion("FD_STAFF_STATUS_DATE <=", value, "fdStaffStatusDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffStatusDateLike(String value) {
            addCriterion("FD_STAFF_STATUS_DATE like", value, "fdStaffStatusDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffStatusDateNotLike(String value) {
            addCriterion("FD_STAFF_STATUS_DATE not like", value, "fdStaffStatusDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffStatusDateIn(List<String> values) {
            addCriterion("FD_STAFF_STATUS_DATE in", values, "fdStaffStatusDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffStatusDateNotIn(List<String> values) {
            addCriterion("FD_STAFF_STATUS_DATE not in", values, "fdStaffStatusDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffStatusDateBetween(String value1, String value2) {
            addCriterion("FD_STAFF_STATUS_DATE between", value1, value2, "fdStaffStatusDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffStatusDateNotBetween(String value1, String value2) {
            addCriterion("FD_STAFF_STATUS_DATE not between", value1, value2, "fdStaffStatusDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffScoreIsNull() {
            addCriterion("FD_STAFF_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andFdStaffScoreIsNotNull() {
            addCriterion("FD_STAFF_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andFdStaffScoreEqualTo(String value) {
            addCriterion("FD_STAFF_SCORE =", value, "fdStaffScore");
            return (Criteria) this;
        }

        public Criteria andFdStaffScoreNotEqualTo(String value) {
            addCriterion("FD_STAFF_SCORE <>", value, "fdStaffScore");
            return (Criteria) this;
        }

        public Criteria andFdStaffScoreGreaterThan(String value) {
            addCriterion("FD_STAFF_SCORE >", value, "fdStaffScore");
            return (Criteria) this;
        }

        public Criteria andFdStaffScoreGreaterThanOrEqualTo(String value) {
            addCriterion("FD_STAFF_SCORE >=", value, "fdStaffScore");
            return (Criteria) this;
        }

        public Criteria andFdStaffScoreLessThan(String value) {
            addCriterion("FD_STAFF_SCORE <", value, "fdStaffScore");
            return (Criteria) this;
        }

        public Criteria andFdStaffScoreLessThanOrEqualTo(String value) {
            addCriterion("FD_STAFF_SCORE <=", value, "fdStaffScore");
            return (Criteria) this;
        }

        public Criteria andFdStaffScoreLike(String value) {
            addCriterion("FD_STAFF_SCORE like", value, "fdStaffScore");
            return (Criteria) this;
        }

        public Criteria andFdStaffScoreNotLike(String value) {
            addCriterion("FD_STAFF_SCORE not like", value, "fdStaffScore");
            return (Criteria) this;
        }

        public Criteria andFdStaffScoreIn(List<String> values) {
            addCriterion("FD_STAFF_SCORE in", values, "fdStaffScore");
            return (Criteria) this;
        }

        public Criteria andFdStaffScoreNotIn(List<String> values) {
            addCriterion("FD_STAFF_SCORE not in", values, "fdStaffScore");
            return (Criteria) this;
        }

        public Criteria andFdStaffScoreBetween(String value1, String value2) {
            addCriterion("FD_STAFF_SCORE between", value1, value2, "fdStaffScore");
            return (Criteria) this;
        }

        public Criteria andFdStaffScoreNotBetween(String value1, String value2) {
            addCriterion("FD_STAFF_SCORE not between", value1, value2, "fdStaffScore");
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