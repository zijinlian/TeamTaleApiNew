package com.work.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TPubAttachrelExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TPubAttachrelExample() {
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

		public Criteria andFdAttachrelidIsNull() {
			addCriterion("FD_ATTACHRELID is null");
			return (Criteria) this;
		}

		public Criteria andFdAttachrelidIsNotNull() {
			addCriterion("FD_ATTACHRELID is not null");
			return (Criteria) this;
		}

		public Criteria andFdAttachrelidEqualTo(String value) {
			addCriterion("FD_ATTACHRELID =", value, "fdAttachrelid");
			return (Criteria) this;
		}

		public Criteria andFdAttachrelidNotEqualTo(String value) {
			addCriterion("FD_ATTACHRELID <>", value, "fdAttachrelid");
			return (Criteria) this;
		}

		public Criteria andFdAttachrelidGreaterThan(String value) {
			addCriterion("FD_ATTACHRELID >", value, "fdAttachrelid");
			return (Criteria) this;
		}

		public Criteria andFdAttachrelidGreaterThanOrEqualTo(String value) {
			addCriterion("FD_ATTACHRELID >=", value, "fdAttachrelid");
			return (Criteria) this;
		}

		public Criteria andFdAttachrelidLessThan(String value) {
			addCriterion("FD_ATTACHRELID <", value, "fdAttachrelid");
			return (Criteria) this;
		}

		public Criteria andFdAttachrelidLessThanOrEqualTo(String value) {
			addCriterion("FD_ATTACHRELID <=", value, "fdAttachrelid");
			return (Criteria) this;
		}

		public Criteria andFdAttachrelidLike(String value) {
			addCriterion("FD_ATTACHRELID like", value, "fdAttachrelid");
			return (Criteria) this;
		}

		public Criteria andFdAttachrelidNotLike(String value) {
			addCriterion("FD_ATTACHRELID not like", value, "fdAttachrelid");
			return (Criteria) this;
		}

		public Criteria andFdAttachrelidIn(List<String> values) {
			addCriterion("FD_ATTACHRELID in", values, "fdAttachrelid");
			return (Criteria) this;
		}

		public Criteria andFdAttachrelidNotIn(List<String> values) {
			addCriterion("FD_ATTACHRELID not in", values, "fdAttachrelid");
			return (Criteria) this;
		}

		public Criteria andFdAttachrelidBetween(String value1, String value2) {
			addCriterion("FD_ATTACHRELID between", value1, value2,
					"fdAttachrelid");
			return (Criteria) this;
		}

		public Criteria andFdAttachrelidNotBetween(String value1, String value2) {
			addCriterion("FD_ATTACHRELID not between", value1, value2,
					"fdAttachrelid");
			return (Criteria) this;
		}

		public Criteria andFdAttachidIsNull() {
			addCriterion("FD_ATTACHID is null");
			return (Criteria) this;
		}

		public Criteria andFdAttachidIsNotNull() {
			addCriterion("FD_ATTACHID is not null");
			return (Criteria) this;
		}

		public Criteria andFdAttachidEqualTo(String value) {
			addCriterion("FD_ATTACHID =", value, "fdAttachid");
			return (Criteria) this;
		}

		public Criteria andFdAttachidNotEqualTo(String value) {
			addCriterion("FD_ATTACHID <>", value, "fdAttachid");
			return (Criteria) this;
		}

		public Criteria andFdAttachidGreaterThan(String value) {
			addCriterion("FD_ATTACHID >", value, "fdAttachid");
			return (Criteria) this;
		}

		public Criteria andFdAttachidGreaterThanOrEqualTo(String value) {
			addCriterion("FD_ATTACHID >=", value, "fdAttachid");
			return (Criteria) this;
		}

		public Criteria andFdAttachidLessThan(String value) {
			addCriterion("FD_ATTACHID <", value, "fdAttachid");
			return (Criteria) this;
		}

		public Criteria andFdAttachidLessThanOrEqualTo(String value) {
			addCriterion("FD_ATTACHID <=", value, "fdAttachid");
			return (Criteria) this;
		}

		public Criteria andFdAttachidLike(String value) {
			addCriterion("FD_ATTACHID like", value, "fdAttachid");
			return (Criteria) this;
		}

		public Criteria andFdAttachidNotLike(String value) {
			addCriterion("FD_ATTACHID not like", value, "fdAttachid");
			return (Criteria) this;
		}

		public Criteria andFdAttachidIn(List<String> values) {
			addCriterion("FD_ATTACHID in", values, "fdAttachid");
			return (Criteria) this;
		}

		public Criteria andFdAttachidNotIn(List<String> values) {
			addCriterion("FD_ATTACHID not in", values, "fdAttachid");
			return (Criteria) this;
		}

		public Criteria andFdAttachidBetween(String value1, String value2) {
			addCriterion("FD_ATTACHID between", value1, value2, "fdAttachid");
			return (Criteria) this;
		}

		public Criteria andFdAttachidNotBetween(String value1, String value2) {
			addCriterion("FD_ATTACHID not between", value1, value2,
					"fdAttachid");
			return (Criteria) this;
		}

		public Criteria andFdAttachtypIsNull() {
			addCriterion("FD_ATTACHTYP is null");
			return (Criteria) this;
		}

		public Criteria andFdAttachtypIsNotNull() {
			addCriterion("FD_ATTACHTYP is not null");
			return (Criteria) this;
		}

		public Criteria andFdAttachtypEqualTo(String value) {
			addCriterion("FD_ATTACHTYP =", value, "fdAttachtyp");
			return (Criteria) this;
		}

		public Criteria andFdAttachtypNotEqualTo(String value) {
			addCriterion("FD_ATTACHTYP <>", value, "fdAttachtyp");
			return (Criteria) this;
		}

		public Criteria andFdAttachtypGreaterThan(String value) {
			addCriterion("FD_ATTACHTYP >", value, "fdAttachtyp");
			return (Criteria) this;
		}

		public Criteria andFdAttachtypGreaterThanOrEqualTo(String value) {
			addCriterion("FD_ATTACHTYP >=", value, "fdAttachtyp");
			return (Criteria) this;
		}

		public Criteria andFdAttachtypLessThan(String value) {
			addCriterion("FD_ATTACHTYP <", value, "fdAttachtyp");
			return (Criteria) this;
		}

		public Criteria andFdAttachtypLessThanOrEqualTo(String value) {
			addCriterion("FD_ATTACHTYP <=", value, "fdAttachtyp");
			return (Criteria) this;
		}

		public Criteria andFdAttachtypLike(String value) {
			addCriterion("FD_ATTACHTYP like", value, "fdAttachtyp");
			return (Criteria) this;
		}

		public Criteria andFdAttachtypNotLike(String value) {
			addCriterion("FD_ATTACHTYP not like", value, "fdAttachtyp");
			return (Criteria) this;
		}

		public Criteria andFdAttachtypIn(List<String> values) {
			addCriterion("FD_ATTACHTYP in", values, "fdAttachtyp");
			return (Criteria) this;
		}

		public Criteria andFdAttachtypNotIn(List<String> values) {
			addCriterion("FD_ATTACHTYP not in", values, "fdAttachtyp");
			return (Criteria) this;
		}

		public Criteria andFdAttachtypBetween(String value1, String value2) {
			addCriterion("FD_ATTACHTYP between", value1, value2, "fdAttachtyp");
			return (Criteria) this;
		}

		public Criteria andFdAttachtypNotBetween(String value1, String value2) {
			addCriterion("FD_ATTACHTYP not between", value1, value2,
					"fdAttachtyp");
			return (Criteria) this;
		}

		public Criteria andFdAttachdesIsNull() {
			addCriterion("FD_ATTACHDES is null");
			return (Criteria) this;
		}

		public Criteria andFdAttachdesIsNotNull() {
			addCriterion("FD_ATTACHDES is not null");
			return (Criteria) this;
		}

		public Criteria andFdAttachdesEqualTo(String value) {
			addCriterion("FD_ATTACHDES =", value, "fdAttachdes");
			return (Criteria) this;
		}

		public Criteria andFdAttachdesNotEqualTo(String value) {
			addCriterion("FD_ATTACHDES <>", value, "fdAttachdes");
			return (Criteria) this;
		}

		public Criteria andFdAttachdesGreaterThan(String value) {
			addCriterion("FD_ATTACHDES >", value, "fdAttachdes");
			return (Criteria) this;
		}

		public Criteria andFdAttachdesGreaterThanOrEqualTo(String value) {
			addCriterion("FD_ATTACHDES >=", value, "fdAttachdes");
			return (Criteria) this;
		}

		public Criteria andFdAttachdesLessThan(String value) {
			addCriterion("FD_ATTACHDES <", value, "fdAttachdes");
			return (Criteria) this;
		}

		public Criteria andFdAttachdesLessThanOrEqualTo(String value) {
			addCriterion("FD_ATTACHDES <=", value, "fdAttachdes");
			return (Criteria) this;
		}

		public Criteria andFdAttachdesLike(String value) {
			addCriterion("FD_ATTACHDES like", value, "fdAttachdes");
			return (Criteria) this;
		}

		public Criteria andFdAttachdesNotLike(String value) {
			addCriterion("FD_ATTACHDES not like", value, "fdAttachdes");
			return (Criteria) this;
		}

		public Criteria andFdAttachdesIn(List<String> values) {
			addCriterion("FD_ATTACHDES in", values, "fdAttachdes");
			return (Criteria) this;
		}

		public Criteria andFdAttachdesNotIn(List<String> values) {
			addCriterion("FD_ATTACHDES not in", values, "fdAttachdes");
			return (Criteria) this;
		}

		public Criteria andFdAttachdesBetween(String value1, String value2) {
			addCriterion("FD_ATTACHDES between", value1, value2, "fdAttachdes");
			return (Criteria) this;
		}

		public Criteria andFdAttachdesNotBetween(String value1, String value2) {
			addCriterion("FD_ATTACHDES not between", value1, value2,
					"fdAttachdes");
			return (Criteria) this;
		}

		public Criteria andFdRectmodifierIsNull() {
			addCriterion("FD_RECTMODIFIER is null");
			return (Criteria) this;
		}

		public Criteria andFdRectmodifierIsNotNull() {
			addCriterion("FD_RECTMODIFIER is not null");
			return (Criteria) this;
		}

		public Criteria andFdRectmodifierEqualTo(String value) {
			addCriterion("FD_RECTMODIFIER =", value, "fdRectmodifier");
			return (Criteria) this;
		}

		public Criteria andFdRectmodifierNotEqualTo(String value) {
			addCriterion("FD_RECTMODIFIER <>", value, "fdRectmodifier");
			return (Criteria) this;
		}

		public Criteria andFdRectmodifierGreaterThan(String value) {
			addCriterion("FD_RECTMODIFIER >", value, "fdRectmodifier");
			return (Criteria) this;
		}

		public Criteria andFdRectmodifierGreaterThanOrEqualTo(String value) {
			addCriterion("FD_RECTMODIFIER >=", value, "fdRectmodifier");
			return (Criteria) this;
		}

		public Criteria andFdRectmodifierLessThan(String value) {
			addCriterion("FD_RECTMODIFIER <", value, "fdRectmodifier");
			return (Criteria) this;
		}

		public Criteria andFdRectmodifierLessThanOrEqualTo(String value) {
			addCriterion("FD_RECTMODIFIER <=", value, "fdRectmodifier");
			return (Criteria) this;
		}

		public Criteria andFdRectmodifierLike(String value) {
			addCriterion("FD_RECTMODIFIER like", value, "fdRectmodifier");
			return (Criteria) this;
		}

		public Criteria andFdRectmodifierNotLike(String value) {
			addCriterion("FD_RECTMODIFIER not like", value, "fdRectmodifier");
			return (Criteria) this;
		}

		public Criteria andFdRectmodifierIn(List<String> values) {
			addCriterion("FD_RECTMODIFIER in", values, "fdRectmodifier");
			return (Criteria) this;
		}

		public Criteria andFdRectmodifierNotIn(List<String> values) {
			addCriterion("FD_RECTMODIFIER not in", values, "fdRectmodifier");
			return (Criteria) this;
		}

		public Criteria andFdRectmodifierBetween(String value1, String value2) {
			addCriterion("FD_RECTMODIFIER between", value1, value2,
					"fdRectmodifier");
			return (Criteria) this;
		}

		public Criteria andFdRectmodifierNotBetween(String value1, String value2) {
			addCriterion("FD_RECTMODIFIER not between", value1, value2,
					"fdRectmodifier");
			return (Criteria) this;
		}

		public Criteria andFdRectmodiftimeIsNull() {
			addCriterion("FD_RECTMODIFTIME is null");
			return (Criteria) this;
		}

		public Criteria andFdRectmodiftimeIsNotNull() {
			addCriterion("FD_RECTMODIFTIME is not null");
			return (Criteria) this;
		}

		public Criteria andFdRectmodiftimeEqualTo(String value) {
			addCriterion("FD_RECTMODIFTIME =", value, "fdRectmodiftime");
			return (Criteria) this;
		}

		public Criteria andFdRectmodiftimeNotEqualTo(String value) {
			addCriterion("FD_RECTMODIFTIME <>", value, "fdRectmodiftime");
			return (Criteria) this;
		}

		public Criteria andFdRectmodiftimeGreaterThan(String value) {
			addCriterion("FD_RECTMODIFTIME >", value, "fdRectmodiftime");
			return (Criteria) this;
		}

		public Criteria andFdRectmodiftimeGreaterThanOrEqualTo(String value) {
			addCriterion("FD_RECTMODIFTIME >=", value, "fdRectmodiftime");
			return (Criteria) this;
		}

		public Criteria andFdRectmodiftimeLessThan(String value) {
			addCriterion("FD_RECTMODIFTIME <", value, "fdRectmodiftime");
			return (Criteria) this;
		}

		public Criteria andFdRectmodiftimeLessThanOrEqualTo(String value) {
			addCriterion("FD_RECTMODIFTIME <=", value, "fdRectmodiftime");
			return (Criteria) this;
		}

		public Criteria andFdRectmodiftimeLike(String value) {
			addCriterion("FD_RECTMODIFTIME like", value, "fdRectmodiftime");
			return (Criteria) this;
		}

		public Criteria andFdRectmodiftimeNotLike(String value) {
			addCriterion("FD_RECTMODIFTIME not like", value, "fdRectmodiftime");
			return (Criteria) this;
		}

		public Criteria andFdRectmodiftimeIn(List<String> values) {
			addCriterion("FD_RECTMODIFTIME in", values, "fdRectmodiftime");
			return (Criteria) this;
		}

		public Criteria andFdRectmodiftimeNotIn(List<String> values) {
			addCriterion("FD_RECTMODIFTIME not in", values, "fdRectmodiftime");
			return (Criteria) this;
		}

		public Criteria andFdRectmodiftimeBetween(String value1, String value2) {
			addCriterion("FD_RECTMODIFTIME between", value1, value2,
					"fdRectmodiftime");
			return (Criteria) this;
		}

		public Criteria andFdRectmodiftimeNotBetween(String value1,
				String value2) {
			addCriterion("FD_RECTMODIFTIME not between", value1, value2,
					"fdRectmodiftime");
			return (Criteria) this;
		}

		public Criteria andFdValidflagIsNull() {
			addCriterion("FD_VALIDFLAG is null");
			return (Criteria) this;
		}

		public Criteria andFdValidflagIsNotNull() {
			addCriterion("FD_VALIDFLAG is not null");
			return (Criteria) this;
		}

		public Criteria andFdValidflagEqualTo(BigDecimal value) {
			addCriterion("FD_VALIDFLAG =", value, "fdValidflag");
			return (Criteria) this;
		}

		public Criteria andFdValidflagNotEqualTo(BigDecimal value) {
			addCriterion("FD_VALIDFLAG <>", value, "fdValidflag");
			return (Criteria) this;
		}

		public Criteria andFdValidflagGreaterThan(BigDecimal value) {
			addCriterion("FD_VALIDFLAG >", value, "fdValidflag");
			return (Criteria) this;
		}

		public Criteria andFdValidflagGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("FD_VALIDFLAG >=", value, "fdValidflag");
			return (Criteria) this;
		}

		public Criteria andFdValidflagLessThan(BigDecimal value) {
			addCriterion("FD_VALIDFLAG <", value, "fdValidflag");
			return (Criteria) this;
		}

		public Criteria andFdValidflagLessThanOrEqualTo(BigDecimal value) {
			addCriterion("FD_VALIDFLAG <=", value, "fdValidflag");
			return (Criteria) this;
		}

		public Criteria andFdValidflagIn(List<BigDecimal> values) {
			addCriterion("FD_VALIDFLAG in", values, "fdValidflag");
			return (Criteria) this;
		}

		public Criteria andFdValidflagNotIn(List<BigDecimal> values) {
			addCriterion("FD_VALIDFLAG not in", values, "fdValidflag");
			return (Criteria) this;
		}

		public Criteria andFdValidflagBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("FD_VALIDFLAG between", value1, value2, "fdValidflag");
			return (Criteria) this;
		}

		public Criteria andFdValidflagNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("FD_VALIDFLAG not between", value1, value2,
					"fdValidflag");
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