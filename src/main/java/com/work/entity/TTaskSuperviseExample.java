package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TTaskSuperviseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTaskSuperviseExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("PARENT_ID like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("PARENT_ID not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andFdTaskNameIsNull() {
            addCriterion("FD_TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFdTaskNameIsNotNull() {
            addCriterion("FD_TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFdTaskNameEqualTo(String value) {
            addCriterion("FD_TASK_NAME =", value, "fdTaskName");
            return (Criteria) this;
        }

        public Criteria andFdTaskNameNotEqualTo(String value) {
            addCriterion("FD_TASK_NAME <>", value, "fdTaskName");
            return (Criteria) this;
        }

        public Criteria andFdTaskNameGreaterThan(String value) {
            addCriterion("FD_TASK_NAME >", value, "fdTaskName");
            return (Criteria) this;
        }

        public Criteria andFdTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("FD_TASK_NAME >=", value, "fdTaskName");
            return (Criteria) this;
        }

        public Criteria andFdTaskNameLessThan(String value) {
            addCriterion("FD_TASK_NAME <", value, "fdTaskName");
            return (Criteria) this;
        }

        public Criteria andFdTaskNameLessThanOrEqualTo(String value) {
            addCriterion("FD_TASK_NAME <=", value, "fdTaskName");
            return (Criteria) this;
        }

        public Criteria andFdTaskNameLike(String value) {
            addCriterion("FD_TASK_NAME like", value, "fdTaskName");
            return (Criteria) this;
        }

        public Criteria andFdTaskNameNotLike(String value) {
            addCriterion("FD_TASK_NAME not like", value, "fdTaskName");
            return (Criteria) this;
        }

        public Criteria andFdTaskNameIn(List<String> values) {
            addCriterion("FD_TASK_NAME in", values, "fdTaskName");
            return (Criteria) this;
        }

        public Criteria andFdTaskNameNotIn(List<String> values) {
            addCriterion("FD_TASK_NAME not in", values, "fdTaskName");
            return (Criteria) this;
        }

        public Criteria andFdTaskNameBetween(String value1, String value2) {
            addCriterion("FD_TASK_NAME between", value1, value2, "fdTaskName");
            return (Criteria) this;
        }

        public Criteria andFdTaskNameNotBetween(String value1, String value2) {
            addCriterion("FD_TASK_NAME not between", value1, value2, "fdTaskName");
            return (Criteria) this;
        }

        public Criteria andFdLeaderIdIsNull() {
            addCriterion("FD_LEADER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdLeaderIdIsNotNull() {
            addCriterion("FD_LEADER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdLeaderIdEqualTo(String value) {
            addCriterion("FD_LEADER_ID =", value, "fdLeaderId");
            return (Criteria) this;
        }

        public Criteria andFdLeaderIdNotEqualTo(String value) {
            addCriterion("FD_LEADER_ID <>", value, "fdLeaderId");
            return (Criteria) this;
        }

        public Criteria andFdLeaderIdGreaterThan(String value) {
            addCriterion("FD_LEADER_ID >", value, "fdLeaderId");
            return (Criteria) this;
        }

        public Criteria andFdLeaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_LEADER_ID >=", value, "fdLeaderId");
            return (Criteria) this;
        }

        public Criteria andFdLeaderIdLessThan(String value) {
            addCriterion("FD_LEADER_ID <", value, "fdLeaderId");
            return (Criteria) this;
        }

        public Criteria andFdLeaderIdLessThanOrEqualTo(String value) {
            addCriterion("FD_LEADER_ID <=", value, "fdLeaderId");
            return (Criteria) this;
        }

        public Criteria andFdLeaderIdLike(String value) {
            addCriterion("FD_LEADER_ID like", value, "fdLeaderId");
            return (Criteria) this;
        }

        public Criteria andFdLeaderIdNotLike(String value) {
            addCriterion("FD_LEADER_ID not like", value, "fdLeaderId");
            return (Criteria) this;
        }

        public Criteria andFdLeaderIdIn(List<String> values) {
            addCriterion("FD_LEADER_ID in", values, "fdLeaderId");
            return (Criteria) this;
        }

        public Criteria andFdLeaderIdNotIn(List<String> values) {
            addCriterion("FD_LEADER_ID not in", values, "fdLeaderId");
            return (Criteria) this;
        }

        public Criteria andFdLeaderIdBetween(String value1, String value2) {
            addCriterion("FD_LEADER_ID between", value1, value2, "fdLeaderId");
            return (Criteria) this;
        }

        public Criteria andFdLeaderIdNotBetween(String value1, String value2) {
            addCriterion("FD_LEADER_ID not between", value1, value2, "fdLeaderId");
            return (Criteria) this;
        }

        public Criteria andFdLeaderNameIsNull() {
            addCriterion("FD_LEADER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFdLeaderNameIsNotNull() {
            addCriterion("FD_LEADER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFdLeaderNameEqualTo(String value) {
            addCriterion("FD_LEADER_NAME =", value, "fdLeaderName");
            return (Criteria) this;
        }

        public Criteria andFdLeaderNameNotEqualTo(String value) {
            addCriterion("FD_LEADER_NAME <>", value, "fdLeaderName");
            return (Criteria) this;
        }

        public Criteria andFdLeaderNameGreaterThan(String value) {
            addCriterion("FD_LEADER_NAME >", value, "fdLeaderName");
            return (Criteria) this;
        }

        public Criteria andFdLeaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("FD_LEADER_NAME >=", value, "fdLeaderName");
            return (Criteria) this;
        }

        public Criteria andFdLeaderNameLessThan(String value) {
            addCriterion("FD_LEADER_NAME <", value, "fdLeaderName");
            return (Criteria) this;
        }

        public Criteria andFdLeaderNameLessThanOrEqualTo(String value) {
            addCriterion("FD_LEADER_NAME <=", value, "fdLeaderName");
            return (Criteria) this;
        }

        public Criteria andFdLeaderNameLike(String value) {
            addCriterion("FD_LEADER_NAME like", value, "fdLeaderName");
            return (Criteria) this;
        }

        public Criteria andFdLeaderNameNotLike(String value) {
            addCriterion("FD_LEADER_NAME not like", value, "fdLeaderName");
            return (Criteria) this;
        }

        public Criteria andFdLeaderNameIn(List<String> values) {
            addCriterion("FD_LEADER_NAME in", values, "fdLeaderName");
            return (Criteria) this;
        }

        public Criteria andFdLeaderNameNotIn(List<String> values) {
            addCriterion("FD_LEADER_NAME not in", values, "fdLeaderName");
            return (Criteria) this;
        }

        public Criteria andFdLeaderNameBetween(String value1, String value2) {
            addCriterion("FD_LEADER_NAME between", value1, value2, "fdLeaderName");
            return (Criteria) this;
        }

        public Criteria andFdLeaderNameNotBetween(String value1, String value2) {
            addCriterion("FD_LEADER_NAME not between", value1, value2, "fdLeaderName");
            return (Criteria) this;
        }

        public Criteria andFdAssistOrgnameIsNull() {
            addCriterion("FD_ASSIST_ORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andFdAssistOrgnameIsNotNull() {
            addCriterion("FD_ASSIST_ORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFdAssistOrgnameEqualTo(String value) {
            addCriterion("FD_ASSIST_ORGNAME =", value, "fdAssistOrgname");
            return (Criteria) this;
        }

        public Criteria andFdAssistOrgnameNotEqualTo(String value) {
            addCriterion("FD_ASSIST_ORGNAME <>", value, "fdAssistOrgname");
            return (Criteria) this;
        }

        public Criteria andFdAssistOrgnameGreaterThan(String value) {
            addCriterion("FD_ASSIST_ORGNAME >", value, "fdAssistOrgname");
            return (Criteria) this;
        }

        public Criteria andFdAssistOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ASSIST_ORGNAME >=", value, "fdAssistOrgname");
            return (Criteria) this;
        }

        public Criteria andFdAssistOrgnameLessThan(String value) {
            addCriterion("FD_ASSIST_ORGNAME <", value, "fdAssistOrgname");
            return (Criteria) this;
        }

        public Criteria andFdAssistOrgnameLessThanOrEqualTo(String value) {
            addCriterion("FD_ASSIST_ORGNAME <=", value, "fdAssistOrgname");
            return (Criteria) this;
        }

        public Criteria andFdAssistOrgnameLike(String value) {
            addCriterion("FD_ASSIST_ORGNAME like", value, "fdAssistOrgname");
            return (Criteria) this;
        }

        public Criteria andFdAssistOrgnameNotLike(String value) {
            addCriterion("FD_ASSIST_ORGNAME not like", value, "fdAssistOrgname");
            return (Criteria) this;
        }

        public Criteria andFdAssistOrgnameIn(List<String> values) {
            addCriterion("FD_ASSIST_ORGNAME in", values, "fdAssistOrgname");
            return (Criteria) this;
        }

        public Criteria andFdAssistOrgnameNotIn(List<String> values) {
            addCriterion("FD_ASSIST_ORGNAME not in", values, "fdAssistOrgname");
            return (Criteria) this;
        }

        public Criteria andFdAssistOrgnameBetween(String value1, String value2) {
            addCriterion("FD_ASSIST_ORGNAME between", value1, value2, "fdAssistOrgname");
            return (Criteria) this;
        }

        public Criteria andFdAssistOrgnameNotBetween(String value1, String value2) {
            addCriterion("FD_ASSIST_ORGNAME not between", value1, value2, "fdAssistOrgname");
            return (Criteria) this;
        }

        public Criteria andFdStartDateIsNull() {
            addCriterion("FD_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFdStartDateIsNotNull() {
            addCriterion("FD_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdStartDateEqualTo(String value) {
            addCriterion("FD_START_DATE =", value, "fdStartDate");
            return (Criteria) this;
        }

        public Criteria andFdStartDateNotEqualTo(String value) {
            addCriterion("FD_START_DATE <>", value, "fdStartDate");
            return (Criteria) this;
        }

        public Criteria andFdStartDateGreaterThan(String value) {
            addCriterion("FD_START_DATE >", value, "fdStartDate");
            return (Criteria) this;
        }

        public Criteria andFdStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_START_DATE >=", value, "fdStartDate");
            return (Criteria) this;
        }

        public Criteria andFdStartDateLessThan(String value) {
            addCriterion("FD_START_DATE <", value, "fdStartDate");
            return (Criteria) this;
        }

        public Criteria andFdStartDateLessThanOrEqualTo(String value) {
            addCriterion("FD_START_DATE <=", value, "fdStartDate");
            return (Criteria) this;
        }

        public Criteria andFdStartDateLike(String value) {
            addCriterion("FD_START_DATE like", value, "fdStartDate");
            return (Criteria) this;
        }

        public Criteria andFdStartDateNotLike(String value) {
            addCriterion("FD_START_DATE not like", value, "fdStartDate");
            return (Criteria) this;
        }

        public Criteria andFdStartDateIn(List<String> values) {
            addCriterion("FD_START_DATE in", values, "fdStartDate");
            return (Criteria) this;
        }

        public Criteria andFdStartDateNotIn(List<String> values) {
            addCriterion("FD_START_DATE not in", values, "fdStartDate");
            return (Criteria) this;
        }

        public Criteria andFdStartDateBetween(String value1, String value2) {
            addCriterion("FD_START_DATE between", value1, value2, "fdStartDate");
            return (Criteria) this;
        }

        public Criteria andFdStartDateNotBetween(String value1, String value2) {
            addCriterion("FD_START_DATE not between", value1, value2, "fdStartDate");
            return (Criteria) this;
        }

        public Criteria andFdEndDateIsNull() {
            addCriterion("FD_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFdEndDateIsNotNull() {
            addCriterion("FD_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFdEndDateEqualTo(String value) {
            addCriterion("FD_END_DATE =", value, "fdEndDate");
            return (Criteria) this;
        }

        public Criteria andFdEndDateNotEqualTo(String value) {
            addCriterion("FD_END_DATE <>", value, "fdEndDate");
            return (Criteria) this;
        }

        public Criteria andFdEndDateGreaterThan(String value) {
            addCriterion("FD_END_DATE >", value, "fdEndDate");
            return (Criteria) this;
        }

        public Criteria andFdEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("FD_END_DATE >=", value, "fdEndDate");
            return (Criteria) this;
        }

        public Criteria andFdEndDateLessThan(String value) {
            addCriterion("FD_END_DATE <", value, "fdEndDate");
            return (Criteria) this;
        }

        public Criteria andFdEndDateLessThanOrEqualTo(String value) {
            addCriterion("FD_END_DATE <=", value, "fdEndDate");
            return (Criteria) this;
        }

        public Criteria andFdEndDateLike(String value) {
            addCriterion("FD_END_DATE like", value, "fdEndDate");
            return (Criteria) this;
        }

        public Criteria andFdEndDateNotLike(String value) {
            addCriterion("FD_END_DATE not like", value, "fdEndDate");
            return (Criteria) this;
        }

        public Criteria andFdEndDateIn(List<String> values) {
            addCriterion("FD_END_DATE in", values, "fdEndDate");
            return (Criteria) this;
        }

        public Criteria andFdEndDateNotIn(List<String> values) {
            addCriterion("FD_END_DATE not in", values, "fdEndDate");
            return (Criteria) this;
        }

        public Criteria andFdEndDateBetween(String value1, String value2) {
            addCriterion("FD_END_DATE between", value1, value2, "fdEndDate");
            return (Criteria) this;
        }

        public Criteria andFdEndDateNotBetween(String value1, String value2) {
            addCriterion("FD_END_DATE not between", value1, value2, "fdEndDate");
            return (Criteria) this;
        }

        public Criteria andFdTaskLevelIsNull() {
            addCriterion("FD_TASK_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andFdTaskLevelIsNotNull() {
            addCriterion("FD_TASK_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andFdTaskLevelEqualTo(String value) {
            addCriterion("FD_TASK_LEVEL =", value, "fdTaskLevel");
            return (Criteria) this;
        }

        public Criteria andFdTaskLevelNotEqualTo(String value) {
            addCriterion("FD_TASK_LEVEL <>", value, "fdTaskLevel");
            return (Criteria) this;
        }

        public Criteria andFdTaskLevelGreaterThan(String value) {
            addCriterion("FD_TASK_LEVEL >", value, "fdTaskLevel");
            return (Criteria) this;
        }

        public Criteria andFdTaskLevelGreaterThanOrEqualTo(String value) {
            addCriterion("FD_TASK_LEVEL >=", value, "fdTaskLevel");
            return (Criteria) this;
        }

        public Criteria andFdTaskLevelLessThan(String value) {
            addCriterion("FD_TASK_LEVEL <", value, "fdTaskLevel");
            return (Criteria) this;
        }

        public Criteria andFdTaskLevelLessThanOrEqualTo(String value) {
            addCriterion("FD_TASK_LEVEL <=", value, "fdTaskLevel");
            return (Criteria) this;
        }

        public Criteria andFdTaskLevelLike(String value) {
            addCriterion("FD_TASK_LEVEL like", value, "fdTaskLevel");
            return (Criteria) this;
        }

        public Criteria andFdTaskLevelNotLike(String value) {
            addCriterion("FD_TASK_LEVEL not like", value, "fdTaskLevel");
            return (Criteria) this;
        }

        public Criteria andFdTaskLevelIn(List<String> values) {
            addCriterion("FD_TASK_LEVEL in", values, "fdTaskLevel");
            return (Criteria) this;
        }

        public Criteria andFdTaskLevelNotIn(List<String> values) {
            addCriterion("FD_TASK_LEVEL not in", values, "fdTaskLevel");
            return (Criteria) this;
        }

        public Criteria andFdTaskLevelBetween(String value1, String value2) {
            addCriterion("FD_TASK_LEVEL between", value1, value2, "fdTaskLevel");
            return (Criteria) this;
        }

        public Criteria andFdTaskLevelNotBetween(String value1, String value2) {
            addCriterion("FD_TASK_LEVEL not between", value1, value2, "fdTaskLevel");
            return (Criteria) this;
        }

        public Criteria andFdTaskRemarkIsNull() {
            addCriterion("FD_TASK_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andFdTaskRemarkIsNotNull() {
            addCriterion("FD_TASK_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andFdTaskRemarkEqualTo(String value) {
            addCriterion("FD_TASK_REMARK =", value, "fdTaskRemark");
            return (Criteria) this;
        }

        public Criteria andFdTaskRemarkNotEqualTo(String value) {
            addCriterion("FD_TASK_REMARK <>", value, "fdTaskRemark");
            return (Criteria) this;
        }

        public Criteria andFdTaskRemarkGreaterThan(String value) {
            addCriterion("FD_TASK_REMARK >", value, "fdTaskRemark");
            return (Criteria) this;
        }

        public Criteria andFdTaskRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("FD_TASK_REMARK >=", value, "fdTaskRemark");
            return (Criteria) this;
        }

        public Criteria andFdTaskRemarkLessThan(String value) {
            addCriterion("FD_TASK_REMARK <", value, "fdTaskRemark");
            return (Criteria) this;
        }

        public Criteria andFdTaskRemarkLessThanOrEqualTo(String value) {
            addCriterion("FD_TASK_REMARK <=", value, "fdTaskRemark");
            return (Criteria) this;
        }

        public Criteria andFdTaskRemarkLike(String value) {
            addCriterion("FD_TASK_REMARK like", value, "fdTaskRemark");
            return (Criteria) this;
        }

        public Criteria andFdTaskRemarkNotLike(String value) {
            addCriterion("FD_TASK_REMARK not like", value, "fdTaskRemark");
            return (Criteria) this;
        }

        public Criteria andFdTaskRemarkIn(List<String> values) {
            addCriterion("FD_TASK_REMARK in", values, "fdTaskRemark");
            return (Criteria) this;
        }

        public Criteria andFdTaskRemarkNotIn(List<String> values) {
            addCriterion("FD_TASK_REMARK not in", values, "fdTaskRemark");
            return (Criteria) this;
        }

        public Criteria andFdTaskRemarkBetween(String value1, String value2) {
            addCriterion("FD_TASK_REMARK between", value1, value2, "fdTaskRemark");
            return (Criteria) this;
        }

        public Criteria andFdTaskRemarkNotBetween(String value1, String value2) {
            addCriterion("FD_TASK_REMARK not between", value1, value2, "fdTaskRemark");
            return (Criteria) this;
        }

        public Criteria andFdEmpidInputIsNull() {
            addCriterion("FD_EMPID_INPUT is null");
            return (Criteria) this;
        }

        public Criteria andFdEmpidInputIsNotNull() {
            addCriterion("FD_EMPID_INPUT is not null");
            return (Criteria) this;
        }

        public Criteria andFdEmpidInputEqualTo(String value) {
            addCriterion("FD_EMPID_INPUT =", value, "fdEmpidInput");
            return (Criteria) this;
        }

        public Criteria andFdEmpidInputNotEqualTo(String value) {
            addCriterion("FD_EMPID_INPUT <>", value, "fdEmpidInput");
            return (Criteria) this;
        }

        public Criteria andFdEmpidInputGreaterThan(String value) {
            addCriterion("FD_EMPID_INPUT >", value, "fdEmpidInput");
            return (Criteria) this;
        }

        public Criteria andFdEmpidInputGreaterThanOrEqualTo(String value) {
            addCriterion("FD_EMPID_INPUT >=", value, "fdEmpidInput");
            return (Criteria) this;
        }

        public Criteria andFdEmpidInputLessThan(String value) {
            addCriterion("FD_EMPID_INPUT <", value, "fdEmpidInput");
            return (Criteria) this;
        }

        public Criteria andFdEmpidInputLessThanOrEqualTo(String value) {
            addCriterion("FD_EMPID_INPUT <=", value, "fdEmpidInput");
            return (Criteria) this;
        }

        public Criteria andFdEmpidInputLike(String value) {
            addCriterion("FD_EMPID_INPUT like", value, "fdEmpidInput");
            return (Criteria) this;
        }

        public Criteria andFdEmpidInputNotLike(String value) {
            addCriterion("FD_EMPID_INPUT not like", value, "fdEmpidInput");
            return (Criteria) this;
        }

        public Criteria andFdEmpidInputIn(List<String> values) {
            addCriterion("FD_EMPID_INPUT in", values, "fdEmpidInput");
            return (Criteria) this;
        }

        public Criteria andFdEmpidInputNotIn(List<String> values) {
            addCriterion("FD_EMPID_INPUT not in", values, "fdEmpidInput");
            return (Criteria) this;
        }

        public Criteria andFdEmpidInputBetween(String value1, String value2) {
            addCriterion("FD_EMPID_INPUT between", value1, value2, "fdEmpidInput");
            return (Criteria) this;
        }

        public Criteria andFdEmpidInputNotBetween(String value1, String value2) {
            addCriterion("FD_EMPID_INPUT not between", value1, value2, "fdEmpidInput");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeInpputIsNull() {
            addCriterion("FD_EMPNME_INPPUT is null");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeInpputIsNotNull() {
            addCriterion("FD_EMPNME_INPPUT is not null");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeInpputEqualTo(String value) {
            addCriterion("FD_EMPNME_INPPUT =", value, "fdEmpnmeInpput");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeInpputNotEqualTo(String value) {
            addCriterion("FD_EMPNME_INPPUT <>", value, "fdEmpnmeInpput");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeInpputGreaterThan(String value) {
            addCriterion("FD_EMPNME_INPPUT >", value, "fdEmpnmeInpput");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeInpputGreaterThanOrEqualTo(String value) {
            addCriterion("FD_EMPNME_INPPUT >=", value, "fdEmpnmeInpput");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeInpputLessThan(String value) {
            addCriterion("FD_EMPNME_INPPUT <", value, "fdEmpnmeInpput");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeInpputLessThanOrEqualTo(String value) {
            addCriterion("FD_EMPNME_INPPUT <=", value, "fdEmpnmeInpput");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeInpputLike(String value) {
            addCriterion("FD_EMPNME_INPPUT like", value, "fdEmpnmeInpput");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeInpputNotLike(String value) {
            addCriterion("FD_EMPNME_INPPUT not like", value, "fdEmpnmeInpput");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeInpputIn(List<String> values) {
            addCriterion("FD_EMPNME_INPPUT in", values, "fdEmpnmeInpput");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeInpputNotIn(List<String> values) {
            addCriterion("FD_EMPNME_INPPUT not in", values, "fdEmpnmeInpput");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeInpputBetween(String value1, String value2) {
            addCriterion("FD_EMPNME_INPPUT between", value1, value2, "fdEmpnmeInpput");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeInpputNotBetween(String value1, String value2) {
            addCriterion("FD_EMPNME_INPPUT not between", value1, value2, "fdEmpnmeInpput");
            return (Criteria) this;
        }

        public Criteria andFdTaskStatusIsNull() {
            addCriterion("FD_TASK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFdTaskStatusIsNotNull() {
            addCriterion("FD_TASK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFdTaskStatusEqualTo(String value) {
            addCriterion("FD_TASK_STATUS =", value, "fdTaskStatus");
            return (Criteria) this;
        }

        public Criteria andFdTaskStatusNotEqualTo(String value) {
            addCriterion("FD_TASK_STATUS <>", value, "fdTaskStatus");
            return (Criteria) this;
        }

        public Criteria andFdTaskStatusGreaterThan(String value) {
            addCriterion("FD_TASK_STATUS >", value, "fdTaskStatus");
            return (Criteria) this;
        }

        public Criteria andFdTaskStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FD_TASK_STATUS >=", value, "fdTaskStatus");
            return (Criteria) this;
        }

        public Criteria andFdTaskStatusLessThan(String value) {
            addCriterion("FD_TASK_STATUS <", value, "fdTaskStatus");
            return (Criteria) this;
        }

        public Criteria andFdTaskStatusLessThanOrEqualTo(String value) {
            addCriterion("FD_TASK_STATUS <=", value, "fdTaskStatus");
            return (Criteria) this;
        }

        public Criteria andFdTaskStatusLike(String value) {
            addCriterion("FD_TASK_STATUS like", value, "fdTaskStatus");
            return (Criteria) this;
        }

        public Criteria andFdTaskStatusNotLike(String value) {
            addCriterion("FD_TASK_STATUS not like", value, "fdTaskStatus");
            return (Criteria) this;
        }

        public Criteria andFdTaskStatusIn(List<String> values) {
            addCriterion("FD_TASK_STATUS in", values, "fdTaskStatus");
            return (Criteria) this;
        }

        public Criteria andFdTaskStatusNotIn(List<String> values) {
            addCriterion("FD_TASK_STATUS not in", values, "fdTaskStatus");
            return (Criteria) this;
        }

        public Criteria andFdTaskStatusBetween(String value1, String value2) {
            addCriterion("FD_TASK_STATUS between", value1, value2, "fdTaskStatus");
            return (Criteria) this;
        }

        public Criteria andFdTaskStatusNotBetween(String value1, String value2) {
            addCriterion("FD_TASK_STATUS not between", value1, value2, "fdTaskStatus");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeIsNull() {
            addCriterion("FD_TASK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeIsNotNull() {
            addCriterion("FD_TASK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeEqualTo(String value) {
            addCriterion("FD_TASK_TYPE =", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeNotEqualTo(String value) {
            addCriterion("FD_TASK_TYPE <>", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeGreaterThan(String value) {
            addCriterion("FD_TASK_TYPE >", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_TASK_TYPE >=", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeLessThan(String value) {
            addCriterion("FD_TASK_TYPE <", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("FD_TASK_TYPE <=", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeLike(String value) {
            addCriterion("FD_TASK_TYPE like", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeNotLike(String value) {
            addCriterion("FD_TASK_TYPE not like", value, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeIn(List<String> values) {
            addCriterion("FD_TASK_TYPE in", values, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeNotIn(List<String> values) {
            addCriterion("FD_TASK_TYPE not in", values, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeBetween(String value1, String value2) {
            addCriterion("FD_TASK_TYPE between", value1, value2, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdTaskTypeNotBetween(String value1, String value2) {
            addCriterion("FD_TASK_TYPE not between", value1, value2, "fdTaskType");
            return (Criteria) this;
        }

        public Criteria andFdRouteRemarkIsNull() {
            addCriterion("FD_ROUTE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andFdRouteRemarkIsNotNull() {
            addCriterion("FD_ROUTE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andFdRouteRemarkEqualTo(String value) {
            addCriterion("FD_ROUTE_REMARK =", value, "fdRouteRemark");
            return (Criteria) this;
        }

        public Criteria andFdRouteRemarkNotEqualTo(String value) {
            addCriterion("FD_ROUTE_REMARK <>", value, "fdRouteRemark");
            return (Criteria) this;
        }

        public Criteria andFdRouteRemarkGreaterThan(String value) {
            addCriterion("FD_ROUTE_REMARK >", value, "fdRouteRemark");
            return (Criteria) this;
        }

        public Criteria andFdRouteRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ROUTE_REMARK >=", value, "fdRouteRemark");
            return (Criteria) this;
        }

        public Criteria andFdRouteRemarkLessThan(String value) {
            addCriterion("FD_ROUTE_REMARK <", value, "fdRouteRemark");
            return (Criteria) this;
        }

        public Criteria andFdRouteRemarkLessThanOrEqualTo(String value) {
            addCriterion("FD_ROUTE_REMARK <=", value, "fdRouteRemark");
            return (Criteria) this;
        }

        public Criteria andFdRouteRemarkLike(String value) {
            addCriterion("FD_ROUTE_REMARK like", value, "fdRouteRemark");
            return (Criteria) this;
        }

        public Criteria andFdRouteRemarkNotLike(String value) {
            addCriterion("FD_ROUTE_REMARK not like", value, "fdRouteRemark");
            return (Criteria) this;
        }

        public Criteria andFdRouteRemarkIn(List<String> values) {
            addCriterion("FD_ROUTE_REMARK in", values, "fdRouteRemark");
            return (Criteria) this;
        }

        public Criteria andFdRouteRemarkNotIn(List<String> values) {
            addCriterion("FD_ROUTE_REMARK not in", values, "fdRouteRemark");
            return (Criteria) this;
        }

        public Criteria andFdRouteRemarkBetween(String value1, String value2) {
            addCriterion("FD_ROUTE_REMARK between", value1, value2, "fdRouteRemark");
            return (Criteria) this;
        }

        public Criteria andFdRouteRemarkNotBetween(String value1, String value2) {
            addCriterion("FD_ROUTE_REMARK not between", value1, value2, "fdRouteRemark");
            return (Criteria) this;
        }

        public Criteria andFdHingeRemarkIsNull() {
            addCriterion("FD_HINGE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andFdHingeRemarkIsNotNull() {
            addCriterion("FD_HINGE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andFdHingeRemarkEqualTo(String value) {
            addCriterion("FD_HINGE_REMARK =", value, "fdHingeRemark");
            return (Criteria) this;
        }

        public Criteria andFdHingeRemarkNotEqualTo(String value) {
            addCriterion("FD_HINGE_REMARK <>", value, "fdHingeRemark");
            return (Criteria) this;
        }

        public Criteria andFdHingeRemarkGreaterThan(String value) {
            addCriterion("FD_HINGE_REMARK >", value, "fdHingeRemark");
            return (Criteria) this;
        }

        public Criteria andFdHingeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("FD_HINGE_REMARK >=", value, "fdHingeRemark");
            return (Criteria) this;
        }

        public Criteria andFdHingeRemarkLessThan(String value) {
            addCriterion("FD_HINGE_REMARK <", value, "fdHingeRemark");
            return (Criteria) this;
        }

        public Criteria andFdHingeRemarkLessThanOrEqualTo(String value) {
            addCriterion("FD_HINGE_REMARK <=", value, "fdHingeRemark");
            return (Criteria) this;
        }

        public Criteria andFdHingeRemarkLike(String value) {
            addCriterion("FD_HINGE_REMARK like", value, "fdHingeRemark");
            return (Criteria) this;
        }

        public Criteria andFdHingeRemarkNotLike(String value) {
            addCriterion("FD_HINGE_REMARK not like", value, "fdHingeRemark");
            return (Criteria) this;
        }

        public Criteria andFdHingeRemarkIn(List<String> values) {
            addCriterion("FD_HINGE_REMARK in", values, "fdHingeRemark");
            return (Criteria) this;
        }

        public Criteria andFdHingeRemarkNotIn(List<String> values) {
            addCriterion("FD_HINGE_REMARK not in", values, "fdHingeRemark");
            return (Criteria) this;
        }

        public Criteria andFdHingeRemarkBetween(String value1, String value2) {
            addCriterion("FD_HINGE_REMARK between", value1, value2, "fdHingeRemark");
            return (Criteria) this;
        }

        public Criteria andFdHingeRemarkNotBetween(String value1, String value2) {
            addCriterion("FD_HINGE_REMARK not between", value1, value2, "fdHingeRemark");
            return (Criteria) this;
        }

        public Criteria andFdToolRemarkIsNull() {
            addCriterion("FD_TOOL_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andFdToolRemarkIsNotNull() {
            addCriterion("FD_TOOL_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andFdToolRemarkEqualTo(String value) {
            addCriterion("FD_TOOL_REMARK =", value, "fdToolRemark");
            return (Criteria) this;
        }

        public Criteria andFdToolRemarkNotEqualTo(String value) {
            addCriterion("FD_TOOL_REMARK <>", value, "fdToolRemark");
            return (Criteria) this;
        }

        public Criteria andFdToolRemarkGreaterThan(String value) {
            addCriterion("FD_TOOL_REMARK >", value, "fdToolRemark");
            return (Criteria) this;
        }

        public Criteria andFdToolRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("FD_TOOL_REMARK >=", value, "fdToolRemark");
            return (Criteria) this;
        }

        public Criteria andFdToolRemarkLessThan(String value) {
            addCriterion("FD_TOOL_REMARK <", value, "fdToolRemark");
            return (Criteria) this;
        }

        public Criteria andFdToolRemarkLessThanOrEqualTo(String value) {
            addCriterion("FD_TOOL_REMARK <=", value, "fdToolRemark");
            return (Criteria) this;
        }

        public Criteria andFdToolRemarkLike(String value) {
            addCriterion("FD_TOOL_REMARK like", value, "fdToolRemark");
            return (Criteria) this;
        }

        public Criteria andFdToolRemarkNotLike(String value) {
            addCriterion("FD_TOOL_REMARK not like", value, "fdToolRemark");
            return (Criteria) this;
        }

        public Criteria andFdToolRemarkIn(List<String> values) {
            addCriterion("FD_TOOL_REMARK in", values, "fdToolRemark");
            return (Criteria) this;
        }

        public Criteria andFdToolRemarkNotIn(List<String> values) {
            addCriterion("FD_TOOL_REMARK not in", values, "fdToolRemark");
            return (Criteria) this;
        }

        public Criteria andFdToolRemarkBetween(String value1, String value2) {
            addCriterion("FD_TOOL_REMARK between", value1, value2, "fdToolRemark");
            return (Criteria) this;
        }

        public Criteria andFdToolRemarkNotBetween(String value1, String value2) {
            addCriterion("FD_TOOL_REMARK not between", value1, value2, "fdToolRemark");
            return (Criteria) this;
        }

        public Criteria andFdEmpDeptIsNull() {
            addCriterion("FD_EMP_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andFdEmpDeptIsNotNull() {
            addCriterion("FD_EMP_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andFdEmpDeptEqualTo(String value) {
            addCriterion("FD_EMP_DEPT =", value, "fdEmpDept");
            return (Criteria) this;
        }

        public Criteria andFdEmpDeptNotEqualTo(String value) {
            addCriterion("FD_EMP_DEPT <>", value, "fdEmpDept");
            return (Criteria) this;
        }

        public Criteria andFdEmpDeptGreaterThan(String value) {
            addCriterion("FD_EMP_DEPT >", value, "fdEmpDept");
            return (Criteria) this;
        }

        public Criteria andFdEmpDeptGreaterThanOrEqualTo(String value) {
            addCriterion("FD_EMP_DEPT >=", value, "fdEmpDept");
            return (Criteria) this;
        }

        public Criteria andFdEmpDeptLessThan(String value) {
            addCriterion("FD_EMP_DEPT <", value, "fdEmpDept");
            return (Criteria) this;
        }

        public Criteria andFdEmpDeptLessThanOrEqualTo(String value) {
            addCriterion("FD_EMP_DEPT <=", value, "fdEmpDept");
            return (Criteria) this;
        }

        public Criteria andFdEmpDeptLike(String value) {
            addCriterion("FD_EMP_DEPT like", value, "fdEmpDept");
            return (Criteria) this;
        }

        public Criteria andFdEmpDeptNotLike(String value) {
            addCriterion("FD_EMP_DEPT not like", value, "fdEmpDept");
            return (Criteria) this;
        }

        public Criteria andFdEmpDeptIn(List<String> values) {
            addCriterion("FD_EMP_DEPT in", values, "fdEmpDept");
            return (Criteria) this;
        }

        public Criteria andFdEmpDeptNotIn(List<String> values) {
            addCriterion("FD_EMP_DEPT not in", values, "fdEmpDept");
            return (Criteria) this;
        }

        public Criteria andFdEmpDeptBetween(String value1, String value2) {
            addCriterion("FD_EMP_DEPT between", value1, value2, "fdEmpDept");
            return (Criteria) this;
        }

        public Criteria andFdEmpDeptNotBetween(String value1, String value2) {
            addCriterion("FD_EMP_DEPT not between", value1, value2, "fdEmpDept");
            return (Criteria) this;
        }

        public Criteria andFdResponsibleIsNull() {
            addCriterion("FD_RESPONSIBLE is null");
            return (Criteria) this;
        }

        public Criteria andFdResponsibleIsNotNull() {
            addCriterion("FD_RESPONSIBLE is not null");
            return (Criteria) this;
        }

        public Criteria andFdResponsibleEqualTo(String value) {
            addCriterion("FD_RESPONSIBLE =", value, "fdResponsible");
            return (Criteria) this;
        }

        public Criteria andFdResponsibleNotEqualTo(String value) {
            addCriterion("FD_RESPONSIBLE <>", value, "fdResponsible");
            return (Criteria) this;
        }

        public Criteria andFdResponsibleGreaterThan(String value) {
            addCriterion("FD_RESPONSIBLE >", value, "fdResponsible");
            return (Criteria) this;
        }

        public Criteria andFdResponsibleGreaterThanOrEqualTo(String value) {
            addCriterion("FD_RESPONSIBLE >=", value, "fdResponsible");
            return (Criteria) this;
        }

        public Criteria andFdResponsibleLessThan(String value) {
            addCriterion("FD_RESPONSIBLE <", value, "fdResponsible");
            return (Criteria) this;
        }

        public Criteria andFdResponsibleLessThanOrEqualTo(String value) {
            addCriterion("FD_RESPONSIBLE <=", value, "fdResponsible");
            return (Criteria) this;
        }

        public Criteria andFdResponsibleLike(String value) {
            addCriterion("FD_RESPONSIBLE like", value, "fdResponsible");
            return (Criteria) this;
        }

        public Criteria andFdResponsibleNotLike(String value) {
            addCriterion("FD_RESPONSIBLE not like", value, "fdResponsible");
            return (Criteria) this;
        }

        public Criteria andFdResponsibleIn(List<String> values) {
            addCriterion("FD_RESPONSIBLE in", values, "fdResponsible");
            return (Criteria) this;
        }

        public Criteria andFdResponsibleNotIn(List<String> values) {
            addCriterion("FD_RESPONSIBLE not in", values, "fdResponsible");
            return (Criteria) this;
        }

        public Criteria andFdResponsibleBetween(String value1, String value2) {
            addCriterion("FD_RESPONSIBLE between", value1, value2, "fdResponsible");
            return (Criteria) this;
        }

        public Criteria andFdResponsibleNotBetween(String value1, String value2) {
            addCriterion("FD_RESPONSIBLE not between", value1, value2, "fdResponsible");
            return (Criteria) this;
        }

        public Criteria andFdResponsiblenameIsNull() {
            addCriterion("FD_RESPONSIBLENAME is null");
            return (Criteria) this;
        }

        public Criteria andFdResponsiblenameIsNotNull() {
            addCriterion("FD_RESPONSIBLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFdResponsiblenameEqualTo(String value) {
            addCriterion("FD_RESPONSIBLENAME =", value, "fdResponsiblename");
            return (Criteria) this;
        }

        public Criteria andFdResponsiblenameNotEqualTo(String value) {
            addCriterion("FD_RESPONSIBLENAME <>", value, "fdResponsiblename");
            return (Criteria) this;
        }

        public Criteria andFdResponsiblenameGreaterThan(String value) {
            addCriterion("FD_RESPONSIBLENAME >", value, "fdResponsiblename");
            return (Criteria) this;
        }

        public Criteria andFdResponsiblenameGreaterThanOrEqualTo(String value) {
            addCriterion("FD_RESPONSIBLENAME >=", value, "fdResponsiblename");
            return (Criteria) this;
        }

        public Criteria andFdResponsiblenameLessThan(String value) {
            addCriterion("FD_RESPONSIBLENAME <", value, "fdResponsiblename");
            return (Criteria) this;
        }

        public Criteria andFdResponsiblenameLessThanOrEqualTo(String value) {
            addCriterion("FD_RESPONSIBLENAME <=", value, "fdResponsiblename");
            return (Criteria) this;
        }

        public Criteria andFdResponsiblenameLike(String value) {
            addCriterion("FD_RESPONSIBLENAME like", value, "fdResponsiblename");
            return (Criteria) this;
        }

        public Criteria andFdResponsiblenameNotLike(String value) {
            addCriterion("FD_RESPONSIBLENAME not like", value, "fdResponsiblename");
            return (Criteria) this;
        }

        public Criteria andFdResponsiblenameIn(List<String> values) {
            addCriterion("FD_RESPONSIBLENAME in", values, "fdResponsiblename");
            return (Criteria) this;
        }

        public Criteria andFdResponsiblenameNotIn(List<String> values) {
            addCriterion("FD_RESPONSIBLENAME not in", values, "fdResponsiblename");
            return (Criteria) this;
        }

        public Criteria andFdResponsiblenameBetween(String value1, String value2) {
            addCriterion("FD_RESPONSIBLENAME between", value1, value2, "fdResponsiblename");
            return (Criteria) this;
        }

        public Criteria andFdResponsiblenameNotBetween(String value1, String value2) {
            addCriterion("FD_RESPONSIBLENAME not between", value1, value2, "fdResponsiblename");
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