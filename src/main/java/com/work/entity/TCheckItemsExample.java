package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TCheckItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCheckItemsExample() {
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

        public Criteria andFdItemsIdIsNull() {
            addCriterion("FD_ITEMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdItemsIdIsNotNull() {
            addCriterion("FD_ITEMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdItemsIdEqualTo(String value) {
            addCriterion("FD_ITEMS_ID =", value, "fdItemsId");
            return (Criteria) this;
        }

        public Criteria andFdItemsIdNotEqualTo(String value) {
            addCriterion("FD_ITEMS_ID <>", value, "fdItemsId");
            return (Criteria) this;
        }

        public Criteria andFdItemsIdGreaterThan(String value) {
            addCriterion("FD_ITEMS_ID >", value, "fdItemsId");
            return (Criteria) this;
        }

        public Criteria andFdItemsIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ITEMS_ID >=", value, "fdItemsId");
            return (Criteria) this;
        }

        public Criteria andFdItemsIdLessThan(String value) {
            addCriterion("FD_ITEMS_ID <", value, "fdItemsId");
            return (Criteria) this;
        }

        public Criteria andFdItemsIdLessThanOrEqualTo(String value) {
            addCriterion("FD_ITEMS_ID <=", value, "fdItemsId");
            return (Criteria) this;
        }

        public Criteria andFdItemsIdLike(String value) {
            addCriterion("FD_ITEMS_ID like", value, "fdItemsId");
            return (Criteria) this;
        }

        public Criteria andFdItemsIdNotLike(String value) {
            addCriterion("FD_ITEMS_ID not like", value, "fdItemsId");
            return (Criteria) this;
        }

        public Criteria andFdItemsIdIn(List<String> values) {
            addCriterion("FD_ITEMS_ID in", values, "fdItemsId");
            return (Criteria) this;
        }

        public Criteria andFdItemsIdNotIn(List<String> values) {
            addCriterion("FD_ITEMS_ID not in", values, "fdItemsId");
            return (Criteria) this;
        }

        public Criteria andFdItemsIdBetween(String value1, String value2) {
            addCriterion("FD_ITEMS_ID between", value1, value2, "fdItemsId");
            return (Criteria) this;
        }

        public Criteria andFdItemsIdNotBetween(String value1, String value2) {
            addCriterion("FD_ITEMS_ID not between", value1, value2, "fdItemsId");
            return (Criteria) this;
        }

        public Criteria andFdItemsContentIsNull() {
            addCriterion("FD_ITEMS_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andFdItemsContentIsNotNull() {
            addCriterion("FD_ITEMS_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andFdItemsContentEqualTo(String value) {
            addCriterion("FD_ITEMS_CONTENT =", value, "fdItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdItemsContentNotEqualTo(String value) {
            addCriterion("FD_ITEMS_CONTENT <>", value, "fdItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdItemsContentGreaterThan(String value) {
            addCriterion("FD_ITEMS_CONTENT >", value, "fdItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdItemsContentGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ITEMS_CONTENT >=", value, "fdItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdItemsContentLessThan(String value) {
            addCriterion("FD_ITEMS_CONTENT <", value, "fdItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdItemsContentLessThanOrEqualTo(String value) {
            addCriterion("FD_ITEMS_CONTENT <=", value, "fdItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdItemsContentLike(String value) {
            addCriterion("FD_ITEMS_CONTENT like", value, "fdItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdItemsContentNotLike(String value) {
            addCriterion("FD_ITEMS_CONTENT not like", value, "fdItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdItemsContentIn(List<String> values) {
            addCriterion("FD_ITEMS_CONTENT in", values, "fdItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdItemsContentNotIn(List<String> values) {
            addCriterion("FD_ITEMS_CONTENT not in", values, "fdItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdItemsContentBetween(String value1, String value2) {
            addCriterion("FD_ITEMS_CONTENT between", value1, value2, "fdItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdItemsContentNotBetween(String value1, String value2) {
            addCriterion("FD_ITEMS_CONTENT not between", value1, value2, "fdItemsContent");
            return (Criteria) this;
        }

        public Criteria andFdItemsResultsIsNull() {
            addCriterion("FD_ITEMS_RESULTS is null");
            return (Criteria) this;
        }

        public Criteria andFdItemsResultsIsNotNull() {
            addCriterion("FD_ITEMS_RESULTS is not null");
            return (Criteria) this;
        }

        public Criteria andFdItemsResultsEqualTo(String value) {
            addCriterion("FD_ITEMS_RESULTS =", value, "fdItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdItemsResultsNotEqualTo(String value) {
            addCriterion("FD_ITEMS_RESULTS <>", value, "fdItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdItemsResultsGreaterThan(String value) {
            addCriterion("FD_ITEMS_RESULTS >", value, "fdItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdItemsResultsGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ITEMS_RESULTS >=", value, "fdItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdItemsResultsLessThan(String value) {
            addCriterion("FD_ITEMS_RESULTS <", value, "fdItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdItemsResultsLessThanOrEqualTo(String value) {
            addCriterion("FD_ITEMS_RESULTS <=", value, "fdItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdItemsResultsLike(String value) {
            addCriterion("FD_ITEMS_RESULTS like", value, "fdItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdItemsResultsNotLike(String value) {
            addCriterion("FD_ITEMS_RESULTS not like", value, "fdItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdItemsResultsIn(List<String> values) {
            addCriterion("FD_ITEMS_RESULTS in", values, "fdItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdItemsResultsNotIn(List<String> values) {
            addCriterion("FD_ITEMS_RESULTS not in", values, "fdItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdItemsResultsBetween(String value1, String value2) {
            addCriterion("FD_ITEMS_RESULTS between", value1, value2, "fdItemsResults");
            return (Criteria) this;
        }

        public Criteria andFdItemsResultsNotBetween(String value1, String value2) {
            addCriterion("FD_ITEMS_RESULTS not between", value1, value2, "fdItemsResults");
            return (Criteria) this;
        }

        public Criteria andTbListIdIsNull() {
            addCriterion("TB_LIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andTbListIdIsNotNull() {
            addCriterion("TB_LIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTbListIdEqualTo(String value) {
            addCriterion("TB_LIST_ID =", value, "tbListId");
            return (Criteria) this;
        }

        public Criteria andTbListIdNotEqualTo(String value) {
            addCriterion("TB_LIST_ID <>", value, "tbListId");
            return (Criteria) this;
        }

        public Criteria andTbListIdGreaterThan(String value) {
            addCriterion("TB_LIST_ID >", value, "tbListId");
            return (Criteria) this;
        }

        public Criteria andTbListIdGreaterThanOrEqualTo(String value) {
            addCriterion("TB_LIST_ID >=", value, "tbListId");
            return (Criteria) this;
        }

        public Criteria andTbListIdLessThan(String value) {
            addCriterion("TB_LIST_ID <", value, "tbListId");
            return (Criteria) this;
        }

        public Criteria andTbListIdLessThanOrEqualTo(String value) {
            addCriterion("TB_LIST_ID <=", value, "tbListId");
            return (Criteria) this;
        }

        public Criteria andTbListIdLike(String value) {
            addCriterion("TB_LIST_ID like", value, "tbListId");
            return (Criteria) this;
        }

        public Criteria andTbListIdNotLike(String value) {
            addCriterion("TB_LIST_ID not like", value, "tbListId");
            return (Criteria) this;
        }

        public Criteria andTbListIdIn(List<String> values) {
            addCriterion("TB_LIST_ID in", values, "tbListId");
            return (Criteria) this;
        }

        public Criteria andTbListIdNotIn(List<String> values) {
            addCriterion("TB_LIST_ID not in", values, "tbListId");
            return (Criteria) this;
        }

        public Criteria andTbListIdBetween(String value1, String value2) {
            addCriterion("TB_LIST_ID between", value1, value2, "tbListId");
            return (Criteria) this;
        }

        public Criteria andTbListIdNotBetween(String value1, String value2) {
            addCriterion("TB_LIST_ID not between", value1, value2, "tbListId");
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