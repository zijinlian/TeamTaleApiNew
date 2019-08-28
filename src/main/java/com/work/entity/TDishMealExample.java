package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TDishMealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDishMealExample() {
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

        public Criteria andMealidIsNull() {
            addCriterion("MEALID is null");
            return (Criteria) this;
        }

        public Criteria andMealidIsNotNull() {
            addCriterion("MEALID is not null");
            return (Criteria) this;
        }

        public Criteria andMealidEqualTo(String value) {
            addCriterion("MEALID =", value, "mealid");
            return (Criteria) this;
        }

        public Criteria andMealidNotEqualTo(String value) {
            addCriterion("MEALID <>", value, "mealid");
            return (Criteria) this;
        }

        public Criteria andMealidGreaterThan(String value) {
            addCriterion("MEALID >", value, "mealid");
            return (Criteria) this;
        }

        public Criteria andMealidGreaterThanOrEqualTo(String value) {
            addCriterion("MEALID >=", value, "mealid");
            return (Criteria) this;
        }

        public Criteria andMealidLessThan(String value) {
            addCriterion("MEALID <", value, "mealid");
            return (Criteria) this;
        }

        public Criteria andMealidLessThanOrEqualTo(String value) {
            addCriterion("MEALID <=", value, "mealid");
            return (Criteria) this;
        }

        public Criteria andMealidLike(String value) {
            addCriterion("MEALID like", value, "mealid");
            return (Criteria) this;
        }

        public Criteria andMealidNotLike(String value) {
            addCriterion("MEALID not like", value, "mealid");
            return (Criteria) this;
        }

        public Criteria andMealidIn(List<String> values) {
            addCriterion("MEALID in", values, "mealid");
            return (Criteria) this;
        }

        public Criteria andMealidNotIn(List<String> values) {
            addCriterion("MEALID not in", values, "mealid");
            return (Criteria) this;
        }

        public Criteria andMealidBetween(String value1, String value2) {
            addCriterion("MEALID between", value1, value2, "mealid");
            return (Criteria) this;
        }

        public Criteria andMealidNotBetween(String value1, String value2) {
            addCriterion("MEALID not between", value1, value2, "mealid");
            return (Criteria) this;
        }

        public Criteria andDishareaIsNull() {
            addCriterion("DISHAREA is null");
            return (Criteria) this;
        }

        public Criteria andDishareaIsNotNull() {
            addCriterion("DISHAREA is not null");
            return (Criteria) this;
        }

        public Criteria andDishareaEqualTo(String value) {
            addCriterion("DISHAREA =", value, "disharea");
            return (Criteria) this;
        }

        public Criteria andDishareaNotEqualTo(String value) {
            addCriterion("DISHAREA <>", value, "disharea");
            return (Criteria) this;
        }

        public Criteria andDishareaGreaterThan(String value) {
            addCriterion("DISHAREA >", value, "disharea");
            return (Criteria) this;
        }

        public Criteria andDishareaGreaterThanOrEqualTo(String value) {
            addCriterion("DISHAREA >=", value, "disharea");
            return (Criteria) this;
        }

        public Criteria andDishareaLessThan(String value) {
            addCriterion("DISHAREA <", value, "disharea");
            return (Criteria) this;
        }

        public Criteria andDishareaLessThanOrEqualTo(String value) {
            addCriterion("DISHAREA <=", value, "disharea");
            return (Criteria) this;
        }

        public Criteria andDishareaLike(String value) {
            addCriterion("DISHAREA like", value, "disharea");
            return (Criteria) this;
        }

        public Criteria andDishareaNotLike(String value) {
            addCriterion("DISHAREA not like", value, "disharea");
            return (Criteria) this;
        }

        public Criteria andDishareaIn(List<String> values) {
            addCriterion("DISHAREA in", values, "disharea");
            return (Criteria) this;
        }

        public Criteria andDishareaNotIn(List<String> values) {
            addCriterion("DISHAREA not in", values, "disharea");
            return (Criteria) this;
        }

        public Criteria andDishareaBetween(String value1, String value2) {
            addCriterion("DISHAREA between", value1, value2, "disharea");
            return (Criteria) this;
        }

        public Criteria andDishareaNotBetween(String value1, String value2) {
            addCriterion("DISHAREA not between", value1, value2, "disharea");
            return (Criteria) this;
        }

        public Criteria andDishstartimeIsNull() {
            addCriterion("DISHSTARTIME is null");
            return (Criteria) this;
        }

        public Criteria andDishstartimeIsNotNull() {
            addCriterion("DISHSTARTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDishstartimeEqualTo(String value) {
            addCriterion("DISHSTARTIME =", value, "dishstartime");
            return (Criteria) this;
        }

        public Criteria andDishstartimeNotEqualTo(String value) {
            addCriterion("DISHSTARTIME <>", value, "dishstartime");
            return (Criteria) this;
        }

        public Criteria andDishstartimeGreaterThan(String value) {
            addCriterion("DISHSTARTIME >", value, "dishstartime");
            return (Criteria) this;
        }

        public Criteria andDishstartimeGreaterThanOrEqualTo(String value) {
            addCriterion("DISHSTARTIME >=", value, "dishstartime");
            return (Criteria) this;
        }

        public Criteria andDishstartimeLessThan(String value) {
            addCriterion("DISHSTARTIME <", value, "dishstartime");
            return (Criteria) this;
        }

        public Criteria andDishstartimeLessThanOrEqualTo(String value) {
            addCriterion("DISHSTARTIME <=", value, "dishstartime");
            return (Criteria) this;
        }

        public Criteria andDishstartimeLike(String value) {
            addCriterion("DISHSTARTIME like", value, "dishstartime");
            return (Criteria) this;
        }

        public Criteria andDishstartimeNotLike(String value) {
            addCriterion("DISHSTARTIME not like", value, "dishstartime");
            return (Criteria) this;
        }

        public Criteria andDishstartimeIn(List<String> values) {
            addCriterion("DISHSTARTIME in", values, "dishstartime");
            return (Criteria) this;
        }

        public Criteria andDishstartimeNotIn(List<String> values) {
            addCriterion("DISHSTARTIME not in", values, "dishstartime");
            return (Criteria) this;
        }

        public Criteria andDishstartimeBetween(String value1, String value2) {
            addCriterion("DISHSTARTIME between", value1, value2, "dishstartime");
            return (Criteria) this;
        }

        public Criteria andDishstartimeNotBetween(String value1, String value2) {
            addCriterion("DISHSTARTIME not between", value1, value2, "dishstartime");
            return (Criteria) this;
        }

        public Criteria andDishendtimeIsNull() {
            addCriterion("DISHENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andDishendtimeIsNotNull() {
            addCriterion("DISHENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDishendtimeEqualTo(String value) {
            addCriterion("DISHENDTIME =", value, "dishendtime");
            return (Criteria) this;
        }

        public Criteria andDishendtimeNotEqualTo(String value) {
            addCriterion("DISHENDTIME <>", value, "dishendtime");
            return (Criteria) this;
        }

        public Criteria andDishendtimeGreaterThan(String value) {
            addCriterion("DISHENDTIME >", value, "dishendtime");
            return (Criteria) this;
        }

        public Criteria andDishendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("DISHENDTIME >=", value, "dishendtime");
            return (Criteria) this;
        }

        public Criteria andDishendtimeLessThan(String value) {
            addCriterion("DISHENDTIME <", value, "dishendtime");
            return (Criteria) this;
        }

        public Criteria andDishendtimeLessThanOrEqualTo(String value) {
            addCriterion("DISHENDTIME <=", value, "dishendtime");
            return (Criteria) this;
        }

        public Criteria andDishendtimeLike(String value) {
            addCriterion("DISHENDTIME like", value, "dishendtime");
            return (Criteria) this;
        }

        public Criteria andDishendtimeNotLike(String value) {
            addCriterion("DISHENDTIME not like", value, "dishendtime");
            return (Criteria) this;
        }

        public Criteria andDishendtimeIn(List<String> values) {
            addCriterion("DISHENDTIME in", values, "dishendtime");
            return (Criteria) this;
        }

        public Criteria andDishendtimeNotIn(List<String> values) {
            addCriterion("DISHENDTIME not in", values, "dishendtime");
            return (Criteria) this;
        }

        public Criteria andDishendtimeBetween(String value1, String value2) {
            addCriterion("DISHENDTIME between", value1, value2, "dishendtime");
            return (Criteria) this;
        }

        public Criteria andDishendtimeNotBetween(String value1, String value2) {
            addCriterion("DISHENDTIME not between", value1, value2, "dishendtime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeIsNull() {
            addCriterion("CHECKSTARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeIsNotNull() {
            addCriterion("CHECKSTARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeEqualTo(String value) {
            addCriterion("CHECKSTARTTIME =", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeNotEqualTo(String value) {
            addCriterion("CHECKSTARTTIME <>", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeGreaterThan(String value) {
            addCriterion("CHECKSTARTTIME >", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKSTARTTIME >=", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeLessThan(String value) {
            addCriterion("CHECKSTARTTIME <", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeLessThanOrEqualTo(String value) {
            addCriterion("CHECKSTARTTIME <=", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeLike(String value) {
            addCriterion("CHECKSTARTTIME like", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeNotLike(String value) {
            addCriterion("CHECKSTARTTIME not like", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeIn(List<String> values) {
            addCriterion("CHECKSTARTTIME in", values, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeNotIn(List<String> values) {
            addCriterion("CHECKSTARTTIME not in", values, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeBetween(String value1, String value2) {
            addCriterion("CHECKSTARTTIME between", value1, value2, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeNotBetween(String value1, String value2) {
            addCriterion("CHECKSTARTTIME not between", value1, value2, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckendtimeIsNull() {
            addCriterion("CHECKENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckendtimeIsNotNull() {
            addCriterion("CHECKENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckendtimeEqualTo(String value) {
            addCriterion("CHECKENDTIME =", value, "checkendtime");
            return (Criteria) this;
        }

        public Criteria andCheckendtimeNotEqualTo(String value) {
            addCriterion("CHECKENDTIME <>", value, "checkendtime");
            return (Criteria) this;
        }

        public Criteria andCheckendtimeGreaterThan(String value) {
            addCriterion("CHECKENDTIME >", value, "checkendtime");
            return (Criteria) this;
        }

        public Criteria andCheckendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKENDTIME >=", value, "checkendtime");
            return (Criteria) this;
        }

        public Criteria andCheckendtimeLessThan(String value) {
            addCriterion("CHECKENDTIME <", value, "checkendtime");
            return (Criteria) this;
        }

        public Criteria andCheckendtimeLessThanOrEqualTo(String value) {
            addCriterion("CHECKENDTIME <=", value, "checkendtime");
            return (Criteria) this;
        }

        public Criteria andCheckendtimeLike(String value) {
            addCriterion("CHECKENDTIME like", value, "checkendtime");
            return (Criteria) this;
        }

        public Criteria andCheckendtimeNotLike(String value) {
            addCriterion("CHECKENDTIME not like", value, "checkendtime");
            return (Criteria) this;
        }

        public Criteria andCheckendtimeIn(List<String> values) {
            addCriterion("CHECKENDTIME in", values, "checkendtime");
            return (Criteria) this;
        }

        public Criteria andCheckendtimeNotIn(List<String> values) {
            addCriterion("CHECKENDTIME not in", values, "checkendtime");
            return (Criteria) this;
        }

        public Criteria andCheckendtimeBetween(String value1, String value2) {
            addCriterion("CHECKENDTIME between", value1, value2, "checkendtime");
            return (Criteria) this;
        }

        public Criteria andCheckendtimeNotBetween(String value1, String value2) {
            addCriterion("CHECKENDTIME not between", value1, value2, "checkendtime");
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