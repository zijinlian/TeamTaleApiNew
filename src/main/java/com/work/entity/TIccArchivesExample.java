package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TIccArchivesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TIccArchivesExample() {
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

        public Criteria andFdArchivesIdIsNull() {
            addCriterion("FD_ARCHIVES_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIdIsNotNull() {
            addCriterion("FD_ARCHIVES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIdEqualTo(String value) {
            addCriterion("FD_ARCHIVES_ID =", value, "fdArchivesId");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIdNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_ID <>", value, "fdArchivesId");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIdGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_ID >", value, "fdArchivesId");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_ID >=", value, "fdArchivesId");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIdLessThan(String value) {
            addCriterion("FD_ARCHIVES_ID <", value, "fdArchivesId");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIdLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_ID <=", value, "fdArchivesId");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIdLike(String value) {
            addCriterion("FD_ARCHIVES_ID like", value, "fdArchivesId");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIdNotLike(String value) {
            addCriterion("FD_ARCHIVES_ID not like", value, "fdArchivesId");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIdIn(List<String> values) {
            addCriterion("FD_ARCHIVES_ID in", values, "fdArchivesId");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIdNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_ID not in", values, "fdArchivesId");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIdBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_ID between", value1, value2, "fdArchivesId");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIdNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_ID not between", value1, value2, "fdArchivesId");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAIsNull() {
            addCriterion("FD_ARCHIVES_A is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAIsNotNull() {
            addCriterion("FD_ARCHIVES_A is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAEqualTo(String value) {
            addCriterion("FD_ARCHIVES_A =", value, "fdArchivesA");
            return (Criteria) this;
        }

        public Criteria andFdArchivesANotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_A <>", value, "fdArchivesA");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_A >", value, "fdArchivesA");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_A >=", value, "fdArchivesA");
            return (Criteria) this;
        }

        public Criteria andFdArchivesALessThan(String value) {
            addCriterion("FD_ARCHIVES_A <", value, "fdArchivesA");
            return (Criteria) this;
        }

        public Criteria andFdArchivesALessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_A <=", value, "fdArchivesA");
            return (Criteria) this;
        }

        public Criteria andFdArchivesALike(String value) {
            addCriterion("FD_ARCHIVES_A like", value, "fdArchivesA");
            return (Criteria) this;
        }

        public Criteria andFdArchivesANotLike(String value) {
            addCriterion("FD_ARCHIVES_A not like", value, "fdArchivesA");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAIn(List<String> values) {
            addCriterion("FD_ARCHIVES_A in", values, "fdArchivesA");
            return (Criteria) this;
        }

        public Criteria andFdArchivesANotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_A not in", values, "fdArchivesA");
            return (Criteria) this;
        }

        public Criteria andFdArchivesABetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_A between", value1, value2, "fdArchivesA");
            return (Criteria) this;
        }

        public Criteria andFdArchivesANotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_A not between", value1, value2, "fdArchivesA");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBIsNull() {
            addCriterion("FD_ARCHIVES_B is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBIsNotNull() {
            addCriterion("FD_ARCHIVES_B is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBEqualTo(String value) {
            addCriterion("FD_ARCHIVES_B =", value, "fdArchivesB");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_B <>", value, "fdArchivesB");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_B >", value, "fdArchivesB");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_B >=", value, "fdArchivesB");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBLessThan(String value) {
            addCriterion("FD_ARCHIVES_B <", value, "fdArchivesB");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_B <=", value, "fdArchivesB");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBLike(String value) {
            addCriterion("FD_ARCHIVES_B like", value, "fdArchivesB");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBNotLike(String value) {
            addCriterion("FD_ARCHIVES_B not like", value, "fdArchivesB");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBIn(List<String> values) {
            addCriterion("FD_ARCHIVES_B in", values, "fdArchivesB");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_B not in", values, "fdArchivesB");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_B between", value1, value2, "fdArchivesB");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_B not between", value1, value2, "fdArchivesB");
            return (Criteria) this;
        }

        public Criteria andFdArchivesCIsNull() {
            addCriterion("FD_ARCHIVES_C is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesCIsNotNull() {
            addCriterion("FD_ARCHIVES_C is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesCEqualTo(String value) {
            addCriterion("FD_ARCHIVES_C =", value, "fdArchivesC");
            return (Criteria) this;
        }

        public Criteria andFdArchivesCNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_C <>", value, "fdArchivesC");
            return (Criteria) this;
        }

        public Criteria andFdArchivesCGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_C >", value, "fdArchivesC");
            return (Criteria) this;
        }

        public Criteria andFdArchivesCGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_C >=", value, "fdArchivesC");
            return (Criteria) this;
        }

        public Criteria andFdArchivesCLessThan(String value) {
            addCriterion("FD_ARCHIVES_C <", value, "fdArchivesC");
            return (Criteria) this;
        }

        public Criteria andFdArchivesCLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_C <=", value, "fdArchivesC");
            return (Criteria) this;
        }

        public Criteria andFdArchivesCLike(String value) {
            addCriterion("FD_ARCHIVES_C like", value, "fdArchivesC");
            return (Criteria) this;
        }

        public Criteria andFdArchivesCNotLike(String value) {
            addCriterion("FD_ARCHIVES_C not like", value, "fdArchivesC");
            return (Criteria) this;
        }

        public Criteria andFdArchivesCIn(List<String> values) {
            addCriterion("FD_ARCHIVES_C in", values, "fdArchivesC");
            return (Criteria) this;
        }

        public Criteria andFdArchivesCNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_C not in", values, "fdArchivesC");
            return (Criteria) this;
        }

        public Criteria andFdArchivesCBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_C between", value1, value2, "fdArchivesC");
            return (Criteria) this;
        }

        public Criteria andFdArchivesCNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_C not between", value1, value2, "fdArchivesC");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDIsNull() {
            addCriterion("FD_ARCHIVES_D is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDIsNotNull() {
            addCriterion("FD_ARCHIVES_D is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDEqualTo(String value) {
            addCriterion("FD_ARCHIVES_D =", value, "fdArchivesD");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_D <>", value, "fdArchivesD");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_D >", value, "fdArchivesD");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_D >=", value, "fdArchivesD");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDLessThan(String value) {
            addCriterion("FD_ARCHIVES_D <", value, "fdArchivesD");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_D <=", value, "fdArchivesD");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDLike(String value) {
            addCriterion("FD_ARCHIVES_D like", value, "fdArchivesD");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDNotLike(String value) {
            addCriterion("FD_ARCHIVES_D not like", value, "fdArchivesD");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDIn(List<String> values) {
            addCriterion("FD_ARCHIVES_D in", values, "fdArchivesD");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_D not in", values, "fdArchivesD");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_D between", value1, value2, "fdArchivesD");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_D not between", value1, value2, "fdArchivesD");
            return (Criteria) this;
        }

        public Criteria andFdArchivesEIsNull() {
            addCriterion("FD_ARCHIVES_E is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesEIsNotNull() {
            addCriterion("FD_ARCHIVES_E is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesEEqualTo(String value) {
            addCriterion("FD_ARCHIVES_E =", value, "fdArchivesE");
            return (Criteria) this;
        }

        public Criteria andFdArchivesENotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_E <>", value, "fdArchivesE");
            return (Criteria) this;
        }

        public Criteria andFdArchivesEGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_E >", value, "fdArchivesE");
            return (Criteria) this;
        }

        public Criteria andFdArchivesEGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_E >=", value, "fdArchivesE");
            return (Criteria) this;
        }

        public Criteria andFdArchivesELessThan(String value) {
            addCriterion("FD_ARCHIVES_E <", value, "fdArchivesE");
            return (Criteria) this;
        }

        public Criteria andFdArchivesELessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_E <=", value, "fdArchivesE");
            return (Criteria) this;
        }

        public Criteria andFdArchivesELike(String value) {
            addCriterion("FD_ARCHIVES_E like", value, "fdArchivesE");
            return (Criteria) this;
        }

        public Criteria andFdArchivesENotLike(String value) {
            addCriterion("FD_ARCHIVES_E not like", value, "fdArchivesE");
            return (Criteria) this;
        }

        public Criteria andFdArchivesEIn(List<String> values) {
            addCriterion("FD_ARCHIVES_E in", values, "fdArchivesE");
            return (Criteria) this;
        }

        public Criteria andFdArchivesENotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_E not in", values, "fdArchivesE");
            return (Criteria) this;
        }

        public Criteria andFdArchivesEBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_E between", value1, value2, "fdArchivesE");
            return (Criteria) this;
        }

        public Criteria andFdArchivesENotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_E not between", value1, value2, "fdArchivesE");
            return (Criteria) this;
        }

        public Criteria andFdArchivesFIsNull() {
            addCriterion("FD_ARCHIVES_F is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesFIsNotNull() {
            addCriterion("FD_ARCHIVES_F is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesFEqualTo(String value) {
            addCriterion("FD_ARCHIVES_F =", value, "fdArchivesF");
            return (Criteria) this;
        }

        public Criteria andFdArchivesFNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_F <>", value, "fdArchivesF");
            return (Criteria) this;
        }

        public Criteria andFdArchivesFGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_F >", value, "fdArchivesF");
            return (Criteria) this;
        }

        public Criteria andFdArchivesFGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_F >=", value, "fdArchivesF");
            return (Criteria) this;
        }

        public Criteria andFdArchivesFLessThan(String value) {
            addCriterion("FD_ARCHIVES_F <", value, "fdArchivesF");
            return (Criteria) this;
        }

        public Criteria andFdArchivesFLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_F <=", value, "fdArchivesF");
            return (Criteria) this;
        }

        public Criteria andFdArchivesFLike(String value) {
            addCriterion("FD_ARCHIVES_F like", value, "fdArchivesF");
            return (Criteria) this;
        }

        public Criteria andFdArchivesFNotLike(String value) {
            addCriterion("FD_ARCHIVES_F not like", value, "fdArchivesF");
            return (Criteria) this;
        }

        public Criteria andFdArchivesFIn(List<String> values) {
            addCriterion("FD_ARCHIVES_F in", values, "fdArchivesF");
            return (Criteria) this;
        }

        public Criteria andFdArchivesFNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_F not in", values, "fdArchivesF");
            return (Criteria) this;
        }

        public Criteria andFdArchivesFBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_F between", value1, value2, "fdArchivesF");
            return (Criteria) this;
        }

        public Criteria andFdArchivesFNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_F not between", value1, value2, "fdArchivesF");
            return (Criteria) this;
        }

        public Criteria andFdArchivesGIsNull() {
            addCriterion("FD_ARCHIVES_G is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesGIsNotNull() {
            addCriterion("FD_ARCHIVES_G is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesGEqualTo(String value) {
            addCriterion("FD_ARCHIVES_G =", value, "fdArchivesG");
            return (Criteria) this;
        }

        public Criteria andFdArchivesGNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_G <>", value, "fdArchivesG");
            return (Criteria) this;
        }

        public Criteria andFdArchivesGGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_G >", value, "fdArchivesG");
            return (Criteria) this;
        }

        public Criteria andFdArchivesGGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_G >=", value, "fdArchivesG");
            return (Criteria) this;
        }

        public Criteria andFdArchivesGLessThan(String value) {
            addCriterion("FD_ARCHIVES_G <", value, "fdArchivesG");
            return (Criteria) this;
        }

        public Criteria andFdArchivesGLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_G <=", value, "fdArchivesG");
            return (Criteria) this;
        }

        public Criteria andFdArchivesGLike(String value) {
            addCriterion("FD_ARCHIVES_G like", value, "fdArchivesG");
            return (Criteria) this;
        }

        public Criteria andFdArchivesGNotLike(String value) {
            addCriterion("FD_ARCHIVES_G not like", value, "fdArchivesG");
            return (Criteria) this;
        }

        public Criteria andFdArchivesGIn(List<String> values) {
            addCriterion("FD_ARCHIVES_G in", values, "fdArchivesG");
            return (Criteria) this;
        }

        public Criteria andFdArchivesGNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_G not in", values, "fdArchivesG");
            return (Criteria) this;
        }

        public Criteria andFdArchivesGBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_G between", value1, value2, "fdArchivesG");
            return (Criteria) this;
        }

        public Criteria andFdArchivesGNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_G not between", value1, value2, "fdArchivesG");
            return (Criteria) this;
        }

        public Criteria andFdArchivesHIsNull() {
            addCriterion("FD_ARCHIVES_H is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesHIsNotNull() {
            addCriterion("FD_ARCHIVES_H is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesHEqualTo(String value) {
            addCriterion("FD_ARCHIVES_H =", value, "fdArchivesH");
            return (Criteria) this;
        }

        public Criteria andFdArchivesHNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_H <>", value, "fdArchivesH");
            return (Criteria) this;
        }

        public Criteria andFdArchivesHGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_H >", value, "fdArchivesH");
            return (Criteria) this;
        }

        public Criteria andFdArchivesHGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_H >=", value, "fdArchivesH");
            return (Criteria) this;
        }

        public Criteria andFdArchivesHLessThan(String value) {
            addCriterion("FD_ARCHIVES_H <", value, "fdArchivesH");
            return (Criteria) this;
        }

        public Criteria andFdArchivesHLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_H <=", value, "fdArchivesH");
            return (Criteria) this;
        }

        public Criteria andFdArchivesHLike(String value) {
            addCriterion("FD_ARCHIVES_H like", value, "fdArchivesH");
            return (Criteria) this;
        }

        public Criteria andFdArchivesHNotLike(String value) {
            addCriterion("FD_ARCHIVES_H not like", value, "fdArchivesH");
            return (Criteria) this;
        }

        public Criteria andFdArchivesHIn(List<String> values) {
            addCriterion("FD_ARCHIVES_H in", values, "fdArchivesH");
            return (Criteria) this;
        }

        public Criteria andFdArchivesHNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_H not in", values, "fdArchivesH");
            return (Criteria) this;
        }

        public Criteria andFdArchivesHBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_H between", value1, value2, "fdArchivesH");
            return (Criteria) this;
        }

        public Criteria andFdArchivesHNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_H not between", value1, value2, "fdArchivesH");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIIsNull() {
            addCriterion("FD_ARCHIVES_I is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIIsNotNull() {
            addCriterion("FD_ARCHIVES_I is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIEqualTo(String value) {
            addCriterion("FD_ARCHIVES_I =", value, "fdArchivesI");
            return (Criteria) this;
        }

        public Criteria andFdArchivesINotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_I <>", value, "fdArchivesI");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_I >", value, "fdArchivesI");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_I >=", value, "fdArchivesI");
            return (Criteria) this;
        }

        public Criteria andFdArchivesILessThan(String value) {
            addCriterion("FD_ARCHIVES_I <", value, "fdArchivesI");
            return (Criteria) this;
        }

        public Criteria andFdArchivesILessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_I <=", value, "fdArchivesI");
            return (Criteria) this;
        }

        public Criteria andFdArchivesILike(String value) {
            addCriterion("FD_ARCHIVES_I like", value, "fdArchivesI");
            return (Criteria) this;
        }

        public Criteria andFdArchivesINotLike(String value) {
            addCriterion("FD_ARCHIVES_I not like", value, "fdArchivesI");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIIn(List<String> values) {
            addCriterion("FD_ARCHIVES_I in", values, "fdArchivesI");
            return (Criteria) this;
        }

        public Criteria andFdArchivesINotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_I not in", values, "fdArchivesI");
            return (Criteria) this;
        }

        public Criteria andFdArchivesIBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_I between", value1, value2, "fdArchivesI");
            return (Criteria) this;
        }

        public Criteria andFdArchivesINotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_I not between", value1, value2, "fdArchivesI");
            return (Criteria) this;
        }

        public Criteria andFdArchivesJIsNull() {
            addCriterion("FD_ARCHIVES_J is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesJIsNotNull() {
            addCriterion("FD_ARCHIVES_J is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesJEqualTo(String value) {
            addCriterion("FD_ARCHIVES_J =", value, "fdArchivesJ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesJNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_J <>", value, "fdArchivesJ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesJGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_J >", value, "fdArchivesJ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesJGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_J >=", value, "fdArchivesJ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesJLessThan(String value) {
            addCriterion("FD_ARCHIVES_J <", value, "fdArchivesJ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesJLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_J <=", value, "fdArchivesJ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesJLike(String value) {
            addCriterion("FD_ARCHIVES_J like", value, "fdArchivesJ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesJNotLike(String value) {
            addCriterion("FD_ARCHIVES_J not like", value, "fdArchivesJ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesJIn(List<String> values) {
            addCriterion("FD_ARCHIVES_J in", values, "fdArchivesJ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesJNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_J not in", values, "fdArchivesJ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesJBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_J between", value1, value2, "fdArchivesJ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesJNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_J not between", value1, value2, "fdArchivesJ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesKIsNull() {
            addCriterion("FD_ARCHIVES_K is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesKIsNotNull() {
            addCriterion("FD_ARCHIVES_K is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesKEqualTo(String value) {
            addCriterion("FD_ARCHIVES_K =", value, "fdArchivesK");
            return (Criteria) this;
        }

        public Criteria andFdArchivesKNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_K <>", value, "fdArchivesK");
            return (Criteria) this;
        }

        public Criteria andFdArchivesKGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_K >", value, "fdArchivesK");
            return (Criteria) this;
        }

        public Criteria andFdArchivesKGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_K >=", value, "fdArchivesK");
            return (Criteria) this;
        }

        public Criteria andFdArchivesKLessThan(String value) {
            addCriterion("FD_ARCHIVES_K <", value, "fdArchivesK");
            return (Criteria) this;
        }

        public Criteria andFdArchivesKLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_K <=", value, "fdArchivesK");
            return (Criteria) this;
        }

        public Criteria andFdArchivesKLike(String value) {
            addCriterion("FD_ARCHIVES_K like", value, "fdArchivesK");
            return (Criteria) this;
        }

        public Criteria andFdArchivesKNotLike(String value) {
            addCriterion("FD_ARCHIVES_K not like", value, "fdArchivesK");
            return (Criteria) this;
        }

        public Criteria andFdArchivesKIn(List<String> values) {
            addCriterion("FD_ARCHIVES_K in", values, "fdArchivesK");
            return (Criteria) this;
        }

        public Criteria andFdArchivesKNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_K not in", values, "fdArchivesK");
            return (Criteria) this;
        }

        public Criteria andFdArchivesKBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_K between", value1, value2, "fdArchivesK");
            return (Criteria) this;
        }

        public Criteria andFdArchivesKNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_K not between", value1, value2, "fdArchivesK");
            return (Criteria) this;
        }

        public Criteria andFdArchivesLIsNull() {
            addCriterion("FD_ARCHIVES_L is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesLIsNotNull() {
            addCriterion("FD_ARCHIVES_L is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesLEqualTo(String value) {
            addCriterion("FD_ARCHIVES_L =", value, "fdArchivesL");
            return (Criteria) this;
        }

        public Criteria andFdArchivesLNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_L <>", value, "fdArchivesL");
            return (Criteria) this;
        }

        public Criteria andFdArchivesLGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_L >", value, "fdArchivesL");
            return (Criteria) this;
        }

        public Criteria andFdArchivesLGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_L >=", value, "fdArchivesL");
            return (Criteria) this;
        }

        public Criteria andFdArchivesLLessThan(String value) {
            addCriterion("FD_ARCHIVES_L <", value, "fdArchivesL");
            return (Criteria) this;
        }

        public Criteria andFdArchivesLLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_L <=", value, "fdArchivesL");
            return (Criteria) this;
        }

        public Criteria andFdArchivesLLike(String value) {
            addCriterion("FD_ARCHIVES_L like", value, "fdArchivesL");
            return (Criteria) this;
        }

        public Criteria andFdArchivesLNotLike(String value) {
            addCriterion("FD_ARCHIVES_L not like", value, "fdArchivesL");
            return (Criteria) this;
        }

        public Criteria andFdArchivesLIn(List<String> values) {
            addCriterion("FD_ARCHIVES_L in", values, "fdArchivesL");
            return (Criteria) this;
        }

        public Criteria andFdArchivesLNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_L not in", values, "fdArchivesL");
            return (Criteria) this;
        }

        public Criteria andFdArchivesLBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_L between", value1, value2, "fdArchivesL");
            return (Criteria) this;
        }

        public Criteria andFdArchivesLNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_L not between", value1, value2, "fdArchivesL");
            return (Criteria) this;
        }

        public Criteria andFdArchivesMIsNull() {
            addCriterion("FD_ARCHIVES_M is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesMIsNotNull() {
            addCriterion("FD_ARCHIVES_M is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesMEqualTo(String value) {
            addCriterion("FD_ARCHIVES_M =", value, "fdArchivesM");
            return (Criteria) this;
        }

        public Criteria andFdArchivesMNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_M <>", value, "fdArchivesM");
            return (Criteria) this;
        }

        public Criteria andFdArchivesMGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_M >", value, "fdArchivesM");
            return (Criteria) this;
        }

        public Criteria andFdArchivesMGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_M >=", value, "fdArchivesM");
            return (Criteria) this;
        }

        public Criteria andFdArchivesMLessThan(String value) {
            addCriterion("FD_ARCHIVES_M <", value, "fdArchivesM");
            return (Criteria) this;
        }

        public Criteria andFdArchivesMLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_M <=", value, "fdArchivesM");
            return (Criteria) this;
        }

        public Criteria andFdArchivesMLike(String value) {
            addCriterion("FD_ARCHIVES_M like", value, "fdArchivesM");
            return (Criteria) this;
        }

        public Criteria andFdArchivesMNotLike(String value) {
            addCriterion("FD_ARCHIVES_M not like", value, "fdArchivesM");
            return (Criteria) this;
        }

        public Criteria andFdArchivesMIn(List<String> values) {
            addCriterion("FD_ARCHIVES_M in", values, "fdArchivesM");
            return (Criteria) this;
        }

        public Criteria andFdArchivesMNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_M not in", values, "fdArchivesM");
            return (Criteria) this;
        }

        public Criteria andFdArchivesMBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_M between", value1, value2, "fdArchivesM");
            return (Criteria) this;
        }

        public Criteria andFdArchivesMNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_M not between", value1, value2, "fdArchivesM");
            return (Criteria) this;
        }

        public Criteria andFdArchivesNIsNull() {
            addCriterion("FD_ARCHIVES_N is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesNIsNotNull() {
            addCriterion("FD_ARCHIVES_N is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesNEqualTo(String value) {
            addCriterion("FD_ARCHIVES_N =", value, "fdArchivesN");
            return (Criteria) this;
        }

        public Criteria andFdArchivesNNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_N <>", value, "fdArchivesN");
            return (Criteria) this;
        }

        public Criteria andFdArchivesNGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_N >", value, "fdArchivesN");
            return (Criteria) this;
        }

        public Criteria andFdArchivesNGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_N >=", value, "fdArchivesN");
            return (Criteria) this;
        }

        public Criteria andFdArchivesNLessThan(String value) {
            addCriterion("FD_ARCHIVES_N <", value, "fdArchivesN");
            return (Criteria) this;
        }

        public Criteria andFdArchivesNLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_N <=", value, "fdArchivesN");
            return (Criteria) this;
        }

        public Criteria andFdArchivesNLike(String value) {
            addCriterion("FD_ARCHIVES_N like", value, "fdArchivesN");
            return (Criteria) this;
        }

        public Criteria andFdArchivesNNotLike(String value) {
            addCriterion("FD_ARCHIVES_N not like", value, "fdArchivesN");
            return (Criteria) this;
        }

        public Criteria andFdArchivesNIn(List<String> values) {
            addCriterion("FD_ARCHIVES_N in", values, "fdArchivesN");
            return (Criteria) this;
        }

        public Criteria andFdArchivesNNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_N not in", values, "fdArchivesN");
            return (Criteria) this;
        }

        public Criteria andFdArchivesNBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_N between", value1, value2, "fdArchivesN");
            return (Criteria) this;
        }

        public Criteria andFdArchivesNNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_N not between", value1, value2, "fdArchivesN");
            return (Criteria) this;
        }

        public Criteria andFdArchivesOIsNull() {
            addCriterion("FD_ARCHIVES_O is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesOIsNotNull() {
            addCriterion("FD_ARCHIVES_O is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesOEqualTo(String value) {
            addCriterion("FD_ARCHIVES_O =", value, "fdArchivesO");
            return (Criteria) this;
        }

        public Criteria andFdArchivesONotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_O <>", value, "fdArchivesO");
            return (Criteria) this;
        }

        public Criteria andFdArchivesOGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_O >", value, "fdArchivesO");
            return (Criteria) this;
        }

        public Criteria andFdArchivesOGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_O >=", value, "fdArchivesO");
            return (Criteria) this;
        }

        public Criteria andFdArchivesOLessThan(String value) {
            addCriterion("FD_ARCHIVES_O <", value, "fdArchivesO");
            return (Criteria) this;
        }

        public Criteria andFdArchivesOLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_O <=", value, "fdArchivesO");
            return (Criteria) this;
        }

        public Criteria andFdArchivesOLike(String value) {
            addCriterion("FD_ARCHIVES_O like", value, "fdArchivesO");
            return (Criteria) this;
        }

        public Criteria andFdArchivesONotLike(String value) {
            addCriterion("FD_ARCHIVES_O not like", value, "fdArchivesO");
            return (Criteria) this;
        }

        public Criteria andFdArchivesOIn(List<String> values) {
            addCriterion("FD_ARCHIVES_O in", values, "fdArchivesO");
            return (Criteria) this;
        }

        public Criteria andFdArchivesONotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_O not in", values, "fdArchivesO");
            return (Criteria) this;
        }

        public Criteria andFdArchivesOBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_O between", value1, value2, "fdArchivesO");
            return (Criteria) this;
        }

        public Criteria andFdArchivesONotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_O not between", value1, value2, "fdArchivesO");
            return (Criteria) this;
        }

        public Criteria andFdArchivesPIsNull() {
            addCriterion("FD_ARCHIVES_P is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesPIsNotNull() {
            addCriterion("FD_ARCHIVES_P is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesPEqualTo(String value) {
            addCriterion("FD_ARCHIVES_P =", value, "fdArchivesP");
            return (Criteria) this;
        }

        public Criteria andFdArchivesPNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_P <>", value, "fdArchivesP");
            return (Criteria) this;
        }

        public Criteria andFdArchivesPGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_P >", value, "fdArchivesP");
            return (Criteria) this;
        }

        public Criteria andFdArchivesPGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_P >=", value, "fdArchivesP");
            return (Criteria) this;
        }

        public Criteria andFdArchivesPLessThan(String value) {
            addCriterion("FD_ARCHIVES_P <", value, "fdArchivesP");
            return (Criteria) this;
        }

        public Criteria andFdArchivesPLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_P <=", value, "fdArchivesP");
            return (Criteria) this;
        }

        public Criteria andFdArchivesPLike(String value) {
            addCriterion("FD_ARCHIVES_P like", value, "fdArchivesP");
            return (Criteria) this;
        }

        public Criteria andFdArchivesPNotLike(String value) {
            addCriterion("FD_ARCHIVES_P not like", value, "fdArchivesP");
            return (Criteria) this;
        }

        public Criteria andFdArchivesPIn(List<String> values) {
            addCriterion("FD_ARCHIVES_P in", values, "fdArchivesP");
            return (Criteria) this;
        }

        public Criteria andFdArchivesPNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_P not in", values, "fdArchivesP");
            return (Criteria) this;
        }

        public Criteria andFdArchivesPBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_P between", value1, value2, "fdArchivesP");
            return (Criteria) this;
        }

        public Criteria andFdArchivesPNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_P not between", value1, value2, "fdArchivesP");
            return (Criteria) this;
        }

        public Criteria andFdArchivesQIsNull() {
            addCriterion("FD_ARCHIVES_Q is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesQIsNotNull() {
            addCriterion("FD_ARCHIVES_Q is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesQEqualTo(String value) {
            addCriterion("FD_ARCHIVES_Q =", value, "fdArchivesQ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesQNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_Q <>", value, "fdArchivesQ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesQGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_Q >", value, "fdArchivesQ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesQGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_Q >=", value, "fdArchivesQ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesQLessThan(String value) {
            addCriterion("FD_ARCHIVES_Q <", value, "fdArchivesQ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesQLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_Q <=", value, "fdArchivesQ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesQLike(String value) {
            addCriterion("FD_ARCHIVES_Q like", value, "fdArchivesQ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesQNotLike(String value) {
            addCriterion("FD_ARCHIVES_Q not like", value, "fdArchivesQ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesQIn(List<String> values) {
            addCriterion("FD_ARCHIVES_Q in", values, "fdArchivesQ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesQNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_Q not in", values, "fdArchivesQ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesQBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_Q between", value1, value2, "fdArchivesQ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesQNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_Q not between", value1, value2, "fdArchivesQ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesRIsNull() {
            addCriterion("FD_ARCHIVES_R is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesRIsNotNull() {
            addCriterion("FD_ARCHIVES_R is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesREqualTo(String value) {
            addCriterion("FD_ARCHIVES_R =", value, "fdArchivesR");
            return (Criteria) this;
        }

        public Criteria andFdArchivesRNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_R <>", value, "fdArchivesR");
            return (Criteria) this;
        }

        public Criteria andFdArchivesRGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_R >", value, "fdArchivesR");
            return (Criteria) this;
        }

        public Criteria andFdArchivesRGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_R >=", value, "fdArchivesR");
            return (Criteria) this;
        }

        public Criteria andFdArchivesRLessThan(String value) {
            addCriterion("FD_ARCHIVES_R <", value, "fdArchivesR");
            return (Criteria) this;
        }

        public Criteria andFdArchivesRLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_R <=", value, "fdArchivesR");
            return (Criteria) this;
        }

        public Criteria andFdArchivesRLike(String value) {
            addCriterion("FD_ARCHIVES_R like", value, "fdArchivesR");
            return (Criteria) this;
        }

        public Criteria andFdArchivesRNotLike(String value) {
            addCriterion("FD_ARCHIVES_R not like", value, "fdArchivesR");
            return (Criteria) this;
        }

        public Criteria andFdArchivesRIn(List<String> values) {
            addCriterion("FD_ARCHIVES_R in", values, "fdArchivesR");
            return (Criteria) this;
        }

        public Criteria andFdArchivesRNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_R not in", values, "fdArchivesR");
            return (Criteria) this;
        }

        public Criteria andFdArchivesRBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_R between", value1, value2, "fdArchivesR");
            return (Criteria) this;
        }

        public Criteria andFdArchivesRNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_R not between", value1, value2, "fdArchivesR");
            return (Criteria) this;
        }

        public Criteria andFdArchivesSIsNull() {
            addCriterion("FD_ARCHIVES_S is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesSIsNotNull() {
            addCriterion("FD_ARCHIVES_S is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesSEqualTo(String value) {
            addCriterion("FD_ARCHIVES_S =", value, "fdArchivesS");
            return (Criteria) this;
        }

        public Criteria andFdArchivesSNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_S <>", value, "fdArchivesS");
            return (Criteria) this;
        }

        public Criteria andFdArchivesSGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_S >", value, "fdArchivesS");
            return (Criteria) this;
        }

        public Criteria andFdArchivesSGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_S >=", value, "fdArchivesS");
            return (Criteria) this;
        }

        public Criteria andFdArchivesSLessThan(String value) {
            addCriterion("FD_ARCHIVES_S <", value, "fdArchivesS");
            return (Criteria) this;
        }

        public Criteria andFdArchivesSLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_S <=", value, "fdArchivesS");
            return (Criteria) this;
        }

        public Criteria andFdArchivesSLike(String value) {
            addCriterion("FD_ARCHIVES_S like", value, "fdArchivesS");
            return (Criteria) this;
        }

        public Criteria andFdArchivesSNotLike(String value) {
            addCriterion("FD_ARCHIVES_S not like", value, "fdArchivesS");
            return (Criteria) this;
        }

        public Criteria andFdArchivesSIn(List<String> values) {
            addCriterion("FD_ARCHIVES_S in", values, "fdArchivesS");
            return (Criteria) this;
        }

        public Criteria andFdArchivesSNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_S not in", values, "fdArchivesS");
            return (Criteria) this;
        }

        public Criteria andFdArchivesSBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_S between", value1, value2, "fdArchivesS");
            return (Criteria) this;
        }

        public Criteria andFdArchivesSNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_S not between", value1, value2, "fdArchivesS");
            return (Criteria) this;
        }

        public Criteria andFdArchivesTIsNull() {
            addCriterion("FD_ARCHIVES_T is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesTIsNotNull() {
            addCriterion("FD_ARCHIVES_T is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesTEqualTo(String value) {
            addCriterion("FD_ARCHIVES_T =", value, "fdArchivesT");
            return (Criteria) this;
        }

        public Criteria andFdArchivesTNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_T <>", value, "fdArchivesT");
            return (Criteria) this;
        }

        public Criteria andFdArchivesTGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_T >", value, "fdArchivesT");
            return (Criteria) this;
        }

        public Criteria andFdArchivesTGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_T >=", value, "fdArchivesT");
            return (Criteria) this;
        }

        public Criteria andFdArchivesTLessThan(String value) {
            addCriterion("FD_ARCHIVES_T <", value, "fdArchivesT");
            return (Criteria) this;
        }

        public Criteria andFdArchivesTLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_T <=", value, "fdArchivesT");
            return (Criteria) this;
        }

        public Criteria andFdArchivesTLike(String value) {
            addCriterion("FD_ARCHIVES_T like", value, "fdArchivesT");
            return (Criteria) this;
        }

        public Criteria andFdArchivesTNotLike(String value) {
            addCriterion("FD_ARCHIVES_T not like", value, "fdArchivesT");
            return (Criteria) this;
        }

        public Criteria andFdArchivesTIn(List<String> values) {
            addCriterion("FD_ARCHIVES_T in", values, "fdArchivesT");
            return (Criteria) this;
        }

        public Criteria andFdArchivesTNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_T not in", values, "fdArchivesT");
            return (Criteria) this;
        }

        public Criteria andFdArchivesTBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_T between", value1, value2, "fdArchivesT");
            return (Criteria) this;
        }

        public Criteria andFdArchivesTNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_T not between", value1, value2, "fdArchivesT");
            return (Criteria) this;
        }

        public Criteria andFdArchivesUIsNull() {
            addCriterion("FD_ARCHIVES_U is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesUIsNotNull() {
            addCriterion("FD_ARCHIVES_U is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesUEqualTo(String value) {
            addCriterion("FD_ARCHIVES_U =", value, "fdArchivesU");
            return (Criteria) this;
        }

        public Criteria andFdArchivesUNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_U <>", value, "fdArchivesU");
            return (Criteria) this;
        }

        public Criteria andFdArchivesUGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_U >", value, "fdArchivesU");
            return (Criteria) this;
        }

        public Criteria andFdArchivesUGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_U >=", value, "fdArchivesU");
            return (Criteria) this;
        }

        public Criteria andFdArchivesULessThan(String value) {
            addCriterion("FD_ARCHIVES_U <", value, "fdArchivesU");
            return (Criteria) this;
        }

        public Criteria andFdArchivesULessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_U <=", value, "fdArchivesU");
            return (Criteria) this;
        }

        public Criteria andFdArchivesULike(String value) {
            addCriterion("FD_ARCHIVES_U like", value, "fdArchivesU");
            return (Criteria) this;
        }

        public Criteria andFdArchivesUNotLike(String value) {
            addCriterion("FD_ARCHIVES_U not like", value, "fdArchivesU");
            return (Criteria) this;
        }

        public Criteria andFdArchivesUIn(List<String> values) {
            addCriterion("FD_ARCHIVES_U in", values, "fdArchivesU");
            return (Criteria) this;
        }

        public Criteria andFdArchivesUNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_U not in", values, "fdArchivesU");
            return (Criteria) this;
        }

        public Criteria andFdArchivesUBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_U between", value1, value2, "fdArchivesU");
            return (Criteria) this;
        }

        public Criteria andFdArchivesUNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_U not between", value1, value2, "fdArchivesU");
            return (Criteria) this;
        }

        public Criteria andFdArchivesVIsNull() {
            addCriterion("FD_ARCHIVES_V is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesVIsNotNull() {
            addCriterion("FD_ARCHIVES_V is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesVEqualTo(String value) {
            addCriterion("FD_ARCHIVES_V =", value, "fdArchivesV");
            return (Criteria) this;
        }

        public Criteria andFdArchivesVNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_V <>", value, "fdArchivesV");
            return (Criteria) this;
        }

        public Criteria andFdArchivesVGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_V >", value, "fdArchivesV");
            return (Criteria) this;
        }

        public Criteria andFdArchivesVGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_V >=", value, "fdArchivesV");
            return (Criteria) this;
        }

        public Criteria andFdArchivesVLessThan(String value) {
            addCriterion("FD_ARCHIVES_V <", value, "fdArchivesV");
            return (Criteria) this;
        }

        public Criteria andFdArchivesVLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_V <=", value, "fdArchivesV");
            return (Criteria) this;
        }

        public Criteria andFdArchivesVLike(String value) {
            addCriterion("FD_ARCHIVES_V like", value, "fdArchivesV");
            return (Criteria) this;
        }

        public Criteria andFdArchivesVNotLike(String value) {
            addCriterion("FD_ARCHIVES_V not like", value, "fdArchivesV");
            return (Criteria) this;
        }

        public Criteria andFdArchivesVIn(List<String> values) {
            addCriterion("FD_ARCHIVES_V in", values, "fdArchivesV");
            return (Criteria) this;
        }

        public Criteria andFdArchivesVNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_V not in", values, "fdArchivesV");
            return (Criteria) this;
        }

        public Criteria andFdArchivesVBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_V between", value1, value2, "fdArchivesV");
            return (Criteria) this;
        }

        public Criteria andFdArchivesVNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_V not between", value1, value2, "fdArchivesV");
            return (Criteria) this;
        }

        public Criteria andFdArchivesWIsNull() {
            addCriterion("FD_ARCHIVES_W is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesWIsNotNull() {
            addCriterion("FD_ARCHIVES_W is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesWEqualTo(String value) {
            addCriterion("FD_ARCHIVES_W =", value, "fdArchivesW");
            return (Criteria) this;
        }

        public Criteria andFdArchivesWNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_W <>", value, "fdArchivesW");
            return (Criteria) this;
        }

        public Criteria andFdArchivesWGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_W >", value, "fdArchivesW");
            return (Criteria) this;
        }

        public Criteria andFdArchivesWGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_W >=", value, "fdArchivesW");
            return (Criteria) this;
        }

        public Criteria andFdArchivesWLessThan(String value) {
            addCriterion("FD_ARCHIVES_W <", value, "fdArchivesW");
            return (Criteria) this;
        }

        public Criteria andFdArchivesWLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_W <=", value, "fdArchivesW");
            return (Criteria) this;
        }

        public Criteria andFdArchivesWLike(String value) {
            addCriterion("FD_ARCHIVES_W like", value, "fdArchivesW");
            return (Criteria) this;
        }

        public Criteria andFdArchivesWNotLike(String value) {
            addCriterion("FD_ARCHIVES_W not like", value, "fdArchivesW");
            return (Criteria) this;
        }

        public Criteria andFdArchivesWIn(List<String> values) {
            addCriterion("FD_ARCHIVES_W in", values, "fdArchivesW");
            return (Criteria) this;
        }

        public Criteria andFdArchivesWNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_W not in", values, "fdArchivesW");
            return (Criteria) this;
        }

        public Criteria andFdArchivesWBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_W between", value1, value2, "fdArchivesW");
            return (Criteria) this;
        }

        public Criteria andFdArchivesWNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_W not between", value1, value2, "fdArchivesW");
            return (Criteria) this;
        }

        public Criteria andFdArchivesXIsNull() {
            addCriterion("FD_ARCHIVES_X is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesXIsNotNull() {
            addCriterion("FD_ARCHIVES_X is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesXEqualTo(String value) {
            addCriterion("FD_ARCHIVES_X =", value, "fdArchivesX");
            return (Criteria) this;
        }

        public Criteria andFdArchivesXNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_X <>", value, "fdArchivesX");
            return (Criteria) this;
        }

        public Criteria andFdArchivesXGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_X >", value, "fdArchivesX");
            return (Criteria) this;
        }

        public Criteria andFdArchivesXGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_X >=", value, "fdArchivesX");
            return (Criteria) this;
        }

        public Criteria andFdArchivesXLessThan(String value) {
            addCriterion("FD_ARCHIVES_X <", value, "fdArchivesX");
            return (Criteria) this;
        }

        public Criteria andFdArchivesXLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_X <=", value, "fdArchivesX");
            return (Criteria) this;
        }

        public Criteria andFdArchivesXLike(String value) {
            addCriterion("FD_ARCHIVES_X like", value, "fdArchivesX");
            return (Criteria) this;
        }

        public Criteria andFdArchivesXNotLike(String value) {
            addCriterion("FD_ARCHIVES_X not like", value, "fdArchivesX");
            return (Criteria) this;
        }

        public Criteria andFdArchivesXIn(List<String> values) {
            addCriterion("FD_ARCHIVES_X in", values, "fdArchivesX");
            return (Criteria) this;
        }

        public Criteria andFdArchivesXNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_X not in", values, "fdArchivesX");
            return (Criteria) this;
        }

        public Criteria andFdArchivesXBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_X between", value1, value2, "fdArchivesX");
            return (Criteria) this;
        }

        public Criteria andFdArchivesXNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_X not between", value1, value2, "fdArchivesX");
            return (Criteria) this;
        }

        public Criteria andFdArchivesYIsNull() {
            addCriterion("FD_ARCHIVES_Y is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesYIsNotNull() {
            addCriterion("FD_ARCHIVES_Y is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesYEqualTo(String value) {
            addCriterion("FD_ARCHIVES_Y =", value, "fdArchivesY");
            return (Criteria) this;
        }

        public Criteria andFdArchivesYNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_Y <>", value, "fdArchivesY");
            return (Criteria) this;
        }

        public Criteria andFdArchivesYGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_Y >", value, "fdArchivesY");
            return (Criteria) this;
        }

        public Criteria andFdArchivesYGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_Y >=", value, "fdArchivesY");
            return (Criteria) this;
        }

        public Criteria andFdArchivesYLessThan(String value) {
            addCriterion("FD_ARCHIVES_Y <", value, "fdArchivesY");
            return (Criteria) this;
        }

        public Criteria andFdArchivesYLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_Y <=", value, "fdArchivesY");
            return (Criteria) this;
        }

        public Criteria andFdArchivesYLike(String value) {
            addCriterion("FD_ARCHIVES_Y like", value, "fdArchivesY");
            return (Criteria) this;
        }

        public Criteria andFdArchivesYNotLike(String value) {
            addCriterion("FD_ARCHIVES_Y not like", value, "fdArchivesY");
            return (Criteria) this;
        }

        public Criteria andFdArchivesYIn(List<String> values) {
            addCriterion("FD_ARCHIVES_Y in", values, "fdArchivesY");
            return (Criteria) this;
        }

        public Criteria andFdArchivesYNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_Y not in", values, "fdArchivesY");
            return (Criteria) this;
        }

        public Criteria andFdArchivesYBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_Y between", value1, value2, "fdArchivesY");
            return (Criteria) this;
        }

        public Criteria andFdArchivesYNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_Y not between", value1, value2, "fdArchivesY");
            return (Criteria) this;
        }

        public Criteria andFdArchivesZIsNull() {
            addCriterion("FD_ARCHIVES_Z is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesZIsNotNull() {
            addCriterion("FD_ARCHIVES_Z is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesZEqualTo(String value) {
            addCriterion("FD_ARCHIVES_Z =", value, "fdArchivesZ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesZNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_Z <>", value, "fdArchivesZ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesZGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_Z >", value, "fdArchivesZ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesZGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_Z >=", value, "fdArchivesZ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesZLessThan(String value) {
            addCriterion("FD_ARCHIVES_Z <", value, "fdArchivesZ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesZLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_Z <=", value, "fdArchivesZ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesZLike(String value) {
            addCriterion("FD_ARCHIVES_Z like", value, "fdArchivesZ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesZNotLike(String value) {
            addCriterion("FD_ARCHIVES_Z not like", value, "fdArchivesZ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesZIn(List<String> values) {
            addCriterion("FD_ARCHIVES_Z in", values, "fdArchivesZ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesZNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_Z not in", values, "fdArchivesZ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesZBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_Z between", value1, value2, "fdArchivesZ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesZNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_Z not between", value1, value2, "fdArchivesZ");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAaIsNull() {
            addCriterion("FD_ARCHIVES_AA is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAaIsNotNull() {
            addCriterion("FD_ARCHIVES_AA is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAaEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AA =", value, "fdArchivesAa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAaNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AA <>", value, "fdArchivesAa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAaGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AA >", value, "fdArchivesAa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAaGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AA >=", value, "fdArchivesAa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAaLessThan(String value) {
            addCriterion("FD_ARCHIVES_AA <", value, "fdArchivesAa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAaLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AA <=", value, "fdArchivesAa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAaLike(String value) {
            addCriterion("FD_ARCHIVES_AA like", value, "fdArchivesAa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAaNotLike(String value) {
            addCriterion("FD_ARCHIVES_AA not like", value, "fdArchivesAa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAaIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AA in", values, "fdArchivesAa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAaNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AA not in", values, "fdArchivesAa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAaBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AA between", value1, value2, "fdArchivesAa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAaNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AA not between", value1, value2, "fdArchivesAa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAbIsNull() {
            addCriterion("FD_ARCHIVES_AB is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAbIsNotNull() {
            addCriterion("FD_ARCHIVES_AB is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAbEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AB =", value, "fdArchivesAb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAbNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AB <>", value, "fdArchivesAb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAbGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AB >", value, "fdArchivesAb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAbGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AB >=", value, "fdArchivesAb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAbLessThan(String value) {
            addCriterion("FD_ARCHIVES_AB <", value, "fdArchivesAb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAbLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AB <=", value, "fdArchivesAb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAbLike(String value) {
            addCriterion("FD_ARCHIVES_AB like", value, "fdArchivesAb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAbNotLike(String value) {
            addCriterion("FD_ARCHIVES_AB not like", value, "fdArchivesAb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAbIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AB in", values, "fdArchivesAb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAbNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AB not in", values, "fdArchivesAb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAbBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AB between", value1, value2, "fdArchivesAb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAbNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AB not between", value1, value2, "fdArchivesAb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAcIsNull() {
            addCriterion("FD_ARCHIVES_AC is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAcIsNotNull() {
            addCriterion("FD_ARCHIVES_AC is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAcEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AC =", value, "fdArchivesAc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAcNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AC <>", value, "fdArchivesAc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAcGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AC >", value, "fdArchivesAc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAcGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AC >=", value, "fdArchivesAc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAcLessThan(String value) {
            addCriterion("FD_ARCHIVES_AC <", value, "fdArchivesAc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAcLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AC <=", value, "fdArchivesAc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAcLike(String value) {
            addCriterion("FD_ARCHIVES_AC like", value, "fdArchivesAc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAcNotLike(String value) {
            addCriterion("FD_ARCHIVES_AC not like", value, "fdArchivesAc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAcIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AC in", values, "fdArchivesAc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAcNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AC not in", values, "fdArchivesAc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAcBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AC between", value1, value2, "fdArchivesAc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAcNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AC not between", value1, value2, "fdArchivesAc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAdIsNull() {
            addCriterion("FD_ARCHIVES_AD is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAdIsNotNull() {
            addCriterion("FD_ARCHIVES_AD is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAdEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AD =", value, "fdArchivesAd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAdNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AD <>", value, "fdArchivesAd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAdGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AD >", value, "fdArchivesAd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AD >=", value, "fdArchivesAd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAdLessThan(String value) {
            addCriterion("FD_ARCHIVES_AD <", value, "fdArchivesAd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAdLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AD <=", value, "fdArchivesAd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAdLike(String value) {
            addCriterion("FD_ARCHIVES_AD like", value, "fdArchivesAd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAdNotLike(String value) {
            addCriterion("FD_ARCHIVES_AD not like", value, "fdArchivesAd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAdIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AD in", values, "fdArchivesAd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAdNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AD not in", values, "fdArchivesAd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAdBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AD between", value1, value2, "fdArchivesAd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAdNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AD not between", value1, value2, "fdArchivesAd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAeIsNull() {
            addCriterion("FD_ARCHIVES_AE is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAeIsNotNull() {
            addCriterion("FD_ARCHIVES_AE is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAeEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AE =", value, "fdArchivesAe");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAeNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AE <>", value, "fdArchivesAe");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAeGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AE >", value, "fdArchivesAe");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AE >=", value, "fdArchivesAe");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAeLessThan(String value) {
            addCriterion("FD_ARCHIVES_AE <", value, "fdArchivesAe");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAeLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AE <=", value, "fdArchivesAe");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAeLike(String value) {
            addCriterion("FD_ARCHIVES_AE like", value, "fdArchivesAe");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAeNotLike(String value) {
            addCriterion("FD_ARCHIVES_AE not like", value, "fdArchivesAe");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAeIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AE in", values, "fdArchivesAe");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAeNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AE not in", values, "fdArchivesAe");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAeBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AE between", value1, value2, "fdArchivesAe");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAeNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AE not between", value1, value2, "fdArchivesAe");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAfIsNull() {
            addCriterion("FD_ARCHIVES_AF is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAfIsNotNull() {
            addCriterion("FD_ARCHIVES_AF is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAfEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AF =", value, "fdArchivesAf");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAfNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AF <>", value, "fdArchivesAf");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAfGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AF >", value, "fdArchivesAf");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAfGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AF >=", value, "fdArchivesAf");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAfLessThan(String value) {
            addCriterion("FD_ARCHIVES_AF <", value, "fdArchivesAf");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAfLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AF <=", value, "fdArchivesAf");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAfLike(String value) {
            addCriterion("FD_ARCHIVES_AF like", value, "fdArchivesAf");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAfNotLike(String value) {
            addCriterion("FD_ARCHIVES_AF not like", value, "fdArchivesAf");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAfIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AF in", values, "fdArchivesAf");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAfNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AF not in", values, "fdArchivesAf");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAfBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AF between", value1, value2, "fdArchivesAf");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAfNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AF not between", value1, value2, "fdArchivesAf");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAgIsNull() {
            addCriterion("FD_ARCHIVES_AG is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAgIsNotNull() {
            addCriterion("FD_ARCHIVES_AG is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAgEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AG =", value, "fdArchivesAg");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAgNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AG <>", value, "fdArchivesAg");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAgGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AG >", value, "fdArchivesAg");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAgGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AG >=", value, "fdArchivesAg");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAgLessThan(String value) {
            addCriterion("FD_ARCHIVES_AG <", value, "fdArchivesAg");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAgLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AG <=", value, "fdArchivesAg");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAgLike(String value) {
            addCriterion("FD_ARCHIVES_AG like", value, "fdArchivesAg");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAgNotLike(String value) {
            addCriterion("FD_ARCHIVES_AG not like", value, "fdArchivesAg");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAgIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AG in", values, "fdArchivesAg");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAgNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AG not in", values, "fdArchivesAg");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAgBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AG between", value1, value2, "fdArchivesAg");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAgNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AG not between", value1, value2, "fdArchivesAg");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAhIsNull() {
            addCriterion("FD_ARCHIVES_AH is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAhIsNotNull() {
            addCriterion("FD_ARCHIVES_AH is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAhEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AH =", value, "fdArchivesAh");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAhNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AH <>", value, "fdArchivesAh");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAhGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AH >", value, "fdArchivesAh");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAhGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AH >=", value, "fdArchivesAh");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAhLessThan(String value) {
            addCriterion("FD_ARCHIVES_AH <", value, "fdArchivesAh");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAhLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AH <=", value, "fdArchivesAh");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAhLike(String value) {
            addCriterion("FD_ARCHIVES_AH like", value, "fdArchivesAh");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAhNotLike(String value) {
            addCriterion("FD_ARCHIVES_AH not like", value, "fdArchivesAh");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAhIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AH in", values, "fdArchivesAh");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAhNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AH not in", values, "fdArchivesAh");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAhBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AH between", value1, value2, "fdArchivesAh");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAhNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AH not between", value1, value2, "fdArchivesAh");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAiIsNull() {
            addCriterion("FD_ARCHIVES_AI is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAiIsNotNull() {
            addCriterion("FD_ARCHIVES_AI is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAiEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AI =", value, "fdArchivesAi");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAiNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AI <>", value, "fdArchivesAi");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAiGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AI >", value, "fdArchivesAi");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAiGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AI >=", value, "fdArchivesAi");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAiLessThan(String value) {
            addCriterion("FD_ARCHIVES_AI <", value, "fdArchivesAi");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAiLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AI <=", value, "fdArchivesAi");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAiLike(String value) {
            addCriterion("FD_ARCHIVES_AI like", value, "fdArchivesAi");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAiNotLike(String value) {
            addCriterion("FD_ARCHIVES_AI not like", value, "fdArchivesAi");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAiIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AI in", values, "fdArchivesAi");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAiNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AI not in", values, "fdArchivesAi");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAiBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AI between", value1, value2, "fdArchivesAi");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAiNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AI not between", value1, value2, "fdArchivesAi");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAjIsNull() {
            addCriterion("FD_ARCHIVES_AJ is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAjIsNotNull() {
            addCriterion("FD_ARCHIVES_AJ is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAjEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AJ =", value, "fdArchivesAj");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAjNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AJ <>", value, "fdArchivesAj");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAjGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AJ >", value, "fdArchivesAj");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAjGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AJ >=", value, "fdArchivesAj");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAjLessThan(String value) {
            addCriterion("FD_ARCHIVES_AJ <", value, "fdArchivesAj");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAjLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AJ <=", value, "fdArchivesAj");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAjLike(String value) {
            addCriterion("FD_ARCHIVES_AJ like", value, "fdArchivesAj");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAjNotLike(String value) {
            addCriterion("FD_ARCHIVES_AJ not like", value, "fdArchivesAj");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAjIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AJ in", values, "fdArchivesAj");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAjNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AJ not in", values, "fdArchivesAj");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAjBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AJ between", value1, value2, "fdArchivesAj");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAjNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AJ not between", value1, value2, "fdArchivesAj");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAkIsNull() {
            addCriterion("FD_ARCHIVES_AK is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAkIsNotNull() {
            addCriterion("FD_ARCHIVES_AK is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAkEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AK =", value, "fdArchivesAk");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAkNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AK <>", value, "fdArchivesAk");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAkGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AK >", value, "fdArchivesAk");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAkGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AK >=", value, "fdArchivesAk");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAkLessThan(String value) {
            addCriterion("FD_ARCHIVES_AK <", value, "fdArchivesAk");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAkLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AK <=", value, "fdArchivesAk");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAkLike(String value) {
            addCriterion("FD_ARCHIVES_AK like", value, "fdArchivesAk");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAkNotLike(String value) {
            addCriterion("FD_ARCHIVES_AK not like", value, "fdArchivesAk");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAkIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AK in", values, "fdArchivesAk");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAkNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AK not in", values, "fdArchivesAk");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAkBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AK between", value1, value2, "fdArchivesAk");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAkNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AK not between", value1, value2, "fdArchivesAk");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAlIsNull() {
            addCriterion("FD_ARCHIVES_AL is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAlIsNotNull() {
            addCriterion("FD_ARCHIVES_AL is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAlEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AL =", value, "fdArchivesAl");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAlNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AL <>", value, "fdArchivesAl");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAlGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AL >", value, "fdArchivesAl");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAlGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AL >=", value, "fdArchivesAl");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAlLessThan(String value) {
            addCriterion("FD_ARCHIVES_AL <", value, "fdArchivesAl");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAlLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AL <=", value, "fdArchivesAl");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAlLike(String value) {
            addCriterion("FD_ARCHIVES_AL like", value, "fdArchivesAl");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAlNotLike(String value) {
            addCriterion("FD_ARCHIVES_AL not like", value, "fdArchivesAl");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAlIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AL in", values, "fdArchivesAl");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAlNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AL not in", values, "fdArchivesAl");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAlBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AL between", value1, value2, "fdArchivesAl");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAlNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AL not between", value1, value2, "fdArchivesAl");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAmIsNull() {
            addCriterion("FD_ARCHIVES_AM is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAmIsNotNull() {
            addCriterion("FD_ARCHIVES_AM is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAmEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AM =", value, "fdArchivesAm");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAmNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AM <>", value, "fdArchivesAm");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAmGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AM >", value, "fdArchivesAm");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAmGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AM >=", value, "fdArchivesAm");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAmLessThan(String value) {
            addCriterion("FD_ARCHIVES_AM <", value, "fdArchivesAm");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAmLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AM <=", value, "fdArchivesAm");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAmLike(String value) {
            addCriterion("FD_ARCHIVES_AM like", value, "fdArchivesAm");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAmNotLike(String value) {
            addCriterion("FD_ARCHIVES_AM not like", value, "fdArchivesAm");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAmIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AM in", values, "fdArchivesAm");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAmNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AM not in", values, "fdArchivesAm");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAmBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AM between", value1, value2, "fdArchivesAm");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAmNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AM not between", value1, value2, "fdArchivesAm");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAnIsNull() {
            addCriterion("FD_ARCHIVES_AN is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAnIsNotNull() {
            addCriterion("FD_ARCHIVES_AN is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAnEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AN =", value, "fdArchivesAn");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAnNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AN <>", value, "fdArchivesAn");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAnGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AN >", value, "fdArchivesAn");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAnGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AN >=", value, "fdArchivesAn");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAnLessThan(String value) {
            addCriterion("FD_ARCHIVES_AN <", value, "fdArchivesAn");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAnLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AN <=", value, "fdArchivesAn");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAnLike(String value) {
            addCriterion("FD_ARCHIVES_AN like", value, "fdArchivesAn");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAnNotLike(String value) {
            addCriterion("FD_ARCHIVES_AN not like", value, "fdArchivesAn");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAnIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AN in", values, "fdArchivesAn");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAnNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AN not in", values, "fdArchivesAn");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAnBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AN between", value1, value2, "fdArchivesAn");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAnNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AN not between", value1, value2, "fdArchivesAn");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAoIsNull() {
            addCriterion("FD_ARCHIVES_AO is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAoIsNotNull() {
            addCriterion("FD_ARCHIVES_AO is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAoEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AO =", value, "fdArchivesAo");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAoNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AO <>", value, "fdArchivesAo");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAoGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AO >", value, "fdArchivesAo");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAoGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AO >=", value, "fdArchivesAo");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAoLessThan(String value) {
            addCriterion("FD_ARCHIVES_AO <", value, "fdArchivesAo");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAoLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AO <=", value, "fdArchivesAo");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAoLike(String value) {
            addCriterion("FD_ARCHIVES_AO like", value, "fdArchivesAo");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAoNotLike(String value) {
            addCriterion("FD_ARCHIVES_AO not like", value, "fdArchivesAo");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAoIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AO in", values, "fdArchivesAo");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAoNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AO not in", values, "fdArchivesAo");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAoBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AO between", value1, value2, "fdArchivesAo");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAoNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AO not between", value1, value2, "fdArchivesAo");
            return (Criteria) this;
        }

        public Criteria andFdArchivesApIsNull() {
            addCriterion("FD_ARCHIVES_AP is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesApIsNotNull() {
            addCriterion("FD_ARCHIVES_AP is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesApEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AP =", value, "fdArchivesAp");
            return (Criteria) this;
        }

        public Criteria andFdArchivesApNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AP <>", value, "fdArchivesAp");
            return (Criteria) this;
        }

        public Criteria andFdArchivesApGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AP >", value, "fdArchivesAp");
            return (Criteria) this;
        }

        public Criteria andFdArchivesApGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AP >=", value, "fdArchivesAp");
            return (Criteria) this;
        }

        public Criteria andFdArchivesApLessThan(String value) {
            addCriterion("FD_ARCHIVES_AP <", value, "fdArchivesAp");
            return (Criteria) this;
        }

        public Criteria andFdArchivesApLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AP <=", value, "fdArchivesAp");
            return (Criteria) this;
        }

        public Criteria andFdArchivesApLike(String value) {
            addCriterion("FD_ARCHIVES_AP like", value, "fdArchivesAp");
            return (Criteria) this;
        }

        public Criteria andFdArchivesApNotLike(String value) {
            addCriterion("FD_ARCHIVES_AP not like", value, "fdArchivesAp");
            return (Criteria) this;
        }

        public Criteria andFdArchivesApIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AP in", values, "fdArchivesAp");
            return (Criteria) this;
        }

        public Criteria andFdArchivesApNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AP not in", values, "fdArchivesAp");
            return (Criteria) this;
        }

        public Criteria andFdArchivesApBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AP between", value1, value2, "fdArchivesAp");
            return (Criteria) this;
        }

        public Criteria andFdArchivesApNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AP not between", value1, value2, "fdArchivesAp");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAqIsNull() {
            addCriterion("FD_ARCHIVES_AQ is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAqIsNotNull() {
            addCriterion("FD_ARCHIVES_AQ is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAqEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AQ =", value, "fdArchivesAq");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAqNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AQ <>", value, "fdArchivesAq");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAqGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AQ >", value, "fdArchivesAq");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAqGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AQ >=", value, "fdArchivesAq");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAqLessThan(String value) {
            addCriterion("FD_ARCHIVES_AQ <", value, "fdArchivesAq");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAqLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AQ <=", value, "fdArchivesAq");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAqLike(String value) {
            addCriterion("FD_ARCHIVES_AQ like", value, "fdArchivesAq");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAqNotLike(String value) {
            addCriterion("FD_ARCHIVES_AQ not like", value, "fdArchivesAq");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAqIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AQ in", values, "fdArchivesAq");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAqNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AQ not in", values, "fdArchivesAq");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAqBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AQ between", value1, value2, "fdArchivesAq");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAqNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AQ not between", value1, value2, "fdArchivesAq");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDateIsNull() {
            addCriterion("FD_ARCHIVES_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDateIsNotNull() {
            addCriterion("FD_ARCHIVES_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDateEqualTo(String value) {
            addCriterion("FD_ARCHIVES_DATE =", value, "fdArchivesDate");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDateNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_DATE <>", value, "fdArchivesDate");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDateGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_DATE >", value, "fdArchivesDate");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_DATE >=", value, "fdArchivesDate");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDateLessThan(String value) {
            addCriterion("FD_ARCHIVES_DATE <", value, "fdArchivesDate");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDateLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_DATE <=", value, "fdArchivesDate");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDateLike(String value) {
            addCriterion("FD_ARCHIVES_DATE like", value, "fdArchivesDate");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDateNotLike(String value) {
            addCriterion("FD_ARCHIVES_DATE not like", value, "fdArchivesDate");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDateIn(List<String> values) {
            addCriterion("FD_ARCHIVES_DATE in", values, "fdArchivesDate");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDateNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_DATE not in", values, "fdArchivesDate");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDateBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_DATE between", value1, value2, "fdArchivesDate");
            return (Criteria) this;
        }

        public Criteria andFdArchivesDateNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_DATE not between", value1, value2, "fdArchivesDate");
            return (Criteria) this;
        }

        public Criteria andFdArchivesArIsNull() {
            addCriterion("FD_ARCHIVES_AR is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesArIsNotNull() {
            addCriterion("FD_ARCHIVES_AR is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesArEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AR =", value, "fdArchivesAr");
            return (Criteria) this;
        }

        public Criteria andFdArchivesArNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AR <>", value, "fdArchivesAr");
            return (Criteria) this;
        }

        public Criteria andFdArchivesArGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AR >", value, "fdArchivesAr");
            return (Criteria) this;
        }

        public Criteria andFdArchivesArGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AR >=", value, "fdArchivesAr");
            return (Criteria) this;
        }

        public Criteria andFdArchivesArLessThan(String value) {
            addCriterion("FD_ARCHIVES_AR <", value, "fdArchivesAr");
            return (Criteria) this;
        }

        public Criteria andFdArchivesArLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AR <=", value, "fdArchivesAr");
            return (Criteria) this;
        }

        public Criteria andFdArchivesArLike(String value) {
            addCriterion("FD_ARCHIVES_AR like", value, "fdArchivesAr");
            return (Criteria) this;
        }

        public Criteria andFdArchivesArNotLike(String value) {
            addCriterion("FD_ARCHIVES_AR not like", value, "fdArchivesAr");
            return (Criteria) this;
        }

        public Criteria andFdArchivesArIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AR in", values, "fdArchivesAr");
            return (Criteria) this;
        }

        public Criteria andFdArchivesArNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AR not in", values, "fdArchivesAr");
            return (Criteria) this;
        }

        public Criteria andFdArchivesArBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AR between", value1, value2, "fdArchivesAr");
            return (Criteria) this;
        }

        public Criteria andFdArchivesArNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AR not between", value1, value2, "fdArchivesAr");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAsIsNull() {
            addCriterion("FD_ARCHIVES_AS is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAsIsNotNull() {
            addCriterion("FD_ARCHIVES_AS is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAsEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AS =", value, "fdArchivesAs");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAsNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AS <>", value, "fdArchivesAs");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAsGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AS >", value, "fdArchivesAs");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAsGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AS >=", value, "fdArchivesAs");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAsLessThan(String value) {
            addCriterion("FD_ARCHIVES_AS <", value, "fdArchivesAs");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAsLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AS <=", value, "fdArchivesAs");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAsLike(String value) {
            addCriterion("FD_ARCHIVES_AS like", value, "fdArchivesAs");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAsNotLike(String value) {
            addCriterion("FD_ARCHIVES_AS not like", value, "fdArchivesAs");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAsIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AS in", values, "fdArchivesAs");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAsNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AS not in", values, "fdArchivesAs");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAsBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AS between", value1, value2, "fdArchivesAs");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAsNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AS not between", value1, value2, "fdArchivesAs");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAtIsNull() {
            addCriterion("FD_ARCHIVES_AT is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAtIsNotNull() {
            addCriterion("FD_ARCHIVES_AT is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAtEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AT =", value, "fdArchivesAt");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAtNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AT <>", value, "fdArchivesAt");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAtGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AT >", value, "fdArchivesAt");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAtGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AT >=", value, "fdArchivesAt");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAtLessThan(String value) {
            addCriterion("FD_ARCHIVES_AT <", value, "fdArchivesAt");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAtLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AT <=", value, "fdArchivesAt");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAtLike(String value) {
            addCriterion("FD_ARCHIVES_AT like", value, "fdArchivesAt");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAtNotLike(String value) {
            addCriterion("FD_ARCHIVES_AT not like", value, "fdArchivesAt");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAtIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AT in", values, "fdArchivesAt");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAtNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AT not in", values, "fdArchivesAt");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAtBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AT between", value1, value2, "fdArchivesAt");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAtNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AT not between", value1, value2, "fdArchivesAt");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAuIsNull() {
            addCriterion("FD_ARCHIVES_AU is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAuIsNotNull() {
            addCriterion("FD_ARCHIVES_AU is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAuEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AU =", value, "fdArchivesAu");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAuNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AU <>", value, "fdArchivesAu");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAuGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AU >", value, "fdArchivesAu");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAuGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AU >=", value, "fdArchivesAu");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAuLessThan(String value) {
            addCriterion("FD_ARCHIVES_AU <", value, "fdArchivesAu");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAuLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AU <=", value, "fdArchivesAu");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAuLike(String value) {
            addCriterion("FD_ARCHIVES_AU like", value, "fdArchivesAu");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAuNotLike(String value) {
            addCriterion("FD_ARCHIVES_AU not like", value, "fdArchivesAu");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAuIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AU in", values, "fdArchivesAu");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAuNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AU not in", values, "fdArchivesAu");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAuBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AU between", value1, value2, "fdArchivesAu");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAuNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AU not between", value1, value2, "fdArchivesAu");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAvIsNull() {
            addCriterion("FD_ARCHIVES_AV is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAvIsNotNull() {
            addCriterion("FD_ARCHIVES_AV is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAvEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AV =", value, "fdArchivesAv");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAvNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AV <>", value, "fdArchivesAv");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAvGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AV >", value, "fdArchivesAv");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAvGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AV >=", value, "fdArchivesAv");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAvLessThan(String value) {
            addCriterion("FD_ARCHIVES_AV <", value, "fdArchivesAv");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAvLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AV <=", value, "fdArchivesAv");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAvLike(String value) {
            addCriterion("FD_ARCHIVES_AV like", value, "fdArchivesAv");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAvNotLike(String value) {
            addCriterion("FD_ARCHIVES_AV not like", value, "fdArchivesAv");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAvIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AV in", values, "fdArchivesAv");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAvNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AV not in", values, "fdArchivesAv");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAvBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AV between", value1, value2, "fdArchivesAv");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAvNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AV not between", value1, value2, "fdArchivesAv");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAwIsNull() {
            addCriterion("FD_ARCHIVES_AW is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAwIsNotNull() {
            addCriterion("FD_ARCHIVES_AW is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAwEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AW =", value, "fdArchivesAw");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAwNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AW <>", value, "fdArchivesAw");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAwGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AW >", value, "fdArchivesAw");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAwGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AW >=", value, "fdArchivesAw");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAwLessThan(String value) {
            addCriterion("FD_ARCHIVES_AW <", value, "fdArchivesAw");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAwLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AW <=", value, "fdArchivesAw");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAwLike(String value) {
            addCriterion("FD_ARCHIVES_AW like", value, "fdArchivesAw");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAwNotLike(String value) {
            addCriterion("FD_ARCHIVES_AW not like", value, "fdArchivesAw");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAwIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AW in", values, "fdArchivesAw");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAwNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AW not in", values, "fdArchivesAw");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAwBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AW between", value1, value2, "fdArchivesAw");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAwNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AW not between", value1, value2, "fdArchivesAw");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAxIsNull() {
            addCriterion("FD_ARCHIVES_AX is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAxIsNotNull() {
            addCriterion("FD_ARCHIVES_AX is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAxEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AX =", value, "fdArchivesAx");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAxNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AX <>", value, "fdArchivesAx");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAxGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AX >", value, "fdArchivesAx");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAxGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AX >=", value, "fdArchivesAx");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAxLessThan(String value) {
            addCriterion("FD_ARCHIVES_AX <", value, "fdArchivesAx");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAxLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AX <=", value, "fdArchivesAx");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAxLike(String value) {
            addCriterion("FD_ARCHIVES_AX like", value, "fdArchivesAx");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAxNotLike(String value) {
            addCriterion("FD_ARCHIVES_AX not like", value, "fdArchivesAx");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAxIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AX in", values, "fdArchivesAx");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAxNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AX not in", values, "fdArchivesAx");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAxBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AX between", value1, value2, "fdArchivesAx");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAxNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AX not between", value1, value2, "fdArchivesAx");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAyIsNull() {
            addCriterion("FD_ARCHIVES_AY is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAyIsNotNull() {
            addCriterion("FD_ARCHIVES_AY is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAyEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AY =", value, "fdArchivesAy");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAyNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AY <>", value, "fdArchivesAy");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAyGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AY >", value, "fdArchivesAy");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAyGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AY >=", value, "fdArchivesAy");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAyLessThan(String value) {
            addCriterion("FD_ARCHIVES_AY <", value, "fdArchivesAy");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAyLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AY <=", value, "fdArchivesAy");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAyLike(String value) {
            addCriterion("FD_ARCHIVES_AY like", value, "fdArchivesAy");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAyNotLike(String value) {
            addCriterion("FD_ARCHIVES_AY not like", value, "fdArchivesAy");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAyIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AY in", values, "fdArchivesAy");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAyNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AY not in", values, "fdArchivesAy");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAyBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AY between", value1, value2, "fdArchivesAy");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAyNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AY not between", value1, value2, "fdArchivesAy");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAzIsNull() {
            addCriterion("FD_ARCHIVES_AZ is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAzIsNotNull() {
            addCriterion("FD_ARCHIVES_AZ is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAzEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AZ =", value, "fdArchivesAz");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAzNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AZ <>", value, "fdArchivesAz");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAzGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_AZ >", value, "fdArchivesAz");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAzGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AZ >=", value, "fdArchivesAz");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAzLessThan(String value) {
            addCriterion("FD_ARCHIVES_AZ <", value, "fdArchivesAz");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAzLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_AZ <=", value, "fdArchivesAz");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAzLike(String value) {
            addCriterion("FD_ARCHIVES_AZ like", value, "fdArchivesAz");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAzNotLike(String value) {
            addCriterion("FD_ARCHIVES_AZ not like", value, "fdArchivesAz");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAzIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AZ in", values, "fdArchivesAz");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAzNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_AZ not in", values, "fdArchivesAz");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAzBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AZ between", value1, value2, "fdArchivesAz");
            return (Criteria) this;
        }

        public Criteria andFdArchivesAzNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_AZ not between", value1, value2, "fdArchivesAz");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBaIsNull() {
            addCriterion("FD_ARCHIVES_BA is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBaIsNotNull() {
            addCriterion("FD_ARCHIVES_BA is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBaEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BA =", value, "fdArchivesBa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBaNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BA <>", value, "fdArchivesBa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBaGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_BA >", value, "fdArchivesBa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBaGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BA >=", value, "fdArchivesBa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBaLessThan(String value) {
            addCriterion("FD_ARCHIVES_BA <", value, "fdArchivesBa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBaLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BA <=", value, "fdArchivesBa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBaLike(String value) {
            addCriterion("FD_ARCHIVES_BA like", value, "fdArchivesBa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBaNotLike(String value) {
            addCriterion("FD_ARCHIVES_BA not like", value, "fdArchivesBa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBaIn(List<String> values) {
            addCriterion("FD_ARCHIVES_BA in", values, "fdArchivesBa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBaNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_BA not in", values, "fdArchivesBa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBaBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_BA between", value1, value2, "fdArchivesBa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBaNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_BA not between", value1, value2, "fdArchivesBa");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBbIsNull() {
            addCriterion("FD_ARCHIVES_BB is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBbIsNotNull() {
            addCriterion("FD_ARCHIVES_BB is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBbEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BB =", value, "fdArchivesBb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBbNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BB <>", value, "fdArchivesBb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBbGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_BB >", value, "fdArchivesBb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBbGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BB >=", value, "fdArchivesBb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBbLessThan(String value) {
            addCriterion("FD_ARCHIVES_BB <", value, "fdArchivesBb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBbLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BB <=", value, "fdArchivesBb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBbLike(String value) {
            addCriterion("FD_ARCHIVES_BB like", value, "fdArchivesBb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBbNotLike(String value) {
            addCriterion("FD_ARCHIVES_BB not like", value, "fdArchivesBb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBbIn(List<String> values) {
            addCriterion("FD_ARCHIVES_BB in", values, "fdArchivesBb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBbNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_BB not in", values, "fdArchivesBb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBbBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_BB between", value1, value2, "fdArchivesBb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBbNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_BB not between", value1, value2, "fdArchivesBb");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBcIsNull() {
            addCriterion("FD_ARCHIVES_BC is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBcIsNotNull() {
            addCriterion("FD_ARCHIVES_BC is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBcEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BC =", value, "fdArchivesBc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBcNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BC <>", value, "fdArchivesBc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBcGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_BC >", value, "fdArchivesBc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBcGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BC >=", value, "fdArchivesBc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBcLessThan(String value) {
            addCriterion("FD_ARCHIVES_BC <", value, "fdArchivesBc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBcLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BC <=", value, "fdArchivesBc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBcLike(String value) {
            addCriterion("FD_ARCHIVES_BC like", value, "fdArchivesBc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBcNotLike(String value) {
            addCriterion("FD_ARCHIVES_BC not like", value, "fdArchivesBc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBcIn(List<String> values) {
            addCriterion("FD_ARCHIVES_BC in", values, "fdArchivesBc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBcNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_BC not in", values, "fdArchivesBc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBcBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_BC between", value1, value2, "fdArchivesBc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBcNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_BC not between", value1, value2, "fdArchivesBc");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBdIsNull() {
            addCriterion("FD_ARCHIVES_BD is null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBdIsNotNull() {
            addCriterion("FD_ARCHIVES_BD is not null");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBdEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BD =", value, "fdArchivesBd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBdNotEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BD <>", value, "fdArchivesBd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBdGreaterThan(String value) {
            addCriterion("FD_ARCHIVES_BD >", value, "fdArchivesBd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BD >=", value, "fdArchivesBd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBdLessThan(String value) {
            addCriterion("FD_ARCHIVES_BD <", value, "fdArchivesBd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBdLessThanOrEqualTo(String value) {
            addCriterion("FD_ARCHIVES_BD <=", value, "fdArchivesBd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBdLike(String value) {
            addCriterion("FD_ARCHIVES_BD like", value, "fdArchivesBd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBdNotLike(String value) {
            addCriterion("FD_ARCHIVES_BD not like", value, "fdArchivesBd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBdIn(List<String> values) {
            addCriterion("FD_ARCHIVES_BD in", values, "fdArchivesBd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBdNotIn(List<String> values) {
            addCriterion("FD_ARCHIVES_BD not in", values, "fdArchivesBd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBdBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_BD between", value1, value2, "fdArchivesBd");
            return (Criteria) this;
        }

        public Criteria andFdArchivesBdNotBetween(String value1, String value2) {
            addCriterion("FD_ARCHIVES_BD not between", value1, value2, "fdArchivesBd");
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