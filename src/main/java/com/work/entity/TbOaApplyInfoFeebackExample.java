package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TbOaApplyInfoFeebackExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbOaApplyInfoFeebackExample() {
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

		public Criteria andFdActiveidIsNull() {
			addCriterion("FD_ACTIVEID is null");
			return (Criteria) this;
		}

		public Criteria andFdActiveidIsNotNull() {
			addCriterion("FD_ACTIVEID is not null");
			return (Criteria) this;
		}

		public Criteria andFdActiveidEqualTo(String value) {
			addCriterion("FD_ACTIVEID =", value, "fdActiveid");
			return (Criteria) this;
		}

		public Criteria andFdActiveidNotEqualTo(String value) {
			addCriterion("FD_ACTIVEID <>", value, "fdActiveid");
			return (Criteria) this;
		}

		public Criteria andFdActiveidGreaterThan(String value) {
			addCriterion("FD_ACTIVEID >", value, "fdActiveid");
			return (Criteria) this;
		}

		public Criteria andFdActiveidGreaterThanOrEqualTo(String value) {
			addCriterion("FD_ACTIVEID >=", value, "fdActiveid");
			return (Criteria) this;
		}

		public Criteria andFdActiveidLessThan(String value) {
			addCriterion("FD_ACTIVEID <", value, "fdActiveid");
			return (Criteria) this;
		}

		public Criteria andFdActiveidLessThanOrEqualTo(String value) {
			addCriterion("FD_ACTIVEID <=", value, "fdActiveid");
			return (Criteria) this;
		}

		public Criteria andFdActiveidLike(String value) {
			addCriterion("FD_ACTIVEID like", value, "fdActiveid");
			return (Criteria) this;
		}

		public Criteria andFdActiveidNotLike(String value) {
			addCriterion("FD_ACTIVEID not like", value, "fdActiveid");
			return (Criteria) this;
		}

		public Criteria andFdActiveidIn(List<String> values) {
			addCriterion("FD_ACTIVEID in", values, "fdActiveid");
			return (Criteria) this;
		}

		public Criteria andFdActiveidNotIn(List<String> values) {
			addCriterion("FD_ACTIVEID not in", values, "fdActiveid");
			return (Criteria) this;
		}

		public Criteria andFdActiveidBetween(String value1, String value2) {
			addCriterion("FD_ACTIVEID between", value1, value2, "fdActiveid");
			return (Criteria) this;
		}

		public Criteria andFdActiveidNotBetween(String value1, String value2) {
			addCriterion("FD_ACTIVEID not between", value1, value2,
					"fdActiveid");
			return (Criteria) this;
		}

		public Criteria andFdUsernameIsNull() {
			addCriterion("FD_USERNAME is null");
			return (Criteria) this;
		}

		public Criteria andFdUsernameIsNotNull() {
			addCriterion("FD_USERNAME is not null");
			return (Criteria) this;
		}

		public Criteria andFdUsernameEqualTo(String value) {
			addCriterion("FD_USERNAME =", value, "fdUsername");
			return (Criteria) this;
		}

		public Criteria andFdUsernameNotEqualTo(String value) {
			addCriterion("FD_USERNAME <>", value, "fdUsername");
			return (Criteria) this;
		}

		public Criteria andFdUsernameGreaterThan(String value) {
			addCriterion("FD_USERNAME >", value, "fdUsername");
			return (Criteria) this;
		}

		public Criteria andFdUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("FD_USERNAME >=", value, "fdUsername");
			return (Criteria) this;
		}

		public Criteria andFdUsernameLessThan(String value) {
			addCriterion("FD_USERNAME <", value, "fdUsername");
			return (Criteria) this;
		}

		public Criteria andFdUsernameLessThanOrEqualTo(String value) {
			addCriterion("FD_USERNAME <=", value, "fdUsername");
			return (Criteria) this;
		}

		public Criteria andFdUsernameLike(String value) {
			addCriterion("FD_USERNAME like", value, "fdUsername");
			return (Criteria) this;
		}

		public Criteria andFdUsernameNotLike(String value) {
			addCriterion("FD_USERNAME not like", value, "fdUsername");
			return (Criteria) this;
		}

		public Criteria andFdUsernameIn(List<String> values) {
			addCriterion("FD_USERNAME in", values, "fdUsername");
			return (Criteria) this;
		}

		public Criteria andFdUsernameNotIn(List<String> values) {
			addCriterion("FD_USERNAME not in", values, "fdUsername");
			return (Criteria) this;
		}

		public Criteria andFdUsernameBetween(String value1, String value2) {
			addCriterion("FD_USERNAME between", value1, value2, "fdUsername");
			return (Criteria) this;
		}

		public Criteria andFdUsernameNotBetween(String value1, String value2) {
			addCriterion("FD_USERNAME not between", value1, value2,
					"fdUsername");
			return (Criteria) this;
		}

		public Criteria andFdFeeTimeIsNull() {
			addCriterion("FD_FEE_TIME is null");
			return (Criteria) this;
		}

		public Criteria andFdFeeTimeIsNotNull() {
			addCriterion("FD_FEE_TIME is not null");
			return (Criteria) this;
		}

		public Criteria andFdFeeTimeEqualTo(String value) {
			addCriterion("FD_FEE_TIME =", value, "fdFeeTime");
			return (Criteria) this;
		}

		public Criteria andFdFeeTimeNotEqualTo(String value) {
			addCriterion("FD_FEE_TIME <>", value, "fdFeeTime");
			return (Criteria) this;
		}

		public Criteria andFdFeeTimeGreaterThan(String value) {
			addCriterion("FD_FEE_TIME >", value, "fdFeeTime");
			return (Criteria) this;
		}

		public Criteria andFdFeeTimeGreaterThanOrEqualTo(String value) {
			addCriterion("FD_FEE_TIME >=", value, "fdFeeTime");
			return (Criteria) this;
		}

		public Criteria andFdFeeTimeLessThan(String value) {
			addCriterion("FD_FEE_TIME <", value, "fdFeeTime");
			return (Criteria) this;
		}

		public Criteria andFdFeeTimeLessThanOrEqualTo(String value) {
			addCriterion("FD_FEE_TIME <=", value, "fdFeeTime");
			return (Criteria) this;
		}

		public Criteria andFdFeeTimeLike(String value) {
			addCriterion("FD_FEE_TIME like", value, "fdFeeTime");
			return (Criteria) this;
		}

		public Criteria andFdFeeTimeNotLike(String value) {
			addCriterion("FD_FEE_TIME not like", value, "fdFeeTime");
			return (Criteria) this;
		}

		public Criteria andFdFeeTimeIn(List<String> values) {
			addCriterion("FD_FEE_TIME in", values, "fdFeeTime");
			return (Criteria) this;
		}

		public Criteria andFdFeeTimeNotIn(List<String> values) {
			addCriterion("FD_FEE_TIME not in", values, "fdFeeTime");
			return (Criteria) this;
		}

		public Criteria andFdFeeTimeBetween(String value1, String value2) {
			addCriterion("FD_FEE_TIME between", value1, value2, "fdFeeTime");
			return (Criteria) this;
		}

		public Criteria andFdFeeTimeNotBetween(String value1, String value2) {
			addCriterion("FD_FEE_TIME not between", value1, value2, "fdFeeTime");
			return (Criteria) this;
		}

		public Criteria andFdScoreIsNull() {
			addCriterion("FD_SCORE is null");
			return (Criteria) this;
		}

		public Criteria andFdScoreIsNotNull() {
			addCriterion("FD_SCORE is not null");
			return (Criteria) this;
		}

		public Criteria andFdScoreEqualTo(String value) {
			addCriterion("FD_SCORE =", value, "fdScore");
			return (Criteria) this;
		}

		public Criteria andFdScoreNotEqualTo(String value) {
			addCriterion("FD_SCORE <>", value, "fdScore");
			return (Criteria) this;
		}

		public Criteria andFdScoreGreaterThan(String value) {
			addCriterion("FD_SCORE >", value, "fdScore");
			return (Criteria) this;
		}

		public Criteria andFdScoreGreaterThanOrEqualTo(String value) {
			addCriterion("FD_SCORE >=", value, "fdScore");
			return (Criteria) this;
		}

		public Criteria andFdScoreLessThan(String value) {
			addCriterion("FD_SCORE <", value, "fdScore");
			return (Criteria) this;
		}

		public Criteria andFdScoreLessThanOrEqualTo(String value) {
			addCriterion("FD_SCORE <=", value, "fdScore");
			return (Criteria) this;
		}

		public Criteria andFdScoreLike(String value) {
			addCriterion("FD_SCORE like", value, "fdScore");
			return (Criteria) this;
		}

		public Criteria andFdScoreNotLike(String value) {
			addCriterion("FD_SCORE not like", value, "fdScore");
			return (Criteria) this;
		}

		public Criteria andFdScoreIn(List<String> values) {
			addCriterion("FD_SCORE in", values, "fdScore");
			return (Criteria) this;
		}

		public Criteria andFdScoreNotIn(List<String> values) {
			addCriterion("FD_SCORE not in", values, "fdScore");
			return (Criteria) this;
		}

		public Criteria andFdScoreBetween(String value1, String value2) {
			addCriterion("FD_SCORE between", value1, value2, "fdScore");
			return (Criteria) this;
		}

		public Criteria andFdScoreNotBetween(String value1, String value2) {
			addCriterion("FD_SCORE not between", value1, value2, "fdScore");
			return (Criteria) this;
		}

		public Criteria andFdFeeContentIsNull() {
			addCriterion("FD_FEE_CONTENT is null");
			return (Criteria) this;
		}

		public Criteria andFdFeeContentIsNotNull() {
			addCriterion("FD_FEE_CONTENT is not null");
			return (Criteria) this;
		}

		public Criteria andFdFeeContentEqualTo(String value) {
			addCriterion("FD_FEE_CONTENT =", value, "fdFeeContent");
			return (Criteria) this;
		}

		public Criteria andFdFeeContentNotEqualTo(String value) {
			addCriterion("FD_FEE_CONTENT <>", value, "fdFeeContent");
			return (Criteria) this;
		}

		public Criteria andFdFeeContentGreaterThan(String value) {
			addCriterion("FD_FEE_CONTENT >", value, "fdFeeContent");
			return (Criteria) this;
		}

		public Criteria andFdFeeContentGreaterThanOrEqualTo(String value) {
			addCriterion("FD_FEE_CONTENT >=", value, "fdFeeContent");
			return (Criteria) this;
		}

		public Criteria andFdFeeContentLessThan(String value) {
			addCriterion("FD_FEE_CONTENT <", value, "fdFeeContent");
			return (Criteria) this;
		}

		public Criteria andFdFeeContentLessThanOrEqualTo(String value) {
			addCriterion("FD_FEE_CONTENT <=", value, "fdFeeContent");
			return (Criteria) this;
		}

		public Criteria andFdFeeContentLike(String value) {
			addCriterion("FD_FEE_CONTENT like", value, "fdFeeContent");
			return (Criteria) this;
		}

		public Criteria andFdFeeContentNotLike(String value) {
			addCriterion("FD_FEE_CONTENT not like", value, "fdFeeContent");
			return (Criteria) this;
		}

		public Criteria andFdFeeContentIn(List<String> values) {
			addCriterion("FD_FEE_CONTENT in", values, "fdFeeContent");
			return (Criteria) this;
		}

		public Criteria andFdFeeContentNotIn(List<String> values) {
			addCriterion("FD_FEE_CONTENT not in", values, "fdFeeContent");
			return (Criteria) this;
		}

		public Criteria andFdFeeContentBetween(String value1, String value2) {
			addCriterion("FD_FEE_CONTENT between", value1, value2,
					"fdFeeContent");
			return (Criteria) this;
		}

		public Criteria andFdFeeContentNotBetween(String value1, String value2) {
			addCriterion("FD_FEE_CONTENT not between", value1, value2,
					"fdFeeContent");
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