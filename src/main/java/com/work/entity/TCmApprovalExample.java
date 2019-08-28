package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TCmApprovalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCmApprovalExample() {
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

        public Criteria andApplyidIsNull() {
            addCriterion("APPLYID is null");
            return (Criteria) this;
        }

        public Criteria andApplyidIsNotNull() {
            addCriterion("APPLYID is not null");
            return (Criteria) this;
        }

        public Criteria andApplyidEqualTo(String value) {
            addCriterion("APPLYID =", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidNotEqualTo(String value) {
            addCriterion("APPLYID <>", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidGreaterThan(String value) {
            addCriterion("APPLYID >", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYID >=", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidLessThan(String value) {
            addCriterion("APPLYID <", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidLessThanOrEqualTo(String value) {
            addCriterion("APPLYID <=", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidLike(String value) {
            addCriterion("APPLYID like", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidNotLike(String value) {
            addCriterion("APPLYID not like", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidIn(List<String> values) {
            addCriterion("APPLYID in", values, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidNotIn(List<String> values) {
            addCriterion("APPLYID not in", values, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidBetween(String value1, String value2) {
            addCriterion("APPLYID between", value1, value2, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidNotBetween(String value1, String value2) {
            addCriterion("APPLYID not between", value1, value2, "applyid");
            return (Criteria) this;
        }

        public Criteria andApprovalcommnetIsNull() {
            addCriterion("APPROVALCOMMNET is null");
            return (Criteria) this;
        }

        public Criteria andApprovalcommnetIsNotNull() {
            addCriterion("APPROVALCOMMNET is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalcommnetEqualTo(String value) {
            addCriterion("APPROVALCOMMNET =", value, "approvalcommnet");
            return (Criteria) this;
        }

        public Criteria andApprovalcommnetNotEqualTo(String value) {
            addCriterion("APPROVALCOMMNET <>", value, "approvalcommnet");
            return (Criteria) this;
        }

        public Criteria andApprovalcommnetGreaterThan(String value) {
            addCriterion("APPROVALCOMMNET >", value, "approvalcommnet");
            return (Criteria) this;
        }

        public Criteria andApprovalcommnetGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVALCOMMNET >=", value, "approvalcommnet");
            return (Criteria) this;
        }

        public Criteria andApprovalcommnetLessThan(String value) {
            addCriterion("APPROVALCOMMNET <", value, "approvalcommnet");
            return (Criteria) this;
        }

        public Criteria andApprovalcommnetLessThanOrEqualTo(String value) {
            addCriterion("APPROVALCOMMNET <=", value, "approvalcommnet");
            return (Criteria) this;
        }

        public Criteria andApprovalcommnetLike(String value) {
            addCriterion("APPROVALCOMMNET like", value, "approvalcommnet");
            return (Criteria) this;
        }

        public Criteria andApprovalcommnetNotLike(String value) {
            addCriterion("APPROVALCOMMNET not like", value, "approvalcommnet");
            return (Criteria) this;
        }

        public Criteria andApprovalcommnetIn(List<String> values) {
            addCriterion("APPROVALCOMMNET in", values, "approvalcommnet");
            return (Criteria) this;
        }

        public Criteria andApprovalcommnetNotIn(List<String> values) {
            addCriterion("APPROVALCOMMNET not in", values, "approvalcommnet");
            return (Criteria) this;
        }

        public Criteria andApprovalcommnetBetween(String value1, String value2) {
            addCriterion("APPROVALCOMMNET between", value1, value2, "approvalcommnet");
            return (Criteria) this;
        }

        public Criteria andApprovalcommnetNotBetween(String value1, String value2) {
            addCriterion("APPROVALCOMMNET not between", value1, value2, "approvalcommnet");
            return (Criteria) this;
        }

        public Criteria andFdHandleridIsNull() {
            addCriterion("FD_HANDLERID is null");
            return (Criteria) this;
        }

        public Criteria andFdHandleridIsNotNull() {
            addCriterion("FD_HANDLERID is not null");
            return (Criteria) this;
        }

        public Criteria andFdHandleridEqualTo(String value) {
            addCriterion("FD_HANDLERID =", value, "fdHandlerid");
            return (Criteria) this;
        }

        public Criteria andFdHandleridNotEqualTo(String value) {
            addCriterion("FD_HANDLERID <>", value, "fdHandlerid");
            return (Criteria) this;
        }

        public Criteria andFdHandleridGreaterThan(String value) {
            addCriterion("FD_HANDLERID >", value, "fdHandlerid");
            return (Criteria) this;
        }

        public Criteria andFdHandleridGreaterThanOrEqualTo(String value) {
            addCriterion("FD_HANDLERID >=", value, "fdHandlerid");
            return (Criteria) this;
        }

        public Criteria andFdHandleridLessThan(String value) {
            addCriterion("FD_HANDLERID <", value, "fdHandlerid");
            return (Criteria) this;
        }

        public Criteria andFdHandleridLessThanOrEqualTo(String value) {
            addCriterion("FD_HANDLERID <=", value, "fdHandlerid");
            return (Criteria) this;
        }

        public Criteria andFdHandleridLike(String value) {
            addCriterion("FD_HANDLERID like", value, "fdHandlerid");
            return (Criteria) this;
        }

        public Criteria andFdHandleridNotLike(String value) {
            addCriterion("FD_HANDLERID not like", value, "fdHandlerid");
            return (Criteria) this;
        }

        public Criteria andFdHandleridIn(List<String> values) {
            addCriterion("FD_HANDLERID in", values, "fdHandlerid");
            return (Criteria) this;
        }

        public Criteria andFdHandleridNotIn(List<String> values) {
            addCriterion("FD_HANDLERID not in", values, "fdHandlerid");
            return (Criteria) this;
        }

        public Criteria andFdHandleridBetween(String value1, String value2) {
            addCriterion("FD_HANDLERID between", value1, value2, "fdHandlerid");
            return (Criteria) this;
        }

        public Criteria andFdHandleridNotBetween(String value1, String value2) {
            addCriterion("FD_HANDLERID not between", value1, value2, "fdHandlerid");
            return (Criteria) this;
        }

        public Criteria andFdHandlernmeIsNull() {
            addCriterion("FD_HANDLERNME is null");
            return (Criteria) this;
        }

        public Criteria andFdHandlernmeIsNotNull() {
            addCriterion("FD_HANDLERNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdHandlernmeEqualTo(String value) {
            addCriterion("FD_HANDLERNME =", value, "fdHandlernme");
            return (Criteria) this;
        }

        public Criteria andFdHandlernmeNotEqualTo(String value) {
            addCriterion("FD_HANDLERNME <>", value, "fdHandlernme");
            return (Criteria) this;
        }

        public Criteria andFdHandlernmeGreaterThan(String value) {
            addCriterion("FD_HANDLERNME >", value, "fdHandlernme");
            return (Criteria) this;
        }

        public Criteria andFdHandlernmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_HANDLERNME >=", value, "fdHandlernme");
            return (Criteria) this;
        }

        public Criteria andFdHandlernmeLessThan(String value) {
            addCriterion("FD_HANDLERNME <", value, "fdHandlernme");
            return (Criteria) this;
        }

        public Criteria andFdHandlernmeLessThanOrEqualTo(String value) {
            addCriterion("FD_HANDLERNME <=", value, "fdHandlernme");
            return (Criteria) this;
        }

        public Criteria andFdHandlernmeLike(String value) {
            addCriterion("FD_HANDLERNME like", value, "fdHandlernme");
            return (Criteria) this;
        }

        public Criteria andFdHandlernmeNotLike(String value) {
            addCriterion("FD_HANDLERNME not like", value, "fdHandlernme");
            return (Criteria) this;
        }

        public Criteria andFdHandlernmeIn(List<String> values) {
            addCriterion("FD_HANDLERNME in", values, "fdHandlernme");
            return (Criteria) this;
        }

        public Criteria andFdHandlernmeNotIn(List<String> values) {
            addCriterion("FD_HANDLERNME not in", values, "fdHandlernme");
            return (Criteria) this;
        }

        public Criteria andFdHandlernmeBetween(String value1, String value2) {
            addCriterion("FD_HANDLERNME between", value1, value2, "fdHandlernme");
            return (Criteria) this;
        }

        public Criteria andFdHandlernmeNotBetween(String value1, String value2) {
            addCriterion("FD_HANDLERNME not between", value1, value2, "fdHandlernme");
            return (Criteria) this;
        }

        public Criteria andFdHandletimeIsNull() {
            addCriterion("FD_HANDLETIME is null");
            return (Criteria) this;
        }

        public Criteria andFdHandletimeIsNotNull() {
            addCriterion("FD_HANDLETIME is not null");
            return (Criteria) this;
        }

        public Criteria andFdHandletimeEqualTo(String value) {
            addCriterion("FD_HANDLETIME =", value, "fdHandletime");
            return (Criteria) this;
        }

        public Criteria andFdHandletimeNotEqualTo(String value) {
            addCriterion("FD_HANDLETIME <>", value, "fdHandletime");
            return (Criteria) this;
        }

        public Criteria andFdHandletimeGreaterThan(String value) {
            addCriterion("FD_HANDLETIME >", value, "fdHandletime");
            return (Criteria) this;
        }

        public Criteria andFdHandletimeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_HANDLETIME >=", value, "fdHandletime");
            return (Criteria) this;
        }

        public Criteria andFdHandletimeLessThan(String value) {
            addCriterion("FD_HANDLETIME <", value, "fdHandletime");
            return (Criteria) this;
        }

        public Criteria andFdHandletimeLessThanOrEqualTo(String value) {
            addCriterion("FD_HANDLETIME <=", value, "fdHandletime");
            return (Criteria) this;
        }

        public Criteria andFdHandletimeLike(String value) {
            addCriterion("FD_HANDLETIME like", value, "fdHandletime");
            return (Criteria) this;
        }

        public Criteria andFdHandletimeNotLike(String value) {
            addCriterion("FD_HANDLETIME not like", value, "fdHandletime");
            return (Criteria) this;
        }

        public Criteria andFdHandletimeIn(List<String> values) {
            addCriterion("FD_HANDLETIME in", values, "fdHandletime");
            return (Criteria) this;
        }

        public Criteria andFdHandletimeNotIn(List<String> values) {
            addCriterion("FD_HANDLETIME not in", values, "fdHandletime");
            return (Criteria) this;
        }

        public Criteria andFdHandletimeBetween(String value1, String value2) {
            addCriterion("FD_HANDLETIME between", value1, value2, "fdHandletime");
            return (Criteria) this;
        }

        public Criteria andFdHandletimeNotBetween(String value1, String value2) {
            addCriterion("FD_HANDLETIME not between", value1, value2, "fdHandletime");
            return (Criteria) this;
        }

        public Criteria andFdStatusIsNull() {
            addCriterion("FD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFdStatusIsNotNull() {
            addCriterion("FD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFdStatusEqualTo(String value) {
            addCriterion("FD_STATUS =", value, "fdStatus");
            return (Criteria) this;
        }

        public Criteria andFdStatusNotEqualTo(String value) {
            addCriterion("FD_STATUS <>", value, "fdStatus");
            return (Criteria) this;
        }

        public Criteria andFdStatusGreaterThan(String value) {
            addCriterion("FD_STATUS >", value, "fdStatus");
            return (Criteria) this;
        }

        public Criteria andFdStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FD_STATUS >=", value, "fdStatus");
            return (Criteria) this;
        }

        public Criteria andFdStatusLessThan(String value) {
            addCriterion("FD_STATUS <", value, "fdStatus");
            return (Criteria) this;
        }

        public Criteria andFdStatusLessThanOrEqualTo(String value) {
            addCriterion("FD_STATUS <=", value, "fdStatus");
            return (Criteria) this;
        }

        public Criteria andFdStatusLike(String value) {
            addCriterion("FD_STATUS like", value, "fdStatus");
            return (Criteria) this;
        }

        public Criteria andFdStatusNotLike(String value) {
            addCriterion("FD_STATUS not like", value, "fdStatus");
            return (Criteria) this;
        }

        public Criteria andFdStatusIn(List<String> values) {
            addCriterion("FD_STATUS in", values, "fdStatus");
            return (Criteria) this;
        }

        public Criteria andFdStatusNotIn(List<String> values) {
            addCriterion("FD_STATUS not in", values, "fdStatus");
            return (Criteria) this;
        }

        public Criteria andFdStatusBetween(String value1, String value2) {
            addCriterion("FD_STATUS between", value1, value2, "fdStatus");
            return (Criteria) this;
        }

        public Criteria andFdStatusNotBetween(String value1, String value2) {
            addCriterion("FD_STATUS not between", value1, value2, "fdStatus");
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