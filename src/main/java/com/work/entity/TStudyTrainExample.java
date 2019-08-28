package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TStudyTrainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStudyTrainExample() {
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

        public Criteria andStudyIdIsNull() {
            addCriterion("STUDY_ID is null");
            return (Criteria) this;
        }

        public Criteria andStudyIdIsNotNull() {
            addCriterion("STUDY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStudyIdEqualTo(String value) {
            addCriterion("STUDY_ID =", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotEqualTo(String value) {
            addCriterion("STUDY_ID <>", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdGreaterThan(String value) {
            addCriterion("STUDY_ID >", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdGreaterThanOrEqualTo(String value) {
            addCriterion("STUDY_ID >=", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLessThan(String value) {
            addCriterion("STUDY_ID <", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLessThanOrEqualTo(String value) {
            addCriterion("STUDY_ID <=", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLike(String value) {
            addCriterion("STUDY_ID like", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotLike(String value) {
            addCriterion("STUDY_ID not like", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdIn(List<String> values) {
            addCriterion("STUDY_ID in", values, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotIn(List<String> values) {
            addCriterion("STUDY_ID not in", values, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdBetween(String value1, String value2) {
            addCriterion("STUDY_ID between", value1, value2, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotBetween(String value1, String value2) {
            addCriterion("STUDY_ID not between", value1, value2, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyTitleIsNull() {
            addCriterion("STUDY_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andStudyTitleIsNotNull() {
            addCriterion("STUDY_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andStudyTitleEqualTo(String value) {
            addCriterion("STUDY_TITLE =", value, "studyTitle");
            return (Criteria) this;
        }

        public Criteria andStudyTitleNotEqualTo(String value) {
            addCriterion("STUDY_TITLE <>", value, "studyTitle");
            return (Criteria) this;
        }

        public Criteria andStudyTitleGreaterThan(String value) {
            addCriterion("STUDY_TITLE >", value, "studyTitle");
            return (Criteria) this;
        }

        public Criteria andStudyTitleGreaterThanOrEqualTo(String value) {
            addCriterion("STUDY_TITLE >=", value, "studyTitle");
            return (Criteria) this;
        }

        public Criteria andStudyTitleLessThan(String value) {
            addCriterion("STUDY_TITLE <", value, "studyTitle");
            return (Criteria) this;
        }

        public Criteria andStudyTitleLessThanOrEqualTo(String value) {
            addCriterion("STUDY_TITLE <=", value, "studyTitle");
            return (Criteria) this;
        }

        public Criteria andStudyTitleLike(String value) {
            addCriterion("STUDY_TITLE like", value, "studyTitle");
            return (Criteria) this;
        }

        public Criteria andStudyTitleNotLike(String value) {
            addCriterion("STUDY_TITLE not like", value, "studyTitle");
            return (Criteria) this;
        }

        public Criteria andStudyTitleIn(List<String> values) {
            addCriterion("STUDY_TITLE in", values, "studyTitle");
            return (Criteria) this;
        }

        public Criteria andStudyTitleNotIn(List<String> values) {
            addCriterion("STUDY_TITLE not in", values, "studyTitle");
            return (Criteria) this;
        }

        public Criteria andStudyTitleBetween(String value1, String value2) {
            addCriterion("STUDY_TITLE between", value1, value2, "studyTitle");
            return (Criteria) this;
        }

        public Criteria andStudyTitleNotBetween(String value1, String value2) {
            addCriterion("STUDY_TITLE not between", value1, value2, "studyTitle");
            return (Criteria) this;
        }

        public Criteria andStudyContentIsNull() {
            addCriterion("STUDY_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andStudyContentIsNotNull() {
            addCriterion("STUDY_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andStudyContentEqualTo(String value) {
            addCriterion("STUDY_CONTENT =", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentNotEqualTo(String value) {
            addCriterion("STUDY_CONTENT <>", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentGreaterThan(String value) {
            addCriterion("STUDY_CONTENT >", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentGreaterThanOrEqualTo(String value) {
            addCriterion("STUDY_CONTENT >=", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentLessThan(String value) {
            addCriterion("STUDY_CONTENT <", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentLessThanOrEqualTo(String value) {
            addCriterion("STUDY_CONTENT <=", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentLike(String value) {
            addCriterion("STUDY_CONTENT like", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentNotLike(String value) {
            addCriterion("STUDY_CONTENT not like", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentIn(List<String> values) {
            addCriterion("STUDY_CONTENT in", values, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentNotIn(List<String> values) {
            addCriterion("STUDY_CONTENT not in", values, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentBetween(String value1, String value2) {
            addCriterion("STUDY_CONTENT between", value1, value2, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentNotBetween(String value1, String value2) {
            addCriterion("STUDY_CONTENT not between", value1, value2, "studyContent");
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

        public Criteria andEmpNameIsNull() {
            addCriterion("EMP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("EMP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("EMP_NAME =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("EMP_NAME <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("EMP_NAME >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_NAME >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("EMP_NAME <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("EMP_NAME <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("EMP_NAME like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("EMP_NAME not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("EMP_NAME in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("EMP_NAME not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("EMP_NAME between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("EMP_NAME not between", value1, value2, "empName");
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

        public Criteria andTypeCodeIsNull() {
            addCriterion("TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNotNull() {
            addCriterion("TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeEqualTo(String value) {
            addCriterion("TYPE_CODE =", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotEqualTo(String value) {
            addCriterion("TYPE_CODE <>", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThan(String value) {
            addCriterion("TYPE_CODE >", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_CODE >=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThan(String value) {
            addCriterion("TYPE_CODE <", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("TYPE_CODE <=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLike(String value) {
            addCriterion("TYPE_CODE like", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotLike(String value) {
            addCriterion("TYPE_CODE not like", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIn(List<String> values) {
            addCriterion("TYPE_CODE in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotIn(List<String> values) {
            addCriterion("TYPE_CODE not in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeBetween(String value1, String value2) {
            addCriterion("TYPE_CODE between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotBetween(String value1, String value2) {
            addCriterion("TYPE_CODE not between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("TYPE_NAME =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("TYPE_NAME <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("TYPE_NAME >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_NAME >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("TYPE_NAME <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("TYPE_NAME <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("TYPE_NAME like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("TYPE_NAME not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("TYPE_NAME in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("TYPE_NAME not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("TYPE_NAME between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("TYPE_NAME not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andVadioUrlIsNull() {
            addCriterion("VADIO_URL is null");
            return (Criteria) this;
        }

        public Criteria andVadioUrlIsNotNull() {
            addCriterion("VADIO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andVadioUrlEqualTo(String value) {
            addCriterion("VADIO_URL =", value, "vadioUrl");
            return (Criteria) this;
        }

        public Criteria andVadioUrlNotEqualTo(String value) {
            addCriterion("VADIO_URL <>", value, "vadioUrl");
            return (Criteria) this;
        }

        public Criteria andVadioUrlGreaterThan(String value) {
            addCriterion("VADIO_URL >", value, "vadioUrl");
            return (Criteria) this;
        }

        public Criteria andVadioUrlGreaterThanOrEqualTo(String value) {
            addCriterion("VADIO_URL >=", value, "vadioUrl");
            return (Criteria) this;
        }

        public Criteria andVadioUrlLessThan(String value) {
            addCriterion("VADIO_URL <", value, "vadioUrl");
            return (Criteria) this;
        }

        public Criteria andVadioUrlLessThanOrEqualTo(String value) {
            addCriterion("VADIO_URL <=", value, "vadioUrl");
            return (Criteria) this;
        }

        public Criteria andVadioUrlLike(String value) {
            addCriterion("VADIO_URL like", value, "vadioUrl");
            return (Criteria) this;
        }

        public Criteria andVadioUrlNotLike(String value) {
            addCriterion("VADIO_URL not like", value, "vadioUrl");
            return (Criteria) this;
        }

        public Criteria andVadioUrlIn(List<String> values) {
            addCriterion("VADIO_URL in", values, "vadioUrl");
            return (Criteria) this;
        }

        public Criteria andVadioUrlNotIn(List<String> values) {
            addCriterion("VADIO_URL not in", values, "vadioUrl");
            return (Criteria) this;
        }

        public Criteria andVadioUrlBetween(String value1, String value2) {
            addCriterion("VADIO_URL between", value1, value2, "vadioUrl");
            return (Criteria) this;
        }

        public Criteria andVadioUrlNotBetween(String value1, String value2) {
            addCriterion("VADIO_URL not between", value1, value2, "vadioUrl");
            return (Criteria) this;
        }

        public Criteria andApprovalDeptStatusIsNull() {
            addCriterion("APPROVAL_DEPT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andApprovalDeptStatusIsNotNull() {
            addCriterion("APPROVAL_DEPT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalDeptStatusEqualTo(String value) {
            addCriterion("APPROVAL_DEPT_STATUS =", value, "approvalDeptStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalDeptStatusNotEqualTo(String value) {
            addCriterion("APPROVAL_DEPT_STATUS <>", value, "approvalDeptStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalDeptStatusGreaterThan(String value) {
            addCriterion("APPROVAL_DEPT_STATUS >", value, "approvalDeptStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalDeptStatusGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVAL_DEPT_STATUS >=", value, "approvalDeptStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalDeptStatusLessThan(String value) {
            addCriterion("APPROVAL_DEPT_STATUS <", value, "approvalDeptStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalDeptStatusLessThanOrEqualTo(String value) {
            addCriterion("APPROVAL_DEPT_STATUS <=", value, "approvalDeptStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalDeptStatusLike(String value) {
            addCriterion("APPROVAL_DEPT_STATUS like", value, "approvalDeptStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalDeptStatusNotLike(String value) {
            addCriterion("APPROVAL_DEPT_STATUS not like", value, "approvalDeptStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalDeptStatusIn(List<String> values) {
            addCriterion("APPROVAL_DEPT_STATUS in", values, "approvalDeptStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalDeptStatusNotIn(List<String> values) {
            addCriterion("APPROVAL_DEPT_STATUS not in", values, "approvalDeptStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalDeptStatusBetween(String value1, String value2) {
            addCriterion("APPROVAL_DEPT_STATUS between", value1, value2, "approvalDeptStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalDeptStatusNotBetween(String value1, String value2) {
            addCriterion("APPROVAL_DEPT_STATUS not between", value1, value2, "approvalDeptStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalProStatusIsNull() {
            addCriterion("APPROVAL_PRO_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andApprovalProStatusIsNotNull() {
            addCriterion("APPROVAL_PRO_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalProStatusEqualTo(String value) {
            addCriterion("APPROVAL_PRO_STATUS =", value, "approvalProStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalProStatusNotEqualTo(String value) {
            addCriterion("APPROVAL_PRO_STATUS <>", value, "approvalProStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalProStatusGreaterThan(String value) {
            addCriterion("APPROVAL_PRO_STATUS >", value, "approvalProStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalProStatusGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVAL_PRO_STATUS >=", value, "approvalProStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalProStatusLessThan(String value) {
            addCriterion("APPROVAL_PRO_STATUS <", value, "approvalProStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalProStatusLessThanOrEqualTo(String value) {
            addCriterion("APPROVAL_PRO_STATUS <=", value, "approvalProStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalProStatusLike(String value) {
            addCriterion("APPROVAL_PRO_STATUS like", value, "approvalProStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalProStatusNotLike(String value) {
            addCriterion("APPROVAL_PRO_STATUS not like", value, "approvalProStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalProStatusIn(List<String> values) {
            addCriterion("APPROVAL_PRO_STATUS in", values, "approvalProStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalProStatusNotIn(List<String> values) {
            addCriterion("APPROVAL_PRO_STATUS not in", values, "approvalProStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalProStatusBetween(String value1, String value2) {
            addCriterion("APPROVAL_PRO_STATUS between", value1, value2, "approvalProStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalProStatusNotBetween(String value1, String value2) {
            addCriterion("APPROVAL_PRO_STATUS not between", value1, value2, "approvalProStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalInfoIsNull() {
            addCriterion("APPROVAL_INFO is null");
            return (Criteria) this;
        }

        public Criteria andApprovalInfoIsNotNull() {
            addCriterion("APPROVAL_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalInfoEqualTo(String value) {
            addCriterion("APPROVAL_INFO =", value, "approvalInfo");
            return (Criteria) this;
        }

        public Criteria andApprovalInfoNotEqualTo(String value) {
            addCriterion("APPROVAL_INFO <>", value, "approvalInfo");
            return (Criteria) this;
        }

        public Criteria andApprovalInfoGreaterThan(String value) {
            addCriterion("APPROVAL_INFO >", value, "approvalInfo");
            return (Criteria) this;
        }

        public Criteria andApprovalInfoGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVAL_INFO >=", value, "approvalInfo");
            return (Criteria) this;
        }

        public Criteria andApprovalInfoLessThan(String value) {
            addCriterion("APPROVAL_INFO <", value, "approvalInfo");
            return (Criteria) this;
        }

        public Criteria andApprovalInfoLessThanOrEqualTo(String value) {
            addCriterion("APPROVAL_INFO <=", value, "approvalInfo");
            return (Criteria) this;
        }

        public Criteria andApprovalInfoLike(String value) {
            addCriterion("APPROVAL_INFO like", value, "approvalInfo");
            return (Criteria) this;
        }

        public Criteria andApprovalInfoNotLike(String value) {
            addCriterion("APPROVAL_INFO not like", value, "approvalInfo");
            return (Criteria) this;
        }

        public Criteria andApprovalInfoIn(List<String> values) {
            addCriterion("APPROVAL_INFO in", values, "approvalInfo");
            return (Criteria) this;
        }

        public Criteria andApprovalInfoNotIn(List<String> values) {
            addCriterion("APPROVAL_INFO not in", values, "approvalInfo");
            return (Criteria) this;
        }

        public Criteria andApprovalInfoBetween(String value1, String value2) {
            addCriterion("APPROVAL_INFO between", value1, value2, "approvalInfo");
            return (Criteria) this;
        }

        public Criteria andApprovalInfoNotBetween(String value1, String value2) {
            addCriterion("APPROVAL_INFO not between", value1, value2, "approvalInfo");
            return (Criteria) this;
        }

        public Criteria andPlayCountIsNull() {
            addCriterion("PLAY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andPlayCountIsNotNull() {
            addCriterion("PLAY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPlayCountEqualTo(String value) {
            addCriterion("PLAY_COUNT =", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountNotEqualTo(String value) {
            addCriterion("PLAY_COUNT <>", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountGreaterThan(String value) {
            addCriterion("PLAY_COUNT >", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountGreaterThanOrEqualTo(String value) {
            addCriterion("PLAY_COUNT >=", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountLessThan(String value) {
            addCriterion("PLAY_COUNT <", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountLessThanOrEqualTo(String value) {
            addCriterion("PLAY_COUNT <=", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountLike(String value) {
            addCriterion("PLAY_COUNT like", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountNotLike(String value) {
            addCriterion("PLAY_COUNT not like", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountIn(List<String> values) {
            addCriterion("PLAY_COUNT in", values, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountNotIn(List<String> values) {
            addCriterion("PLAY_COUNT not in", values, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountBetween(String value1, String value2) {
            addCriterion("PLAY_COUNT between", value1, value2, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountNotBetween(String value1, String value2) {
            addCriterion("PLAY_COUNT not between", value1, value2, "playCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("COMMENT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("COMMENT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(String value) {
            addCriterion("COMMENT_COUNT =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(String value) {
            addCriterion("COMMENT_COUNT <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(String value) {
            addCriterion("COMMENT_COUNT >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENT_COUNT >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(String value) {
            addCriterion("COMMENT_COUNT <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(String value) {
            addCriterion("COMMENT_COUNT <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLike(String value) {
            addCriterion("COMMENT_COUNT like", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotLike(String value) {
            addCriterion("COMMENT_COUNT not like", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<String> values) {
            addCriterion("COMMENT_COUNT in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<String> values) {
            addCriterion("COMMENT_COUNT not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(String value1, String value2) {
            addCriterion("COMMENT_COUNT between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(String value1, String value2) {
            addCriterion("COMMENT_COUNT not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andApprDeptEmpidIsNull() {
            addCriterion("APPR_DEPT_EMPID is null");
            return (Criteria) this;
        }

        public Criteria andApprDeptEmpidIsNotNull() {
            addCriterion("APPR_DEPT_EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andApprDeptEmpidEqualTo(String value) {
            addCriterion("APPR_DEPT_EMPID =", value, "apprDeptEmpid");
            return (Criteria) this;
        }

        public Criteria andApprDeptEmpidNotEqualTo(String value) {
            addCriterion("APPR_DEPT_EMPID <>", value, "apprDeptEmpid");
            return (Criteria) this;
        }

        public Criteria andApprDeptEmpidGreaterThan(String value) {
            addCriterion("APPR_DEPT_EMPID >", value, "apprDeptEmpid");
            return (Criteria) this;
        }

        public Criteria andApprDeptEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("APPR_DEPT_EMPID >=", value, "apprDeptEmpid");
            return (Criteria) this;
        }

        public Criteria andApprDeptEmpidLessThan(String value) {
            addCriterion("APPR_DEPT_EMPID <", value, "apprDeptEmpid");
            return (Criteria) this;
        }

        public Criteria andApprDeptEmpidLessThanOrEqualTo(String value) {
            addCriterion("APPR_DEPT_EMPID <=", value, "apprDeptEmpid");
            return (Criteria) this;
        }

        public Criteria andApprDeptEmpidLike(String value) {
            addCriterion("APPR_DEPT_EMPID like", value, "apprDeptEmpid");
            return (Criteria) this;
        }

        public Criteria andApprDeptEmpidNotLike(String value) {
            addCriterion("APPR_DEPT_EMPID not like", value, "apprDeptEmpid");
            return (Criteria) this;
        }

        public Criteria andApprDeptEmpidIn(List<String> values) {
            addCriterion("APPR_DEPT_EMPID in", values, "apprDeptEmpid");
            return (Criteria) this;
        }

        public Criteria andApprDeptEmpidNotIn(List<String> values) {
            addCriterion("APPR_DEPT_EMPID not in", values, "apprDeptEmpid");
            return (Criteria) this;
        }

        public Criteria andApprDeptEmpidBetween(String value1, String value2) {
            addCriterion("APPR_DEPT_EMPID between", value1, value2, "apprDeptEmpid");
            return (Criteria) this;
        }

        public Criteria andApprDeptEmpidNotBetween(String value1, String value2) {
            addCriterion("APPR_DEPT_EMPID not between", value1, value2, "apprDeptEmpid");
            return (Criteria) this;
        }

        public Criteria andApprProEmpidIsNull() {
            addCriterion("APPR_PRO_EMPID is null");
            return (Criteria) this;
        }

        public Criteria andApprProEmpidIsNotNull() {
            addCriterion("APPR_PRO_EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andApprProEmpidEqualTo(String value) {
            addCriterion("APPR_PRO_EMPID =", value, "apprProEmpid");
            return (Criteria) this;
        }

        public Criteria andApprProEmpidNotEqualTo(String value) {
            addCriterion("APPR_PRO_EMPID <>", value, "apprProEmpid");
            return (Criteria) this;
        }

        public Criteria andApprProEmpidGreaterThan(String value) {
            addCriterion("APPR_PRO_EMPID >", value, "apprProEmpid");
            return (Criteria) this;
        }

        public Criteria andApprProEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("APPR_PRO_EMPID >=", value, "apprProEmpid");
            return (Criteria) this;
        }

        public Criteria andApprProEmpidLessThan(String value) {
            addCriterion("APPR_PRO_EMPID <", value, "apprProEmpid");
            return (Criteria) this;
        }

        public Criteria andApprProEmpidLessThanOrEqualTo(String value) {
            addCriterion("APPR_PRO_EMPID <=", value, "apprProEmpid");
            return (Criteria) this;
        }

        public Criteria andApprProEmpidLike(String value) {
            addCriterion("APPR_PRO_EMPID like", value, "apprProEmpid");
            return (Criteria) this;
        }

        public Criteria andApprProEmpidNotLike(String value) {
            addCriterion("APPR_PRO_EMPID not like", value, "apprProEmpid");
            return (Criteria) this;
        }

        public Criteria andApprProEmpidIn(List<String> values) {
            addCriterion("APPR_PRO_EMPID in", values, "apprProEmpid");
            return (Criteria) this;
        }

        public Criteria andApprProEmpidNotIn(List<String> values) {
            addCriterion("APPR_PRO_EMPID not in", values, "apprProEmpid");
            return (Criteria) this;
        }

        public Criteria andApprProEmpidBetween(String value1, String value2) {
            addCriterion("APPR_PRO_EMPID between", value1, value2, "apprProEmpid");
            return (Criteria) this;
        }

        public Criteria andApprProEmpidNotBetween(String value1, String value2) {
            addCriterion("APPR_PRO_EMPID not between", value1, value2, "apprProEmpid");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgIsNull() {
            addCriterion("FD_DEPT_ORG is null");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgIsNotNull() {
            addCriterion("FD_DEPT_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgEqualTo(String value) {
            addCriterion("FD_DEPT_ORG =", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgNotEqualTo(String value) {
            addCriterion("FD_DEPT_ORG <>", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgGreaterThan(String value) {
            addCriterion("FD_DEPT_ORG >", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgGreaterThanOrEqualTo(String value) {
            addCriterion("FD_DEPT_ORG >=", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgLessThan(String value) {
            addCriterion("FD_DEPT_ORG <", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgLessThanOrEqualTo(String value) {
            addCriterion("FD_DEPT_ORG <=", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgLike(String value) {
            addCriterion("FD_DEPT_ORG like", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgNotLike(String value) {
            addCriterion("FD_DEPT_ORG not like", value, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgIn(List<String> values) {
            addCriterion("FD_DEPT_ORG in", values, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgNotIn(List<String> values) {
            addCriterion("FD_DEPT_ORG not in", values, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgBetween(String value1, String value2) {
            addCriterion("FD_DEPT_ORG between", value1, value2, "fdDeptOrg");
            return (Criteria) this;
        }

        public Criteria andFdDeptOrgNotBetween(String value1, String value2) {
            addCriterion("FD_DEPT_ORG not between", value1, value2, "fdDeptOrg");
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