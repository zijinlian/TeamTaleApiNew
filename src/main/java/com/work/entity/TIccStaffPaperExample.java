package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TIccStaffPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TIccStaffPaperExample() {
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

        public Criteria andFdStaffIdIsNull() {
            addCriterion("FD_STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdIsNotNull() {
            addCriterion("FD_STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdEqualTo(String value) {
            addCriterion("FD_STAFF_ID =", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdNotEqualTo(String value) {
            addCriterion("FD_STAFF_ID <>", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdGreaterThan(String value) {
            addCriterion("FD_STAFF_ID >", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_STAFF_ID >=", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdLessThan(String value) {
            addCriterion("FD_STAFF_ID <", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdLessThanOrEqualTo(String value) {
            addCriterion("FD_STAFF_ID <=", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdLike(String value) {
            addCriterion("FD_STAFF_ID like", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdNotLike(String value) {
            addCriterion("FD_STAFF_ID not like", value, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdIn(List<String> values) {
            addCriterion("FD_STAFF_ID in", values, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdNotIn(List<String> values) {
            addCriterion("FD_STAFF_ID not in", values, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdBetween(String value1, String value2) {
            addCriterion("FD_STAFF_ID between", value1, value2, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdStaffIdNotBetween(String value1, String value2) {
            addCriterion("FD_STAFF_ID not between", value1, value2, "fdStaffId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdIsNull() {
            addCriterion("FD_PAPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdIsNotNull() {
            addCriterion("FD_PAPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdEqualTo(String value) {
            addCriterion("FD_PAPER_ID =", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdNotEqualTo(String value) {
            addCriterion("FD_PAPER_ID <>", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdGreaterThan(String value) {
            addCriterion("FD_PAPER_ID >", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_PAPER_ID >=", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdLessThan(String value) {
            addCriterion("FD_PAPER_ID <", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdLessThanOrEqualTo(String value) {
            addCriterion("FD_PAPER_ID <=", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdLike(String value) {
            addCriterion("FD_PAPER_ID like", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdNotLike(String value) {
            addCriterion("FD_PAPER_ID not like", value, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdIn(List<String> values) {
            addCriterion("FD_PAPER_ID in", values, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdNotIn(List<String> values) {
            addCriterion("FD_PAPER_ID not in", values, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdBetween(String value1, String value2) {
            addCriterion("FD_PAPER_ID between", value1, value2, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdPaperIdNotBetween(String value1, String value2) {
            addCriterion("FD_PAPER_ID not between", value1, value2, "fdPaperId");
            return (Criteria) this;
        }

        public Criteria andFdProblemIdIsNull() {
            addCriterion("FD_PROBLEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdProblemIdIsNotNull() {
            addCriterion("FD_PROBLEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdProblemIdEqualTo(String value) {
            addCriterion("FD_PROBLEM_ID =", value, "fdProblemId");
            return (Criteria) this;
        }

        public Criteria andFdProblemIdNotEqualTo(String value) {
            addCriterion("FD_PROBLEM_ID <>", value, "fdProblemId");
            return (Criteria) this;
        }

        public Criteria andFdProblemIdGreaterThan(String value) {
            addCriterion("FD_PROBLEM_ID >", value, "fdProblemId");
            return (Criteria) this;
        }

        public Criteria andFdProblemIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_PROBLEM_ID >=", value, "fdProblemId");
            return (Criteria) this;
        }

        public Criteria andFdProblemIdLessThan(String value) {
            addCriterion("FD_PROBLEM_ID <", value, "fdProblemId");
            return (Criteria) this;
        }

        public Criteria andFdProblemIdLessThanOrEqualTo(String value) {
            addCriterion("FD_PROBLEM_ID <=", value, "fdProblemId");
            return (Criteria) this;
        }

        public Criteria andFdProblemIdLike(String value) {
            addCriterion("FD_PROBLEM_ID like", value, "fdProblemId");
            return (Criteria) this;
        }

        public Criteria andFdProblemIdNotLike(String value) {
            addCriterion("FD_PROBLEM_ID not like", value, "fdProblemId");
            return (Criteria) this;
        }

        public Criteria andFdProblemIdIn(List<String> values) {
            addCriterion("FD_PROBLEM_ID in", values, "fdProblemId");
            return (Criteria) this;
        }

        public Criteria andFdProblemIdNotIn(List<String> values) {
            addCriterion("FD_PROBLEM_ID not in", values, "fdProblemId");
            return (Criteria) this;
        }

        public Criteria andFdProblemIdBetween(String value1, String value2) {
            addCriterion("FD_PROBLEM_ID between", value1, value2, "fdProblemId");
            return (Criteria) this;
        }

        public Criteria andFdProblemIdNotBetween(String value1, String value2) {
            addCriterion("FD_PROBLEM_ID not between", value1, value2, "fdProblemId");
            return (Criteria) this;
        }

        public Criteria andFdStaffPaperDateIsNull() {
            addCriterion("FD_STAFF_PAPER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFdStaffPaperDateIsNotNull() {
            addCriterion("FD_STAFF_PAPER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdStaffPaperDateEqualTo(String value) {
            addCriterion("FD_STAFF_PAPER_DATE =", value, "fdStaffPaperDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffPaperDateNotEqualTo(String value) {
            addCriterion("FD_STAFF_PAPER_DATE <>", value, "fdStaffPaperDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffPaperDateGreaterThan(String value) {
            addCriterion("FD_STAFF_PAPER_DATE >", value, "fdStaffPaperDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffPaperDateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_STAFF_PAPER_DATE >=", value, "fdStaffPaperDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffPaperDateLessThan(String value) {
            addCriterion("FD_STAFF_PAPER_DATE <", value, "fdStaffPaperDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffPaperDateLessThanOrEqualTo(String value) {
            addCriterion("FD_STAFF_PAPER_DATE <=", value, "fdStaffPaperDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffPaperDateLike(String value) {
            addCriterion("FD_STAFF_PAPER_DATE like", value, "fdStaffPaperDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffPaperDateNotLike(String value) {
            addCriterion("FD_STAFF_PAPER_DATE not like", value, "fdStaffPaperDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffPaperDateIn(List<String> values) {
            addCriterion("FD_STAFF_PAPER_DATE in", values, "fdStaffPaperDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffPaperDateNotIn(List<String> values) {
            addCriterion("FD_STAFF_PAPER_DATE not in", values, "fdStaffPaperDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffPaperDateBetween(String value1, String value2) {
            addCriterion("FD_STAFF_PAPER_DATE between", value1, value2, "fdStaffPaperDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffPaperDateNotBetween(String value1, String value2) {
            addCriterion("FD_STAFF_PAPER_DATE not between", value1, value2, "fdStaffPaperDate");
            return (Criteria) this;
        }

        public Criteria andFdStaffAnswerIsNull() {
            addCriterion("FD_STAFF_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andFdStaffAnswerIsNotNull() {
            addCriterion("FD_STAFF_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andFdStaffAnswerEqualTo(String value) {
            addCriterion("FD_STAFF_ANSWER =", value, "fdStaffAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffAnswerNotEqualTo(String value) {
            addCriterion("FD_STAFF_ANSWER <>", value, "fdStaffAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffAnswerGreaterThan(String value) {
            addCriterion("FD_STAFF_ANSWER >", value, "fdStaffAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("FD_STAFF_ANSWER >=", value, "fdStaffAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffAnswerLessThan(String value) {
            addCriterion("FD_STAFF_ANSWER <", value, "fdStaffAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffAnswerLessThanOrEqualTo(String value) {
            addCriterion("FD_STAFF_ANSWER <=", value, "fdStaffAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffAnswerLike(String value) {
            addCriterion("FD_STAFF_ANSWER like", value, "fdStaffAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffAnswerNotLike(String value) {
            addCriterion("FD_STAFF_ANSWER not like", value, "fdStaffAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffAnswerIn(List<String> values) {
            addCriterion("FD_STAFF_ANSWER in", values, "fdStaffAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffAnswerNotIn(List<String> values) {
            addCriterion("FD_STAFF_ANSWER not in", values, "fdStaffAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffAnswerBetween(String value1, String value2) {
            addCriterion("FD_STAFF_ANSWER between", value1, value2, "fdStaffAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffAnswerNotBetween(String value1, String value2) {
            addCriterion("FD_STAFF_ANSWER not between", value1, value2, "fdStaffAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffRightAnswerIsNull() {
            addCriterion("FD_STAFF_RIGHT_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andFdStaffRightAnswerIsNotNull() {
            addCriterion("FD_STAFF_RIGHT_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andFdStaffRightAnswerEqualTo(String value) {
            addCriterion("FD_STAFF_RIGHT_ANSWER =", value, "fdStaffRightAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffRightAnswerNotEqualTo(String value) {
            addCriterion("FD_STAFF_RIGHT_ANSWER <>", value, "fdStaffRightAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffRightAnswerGreaterThan(String value) {
            addCriterion("FD_STAFF_RIGHT_ANSWER >", value, "fdStaffRightAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffRightAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("FD_STAFF_RIGHT_ANSWER >=", value, "fdStaffRightAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffRightAnswerLessThan(String value) {
            addCriterion("FD_STAFF_RIGHT_ANSWER <", value, "fdStaffRightAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffRightAnswerLessThanOrEqualTo(String value) {
            addCriterion("FD_STAFF_RIGHT_ANSWER <=", value, "fdStaffRightAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffRightAnswerLike(String value) {
            addCriterion("FD_STAFF_RIGHT_ANSWER like", value, "fdStaffRightAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffRightAnswerNotLike(String value) {
            addCriterion("FD_STAFF_RIGHT_ANSWER not like", value, "fdStaffRightAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffRightAnswerIn(List<String> values) {
            addCriterion("FD_STAFF_RIGHT_ANSWER in", values, "fdStaffRightAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffRightAnswerNotIn(List<String> values) {
            addCriterion("FD_STAFF_RIGHT_ANSWER not in", values, "fdStaffRightAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffRightAnswerBetween(String value1, String value2) {
            addCriterion("FD_STAFF_RIGHT_ANSWER between", value1, value2, "fdStaffRightAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStaffRightAnswerNotBetween(String value1, String value2) {
            addCriterion("FD_STAFF_RIGHT_ANSWER not between", value1, value2, "fdStaffRightAnswer");
            return (Criteria) this;
        }

        public Criteria andFdStafffScoreIsNull() {
            addCriterion("FD_STAFFF_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andFdStafffScoreIsNotNull() {
            addCriterion("FD_STAFFF_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andFdStafffScoreEqualTo(String value) {
            addCriterion("FD_STAFFF_SCORE =", value, "fdStafffScore");
            return (Criteria) this;
        }

        public Criteria andFdStafffScoreNotEqualTo(String value) {
            addCriterion("FD_STAFFF_SCORE <>", value, "fdStafffScore");
            return (Criteria) this;
        }

        public Criteria andFdStafffScoreGreaterThan(String value) {
            addCriterion("FD_STAFFF_SCORE >", value, "fdStafffScore");
            return (Criteria) this;
        }

        public Criteria andFdStafffScoreGreaterThanOrEqualTo(String value) {
            addCriterion("FD_STAFFF_SCORE >=", value, "fdStafffScore");
            return (Criteria) this;
        }

        public Criteria andFdStafffScoreLessThan(String value) {
            addCriterion("FD_STAFFF_SCORE <", value, "fdStafffScore");
            return (Criteria) this;
        }

        public Criteria andFdStafffScoreLessThanOrEqualTo(String value) {
            addCriterion("FD_STAFFF_SCORE <=", value, "fdStafffScore");
            return (Criteria) this;
        }

        public Criteria andFdStafffScoreLike(String value) {
            addCriterion("FD_STAFFF_SCORE like", value, "fdStafffScore");
            return (Criteria) this;
        }

        public Criteria andFdStafffScoreNotLike(String value) {
            addCriterion("FD_STAFFF_SCORE not like", value, "fdStafffScore");
            return (Criteria) this;
        }

        public Criteria andFdStafffScoreIn(List<String> values) {
            addCriterion("FD_STAFFF_SCORE in", values, "fdStafffScore");
            return (Criteria) this;
        }

        public Criteria andFdStafffScoreNotIn(List<String> values) {
            addCriterion("FD_STAFFF_SCORE not in", values, "fdStafffScore");
            return (Criteria) this;
        }

        public Criteria andFdStafffScoreBetween(String value1, String value2) {
            addCriterion("FD_STAFFF_SCORE between", value1, value2, "fdStafffScore");
            return (Criteria) this;
        }

        public Criteria andFdStafffScoreNotBetween(String value1, String value2) {
            addCriterion("FD_STAFFF_SCORE not between", value1, value2, "fdStafffScore");
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