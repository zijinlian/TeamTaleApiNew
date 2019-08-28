package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TTraiCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTraiCourseExample() {
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

        public Criteria andCoursenameIsNull() {
            addCriterion("COURSENAME is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("COURSENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("COURSENAME =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("COURSENAME <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("COURSENAME >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("COURSENAME >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("COURSENAME <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("COURSENAME <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("COURSENAME like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("COURSENAME not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("COURSENAME in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("COURSENAME not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("COURSENAME between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("COURSENAME not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCourcecategoryIsNull() {
            addCriterion("COURCECATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCourcecategoryIsNotNull() {
            addCriterion("COURCECATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCourcecategoryEqualTo(String value) {
            addCriterion("COURCECATEGORY =", value, "courcecategory");
            return (Criteria) this;
        }

        public Criteria andCourcecategoryNotEqualTo(String value) {
            addCriterion("COURCECATEGORY <>", value, "courcecategory");
            return (Criteria) this;
        }

        public Criteria andCourcecategoryGreaterThan(String value) {
            addCriterion("COURCECATEGORY >", value, "courcecategory");
            return (Criteria) this;
        }

        public Criteria andCourcecategoryGreaterThanOrEqualTo(String value) {
            addCriterion("COURCECATEGORY >=", value, "courcecategory");
            return (Criteria) this;
        }

        public Criteria andCourcecategoryLessThan(String value) {
            addCriterion("COURCECATEGORY <", value, "courcecategory");
            return (Criteria) this;
        }

        public Criteria andCourcecategoryLessThanOrEqualTo(String value) {
            addCriterion("COURCECATEGORY <=", value, "courcecategory");
            return (Criteria) this;
        }

        public Criteria andCourcecategoryLike(String value) {
            addCriterion("COURCECATEGORY like", value, "courcecategory");
            return (Criteria) this;
        }

        public Criteria andCourcecategoryNotLike(String value) {
            addCriterion("COURCECATEGORY not like", value, "courcecategory");
            return (Criteria) this;
        }

        public Criteria andCourcecategoryIn(List<String> values) {
            addCriterion("COURCECATEGORY in", values, "courcecategory");
            return (Criteria) this;
        }

        public Criteria andCourcecategoryNotIn(List<String> values) {
            addCriterion("COURCECATEGORY not in", values, "courcecategory");
            return (Criteria) this;
        }

        public Criteria andCourcecategoryBetween(String value1, String value2) {
            addCriterion("COURCECATEGORY between", value1, value2, "courcecategory");
            return (Criteria) this;
        }

        public Criteria andCourcecategoryNotBetween(String value1, String value2) {
            addCriterion("COURCECATEGORY not between", value1, value2, "courcecategory");
            return (Criteria) this;
        }

        public Criteria andCourceintrodIsNull() {
            addCriterion("COURCEINTROD is null");
            return (Criteria) this;
        }

        public Criteria andCourceintrodIsNotNull() {
            addCriterion("COURCEINTROD is not null");
            return (Criteria) this;
        }

        public Criteria andCourceintrodEqualTo(String value) {
            addCriterion("COURCEINTROD =", value, "courceintrod");
            return (Criteria) this;
        }

        public Criteria andCourceintrodNotEqualTo(String value) {
            addCriterion("COURCEINTROD <>", value, "courceintrod");
            return (Criteria) this;
        }

        public Criteria andCourceintrodGreaterThan(String value) {
            addCriterion("COURCEINTROD >", value, "courceintrod");
            return (Criteria) this;
        }

        public Criteria andCourceintrodGreaterThanOrEqualTo(String value) {
            addCriterion("COURCEINTROD >=", value, "courceintrod");
            return (Criteria) this;
        }

        public Criteria andCourceintrodLessThan(String value) {
            addCriterion("COURCEINTROD <", value, "courceintrod");
            return (Criteria) this;
        }

        public Criteria andCourceintrodLessThanOrEqualTo(String value) {
            addCriterion("COURCEINTROD <=", value, "courceintrod");
            return (Criteria) this;
        }

        public Criteria andCourceintrodLike(String value) {
            addCriterion("COURCEINTROD like", value, "courceintrod");
            return (Criteria) this;
        }

        public Criteria andCourceintrodNotLike(String value) {
            addCriterion("COURCEINTROD not like", value, "courceintrod");
            return (Criteria) this;
        }

        public Criteria andCourceintrodIn(List<String> values) {
            addCriterion("COURCEINTROD in", values, "courceintrod");
            return (Criteria) this;
        }

        public Criteria andCourceintrodNotIn(List<String> values) {
            addCriterion("COURCEINTROD not in", values, "courceintrod");
            return (Criteria) this;
        }

        public Criteria andCourceintrodBetween(String value1, String value2) {
            addCriterion("COURCEINTROD between", value1, value2, "courceintrod");
            return (Criteria) this;
        }

        public Criteria andCourceintrodNotBetween(String value1, String value2) {
            addCriterion("COURCEINTROD not between", value1, value2, "courceintrod");
            return (Criteria) this;
        }

        public Criteria andCoursepicIsNull() {
            addCriterion("COURSEPIC is null");
            return (Criteria) this;
        }

        public Criteria andCoursepicIsNotNull() {
            addCriterion("COURSEPIC is not null");
            return (Criteria) this;
        }

        public Criteria andCoursepicEqualTo(String value) {
            addCriterion("COURSEPIC =", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicNotEqualTo(String value) {
            addCriterion("COURSEPIC <>", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicGreaterThan(String value) {
            addCriterion("COURSEPIC >", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicGreaterThanOrEqualTo(String value) {
            addCriterion("COURSEPIC >=", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicLessThan(String value) {
            addCriterion("COURSEPIC <", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicLessThanOrEqualTo(String value) {
            addCriterion("COURSEPIC <=", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicLike(String value) {
            addCriterion("COURSEPIC like", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicNotLike(String value) {
            addCriterion("COURSEPIC not like", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicIn(List<String> values) {
            addCriterion("COURSEPIC in", values, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicNotIn(List<String> values) {
            addCriterion("COURSEPIC not in", values, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicBetween(String value1, String value2) {
            addCriterion("COURSEPIC between", value1, value2, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicNotBetween(String value1, String value2) {
            addCriterion("COURSEPIC not between", value1, value2, "coursepic");
            return (Criteria) this;
        }

        public Criteria andTeacherintrodIsNull() {
            addCriterion("TEACHERINTROD is null");
            return (Criteria) this;
        }

        public Criteria andTeacherintrodIsNotNull() {
            addCriterion("TEACHERINTROD is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherintrodEqualTo(String value) {
            addCriterion("TEACHERINTROD =", value, "teacherintrod");
            return (Criteria) this;
        }

        public Criteria andTeacherintrodNotEqualTo(String value) {
            addCriterion("TEACHERINTROD <>", value, "teacherintrod");
            return (Criteria) this;
        }

        public Criteria andTeacherintrodGreaterThan(String value) {
            addCriterion("TEACHERINTROD >", value, "teacherintrod");
            return (Criteria) this;
        }

        public Criteria andTeacherintrodGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHERINTROD >=", value, "teacherintrod");
            return (Criteria) this;
        }

        public Criteria andTeacherintrodLessThan(String value) {
            addCriterion("TEACHERINTROD <", value, "teacherintrod");
            return (Criteria) this;
        }

        public Criteria andTeacherintrodLessThanOrEqualTo(String value) {
            addCriterion("TEACHERINTROD <=", value, "teacherintrod");
            return (Criteria) this;
        }

        public Criteria andTeacherintrodLike(String value) {
            addCriterion("TEACHERINTROD like", value, "teacherintrod");
            return (Criteria) this;
        }

        public Criteria andTeacherintrodNotLike(String value) {
            addCriterion("TEACHERINTROD not like", value, "teacherintrod");
            return (Criteria) this;
        }

        public Criteria andTeacherintrodIn(List<String> values) {
            addCriterion("TEACHERINTROD in", values, "teacherintrod");
            return (Criteria) this;
        }

        public Criteria andTeacherintrodNotIn(List<String> values) {
            addCriterion("TEACHERINTROD not in", values, "teacherintrod");
            return (Criteria) this;
        }

        public Criteria andTeacherintrodBetween(String value1, String value2) {
            addCriterion("TEACHERINTROD between", value1, value2, "teacherintrod");
            return (Criteria) this;
        }

        public Criteria andTeacherintrodNotBetween(String value1, String value2) {
            addCriterion("TEACHERINTROD not between", value1, value2, "teacherintrod");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("PUBLISHER is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("PUBLISHER is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("PUBLISHER =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("PUBLISHER <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("PUBLISHER >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLISHER >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("PUBLISHER <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("PUBLISHER <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("PUBLISHER like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("PUBLISHER not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("PUBLISHER in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("PUBLISHER not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("PUBLISHER between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("PUBLISHER not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andUnitcoceIsNull() {
            addCriterion("UNITCOCE is null");
            return (Criteria) this;
        }

        public Criteria andUnitcoceIsNotNull() {
            addCriterion("UNITCOCE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcoceEqualTo(String value) {
            addCriterion("UNITCOCE =", value, "unitcoce");
            return (Criteria) this;
        }

        public Criteria andUnitcoceNotEqualTo(String value) {
            addCriterion("UNITCOCE <>", value, "unitcoce");
            return (Criteria) this;
        }

        public Criteria andUnitcoceGreaterThan(String value) {
            addCriterion("UNITCOCE >", value, "unitcoce");
            return (Criteria) this;
        }

        public Criteria andUnitcoceGreaterThanOrEqualTo(String value) {
            addCriterion("UNITCOCE >=", value, "unitcoce");
            return (Criteria) this;
        }

        public Criteria andUnitcoceLessThan(String value) {
            addCriterion("UNITCOCE <", value, "unitcoce");
            return (Criteria) this;
        }

        public Criteria andUnitcoceLessThanOrEqualTo(String value) {
            addCriterion("UNITCOCE <=", value, "unitcoce");
            return (Criteria) this;
        }

        public Criteria andUnitcoceLike(String value) {
            addCriterion("UNITCOCE like", value, "unitcoce");
            return (Criteria) this;
        }

        public Criteria andUnitcoceNotLike(String value) {
            addCriterion("UNITCOCE not like", value, "unitcoce");
            return (Criteria) this;
        }

        public Criteria andUnitcoceIn(List<String> values) {
            addCriterion("UNITCOCE in", values, "unitcoce");
            return (Criteria) this;
        }

        public Criteria andUnitcoceNotIn(List<String> values) {
            addCriterion("UNITCOCE not in", values, "unitcoce");
            return (Criteria) this;
        }

        public Criteria andUnitcoceBetween(String value1, String value2) {
            addCriterion("UNITCOCE between", value1, value2, "unitcoce");
            return (Criteria) this;
        }

        public Criteria andUnitcoceNotBetween(String value1, String value2) {
            addCriterion("UNITCOCE not between", value1, value2, "unitcoce");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeIsNull() {
            addCriterion("PASSTIME is null");
            return (Criteria) this;
        }

        public Criteria andPasstimeIsNotNull() {
            addCriterion("PASSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPasstimeEqualTo(String value) {
            addCriterion("PASSTIME =", value, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeNotEqualTo(String value) {
            addCriterion("PASSTIME <>", value, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeGreaterThan(String value) {
            addCriterion("PASSTIME >", value, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeGreaterThanOrEqualTo(String value) {
            addCriterion("PASSTIME >=", value, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeLessThan(String value) {
            addCriterion("PASSTIME <", value, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeLessThanOrEqualTo(String value) {
            addCriterion("PASSTIME <=", value, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeLike(String value) {
            addCriterion("PASSTIME like", value, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeNotLike(String value) {
            addCriterion("PASSTIME not like", value, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeIn(List<String> values) {
            addCriterion("PASSTIME in", values, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeNotIn(List<String> values) {
            addCriterion("PASSTIME not in", values, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeBetween(String value1, String value2) {
            addCriterion("PASSTIME between", value1, value2, "passtime");
            return (Criteria) this;
        }

        public Criteria andPasstimeNotBetween(String value1, String value2) {
            addCriterion("PASSTIME not between", value1, value2, "passtime");
            return (Criteria) this;
        }

        public Criteria andCoursestatusIsNull() {
            addCriterion("COURSESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCoursestatusIsNotNull() {
            addCriterion("COURSESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCoursestatusEqualTo(String value) {
            addCriterion("COURSESTATUS =", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotEqualTo(String value) {
            addCriterion("COURSESTATUS <>", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusGreaterThan(String value) {
            addCriterion("COURSESTATUS >", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusGreaterThanOrEqualTo(String value) {
            addCriterion("COURSESTATUS >=", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusLessThan(String value) {
            addCriterion("COURSESTATUS <", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusLessThanOrEqualTo(String value) {
            addCriterion("COURSESTATUS <=", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusLike(String value) {
            addCriterion("COURSESTATUS like", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotLike(String value) {
            addCriterion("COURSESTATUS not like", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusIn(List<String> values) {
            addCriterion("COURSESTATUS in", values, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotIn(List<String> values) {
            addCriterion("COURSESTATUS not in", values, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusBetween(String value1, String value2) {
            addCriterion("COURSESTATUS between", value1, value2, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotBetween(String value1, String value2) {
            addCriterion("COURSESTATUS not between", value1, value2, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusIsNull() {
            addCriterion("APPROVESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andApprovestatusIsNotNull() {
            addCriterion("APPROVESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andApprovestatusEqualTo(String value) {
            addCriterion("APPROVESTATUS =", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusNotEqualTo(String value) {
            addCriterion("APPROVESTATUS <>", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusGreaterThan(String value) {
            addCriterion("APPROVESTATUS >", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVESTATUS >=", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusLessThan(String value) {
            addCriterion("APPROVESTATUS <", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusLessThanOrEqualTo(String value) {
            addCriterion("APPROVESTATUS <=", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusLike(String value) {
            addCriterion("APPROVESTATUS like", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusNotLike(String value) {
            addCriterion("APPROVESTATUS not like", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusIn(List<String> values) {
            addCriterion("APPROVESTATUS in", values, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusNotIn(List<String> values) {
            addCriterion("APPROVESTATUS not in", values, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusBetween(String value1, String value2) {
            addCriterion("APPROVESTATUS between", value1, value2, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusNotBetween(String value1, String value2) {
            addCriterion("APPROVESTATUS not between", value1, value2, "approvestatus");
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

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andApproveidIsNull() {
            addCriterion("APPROVEID is null");
            return (Criteria) this;
        }

        public Criteria andApproveidIsNotNull() {
            addCriterion("APPROVEID is not null");
            return (Criteria) this;
        }

        public Criteria andApproveidEqualTo(String value) {
            addCriterion("APPROVEID =", value, "approveid");
            return (Criteria) this;
        }

        public Criteria andApproveidNotEqualTo(String value) {
            addCriterion("APPROVEID <>", value, "approveid");
            return (Criteria) this;
        }

        public Criteria andApproveidGreaterThan(String value) {
            addCriterion("APPROVEID >", value, "approveid");
            return (Criteria) this;
        }

        public Criteria andApproveidGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVEID >=", value, "approveid");
            return (Criteria) this;
        }

        public Criteria andApproveidLessThan(String value) {
            addCriterion("APPROVEID <", value, "approveid");
            return (Criteria) this;
        }

        public Criteria andApproveidLessThanOrEqualTo(String value) {
            addCriterion("APPROVEID <=", value, "approveid");
            return (Criteria) this;
        }

        public Criteria andApproveidLike(String value) {
            addCriterion("APPROVEID like", value, "approveid");
            return (Criteria) this;
        }

        public Criteria andApproveidNotLike(String value) {
            addCriterion("APPROVEID not like", value, "approveid");
            return (Criteria) this;
        }

        public Criteria andApproveidIn(List<String> values) {
            addCriterion("APPROVEID in", values, "approveid");
            return (Criteria) this;
        }

        public Criteria andApproveidNotIn(List<String> values) {
            addCriterion("APPROVEID not in", values, "approveid");
            return (Criteria) this;
        }

        public Criteria andApproveidBetween(String value1, String value2) {
            addCriterion("APPROVEID between", value1, value2, "approveid");
            return (Criteria) this;
        }

        public Criteria andApproveidNotBetween(String value1, String value2) {
            addCriterion("APPROVEID not between", value1, value2, "approveid");
            return (Criteria) this;
        }

        public Criteria andApprovenameIsNull() {
            addCriterion("APPROVENAME is null");
            return (Criteria) this;
        }

        public Criteria andApprovenameIsNotNull() {
            addCriterion("APPROVENAME is not null");
            return (Criteria) this;
        }

        public Criteria andApprovenameEqualTo(String value) {
            addCriterion("APPROVENAME =", value, "approvename");
            return (Criteria) this;
        }

        public Criteria andApprovenameNotEqualTo(String value) {
            addCriterion("APPROVENAME <>", value, "approvename");
            return (Criteria) this;
        }

        public Criteria andApprovenameGreaterThan(String value) {
            addCriterion("APPROVENAME >", value, "approvename");
            return (Criteria) this;
        }

        public Criteria andApprovenameGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVENAME >=", value, "approvename");
            return (Criteria) this;
        }

        public Criteria andApprovenameLessThan(String value) {
            addCriterion("APPROVENAME <", value, "approvename");
            return (Criteria) this;
        }

        public Criteria andApprovenameLessThanOrEqualTo(String value) {
            addCriterion("APPROVENAME <=", value, "approvename");
            return (Criteria) this;
        }

        public Criteria andApprovenameLike(String value) {
            addCriterion("APPROVENAME like", value, "approvename");
            return (Criteria) this;
        }

        public Criteria andApprovenameNotLike(String value) {
            addCriterion("APPROVENAME not like", value, "approvename");
            return (Criteria) this;
        }

        public Criteria andApprovenameIn(List<String> values) {
            addCriterion("APPROVENAME in", values, "approvename");
            return (Criteria) this;
        }

        public Criteria andApprovenameNotIn(List<String> values) {
            addCriterion("APPROVENAME not in", values, "approvename");
            return (Criteria) this;
        }

        public Criteria andApprovenameBetween(String value1, String value2) {
            addCriterion("APPROVENAME between", value1, value2, "approvename");
            return (Criteria) this;
        }

        public Criteria andApprovenameNotBetween(String value1, String value2) {
            addCriterion("APPROVENAME not between", value1, value2, "approvename");
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

        public Criteria andCoursetypeIsNull() {
            addCriterion("COURSETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNotNull() {
            addCriterion("COURSETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeEqualTo(String value) {
            addCriterion("COURSETYPE =", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotEqualTo(String value) {
            addCriterion("COURSETYPE <>", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThan(String value) {
            addCriterion("COURSETYPE >", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThanOrEqualTo(String value) {
            addCriterion("COURSETYPE >=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThan(String value) {
            addCriterion("COURSETYPE <", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThanOrEqualTo(String value) {
            addCriterion("COURSETYPE <=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLike(String value) {
            addCriterion("COURSETYPE like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotLike(String value) {
            addCriterion("COURSETYPE not like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIn(List<String> values) {
            addCriterion("COURSETYPE in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotIn(List<String> values) {
            addCriterion("COURSETYPE not in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeBetween(String value1, String value2) {
            addCriterion("COURSETYPE between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotBetween(String value1, String value2) {
            addCriterion("COURSETYPE not between", value1, value2, "coursetype");
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