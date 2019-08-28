package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TAppUpdateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAppUpdateExample() {
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

        public Criteria andAndroidUrlIsNull() {
            addCriterion("ANDROID_URL is null");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlIsNotNull() {
            addCriterion("ANDROID_URL is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlEqualTo(String value) {
            addCriterion("ANDROID_URL =", value, "androidUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlNotEqualTo(String value) {
            addCriterion("ANDROID_URL <>", value, "androidUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlGreaterThan(String value) {
            addCriterion("ANDROID_URL >", value, "androidUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ANDROID_URL >=", value, "androidUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlLessThan(String value) {
            addCriterion("ANDROID_URL <", value, "androidUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlLessThanOrEqualTo(String value) {
            addCriterion("ANDROID_URL <=", value, "androidUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlLike(String value) {
            addCriterion("ANDROID_URL like", value, "androidUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlNotLike(String value) {
            addCriterion("ANDROID_URL not like", value, "androidUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlIn(List<String> values) {
            addCriterion("ANDROID_URL in", values, "androidUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlNotIn(List<String> values) {
            addCriterion("ANDROID_URL not in", values, "androidUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlBetween(String value1, String value2) {
            addCriterion("ANDROID_URL between", value1, value2, "androidUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlNotBetween(String value1, String value2) {
            addCriterion("ANDROID_URL not between", value1, value2, "androidUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionIsNull() {
            addCriterion("ANDROID_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionIsNotNull() {
            addCriterion("ANDROID_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionEqualTo(String value) {
            addCriterion("ANDROID_VERSION =", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionNotEqualTo(String value) {
            addCriterion("ANDROID_VERSION <>", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionGreaterThan(String value) {
            addCriterion("ANDROID_VERSION >", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionGreaterThanOrEqualTo(String value) {
            addCriterion("ANDROID_VERSION >=", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionLessThan(String value) {
            addCriterion("ANDROID_VERSION <", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionLessThanOrEqualTo(String value) {
            addCriterion("ANDROID_VERSION <=", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionLike(String value) {
            addCriterion("ANDROID_VERSION like", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionNotLike(String value) {
            addCriterion("ANDROID_VERSION not like", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionIn(List<String> values) {
            addCriterion("ANDROID_VERSION in", values, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionNotIn(List<String> values) {
            addCriterion("ANDROID_VERSION not in", values, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionBetween(String value1, String value2) {
            addCriterion("ANDROID_VERSION between", value1, value2, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionNotBetween(String value1, String value2) {
            addCriterion("ANDROID_VERSION not between", value1, value2, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidDateTimeIsNull() {
            addCriterion("ANDROID_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAndroidDateTimeIsNotNull() {
            addCriterion("ANDROID_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidDateTimeEqualTo(String value) {
            addCriterion("ANDROID_DATE_TIME =", value, "androidDateTime");
            return (Criteria) this;
        }

        public Criteria andAndroidDateTimeNotEqualTo(String value) {
            addCriterion("ANDROID_DATE_TIME <>", value, "androidDateTime");
            return (Criteria) this;
        }

        public Criteria andAndroidDateTimeGreaterThan(String value) {
            addCriterion("ANDROID_DATE_TIME >", value, "androidDateTime");
            return (Criteria) this;
        }

        public Criteria andAndroidDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ANDROID_DATE_TIME >=", value, "androidDateTime");
            return (Criteria) this;
        }

        public Criteria andAndroidDateTimeLessThan(String value) {
            addCriterion("ANDROID_DATE_TIME <", value, "androidDateTime");
            return (Criteria) this;
        }

        public Criteria andAndroidDateTimeLessThanOrEqualTo(String value) {
            addCriterion("ANDROID_DATE_TIME <=", value, "androidDateTime");
            return (Criteria) this;
        }

        public Criteria andAndroidDateTimeLike(String value) {
            addCriterion("ANDROID_DATE_TIME like", value, "androidDateTime");
            return (Criteria) this;
        }

        public Criteria andAndroidDateTimeNotLike(String value) {
            addCriterion("ANDROID_DATE_TIME not like", value, "androidDateTime");
            return (Criteria) this;
        }

        public Criteria andAndroidDateTimeIn(List<String> values) {
            addCriterion("ANDROID_DATE_TIME in", values, "androidDateTime");
            return (Criteria) this;
        }

        public Criteria andAndroidDateTimeNotIn(List<String> values) {
            addCriterion("ANDROID_DATE_TIME not in", values, "androidDateTime");
            return (Criteria) this;
        }

        public Criteria andAndroidDateTimeBetween(String value1, String value2) {
            addCriterion("ANDROID_DATE_TIME between", value1, value2, "androidDateTime");
            return (Criteria) this;
        }

        public Criteria andAndroidDateTimeNotBetween(String value1, String value2) {
            addCriterion("ANDROID_DATE_TIME not between", value1, value2, "androidDateTime");
            return (Criteria) this;
        }

        public Criteria andAndroidContentIsNull() {
            addCriterion("ANDROID_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andAndroidContentIsNotNull() {
            addCriterion("ANDROID_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidContentEqualTo(String value) {
            addCriterion("ANDROID_CONTENT =", value, "androidContent");
            return (Criteria) this;
        }

        public Criteria andAndroidContentNotEqualTo(String value) {
            addCriterion("ANDROID_CONTENT <>", value, "androidContent");
            return (Criteria) this;
        }

        public Criteria andAndroidContentGreaterThan(String value) {
            addCriterion("ANDROID_CONTENT >", value, "androidContent");
            return (Criteria) this;
        }

        public Criteria andAndroidContentGreaterThanOrEqualTo(String value) {
            addCriterion("ANDROID_CONTENT >=", value, "androidContent");
            return (Criteria) this;
        }

        public Criteria andAndroidContentLessThan(String value) {
            addCriterion("ANDROID_CONTENT <", value, "androidContent");
            return (Criteria) this;
        }

        public Criteria andAndroidContentLessThanOrEqualTo(String value) {
            addCriterion("ANDROID_CONTENT <=", value, "androidContent");
            return (Criteria) this;
        }

        public Criteria andAndroidContentLike(String value) {
            addCriterion("ANDROID_CONTENT like", value, "androidContent");
            return (Criteria) this;
        }

        public Criteria andAndroidContentNotLike(String value) {
            addCriterion("ANDROID_CONTENT not like", value, "androidContent");
            return (Criteria) this;
        }

        public Criteria andAndroidContentIn(List<String> values) {
            addCriterion("ANDROID_CONTENT in", values, "androidContent");
            return (Criteria) this;
        }

        public Criteria andAndroidContentNotIn(List<String> values) {
            addCriterion("ANDROID_CONTENT not in", values, "androidContent");
            return (Criteria) this;
        }

        public Criteria andAndroidContentBetween(String value1, String value2) {
            addCriterion("ANDROID_CONTENT between", value1, value2, "androidContent");
            return (Criteria) this;
        }

        public Criteria andAndroidContentNotBetween(String value1, String value2) {
            addCriterion("ANDROID_CONTENT not between", value1, value2, "androidContent");
            return (Criteria) this;
        }

        public Criteria andIosUrlIsNull() {
            addCriterion("IOS_URL is null");
            return (Criteria) this;
        }

        public Criteria andIosUrlIsNotNull() {
            addCriterion("IOS_URL is not null");
            return (Criteria) this;
        }

        public Criteria andIosUrlEqualTo(String value) {
            addCriterion("IOS_URL =", value, "iosUrl");
            return (Criteria) this;
        }

        public Criteria andIosUrlNotEqualTo(String value) {
            addCriterion("IOS_URL <>", value, "iosUrl");
            return (Criteria) this;
        }

        public Criteria andIosUrlGreaterThan(String value) {
            addCriterion("IOS_URL >", value, "iosUrl");
            return (Criteria) this;
        }

        public Criteria andIosUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IOS_URL >=", value, "iosUrl");
            return (Criteria) this;
        }

        public Criteria andIosUrlLessThan(String value) {
            addCriterion("IOS_URL <", value, "iosUrl");
            return (Criteria) this;
        }

        public Criteria andIosUrlLessThanOrEqualTo(String value) {
            addCriterion("IOS_URL <=", value, "iosUrl");
            return (Criteria) this;
        }

        public Criteria andIosUrlLike(String value) {
            addCriterion("IOS_URL like", value, "iosUrl");
            return (Criteria) this;
        }

        public Criteria andIosUrlNotLike(String value) {
            addCriterion("IOS_URL not like", value, "iosUrl");
            return (Criteria) this;
        }

        public Criteria andIosUrlIn(List<String> values) {
            addCriterion("IOS_URL in", values, "iosUrl");
            return (Criteria) this;
        }

        public Criteria andIosUrlNotIn(List<String> values) {
            addCriterion("IOS_URL not in", values, "iosUrl");
            return (Criteria) this;
        }

        public Criteria andIosUrlBetween(String value1, String value2) {
            addCriterion("IOS_URL between", value1, value2, "iosUrl");
            return (Criteria) this;
        }

        public Criteria andIosUrlNotBetween(String value1, String value2) {
            addCriterion("IOS_URL not between", value1, value2, "iosUrl");
            return (Criteria) this;
        }

        public Criteria andIosDateTimeIsNull() {
            addCriterion("IOS_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andIosDateTimeIsNotNull() {
            addCriterion("IOS_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andIosDateTimeEqualTo(String value) {
            addCriterion("IOS_DATE_TIME =", value, "iosDateTime");
            return (Criteria) this;
        }

        public Criteria andIosDateTimeNotEqualTo(String value) {
            addCriterion("IOS_DATE_TIME <>", value, "iosDateTime");
            return (Criteria) this;
        }

        public Criteria andIosDateTimeGreaterThan(String value) {
            addCriterion("IOS_DATE_TIME >", value, "iosDateTime");
            return (Criteria) this;
        }

        public Criteria andIosDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("IOS_DATE_TIME >=", value, "iosDateTime");
            return (Criteria) this;
        }

        public Criteria andIosDateTimeLessThan(String value) {
            addCriterion("IOS_DATE_TIME <", value, "iosDateTime");
            return (Criteria) this;
        }

        public Criteria andIosDateTimeLessThanOrEqualTo(String value) {
            addCriterion("IOS_DATE_TIME <=", value, "iosDateTime");
            return (Criteria) this;
        }

        public Criteria andIosDateTimeLike(String value) {
            addCriterion("IOS_DATE_TIME like", value, "iosDateTime");
            return (Criteria) this;
        }

        public Criteria andIosDateTimeNotLike(String value) {
            addCriterion("IOS_DATE_TIME not like", value, "iosDateTime");
            return (Criteria) this;
        }

        public Criteria andIosDateTimeIn(List<String> values) {
            addCriterion("IOS_DATE_TIME in", values, "iosDateTime");
            return (Criteria) this;
        }

        public Criteria andIosDateTimeNotIn(List<String> values) {
            addCriterion("IOS_DATE_TIME not in", values, "iosDateTime");
            return (Criteria) this;
        }

        public Criteria andIosDateTimeBetween(String value1, String value2) {
            addCriterion("IOS_DATE_TIME between", value1, value2, "iosDateTime");
            return (Criteria) this;
        }

        public Criteria andIosDateTimeNotBetween(String value1, String value2) {
            addCriterion("IOS_DATE_TIME not between", value1, value2, "iosDateTime");
            return (Criteria) this;
        }

        public Criteria andIosContentIsNull() {
            addCriterion("IOS_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andIosContentIsNotNull() {
            addCriterion("IOS_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andIosContentEqualTo(String value) {
            addCriterion("IOS_CONTENT =", value, "iosContent");
            return (Criteria) this;
        }

        public Criteria andIosContentNotEqualTo(String value) {
            addCriterion("IOS_CONTENT <>", value, "iosContent");
            return (Criteria) this;
        }

        public Criteria andIosContentGreaterThan(String value) {
            addCriterion("IOS_CONTENT >", value, "iosContent");
            return (Criteria) this;
        }

        public Criteria andIosContentGreaterThanOrEqualTo(String value) {
            addCriterion("IOS_CONTENT >=", value, "iosContent");
            return (Criteria) this;
        }

        public Criteria andIosContentLessThan(String value) {
            addCriterion("IOS_CONTENT <", value, "iosContent");
            return (Criteria) this;
        }

        public Criteria andIosContentLessThanOrEqualTo(String value) {
            addCriterion("IOS_CONTENT <=", value, "iosContent");
            return (Criteria) this;
        }

        public Criteria andIosContentLike(String value) {
            addCriterion("IOS_CONTENT like", value, "iosContent");
            return (Criteria) this;
        }

        public Criteria andIosContentNotLike(String value) {
            addCriterion("IOS_CONTENT not like", value, "iosContent");
            return (Criteria) this;
        }

        public Criteria andIosContentIn(List<String> values) {
            addCriterion("IOS_CONTENT in", values, "iosContent");
            return (Criteria) this;
        }

        public Criteria andIosContentNotIn(List<String> values) {
            addCriterion("IOS_CONTENT not in", values, "iosContent");
            return (Criteria) this;
        }

        public Criteria andIosContentBetween(String value1, String value2) {
            addCriterion("IOS_CONTENT between", value1, value2, "iosContent");
            return (Criteria) this;
        }

        public Criteria andIosContentNotBetween(String value1, String value2) {
            addCriterion("IOS_CONTENT not between", value1, value2, "iosContent");
            return (Criteria) this;
        }

        public Criteria andIosVersionIsNull() {
            addCriterion("IOS_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andIosVersionIsNotNull() {
            addCriterion("IOS_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andIosVersionEqualTo(String value) {
            addCriterion("IOS_VERSION =", value, "iosVersion");
            return (Criteria) this;
        }

        public Criteria andIosVersionNotEqualTo(String value) {
            addCriterion("IOS_VERSION <>", value, "iosVersion");
            return (Criteria) this;
        }

        public Criteria andIosVersionGreaterThan(String value) {
            addCriterion("IOS_VERSION >", value, "iosVersion");
            return (Criteria) this;
        }

        public Criteria andIosVersionGreaterThanOrEqualTo(String value) {
            addCriterion("IOS_VERSION >=", value, "iosVersion");
            return (Criteria) this;
        }

        public Criteria andIosVersionLessThan(String value) {
            addCriterion("IOS_VERSION <", value, "iosVersion");
            return (Criteria) this;
        }

        public Criteria andIosVersionLessThanOrEqualTo(String value) {
            addCriterion("IOS_VERSION <=", value, "iosVersion");
            return (Criteria) this;
        }

        public Criteria andIosVersionLike(String value) {
            addCriterion("IOS_VERSION like", value, "iosVersion");
            return (Criteria) this;
        }

        public Criteria andIosVersionNotLike(String value) {
            addCriterion("IOS_VERSION not like", value, "iosVersion");
            return (Criteria) this;
        }

        public Criteria andIosVersionIn(List<String> values) {
            addCriterion("IOS_VERSION in", values, "iosVersion");
            return (Criteria) this;
        }

        public Criteria andIosVersionNotIn(List<String> values) {
            addCriterion("IOS_VERSION not in", values, "iosVersion");
            return (Criteria) this;
        }

        public Criteria andIosVersionBetween(String value1, String value2) {
            addCriterion("IOS_VERSION between", value1, value2, "iosVersion");
            return (Criteria) this;
        }

        public Criteria andIosVersionNotBetween(String value1, String value2) {
            addCriterion("IOS_VERSION not between", value1, value2, "iosVersion");
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