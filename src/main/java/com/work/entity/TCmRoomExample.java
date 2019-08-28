package com.work.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TCmRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCmRoomExample() {
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

        public Criteria andRoomidIsNull() {
            addCriterion("ROOMID is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("ROOMID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(String value) {
            addCriterion("ROOMID =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(String value) {
            addCriterion("ROOMID <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(String value) {
            addCriterion("ROOMID >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(String value) {
            addCriterion("ROOMID >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(String value) {
            addCriterion("ROOMID <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(String value) {
            addCriterion("ROOMID <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLike(String value) {
            addCriterion("ROOMID like", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotLike(String value) {
            addCriterion("ROOMID not like", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<String> values) {
            addCriterion("ROOMID in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<String> values) {
            addCriterion("ROOMID not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(String value1, String value2) {
            addCriterion("ROOMID between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(String value1, String value2) {
            addCriterion("ROOMID not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomnameIsNull() {
            addCriterion("ROOMNAME is null");
            return (Criteria) this;
        }

        public Criteria andRoomnameIsNotNull() {
            addCriterion("ROOMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnameEqualTo(String value) {
            addCriterion("ROOMNAME =", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotEqualTo(String value) {
            addCriterion("ROOMNAME <>", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameGreaterThan(String value) {
            addCriterion("ROOMNAME >", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameGreaterThanOrEqualTo(String value) {
            addCriterion("ROOMNAME >=", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLessThan(String value) {
            addCriterion("ROOMNAME <", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLessThanOrEqualTo(String value) {
            addCriterion("ROOMNAME <=", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLike(String value) {
            addCriterion("ROOMNAME like", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotLike(String value) {
            addCriterion("ROOMNAME not like", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameIn(List<String> values) {
            addCriterion("ROOMNAME in", values, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotIn(List<String> values) {
            addCriterion("ROOMNAME not in", values, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameBetween(String value1, String value2) {
            addCriterion("ROOMNAME between", value1, value2, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotBetween(String value1, String value2) {
            addCriterion("ROOMNAME not between", value1, value2, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomplaceIsNull() {
            addCriterion("ROOMPLACE is null");
            return (Criteria) this;
        }

        public Criteria andRoomplaceIsNotNull() {
            addCriterion("ROOMPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andRoomplaceEqualTo(String value) {
            addCriterion("ROOMPLACE =", value, "roomplace");
            return (Criteria) this;
        }

        public Criteria andRoomplaceNotEqualTo(String value) {
            addCriterion("ROOMPLACE <>", value, "roomplace");
            return (Criteria) this;
        }

        public Criteria andRoomplaceGreaterThan(String value) {
            addCriterion("ROOMPLACE >", value, "roomplace");
            return (Criteria) this;
        }

        public Criteria andRoomplaceGreaterThanOrEqualTo(String value) {
            addCriterion("ROOMPLACE >=", value, "roomplace");
            return (Criteria) this;
        }

        public Criteria andRoomplaceLessThan(String value) {
            addCriterion("ROOMPLACE <", value, "roomplace");
            return (Criteria) this;
        }

        public Criteria andRoomplaceLessThanOrEqualTo(String value) {
            addCriterion("ROOMPLACE <=", value, "roomplace");
            return (Criteria) this;
        }

        public Criteria andRoomplaceLike(String value) {
            addCriterion("ROOMPLACE like", value, "roomplace");
            return (Criteria) this;
        }

        public Criteria andRoomplaceNotLike(String value) {
            addCriterion("ROOMPLACE not like", value, "roomplace");
            return (Criteria) this;
        }

        public Criteria andRoomplaceIn(List<String> values) {
            addCriterion("ROOMPLACE in", values, "roomplace");
            return (Criteria) this;
        }

        public Criteria andRoomplaceNotIn(List<String> values) {
            addCriterion("ROOMPLACE not in", values, "roomplace");
            return (Criteria) this;
        }

        public Criteria andRoomplaceBetween(String value1, String value2) {
            addCriterion("ROOMPLACE between", value1, value2, "roomplace");
            return (Criteria) this;
        }

        public Criteria andRoomplaceNotBetween(String value1, String value2) {
            addCriterion("ROOMPLACE not between", value1, value2, "roomplace");
            return (Criteria) this;
        }

        public Criteria andRoompeopleIsNull() {
            addCriterion("ROOMPEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andRoompeopleIsNotNull() {
            addCriterion("ROOMPEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andRoompeopleEqualTo(BigDecimal value) {
            addCriterion("ROOMPEOPLE =", value, "roompeople");
            return (Criteria) this;
        }

        public Criteria andRoompeopleNotEqualTo(BigDecimal value) {
            addCriterion("ROOMPEOPLE <>", value, "roompeople");
            return (Criteria) this;
        }

        public Criteria andRoompeopleGreaterThan(BigDecimal value) {
            addCriterion("ROOMPEOPLE >", value, "roompeople");
            return (Criteria) this;
        }

        public Criteria andRoompeopleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOMPEOPLE >=", value, "roompeople");
            return (Criteria) this;
        }

        public Criteria andRoompeopleLessThan(BigDecimal value) {
            addCriterion("ROOMPEOPLE <", value, "roompeople");
            return (Criteria) this;
        }

        public Criteria andRoompeopleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOMPEOPLE <=", value, "roompeople");
            return (Criteria) this;
        }

        public Criteria andRoompeopleIn(List<BigDecimal> values) {
            addCriterion("ROOMPEOPLE in", values, "roompeople");
            return (Criteria) this;
        }

        public Criteria andRoompeopleNotIn(List<BigDecimal> values) {
            addCriterion("ROOMPEOPLE not in", values, "roompeople");
            return (Criteria) this;
        }

        public Criteria andRoompeopleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOMPEOPLE between", value1, value2, "roompeople");
            return (Criteria) this;
        }

        public Criteria andRoompeopleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOMPEOPLE not between", value1, value2, "roompeople");
            return (Criteria) this;
        }

        public Criteria andRoomequipmentIsNull() {
            addCriterion("ROOMEQUIPMENT is null");
            return (Criteria) this;
        }

        public Criteria andRoomequipmentIsNotNull() {
            addCriterion("ROOMEQUIPMENT is not null");
            return (Criteria) this;
        }

        public Criteria andRoomequipmentEqualTo(String value) {
            addCriterion("ROOMEQUIPMENT =", value, "roomequipment");
            return (Criteria) this;
        }

        public Criteria andRoomequipmentNotEqualTo(String value) {
            addCriterion("ROOMEQUIPMENT <>", value, "roomequipment");
            return (Criteria) this;
        }

        public Criteria andRoomequipmentGreaterThan(String value) {
            addCriterion("ROOMEQUIPMENT >", value, "roomequipment");
            return (Criteria) this;
        }

        public Criteria andRoomequipmentGreaterThanOrEqualTo(String value) {
            addCriterion("ROOMEQUIPMENT >=", value, "roomequipment");
            return (Criteria) this;
        }

        public Criteria andRoomequipmentLessThan(String value) {
            addCriterion("ROOMEQUIPMENT <", value, "roomequipment");
            return (Criteria) this;
        }

        public Criteria andRoomequipmentLessThanOrEqualTo(String value) {
            addCriterion("ROOMEQUIPMENT <=", value, "roomequipment");
            return (Criteria) this;
        }

        public Criteria andRoomequipmentLike(String value) {
            addCriterion("ROOMEQUIPMENT like", value, "roomequipment");
            return (Criteria) this;
        }

        public Criteria andRoomequipmentNotLike(String value) {
            addCriterion("ROOMEQUIPMENT not like", value, "roomequipment");
            return (Criteria) this;
        }

        public Criteria andRoomequipmentIn(List<String> values) {
            addCriterion("ROOMEQUIPMENT in", values, "roomequipment");
            return (Criteria) this;
        }

        public Criteria andRoomequipmentNotIn(List<String> values) {
            addCriterion("ROOMEQUIPMENT not in", values, "roomequipment");
            return (Criteria) this;
        }

        public Criteria andRoomequipmentBetween(String value1, String value2) {
            addCriterion("ROOMEQUIPMENT between", value1, value2, "roomequipment");
            return (Criteria) this;
        }

        public Criteria andRoomequipmentNotBetween(String value1, String value2) {
            addCriterion("ROOMEQUIPMENT not between", value1, value2, "roomequipment");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRoomlevleIsNull() {
            addCriterion("ROOMLEVLE is null");
            return (Criteria) this;
        }

        public Criteria andRoomlevleIsNotNull() {
            addCriterion("ROOMLEVLE is not null");
            return (Criteria) this;
        }

        public Criteria andRoomlevleEqualTo(BigDecimal value) {
            addCriterion("ROOMLEVLE =", value, "roomlevle");
            return (Criteria) this;
        }

        public Criteria andRoomlevleNotEqualTo(BigDecimal value) {
            addCriterion("ROOMLEVLE <>", value, "roomlevle");
            return (Criteria) this;
        }

        public Criteria andRoomlevleGreaterThan(BigDecimal value) {
            addCriterion("ROOMLEVLE >", value, "roomlevle");
            return (Criteria) this;
        }

        public Criteria andRoomlevleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOMLEVLE >=", value, "roomlevle");
            return (Criteria) this;
        }

        public Criteria andRoomlevleLessThan(BigDecimal value) {
            addCriterion("ROOMLEVLE <", value, "roomlevle");
            return (Criteria) this;
        }

        public Criteria andRoomlevleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOMLEVLE <=", value, "roomlevle");
            return (Criteria) this;
        }

        public Criteria andRoomlevleIn(List<BigDecimal> values) {
            addCriterion("ROOMLEVLE in", values, "roomlevle");
            return (Criteria) this;
        }

        public Criteria andRoomlevleNotIn(List<BigDecimal> values) {
            addCriterion("ROOMLEVLE not in", values, "roomlevle");
            return (Criteria) this;
        }

        public Criteria andRoomlevleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOMLEVLE between", value1, value2, "roomlevle");
            return (Criteria) this;
        }

        public Criteria andRoomlevleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOMLEVLE not between", value1, value2, "roomlevle");
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