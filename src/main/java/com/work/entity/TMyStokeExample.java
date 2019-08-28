package com.work.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TMyStokeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMyStokeExample() {
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

        public Criteria andFdDateIsNull() {
            addCriterion("FD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFdDateIsNotNull() {
            addCriterion("FD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdDateEqualTo(String value) {
            addCriterion("FD_DATE =", value, "fdDate");
            return (Criteria) this;
        }

        public Criteria andFdDateNotEqualTo(String value) {
            addCriterion("FD_DATE <>", value, "fdDate");
            return (Criteria) this;
        }

        public Criteria andFdDateGreaterThan(String value) {
            addCriterion("FD_DATE >", value, "fdDate");
            return (Criteria) this;
        }

        public Criteria andFdDateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_DATE >=", value, "fdDate");
            return (Criteria) this;
        }

        public Criteria andFdDateLessThan(String value) {
            addCriterion("FD_DATE <", value, "fdDate");
            return (Criteria) this;
        }

        public Criteria andFdDateLessThanOrEqualTo(String value) {
            addCriterion("FD_DATE <=", value, "fdDate");
            return (Criteria) this;
        }

        public Criteria andFdDateLike(String value) {
            addCriterion("FD_DATE like", value, "fdDate");
            return (Criteria) this;
        }

        public Criteria andFdDateNotLike(String value) {
            addCriterion("FD_DATE not like", value, "fdDate");
            return (Criteria) this;
        }

        public Criteria andFdDateIn(List<String> values) {
            addCriterion("FD_DATE in", values, "fdDate");
            return (Criteria) this;
        }

        public Criteria andFdDateNotIn(List<String> values) {
            addCriterion("FD_DATE not in", values, "fdDate");
            return (Criteria) this;
        }

        public Criteria andFdDateBetween(String value1, String value2) {
            addCriterion("FD_DATE between", value1, value2, "fdDate");
            return (Criteria) this;
        }

        public Criteria andFdDateNotBetween(String value1, String value2) {
            addCriterion("FD_DATE not between", value1, value2, "fdDate");
            return (Criteria) this;
        }

        public Criteria andFdTimeIsNull() {
            addCriterion("FD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFdTimeIsNotNull() {
            addCriterion("FD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFdTimeEqualTo(String value) {
            addCriterion("FD_TIME =", value, "fdTime");
            return (Criteria) this;
        }

        public Criteria andFdTimeNotEqualTo(String value) {
            addCriterion("FD_TIME <>", value, "fdTime");
            return (Criteria) this;
        }

        public Criteria andFdTimeGreaterThan(String value) {
            addCriterion("FD_TIME >", value, "fdTime");
            return (Criteria) this;
        }

        public Criteria andFdTimeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_TIME >=", value, "fdTime");
            return (Criteria) this;
        }

        public Criteria andFdTimeLessThan(String value) {
            addCriterion("FD_TIME <", value, "fdTime");
            return (Criteria) this;
        }

        public Criteria andFdTimeLessThanOrEqualTo(String value) {
            addCriterion("FD_TIME <=", value, "fdTime");
            return (Criteria) this;
        }

        public Criteria andFdTimeLike(String value) {
            addCriterion("FD_TIME like", value, "fdTime");
            return (Criteria) this;
        }

        public Criteria andFdTimeNotLike(String value) {
            addCriterion("FD_TIME not like", value, "fdTime");
            return (Criteria) this;
        }

        public Criteria andFdTimeIn(List<String> values) {
            addCriterion("FD_TIME in", values, "fdTime");
            return (Criteria) this;
        }

        public Criteria andFdTimeNotIn(List<String> values) {
            addCriterion("FD_TIME not in", values, "fdTime");
            return (Criteria) this;
        }

        public Criteria andFdTimeBetween(String value1, String value2) {
            addCriterion("FD_TIME between", value1, value2, "fdTime");
            return (Criteria) this;
        }

        public Criteria andFdTimeNotBetween(String value1, String value2) {
            addCriterion("FD_TIME not between", value1, value2, "fdTime");
            return (Criteria) this;
        }

        public Criteria andFdTitleIsNull() {
            addCriterion("FD_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andFdTitleIsNotNull() {
            addCriterion("FD_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andFdTitleEqualTo(String value) {
            addCriterion("FD_TITLE =", value, "fdTitle");
            return (Criteria) this;
        }

        public Criteria andFdTitleNotEqualTo(String value) {
            addCriterion("FD_TITLE <>", value, "fdTitle");
            return (Criteria) this;
        }

        public Criteria andFdTitleGreaterThan(String value) {
            addCriterion("FD_TITLE >", value, "fdTitle");
            return (Criteria) this;
        }

        public Criteria andFdTitleGreaterThanOrEqualTo(String value) {
            addCriterion("FD_TITLE >=", value, "fdTitle");
            return (Criteria) this;
        }

        public Criteria andFdTitleLessThan(String value) {
            addCriterion("FD_TITLE <", value, "fdTitle");
            return (Criteria) this;
        }

        public Criteria andFdTitleLessThanOrEqualTo(String value) {
            addCriterion("FD_TITLE <=", value, "fdTitle");
            return (Criteria) this;
        }

        public Criteria andFdTitleLike(String value) {
            addCriterion("FD_TITLE like", value, "fdTitle");
            return (Criteria) this;
        }

        public Criteria andFdTitleNotLike(String value) {
            addCriterion("FD_TITLE not like", value, "fdTitle");
            return (Criteria) this;
        }

        public Criteria andFdTitleIn(List<String> values) {
            addCriterion("FD_TITLE in", values, "fdTitle");
            return (Criteria) this;
        }

        public Criteria andFdTitleNotIn(List<String> values) {
            addCriterion("FD_TITLE not in", values, "fdTitle");
            return (Criteria) this;
        }

        public Criteria andFdTitleBetween(String value1, String value2) {
            addCriterion("FD_TITLE between", value1, value2, "fdTitle");
            return (Criteria) this;
        }

        public Criteria andFdTitleNotBetween(String value1, String value2) {
            addCriterion("FD_TITLE not between", value1, value2, "fdTitle");
            return (Criteria) this;
        }

        public Criteria andFdCommentIsNull() {
            addCriterion("FD_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andFdCommentIsNotNull() {
            addCriterion("FD_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andFdCommentEqualTo(String value) {
            addCriterion("FD_COMMENT =", value, "fdComment");
            return (Criteria) this;
        }

        public Criteria andFdCommentNotEqualTo(String value) {
            addCriterion("FD_COMMENT <>", value, "fdComment");
            return (Criteria) this;
        }

        public Criteria andFdCommentGreaterThan(String value) {
            addCriterion("FD_COMMENT >", value, "fdComment");
            return (Criteria) this;
        }

        public Criteria andFdCommentGreaterThanOrEqualTo(String value) {
            addCriterion("FD_COMMENT >=", value, "fdComment");
            return (Criteria) this;
        }

        public Criteria andFdCommentLessThan(String value) {
            addCriterion("FD_COMMENT <", value, "fdComment");
            return (Criteria) this;
        }

        public Criteria andFdCommentLessThanOrEqualTo(String value) {
            addCriterion("FD_COMMENT <=", value, "fdComment");
            return (Criteria) this;
        }

        public Criteria andFdCommentLike(String value) {
            addCriterion("FD_COMMENT like", value, "fdComment");
            return (Criteria) this;
        }

        public Criteria andFdCommentNotLike(String value) {
            addCriterion("FD_COMMENT not like", value, "fdComment");
            return (Criteria) this;
        }

        public Criteria andFdCommentIn(List<String> values) {
            addCriterion("FD_COMMENT in", values, "fdComment");
            return (Criteria) this;
        }

        public Criteria andFdCommentNotIn(List<String> values) {
            addCriterion("FD_COMMENT not in", values, "fdComment");
            return (Criteria) this;
        }

        public Criteria andFdCommentBetween(String value1, String value2) {
            addCriterion("FD_COMMENT between", value1, value2, "fdComment");
            return (Criteria) this;
        }

        public Criteria andFdCommentNotBetween(String value1, String value2) {
            addCriterion("FD_COMMENT not between", value1, value2, "fdComment");
            return (Criteria) this;
        }

        public Criteria andFdIdIsNull() {
            addCriterion("FD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdIdIsNotNull() {
            addCriterion("FD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdIdEqualTo(BigDecimal value) {
            addCriterion("FD_ID =", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotEqualTo(BigDecimal value) {
            addCriterion("FD_ID <>", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdGreaterThan(BigDecimal value) {
            addCriterion("FD_ID >", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FD_ID >=", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdLessThan(BigDecimal value) {
            addCriterion("FD_ID <", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FD_ID <=", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdIn(List<BigDecimal> values) {
            addCriterion("FD_ID in", values, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotIn(List<BigDecimal> values) {
            addCriterion("FD_ID not in", values, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FD_ID between", value1, value2, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FD_ID not between", value1, value2, "fdId");
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