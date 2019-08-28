package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TDishBatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDishBatchExample() {
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

        public Criteria andBatchidIsNull() {
            addCriterion("BATCHID is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("BATCHID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(String value) {
            addCriterion("BATCHID =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(String value) {
            addCriterion("BATCHID <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(String value) {
            addCriterion("BATCHID >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHID >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(String value) {
            addCriterion("BATCHID <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(String value) {
            addCriterion("BATCHID <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLike(String value) {
            addCriterion("BATCHID like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotLike(String value) {
            addCriterion("BATCHID not like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<String> values) {
            addCriterion("BATCHID in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<String> values) {
            addCriterion("BATCHID not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(String value1, String value2) {
            addCriterion("BATCHID between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(String value1, String value2) {
            addCriterion("BATCHID not between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchnameIsNull() {
            addCriterion("BATCHNAME is null");
            return (Criteria) this;
        }

        public Criteria andBatchnameIsNotNull() {
            addCriterion("BATCHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnameEqualTo(String value) {
            addCriterion("BATCHNAME =", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameNotEqualTo(String value) {
            addCriterion("BATCHNAME <>", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameGreaterThan(String value) {
            addCriterion("BATCHNAME >", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHNAME >=", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameLessThan(String value) {
            addCriterion("BATCHNAME <", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameLessThanOrEqualTo(String value) {
            addCriterion("BATCHNAME <=", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameLike(String value) {
            addCriterion("BATCHNAME like", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameNotLike(String value) {
            addCriterion("BATCHNAME not like", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameIn(List<String> values) {
            addCriterion("BATCHNAME in", values, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameNotIn(List<String> values) {
            addCriterion("BATCHNAME not in", values, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameBetween(String value1, String value2) {
            addCriterion("BATCHNAME between", value1, value2, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameNotBetween(String value1, String value2) {
            addCriterion("BATCHNAME not between", value1, value2, "batchname");
            return (Criteria) this;
        }

        public Criteria andStartimeIsNull() {
            addCriterion("STARTIME is null");
            return (Criteria) this;
        }

        public Criteria andStartimeIsNotNull() {
            addCriterion("STARTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartimeEqualTo(String value) {
            addCriterion("STARTIME =", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotEqualTo(String value) {
            addCriterion("STARTIME <>", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeGreaterThan(String value) {
            addCriterion("STARTIME >", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeGreaterThanOrEqualTo(String value) {
            addCriterion("STARTIME >=", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeLessThan(String value) {
            addCriterion("STARTIME <", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeLessThanOrEqualTo(String value) {
            addCriterion("STARTIME <=", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeLike(String value) {
            addCriterion("STARTIME like", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotLike(String value) {
            addCriterion("STARTIME not like", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeIn(List<String> values) {
            addCriterion("STARTIME in", values, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotIn(List<String> values) {
            addCriterion("STARTIME not in", values, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeBetween(String value1, String value2) {
            addCriterion("STARTIME between", value1, value2, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotBetween(String value1, String value2) {
            addCriterion("STARTIME not between", value1, value2, "startime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("ENDTIME like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("ENDTIME not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andProductstatusIsNull() {
            addCriterion("PRODUCTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andProductstatusIsNotNull() {
            addCriterion("PRODUCTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProductstatusEqualTo(String value) {
            addCriterion("PRODUCTSTATUS =", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusNotEqualTo(String value) {
            addCriterion("PRODUCTSTATUS <>", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusGreaterThan(String value) {
            addCriterion("PRODUCTSTATUS >", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTSTATUS >=", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusLessThan(String value) {
            addCriterion("PRODUCTSTATUS <", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTSTATUS <=", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusLike(String value) {
            addCriterion("PRODUCTSTATUS like", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusNotLike(String value) {
            addCriterion("PRODUCTSTATUS not like", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusIn(List<String> values) {
            addCriterion("PRODUCTSTATUS in", values, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusNotIn(List<String> values) {
            addCriterion("PRODUCTSTATUS not in", values, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusBetween(String value1, String value2) {
            addCriterion("PRODUCTSTATUS between", value1, value2, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusNotBetween(String value1, String value2) {
            addCriterion("PRODUCTSTATUS not between", value1, value2, "productstatus");
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