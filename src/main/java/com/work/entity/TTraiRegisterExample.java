package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TTraiRegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTraiRegisterExample() {
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

        public Criteria andRegisteridIsNull() {
            addCriterion("REGISTERID is null");
            return (Criteria) this;
        }

        public Criteria andRegisteridIsNotNull() {
            addCriterion("REGISTERID is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteridEqualTo(String value) {
            addCriterion("REGISTERID =", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotEqualTo(String value) {
            addCriterion("REGISTERID <>", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridGreaterThan(String value) {
            addCriterion("REGISTERID >", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERID >=", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridLessThan(String value) {
            addCriterion("REGISTERID <", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridLessThanOrEqualTo(String value) {
            addCriterion("REGISTERID <=", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridLike(String value) {
            addCriterion("REGISTERID like", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotLike(String value) {
            addCriterion("REGISTERID not like", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridIn(List<String> values) {
            addCriterion("REGISTERID in", values, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotIn(List<String> values) {
            addCriterion("REGISTERID not in", values, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridBetween(String value1, String value2) {
            addCriterion("REGISTERID between", value1, value2, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotBetween(String value1, String value2) {
            addCriterion("REGISTERID not between", value1, value2, "registerid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNull() {
            addCriterion("EMPLOYEEID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("EMPLOYEEID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(String value) {
            addCriterion("EMPLOYEEID =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(String value) {
            addCriterion("EMPLOYEEID <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(String value) {
            addCriterion("EMPLOYEEID >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEEID >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(String value) {
            addCriterion("EMPLOYEEID <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEEID <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLike(String value) {
            addCriterion("EMPLOYEEID like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotLike(String value) {
            addCriterion("EMPLOYEEID not like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<String> values) {
            addCriterion("EMPLOYEEID in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<String> values) {
            addCriterion("EMPLOYEEID not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(String value1, String value2) {
            addCriterion("EMPLOYEEID between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEEID not between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIsNull() {
            addCriterion("EMPLOYEENAME is null");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIsNotNull() {
            addCriterion("EMPLOYEENAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeenameEqualTo(String value) {
            addCriterion("EMPLOYEENAME =", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotEqualTo(String value) {
            addCriterion("EMPLOYEENAME <>", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameGreaterThan(String value) {
            addCriterion("EMPLOYEENAME >", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEENAME >=", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLessThan(String value) {
            addCriterion("EMPLOYEENAME <", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEENAME <=", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLike(String value) {
            addCriterion("EMPLOYEENAME like", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotLike(String value) {
            addCriterion("EMPLOYEENAME not like", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIn(List<String> values) {
            addCriterion("EMPLOYEENAME in", values, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotIn(List<String> values) {
            addCriterion("EMPLOYEENAME not in", values, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameBetween(String value1, String value2) {
            addCriterion("EMPLOYEENAME between", value1, value2, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEENAME not between", value1, value2, "employeename");
            return (Criteria) this;
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

        public Criteria andRegisterstatusIsNull() {
            addCriterion("REGISTERSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusIsNotNull() {
            addCriterion("REGISTERSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusEqualTo(String value) {
            addCriterion("REGISTERSTATUS =", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusNotEqualTo(String value) {
            addCriterion("REGISTERSTATUS <>", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusGreaterThan(String value) {
            addCriterion("REGISTERSTATUS >", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERSTATUS >=", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusLessThan(String value) {
            addCriterion("REGISTERSTATUS <", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusLessThanOrEqualTo(String value) {
            addCriterion("REGISTERSTATUS <=", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusLike(String value) {
            addCriterion("REGISTERSTATUS like", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusNotLike(String value) {
            addCriterion("REGISTERSTATUS not like", value, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusIn(List<String> values) {
            addCriterion("REGISTERSTATUS in", values, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusNotIn(List<String> values) {
            addCriterion("REGISTERSTATUS not in", values, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusBetween(String value1, String value2) {
            addCriterion("REGISTERSTATUS between", value1, value2, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andRegisterstatusNotBetween(String value1, String value2) {
            addCriterion("REGISTERSTATUS not between", value1, value2, "registerstatus");
            return (Criteria) this;
        }

        public Criteria andApproveridIsNull() {
            addCriterion("APPROVERID is null");
            return (Criteria) this;
        }

        public Criteria andApproveridIsNotNull() {
            addCriterion("APPROVERID is not null");
            return (Criteria) this;
        }

        public Criteria andApproveridEqualTo(String value) {
            addCriterion("APPROVERID =", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridNotEqualTo(String value) {
            addCriterion("APPROVERID <>", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridGreaterThan(String value) {
            addCriterion("APPROVERID >", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVERID >=", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridLessThan(String value) {
            addCriterion("APPROVERID <", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridLessThanOrEqualTo(String value) {
            addCriterion("APPROVERID <=", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridLike(String value) {
            addCriterion("APPROVERID like", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridNotLike(String value) {
            addCriterion("APPROVERID not like", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridIn(List<String> values) {
            addCriterion("APPROVERID in", values, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridNotIn(List<String> values) {
            addCriterion("APPROVERID not in", values, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridBetween(String value1, String value2) {
            addCriterion("APPROVERID between", value1, value2, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridNotBetween(String value1, String value2) {
            addCriterion("APPROVERID not between", value1, value2, "approverid");
            return (Criteria) this;
        }

        public Criteria andApprovernameIsNull() {
            addCriterion("APPROVERNAME is null");
            return (Criteria) this;
        }

        public Criteria andApprovernameIsNotNull() {
            addCriterion("APPROVERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andApprovernameEqualTo(String value) {
            addCriterion("APPROVERNAME =", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameNotEqualTo(String value) {
            addCriterion("APPROVERNAME <>", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameGreaterThan(String value) {
            addCriterion("APPROVERNAME >", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVERNAME >=", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameLessThan(String value) {
            addCriterion("APPROVERNAME <", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameLessThanOrEqualTo(String value) {
            addCriterion("APPROVERNAME <=", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameLike(String value) {
            addCriterion("APPROVERNAME like", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameNotLike(String value) {
            addCriterion("APPROVERNAME not like", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameIn(List<String> values) {
            addCriterion("APPROVERNAME in", values, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameNotIn(List<String> values) {
            addCriterion("APPROVERNAME not in", values, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameBetween(String value1, String value2) {
            addCriterion("APPROVERNAME between", value1, value2, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameNotBetween(String value1, String value2) {
            addCriterion("APPROVERNAME not between", value1, value2, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovecomentIsNull() {
            addCriterion("APPROVECOMENT is null");
            return (Criteria) this;
        }

        public Criteria andApprovecomentIsNotNull() {
            addCriterion("APPROVECOMENT is not null");
            return (Criteria) this;
        }

        public Criteria andApprovecomentEqualTo(String value) {
            addCriterion("APPROVECOMENT =", value, "approvecoment");
            return (Criteria) this;
        }

        public Criteria andApprovecomentNotEqualTo(String value) {
            addCriterion("APPROVECOMENT <>", value, "approvecoment");
            return (Criteria) this;
        }

        public Criteria andApprovecomentGreaterThan(String value) {
            addCriterion("APPROVECOMENT >", value, "approvecoment");
            return (Criteria) this;
        }

        public Criteria andApprovecomentGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVECOMENT >=", value, "approvecoment");
            return (Criteria) this;
        }

        public Criteria andApprovecomentLessThan(String value) {
            addCriterion("APPROVECOMENT <", value, "approvecoment");
            return (Criteria) this;
        }

        public Criteria andApprovecomentLessThanOrEqualTo(String value) {
            addCriterion("APPROVECOMENT <=", value, "approvecoment");
            return (Criteria) this;
        }

        public Criteria andApprovecomentLike(String value) {
            addCriterion("APPROVECOMENT like", value, "approvecoment");
            return (Criteria) this;
        }

        public Criteria andApprovecomentNotLike(String value) {
            addCriterion("APPROVECOMENT not like", value, "approvecoment");
            return (Criteria) this;
        }

        public Criteria andApprovecomentIn(List<String> values) {
            addCriterion("APPROVECOMENT in", values, "approvecoment");
            return (Criteria) this;
        }

        public Criteria andApprovecomentNotIn(List<String> values) {
            addCriterion("APPROVECOMENT not in", values, "approvecoment");
            return (Criteria) this;
        }

        public Criteria andApprovecomentBetween(String value1, String value2) {
            addCriterion("APPROVECOMENT between", value1, value2, "approvecoment");
            return (Criteria) this;
        }

        public Criteria andApprovecomentNotBetween(String value1, String value2) {
            addCriterion("APPROVECOMENT not between", value1, value2, "approvecoment");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIsNull() {
            addCriterion("APPROVETIME is null");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIsNotNull() {
            addCriterion("APPROVETIME is not null");
            return (Criteria) this;
        }

        public Criteria andApprovetimeEqualTo(String value) {
            addCriterion("APPROVETIME =", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotEqualTo(String value) {
            addCriterion("APPROVETIME <>", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeGreaterThan(String value) {
            addCriterion("APPROVETIME >", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVETIME >=", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLessThan(String value) {
            addCriterion("APPROVETIME <", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLessThanOrEqualTo(String value) {
            addCriterion("APPROVETIME <=", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLike(String value) {
            addCriterion("APPROVETIME like", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotLike(String value) {
            addCriterion("APPROVETIME not like", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIn(List<String> values) {
            addCriterion("APPROVETIME in", values, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotIn(List<String> values) {
            addCriterion("APPROVETIME not in", values, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeBetween(String value1, String value2) {
            addCriterion("APPROVETIME between", value1, value2, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotBetween(String value1, String value2) {
            addCriterion("APPROVETIME not between", value1, value2, "approvetime");
            return (Criteria) this;
        }

        public Criteria andEmporgcodeIsNull() {
            addCriterion("EMPORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andEmporgcodeIsNotNull() {
            addCriterion("EMPORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andEmporgcodeEqualTo(String value) {
            addCriterion("EMPORGCODE =", value, "emporgcode");
            return (Criteria) this;
        }

        public Criteria andEmporgcodeNotEqualTo(String value) {
            addCriterion("EMPORGCODE <>", value, "emporgcode");
            return (Criteria) this;
        }

        public Criteria andEmporgcodeGreaterThan(String value) {
            addCriterion("EMPORGCODE >", value, "emporgcode");
            return (Criteria) this;
        }

        public Criteria andEmporgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("EMPORGCODE >=", value, "emporgcode");
            return (Criteria) this;
        }

        public Criteria andEmporgcodeLessThan(String value) {
            addCriterion("EMPORGCODE <", value, "emporgcode");
            return (Criteria) this;
        }

        public Criteria andEmporgcodeLessThanOrEqualTo(String value) {
            addCriterion("EMPORGCODE <=", value, "emporgcode");
            return (Criteria) this;
        }

        public Criteria andEmporgcodeLike(String value) {
            addCriterion("EMPORGCODE like", value, "emporgcode");
            return (Criteria) this;
        }

        public Criteria andEmporgcodeNotLike(String value) {
            addCriterion("EMPORGCODE not like", value, "emporgcode");
            return (Criteria) this;
        }

        public Criteria andEmporgcodeIn(List<String> values) {
            addCriterion("EMPORGCODE in", values, "emporgcode");
            return (Criteria) this;
        }

        public Criteria andEmporgcodeNotIn(List<String> values) {
            addCriterion("EMPORGCODE not in", values, "emporgcode");
            return (Criteria) this;
        }

        public Criteria andEmporgcodeBetween(String value1, String value2) {
            addCriterion("EMPORGCODE between", value1, value2, "emporgcode");
            return (Criteria) this;
        }

        public Criteria andEmporgcodeNotBetween(String value1, String value2) {
            addCriterion("EMPORGCODE not between", value1, value2, "emporgcode");
            return (Criteria) this;
        }

        public Criteria andRegistertypeIsNull() {
            addCriterion("REGISTERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRegistertypeIsNotNull() {
            addCriterion("REGISTERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertypeEqualTo(String value) {
            addCriterion("REGISTERTYPE =", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeNotEqualTo(String value) {
            addCriterion("REGISTERTYPE <>", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeGreaterThan(String value) {
            addCriterion("REGISTERTYPE >", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERTYPE >=", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeLessThan(String value) {
            addCriterion("REGISTERTYPE <", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeLessThanOrEqualTo(String value) {
            addCriterion("REGISTERTYPE <=", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeLike(String value) {
            addCriterion("REGISTERTYPE like", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeNotLike(String value) {
            addCriterion("REGISTERTYPE not like", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeIn(List<String> values) {
            addCriterion("REGISTERTYPE in", values, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeNotIn(List<String> values) {
            addCriterion("REGISTERTYPE not in", values, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeBetween(String value1, String value2) {
            addCriterion("REGISTERTYPE between", value1, value2, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeNotBetween(String value1, String value2) {
            addCriterion("REGISTERTYPE not between", value1, value2, "registertype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeIsNull() {
            addCriterion("APPROVETYPE is null");
            return (Criteria) this;
        }

        public Criteria andApprovetypeIsNotNull() {
            addCriterion("APPROVETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApprovetypeEqualTo(String value) {
            addCriterion("APPROVETYPE =", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeNotEqualTo(String value) {
            addCriterion("APPROVETYPE <>", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeGreaterThan(String value) {
            addCriterion("APPROVETYPE >", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVETYPE >=", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeLessThan(String value) {
            addCriterion("APPROVETYPE <", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeLessThanOrEqualTo(String value) {
            addCriterion("APPROVETYPE <=", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeLike(String value) {
            addCriterion("APPROVETYPE like", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeNotLike(String value) {
            addCriterion("APPROVETYPE not like", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeIn(List<String> values) {
            addCriterion("APPROVETYPE in", values, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeNotIn(List<String> values) {
            addCriterion("APPROVETYPE not in", values, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeBetween(String value1, String value2) {
            addCriterion("APPROVETYPE between", value1, value2, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeNotBetween(String value1, String value2) {
            addCriterion("APPROVETYPE not between", value1, value2, "approvetype");
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

        public Criteria andEvaluatestatusIsNull() {
            addCriterion("EVALUATESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatestatusIsNotNull() {
            addCriterion("EVALUATESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatestatusEqualTo(String value) {
            addCriterion("EVALUATESTATUS =", value, "evaluatestatus");
            return (Criteria) this;
        }

        public Criteria andEvaluatestatusNotEqualTo(String value) {
            addCriterion("EVALUATESTATUS <>", value, "evaluatestatus");
            return (Criteria) this;
        }

        public Criteria andEvaluatestatusGreaterThan(String value) {
            addCriterion("EVALUATESTATUS >", value, "evaluatestatus");
            return (Criteria) this;
        }

        public Criteria andEvaluatestatusGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATESTATUS >=", value, "evaluatestatus");
            return (Criteria) this;
        }

        public Criteria andEvaluatestatusLessThan(String value) {
            addCriterion("EVALUATESTATUS <", value, "evaluatestatus");
            return (Criteria) this;
        }

        public Criteria andEvaluatestatusLessThanOrEqualTo(String value) {
            addCriterion("EVALUATESTATUS <=", value, "evaluatestatus");
            return (Criteria) this;
        }

        public Criteria andEvaluatestatusLike(String value) {
            addCriterion("EVALUATESTATUS like", value, "evaluatestatus");
            return (Criteria) this;
        }

        public Criteria andEvaluatestatusNotLike(String value) {
            addCriterion("EVALUATESTATUS not like", value, "evaluatestatus");
            return (Criteria) this;
        }

        public Criteria andEvaluatestatusIn(List<String> values) {
            addCriterion("EVALUATESTATUS in", values, "evaluatestatus");
            return (Criteria) this;
        }

        public Criteria andEvaluatestatusNotIn(List<String> values) {
            addCriterion("EVALUATESTATUS not in", values, "evaluatestatus");
            return (Criteria) this;
        }

        public Criteria andEvaluatestatusBetween(String value1, String value2) {
            addCriterion("EVALUATESTATUS between", value1, value2, "evaluatestatus");
            return (Criteria) this;
        }

        public Criteria andEvaluatestatusNotBetween(String value1, String value2) {
            addCriterion("EVALUATESTATUS not between", value1, value2, "evaluatestatus");
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