package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TTaskRateFeedbackExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TTaskRateFeedbackExample() {
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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
			addCriterion("FD_START_DATE not between", value1, value2,
					"fdStartDate");
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

		public Criteria andFdRemarkIsNull() {
			addCriterion("FD_REMARK is null");
			return (Criteria) this;
		}

		public Criteria andFdRemarkIsNotNull() {
			addCriterion("FD_REMARK is not null");
			return (Criteria) this;
		}

		public Criteria andFdRemarkEqualTo(String value) {
			addCriterion("FD_REMARK =", value, "fdRemark");
			return (Criteria) this;
		}

		public Criteria andFdRemarkNotEqualTo(String value) {
			addCriterion("FD_REMARK <>", value, "fdRemark");
			return (Criteria) this;
		}

		public Criteria andFdRemarkGreaterThan(String value) {
			addCriterion("FD_REMARK >", value, "fdRemark");
			return (Criteria) this;
		}

		public Criteria andFdRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("FD_REMARK >=", value, "fdRemark");
			return (Criteria) this;
		}

		public Criteria andFdRemarkLessThan(String value) {
			addCriterion("FD_REMARK <", value, "fdRemark");
			return (Criteria) this;
		}

		public Criteria andFdRemarkLessThanOrEqualTo(String value) {
			addCriterion("FD_REMARK <=", value, "fdRemark");
			return (Criteria) this;
		}

		public Criteria andFdRemarkLike(String value) {
			addCriterion("FD_REMARK like", value, "fdRemark");
			return (Criteria) this;
		}

		public Criteria andFdRemarkNotLike(String value) {
			addCriterion("FD_REMARK not like", value, "fdRemark");
			return (Criteria) this;
		}

		public Criteria andFdRemarkIn(List<String> values) {
			addCriterion("FD_REMARK in", values, "fdRemark");
			return (Criteria) this;
		}

		public Criteria andFdRemarkNotIn(List<String> values) {
			addCriterion("FD_REMARK not in", values, "fdRemark");
			return (Criteria) this;
		}

		public Criteria andFdRemarkBetween(String value1, String value2) {
			addCriterion("FD_REMARK between", value1, value2, "fdRemark");
			return (Criteria) this;
		}

		public Criteria andFdRemarkNotBetween(String value1, String value2) {
			addCriterion("FD_REMARK not between", value1, value2, "fdRemark");
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

		public Criteria andFeedEmpidIsNull() {
			addCriterion("FEED_EMPID is null");
			return (Criteria) this;
		}

		public Criteria andFeedEmpidIsNotNull() {
			addCriterion("FEED_EMPID is not null");
			return (Criteria) this;
		}

		public Criteria andFeedEmpidEqualTo(String value) {
			addCriterion("FEED_EMPID =", value, "feedEmpid");
			return (Criteria) this;
		}

		public Criteria andFeedEmpidNotEqualTo(String value) {
			addCriterion("FEED_EMPID <>", value, "feedEmpid");
			return (Criteria) this;
		}

		public Criteria andFeedEmpidGreaterThan(String value) {
			addCriterion("FEED_EMPID >", value, "feedEmpid");
			return (Criteria) this;
		}

		public Criteria andFeedEmpidGreaterThanOrEqualTo(String value) {
			addCriterion("FEED_EMPID >=", value, "feedEmpid");
			return (Criteria) this;
		}

		public Criteria andFeedEmpidLessThan(String value) {
			addCriterion("FEED_EMPID <", value, "feedEmpid");
			return (Criteria) this;
		}

		public Criteria andFeedEmpidLessThanOrEqualTo(String value) {
			addCriterion("FEED_EMPID <=", value, "feedEmpid");
			return (Criteria) this;
		}

		public Criteria andFeedEmpidLike(String value) {
			addCriterion("FEED_EMPID like", value, "feedEmpid");
			return (Criteria) this;
		}

		public Criteria andFeedEmpidNotLike(String value) {
			addCriterion("FEED_EMPID not like", value, "feedEmpid");
			return (Criteria) this;
		}

		public Criteria andFeedEmpidIn(List<String> values) {
			addCriterion("FEED_EMPID in", values, "feedEmpid");
			return (Criteria) this;
		}

		public Criteria andFeedEmpidNotIn(List<String> values) {
			addCriterion("FEED_EMPID not in", values, "feedEmpid");
			return (Criteria) this;
		}

		public Criteria andFeedEmpidBetween(String value1, String value2) {
			addCriterion("FEED_EMPID between", value1, value2, "feedEmpid");
			return (Criteria) this;
		}

		public Criteria andFeedEmpidNotBetween(String value1, String value2) {
			addCriterion("FEED_EMPID not between", value1, value2, "feedEmpid");
			return (Criteria) this;
		}

		public Criteria andFeedEmpnameIsNull() {
			addCriterion("FEED_EMPNAME is null");
			return (Criteria) this;
		}

		public Criteria andFeedEmpnameIsNotNull() {
			addCriterion("FEED_EMPNAME is not null");
			return (Criteria) this;
		}

		public Criteria andFeedEmpnameEqualTo(String value) {
			addCriterion("FEED_EMPNAME =", value, "feedEmpname");
			return (Criteria) this;
		}

		public Criteria andFeedEmpnameNotEqualTo(String value) {
			addCriterion("FEED_EMPNAME <>", value, "feedEmpname");
			return (Criteria) this;
		}

		public Criteria andFeedEmpnameGreaterThan(String value) {
			addCriterion("FEED_EMPNAME >", value, "feedEmpname");
			return (Criteria) this;
		}

		public Criteria andFeedEmpnameGreaterThanOrEqualTo(String value) {
			addCriterion("FEED_EMPNAME >=", value, "feedEmpname");
			return (Criteria) this;
		}

		public Criteria andFeedEmpnameLessThan(String value) {
			addCriterion("FEED_EMPNAME <", value, "feedEmpname");
			return (Criteria) this;
		}

		public Criteria andFeedEmpnameLessThanOrEqualTo(String value) {
			addCriterion("FEED_EMPNAME <=", value, "feedEmpname");
			return (Criteria) this;
		}

		public Criteria andFeedEmpnameLike(String value) {
			addCriterion("FEED_EMPNAME like", value, "feedEmpname");
			return (Criteria) this;
		}

		public Criteria andFeedEmpnameNotLike(String value) {
			addCriterion("FEED_EMPNAME not like", value, "feedEmpname");
			return (Criteria) this;
		}

		public Criteria andFeedEmpnameIn(List<String> values) {
			addCriterion("FEED_EMPNAME in", values, "feedEmpname");
			return (Criteria) this;
		}

		public Criteria andFeedEmpnameNotIn(List<String> values) {
			addCriterion("FEED_EMPNAME not in", values, "feedEmpname");
			return (Criteria) this;
		}

		public Criteria andFeedEmpnameBetween(String value1, String value2) {
			addCriterion("FEED_EMPNAME between", value1, value2, "feedEmpname");
			return (Criteria) this;
		}

		public Criteria andFeedEmpnameNotBetween(String value1, String value2) {
			addCriterion("FEED_EMPNAME not between", value1, value2,
					"feedEmpname");
			return (Criteria) this;
		}

		public Criteria andFdContentIsNull() {
			addCriterion("FD_CONTENT is null");
			return (Criteria) this;
		}

		public Criteria andFdContentIsNotNull() {
			addCriterion("FD_CONTENT is not null");
			return (Criteria) this;
		}

		public Criteria andFdContentEqualTo(String value) {
			addCriterion("FD_CONTENT =", value, "fdContent");
			return (Criteria) this;
		}

		public Criteria andFdContentNotEqualTo(String value) {
			addCriterion("FD_CONTENT <>", value, "fdContent");
			return (Criteria) this;
		}

		public Criteria andFdContentGreaterThan(String value) {
			addCriterion("FD_CONTENT >", value, "fdContent");
			return (Criteria) this;
		}

		public Criteria andFdContentGreaterThanOrEqualTo(String value) {
			addCriterion("FD_CONTENT >=", value, "fdContent");
			return (Criteria) this;
		}

		public Criteria andFdContentLessThan(String value) {
			addCriterion("FD_CONTENT <", value, "fdContent");
			return (Criteria) this;
		}

		public Criteria andFdContentLessThanOrEqualTo(String value) {
			addCriterion("FD_CONTENT <=", value, "fdContent");
			return (Criteria) this;
		}

		public Criteria andFdContentLike(String value) {
			addCriterion("FD_CONTENT like", value, "fdContent");
			return (Criteria) this;
		}

		public Criteria andFdContentNotLike(String value) {
			addCriterion("FD_CONTENT not like", value, "fdContent");
			return (Criteria) this;
		}

		public Criteria andFdContentIn(List<String> values) {
			addCriterion("FD_CONTENT in", values, "fdContent");
			return (Criteria) this;
		}

		public Criteria andFdContentNotIn(List<String> values) {
			addCriterion("FD_CONTENT not in", values, "fdContent");
			return (Criteria) this;
		}

		public Criteria andFdContentBetween(String value1, String value2) {
			addCriterion("FD_CONTENT between", value1, value2, "fdContent");
			return (Criteria) this;
		}

		public Criteria andFdContentNotBetween(String value1, String value2) {
			addCriterion("FD_CONTENT not between", value1, value2, "fdContent");
			return (Criteria) this;
		}

		public Criteria andFdProcessIsNull() {
			addCriterion("FD_PROCESS is null");
			return (Criteria) this;
		}

		public Criteria andFdProcessIsNotNull() {
			addCriterion("FD_PROCESS is not null");
			return (Criteria) this;
		}

		public Criteria andFdProcessEqualTo(String value) {
			addCriterion("FD_PROCESS =", value, "fdProcess");
			return (Criteria) this;
		}

		public Criteria andFdProcessNotEqualTo(String value) {
			addCriterion("FD_PROCESS <>", value, "fdProcess");
			return (Criteria) this;
		}

		public Criteria andFdProcessGreaterThan(String value) {
			addCriterion("FD_PROCESS >", value, "fdProcess");
			return (Criteria) this;
		}

		public Criteria andFdProcessGreaterThanOrEqualTo(String value) {
			addCriterion("FD_PROCESS >=", value, "fdProcess");
			return (Criteria) this;
		}

		public Criteria andFdProcessLessThan(String value) {
			addCriterion("FD_PROCESS <", value, "fdProcess");
			return (Criteria) this;
		}

		public Criteria andFdProcessLessThanOrEqualTo(String value) {
			addCriterion("FD_PROCESS <=", value, "fdProcess");
			return (Criteria) this;
		}

		public Criteria andFdProcessLike(String value) {
			addCriterion("FD_PROCESS like", value, "fdProcess");
			return (Criteria) this;
		}

		public Criteria andFdProcessNotLike(String value) {
			addCriterion("FD_PROCESS not like", value, "fdProcess");
			return (Criteria) this;
		}

		public Criteria andFdProcessIn(List<String> values) {
			addCriterion("FD_PROCESS in", values, "fdProcess");
			return (Criteria) this;
		}

		public Criteria andFdProcessNotIn(List<String> values) {
			addCriterion("FD_PROCESS not in", values, "fdProcess");
			return (Criteria) this;
		}

		public Criteria andFdProcessBetween(String value1, String value2) {
			addCriterion("FD_PROCESS between", value1, value2, "fdProcess");
			return (Criteria) this;
		}

		public Criteria andFdProcessNotBetween(String value1, String value2) {
			addCriterion("FD_PROCESS not between", value1, value2, "fdProcess");
			return (Criteria) this;
		}

		public Criteria andFdTaskinfoIsNull() {
			addCriterion("FD_TASKINFO is null");
			return (Criteria) this;
		}

		public Criteria andFdTaskinfoIsNotNull() {
			addCriterion("FD_TASKINFO is not null");
			return (Criteria) this;
		}

		public Criteria andFdTaskinfoEqualTo(String value) {
			addCriterion("FD_TASKINFO =", value, "fdTaskinfo");
			return (Criteria) this;
		}

		public Criteria andFdTaskinfoNotEqualTo(String value) {
			addCriterion("FD_TASKINFO <>", value, "fdTaskinfo");
			return (Criteria) this;
		}

		public Criteria andFdTaskinfoGreaterThan(String value) {
			addCriterion("FD_TASKINFO >", value, "fdTaskinfo");
			return (Criteria) this;
		}

		public Criteria andFdTaskinfoGreaterThanOrEqualTo(String value) {
			addCriterion("FD_TASKINFO >=", value, "fdTaskinfo");
			return (Criteria) this;
		}

		public Criteria andFdTaskinfoLessThan(String value) {
			addCriterion("FD_TASKINFO <", value, "fdTaskinfo");
			return (Criteria) this;
		}

		public Criteria andFdTaskinfoLessThanOrEqualTo(String value) {
			addCriterion("FD_TASKINFO <=", value, "fdTaskinfo");
			return (Criteria) this;
		}

		public Criteria andFdTaskinfoLike(String value) {
			addCriterion("FD_TASKINFO like", value, "fdTaskinfo");
			return (Criteria) this;
		}

		public Criteria andFdTaskinfoNotLike(String value) {
			addCriterion("FD_TASKINFO not like", value, "fdTaskinfo");
			return (Criteria) this;
		}

		public Criteria andFdTaskinfoIn(List<String> values) {
			addCriterion("FD_TASKINFO in", values, "fdTaskinfo");
			return (Criteria) this;
		}

		public Criteria andFdTaskinfoNotIn(List<String> values) {
			addCriterion("FD_TASKINFO not in", values, "fdTaskinfo");
			return (Criteria) this;
		}

		public Criteria andFdTaskinfoBetween(String value1, String value2) {
			addCriterion("FD_TASKINFO between", value1, value2, "fdTaskinfo");
			return (Criteria) this;
		}

		public Criteria andFdTaskinfoNotBetween(String value1, String value2) {
			addCriterion("FD_TASKINFO not between", value1, value2,
					"fdTaskinfo");
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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