package com.work.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TSugReplExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSugReplExample() {
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

        public Criteria andFdOpertypeIsNull() {
            addCriterion("FD_OPERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFdOpertypeIsNotNull() {
            addCriterion("FD_OPERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFdOpertypeEqualTo(BigDecimal value) {
            addCriterion("FD_OPERTYPE =", value, "fdOpertype");
            return (Criteria) this;
        }

        public Criteria andFdOpertypeNotEqualTo(BigDecimal value) {
            addCriterion("FD_OPERTYPE <>", value, "fdOpertype");
            return (Criteria) this;
        }

        public Criteria andFdOpertypeGreaterThan(BigDecimal value) {
            addCriterion("FD_OPERTYPE >", value, "fdOpertype");
            return (Criteria) this;
        }

        public Criteria andFdOpertypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FD_OPERTYPE >=", value, "fdOpertype");
            return (Criteria) this;
        }

        public Criteria andFdOpertypeLessThan(BigDecimal value) {
            addCriterion("FD_OPERTYPE <", value, "fdOpertype");
            return (Criteria) this;
        }

        public Criteria andFdOpertypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FD_OPERTYPE <=", value, "fdOpertype");
            return (Criteria) this;
        }

        public Criteria andFdOpertypeIn(List<BigDecimal> values) {
            addCriterion("FD_OPERTYPE in", values, "fdOpertype");
            return (Criteria) this;
        }

        public Criteria andFdOpertypeNotIn(List<BigDecimal> values) {
            addCriterion("FD_OPERTYPE not in", values, "fdOpertype");
            return (Criteria) this;
        }

        public Criteria andFdOpertypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FD_OPERTYPE between", value1, value2, "fdOpertype");
            return (Criteria) this;
        }

        public Criteria andFdOpertypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FD_OPERTYPE not between", value1, value2, "fdOpertype");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdIsNull() {
            addCriterion("FD_EMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdIsNotNull() {
            addCriterion("FD_EMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdEqualTo(String value) {
            addCriterion("FD_EMP_ID =", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdNotEqualTo(String value) {
            addCriterion("FD_EMP_ID <>", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdGreaterThan(String value) {
            addCriterion("FD_EMP_ID >", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_EMP_ID >=", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdLessThan(String value) {
            addCriterion("FD_EMP_ID <", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdLessThanOrEqualTo(String value) {
            addCriterion("FD_EMP_ID <=", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdLike(String value) {
            addCriterion("FD_EMP_ID like", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdNotLike(String value) {
            addCriterion("FD_EMP_ID not like", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdIn(List<String> values) {
            addCriterion("FD_EMP_ID in", values, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdNotIn(List<String> values) {
            addCriterion("FD_EMP_ID not in", values, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdBetween(String value1, String value2) {
            addCriterion("FD_EMP_ID between", value1, value2, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdNotBetween(String value1, String value2) {
            addCriterion("FD_EMP_ID not between", value1, value2, "fdEmpId");
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

        public Criteria andFdEmpuninmeIsNull() {
            addCriterion("FD_EMPUNINME is null");
            return (Criteria) this;
        }

        public Criteria andFdEmpuninmeIsNotNull() {
            addCriterion("FD_EMPUNINME is not null");
            return (Criteria) this;
        }

        public Criteria andFdEmpuninmeEqualTo(String value) {
            addCriterion("FD_EMPUNINME =", value, "fdEmpuninme");
            return (Criteria) this;
        }

        public Criteria andFdEmpuninmeNotEqualTo(String value) {
            addCriterion("FD_EMPUNINME <>", value, "fdEmpuninme");
            return (Criteria) this;
        }

        public Criteria andFdEmpuninmeGreaterThan(String value) {
            addCriterion("FD_EMPUNINME >", value, "fdEmpuninme");
            return (Criteria) this;
        }

        public Criteria andFdEmpuninmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_EMPUNINME >=", value, "fdEmpuninme");
            return (Criteria) this;
        }

        public Criteria andFdEmpuninmeLessThan(String value) {
            addCriterion("FD_EMPUNINME <", value, "fdEmpuninme");
            return (Criteria) this;
        }

        public Criteria andFdEmpuninmeLessThanOrEqualTo(String value) {
            addCriterion("FD_EMPUNINME <=", value, "fdEmpuninme");
            return (Criteria) this;
        }

        public Criteria andFdEmpuninmeLike(String value) {
            addCriterion("FD_EMPUNINME like", value, "fdEmpuninme");
            return (Criteria) this;
        }

        public Criteria andFdEmpuninmeNotLike(String value) {
            addCriterion("FD_EMPUNINME not like", value, "fdEmpuninme");
            return (Criteria) this;
        }

        public Criteria andFdEmpuninmeIn(List<String> values) {
            addCriterion("FD_EMPUNINME in", values, "fdEmpuninme");
            return (Criteria) this;
        }

        public Criteria andFdEmpuninmeNotIn(List<String> values) {
            addCriterion("FD_EMPUNINME not in", values, "fdEmpuninme");
            return (Criteria) this;
        }

        public Criteria andFdEmpuninmeBetween(String value1, String value2) {
            addCriterion("FD_EMPUNINME between", value1, value2, "fdEmpuninme");
            return (Criteria) this;
        }

        public Criteria andFdEmpuninmeNotBetween(String value1, String value2) {
            addCriterion("FD_EMPUNINME not between", value1, value2, "fdEmpuninme");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdIsNull() {
            addCriterion("FD_REPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdIsNotNull() {
            addCriterion("FD_REPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdEqualTo(String value) {
            addCriterion("FD_REPLY_ID =", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdNotEqualTo(String value) {
            addCriterion("FD_REPLY_ID <>", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdGreaterThan(String value) {
            addCriterion("FD_REPLY_ID >", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_REPLY_ID >=", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdLessThan(String value) {
            addCriterion("FD_REPLY_ID <", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdLessThanOrEqualTo(String value) {
            addCriterion("FD_REPLY_ID <=", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdLike(String value) {
            addCriterion("FD_REPLY_ID like", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdNotLike(String value) {
            addCriterion("FD_REPLY_ID not like", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdIn(List<String> values) {
            addCriterion("FD_REPLY_ID in", values, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdNotIn(List<String> values) {
            addCriterion("FD_REPLY_ID not in", values, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdBetween(String value1, String value2) {
            addCriterion("FD_REPLY_ID between", value1, value2, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdNotBetween(String value1, String value2) {
            addCriterion("FD_REPLY_ID not between", value1, value2, "fdReplyId");
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