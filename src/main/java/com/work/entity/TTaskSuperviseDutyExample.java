package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TTaskSuperviseDutyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTaskSuperviseDutyExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andFdObjectIdIsNull() {
            addCriterion("FD_OBJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdObjectIdIsNotNull() {
            addCriterion("FD_OBJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdObjectIdEqualTo(String value) {
            addCriterion("FD_OBJECT_ID =", value, "fdObjectId");
            return (Criteria) this;
        }

        public Criteria andFdObjectIdNotEqualTo(String value) {
            addCriterion("FD_OBJECT_ID <>", value, "fdObjectId");
            return (Criteria) this;
        }

        public Criteria andFdObjectIdGreaterThan(String value) {
            addCriterion("FD_OBJECT_ID >", value, "fdObjectId");
            return (Criteria) this;
        }

        public Criteria andFdObjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_OBJECT_ID >=", value, "fdObjectId");
            return (Criteria) this;
        }

        public Criteria andFdObjectIdLessThan(String value) {
            addCriterion("FD_OBJECT_ID <", value, "fdObjectId");
            return (Criteria) this;
        }

        public Criteria andFdObjectIdLessThanOrEqualTo(String value) {
            addCriterion("FD_OBJECT_ID <=", value, "fdObjectId");
            return (Criteria) this;
        }

        public Criteria andFdObjectIdLike(String value) {
            addCriterion("FD_OBJECT_ID like", value, "fdObjectId");
            return (Criteria) this;
        }

        public Criteria andFdObjectIdNotLike(String value) {
            addCriterion("FD_OBJECT_ID not like", value, "fdObjectId");
            return (Criteria) this;
        }

        public Criteria andFdObjectIdIn(List<String> values) {
            addCriterion("FD_OBJECT_ID in", values, "fdObjectId");
            return (Criteria) this;
        }

        public Criteria andFdObjectIdNotIn(List<String> values) {
            addCriterion("FD_OBJECT_ID not in", values, "fdObjectId");
            return (Criteria) this;
        }

        public Criteria andFdObjectIdBetween(String value1, String value2) {
            addCriterion("FD_OBJECT_ID between", value1, value2, "fdObjectId");
            return (Criteria) this;
        }

        public Criteria andFdObjectIdNotBetween(String value1, String value2) {
            addCriterion("FD_OBJECT_ID not between", value1, value2, "fdObjectId");
            return (Criteria) this;
        }

        public Criteria andFdTaskFlayIsNull() {
            addCriterion("FD_TASK_FLAY is null");
            return (Criteria) this;
        }

        public Criteria andFdTaskFlayIsNotNull() {
            addCriterion("FD_TASK_FLAY is not null");
            return (Criteria) this;
        }

        public Criteria andFdTaskFlayEqualTo(String value) {
            addCriterion("FD_TASK_FLAY =", value, "fdTaskFlay");
            return (Criteria) this;
        }

        public Criteria andFdTaskFlayNotEqualTo(String value) {
            addCriterion("FD_TASK_FLAY <>", value, "fdTaskFlay");
            return (Criteria) this;
        }

        public Criteria andFdTaskFlayGreaterThan(String value) {
            addCriterion("FD_TASK_FLAY >", value, "fdTaskFlay");
            return (Criteria) this;
        }

        public Criteria andFdTaskFlayGreaterThanOrEqualTo(String value) {
            addCriterion("FD_TASK_FLAY >=", value, "fdTaskFlay");
            return (Criteria) this;
        }

        public Criteria andFdTaskFlayLessThan(String value) {
            addCriterion("FD_TASK_FLAY <", value, "fdTaskFlay");
            return (Criteria) this;
        }

        public Criteria andFdTaskFlayLessThanOrEqualTo(String value) {
            addCriterion("FD_TASK_FLAY <=", value, "fdTaskFlay");
            return (Criteria) this;
        }

        public Criteria andFdTaskFlayLike(String value) {
            addCriterion("FD_TASK_FLAY like", value, "fdTaskFlay");
            return (Criteria) this;
        }

        public Criteria andFdTaskFlayNotLike(String value) {
            addCriterion("FD_TASK_FLAY not like", value, "fdTaskFlay");
            return (Criteria) this;
        }

        public Criteria andFdTaskFlayIn(List<String> values) {
            addCriterion("FD_TASK_FLAY in", values, "fdTaskFlay");
            return (Criteria) this;
        }

        public Criteria andFdTaskFlayNotIn(List<String> values) {
            addCriterion("FD_TASK_FLAY not in", values, "fdTaskFlay");
            return (Criteria) this;
        }

        public Criteria andFdTaskFlayBetween(String value1, String value2) {
            addCriterion("FD_TASK_FLAY between", value1, value2, "fdTaskFlay");
            return (Criteria) this;
        }

        public Criteria andFdTaskFlayNotBetween(String value1, String value2) {
            addCriterion("FD_TASK_FLAY not between", value1, value2, "fdTaskFlay");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeIsNull() {
            addCriterion("FD_TASK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeIsNotNull() {
            addCriterion("FD_TASK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeEqualTo(String value) {
            addCriterion("FD_TASK_TYPE =", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeNotEqualTo(String value) {
            addCriterion("FD_TASK_TYPE <>", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeGreaterThan(String value) {
            addCriterion("FD_TASK_TYPE >", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_TASK_TYPE >=", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeLessThan(String value) {
            addCriterion("FD_TASK_TYPE <", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("FD_TASK_TYPE <=", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeLike(String value) {
            addCriterion("FD_TASK_TYPE like", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeNotLike(String value) {
            addCriterion("FD_TASK_TYPE not like", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeIn(List<String> values) {
            addCriterion("FD_TASK_TYPE in", values, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeNotIn(List<String> values) {
            addCriterion("FD_TASK_TYPE not in", values, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeBetween(String value1, String value2) {
            addCriterion("FD_TASK_TYPE between", value1, value2, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeNotBetween(String value1, String value2) {
            addCriterion("FD_TASK_TYPE not between", value1, value2, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskDeptIsNull() {
            addCriterion("FD_TASK_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andFdTaskDeptIsNotNull() {
            addCriterion("FD_TASK_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andFdTaskDeptEqualTo(String value) {
            addCriterion("FD_TASK_DEPT =", value, "fdTaskDept");
            return (Criteria) this;
        }

        public Criteria andFdTaskDeptNotEqualTo(String value) {
            addCriterion("FD_TASK_DEPT <>", value, "fdTaskDept");
            return (Criteria) this;
        }

        public Criteria andFdTaskDeptGreaterThan(String value) {
            addCriterion("FD_TASK_DEPT >", value, "fdTaskDept");
            return (Criteria) this;
        }

        public Criteria andFdTaskDeptGreaterThanOrEqualTo(String value) {
            addCriterion("FD_TASK_DEPT >=", value, "fdTaskDept");
            return (Criteria) this;
        }

        public Criteria andFdTaskDeptLessThan(String value) {
            addCriterion("FD_TASK_DEPT <", value, "fdTaskDept");
            return (Criteria) this;
        }

        public Criteria andFdTaskDeptLessThanOrEqualTo(String value) {
            addCriterion("FD_TASK_DEPT <=", value, "fdTaskDept");
            return (Criteria) this;
        }

        public Criteria andFdTaskDeptLike(String value) {
            addCriterion("FD_TASK_DEPT like", value, "fdTaskDept");
            return (Criteria) this;
        }

        public Criteria andFdTaskDeptNotLike(String value) {
            addCriterion("FD_TASK_DEPT not like", value, "fdTaskDept");
            return (Criteria) this;
        }

        public Criteria andFdTaskDeptIn(List<String> values) {
            addCriterion("FD_TASK_DEPT in", values, "fdTaskDept");
            return (Criteria) this;
        }

        public Criteria andFdTaskDeptNotIn(List<String> values) {
            addCriterion("FD_TASK_DEPT not in", values, "fdTaskDept");
            return (Criteria) this;
        }

        public Criteria andFdTaskDeptBetween(String value1, String value2) {
            addCriterion("FD_TASK_DEPT between", value1, value2, "fdTaskDept");
            return (Criteria) this;
        }

        public Criteria andFdTaskDeptNotBetween(String value1, String value2) {
            addCriterion("FD_TASK_DEPT not between", value1, value2, "fdTaskDept");
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