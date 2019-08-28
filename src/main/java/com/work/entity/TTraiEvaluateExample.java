package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TTraiEvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTraiEvaluateExample() {
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

        public Criteria andEvaluateidIsNull() {
            addCriterion("EVALUATEID is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateidIsNotNull() {
            addCriterion("EVALUATEID is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateidEqualTo(String value) {
            addCriterion("EVALUATEID =", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidNotEqualTo(String value) {
            addCriterion("EVALUATEID <>", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidGreaterThan(String value) {
            addCriterion("EVALUATEID >", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATEID >=", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidLessThan(String value) {
            addCriterion("EVALUATEID <", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidLessThanOrEqualTo(String value) {
            addCriterion("EVALUATEID <=", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidLike(String value) {
            addCriterion("EVALUATEID like", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidNotLike(String value) {
            addCriterion("EVALUATEID not like", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidIn(List<String> values) {
            addCriterion("EVALUATEID in", values, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidNotIn(List<String> values) {
            addCriterion("EVALUATEID not in", values, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidBetween(String value1, String value2) {
            addCriterion("EVALUATEID between", value1, value2, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidNotBetween(String value1, String value2) {
            addCriterion("EVALUATEID not between", value1, value2, "evaluateid");
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

        public Criteria andTeachnameIsNull() {
            addCriterion("TEACHNAME is null");
            return (Criteria) this;
        }

        public Criteria andTeachnameIsNotNull() {
            addCriterion("TEACHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeachnameEqualTo(String value) {
            addCriterion("TEACHNAME =", value, "teachname");
            return (Criteria) this;
        }

        public Criteria andTeachnameNotEqualTo(String value) {
            addCriterion("TEACHNAME <>", value, "teachname");
            return (Criteria) this;
        }

        public Criteria andTeachnameGreaterThan(String value) {
            addCriterion("TEACHNAME >", value, "teachname");
            return (Criteria) this;
        }

        public Criteria andTeachnameGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHNAME >=", value, "teachname");
            return (Criteria) this;
        }

        public Criteria andTeachnameLessThan(String value) {
            addCriterion("TEACHNAME <", value, "teachname");
            return (Criteria) this;
        }

        public Criteria andTeachnameLessThanOrEqualTo(String value) {
            addCriterion("TEACHNAME <=", value, "teachname");
            return (Criteria) this;
        }

        public Criteria andTeachnameLike(String value) {
            addCriterion("TEACHNAME like", value, "teachname");
            return (Criteria) this;
        }

        public Criteria andTeachnameNotLike(String value) {
            addCriterion("TEACHNAME not like", value, "teachname");
            return (Criteria) this;
        }

        public Criteria andTeachnameIn(List<String> values) {
            addCriterion("TEACHNAME in", values, "teachname");
            return (Criteria) this;
        }

        public Criteria andTeachnameNotIn(List<String> values) {
            addCriterion("TEACHNAME not in", values, "teachname");
            return (Criteria) this;
        }

        public Criteria andTeachnameBetween(String value1, String value2) {
            addCriterion("TEACHNAME between", value1, value2, "teachname");
            return (Criteria) this;
        }

        public Criteria andTeachnameNotBetween(String value1, String value2) {
            addCriterion("TEACHNAME not between", value1, value2, "teachname");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentIsNull() {
            addCriterion("EVALUATECONTENT is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentIsNotNull() {
            addCriterion("EVALUATECONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentEqualTo(String value) {
            addCriterion("EVALUATECONTENT =", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentNotEqualTo(String value) {
            addCriterion("EVALUATECONTENT <>", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentGreaterThan(String value) {
            addCriterion("EVALUATECONTENT >", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATECONTENT >=", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentLessThan(String value) {
            addCriterion("EVALUATECONTENT <", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentLessThanOrEqualTo(String value) {
            addCriterion("EVALUATECONTENT <=", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentLike(String value) {
            addCriterion("EVALUATECONTENT like", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentNotLike(String value) {
            addCriterion("EVALUATECONTENT not like", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentIn(List<String> values) {
            addCriterion("EVALUATECONTENT in", values, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentNotIn(List<String> values) {
            addCriterion("EVALUATECONTENT not in", values, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentBetween(String value1, String value2) {
            addCriterion("EVALUATECONTENT between", value1, value2, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentNotBetween(String value1, String value2) {
            addCriterion("EVALUATECONTENT not between", value1, value2, "evaluatecontent");
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

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("SCORE like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("SCORE not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("SCORE not between", value1, value2, "score");
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