package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TBankCircleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBankCircleExample() {
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

        public Criteria andEmpIdIsNull() {
            addCriterion("EMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("EMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(String value) {
            addCriterion("EMP_ID =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(String value) {
            addCriterion("EMP_ID <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(String value) {
            addCriterion("EMP_ID >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_ID >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(String value) {
            addCriterion("EMP_ID <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(String value) {
            addCriterion("EMP_ID <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLike(String value) {
            addCriterion("EMP_ID like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotLike(String value) {
            addCriterion("EMP_ID not like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<String> values) {
            addCriterion("EMP_ID in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<String> values) {
            addCriterion("EMP_ID not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(String value1, String value2) {
            addCriterion("EMP_ID between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(String value1, String value2) {
            addCriterion("EMP_ID not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCommCountIsNull() {
            addCriterion("COMM_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCommCountIsNotNull() {
            addCriterion("COMM_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCommCountEqualTo(String value) {
            addCriterion("COMM_COUNT =", value, "commCount");
            return (Criteria) this;
        }

        public Criteria andCommCountNotEqualTo(String value) {
            addCriterion("COMM_COUNT <>", value, "commCount");
            return (Criteria) this;
        }

        public Criteria andCommCountGreaterThan(String value) {
            addCriterion("COMM_COUNT >", value, "commCount");
            return (Criteria) this;
        }

        public Criteria andCommCountGreaterThanOrEqualTo(String value) {
            addCriterion("COMM_COUNT >=", value, "commCount");
            return (Criteria) this;
        }

        public Criteria andCommCountLessThan(String value) {
            addCriterion("COMM_COUNT <", value, "commCount");
            return (Criteria) this;
        }

        public Criteria andCommCountLessThanOrEqualTo(String value) {
            addCriterion("COMM_COUNT <=", value, "commCount");
            return (Criteria) this;
        }

        public Criteria andCommCountLike(String value) {
            addCriterion("COMM_COUNT like", value, "commCount");
            return (Criteria) this;
        }

        public Criteria andCommCountNotLike(String value) {
            addCriterion("COMM_COUNT not like", value, "commCount");
            return (Criteria) this;
        }

        public Criteria andCommCountIn(List<String> values) {
            addCriterion("COMM_COUNT in", values, "commCount");
            return (Criteria) this;
        }

        public Criteria andCommCountNotIn(List<String> values) {
            addCriterion("COMM_COUNT not in", values, "commCount");
            return (Criteria) this;
        }

        public Criteria andCommCountBetween(String value1, String value2) {
            addCriterion("COMM_COUNT between", value1, value2, "commCount");
            return (Criteria) this;
        }

        public Criteria andCommCountNotBetween(String value1, String value2) {
            addCriterion("COMM_COUNT not between", value1, value2, "commCount");
            return (Criteria) this;
        }

        public Criteria andPariseCountIsNull() {
            addCriterion("PARISE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andPariseCountIsNotNull() {
            addCriterion("PARISE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPariseCountEqualTo(String value) {
            addCriterion("PARISE_COUNT =", value, "pariseCount");
            return (Criteria) this;
        }

        public Criteria andPariseCountNotEqualTo(String value) {
            addCriterion("PARISE_COUNT <>", value, "pariseCount");
            return (Criteria) this;
        }

        public Criteria andPariseCountGreaterThan(String value) {
            addCriterion("PARISE_COUNT >", value, "pariseCount");
            return (Criteria) this;
        }

        public Criteria andPariseCountGreaterThanOrEqualTo(String value) {
            addCriterion("PARISE_COUNT >=", value, "pariseCount");
            return (Criteria) this;
        }

        public Criteria andPariseCountLessThan(String value) {
            addCriterion("PARISE_COUNT <", value, "pariseCount");
            return (Criteria) this;
        }

        public Criteria andPariseCountLessThanOrEqualTo(String value) {
            addCriterion("PARISE_COUNT <=", value, "pariseCount");
            return (Criteria) this;
        }

        public Criteria andPariseCountLike(String value) {
            addCriterion("PARISE_COUNT like", value, "pariseCount");
            return (Criteria) this;
        }

        public Criteria andPariseCountNotLike(String value) {
            addCriterion("PARISE_COUNT not like", value, "pariseCount");
            return (Criteria) this;
        }

        public Criteria andPariseCountIn(List<String> values) {
            addCriterion("PARISE_COUNT in", values, "pariseCount");
            return (Criteria) this;
        }

        public Criteria andPariseCountNotIn(List<String> values) {
            addCriterion("PARISE_COUNT not in", values, "pariseCount");
            return (Criteria) this;
        }

        public Criteria andPariseCountBetween(String value1, String value2) {
            addCriterion("PARISE_COUNT between", value1, value2, "pariseCount");
            return (Criteria) this;
        }

        public Criteria andPariseCountNotBetween(String value1, String value2) {
            addCriterion("PARISE_COUNT not between", value1, value2, "pariseCount");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOrgOrDeptCodeIsNull() {
            addCriterion("ORG_OR_DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgOrDeptCodeIsNotNull() {
            addCriterion("ORG_OR_DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgOrDeptCodeEqualTo(String value) {
            addCriterion("ORG_OR_DEPT_CODE =", value, "orgOrDeptCode");
            return (Criteria) this;
        }

        public Criteria andOrgOrDeptCodeNotEqualTo(String value) {
            addCriterion("ORG_OR_DEPT_CODE <>", value, "orgOrDeptCode");
            return (Criteria) this;
        }

        public Criteria andOrgOrDeptCodeGreaterThan(String value) {
            addCriterion("ORG_OR_DEPT_CODE >", value, "orgOrDeptCode");
            return (Criteria) this;
        }

        public Criteria andOrgOrDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_OR_DEPT_CODE >=", value, "orgOrDeptCode");
            return (Criteria) this;
        }

        public Criteria andOrgOrDeptCodeLessThan(String value) {
            addCriterion("ORG_OR_DEPT_CODE <", value, "orgOrDeptCode");
            return (Criteria) this;
        }

        public Criteria andOrgOrDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_OR_DEPT_CODE <=", value, "orgOrDeptCode");
            return (Criteria) this;
        }

        public Criteria andOrgOrDeptCodeLike(String value) {
            addCriterion("ORG_OR_DEPT_CODE like", value, "orgOrDeptCode");
            return (Criteria) this;
        }

        public Criteria andOrgOrDeptCodeNotLike(String value) {
            addCriterion("ORG_OR_DEPT_CODE not like", value, "orgOrDeptCode");
            return (Criteria) this;
        }

        public Criteria andOrgOrDeptCodeIn(List<String> values) {
            addCriterion("ORG_OR_DEPT_CODE in", values, "orgOrDeptCode");
            return (Criteria) this;
        }

        public Criteria andOrgOrDeptCodeNotIn(List<String> values) {
            addCriterion("ORG_OR_DEPT_CODE not in", values, "orgOrDeptCode");
            return (Criteria) this;
        }

        public Criteria andOrgOrDeptCodeBetween(String value1, String value2) {
            addCriterion("ORG_OR_DEPT_CODE between", value1, value2, "orgOrDeptCode");
            return (Criteria) this;
        }

        public Criteria andOrgOrDeptCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_OR_DEPT_CODE not between", value1, value2, "orgOrDeptCode");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("IS_HOT is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("IS_HOT is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(String value) {
            addCriterion("IS_HOT =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(String value) {
            addCriterion("IS_HOT <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(String value) {
            addCriterion("IS_HOT >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(String value) {
            addCriterion("IS_HOT >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(String value) {
            addCriterion("IS_HOT <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(String value) {
            addCriterion("IS_HOT <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLike(String value) {
            addCriterion("IS_HOT like", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotLike(String value) {
            addCriterion("IS_HOT not like", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<String> values) {
            addCriterion("IS_HOT in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<String> values) {
            addCriterion("IS_HOT not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(String value1, String value2) {
            addCriterion("IS_HOT between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(String value1, String value2) {
            addCriterion("IS_HOT not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsPublicIsNull() {
            addCriterion("IS_PUBLIC is null");
            return (Criteria) this;
        }

        public Criteria andIsPublicIsNotNull() {
            addCriterion("IS_PUBLIC is not null");
            return (Criteria) this;
        }

        public Criteria andIsPublicEqualTo(String value) {
            addCriterion("IS_PUBLIC =", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotEqualTo(String value) {
            addCriterion("IS_PUBLIC <>", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicGreaterThan(String value) {
            addCriterion("IS_PUBLIC >", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PUBLIC >=", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicLessThan(String value) {
            addCriterion("IS_PUBLIC <", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicLessThanOrEqualTo(String value) {
            addCriterion("IS_PUBLIC <=", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicLike(String value) {
            addCriterion("IS_PUBLIC like", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotLike(String value) {
            addCriterion("IS_PUBLIC not like", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicIn(List<String> values) {
            addCriterion("IS_PUBLIC in", values, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotIn(List<String> values) {
            addCriterion("IS_PUBLIC not in", values, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicBetween(String value1, String value2) {
            addCriterion("IS_PUBLIC between", value1, value2, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotBetween(String value1, String value2) {
            addCriterion("IS_PUBLIC not between", value1, value2, "isPublic");
            return (Criteria) this;
        }

        public Criteria andPariseTimeIsNull() {
            addCriterion("PARISE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPariseTimeIsNotNull() {
            addCriterion("PARISE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPariseTimeEqualTo(String value) {
            addCriterion("PARISE_TIME =", value, "pariseTime");
            return (Criteria) this;
        }

        public Criteria andPariseTimeNotEqualTo(String value) {
            addCriterion("PARISE_TIME <>", value, "pariseTime");
            return (Criteria) this;
        }

        public Criteria andPariseTimeGreaterThan(String value) {
            addCriterion("PARISE_TIME >", value, "pariseTime");
            return (Criteria) this;
        }

        public Criteria andPariseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PARISE_TIME >=", value, "pariseTime");
            return (Criteria) this;
        }

        public Criteria andPariseTimeLessThan(String value) {
            addCriterion("PARISE_TIME <", value, "pariseTime");
            return (Criteria) this;
        }

        public Criteria andPariseTimeLessThanOrEqualTo(String value) {
            addCriterion("PARISE_TIME <=", value, "pariseTime");
            return (Criteria) this;
        }

        public Criteria andPariseTimeLike(String value) {
            addCriterion("PARISE_TIME like", value, "pariseTime");
            return (Criteria) this;
        }

        public Criteria andPariseTimeNotLike(String value) {
            addCriterion("PARISE_TIME not like", value, "pariseTime");
            return (Criteria) this;
        }

        public Criteria andPariseTimeIn(List<String> values) {
            addCriterion("PARISE_TIME in", values, "pariseTime");
            return (Criteria) this;
        }

        public Criteria andPariseTimeNotIn(List<String> values) {
            addCriterion("PARISE_TIME not in", values, "pariseTime");
            return (Criteria) this;
        }

        public Criteria andPariseTimeBetween(String value1, String value2) {
            addCriterion("PARISE_TIME between", value1, value2, "pariseTime");
            return (Criteria) this;
        }

        public Criteria andPariseTimeNotBetween(String value1, String value2) {
            addCriterion("PARISE_TIME not between", value1, value2, "pariseTime");
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