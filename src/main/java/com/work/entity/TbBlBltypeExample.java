package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TbBlBltypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBlBltypeExample() {
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

        public Criteria andFdTypeIdIsNull() {
            addCriterion("FD_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdTypeIdIsNotNull() {
            addCriterion("FD_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdTypeIdEqualTo(String value) {
            addCriterion("FD_TYPE_ID =", value, "fdTypeId");
            return (Criteria) this;
        }

        public Criteria andFdTypeIdNotEqualTo(String value) {
            addCriterion("FD_TYPE_ID <>", value, "fdTypeId");
            return (Criteria) this;
        }

        public Criteria andFdTypeIdGreaterThan(String value) {
            addCriterion("FD_TYPE_ID >", value, "fdTypeId");
            return (Criteria) this;
        }

        public Criteria andFdTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_TYPE_ID >=", value, "fdTypeId");
            return (Criteria) this;
        }

        public Criteria andFdTypeIdLessThan(String value) {
            addCriterion("FD_TYPE_ID <", value, "fdTypeId");
            return (Criteria) this;
        }

        public Criteria andFdTypeIdLessThanOrEqualTo(String value) {
            addCriterion("FD_TYPE_ID <=", value, "fdTypeId");
            return (Criteria) this;
        }

        public Criteria andFdTypeIdLike(String value) {
            addCriterion("FD_TYPE_ID like", value, "fdTypeId");
            return (Criteria) this;
        }

        public Criteria andFdTypeIdNotLike(String value) {
            addCriterion("FD_TYPE_ID not like", value, "fdTypeId");
            return (Criteria) this;
        }

        public Criteria andFdTypeIdIn(List<String> values) {
            addCriterion("FD_TYPE_ID in", values, "fdTypeId");
            return (Criteria) this;
        }

        public Criteria andFdTypeIdNotIn(List<String> values) {
            addCriterion("FD_TYPE_ID not in", values, "fdTypeId");
            return (Criteria) this;
        }

        public Criteria andFdTypeIdBetween(String value1, String value2) {
            addCriterion("FD_TYPE_ID between", value1, value2, "fdTypeId");
            return (Criteria) this;
        }

        public Criteria andFdTypeIdNotBetween(String value1, String value2) {
            addCriterion("FD_TYPE_ID not between", value1, value2, "fdTypeId");
            return (Criteria) this;
        }

        public Criteria andFdTypeNmeIsNull() {
            addCriterion("FD_TYPE_NME is null");
            return (Criteria) this;
        }

        public Criteria andFdTypeNmeIsNotNull() {
            addCriterion("FD_TYPE_NME is not null");
            return (Criteria) this;
        }

        public Criteria andFdTypeNmeEqualTo(String value) {
            addCriterion("FD_TYPE_NME =", value, "fdTypeNme");
            return (Criteria) this;
        }

        public Criteria andFdTypeNmeNotEqualTo(String value) {
            addCriterion("FD_TYPE_NME <>", value, "fdTypeNme");
            return (Criteria) this;
        }

        public Criteria andFdTypeNmeGreaterThan(String value) {
            addCriterion("FD_TYPE_NME >", value, "fdTypeNme");
            return (Criteria) this;
        }

        public Criteria andFdTypeNmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_TYPE_NME >=", value, "fdTypeNme");
            return (Criteria) this;
        }

        public Criteria andFdTypeNmeLessThan(String value) {
            addCriterion("FD_TYPE_NME <", value, "fdTypeNme");
            return (Criteria) this;
        }

        public Criteria andFdTypeNmeLessThanOrEqualTo(String value) {
            addCriterion("FD_TYPE_NME <=", value, "fdTypeNme");
            return (Criteria) this;
        }

        public Criteria andFdTypeNmeLike(String value) {
            addCriterion("FD_TYPE_NME like", value, "fdTypeNme");
            return (Criteria) this;
        }

        public Criteria andFdTypeNmeNotLike(String value) {
            addCriterion("FD_TYPE_NME not like", value, "fdTypeNme");
            return (Criteria) this;
        }

        public Criteria andFdTypeNmeIn(List<String> values) {
            addCriterion("FD_TYPE_NME in", values, "fdTypeNme");
            return (Criteria) this;
        }

        public Criteria andFdTypeNmeNotIn(List<String> values) {
            addCriterion("FD_TYPE_NME not in", values, "fdTypeNme");
            return (Criteria) this;
        }

        public Criteria andFdTypeNmeBetween(String value1, String value2) {
            addCriterion("FD_TYPE_NME between", value1, value2, "fdTypeNme");
            return (Criteria) this;
        }

        public Criteria andFdTypeNmeNotBetween(String value1, String value2) {
            addCriterion("FD_TYPE_NME not between", value1, value2, "fdTypeNme");
            return (Criteria) this;
        }

        public Criteria andFdCreateTimeIsNull() {
            addCriterion("FD_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFdCreateTimeIsNotNull() {
            addCriterion("FD_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFdCreateTimeEqualTo(String value) {
            addCriterion("FD_CREATE_TIME =", value, "fdCreateTime");
            return (Criteria) this;
        }

        public Criteria andFdCreateTimeNotEqualTo(String value) {
            addCriterion("FD_CREATE_TIME <>", value, "fdCreateTime");
            return (Criteria) this;
        }

        public Criteria andFdCreateTimeGreaterThan(String value) {
            addCriterion("FD_CREATE_TIME >", value, "fdCreateTime");
            return (Criteria) this;
        }

        public Criteria andFdCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_CREATE_TIME >=", value, "fdCreateTime");
            return (Criteria) this;
        }

        public Criteria andFdCreateTimeLessThan(String value) {
            addCriterion("FD_CREATE_TIME <", value, "fdCreateTime");
            return (Criteria) this;
        }

        public Criteria andFdCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("FD_CREATE_TIME <=", value, "fdCreateTime");
            return (Criteria) this;
        }

        public Criteria andFdCreateTimeLike(String value) {
            addCriterion("FD_CREATE_TIME like", value, "fdCreateTime");
            return (Criteria) this;
        }

        public Criteria andFdCreateTimeNotLike(String value) {
            addCriterion("FD_CREATE_TIME not like", value, "fdCreateTime");
            return (Criteria) this;
        }

        public Criteria andFdCreateTimeIn(List<String> values) {
            addCriterion("FD_CREATE_TIME in", values, "fdCreateTime");
            return (Criteria) this;
        }

        public Criteria andFdCreateTimeNotIn(List<String> values) {
            addCriterion("FD_CREATE_TIME not in", values, "fdCreateTime");
            return (Criteria) this;
        }

        public Criteria andFdCreateTimeBetween(String value1, String value2) {
            addCriterion("FD_CREATE_TIME between", value1, value2, "fdCreateTime");
            return (Criteria) this;
        }

        public Criteria andFdCreateTimeNotBetween(String value1, String value2) {
            addCriterion("FD_CREATE_TIME not between", value1, value2, "fdCreateTime");
            return (Criteria) this;
        }

        public Criteria andFdCreaterIsNull() {
            addCriterion("FD_CREATER is null");
            return (Criteria) this;
        }

        public Criteria andFdCreaterIsNotNull() {
            addCriterion("FD_CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andFdCreaterEqualTo(String value) {
            addCriterion("FD_CREATER =", value, "fdCreater");
            return (Criteria) this;
        }

        public Criteria andFdCreaterNotEqualTo(String value) {
            addCriterion("FD_CREATER <>", value, "fdCreater");
            return (Criteria) this;
        }

        public Criteria andFdCreaterGreaterThan(String value) {
            addCriterion("FD_CREATER >", value, "fdCreater");
            return (Criteria) this;
        }

        public Criteria andFdCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("FD_CREATER >=", value, "fdCreater");
            return (Criteria) this;
        }

        public Criteria andFdCreaterLessThan(String value) {
            addCriterion("FD_CREATER <", value, "fdCreater");
            return (Criteria) this;
        }

        public Criteria andFdCreaterLessThanOrEqualTo(String value) {
            addCriterion("FD_CREATER <=", value, "fdCreater");
            return (Criteria) this;
        }

        public Criteria andFdCreaterLike(String value) {
            addCriterion("FD_CREATER like", value, "fdCreater");
            return (Criteria) this;
        }

        public Criteria andFdCreaterNotLike(String value) {
            addCriterion("FD_CREATER not like", value, "fdCreater");
            return (Criteria) this;
        }

        public Criteria andFdCreaterIn(List<String> values) {
            addCriterion("FD_CREATER in", values, "fdCreater");
            return (Criteria) this;
        }

        public Criteria andFdCreaterNotIn(List<String> values) {
            addCriterion("FD_CREATER not in", values, "fdCreater");
            return (Criteria) this;
        }

        public Criteria andFdCreaterBetween(String value1, String value2) {
            addCriterion("FD_CREATER between", value1, value2, "fdCreater");
            return (Criteria) this;
        }

        public Criteria andFdCreaterNotBetween(String value1, String value2) {
            addCriterion("FD_CREATER not between", value1, value2, "fdCreater");
            return (Criteria) this;
        }

        public Criteria andFdTypeOrderIsNull() {
            addCriterion("FD_TYPE_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andFdTypeOrderIsNotNull() {
            addCriterion("FD_TYPE_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andFdTypeOrderEqualTo(String value) {
            addCriterion("FD_TYPE_ORDER =", value, "fdTypeOrder");
            return (Criteria) this;
        }

        public Criteria andFdTypeOrderNotEqualTo(String value) {
            addCriterion("FD_TYPE_ORDER <>", value, "fdTypeOrder");
            return (Criteria) this;
        }

        public Criteria andFdTypeOrderGreaterThan(String value) {
            addCriterion("FD_TYPE_ORDER >", value, "fdTypeOrder");
            return (Criteria) this;
        }

        public Criteria andFdTypeOrderGreaterThanOrEqualTo(String value) {
            addCriterion("FD_TYPE_ORDER >=", value, "fdTypeOrder");
            return (Criteria) this;
        }

        public Criteria andFdTypeOrderLessThan(String value) {
            addCriterion("FD_TYPE_ORDER <", value, "fdTypeOrder");
            return (Criteria) this;
        }

        public Criteria andFdTypeOrderLessThanOrEqualTo(String value) {
            addCriterion("FD_TYPE_ORDER <=", value, "fdTypeOrder");
            return (Criteria) this;
        }

        public Criteria andFdTypeOrderLike(String value) {
            addCriterion("FD_TYPE_ORDER like", value, "fdTypeOrder");
            return (Criteria) this;
        }

        public Criteria andFdTypeOrderNotLike(String value) {
            addCriterion("FD_TYPE_ORDER not like", value, "fdTypeOrder");
            return (Criteria) this;
        }

        public Criteria andFdTypeOrderIn(List<String> values) {
            addCriterion("FD_TYPE_ORDER in", values, "fdTypeOrder");
            return (Criteria) this;
        }

        public Criteria andFdTypeOrderNotIn(List<String> values) {
            addCriterion("FD_TYPE_ORDER not in", values, "fdTypeOrder");
            return (Criteria) this;
        }

        public Criteria andFdTypeOrderBetween(String value1, String value2) {
            addCriterion("FD_TYPE_ORDER between", value1, value2, "fdTypeOrder");
            return (Criteria) this;
        }

        public Criteria andFdTypeOrderNotBetween(String value1, String value2) {
            addCriterion("FD_TYPE_ORDER not between", value1, value2, "fdTypeOrder");
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