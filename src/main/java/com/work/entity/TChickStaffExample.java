package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TChickStaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TChickStaffExample() {
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

        public Criteria andFdChickStaffIdIsNull() {
            addCriterion("FD_CHICK_STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdChickStaffIdIsNotNull() {
            addCriterion("FD_CHICK_STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdChickStaffIdEqualTo(String value) {
            addCriterion("FD_CHICK_STAFF_ID =", value, "fdChickStaffId");
            return (Criteria) this;
        }

        public Criteria andFdChickStaffIdNotEqualTo(String value) {
            addCriterion("FD_CHICK_STAFF_ID <>", value, "fdChickStaffId");
            return (Criteria) this;
        }

        public Criteria andFdChickStaffIdGreaterThan(String value) {
            addCriterion("FD_CHICK_STAFF_ID >", value, "fdChickStaffId");
            return (Criteria) this;
        }

        public Criteria andFdChickStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_CHICK_STAFF_ID >=", value, "fdChickStaffId");
            return (Criteria) this;
        }

        public Criteria andFdChickStaffIdLessThan(String value) {
            addCriterion("FD_CHICK_STAFF_ID <", value, "fdChickStaffId");
            return (Criteria) this;
        }

        public Criteria andFdChickStaffIdLessThanOrEqualTo(String value) {
            addCriterion("FD_CHICK_STAFF_ID <=", value, "fdChickStaffId");
            return (Criteria) this;
        }

        public Criteria andFdChickStaffIdLike(String value) {
            addCriterion("FD_CHICK_STAFF_ID like", value, "fdChickStaffId");
            return (Criteria) this;
        }

        public Criteria andFdChickStaffIdNotLike(String value) {
            addCriterion("FD_CHICK_STAFF_ID not like", value, "fdChickStaffId");
            return (Criteria) this;
        }

        public Criteria andFdChickStaffIdIn(List<String> values) {
            addCriterion("FD_CHICK_STAFF_ID in", values, "fdChickStaffId");
            return (Criteria) this;
        }

        public Criteria andFdChickStaffIdNotIn(List<String> values) {
            addCriterion("FD_CHICK_STAFF_ID not in", values, "fdChickStaffId");
            return (Criteria) this;
        }

        public Criteria andFdChickStaffIdBetween(String value1, String value2) {
            addCriterion("FD_CHICK_STAFF_ID between", value1, value2, "fdChickStaffId");
            return (Criteria) this;
        }

        public Criteria andFdChickStaffIdNotBetween(String value1, String value2) {
            addCriterion("FD_CHICK_STAFF_ID not between", value1, value2, "fdChickStaffId");
            return (Criteria) this;
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

        public Criteria andFdBodiesIdIsNull() {
            addCriterion("FD_BODIES_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdBodiesIdIsNotNull() {
            addCriterion("FD_BODIES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdBodiesIdEqualTo(String value) {
            addCriterion("FD_BODIES_ID =", value, "fdBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdBodiesIdNotEqualTo(String value) {
            addCriterion("FD_BODIES_ID <>", value, "fdBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdBodiesIdGreaterThan(String value) {
            addCriterion("FD_BODIES_ID >", value, "fdBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdBodiesIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_BODIES_ID >=", value, "fdBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdBodiesIdLessThan(String value) {
            addCriterion("FD_BODIES_ID <", value, "fdBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdBodiesIdLessThanOrEqualTo(String value) {
            addCriterion("FD_BODIES_ID <=", value, "fdBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdBodiesIdLike(String value) {
            addCriterion("FD_BODIES_ID like", value, "fdBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdBodiesIdNotLike(String value) {
            addCriterion("FD_BODIES_ID not like", value, "fdBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdBodiesIdIn(List<String> values) {
            addCriterion("FD_BODIES_ID in", values, "fdBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdBodiesIdNotIn(List<String> values) {
            addCriterion("FD_BODIES_ID not in", values, "fdBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdBodiesIdBetween(String value1, String value2) {
            addCriterion("FD_BODIES_ID between", value1, value2, "fdBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdBodiesIdNotBetween(String value1, String value2) {
            addCriterion("FD_BODIES_ID not between", value1, value2, "fdBodiesId");
            return (Criteria) this;
        }

        public Criteria andFdBodiesNameIsNull() {
            addCriterion("FD_BODIES_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFdBodiesNameIsNotNull() {
            addCriterion("FD_BODIES_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFdBodiesNameEqualTo(String value) {
            addCriterion("FD_BODIES_NAME =", value, "fdBodiesName");
            return (Criteria) this;
        }

        public Criteria andFdBodiesNameNotEqualTo(String value) {
            addCriterion("FD_BODIES_NAME <>", value, "fdBodiesName");
            return (Criteria) this;
        }

        public Criteria andFdBodiesNameGreaterThan(String value) {
            addCriterion("FD_BODIES_NAME >", value, "fdBodiesName");
            return (Criteria) this;
        }

        public Criteria andFdBodiesNameGreaterThanOrEqualTo(String value) {
            addCriterion("FD_BODIES_NAME >=", value, "fdBodiesName");
            return (Criteria) this;
        }

        public Criteria andFdBodiesNameLessThan(String value) {
            addCriterion("FD_BODIES_NAME <", value, "fdBodiesName");
            return (Criteria) this;
        }

        public Criteria andFdBodiesNameLessThanOrEqualTo(String value) {
            addCriterion("FD_BODIES_NAME <=", value, "fdBodiesName");
            return (Criteria) this;
        }

        public Criteria andFdBodiesNameLike(String value) {
            addCriterion("FD_BODIES_NAME like", value, "fdBodiesName");
            return (Criteria) this;
        }

        public Criteria andFdBodiesNameNotLike(String value) {
            addCriterion("FD_BODIES_NAME not like", value, "fdBodiesName");
            return (Criteria) this;
        }

        public Criteria andFdBodiesNameIn(List<String> values) {
            addCriterion("FD_BODIES_NAME in", values, "fdBodiesName");
            return (Criteria) this;
        }

        public Criteria andFdBodiesNameNotIn(List<String> values) {
            addCriterion("FD_BODIES_NAME not in", values, "fdBodiesName");
            return (Criteria) this;
        }

        public Criteria andFdBodiesNameBetween(String value1, String value2) {
            addCriterion("FD_BODIES_NAME between", value1, value2, "fdBodiesName");
            return (Criteria) this;
        }

        public Criteria andFdBodiesNameNotBetween(String value1, String value2) {
            addCriterion("FD_BODIES_NAME not between", value1, value2, "fdBodiesName");
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