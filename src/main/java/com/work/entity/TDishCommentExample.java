package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TDishCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDishCommentExample() {
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

        public Criteria andTasteIsNull() {
            addCriterion("TASTE is null");
            return (Criteria) this;
        }

        public Criteria andTasteIsNotNull() {
            addCriterion("TASTE is not null");
            return (Criteria) this;
        }

        public Criteria andTasteEqualTo(String value) {
            addCriterion("TASTE =", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotEqualTo(String value) {
            addCriterion("TASTE <>", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteGreaterThan(String value) {
            addCriterion("TASTE >", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteGreaterThanOrEqualTo(String value) {
            addCriterion("TASTE >=", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLessThan(String value) {
            addCriterion("TASTE <", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLessThanOrEqualTo(String value) {
            addCriterion("TASTE <=", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLike(String value) {
            addCriterion("TASTE like", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotLike(String value) {
            addCriterion("TASTE not like", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteIn(List<String> values) {
            addCriterion("TASTE in", values, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotIn(List<String> values) {
            addCriterion("TASTE not in", values, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteBetween(String value1, String value2) {
            addCriterion("TASTE between", value1, value2, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotBetween(String value1, String value2) {
            addCriterion("TASTE not between", value1, value2, "taste");
            return (Criteria) this;
        }

        public Criteria andComponentIsNull() {
            addCriterion("COMPONENT is null");
            return (Criteria) this;
        }

        public Criteria andComponentIsNotNull() {
            addCriterion("COMPONENT is not null");
            return (Criteria) this;
        }

        public Criteria andComponentEqualTo(String value) {
            addCriterion("COMPONENT =", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotEqualTo(String value) {
            addCriterion("COMPONENT <>", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThan(String value) {
            addCriterion("COMPONENT >", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThanOrEqualTo(String value) {
            addCriterion("COMPONENT >=", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLessThan(String value) {
            addCriterion("COMPONENT <", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLessThanOrEqualTo(String value) {
            addCriterion("COMPONENT <=", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLike(String value) {
            addCriterion("COMPONENT like", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotLike(String value) {
            addCriterion("COMPONENT not like", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentIn(List<String> values) {
            addCriterion("COMPONENT in", values, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotIn(List<String> values) {
            addCriterion("COMPONENT not in", values, "component");
            return (Criteria) this;
        }

        public Criteria andComponentBetween(String value1, String value2) {
            addCriterion("COMPONENT between", value1, value2, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotBetween(String value1, String value2) {
            addCriterion("COMPONENT not between", value1, value2, "component");
            return (Criteria) this;
        }

        public Criteria andCosteffectiveIsNull() {
            addCriterion("COSTEFFECTIVE is null");
            return (Criteria) this;
        }

        public Criteria andCosteffectiveIsNotNull() {
            addCriterion("COSTEFFECTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andCosteffectiveEqualTo(String value) {
            addCriterion("COSTEFFECTIVE =", value, "costeffective");
            return (Criteria) this;
        }

        public Criteria andCosteffectiveNotEqualTo(String value) {
            addCriterion("COSTEFFECTIVE <>", value, "costeffective");
            return (Criteria) this;
        }

        public Criteria andCosteffectiveGreaterThan(String value) {
            addCriterion("COSTEFFECTIVE >", value, "costeffective");
            return (Criteria) this;
        }

        public Criteria andCosteffectiveGreaterThanOrEqualTo(String value) {
            addCriterion("COSTEFFECTIVE >=", value, "costeffective");
            return (Criteria) this;
        }

        public Criteria andCosteffectiveLessThan(String value) {
            addCriterion("COSTEFFECTIVE <", value, "costeffective");
            return (Criteria) this;
        }

        public Criteria andCosteffectiveLessThanOrEqualTo(String value) {
            addCriterion("COSTEFFECTIVE <=", value, "costeffective");
            return (Criteria) this;
        }

        public Criteria andCosteffectiveLike(String value) {
            addCriterion("COSTEFFECTIVE like", value, "costeffective");
            return (Criteria) this;
        }

        public Criteria andCosteffectiveNotLike(String value) {
            addCriterion("COSTEFFECTIVE not like", value, "costeffective");
            return (Criteria) this;
        }

        public Criteria andCosteffectiveIn(List<String> values) {
            addCriterion("COSTEFFECTIVE in", values, "costeffective");
            return (Criteria) this;
        }

        public Criteria andCosteffectiveNotIn(List<String> values) {
            addCriterion("COSTEFFECTIVE not in", values, "costeffective");
            return (Criteria) this;
        }

        public Criteria andCosteffectiveBetween(String value1, String value2) {
            addCriterion("COSTEFFECTIVE between", value1, value2, "costeffective");
            return (Criteria) this;
        }

        public Criteria andCosteffectiveNotBetween(String value1, String value2) {
            addCriterion("COSTEFFECTIVE not between", value1, value2, "costeffective");
            return (Criteria) this;
        }

        public Criteria andEvaluationIsNull() {
            addCriterion("EVALUATION is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIsNotNull() {
            addCriterion("EVALUATION is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationEqualTo(String value) {
            addCriterion("EVALUATION =", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotEqualTo(String value) {
            addCriterion("EVALUATION <>", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationGreaterThan(String value) {
            addCriterion("EVALUATION >", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATION >=", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLessThan(String value) {
            addCriterion("EVALUATION <", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLessThanOrEqualTo(String value) {
            addCriterion("EVALUATION <=", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLike(String value) {
            addCriterion("EVALUATION like", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotLike(String value) {
            addCriterion("EVALUATION not like", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationIn(List<String> values) {
            addCriterion("EVALUATION in", values, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotIn(List<String> values) {
            addCriterion("EVALUATION not in", values, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationBetween(String value1, String value2) {
            addCriterion("EVALUATION between", value1, value2, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotBetween(String value1, String value2) {
            addCriterion("EVALUATION not between", value1, value2, "evaluation");
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

        public Criteria andDishidIsNull() {
            addCriterion("DISHID is null");
            return (Criteria) this;
        }

        public Criteria andDishidIsNotNull() {
            addCriterion("DISHID is not null");
            return (Criteria) this;
        }

        public Criteria andDishidEqualTo(String value) {
            addCriterion("DISHID =", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotEqualTo(String value) {
            addCriterion("DISHID <>", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidGreaterThan(String value) {
            addCriterion("DISHID >", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidGreaterThanOrEqualTo(String value) {
            addCriterion("DISHID >=", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidLessThan(String value) {
            addCriterion("DISHID <", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidLessThanOrEqualTo(String value) {
            addCriterion("DISHID <=", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidLike(String value) {
            addCriterion("DISHID like", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotLike(String value) {
            addCriterion("DISHID not like", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidIn(List<String> values) {
            addCriterion("DISHID in", values, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotIn(List<String> values) {
            addCriterion("DISHID not in", values, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidBetween(String value1, String value2) {
            addCriterion("DISHID between", value1, value2, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotBetween(String value1, String value2) {
            addCriterion("DISHID not between", value1, value2, "dishid");
            return (Criteria) this;
        }

        public Criteria andTotalsourceIsNull() {
            addCriterion("TOTALSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andTotalsourceIsNotNull() {
            addCriterion("TOTALSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsourceEqualTo(String value) {
            addCriterion("TOTALSOURCE =", value, "totalsource");
            return (Criteria) this;
        }

        public Criteria andTotalsourceNotEqualTo(String value) {
            addCriterion("TOTALSOURCE <>", value, "totalsource");
            return (Criteria) this;
        }

        public Criteria andTotalsourceGreaterThan(String value) {
            addCriterion("TOTALSOURCE >", value, "totalsource");
            return (Criteria) this;
        }

        public Criteria andTotalsourceGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALSOURCE >=", value, "totalsource");
            return (Criteria) this;
        }

        public Criteria andTotalsourceLessThan(String value) {
            addCriterion("TOTALSOURCE <", value, "totalsource");
            return (Criteria) this;
        }

        public Criteria andTotalsourceLessThanOrEqualTo(String value) {
            addCriterion("TOTALSOURCE <=", value, "totalsource");
            return (Criteria) this;
        }

        public Criteria andTotalsourceLike(String value) {
            addCriterion("TOTALSOURCE like", value, "totalsource");
            return (Criteria) this;
        }

        public Criteria andTotalsourceNotLike(String value) {
            addCriterion("TOTALSOURCE not like", value, "totalsource");
            return (Criteria) this;
        }

        public Criteria andTotalsourceIn(List<String> values) {
            addCriterion("TOTALSOURCE in", values, "totalsource");
            return (Criteria) this;
        }

        public Criteria andTotalsourceNotIn(List<String> values) {
            addCriterion("TOTALSOURCE not in", values, "totalsource");
            return (Criteria) this;
        }

        public Criteria andTotalsourceBetween(String value1, String value2) {
            addCriterion("TOTALSOURCE between", value1, value2, "totalsource");
            return (Criteria) this;
        }

        public Criteria andTotalsourceNotBetween(String value1, String value2) {
            addCriterion("TOTALSOURCE not between", value1, value2, "totalsource");
            return (Criteria) this;
        }

        public Criteria andCredateIsNull() {
            addCriterion("CREDATE is null");
            return (Criteria) this;
        }

        public Criteria andCredateIsNotNull() {
            addCriterion("CREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCredateEqualTo(String value) {
            addCriterion("CREDATE =", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateNotEqualTo(String value) {
            addCriterion("CREDATE <>", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateGreaterThan(String value) {
            addCriterion("CREDATE >", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateGreaterThanOrEqualTo(String value) {
            addCriterion("CREDATE >=", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateLessThan(String value) {
            addCriterion("CREDATE <", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateLessThanOrEqualTo(String value) {
            addCriterion("CREDATE <=", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateLike(String value) {
            addCriterion("CREDATE like", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateNotLike(String value) {
            addCriterion("CREDATE not like", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateIn(List<String> values) {
            addCriterion("CREDATE in", values, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateNotIn(List<String> values) {
            addCriterion("CREDATE not in", values, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateBetween(String value1, String value2) {
            addCriterion("CREDATE between", value1, value2, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateNotBetween(String value1, String value2) {
            addCriterion("CREDATE not between", value1, value2, "credate");
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