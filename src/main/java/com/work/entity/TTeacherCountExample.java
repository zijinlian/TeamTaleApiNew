package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TTeacherCountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTeacherCountExample() {
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

        public Criteria andOrgnameIsNull() {
            addCriterion("ORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("ORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("ORGNAME =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("ORGNAME <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("ORGNAME >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("ORGNAME >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("ORGNAME <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("ORGNAME <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("ORGNAME like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("ORGNAME not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("ORGNAME in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("ORGNAME not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("ORGNAME between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("ORGNAME not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNull() {
            addCriterion("JOBNAME is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("JOBNAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("JOBNAME =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("JOBNAME <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("JOBNAME >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("JOBNAME >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("JOBNAME <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("JOBNAME <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("JOBNAME like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("JOBNAME not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("JOBNAME in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("JOBNAME not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("JOBNAME between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("JOBNAME not between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andTeanameIsNull() {
            addCriterion("TEANAME is null");
            return (Criteria) this;
        }

        public Criteria andTeanameIsNotNull() {
            addCriterion("TEANAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeanameEqualTo(String value) {
            addCriterion("TEANAME =", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotEqualTo(String value) {
            addCriterion("TEANAME <>", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameGreaterThan(String value) {
            addCriterion("TEANAME >", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameGreaterThanOrEqualTo(String value) {
            addCriterion("TEANAME >=", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLessThan(String value) {
            addCriterion("TEANAME <", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLessThanOrEqualTo(String value) {
            addCriterion("TEANAME <=", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLike(String value) {
            addCriterion("TEANAME like", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotLike(String value) {
            addCriterion("TEANAME not like", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameIn(List<String> values) {
            addCriterion("TEANAME in", values, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotIn(List<String> values) {
            addCriterion("TEANAME not in", values, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameBetween(String value1, String value2) {
            addCriterion("TEANAME between", value1, value2, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotBetween(String value1, String value2) {
            addCriterion("TEANAME not between", value1, value2, "teaname");
            return (Criteria) this;
        }

        public Criteria andOrgleverIsNull() {
            addCriterion("ORGLEVER is null");
            return (Criteria) this;
        }

        public Criteria andOrgleverIsNotNull() {
            addCriterion("ORGLEVER is not null");
            return (Criteria) this;
        }

        public Criteria andOrgleverEqualTo(String value) {
            addCriterion("ORGLEVER =", value, "orglever");
            return (Criteria) this;
        }

        public Criteria andOrgleverNotEqualTo(String value) {
            addCriterion("ORGLEVER <>", value, "orglever");
            return (Criteria) this;
        }

        public Criteria andOrgleverGreaterThan(String value) {
            addCriterion("ORGLEVER >", value, "orglever");
            return (Criteria) this;
        }

        public Criteria andOrgleverGreaterThanOrEqualTo(String value) {
            addCriterion("ORGLEVER >=", value, "orglever");
            return (Criteria) this;
        }

        public Criteria andOrgleverLessThan(String value) {
            addCriterion("ORGLEVER <", value, "orglever");
            return (Criteria) this;
        }

        public Criteria andOrgleverLessThanOrEqualTo(String value) {
            addCriterion("ORGLEVER <=", value, "orglever");
            return (Criteria) this;
        }

        public Criteria andOrgleverLike(String value) {
            addCriterion("ORGLEVER like", value, "orglever");
            return (Criteria) this;
        }

        public Criteria andOrgleverNotLike(String value) {
            addCriterion("ORGLEVER not like", value, "orglever");
            return (Criteria) this;
        }

        public Criteria andOrgleverIn(List<String> values) {
            addCriterion("ORGLEVER in", values, "orglever");
            return (Criteria) this;
        }

        public Criteria andOrgleverNotIn(List<String> values) {
            addCriterion("ORGLEVER not in", values, "orglever");
            return (Criteria) this;
        }

        public Criteria andOrgleverBetween(String value1, String value2) {
            addCriterion("ORGLEVER between", value1, value2, "orglever");
            return (Criteria) this;
        }

        public Criteria andOrgleverNotBetween(String value1, String value2) {
            addCriterion("ORGLEVER not between", value1, value2, "orglever");
            return (Criteria) this;
        }

        public Criteria andTeaminIsNull() {
            addCriterion("TEAMIN is null");
            return (Criteria) this;
        }

        public Criteria andTeaminIsNotNull() {
            addCriterion("TEAMIN is not null");
            return (Criteria) this;
        }

        public Criteria andTeaminEqualTo(String value) {
            addCriterion("TEAMIN =", value, "teamin");
            return (Criteria) this;
        }

        public Criteria andTeaminNotEqualTo(String value) {
            addCriterion("TEAMIN <>", value, "teamin");
            return (Criteria) this;
        }

        public Criteria andTeaminGreaterThan(String value) {
            addCriterion("TEAMIN >", value, "teamin");
            return (Criteria) this;
        }

        public Criteria andTeaminGreaterThanOrEqualTo(String value) {
            addCriterion("TEAMIN >=", value, "teamin");
            return (Criteria) this;
        }

        public Criteria andTeaminLessThan(String value) {
            addCriterion("TEAMIN <", value, "teamin");
            return (Criteria) this;
        }

        public Criteria andTeaminLessThanOrEqualTo(String value) {
            addCriterion("TEAMIN <=", value, "teamin");
            return (Criteria) this;
        }

        public Criteria andTeaminLike(String value) {
            addCriterion("TEAMIN like", value, "teamin");
            return (Criteria) this;
        }

        public Criteria andTeaminNotLike(String value) {
            addCriterion("TEAMIN not like", value, "teamin");
            return (Criteria) this;
        }

        public Criteria andTeaminIn(List<String> values) {
            addCriterion("TEAMIN in", values, "teamin");
            return (Criteria) this;
        }

        public Criteria andTeaminNotIn(List<String> values) {
            addCriterion("TEAMIN not in", values, "teamin");
            return (Criteria) this;
        }

        public Criteria andTeaminBetween(String value1, String value2) {
            addCriterion("TEAMIN between", value1, value2, "teamin");
            return (Criteria) this;
        }

        public Criteria andTeaminNotBetween(String value1, String value2) {
            addCriterion("TEAMIN not between", value1, value2, "teamin");
            return (Criteria) this;
        }

        public Criteria andSkillsourceIsNull() {
            addCriterion("SKILLSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSkillsourceIsNotNull() {
            addCriterion("SKILLSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSkillsourceEqualTo(String value) {
            addCriterion("SKILLSOURCE =", value, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceNotEqualTo(String value) {
            addCriterion("SKILLSOURCE <>", value, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceGreaterThan(String value) {
            addCriterion("SKILLSOURCE >", value, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceGreaterThanOrEqualTo(String value) {
            addCriterion("SKILLSOURCE >=", value, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceLessThan(String value) {
            addCriterion("SKILLSOURCE <", value, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceLessThanOrEqualTo(String value) {
            addCriterion("SKILLSOURCE <=", value, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceLike(String value) {
            addCriterion("SKILLSOURCE like", value, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceNotLike(String value) {
            addCriterion("SKILLSOURCE not like", value, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceIn(List<String> values) {
            addCriterion("SKILLSOURCE in", values, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceNotIn(List<String> values) {
            addCriterion("SKILLSOURCE not in", values, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceBetween(String value1, String value2) {
            addCriterion("SKILLSOURCE between", value1, value2, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceNotBetween(String value1, String value2) {
            addCriterion("SKILLSOURCE not between", value1, value2, "skillsource");
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