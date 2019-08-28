package com.work.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TDishOrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDishOrderInfoExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("ORDERID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("ORDERID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("ORDERID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("ORDERID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("ORDERID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("ORDERID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("ORDERID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("ORDERID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("ORDERID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("ORDERID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("ORDERID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("PRODUCTID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("PRODUCTID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("PRODUCTID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("PRODUCTID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("PRODUCTID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("PRODUCTID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("PRODUCTID like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("PRODUCTID not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("PRODUCTID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("PRODUCTID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("PRODUCTID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("PRODUCTID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andTotlpriceIsNull() {
            addCriterion("TOTLPRICE is null");
            return (Criteria) this;
        }

        public Criteria andTotlpriceIsNotNull() {
            addCriterion("TOTLPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andTotlpriceEqualTo(BigDecimal value) {
            addCriterion("TOTLPRICE =", value, "totlprice");
            return (Criteria) this;
        }

        public Criteria andTotlpriceNotEqualTo(BigDecimal value) {
            addCriterion("TOTLPRICE <>", value, "totlprice");
            return (Criteria) this;
        }

        public Criteria andTotlpriceGreaterThan(BigDecimal value) {
            addCriterion("TOTLPRICE >", value, "totlprice");
            return (Criteria) this;
        }

        public Criteria andTotlpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTLPRICE >=", value, "totlprice");
            return (Criteria) this;
        }

        public Criteria andTotlpriceLessThan(BigDecimal value) {
            addCriterion("TOTLPRICE <", value, "totlprice");
            return (Criteria) this;
        }

        public Criteria andTotlpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTLPRICE <=", value, "totlprice");
            return (Criteria) this;
        }

        public Criteria andTotlpriceIn(List<BigDecimal> values) {
            addCriterion("TOTLPRICE in", values, "totlprice");
            return (Criteria) this;
        }

        public Criteria andTotlpriceNotIn(List<BigDecimal> values) {
            addCriterion("TOTLPRICE not in", values, "totlprice");
            return (Criteria) this;
        }

        public Criteria andTotlpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTLPRICE between", value1, value2, "totlprice");
            return (Criteria) this;
        }

        public Criteria andTotlpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTLPRICE not between", value1, value2, "totlprice");
            return (Criteria) this;
        }

        public Criteria andProductnumberIsNull() {
            addCriterion("PRODUCTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andProductnumberIsNotNull() {
            addCriterion("PRODUCTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumberEqualTo(BigDecimal value) {
            addCriterion("PRODUCTNUMBER =", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCTNUMBER <>", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberGreaterThan(BigDecimal value) {
            addCriterion("PRODUCTNUMBER >", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCTNUMBER >=", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberLessThan(BigDecimal value) {
            addCriterion("PRODUCTNUMBER <", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCTNUMBER <=", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberIn(List<BigDecimal> values) {
            addCriterion("PRODUCTNUMBER in", values, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCTNUMBER not in", values, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCTNUMBER between", value1, value2, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCTNUMBER not between", value1, value2, "productnumber");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNull() {
            addCriterion("UNITPRICE is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNotNull() {
            addCriterion("UNITPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceEqualTo(BigDecimal value) {
            addCriterion("UNITPRICE =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(BigDecimal value) {
            addCriterion("UNITPRICE <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(BigDecimal value) {
            addCriterion("UNITPRICE >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNITPRICE >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(BigDecimal value) {
            addCriterion("UNITPRICE <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNITPRICE <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<BigDecimal> values) {
            addCriterion("UNITPRICE in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<BigDecimal> values) {
            addCriterion("UNITPRICE not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNITPRICE between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNITPRICE not between", value1, value2, "unitprice");
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