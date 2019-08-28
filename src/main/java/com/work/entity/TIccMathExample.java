package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TIccMathExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TIccMathExample() {
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

        public Criteria andFdMathsIdIsNull() {
            addCriterion("FD_MATHS_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdMathsIdIsNotNull() {
            addCriterion("FD_MATHS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdMathsIdEqualTo(String value) {
            addCriterion("FD_MATHS_ID =", value, "fdMathsId");
            return (Criteria) this;
        }

        public Criteria andFdMathsIdNotEqualTo(String value) {
            addCriterion("FD_MATHS_ID <>", value, "fdMathsId");
            return (Criteria) this;
        }

        public Criteria andFdMathsIdGreaterThan(String value) {
            addCriterion("FD_MATHS_ID >", value, "fdMathsId");
            return (Criteria) this;
        }

        public Criteria andFdMathsIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_MATHS_ID >=", value, "fdMathsId");
            return (Criteria) this;
        }

        public Criteria andFdMathsIdLessThan(String value) {
            addCriterion("FD_MATHS_ID <", value, "fdMathsId");
            return (Criteria) this;
        }

        public Criteria andFdMathsIdLessThanOrEqualTo(String value) {
            addCriterion("FD_MATHS_ID <=", value, "fdMathsId");
            return (Criteria) this;
        }

        public Criteria andFdMathsIdLike(String value) {
            addCriterion("FD_MATHS_ID like", value, "fdMathsId");
            return (Criteria) this;
        }

        public Criteria andFdMathsIdNotLike(String value) {
            addCriterion("FD_MATHS_ID not like", value, "fdMathsId");
            return (Criteria) this;
        }

        public Criteria andFdMathsIdIn(List<String> values) {
            addCriterion("FD_MATHS_ID in", values, "fdMathsId");
            return (Criteria) this;
        }

        public Criteria andFdMathsIdNotIn(List<String> values) {
            addCriterion("FD_MATHS_ID not in", values, "fdMathsId");
            return (Criteria) this;
        }

        public Criteria andFdMathsIdBetween(String value1, String value2) {
            addCriterion("FD_MATHS_ID between", value1, value2, "fdMathsId");
            return (Criteria) this;
        }

        public Criteria andFdMathsIdNotBetween(String value1, String value2) {
            addCriterion("FD_MATHS_ID not between", value1, value2, "fdMathsId");
            return (Criteria) this;
        }

        public Criteria andFdMathsNameIsNull() {
            addCriterion("FD_MATHS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFdMathsNameIsNotNull() {
            addCriterion("FD_MATHS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFdMathsNameEqualTo(String value) {
            addCriterion("FD_MATHS_NAME =", value, "fdMathsName");
            return (Criteria) this;
        }

        public Criteria andFdMathsNameNotEqualTo(String value) {
            addCriterion("FD_MATHS_NAME <>", value, "fdMathsName");
            return (Criteria) this;
        }

        public Criteria andFdMathsNameGreaterThan(String value) {
            addCriterion("FD_MATHS_NAME >", value, "fdMathsName");
            return (Criteria) this;
        }

        public Criteria andFdMathsNameGreaterThanOrEqualTo(String value) {
            addCriterion("FD_MATHS_NAME >=", value, "fdMathsName");
            return (Criteria) this;
        }

        public Criteria andFdMathsNameLessThan(String value) {
            addCriterion("FD_MATHS_NAME <", value, "fdMathsName");
            return (Criteria) this;
        }

        public Criteria andFdMathsNameLessThanOrEqualTo(String value) {
            addCriterion("FD_MATHS_NAME <=", value, "fdMathsName");
            return (Criteria) this;
        }

        public Criteria andFdMathsNameLike(String value) {
            addCriterion("FD_MATHS_NAME like", value, "fdMathsName");
            return (Criteria) this;
        }

        public Criteria andFdMathsNameNotLike(String value) {
            addCriterion("FD_MATHS_NAME not like", value, "fdMathsName");
            return (Criteria) this;
        }

        public Criteria andFdMathsNameIn(List<String> values) {
            addCriterion("FD_MATHS_NAME in", values, "fdMathsName");
            return (Criteria) this;
        }

        public Criteria andFdMathsNameNotIn(List<String> values) {
            addCriterion("FD_MATHS_NAME not in", values, "fdMathsName");
            return (Criteria) this;
        }

        public Criteria andFdMathsNameBetween(String value1, String value2) {
            addCriterion("FD_MATHS_NAME between", value1, value2, "fdMathsName");
            return (Criteria) this;
        }

        public Criteria andFdMathsNameNotBetween(String value1, String value2) {
            addCriterion("FD_MATHS_NAME not between", value1, value2, "fdMathsName");
            return (Criteria) this;
        }

        public Criteria andFdMathsMarkIsNull() {
            addCriterion("FD_MATHS_MARK is null");
            return (Criteria) this;
        }

        public Criteria andFdMathsMarkIsNotNull() {
            addCriterion("FD_MATHS_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andFdMathsMarkEqualTo(String value) {
            addCriterion("FD_MATHS_MARK =", value, "fdMathsMark");
            return (Criteria) this;
        }

        public Criteria andFdMathsMarkNotEqualTo(String value) {
            addCriterion("FD_MATHS_MARK <>", value, "fdMathsMark");
            return (Criteria) this;
        }

        public Criteria andFdMathsMarkGreaterThan(String value) {
            addCriterion("FD_MATHS_MARK >", value, "fdMathsMark");
            return (Criteria) this;
        }

        public Criteria andFdMathsMarkGreaterThanOrEqualTo(String value) {
            addCriterion("FD_MATHS_MARK >=", value, "fdMathsMark");
            return (Criteria) this;
        }

        public Criteria andFdMathsMarkLessThan(String value) {
            addCriterion("FD_MATHS_MARK <", value, "fdMathsMark");
            return (Criteria) this;
        }

        public Criteria andFdMathsMarkLessThanOrEqualTo(String value) {
            addCriterion("FD_MATHS_MARK <=", value, "fdMathsMark");
            return (Criteria) this;
        }

        public Criteria andFdMathsMarkLike(String value) {
            addCriterion("FD_MATHS_MARK like", value, "fdMathsMark");
            return (Criteria) this;
        }

        public Criteria andFdMathsMarkNotLike(String value) {
            addCriterion("FD_MATHS_MARK not like", value, "fdMathsMark");
            return (Criteria) this;
        }

        public Criteria andFdMathsMarkIn(List<String> values) {
            addCriterion("FD_MATHS_MARK in", values, "fdMathsMark");
            return (Criteria) this;
        }

        public Criteria andFdMathsMarkNotIn(List<String> values) {
            addCriterion("FD_MATHS_MARK not in", values, "fdMathsMark");
            return (Criteria) this;
        }

        public Criteria andFdMathsMarkBetween(String value1, String value2) {
            addCriterion("FD_MATHS_MARK between", value1, value2, "fdMathsMark");
            return (Criteria) this;
        }

        public Criteria andFdMathsMarkNotBetween(String value1, String value2) {
            addCriterion("FD_MATHS_MARK not between", value1, value2, "fdMathsMark");
            return (Criteria) this;
        }

        public Criteria andFdMathsPeopleIsNull() {
            addCriterion("FD_MATHS_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andFdMathsPeopleIsNotNull() {
            addCriterion("FD_MATHS_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andFdMathsPeopleEqualTo(String value) {
            addCriterion("FD_MATHS_PEOPLE =", value, "fdMathsPeople");
            return (Criteria) this;
        }

        public Criteria andFdMathsPeopleNotEqualTo(String value) {
            addCriterion("FD_MATHS_PEOPLE <>", value, "fdMathsPeople");
            return (Criteria) this;
        }

        public Criteria andFdMathsPeopleGreaterThan(String value) {
            addCriterion("FD_MATHS_PEOPLE >", value, "fdMathsPeople");
            return (Criteria) this;
        }

        public Criteria andFdMathsPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("FD_MATHS_PEOPLE >=", value, "fdMathsPeople");
            return (Criteria) this;
        }

        public Criteria andFdMathsPeopleLessThan(String value) {
            addCriterion("FD_MATHS_PEOPLE <", value, "fdMathsPeople");
            return (Criteria) this;
        }

        public Criteria andFdMathsPeopleLessThanOrEqualTo(String value) {
            addCriterion("FD_MATHS_PEOPLE <=", value, "fdMathsPeople");
            return (Criteria) this;
        }

        public Criteria andFdMathsPeopleLike(String value) {
            addCriterion("FD_MATHS_PEOPLE like", value, "fdMathsPeople");
            return (Criteria) this;
        }

        public Criteria andFdMathsPeopleNotLike(String value) {
            addCriterion("FD_MATHS_PEOPLE not like", value, "fdMathsPeople");
            return (Criteria) this;
        }

        public Criteria andFdMathsPeopleIn(List<String> values) {
            addCriterion("FD_MATHS_PEOPLE in", values, "fdMathsPeople");
            return (Criteria) this;
        }

        public Criteria andFdMathsPeopleNotIn(List<String> values) {
            addCriterion("FD_MATHS_PEOPLE not in", values, "fdMathsPeople");
            return (Criteria) this;
        }

        public Criteria andFdMathsPeopleBetween(String value1, String value2) {
            addCriterion("FD_MATHS_PEOPLE between", value1, value2, "fdMathsPeople");
            return (Criteria) this;
        }

        public Criteria andFdMathsPeopleNotBetween(String value1, String value2) {
            addCriterion("FD_MATHS_PEOPLE not between", value1, value2, "fdMathsPeople");
            return (Criteria) this;
        }

        public Criteria andFdMathsDateIsNull() {
            addCriterion("FD_MATHS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFdMathsDateIsNotNull() {
            addCriterion("FD_MATHS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdMathsDateEqualTo(String value) {
            addCriterion("FD_MATHS_DATE =", value, "fdMathsDate");
            return (Criteria) this;
        }

        public Criteria andFdMathsDateNotEqualTo(String value) {
            addCriterion("FD_MATHS_DATE <>", value, "fdMathsDate");
            return (Criteria) this;
        }

        public Criteria andFdMathsDateGreaterThan(String value) {
            addCriterion("FD_MATHS_DATE >", value, "fdMathsDate");
            return (Criteria) this;
        }

        public Criteria andFdMathsDateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_MATHS_DATE >=", value, "fdMathsDate");
            return (Criteria) this;
        }

        public Criteria andFdMathsDateLessThan(String value) {
            addCriterion("FD_MATHS_DATE <", value, "fdMathsDate");
            return (Criteria) this;
        }

        public Criteria andFdMathsDateLessThanOrEqualTo(String value) {
            addCriterion("FD_MATHS_DATE <=", value, "fdMathsDate");
            return (Criteria) this;
        }

        public Criteria andFdMathsDateLike(String value) {
            addCriterion("FD_MATHS_DATE like", value, "fdMathsDate");
            return (Criteria) this;
        }

        public Criteria andFdMathsDateNotLike(String value) {
            addCriterion("FD_MATHS_DATE not like", value, "fdMathsDate");
            return (Criteria) this;
        }

        public Criteria andFdMathsDateIn(List<String> values) {
            addCriterion("FD_MATHS_DATE in", values, "fdMathsDate");
            return (Criteria) this;
        }

        public Criteria andFdMathsDateNotIn(List<String> values) {
            addCriterion("FD_MATHS_DATE not in", values, "fdMathsDate");
            return (Criteria) this;
        }

        public Criteria andFdMathsDateBetween(String value1, String value2) {
            addCriterion("FD_MATHS_DATE between", value1, value2, "fdMathsDate");
            return (Criteria) this;
        }

        public Criteria andFdMathsDateNotBetween(String value1, String value2) {
            addCriterion("FD_MATHS_DATE not between", value1, value2, "fdMathsDate");
            return (Criteria) this;
        }

        public Criteria andFdMathsStatusIsNull() {
            addCriterion("FD_MATHS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFdMathsStatusIsNotNull() {
            addCriterion("FD_MATHS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFdMathsStatusEqualTo(String value) {
            addCriterion("FD_MATHS_STATUS =", value, "fdMathsStatus");
            return (Criteria) this;
        }

        public Criteria andFdMathsStatusNotEqualTo(String value) {
            addCriterion("FD_MATHS_STATUS <>", value, "fdMathsStatus");
            return (Criteria) this;
        }

        public Criteria andFdMathsStatusGreaterThan(String value) {
            addCriterion("FD_MATHS_STATUS >", value, "fdMathsStatus");
            return (Criteria) this;
        }

        public Criteria andFdMathsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FD_MATHS_STATUS >=", value, "fdMathsStatus");
            return (Criteria) this;
        }

        public Criteria andFdMathsStatusLessThan(String value) {
            addCriterion("FD_MATHS_STATUS <", value, "fdMathsStatus");
            return (Criteria) this;
        }

        public Criteria andFdMathsStatusLessThanOrEqualTo(String value) {
            addCriterion("FD_MATHS_STATUS <=", value, "fdMathsStatus");
            return (Criteria) this;
        }

        public Criteria andFdMathsStatusLike(String value) {
            addCriterion("FD_MATHS_STATUS like", value, "fdMathsStatus");
            return (Criteria) this;
        }

        public Criteria andFdMathsStatusNotLike(String value) {
            addCriterion("FD_MATHS_STATUS not like", value, "fdMathsStatus");
            return (Criteria) this;
        }

        public Criteria andFdMathsStatusIn(List<String> values) {
            addCriterion("FD_MATHS_STATUS in", values, "fdMathsStatus");
            return (Criteria) this;
        }

        public Criteria andFdMathsStatusNotIn(List<String> values) {
            addCriterion("FD_MATHS_STATUS not in", values, "fdMathsStatus");
            return (Criteria) this;
        }

        public Criteria andFdMathsStatusBetween(String value1, String value2) {
            addCriterion("FD_MATHS_STATUS between", value1, value2, "fdMathsStatus");
            return (Criteria) this;
        }

        public Criteria andFdMathsStatusNotBetween(String value1, String value2) {
            addCriterion("FD_MATHS_STATUS not between", value1, value2, "fdMathsStatus");
            return (Criteria) this;
        }

        public Criteria andFdMathsEqualTo(String value) {
            addCriterion("FD_MATHS_DATE =", value, "fdMathsDate");
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