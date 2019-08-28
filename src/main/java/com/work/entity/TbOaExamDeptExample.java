package com.work.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbOaExamDeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOaExamDeptExample() {
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

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("DEPT_ID like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptNmeIsNull() {
            addCriterion("DEPT_NME is null");
            return (Criteria) this;
        }

        public Criteria andDeptNmeIsNotNull() {
            addCriterion("DEPT_NME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNmeEqualTo(String value) {
            addCriterion("DEPT_NME =", value, "deptNme");
            return (Criteria) this;
        }

        public Criteria andDeptNmeNotEqualTo(String value) {
            addCriterion("DEPT_NME <>", value, "deptNme");
            return (Criteria) this;
        }

        public Criteria andDeptNmeGreaterThan(String value) {
            addCriterion("DEPT_NME >", value, "deptNme");
            return (Criteria) this;
        }

        public Criteria andDeptNmeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NME >=", value, "deptNme");
            return (Criteria) this;
        }

        public Criteria andDeptNmeLessThan(String value) {
            addCriterion("DEPT_NME <", value, "deptNme");
            return (Criteria) this;
        }

        public Criteria andDeptNmeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NME <=", value, "deptNme");
            return (Criteria) this;
        }

        public Criteria andDeptNmeLike(String value) {
            addCriterion("DEPT_NME like", value, "deptNme");
            return (Criteria) this;
        }

        public Criteria andDeptNmeNotLike(String value) {
            addCriterion("DEPT_NME not like", value, "deptNme");
            return (Criteria) this;
        }

        public Criteria andDeptNmeIn(List<String> values) {
            addCriterion("DEPT_NME in", values, "deptNme");
            return (Criteria) this;
        }

        public Criteria andDeptNmeNotIn(List<String> values) {
            addCriterion("DEPT_NME not in", values, "deptNme");
            return (Criteria) this;
        }

        public Criteria andDeptNmeBetween(String value1, String value2) {
            addCriterion("DEPT_NME between", value1, value2, "deptNme");
            return (Criteria) this;
        }

        public Criteria andDeptNmeNotBetween(String value1, String value2) {
            addCriterion("DEPT_NME not between", value1, value2, "deptNme");
            return (Criteria) this;
        }

        public Criteria andDeptOrderIsNull() {
            addCriterion("DEPT_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andDeptOrderIsNotNull() {
            addCriterion("DEPT_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andDeptOrderEqualTo(BigDecimal value) {
            addCriterion("DEPT_ORDER =", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderNotEqualTo(BigDecimal value) {
            addCriterion("DEPT_ORDER <>", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderGreaterThan(BigDecimal value) {
            addCriterion("DEPT_ORDER >", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPT_ORDER >=", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderLessThan(BigDecimal value) {
            addCriterion("DEPT_ORDER <", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPT_ORDER <=", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderIn(List<BigDecimal> values) {
            addCriterion("DEPT_ORDER in", values, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderNotIn(List<BigDecimal> values) {
            addCriterion("DEPT_ORDER not in", values, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPT_ORDER between", value1, value2, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPT_ORDER not between", value1, value2, "deptOrder");
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