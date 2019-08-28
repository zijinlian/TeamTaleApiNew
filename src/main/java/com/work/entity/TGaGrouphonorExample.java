package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TGaGrouphonorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGaGrouphonorExample() {
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

        public Criteria andHonorlevelIsNull() {
            addCriterion("HONORLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andHonorlevelIsNotNull() {
            addCriterion("HONORLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andHonorlevelEqualTo(String value) {
            addCriterion("HONORLEVEL =", value, "honorlevel");
            return (Criteria) this;
        }

        public Criteria andHonorlevelNotEqualTo(String value) {
            addCriterion("HONORLEVEL <>", value, "honorlevel");
            return (Criteria) this;
        }

        public Criteria andHonorlevelGreaterThan(String value) {
            addCriterion("HONORLEVEL >", value, "honorlevel");
            return (Criteria) this;
        }

        public Criteria andHonorlevelGreaterThanOrEqualTo(String value) {
            addCriterion("HONORLEVEL >=", value, "honorlevel");
            return (Criteria) this;
        }

        public Criteria andHonorlevelLessThan(String value) {
            addCriterion("HONORLEVEL <", value, "honorlevel");
            return (Criteria) this;
        }

        public Criteria andHonorlevelLessThanOrEqualTo(String value) {
            addCriterion("HONORLEVEL <=", value, "honorlevel");
            return (Criteria) this;
        }

        public Criteria andHonorlevelLike(String value) {
            addCriterion("HONORLEVEL like", value, "honorlevel");
            return (Criteria) this;
        }

        public Criteria andHonorlevelNotLike(String value) {
            addCriterion("HONORLEVEL not like", value, "honorlevel");
            return (Criteria) this;
        }

        public Criteria andHonorlevelIn(List<String> values) {
            addCriterion("HONORLEVEL in", values, "honorlevel");
            return (Criteria) this;
        }

        public Criteria andHonorlevelNotIn(List<String> values) {
            addCriterion("HONORLEVEL not in", values, "honorlevel");
            return (Criteria) this;
        }

        public Criteria andHonorlevelBetween(String value1, String value2) {
            addCriterion("HONORLEVEL between", value1, value2, "honorlevel");
            return (Criteria) this;
        }

        public Criteria andHonorlevelNotBetween(String value1, String value2) {
            addCriterion("HONORLEVEL not between", value1, value2, "honorlevel");
            return (Criteria) this;
        }

        public Criteria andHonnortypeIsNull() {
            addCriterion("HONNORTYPE is null");
            return (Criteria) this;
        }

        public Criteria andHonnortypeIsNotNull() {
            addCriterion("HONNORTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHonnortypeEqualTo(String value) {
            addCriterion("HONNORTYPE =", value, "honnortype");
            return (Criteria) this;
        }

        public Criteria andHonnortypeNotEqualTo(String value) {
            addCriterion("HONNORTYPE <>", value, "honnortype");
            return (Criteria) this;
        }

        public Criteria andHonnortypeGreaterThan(String value) {
            addCriterion("HONNORTYPE >", value, "honnortype");
            return (Criteria) this;
        }

        public Criteria andHonnortypeGreaterThanOrEqualTo(String value) {
            addCriterion("HONNORTYPE >=", value, "honnortype");
            return (Criteria) this;
        }

        public Criteria andHonnortypeLessThan(String value) {
            addCriterion("HONNORTYPE <", value, "honnortype");
            return (Criteria) this;
        }

        public Criteria andHonnortypeLessThanOrEqualTo(String value) {
            addCriterion("HONNORTYPE <=", value, "honnortype");
            return (Criteria) this;
        }

        public Criteria andHonnortypeLike(String value) {
            addCriterion("HONNORTYPE like", value, "honnortype");
            return (Criteria) this;
        }

        public Criteria andHonnortypeNotLike(String value) {
            addCriterion("HONNORTYPE not like", value, "honnortype");
            return (Criteria) this;
        }

        public Criteria andHonnortypeIn(List<String> values) {
            addCriterion("HONNORTYPE in", values, "honnortype");
            return (Criteria) this;
        }

        public Criteria andHonnortypeNotIn(List<String> values) {
            addCriterion("HONNORTYPE not in", values, "honnortype");
            return (Criteria) this;
        }

        public Criteria andHonnortypeBetween(String value1, String value2) {
            addCriterion("HONNORTYPE between", value1, value2, "honnortype");
            return (Criteria) this;
        }

        public Criteria andHonnortypeNotBetween(String value1, String value2) {
            addCriterion("HONNORTYPE not between", value1, value2, "honnortype");
            return (Criteria) this;
        }

        public Criteria andHonornameIsNull() {
            addCriterion("HONORNAME is null");
            return (Criteria) this;
        }

        public Criteria andHonornameIsNotNull() {
            addCriterion("HONORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andHonornameEqualTo(String value) {
            addCriterion("HONORNAME =", value, "honorname");
            return (Criteria) this;
        }

        public Criteria andHonornameNotEqualTo(String value) {
            addCriterion("HONORNAME <>", value, "honorname");
            return (Criteria) this;
        }

        public Criteria andHonornameGreaterThan(String value) {
            addCriterion("HONORNAME >", value, "honorname");
            return (Criteria) this;
        }

        public Criteria andHonornameGreaterThanOrEqualTo(String value) {
            addCriterion("HONORNAME >=", value, "honorname");
            return (Criteria) this;
        }

        public Criteria andHonornameLessThan(String value) {
            addCriterion("HONORNAME <", value, "honorname");
            return (Criteria) this;
        }

        public Criteria andHonornameLessThanOrEqualTo(String value) {
            addCriterion("HONORNAME <=", value, "honorname");
            return (Criteria) this;
        }

        public Criteria andHonornameLike(String value) {
            addCriterion("HONORNAME like", value, "honorname");
            return (Criteria) this;
        }

        public Criteria andHonornameNotLike(String value) {
            addCriterion("HONORNAME not like", value, "honorname");
            return (Criteria) this;
        }

        public Criteria andHonornameIn(List<String> values) {
            addCriterion("HONORNAME in", values, "honorname");
            return (Criteria) this;
        }

        public Criteria andHonornameNotIn(List<String> values) {
            addCriterion("HONORNAME not in", values, "honorname");
            return (Criteria) this;
        }

        public Criteria andHonornameBetween(String value1, String value2) {
            addCriterion("HONORNAME between", value1, value2, "honorname");
            return (Criteria) this;
        }

        public Criteria andHonornameNotBetween(String value1, String value2) {
            addCriterion("HONORNAME not between", value1, value2, "honorname");
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

        public Criteria andEmpnameIsNull() {
            addCriterion("EMPNAME is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("EMPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("EMPNAME =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("EMPNAME <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("EMPNAME >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPNAME >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("EMPNAME <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("EMPNAME <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("EMPNAME like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("EMPNAME not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("EMPNAME in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("EMPNAME not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("EMPNAME between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("EMPNAME not between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andHonordateIsNull() {
            addCriterion("HONORDATE is null");
            return (Criteria) this;
        }

        public Criteria andHonordateIsNotNull() {
            addCriterion("HONORDATE is not null");
            return (Criteria) this;
        }

        public Criteria andHonordateEqualTo(String value) {
            addCriterion("HONORDATE =", value, "honordate");
            return (Criteria) this;
        }

        public Criteria andHonordateNotEqualTo(String value) {
            addCriterion("HONORDATE <>", value, "honordate");
            return (Criteria) this;
        }

        public Criteria andHonordateGreaterThan(String value) {
            addCriterion("HONORDATE >", value, "honordate");
            return (Criteria) this;
        }

        public Criteria andHonordateGreaterThanOrEqualTo(String value) {
            addCriterion("HONORDATE >=", value, "honordate");
            return (Criteria) this;
        }

        public Criteria andHonordateLessThan(String value) {
            addCriterion("HONORDATE <", value, "honordate");
            return (Criteria) this;
        }

        public Criteria andHonordateLessThanOrEqualTo(String value) {
            addCriterion("HONORDATE <=", value, "honordate");
            return (Criteria) this;
        }

        public Criteria andHonordateLike(String value) {
            addCriterion("HONORDATE like", value, "honordate");
            return (Criteria) this;
        }

        public Criteria andHonordateNotLike(String value) {
            addCriterion("HONORDATE not like", value, "honordate");
            return (Criteria) this;
        }

        public Criteria andHonordateIn(List<String> values) {
            addCriterion("HONORDATE in", values, "honordate");
            return (Criteria) this;
        }

        public Criteria andHonordateNotIn(List<String> values) {
            addCriterion("HONORDATE not in", values, "honordate");
            return (Criteria) this;
        }

        public Criteria andHonordateBetween(String value1, String value2) {
            addCriterion("HONORDATE between", value1, value2, "honordate");
            return (Criteria) this;
        }

        public Criteria andHonordateNotBetween(String value1, String value2) {
            addCriterion("HONORDATE not between", value1, value2, "honordate");
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