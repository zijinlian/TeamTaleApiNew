package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TTraiPlayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTraiPlayExample() {
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

        public Criteria andChapternumIsNull() {
            addCriterion("CHAPTERNUM is null");
            return (Criteria) this;
        }

        public Criteria andChapternumIsNotNull() {
            addCriterion("CHAPTERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andChapternumEqualTo(String value) {
            addCriterion("CHAPTERNUM =", value, "chapternum");
            return (Criteria) this;
        }

        public Criteria andChapternumNotEqualTo(String value) {
            addCriterion("CHAPTERNUM <>", value, "chapternum");
            return (Criteria) this;
        }

        public Criteria andChapternumGreaterThan(String value) {
            addCriterion("CHAPTERNUM >", value, "chapternum");
            return (Criteria) this;
        }

        public Criteria andChapternumGreaterThanOrEqualTo(String value) {
            addCriterion("CHAPTERNUM >=", value, "chapternum");
            return (Criteria) this;
        }

        public Criteria andChapternumLessThan(String value) {
            addCriterion("CHAPTERNUM <", value, "chapternum");
            return (Criteria) this;
        }

        public Criteria andChapternumLessThanOrEqualTo(String value) {
            addCriterion("CHAPTERNUM <=", value, "chapternum");
            return (Criteria) this;
        }

        public Criteria andChapternumLike(String value) {
            addCriterion("CHAPTERNUM like", value, "chapternum");
            return (Criteria) this;
        }

        public Criteria andChapternumNotLike(String value) {
            addCriterion("CHAPTERNUM not like", value, "chapternum");
            return (Criteria) this;
        }

        public Criteria andChapternumIn(List<String> values) {
            addCriterion("CHAPTERNUM in", values, "chapternum");
            return (Criteria) this;
        }

        public Criteria andChapternumNotIn(List<String> values) {
            addCriterion("CHAPTERNUM not in", values, "chapternum");
            return (Criteria) this;
        }

        public Criteria andChapternumBetween(String value1, String value2) {
            addCriterion("CHAPTERNUM between", value1, value2, "chapternum");
            return (Criteria) this;
        }

        public Criteria andChapternumNotBetween(String value1, String value2) {
            addCriterion("CHAPTERNUM not between", value1, value2, "chapternum");
            return (Criteria) this;
        }

        public Criteria andCoursetitleIsNull() {
            addCriterion("COURSETITLE is null");
            return (Criteria) this;
        }

        public Criteria andCoursetitleIsNotNull() {
            addCriterion("COURSETITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetitleEqualTo(String value) {
            addCriterion("COURSETITLE =", value, "coursetitle");
            return (Criteria) this;
        }

        public Criteria andCoursetitleNotEqualTo(String value) {
            addCriterion("COURSETITLE <>", value, "coursetitle");
            return (Criteria) this;
        }

        public Criteria andCoursetitleGreaterThan(String value) {
            addCriterion("COURSETITLE >", value, "coursetitle");
            return (Criteria) this;
        }

        public Criteria andCoursetitleGreaterThanOrEqualTo(String value) {
            addCriterion("COURSETITLE >=", value, "coursetitle");
            return (Criteria) this;
        }

        public Criteria andCoursetitleLessThan(String value) {
            addCriterion("COURSETITLE <", value, "coursetitle");
            return (Criteria) this;
        }

        public Criteria andCoursetitleLessThanOrEqualTo(String value) {
            addCriterion("COURSETITLE <=", value, "coursetitle");
            return (Criteria) this;
        }

        public Criteria andCoursetitleLike(String value) {
            addCriterion("COURSETITLE like", value, "coursetitle");
            return (Criteria) this;
        }

        public Criteria andCoursetitleNotLike(String value) {
            addCriterion("COURSETITLE not like", value, "coursetitle");
            return (Criteria) this;
        }

        public Criteria andCoursetitleIn(List<String> values) {
            addCriterion("COURSETITLE in", values, "coursetitle");
            return (Criteria) this;
        }

        public Criteria andCoursetitleNotIn(List<String> values) {
            addCriterion("COURSETITLE not in", values, "coursetitle");
            return (Criteria) this;
        }

        public Criteria andCoursetitleBetween(String value1, String value2) {
            addCriterion("COURSETITLE between", value1, value2, "coursetitle");
            return (Criteria) this;
        }

        public Criteria andCoursetitleNotBetween(String value1, String value2) {
            addCriterion("COURSETITLE not between", value1, value2, "coursetitle");
            return (Criteria) this;
        }

        public Criteria andStartimeIsNull() {
            addCriterion("STARTIME is null");
            return (Criteria) this;
        }

        public Criteria andStartimeIsNotNull() {
            addCriterion("STARTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartimeEqualTo(String value) {
            addCriterion("STARTIME =", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotEqualTo(String value) {
            addCriterion("STARTIME <>", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeGreaterThan(String value) {
            addCriterion("STARTIME >", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeGreaterThanOrEqualTo(String value) {
            addCriterion("STARTIME >=", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeLessThan(String value) {
            addCriterion("STARTIME <", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeLessThanOrEqualTo(String value) {
            addCriterion("STARTIME <=", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeLike(String value) {
            addCriterion("STARTIME like", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotLike(String value) {
            addCriterion("STARTIME not like", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeIn(List<String> values) {
            addCriterion("STARTIME in", values, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotIn(List<String> values) {
            addCriterion("STARTIME not in", values, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeBetween(String value1, String value2) {
            addCriterion("STARTIME between", value1, value2, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotBetween(String value1, String value2) {
            addCriterion("STARTIME not between", value1, value2, "startime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("ENDTIME like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("ENDTIME not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andCoruseaddressIsNull() {
            addCriterion("CORUSEADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCoruseaddressIsNotNull() {
            addCriterion("CORUSEADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCoruseaddressEqualTo(String value) {
            addCriterion("CORUSEADDRESS =", value, "coruseaddress");
            return (Criteria) this;
        }

        public Criteria andCoruseaddressNotEqualTo(String value) {
            addCriterion("CORUSEADDRESS <>", value, "coruseaddress");
            return (Criteria) this;
        }

        public Criteria andCoruseaddressGreaterThan(String value) {
            addCriterion("CORUSEADDRESS >", value, "coruseaddress");
            return (Criteria) this;
        }

        public Criteria andCoruseaddressGreaterThanOrEqualTo(String value) {
            addCriterion("CORUSEADDRESS >=", value, "coruseaddress");
            return (Criteria) this;
        }

        public Criteria andCoruseaddressLessThan(String value) {
            addCriterion("CORUSEADDRESS <", value, "coruseaddress");
            return (Criteria) this;
        }

        public Criteria andCoruseaddressLessThanOrEqualTo(String value) {
            addCriterion("CORUSEADDRESS <=", value, "coruseaddress");
            return (Criteria) this;
        }

        public Criteria andCoruseaddressLike(String value) {
            addCriterion("CORUSEADDRESS like", value, "coruseaddress");
            return (Criteria) this;
        }

        public Criteria andCoruseaddressNotLike(String value) {
            addCriterion("CORUSEADDRESS not like", value, "coruseaddress");
            return (Criteria) this;
        }

        public Criteria andCoruseaddressIn(List<String> values) {
            addCriterion("CORUSEADDRESS in", values, "coruseaddress");
            return (Criteria) this;
        }

        public Criteria andCoruseaddressNotIn(List<String> values) {
            addCriterion("CORUSEADDRESS not in", values, "coruseaddress");
            return (Criteria) this;
        }

        public Criteria andCoruseaddressBetween(String value1, String value2) {
            addCriterion("CORUSEADDRESS between", value1, value2, "coruseaddress");
            return (Criteria) this;
        }

        public Criteria andCoruseaddressNotBetween(String value1, String value2) {
            addCriterion("CORUSEADDRESS not between", value1, value2, "coruseaddress");
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