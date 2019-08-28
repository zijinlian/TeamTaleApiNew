package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TTraiTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTraiTeacherExample() {
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

        public Criteria andTeacheridIsNull() {
            addCriterion("TEACHERID is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("TEACHERID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(String value) {
            addCriterion("TEACHERID =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(String value) {
            addCriterion("TEACHERID <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(String value) {
            addCriterion("TEACHERID >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHERID >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(String value) {
            addCriterion("TEACHERID <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(String value) {
            addCriterion("TEACHERID <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLike(String value) {
            addCriterion("TEACHERID like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotLike(String value) {
            addCriterion("TEACHERID not like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<String> values) {
            addCriterion("TEACHERID in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<String> values) {
            addCriterion("TEACHERID not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(String value1, String value2) {
            addCriterion("TEACHERID between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(String value1, String value2) {
            addCriterion("TEACHERID not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNull() {
            addCriterion("TEACHERNAME is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("TEACHERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("TEACHERNAME =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("TEACHERNAME <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("TEACHERNAME >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHERNAME >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("TEACHERNAME <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("TEACHERNAME <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("TEACHERNAME like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("TEACHERNAME not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("TEACHERNAME in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("TEACHERNAME not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("TEACHERNAME between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("TEACHERNAME not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andIsexternalIsNull() {
            addCriterion("ISEXTERNAL is null");
            return (Criteria) this;
        }

        public Criteria andIsexternalIsNotNull() {
            addCriterion("ISEXTERNAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsexternalEqualTo(String value) {
            addCriterion("ISEXTERNAL =", value, "isexternal");
            return (Criteria) this;
        }

        public Criteria andIsexternalNotEqualTo(String value) {
            addCriterion("ISEXTERNAL <>", value, "isexternal");
            return (Criteria) this;
        }

        public Criteria andIsexternalGreaterThan(String value) {
            addCriterion("ISEXTERNAL >", value, "isexternal");
            return (Criteria) this;
        }

        public Criteria andIsexternalGreaterThanOrEqualTo(String value) {
            addCriterion("ISEXTERNAL >=", value, "isexternal");
            return (Criteria) this;
        }

        public Criteria andIsexternalLessThan(String value) {
            addCriterion("ISEXTERNAL <", value, "isexternal");
            return (Criteria) this;
        }

        public Criteria andIsexternalLessThanOrEqualTo(String value) {
            addCriterion("ISEXTERNAL <=", value, "isexternal");
            return (Criteria) this;
        }

        public Criteria andIsexternalLike(String value) {
            addCriterion("ISEXTERNAL like", value, "isexternal");
            return (Criteria) this;
        }

        public Criteria andIsexternalNotLike(String value) {
            addCriterion("ISEXTERNAL not like", value, "isexternal");
            return (Criteria) this;
        }

        public Criteria andIsexternalIn(List<String> values) {
            addCriterion("ISEXTERNAL in", values, "isexternal");
            return (Criteria) this;
        }

        public Criteria andIsexternalNotIn(List<String> values) {
            addCriterion("ISEXTERNAL not in", values, "isexternal");
            return (Criteria) this;
        }

        public Criteria andIsexternalBetween(String value1, String value2) {
            addCriterion("ISEXTERNAL between", value1, value2, "isexternal");
            return (Criteria) this;
        }

        public Criteria andIsexternalNotBetween(String value1, String value2) {
            addCriterion("ISEXTERNAL not between", value1, value2, "isexternal");
            return (Criteria) this;
        }

        public Criteria andCommnetIsNull() {
            addCriterion("COMMNET is null");
            return (Criteria) this;
        }

        public Criteria andCommnetIsNotNull() {
            addCriterion("COMMNET is not null");
            return (Criteria) this;
        }

        public Criteria andCommnetEqualTo(String value) {
            addCriterion("COMMNET =", value, "commnet");
            return (Criteria) this;
        }

        public Criteria andCommnetNotEqualTo(String value) {
            addCriterion("COMMNET <>", value, "commnet");
            return (Criteria) this;
        }

        public Criteria andCommnetGreaterThan(String value) {
            addCriterion("COMMNET >", value, "commnet");
            return (Criteria) this;
        }

        public Criteria andCommnetGreaterThanOrEqualTo(String value) {
            addCriterion("COMMNET >=", value, "commnet");
            return (Criteria) this;
        }

        public Criteria andCommnetLessThan(String value) {
            addCriterion("COMMNET <", value, "commnet");
            return (Criteria) this;
        }

        public Criteria andCommnetLessThanOrEqualTo(String value) {
            addCriterion("COMMNET <=", value, "commnet");
            return (Criteria) this;
        }

        public Criteria andCommnetLike(String value) {
            addCriterion("COMMNET like", value, "commnet");
            return (Criteria) this;
        }

        public Criteria andCommnetNotLike(String value) {
            addCriterion("COMMNET not like", value, "commnet");
            return (Criteria) this;
        }

        public Criteria andCommnetIn(List<String> values) {
            addCriterion("COMMNET in", values, "commnet");
            return (Criteria) this;
        }

        public Criteria andCommnetNotIn(List<String> values) {
            addCriterion("COMMNET not in", values, "commnet");
            return (Criteria) this;
        }

        public Criteria andCommnetBetween(String value1, String value2) {
            addCriterion("COMMNET between", value1, value2, "commnet");
            return (Criteria) this;
        }

        public Criteria andCommnetNotBetween(String value1, String value2) {
            addCriterion("COMMNET not between", value1, value2, "commnet");
            return (Criteria) this;
        }

        public Criteria andTeacherempidIsNull() {
            addCriterion("TEACHEREMPID is null");
            return (Criteria) this;
        }

        public Criteria andTeacherempidIsNotNull() {
            addCriterion("TEACHEREMPID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherempidEqualTo(String value) {
            addCriterion("TEACHEREMPID =", value, "teacherempid");
            return (Criteria) this;
        }

        public Criteria andTeacherempidNotEqualTo(String value) {
            addCriterion("TEACHEREMPID <>", value, "teacherempid");
            return (Criteria) this;
        }

        public Criteria andTeacherempidGreaterThan(String value) {
            addCriterion("TEACHEREMPID >", value, "teacherempid");
            return (Criteria) this;
        }

        public Criteria andTeacherempidGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHEREMPID >=", value, "teacherempid");
            return (Criteria) this;
        }

        public Criteria andTeacherempidLessThan(String value) {
            addCriterion("TEACHEREMPID <", value, "teacherempid");
            return (Criteria) this;
        }

        public Criteria andTeacherempidLessThanOrEqualTo(String value) {
            addCriterion("TEACHEREMPID <=", value, "teacherempid");
            return (Criteria) this;
        }

        public Criteria andTeacherempidLike(String value) {
            addCriterion("TEACHEREMPID like", value, "teacherempid");
            return (Criteria) this;
        }

        public Criteria andTeacherempidNotLike(String value) {
            addCriterion("TEACHEREMPID not like", value, "teacherempid");
            return (Criteria) this;
        }

        public Criteria andTeacherempidIn(List<String> values) {
            addCriterion("TEACHEREMPID in", values, "teacherempid");
            return (Criteria) this;
        }

        public Criteria andTeacherempidNotIn(List<String> values) {
            addCriterion("TEACHEREMPID not in", values, "teacherempid");
            return (Criteria) this;
        }

        public Criteria andTeacherempidBetween(String value1, String value2) {
            addCriterion("TEACHEREMPID between", value1, value2, "teacherempid");
            return (Criteria) this;
        }

        public Criteria andTeacherempidNotBetween(String value1, String value2) {
            addCriterion("TEACHEREMPID not between", value1, value2, "teacherempid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNull() {
            addCriterion("OPERATORID is null");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNotNull() {
            addCriterion("OPERATORID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatoridEqualTo(String value) {
            addCriterion("OPERATORID =", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotEqualTo(String value) {
            addCriterion("OPERATORID <>", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThan(String value) {
            addCriterion("OPERATORID >", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATORID >=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThan(String value) {
            addCriterion("OPERATORID <", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThanOrEqualTo(String value) {
            addCriterion("OPERATORID <=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLike(String value) {
            addCriterion("OPERATORID like", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotLike(String value) {
            addCriterion("OPERATORID not like", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIn(List<String> values) {
            addCriterion("OPERATORID in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotIn(List<String> values) {
            addCriterion("OPERATORID not in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridBetween(String value1, String value2) {
            addCriterion("OPERATORID between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotBetween(String value1, String value2) {
            addCriterion("OPERATORID not between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNull() {
            addCriterion("OPERATORNAME is null");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNotNull() {
            addCriterion("OPERATORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatornameEqualTo(String value) {
            addCriterion("OPERATORNAME =", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotEqualTo(String value) {
            addCriterion("OPERATORNAME <>", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThan(String value) {
            addCriterion("OPERATORNAME >", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATORNAME >=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThan(String value) {
            addCriterion("OPERATORNAME <", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThanOrEqualTo(String value) {
            addCriterion("OPERATORNAME <=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLike(String value) {
            addCriterion("OPERATORNAME like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotLike(String value) {
            addCriterion("OPERATORNAME not like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameIn(List<String> values) {
            addCriterion("OPERATORNAME in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotIn(List<String> values) {
            addCriterion("OPERATORNAME not in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameBetween(String value1, String value2) {
            addCriterion("OPERATORNAME between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotBetween(String value1, String value2) {
            addCriterion("OPERATORNAME not between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatortimeIsNull() {
            addCriterion("OPERATORTIME is null");
            return (Criteria) this;
        }

        public Criteria andOperatortimeIsNotNull() {
            addCriterion("OPERATORTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatortimeEqualTo(String value) {
            addCriterion("OPERATORTIME =", value, "operatortime");
            return (Criteria) this;
        }

        public Criteria andOperatortimeNotEqualTo(String value) {
            addCriterion("OPERATORTIME <>", value, "operatortime");
            return (Criteria) this;
        }

        public Criteria andOperatortimeGreaterThan(String value) {
            addCriterion("OPERATORTIME >", value, "operatortime");
            return (Criteria) this;
        }

        public Criteria andOperatortimeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATORTIME >=", value, "operatortime");
            return (Criteria) this;
        }

        public Criteria andOperatortimeLessThan(String value) {
            addCriterion("OPERATORTIME <", value, "operatortime");
            return (Criteria) this;
        }

        public Criteria andOperatortimeLessThanOrEqualTo(String value) {
            addCriterion("OPERATORTIME <=", value, "operatortime");
            return (Criteria) this;
        }

        public Criteria andOperatortimeLike(String value) {
            addCriterion("OPERATORTIME like", value, "operatortime");
            return (Criteria) this;
        }

        public Criteria andOperatortimeNotLike(String value) {
            addCriterion("OPERATORTIME not like", value, "operatortime");
            return (Criteria) this;
        }

        public Criteria andOperatortimeIn(List<String> values) {
            addCriterion("OPERATORTIME in", values, "operatortime");
            return (Criteria) this;
        }

        public Criteria andOperatortimeNotIn(List<String> values) {
            addCriterion("OPERATORTIME not in", values, "operatortime");
            return (Criteria) this;
        }

        public Criteria andOperatortimeBetween(String value1, String value2) {
            addCriterion("OPERATORTIME between", value1, value2, "operatortime");
            return (Criteria) this;
        }

        public Criteria andOperatortimeNotBetween(String value1, String value2) {
            addCriterion("OPERATORTIME not between", value1, value2, "operatortime");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIsNull() {
            addCriterion("DEPTCODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIsNotNull() {
            addCriterion("DEPTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeEqualTo(String value) {
            addCriterion("DEPTCODE =", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotEqualTo(String value) {
            addCriterion("DEPTCODE <>", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThan(String value) {
            addCriterion("DEPTCODE >", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTCODE >=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThan(String value) {
            addCriterion("DEPTCODE <", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThanOrEqualTo(String value) {
            addCriterion("DEPTCODE <=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLike(String value) {
            addCriterion("DEPTCODE like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotLike(String value) {
            addCriterion("DEPTCODE not like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIn(List<String> values) {
            addCriterion("DEPTCODE in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotIn(List<String> values) {
            addCriterion("DEPTCODE not in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeBetween(String value1, String value2) {
            addCriterion("DEPTCODE between", value1, value2, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotBetween(String value1, String value2) {
            addCriterion("DEPTCODE not between", value1, value2, "deptcode");
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