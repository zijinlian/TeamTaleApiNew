package com.work.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TPubAttachinfoExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TPubAttachinfoExample() {
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

		public Criteria andFdSourcenmeIsNull() {
			addCriterion("FD_SOURCENME is null");
			return (Criteria) this;
		}

		public Criteria andFdSourcenmeIsNotNull() {
			addCriterion("FD_SOURCENME is not null");
			return (Criteria) this;
		}

		public Criteria andFdSourcenmeEqualTo(String value) {
			addCriterion("FD_SOURCENME =", value, "fdSourcenme");
			return (Criteria) this;
		}

		public Criteria andFdSourcenmeNotEqualTo(String value) {
			addCriterion("FD_SOURCENME <>", value, "fdSourcenme");
			return (Criteria) this;
		}

		public Criteria andFdSourcenmeGreaterThan(String value) {
			addCriterion("FD_SOURCENME >", value, "fdSourcenme");
			return (Criteria) this;
		}

		public Criteria andFdSourcenmeGreaterThanOrEqualTo(String value) {
			addCriterion("FD_SOURCENME >=", value, "fdSourcenme");
			return (Criteria) this;
		}

		public Criteria andFdSourcenmeLessThan(String value) {
			addCriterion("FD_SOURCENME <", value, "fdSourcenme");
			return (Criteria) this;
		}

		public Criteria andFdSourcenmeLessThanOrEqualTo(String value) {
			addCriterion("FD_SOURCENME <=", value, "fdSourcenme");
			return (Criteria) this;
		}

		public Criteria andFdSourcenmeLike(String value) {
			addCriterion("FD_SOURCENME like", value, "fdSourcenme");
			return (Criteria) this;
		}

		public Criteria andFdSourcenmeNotLike(String value) {
			addCriterion("FD_SOURCENME not like", value, "fdSourcenme");
			return (Criteria) this;
		}

		public Criteria andFdSourcenmeIn(List<String> values) {
			addCriterion("FD_SOURCENME in", values, "fdSourcenme");
			return (Criteria) this;
		}

		public Criteria andFdSourcenmeNotIn(List<String> values) {
			addCriterion("FD_SOURCENME not in", values, "fdSourcenme");
			return (Criteria) this;
		}

		public Criteria andFdSourcenmeBetween(String value1, String value2) {
			addCriterion("FD_SOURCENME between", value1, value2, "fdSourcenme");
			return (Criteria) this;
		}

		public Criteria andFdSourcenmeNotBetween(String value1, String value2) {
			addCriterion("FD_SOURCENME not between", value1, value2,
					"fdSourcenme");
			return (Criteria) this;
		}

		public Criteria andFdNewnmeIsNull() {
			addCriterion("FD_NEWNME is null");
			return (Criteria) this;
		}

		public Criteria andFdNewnmeIsNotNull() {
			addCriterion("FD_NEWNME is not null");
			return (Criteria) this;
		}

		public Criteria andFdNewnmeEqualTo(String value) {
			addCriterion("FD_NEWNME =", value, "fdNewnme");
			return (Criteria) this;
		}

		public Criteria andFdNewnmeNotEqualTo(String value) {
			addCriterion("FD_NEWNME <>", value, "fdNewnme");
			return (Criteria) this;
		}

		public Criteria andFdNewnmeGreaterThan(String value) {
			addCriterion("FD_NEWNME >", value, "fdNewnme");
			return (Criteria) this;
		}

		public Criteria andFdNewnmeGreaterThanOrEqualTo(String value) {
			addCriterion("FD_NEWNME >=", value, "fdNewnme");
			return (Criteria) this;
		}

		public Criteria andFdNewnmeLessThan(String value) {
			addCriterion("FD_NEWNME <", value, "fdNewnme");
			return (Criteria) this;
		}

		public Criteria andFdNewnmeLessThanOrEqualTo(String value) {
			addCriterion("FD_NEWNME <=", value, "fdNewnme");
			return (Criteria) this;
		}

		public Criteria andFdNewnmeLike(String value) {
			addCriterion("FD_NEWNME like", value, "fdNewnme");
			return (Criteria) this;
		}

		public Criteria andFdNewnmeNotLike(String value) {
			addCriterion("FD_NEWNME not like", value, "fdNewnme");
			return (Criteria) this;
		}

		public Criteria andFdNewnmeIn(List<String> values) {
			addCriterion("FD_NEWNME in", values, "fdNewnme");
			return (Criteria) this;
		}

		public Criteria andFdNewnmeNotIn(List<String> values) {
			addCriterion("FD_NEWNME not in", values, "fdNewnme");
			return (Criteria) this;
		}

		public Criteria andFdNewnmeBetween(String value1, String value2) {
			addCriterion("FD_NEWNME between", value1, value2, "fdNewnme");
			return (Criteria) this;
		}

		public Criteria andFdNewnmeNotBetween(String value1, String value2) {
			addCriterion("FD_NEWNME not between", value1, value2, "fdNewnme");
			return (Criteria) this;
		}

		public Criteria andFdStorepathIsNull() {
			addCriterion("FD_STOREPATH is null");
			return (Criteria) this;
		}

		public Criteria andFdStorepathIsNotNull() {
			addCriterion("FD_STOREPATH is not null");
			return (Criteria) this;
		}

		public Criteria andFdStorepathEqualTo(String value) {
			addCriterion("FD_STOREPATH =", value, "fdStorepath");
			return (Criteria) this;
		}

		public Criteria andFdStorepathNotEqualTo(String value) {
			addCriterion("FD_STOREPATH <>", value, "fdStorepath");
			return (Criteria) this;
		}

		public Criteria andFdStorepathGreaterThan(String value) {
			addCriterion("FD_STOREPATH >", value, "fdStorepath");
			return (Criteria) this;
		}

		public Criteria andFdStorepathGreaterThanOrEqualTo(String value) {
			addCriterion("FD_STOREPATH >=", value, "fdStorepath");
			return (Criteria) this;
		}

		public Criteria andFdStorepathLessThan(String value) {
			addCriterion("FD_STOREPATH <", value, "fdStorepath");
			return (Criteria) this;
		}

		public Criteria andFdStorepathLessThanOrEqualTo(String value) {
			addCriterion("FD_STOREPATH <=", value, "fdStorepath");
			return (Criteria) this;
		}

		public Criteria andFdStorepathLike(String value) {
			addCriterion("FD_STOREPATH like", value, "fdStorepath");
			return (Criteria) this;
		}

		public Criteria andFdStorepathNotLike(String value) {
			addCriterion("FD_STOREPATH not like", value, "fdStorepath");
			return (Criteria) this;
		}

		public Criteria andFdStorepathIn(List<String> values) {
			addCriterion("FD_STOREPATH in", values, "fdStorepath");
			return (Criteria) this;
		}

		public Criteria andFdStorepathNotIn(List<String> values) {
			addCriterion("FD_STOREPATH not in", values, "fdStorepath");
			return (Criteria) this;
		}

		public Criteria andFdStorepathBetween(String value1, String value2) {
			addCriterion("FD_STOREPATH between", value1, value2, "fdStorepath");
			return (Criteria) this;
		}

		public Criteria andFdStorepathNotBetween(String value1, String value2) {
			addCriterion("FD_STOREPATH not between", value1, value2,
					"fdStorepath");
			return (Criteria) this;
		}

		public Criteria andFdUploaderidIsNull() {
			addCriterion("FD_UPLOADERID is null");
			return (Criteria) this;
		}

		public Criteria andFdUploaderidIsNotNull() {
			addCriterion("FD_UPLOADERID is not null");
			return (Criteria) this;
		}

		public Criteria andFdUploaderidEqualTo(String value) {
			addCriterion("FD_UPLOADERID =", value, "fdUploaderid");
			return (Criteria) this;
		}

		public Criteria andFdUploaderidNotEqualTo(String value) {
			addCriterion("FD_UPLOADERID <>", value, "fdUploaderid");
			return (Criteria) this;
		}

		public Criteria andFdUploaderidGreaterThan(String value) {
			addCriterion("FD_UPLOADERID >", value, "fdUploaderid");
			return (Criteria) this;
		}

		public Criteria andFdUploaderidGreaterThanOrEqualTo(String value) {
			addCriterion("FD_UPLOADERID >=", value, "fdUploaderid");
			return (Criteria) this;
		}

		public Criteria andFdUploaderidLessThan(String value) {
			addCriterion("FD_UPLOADERID <", value, "fdUploaderid");
			return (Criteria) this;
		}

		public Criteria andFdUploaderidLessThanOrEqualTo(String value) {
			addCriterion("FD_UPLOADERID <=", value, "fdUploaderid");
			return (Criteria) this;
		}

		public Criteria andFdUploaderidLike(String value) {
			addCriterion("FD_UPLOADERID like", value, "fdUploaderid");
			return (Criteria) this;
		}

		public Criteria andFdUploaderidNotLike(String value) {
			addCriterion("FD_UPLOADERID not like", value, "fdUploaderid");
			return (Criteria) this;
		}

		public Criteria andFdUploaderidIn(List<String> values) {
			addCriterion("FD_UPLOADERID in", values, "fdUploaderid");
			return (Criteria) this;
		}

		public Criteria andFdUploaderidNotIn(List<String> values) {
			addCriterion("FD_UPLOADERID not in", values, "fdUploaderid");
			return (Criteria) this;
		}

		public Criteria andFdUploaderidBetween(String value1, String value2) {
			addCriterion("FD_UPLOADERID between", value1, value2,
					"fdUploaderid");
			return (Criteria) this;
		}

		public Criteria andFdUploaderidNotBetween(String value1, String value2) {
			addCriterion("FD_UPLOADERID not between", value1, value2,
					"fdUploaderid");
			return (Criteria) this;
		}

		public Criteria andFdUploadernmeIsNull() {
			addCriterion("FD_UPLOADERNME is null");
			return (Criteria) this;
		}

		public Criteria andFdUploadernmeIsNotNull() {
			addCriterion("FD_UPLOADERNME is not null");
			return (Criteria) this;
		}

		public Criteria andFdUploadernmeEqualTo(String value) {
			addCriterion("FD_UPLOADERNME =", value, "fdUploadernme");
			return (Criteria) this;
		}

		public Criteria andFdUploadernmeNotEqualTo(String value) {
			addCriterion("FD_UPLOADERNME <>", value, "fdUploadernme");
			return (Criteria) this;
		}

		public Criteria andFdUploadernmeGreaterThan(String value) {
			addCriterion("FD_UPLOADERNME >", value, "fdUploadernme");
			return (Criteria) this;
		}

		public Criteria andFdUploadernmeGreaterThanOrEqualTo(String value) {
			addCriterion("FD_UPLOADERNME >=", value, "fdUploadernme");
			return (Criteria) this;
		}

		public Criteria andFdUploadernmeLessThan(String value) {
			addCriterion("FD_UPLOADERNME <", value, "fdUploadernme");
			return (Criteria) this;
		}

		public Criteria andFdUploadernmeLessThanOrEqualTo(String value) {
			addCriterion("FD_UPLOADERNME <=", value, "fdUploadernme");
			return (Criteria) this;
		}

		public Criteria andFdUploadernmeLike(String value) {
			addCriterion("FD_UPLOADERNME like", value, "fdUploadernme");
			return (Criteria) this;
		}

		public Criteria andFdUploadernmeNotLike(String value) {
			addCriterion("FD_UPLOADERNME not like", value, "fdUploadernme");
			return (Criteria) this;
		}

		public Criteria andFdUploadernmeIn(List<String> values) {
			addCriterion("FD_UPLOADERNME in", values, "fdUploadernme");
			return (Criteria) this;
		}

		public Criteria andFdUploadernmeNotIn(List<String> values) {
			addCriterion("FD_UPLOADERNME not in", values, "fdUploadernme");
			return (Criteria) this;
		}

		public Criteria andFdUploadernmeBetween(String value1, String value2) {
			addCriterion("FD_UPLOADERNME between", value1, value2,
					"fdUploadernme");
			return (Criteria) this;
		}

		public Criteria andFdUploadernmeNotBetween(String value1, String value2) {
			addCriterion("FD_UPLOADERNME not between", value1, value2,
					"fdUploadernme");
			return (Criteria) this;
		}

		public Criteria andFdUploadtimeIsNull() {
			addCriterion("FD_UPLOADTIME is null");
			return (Criteria) this;
		}

		public Criteria andFdUploadtimeIsNotNull() {
			addCriterion("FD_UPLOADTIME is not null");
			return (Criteria) this;
		}

		public Criteria andFdUploadtimeEqualTo(String value) {
			addCriterion("FD_UPLOADTIME =", value, "fdUploadtime");
			return (Criteria) this;
		}

		public Criteria andFdUploadtimeNotEqualTo(String value) {
			addCriterion("FD_UPLOADTIME <>", value, "fdUploadtime");
			return (Criteria) this;
		}

		public Criteria andFdUploadtimeGreaterThan(String value) {
			addCriterion("FD_UPLOADTIME >", value, "fdUploadtime");
			return (Criteria) this;
		}

		public Criteria andFdUploadtimeGreaterThanOrEqualTo(String value) {
			addCriterion("FD_UPLOADTIME >=", value, "fdUploadtime");
			return (Criteria) this;
		}

		public Criteria andFdUploadtimeLessThan(String value) {
			addCriterion("FD_UPLOADTIME <", value, "fdUploadtime");
			return (Criteria) this;
		}

		public Criteria andFdUploadtimeLessThanOrEqualTo(String value) {
			addCriterion("FD_UPLOADTIME <=", value, "fdUploadtime");
			return (Criteria) this;
		}

		public Criteria andFdUploadtimeLike(String value) {
			addCriterion("FD_UPLOADTIME like", value, "fdUploadtime");
			return (Criteria) this;
		}

		public Criteria andFdUploadtimeNotLike(String value) {
			addCriterion("FD_UPLOADTIME not like", value, "fdUploadtime");
			return (Criteria) this;
		}

		public Criteria andFdUploadtimeIn(List<String> values) {
			addCriterion("FD_UPLOADTIME in", values, "fdUploadtime");
			return (Criteria) this;
		}

		public Criteria andFdUploadtimeNotIn(List<String> values) {
			addCriterion("FD_UPLOADTIME not in", values, "fdUploadtime");
			return (Criteria) this;
		}

		public Criteria andFdUploadtimeBetween(String value1, String value2) {
			addCriterion("FD_UPLOADTIME between", value1, value2,
					"fdUploadtime");
			return (Criteria) this;
		}

		public Criteria andFdUploadtimeNotBetween(String value1, String value2) {
			addCriterion("FD_UPLOADTIME not between", value1, value2,
					"fdUploadtime");
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

		public Criteria andFdCommentsIsNull() {
			addCriterion("FD_COMMENTS is null");
			return (Criteria) this;
		}

		public Criteria andFdCommentsIsNotNull() {
			addCriterion("FD_COMMENTS is not null");
			return (Criteria) this;
		}

		public Criteria andFdCommentsEqualTo(String value) {
			addCriterion("FD_COMMENTS =", value, "fdComments");
			return (Criteria) this;
		}

		public Criteria andFdCommentsNotEqualTo(String value) {
			addCriterion("FD_COMMENTS <>", value, "fdComments");
			return (Criteria) this;
		}

		public Criteria andFdCommentsGreaterThan(String value) {
			addCriterion("FD_COMMENTS >", value, "fdComments");
			return (Criteria) this;
		}

		public Criteria andFdCommentsGreaterThanOrEqualTo(String value) {
			addCriterion("FD_COMMENTS >=", value, "fdComments");
			return (Criteria) this;
		}

		public Criteria andFdCommentsLessThan(String value) {
			addCriterion("FD_COMMENTS <", value, "fdComments");
			return (Criteria) this;
		}

		public Criteria andFdCommentsLessThanOrEqualTo(String value) {
			addCriterion("FD_COMMENTS <=", value, "fdComments");
			return (Criteria) this;
		}

		public Criteria andFdCommentsLike(String value) {
			addCriterion("FD_COMMENTS like", value, "fdComments");
			return (Criteria) this;
		}

		public Criteria andFdCommentsNotLike(String value) {
			addCriterion("FD_COMMENTS not like", value, "fdComments");
			return (Criteria) this;
		}

		public Criteria andFdCommentsIn(List<String> values) {
			addCriterion("FD_COMMENTS in", values, "fdComments");
			return (Criteria) this;
		}

		public Criteria andFdCommentsNotIn(List<String> values) {
			addCriterion("FD_COMMENTS not in", values, "fdComments");
			return (Criteria) this;
		}

		public Criteria andFdCommentsBetween(String value1, String value2) {
			addCriterion("FD_COMMENTS between", value1, value2, "fdComments");
			return (Criteria) this;
		}

		public Criteria andFdCommentsNotBetween(String value1, String value2) {
			addCriterion("FD_COMMENTS not between", value1, value2,
					"fdComments");
			return (Criteria) this;
		}

		public Criteria andFdLoadedIsNull() {
			addCriterion("FD_LOADED is null");
			return (Criteria) this;
		}

		public Criteria andFdLoadedIsNotNull() {
			addCriterion("FD_LOADED is not null");
			return (Criteria) this;
		}

		public Criteria andFdLoadedEqualTo(String value) {
			addCriterion("FD_LOADED =", value, "fdLoaded");
			return (Criteria) this;
		}

		public Criteria andFdLoadedNotEqualTo(String value) {
			addCriterion("FD_LOADED <>", value, "fdLoaded");
			return (Criteria) this;
		}

		public Criteria andFdLoadedGreaterThan(String value) {
			addCriterion("FD_LOADED >", value, "fdLoaded");
			return (Criteria) this;
		}

		public Criteria andFdLoadedGreaterThanOrEqualTo(String value) {
			addCriterion("FD_LOADED >=", value, "fdLoaded");
			return (Criteria) this;
		}

		public Criteria andFdLoadedLessThan(String value) {
			addCriterion("FD_LOADED <", value, "fdLoaded");
			return (Criteria) this;
		}

		public Criteria andFdLoadedLessThanOrEqualTo(String value) {
			addCriterion("FD_LOADED <=", value, "fdLoaded");
			return (Criteria) this;
		}

		public Criteria andFdLoadedLike(String value) {
			addCriterion("FD_LOADED like", value, "fdLoaded");
			return (Criteria) this;
		}

		public Criteria andFdLoadedNotLike(String value) {
			addCriterion("FD_LOADED not like", value, "fdLoaded");
			return (Criteria) this;
		}

		public Criteria andFdLoadedIn(List<String> values) {
			addCriterion("FD_LOADED in", values, "fdLoaded");
			return (Criteria) this;
		}

		public Criteria andFdLoadedNotIn(List<String> values) {
			addCriterion("FD_LOADED not in", values, "fdLoaded");
			return (Criteria) this;
		}

		public Criteria andFdLoadedBetween(String value1, String value2) {
			addCriterion("FD_LOADED between", value1, value2, "fdLoaded");
			return (Criteria) this;
		}

		public Criteria andFdLoadedNotBetween(String value1, String value2) {
			addCriterion("FD_LOADED not between", value1, value2, "fdLoaded");
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