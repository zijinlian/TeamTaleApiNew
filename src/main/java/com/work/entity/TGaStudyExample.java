package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TGaStudyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGaStudyExample() {
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

        public Criteria andEmpidIsNull() {
            addCriterion("EMPID is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(String value) {
            addCriterion("EMPID =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(String value) {
            addCriterion("EMPID <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(String value) {
            addCriterion("EMPID >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("EMPID >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(String value) {
            addCriterion("EMPID <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(String value) {
            addCriterion("EMPID <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLike(String value) {
            addCriterion("EMPID like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotLike(String value) {
            addCriterion("EMPID not like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<String> values) {
            addCriterion("EMPID in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<String> values) {
            addCriterion("EMPID not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(String value1, String value2) {
            addCriterion("EMPID between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(String value1, String value2) {
            addCriterion("EMPID not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andOrgIsNull() {
            addCriterion("ORG is null");
            return (Criteria) this;
        }

        public Criteria andOrgIsNotNull() {
            addCriterion("ORG is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEqualTo(String value) {
            addCriterion("ORG =", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotEqualTo(String value) {
            addCriterion("ORG <>", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThan(String value) {
            addCriterion("ORG >", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThanOrEqualTo(String value) {
            addCriterion("ORG >=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThan(String value) {
            addCriterion("ORG <", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThanOrEqualTo(String value) {
            addCriterion("ORG <=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLike(String value) {
            addCriterion("ORG like", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotLike(String value) {
            addCriterion("ORG not like", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgIn(List<String> values) {
            addCriterion("ORG in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotIn(List<String> values) {
            addCriterion("ORG not in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgBetween(String value1, String value2) {
            addCriterion("ORG between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotBetween(String value1, String value2) {
            addCriterion("ORG not between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andStudyaddressIsNull() {
            addCriterion("STUDYADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andStudyaddressIsNotNull() {
            addCriterion("STUDYADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andStudyaddressEqualTo(String value) {
            addCriterion("STUDYADDRESS =", value, "studyaddress");
            return (Criteria) this;
        }

        public Criteria andStudyaddressNotEqualTo(String value) {
            addCriterion("STUDYADDRESS <>", value, "studyaddress");
            return (Criteria) this;
        }

        public Criteria andStudyaddressGreaterThan(String value) {
            addCriterion("STUDYADDRESS >", value, "studyaddress");
            return (Criteria) this;
        }

        public Criteria andStudyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("STUDYADDRESS >=", value, "studyaddress");
            return (Criteria) this;
        }

        public Criteria andStudyaddressLessThan(String value) {
            addCriterion("STUDYADDRESS <", value, "studyaddress");
            return (Criteria) this;
        }

        public Criteria andStudyaddressLessThanOrEqualTo(String value) {
            addCriterion("STUDYADDRESS <=", value, "studyaddress");
            return (Criteria) this;
        }

        public Criteria andStudyaddressLike(String value) {
            addCriterion("STUDYADDRESS like", value, "studyaddress");
            return (Criteria) this;
        }

        public Criteria andStudyaddressNotLike(String value) {
            addCriterion("STUDYADDRESS not like", value, "studyaddress");
            return (Criteria) this;
        }

        public Criteria andStudyaddressIn(List<String> values) {
            addCriterion("STUDYADDRESS in", values, "studyaddress");
            return (Criteria) this;
        }

        public Criteria andStudyaddressNotIn(List<String> values) {
            addCriterion("STUDYADDRESS not in", values, "studyaddress");
            return (Criteria) this;
        }

        public Criteria andStudyaddressBetween(String value1, String value2) {
            addCriterion("STUDYADDRESS between", value1, value2, "studyaddress");
            return (Criteria) this;
        }

        public Criteria andStudyaddressNotBetween(String value1, String value2) {
            addCriterion("STUDYADDRESS not between", value1, value2, "studyaddress");
            return (Criteria) this;
        }

        public Criteria andOrglevelIsNull() {
            addCriterion("ORGLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andOrglevelIsNotNull() {
            addCriterion("ORGLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andOrglevelEqualTo(String value) {
            addCriterion("ORGLEVEL =", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotEqualTo(String value) {
            addCriterion("ORGLEVEL <>", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelGreaterThan(String value) {
            addCriterion("ORGLEVEL >", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelGreaterThanOrEqualTo(String value) {
            addCriterion("ORGLEVEL >=", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelLessThan(String value) {
            addCriterion("ORGLEVEL <", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelLessThanOrEqualTo(String value) {
            addCriterion("ORGLEVEL <=", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelLike(String value) {
            addCriterion("ORGLEVEL like", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotLike(String value) {
            addCriterion("ORGLEVEL not like", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelIn(List<String> values) {
            addCriterion("ORGLEVEL in", values, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotIn(List<String> values) {
            addCriterion("ORGLEVEL not in", values, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelBetween(String value1, String value2) {
            addCriterion("ORGLEVEL between", value1, value2, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotBetween(String value1, String value2) {
            addCriterion("ORGLEVEL not between", value1, value2, "orglevel");
            return (Criteria) this;
        }

        public Criteria andStudytimeIsNull() {
            addCriterion("STUDYTIME is null");
            return (Criteria) this;
        }

        public Criteria andStudytimeIsNotNull() {
            addCriterion("STUDYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStudytimeEqualTo(String value) {
            addCriterion("STUDYTIME =", value, "studytime");
            return (Criteria) this;
        }

        public Criteria andStudytimeNotEqualTo(String value) {
            addCriterion("STUDYTIME <>", value, "studytime");
            return (Criteria) this;
        }

        public Criteria andStudytimeGreaterThan(String value) {
            addCriterion("STUDYTIME >", value, "studytime");
            return (Criteria) this;
        }

        public Criteria andStudytimeGreaterThanOrEqualTo(String value) {
            addCriterion("STUDYTIME >=", value, "studytime");
            return (Criteria) this;
        }

        public Criteria andStudytimeLessThan(String value) {
            addCriterion("STUDYTIME <", value, "studytime");
            return (Criteria) this;
        }

        public Criteria andStudytimeLessThanOrEqualTo(String value) {
            addCriterion("STUDYTIME <=", value, "studytime");
            return (Criteria) this;
        }

        public Criteria andStudytimeLike(String value) {
            addCriterion("STUDYTIME like", value, "studytime");
            return (Criteria) this;
        }

        public Criteria andStudytimeNotLike(String value) {
            addCriterion("STUDYTIME not like", value, "studytime");
            return (Criteria) this;
        }

        public Criteria andStudytimeIn(List<String> values) {
            addCriterion("STUDYTIME in", values, "studytime");
            return (Criteria) this;
        }

        public Criteria andStudytimeNotIn(List<String> values) {
            addCriterion("STUDYTIME not in", values, "studytime");
            return (Criteria) this;
        }

        public Criteria andStudytimeBetween(String value1, String value2) {
            addCriterion("STUDYTIME between", value1, value2, "studytime");
            return (Criteria) this;
        }

        public Criteria andStudytimeNotBetween(String value1, String value2) {
            addCriterion("STUDYTIME not between", value1, value2, "studytime");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNull() {
            addCriterion("INPUTDATE is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("INPUTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(String value) {
            addCriterion("INPUTDATE =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(String value) {
            addCriterion("INPUTDATE <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(String value) {
            addCriterion("INPUTDATE >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTDATE >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(String value) {
            addCriterion("INPUTDATE <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(String value) {
            addCriterion("INPUTDATE <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLike(String value) {
            addCriterion("INPUTDATE like", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotLike(String value) {
            addCriterion("INPUTDATE not like", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<String> values) {
            addCriterion("INPUTDATE in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<String> values) {
            addCriterion("INPUTDATE not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(String value1, String value2) {
            addCriterion("INPUTDATE between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(String value1, String value2) {
            addCriterion("INPUTDATE not between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(String value) {
            addCriterion("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(String value) {
            addCriterion("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(String value) {
            addCriterion("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(String value) {
            addCriterion("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(String value) {
            addCriterion("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLike(String value) {
            addCriterion("STARTDATE like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotLike(String value) {
            addCriterion("STARTDATE not like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<String> values) {
            addCriterion("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<String> values) {
            addCriterion("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(String value1, String value2) {
            addCriterion("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(String value1, String value2) {
            addCriterion("STARTDATE not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andRefnumberIsNull() {
            addCriterion("REFNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRefnumberIsNotNull() {
            addCriterion("REFNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRefnumberEqualTo(String value) {
            addCriterion("REFNUMBER =", value, "refnumber");
            return (Criteria) this;
        }

        public Criteria andRefnumberNotEqualTo(String value) {
            addCriterion("REFNUMBER <>", value, "refnumber");
            return (Criteria) this;
        }

        public Criteria andRefnumberGreaterThan(String value) {
            addCriterion("REFNUMBER >", value, "refnumber");
            return (Criteria) this;
        }

        public Criteria andRefnumberGreaterThanOrEqualTo(String value) {
            addCriterion("REFNUMBER >=", value, "refnumber");
            return (Criteria) this;
        }

        public Criteria andRefnumberLessThan(String value) {
            addCriterion("REFNUMBER <", value, "refnumber");
            return (Criteria) this;
        }

        public Criteria andRefnumberLessThanOrEqualTo(String value) {
            addCriterion("REFNUMBER <=", value, "refnumber");
            return (Criteria) this;
        }

        public Criteria andRefnumberLike(String value) {
            addCriterion("REFNUMBER like", value, "refnumber");
            return (Criteria) this;
        }

        public Criteria andRefnumberNotLike(String value) {
            addCriterion("REFNUMBER not like", value, "refnumber");
            return (Criteria) this;
        }

        public Criteria andRefnumberIn(List<String> values) {
            addCriterion("REFNUMBER in", values, "refnumber");
            return (Criteria) this;
        }

        public Criteria andRefnumberNotIn(List<String> values) {
            addCriterion("REFNUMBER not in", values, "refnumber");
            return (Criteria) this;
        }

        public Criteria andRefnumberBetween(String value1, String value2) {
            addCriterion("REFNUMBER between", value1, value2, "refnumber");
            return (Criteria) this;
        }

        public Criteria andRefnumberNotBetween(String value1, String value2) {
            addCriterion("REFNUMBER not between", value1, value2, "refnumber");
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