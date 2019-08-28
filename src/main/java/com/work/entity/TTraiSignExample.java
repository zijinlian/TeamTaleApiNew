package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TTraiSignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTraiSignExample() {
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

        public Criteria andSignidIsNull() {
            addCriterion("SIGNID is null");
            return (Criteria) this;
        }

        public Criteria andSignidIsNotNull() {
            addCriterion("SIGNID is not null");
            return (Criteria) this;
        }

        public Criteria andSignidEqualTo(String value) {
            addCriterion("SIGNID =", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotEqualTo(String value) {
            addCriterion("SIGNID <>", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidGreaterThan(String value) {
            addCriterion("SIGNID >", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNID >=", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLessThan(String value) {
            addCriterion("SIGNID <", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLessThanOrEqualTo(String value) {
            addCriterion("SIGNID <=", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLike(String value) {
            addCriterion("SIGNID like", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotLike(String value) {
            addCriterion("SIGNID not like", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidIn(List<String> values) {
            addCriterion("SIGNID in", values, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotIn(List<String> values) {
            addCriterion("SIGNID not in", values, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidBetween(String value1, String value2) {
            addCriterion("SIGNID between", value1, value2, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotBetween(String value1, String value2) {
            addCriterion("SIGNID not between", value1, value2, "signid");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNull() {
            addCriterion("SIGNTIME is null");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNotNull() {
            addCriterion("SIGNTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSigntimeEqualTo(String value) {
            addCriterion("SIGNTIME =", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotEqualTo(String value) {
            addCriterion("SIGNTIME <>", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThan(String value) {
            addCriterion("SIGNTIME >", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNTIME >=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThan(String value) {
            addCriterion("SIGNTIME <", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThanOrEqualTo(String value) {
            addCriterion("SIGNTIME <=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLike(String value) {
            addCriterion("SIGNTIME like", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotLike(String value) {
            addCriterion("SIGNTIME not like", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeIn(List<String> values) {
            addCriterion("SIGNTIME in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotIn(List<String> values) {
            addCriterion("SIGNTIME not in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeBetween(String value1, String value2) {
            addCriterion("SIGNTIME between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotBetween(String value1, String value2) {
            addCriterion("SIGNTIME not between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("COURSEID is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("COURSEID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(String value) {
            addCriterion("COURSEID =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(String value) {
            addCriterion("COURSEID <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(String value) {
            addCriterion("COURSEID >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(String value) {
            addCriterion("COURSEID >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(String value) {
            addCriterion("COURSEID <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(String value) {
            addCriterion("COURSEID <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLike(String value) {
            addCriterion("COURSEID like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotLike(String value) {
            addCriterion("COURSEID not like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<String> values) {
            addCriterion("COURSEID in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<String> values) {
            addCriterion("COURSEID not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(String value1, String value2) {
            addCriterion("COURSEID between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(String value1, String value2) {
            addCriterion("COURSEID not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNull() {
            addCriterion("EMPLOYEEID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("EMPLOYEEID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(String value) {
            addCriterion("EMPLOYEEID =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(String value) {
            addCriterion("EMPLOYEEID <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(String value) {
            addCriterion("EMPLOYEEID >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEEID >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(String value) {
            addCriterion("EMPLOYEEID <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEEID <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLike(String value) {
            addCriterion("EMPLOYEEID like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotLike(String value) {
            addCriterion("EMPLOYEEID not like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<String> values) {
            addCriterion("EMPLOYEEID in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<String> values) {
            addCriterion("EMPLOYEEID not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(String value1, String value2) {
            addCriterion("EMPLOYEEID between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEEID not between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIsNull() {
            addCriterion("EMPLOYEENAME is null");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIsNotNull() {
            addCriterion("EMPLOYEENAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeenameEqualTo(String value) {
            addCriterion("EMPLOYEENAME =", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotEqualTo(String value) {
            addCriterion("EMPLOYEENAME <>", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameGreaterThan(String value) {
            addCriterion("EMPLOYEENAME >", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEENAME >=", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLessThan(String value) {
            addCriterion("EMPLOYEENAME <", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEENAME <=", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLike(String value) {
            addCriterion("EMPLOYEENAME like", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotLike(String value) {
            addCriterion("EMPLOYEENAME not like", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIn(List<String> values) {
            addCriterion("EMPLOYEENAME in", values, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotIn(List<String> values) {
            addCriterion("EMPLOYEENAME not in", values, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameBetween(String value1, String value2) {
            addCriterion("EMPLOYEENAME between", value1, value2, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEENAME not between", value1, value2, "employeename");
            return (Criteria) this;
        }

        public Criteria andSigncourseidIsNull() {
            addCriterion("SIGNCOURSEID is null");
            return (Criteria) this;
        }

        public Criteria andSigncourseidIsNotNull() {
            addCriterion("SIGNCOURSEID is not null");
            return (Criteria) this;
        }

        public Criteria andSigncourseidEqualTo(String value) {
            addCriterion("SIGNCOURSEID =", value, "signcourseid");
            return (Criteria) this;
        }

        public Criteria andSigncourseidNotEqualTo(String value) {
            addCriterion("SIGNCOURSEID <>", value, "signcourseid");
            return (Criteria) this;
        }

        public Criteria andSigncourseidGreaterThan(String value) {
            addCriterion("SIGNCOURSEID >", value, "signcourseid");
            return (Criteria) this;
        }

        public Criteria andSigncourseidGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNCOURSEID >=", value, "signcourseid");
            return (Criteria) this;
        }

        public Criteria andSigncourseidLessThan(String value) {
            addCriterion("SIGNCOURSEID <", value, "signcourseid");
            return (Criteria) this;
        }

        public Criteria andSigncourseidLessThanOrEqualTo(String value) {
            addCriterion("SIGNCOURSEID <=", value, "signcourseid");
            return (Criteria) this;
        }

        public Criteria andSigncourseidLike(String value) {
            addCriterion("SIGNCOURSEID like", value, "signcourseid");
            return (Criteria) this;
        }

        public Criteria andSigncourseidNotLike(String value) {
            addCriterion("SIGNCOURSEID not like", value, "signcourseid");
            return (Criteria) this;
        }

        public Criteria andSigncourseidIn(List<String> values) {
            addCriterion("SIGNCOURSEID in", values, "signcourseid");
            return (Criteria) this;
        }

        public Criteria andSigncourseidNotIn(List<String> values) {
            addCriterion("SIGNCOURSEID not in", values, "signcourseid");
            return (Criteria) this;
        }

        public Criteria andSigncourseidBetween(String value1, String value2) {
            addCriterion("SIGNCOURSEID between", value1, value2, "signcourseid");
            return (Criteria) this;
        }

        public Criteria andSigncourseidNotBetween(String value1, String value2) {
            addCriterion("SIGNCOURSEID not between", value1, value2, "signcourseid");
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