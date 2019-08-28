package com.work.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TDishExchangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDishExchangeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andReceivetimeIsNull() {
            addCriterion("RECEIVETIME is null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNotNull() {
            addCriterion("RECEIVETIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeEqualTo(String value) {
            addCriterion("RECEIVETIME =", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotEqualTo(String value) {
            addCriterion("RECEIVETIME <>", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThan(String value) {
            addCriterion("RECEIVETIME >", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVETIME >=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThan(String value) {
            addCriterion("RECEIVETIME <", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThanOrEqualTo(String value) {
            addCriterion("RECEIVETIME <=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLike(String value) {
            addCriterion("RECEIVETIME like", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotLike(String value) {
            addCriterion("RECEIVETIME not like", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIn(List<String> values) {
            addCriterion("RECEIVETIME in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotIn(List<String> values) {
            addCriterion("RECEIVETIME not in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeBetween(String value1, String value2) {
            addCriterion("RECEIVETIME between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotBetween(String value1, String value2) {
            addCriterion("RECEIVETIME not between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceIsNull() {
            addCriterion("RECEIVEPLACE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceIsNotNull() {
            addCriterion("RECEIVEPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceEqualTo(String value) {
            addCriterion("RECEIVEPLACE =", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceNotEqualTo(String value) {
            addCriterion("RECEIVEPLACE <>", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceGreaterThan(String value) {
            addCriterion("RECEIVEPLACE >", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEPLACE >=", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceLessThan(String value) {
            addCriterion("RECEIVEPLACE <", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEPLACE <=", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceLike(String value) {
            addCriterion("RECEIVEPLACE like", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceNotLike(String value) {
            addCriterion("RECEIVEPLACE not like", value, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceIn(List<String> values) {
            addCriterion("RECEIVEPLACE in", values, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceNotIn(List<String> values) {
            addCriterion("RECEIVEPLACE not in", values, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceBetween(String value1, String value2) {
            addCriterion("RECEIVEPLACE between", value1, value2, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andReceiveplaceNotBetween(String value1, String value2) {
            addCriterion("RECEIVEPLACE not between", value1, value2, "receiveplace");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
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