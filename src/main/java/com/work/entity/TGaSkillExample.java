package com.work.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TGaSkillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGaSkillExample() {
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

        public Criteria andSkilltypeIsNull() {
            addCriterion("SKILLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSkilltypeIsNotNull() {
            addCriterion("SKILLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSkilltypeEqualTo(String value) {
            addCriterion("SKILLTYPE =", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeNotEqualTo(String value) {
            addCriterion("SKILLTYPE <>", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeGreaterThan(String value) {
            addCriterion("SKILLTYPE >", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeGreaterThanOrEqualTo(String value) {
            addCriterion("SKILLTYPE >=", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeLessThan(String value) {
            addCriterion("SKILLTYPE <", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeLessThanOrEqualTo(String value) {
            addCriterion("SKILLTYPE <=", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeLike(String value) {
            addCriterion("SKILLTYPE like", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeNotLike(String value) {
            addCriterion("SKILLTYPE not like", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeIn(List<String> values) {
            addCriterion("SKILLTYPE in", values, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeNotIn(List<String> values) {
            addCriterion("SKILLTYPE not in", values, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeBetween(String value1, String value2) {
            addCriterion("SKILLTYPE between", value1, value2, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeNotBetween(String value1, String value2) {
            addCriterion("SKILLTYPE not between", value1, value2, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilllevelIsNull() {
            addCriterion("SKILLLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSkilllevelIsNotNull() {
            addCriterion("SKILLLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSkilllevelEqualTo(String value) {
            addCriterion("SKILLLEVEL =", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelNotEqualTo(String value) {
            addCriterion("SKILLLEVEL <>", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelGreaterThan(String value) {
            addCriterion("SKILLLEVEL >", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelGreaterThanOrEqualTo(String value) {
            addCriterion("SKILLLEVEL >=", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelLessThan(String value) {
            addCriterion("SKILLLEVEL <", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelLessThanOrEqualTo(String value) {
            addCriterion("SKILLLEVEL <=", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelLike(String value) {
            addCriterion("SKILLLEVEL like", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelNotLike(String value) {
            addCriterion("SKILLLEVEL not like", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelIn(List<String> values) {
            addCriterion("SKILLLEVEL in", values, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelNotIn(List<String> values) {
            addCriterion("SKILLLEVEL not in", values, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelBetween(String value1, String value2) {
            addCriterion("SKILLLEVEL between", value1, value2, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelNotBetween(String value1, String value2) {
            addCriterion("SKILLLEVEL not between", value1, value2, "skilllevel");
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

        public Criteria andSkillsourceEqualTo(BigDecimal value) {
            addCriterion("SKILLSOURCE =", value, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceNotEqualTo(BigDecimal value) {
            addCriterion("SKILLSOURCE <>", value, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceGreaterThan(BigDecimal value) {
            addCriterion("SKILLSOURCE >", value, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SKILLSOURCE >=", value, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceLessThan(BigDecimal value) {
            addCriterion("SKILLSOURCE <", value, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SKILLSOURCE <=", value, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceIn(List<BigDecimal> values) {
            addCriterion("SKILLSOURCE in", values, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceNotIn(List<BigDecimal> values) {
            addCriterion("SKILLSOURCE not in", values, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SKILLSOURCE between", value1, value2, "skillsource");
            return (Criteria) this;
        }

        public Criteria andSkillsourceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SKILLSOURCE not between", value1, value2, "skillsource");
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