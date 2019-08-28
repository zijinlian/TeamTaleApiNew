package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TCheckFinalItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCheckFinalItemsExample() {
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

        public Criteria andFdFinalItemsIdIsNull() {
            addCriterion("FD_FINAL_ITEMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsIdIsNotNull() {
            addCriterion("FD_FINAL_ITEMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsIdEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_ID =", value, "fdFinalItemsId");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsIdNotEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_ID <>", value, "fdFinalItemsId");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsIdGreaterThan(String value) {
            addCriterion("FD_FINAL_ITEMS_ID >", value, "fdFinalItemsId");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_ID >=", value, "fdFinalItemsId");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsIdLessThan(String value) {
            addCriterion("FD_FINAL_ITEMS_ID <", value, "fdFinalItemsId");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsIdLessThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_ID <=", value, "fdFinalItemsId");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsIdLike(String value) {
            addCriterion("FD_FINAL_ITEMS_ID like", value, "fdFinalItemsId");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsIdNotLike(String value) {
            addCriterion("FD_FINAL_ITEMS_ID not like", value, "fdFinalItemsId");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsIdIn(List<String> values) {
            addCriterion("FD_FINAL_ITEMS_ID in", values, "fdFinalItemsId");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsIdNotIn(List<String> values) {
            addCriterion("FD_FINAL_ITEMS_ID not in", values, "fdFinalItemsId");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsIdBetween(String value1, String value2) {
            addCriterion("FD_FINAL_ITEMS_ID between", value1, value2, "fdFinalItemsId");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsIdNotBetween(String value1, String value2) {
            addCriterion("FD_FINAL_ITEMS_ID not between", value1, value2, "fdFinalItemsId");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsContentIsNull() {
            addCriterion("FD_FINAL_ITEMS_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsContentIsNotNull() {
            addCriterion("FD_FINAL_ITEMS_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsContentEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_CONTENT =", value, "fdFinalItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsContentNotEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_CONTENT <>", value, "fdFinalItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsContentGreaterThan(String value) {
            addCriterion("FD_FINAL_ITEMS_CONTENT >", value, "fdFinalItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsContentGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_CONTENT >=", value, "fdFinalItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsContentLessThan(String value) {
            addCriterion("FD_FINAL_ITEMS_CONTENT <", value, "fdFinalItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsContentLessThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_CONTENT <=", value, "fdFinalItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsContentLike(String value) {
            addCriterion("FD_FINAL_ITEMS_CONTENT like", value, "fdFinalItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsContentNotLike(String value) {
            addCriterion("FD_FINAL_ITEMS_CONTENT not like", value, "fdFinalItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsContentIn(List<String> values) {
            addCriterion("FD_FINAL_ITEMS_CONTENT in", values, "fdFinalItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsContentNotIn(List<String> values) {
            addCriterion("FD_FINAL_ITEMS_CONTENT not in", values, "fdFinalItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsContentBetween(String value1, String value2) {
            addCriterion("FD_FINAL_ITEMS_CONTENT between", value1, value2, "fdFinalItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsContentNotBetween(String value1, String value2) {
            addCriterion("FD_FINAL_ITEMS_CONTENT not between", value1, value2, "fdFinalItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsResultsIsNull() {
            addCriterion("FD_FINAL_ITEMS_RESULTS is null");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsResultsIsNotNull() {
            addCriterion("FD_FINAL_ITEMS_RESULTS is not null");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsResultsEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_RESULTS =", value, "fdFinalItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsResultsNotEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_RESULTS <>", value, "fdFinalItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsResultsGreaterThan(String value) {
            addCriterion("FD_FINAL_ITEMS_RESULTS >", value, "fdFinalItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsResultsGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_RESULTS >=", value, "fdFinalItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsResultsLessThan(String value) {
            addCriterion("FD_FINAL_ITEMS_RESULTS <", value, "fdFinalItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsResultsLessThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_RESULTS <=", value, "fdFinalItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsResultsLike(String value) {
            addCriterion("FD_FINAL_ITEMS_RESULTS like", value, "fdFinalItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsResultsNotLike(String value) {
            addCriterion("FD_FINAL_ITEMS_RESULTS not like", value, "fdFinalItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsResultsIn(List<String> values) {
            addCriterion("FD_FINAL_ITEMS_RESULTS in", values, "fdFinalItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsResultsNotIn(List<String> values) {
            addCriterion("FD_FINAL_ITEMS_RESULTS not in", values, "fdFinalItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsResultsBetween(String value1, String value2) {
            addCriterion("FD_FINAL_ITEMS_RESULTS between", value1, value2, "fdFinalItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsResultsNotBetween(String value1, String value2) {
            addCriterion("FD_FINAL_ITEMS_RESULTS not between", value1, value2, "fdFinalItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsCauseIsNull() {
            addCriterion("FD_FINAL_ITEMS_CAUSE is null");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsCauseIsNotNull() {
            addCriterion("FD_FINAL_ITEMS_CAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsCauseEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_CAUSE =", value, "fdFinalItemsCause");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsCauseNotEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_CAUSE <>", value, "fdFinalItemsCause");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsCauseGreaterThan(String value) {
            addCriterion("FD_FINAL_ITEMS_CAUSE >", value, "fdFinalItemsCause");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsCauseGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_CAUSE >=", value, "fdFinalItemsCause");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsCauseLessThan(String value) {
            addCriterion("FD_FINAL_ITEMS_CAUSE <", value, "fdFinalItemsCause");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsCauseLessThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_ITEMS_CAUSE <=", value, "fdFinalItemsCause");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsCauseLike(String value) {
            addCriterion("FD_FINAL_ITEMS_CAUSE like", value, "fdFinalItemsCause");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsCauseNotLike(String value) {
            addCriterion("FD_FINAL_ITEMS_CAUSE not like", value, "fdFinalItemsCause");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsCauseIn(List<String> values) {
            addCriterion("FD_FINAL_ITEMS_CAUSE in", values, "fdFinalItemsCause");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsCauseNotIn(List<String> values) {
            addCriterion("FD_FINAL_ITEMS_CAUSE not in", values, "fdFinalItemsCause");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsCauseBetween(String value1, String value2) {
            addCriterion("FD_FINAL_ITEMS_CAUSE between", value1, value2, "fdFinalItemsCause");
            return (Criteria) this;
        }

        public Criteria andFdFinalItemsCauseNotBetween(String value1, String value2) {
            addCriterion("FD_FINAL_ITEMS_CAUSE not between", value1, value2, "fdFinalItemsCause");
            return (Criteria) this;
        }

        public Criteria andFdFinalListIdIsNull() {
            addCriterion("FD_FINAL_LIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdFinalListIdIsNotNull() {
            addCriterion("FD_FINAL_LIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdFinalListIdEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_ID =", value, "fdFinalListId");
            return (Criteria) this;
        }

        public Criteria andFdFinalListIdNotEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_ID <>", value, "fdFinalListId");
            return (Criteria) this;
        }

        public Criteria andFdFinalListIdGreaterThan(String value) {
            addCriterion("FD_FINAL_LIST_ID >", value, "fdFinalListId");
            return (Criteria) this;
        }

        public Criteria andFdFinalListIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_ID >=", value, "fdFinalListId");
            return (Criteria) this;
        }

        public Criteria andFdFinalListIdLessThan(String value) {
            addCriterion("FD_FINAL_LIST_ID <", value, "fdFinalListId");
            return (Criteria) this;
        }

        public Criteria andFdFinalListIdLessThanOrEqualTo(String value) {
            addCriterion("FD_FINAL_LIST_ID <=", value, "fdFinalListId");
            return (Criteria) this;
        }

        public Criteria andFdFinalListIdLike(String value) {
            addCriterion("FD_FINAL_LIST_ID like", value, "fdFinalListId");
            return (Criteria) this;
        }

        public Criteria andFdFinalListIdNotLike(String value) {
            addCriterion("FD_FINAL_LIST_ID not like", value, "fdFinalListId");
            return (Criteria) this;
        }

        public Criteria andFdFinalListIdIn(List<String> values) {
            addCriterion("FD_FINAL_LIST_ID in", values, "fdFinalListId");
            return (Criteria) this;
        }

        public Criteria andFdFinalListIdNotIn(List<String> values) {
            addCriterion("FD_FINAL_LIST_ID not in", values, "fdFinalListId");
            return (Criteria) this;
        }

        public Criteria andFdFinalListIdBetween(String value1, String value2) {
            addCriterion("FD_FINAL_LIST_ID between", value1, value2, "fdFinalListId");
            return (Criteria) this;
        }

        public Criteria andFdFinalListIdNotBetween(String value1, String value2) {
            addCriterion("FD_FINAL_LIST_ID not between", value1, value2, "fdFinalListId");
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