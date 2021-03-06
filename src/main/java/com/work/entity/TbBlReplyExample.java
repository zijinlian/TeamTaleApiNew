package com.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TbBlReplyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
    public TbBlReplyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
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

        public Criteria andFdReplyIdIsNull() {
            addCriterion("FD_REPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdIsNotNull() {
            addCriterion("FD_REPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdEqualTo(String value) {
            addCriterion("FD_REPLY_ID =", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdNotEqualTo(String value) {
            addCriterion("FD_REPLY_ID <>", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdGreaterThan(String value) {
            addCriterion("FD_REPLY_ID >", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_REPLY_ID >=", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdLessThan(String value) {
            addCriterion("FD_REPLY_ID <", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdLessThanOrEqualTo(String value) {
            addCriterion("FD_REPLY_ID <=", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdLike(String value) {
            addCriterion("FD_REPLY_ID like", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdNotLike(String value) {
            addCriterion("FD_REPLY_ID not like", value, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdIn(List<String> values) {
            addCriterion("FD_REPLY_ID in", values, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdNotIn(List<String> values) {
            addCriterion("FD_REPLY_ID not in", values, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdBetween(String value1, String value2) {
            addCriterion("FD_REPLY_ID between", value1, value2, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdReplyIdNotBetween(String value1, String value2) {
            addCriterion("FD_REPLY_ID not between", value1, value2, "fdReplyId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdIsNull() {
            addCriterion("FD_EMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdIsNotNull() {
            addCriterion("FD_EMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdEqualTo(String value) {
            addCriterion("FD_EMP_ID =", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdNotEqualTo(String value) {
            addCriterion("FD_EMP_ID <>", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdGreaterThan(String value) {
            addCriterion("FD_EMP_ID >", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_EMP_ID >=", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdLessThan(String value) {
            addCriterion("FD_EMP_ID <", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdLessThanOrEqualTo(String value) {
            addCriterion("FD_EMP_ID <=", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdLike(String value) {
            addCriterion("FD_EMP_ID like", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdNotLike(String value) {
            addCriterion("FD_EMP_ID not like", value, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdIn(List<String> values) {
            addCriterion("FD_EMP_ID in", values, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdNotIn(List<String> values) {
            addCriterion("FD_EMP_ID not in", values, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdBetween(String value1, String value2) {
            addCriterion("FD_EMP_ID between", value1, value2, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpIdNotBetween(String value1, String value2) {
            addCriterion("FD_EMP_ID not between", value1, value2, "fdEmpId");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeIsNull() {
            addCriterion("FD_EMPNME is null");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeIsNotNull() {
            addCriterion("FD_EMPNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeEqualTo(String value) {
            addCriterion("FD_EMPNME =", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeNotEqualTo(String value) {
            addCriterion("FD_EMPNME <>", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeGreaterThan(String value) {
            addCriterion("FD_EMPNME >", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_EMPNME >=", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeLessThan(String value) {
            addCriterion("FD_EMPNME <", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeLessThanOrEqualTo(String value) {
            addCriterion("FD_EMPNME <=", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeLike(String value) {
            addCriterion("FD_EMPNME like", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeNotLike(String value) {
            addCriterion("FD_EMPNME not like", value, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeIn(List<String> values) {
            addCriterion("FD_EMPNME in", values, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeNotIn(List<String> values) {
            addCriterion("FD_EMPNME not in", values, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeBetween(String value1, String value2) {
            addCriterion("FD_EMPNME between", value1, value2, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdEmpnmeNotBetween(String value1, String value2) {
            addCriterion("FD_EMPNME not between", value1, value2, "fdEmpnme");
            return (Criteria) this;
        }

        public Criteria andFdBlIdIsNull() {
            addCriterion("FD_BL_ID is null");
            return (Criteria) this;
        }

        public Criteria andFdBlIdIsNotNull() {
            addCriterion("FD_BL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFdBlIdEqualTo(String value) {
            addCriterion("FD_BL_ID =", value, "fdBlId");
            return (Criteria) this;
        }

        public Criteria andFdBlIdNotEqualTo(String value) {
            addCriterion("FD_BL_ID <>", value, "fdBlId");
            return (Criteria) this;
        }

        public Criteria andFdBlIdGreaterThan(String value) {
            addCriterion("FD_BL_ID >", value, "fdBlId");
            return (Criteria) this;
        }

        public Criteria andFdBlIdGreaterThanOrEqualTo(String value) {
            addCriterion("FD_BL_ID >=", value, "fdBlId");
            return (Criteria) this;
        }

        public Criteria andFdBlIdLessThan(String value) {
            addCriterion("FD_BL_ID <", value, "fdBlId");
            return (Criteria) this;
        }

        public Criteria andFdBlIdLessThanOrEqualTo(String value) {
            addCriterion("FD_BL_ID <=", value, "fdBlId");
            return (Criteria) this;
        }

        public Criteria andFdBlIdLike(String value) {
            addCriterion("FD_BL_ID like", value, "fdBlId");
            return (Criteria) this;
        }

        public Criteria andFdBlIdNotLike(String value) {
            addCriterion("FD_BL_ID not like", value, "fdBlId");
            return (Criteria) this;
        }

        public Criteria andFdBlIdIn(List<String> values) {
            addCriterion("FD_BL_ID in", values, "fdBlId");
            return (Criteria) this;
        }

        public Criteria andFdBlIdNotIn(List<String> values) {
            addCriterion("FD_BL_ID not in", values, "fdBlId");
            return (Criteria) this;
        }

        public Criteria andFdBlIdBetween(String value1, String value2) {
            addCriterion("FD_BL_ID between", value1, value2, "fdBlId");
            return (Criteria) this;
        }

        public Criteria andFdBlIdNotBetween(String value1, String value2) {
            addCriterion("FD_BL_ID not between", value1, value2, "fdBlId");
            return (Criteria) this;
        }

        public Criteria andFdReContentIsNull() {
            addCriterion("FD_RE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andFdReContentIsNotNull() {
            addCriterion("FD_RE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andFdReContentEqualTo(String value) {
            addCriterion("FD_RE_CONTENT =", value, "fdReContent");
            return (Criteria) this;
        }

        public Criteria andFdReContentNotEqualTo(String value) {
            addCriterion("FD_RE_CONTENT <>", value, "fdReContent");
            return (Criteria) this;
        }

        public Criteria andFdReContentGreaterThan(String value) {
            addCriterion("FD_RE_CONTENT >", value, "fdReContent");
            return (Criteria) this;
        }

        public Criteria andFdReContentGreaterThanOrEqualTo(String value) {
            addCriterion("FD_RE_CONTENT >=", value, "fdReContent");
            return (Criteria) this;
        }

        public Criteria andFdReContentLessThan(String value) {
            addCriterion("FD_RE_CONTENT <", value, "fdReContent");
            return (Criteria) this;
        }

        public Criteria andFdReContentLessThanOrEqualTo(String value) {
            addCriterion("FD_RE_CONTENT <=", value, "fdReContent");
            return (Criteria) this;
        }

        public Criteria andFdReContentLike(String value) {
            addCriterion("FD_RE_CONTENT like", value, "fdReContent");
            return (Criteria) this;
        }

        public Criteria andFdReContentNotLike(String value) {
            addCriterion("FD_RE_CONTENT not like", value, "fdReContent");
            return (Criteria) this;
        }

        public Criteria andFdReContentIn(List<String> values) {
            addCriterion("FD_RE_CONTENT in", values, "fdReContent");
            return (Criteria) this;
        }

        public Criteria andFdReContentNotIn(List<String> values) {
            addCriterion("FD_RE_CONTENT not in", values, "fdReContent");
            return (Criteria) this;
        }

        public Criteria andFdReContentBetween(String value1, String value2) {
            addCriterion("FD_RE_CONTENT between", value1, value2, "fdReContent");
            return (Criteria) this;
        }

        public Criteria andFdReContentNotBetween(String value1, String value2) {
            addCriterion("FD_RE_CONTENT not between", value1, value2, "fdReContent");
            return (Criteria) this;
        }

        public Criteria andFdRepTimeIsNull() {
            addCriterion("FD_REP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFdRepTimeIsNotNull() {
            addCriterion("FD_REP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFdRepTimeEqualTo(String value) {
            addCriterion("FD_REP_TIME =", value, "fdRepTime");
            return (Criteria) this;
        }

        public Criteria andFdRepTimeNotEqualTo(String value) {
            addCriterion("FD_REP_TIME <>", value, "fdRepTime");
            return (Criteria) this;
        }

        public Criteria andFdRepTimeGreaterThan(String value) {
            addCriterion("FD_REP_TIME >", value, "fdRepTime");
            return (Criteria) this;
        }

        public Criteria andFdRepTimeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_REP_TIME >=", value, "fdRepTime");
            return (Criteria) this;
        }

        public Criteria andFdRepTimeLessThan(String value) {
            addCriterion("FD_REP_TIME <", value, "fdRepTime");
            return (Criteria) this;
        }

        public Criteria andFdRepTimeLessThanOrEqualTo(String value) {
            addCriterion("FD_REP_TIME <=", value, "fdRepTime");
            return (Criteria) this;
        }

        public Criteria andFdRepTimeLike(String value) {
            addCriterion("FD_REP_TIME like", value, "fdRepTime");
            return (Criteria) this;
        }

        public Criteria andFdRepTimeNotLike(String value) {
            addCriterion("FD_REP_TIME not like", value, "fdRepTime");
            return (Criteria) this;
        }

        public Criteria andFdRepTimeIn(List<String> values) {
            addCriterion("FD_REP_TIME in", values, "fdRepTime");
            return (Criteria) this;
        }

        public Criteria andFdRepTimeNotIn(List<String> values) {
            addCriterion("FD_REP_TIME not in", values, "fdRepTime");
            return (Criteria) this;
        }

        public Criteria andFdRepTimeBetween(String value1, String value2) {
            addCriterion("FD_REP_TIME between", value1, value2, "fdRepTime");
            return (Criteria) this;
        }

        public Criteria andFdRepTimeNotBetween(String value1, String value2) {
            addCriterion("FD_REP_TIME not between", value1, value2, "fdRepTime");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeIsNull() {
            addCriterion("FD_ORGNME is null");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeIsNotNull() {
            addCriterion("FD_ORGNME is not null");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeEqualTo(String value) {
            addCriterion("FD_ORGNME =", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeNotEqualTo(String value) {
            addCriterion("FD_ORGNME <>", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeGreaterThan(String value) {
            addCriterion("FD_ORGNME >", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeGreaterThanOrEqualTo(String value) {
            addCriterion("FD_ORGNME >=", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeLessThan(String value) {
            addCriterion("FD_ORGNME <", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeLessThanOrEqualTo(String value) {
            addCriterion("FD_ORGNME <=", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeLike(String value) {
            addCriterion("FD_ORGNME like", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeNotLike(String value) {
            addCriterion("FD_ORGNME not like", value, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeIn(List<String> values) {
            addCriterion("FD_ORGNME in", values, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeNotIn(List<String> values) {
            addCriterion("FD_ORGNME not in", values, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeBetween(String value1, String value2) {
            addCriterion("FD_ORGNME between", value1, value2, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdOrgnmeNotBetween(String value1, String value2) {
            addCriterion("FD_ORGNME not between", value1, value2, "fdOrgnme");
            return (Criteria) this;
        }

        public Criteria andFdBlogTitleIsNull() {
            addCriterion("FD_BLOG_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andFdBlogTitleIsNotNull() {
            addCriterion("FD_BLOG_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andFdBlogTitleEqualTo(String value) {
            addCriterion("FD_BLOG_TITLE =", value, "fdBlogTitle");
            return (Criteria) this;
        }

        public Criteria andFdBlogTitleNotEqualTo(String value) {
            addCriterion("FD_BLOG_TITLE <>", value, "fdBlogTitle");
            return (Criteria) this;
        }

        public Criteria andFdBlogTitleGreaterThan(String value) {
            addCriterion("FD_BLOG_TITLE >", value, "fdBlogTitle");
            return (Criteria) this;
        }

        public Criteria andFdBlogTitleGreaterThanOrEqualTo(String value) {
            addCriterion("FD_BLOG_TITLE >=", value, "fdBlogTitle");
            return (Criteria) this;
        }

        public Criteria andFdBlogTitleLessThan(String value) {
            addCriterion("FD_BLOG_TITLE <", value, "fdBlogTitle");
            return (Criteria) this;
        }

        public Criteria andFdBlogTitleLessThanOrEqualTo(String value) {
            addCriterion("FD_BLOG_TITLE <=", value, "fdBlogTitle");
            return (Criteria) this;
        }

        public Criteria andFdBlogTitleLike(String value) {
            addCriterion("FD_BLOG_TITLE like", value, "fdBlogTitle");
            return (Criteria) this;
        }

        public Criteria andFdBlogTitleNotLike(String value) {
            addCriterion("FD_BLOG_TITLE not like", value, "fdBlogTitle");
            return (Criteria) this;
        }

        public Criteria andFdBlogTitleIn(List<String> values) {
            addCriterion("FD_BLOG_TITLE in", values, "fdBlogTitle");
            return (Criteria) this;
        }

        public Criteria andFdBlogTitleNotIn(List<String> values) {
            addCriterion("FD_BLOG_TITLE not in", values, "fdBlogTitle");
            return (Criteria) this;
        }

        public Criteria andFdBlogTitleBetween(String value1, String value2) {
            addCriterion("FD_BLOG_TITLE between", value1, value2, "fdBlogTitle");
            return (Criteria) this;
        }

        public Criteria andFdBlogTitleNotBetween(String value1, String value2) {
            addCriterion("FD_BLOG_TITLE not between", value1, value2, "fdBlogTitle");
            return (Criteria) this;
        }

        public Criteria andFdSupCountIsNull() {
            addCriterion("FD_SUP_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andFdSupCountIsNotNull() {
            addCriterion("FD_SUP_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFdSupCountEqualTo(String value) {
            addCriterion("FD_SUP_COUNT =", value, "fdSupCount");
            return (Criteria) this;
        }

        public Criteria andFdSupCountNotEqualTo(String value) {
            addCriterion("FD_SUP_COUNT <>", value, "fdSupCount");
            return (Criteria) this;
        }

        public Criteria andFdSupCountGreaterThan(String value) {
            addCriterion("FD_SUP_COUNT >", value, "fdSupCount");
            return (Criteria) this;
        }

        public Criteria andFdSupCountGreaterThanOrEqualTo(String value) {
            addCriterion("FD_SUP_COUNT >=", value, "fdSupCount");
            return (Criteria) this;
        }

        public Criteria andFdSupCountLessThan(String value) {
            addCriterion("FD_SUP_COUNT <", value, "fdSupCount");
            return (Criteria) this;
        }

        public Criteria andFdSupCountLessThanOrEqualTo(String value) {
            addCriterion("FD_SUP_COUNT <=", value, "fdSupCount");
            return (Criteria) this;
        }

        public Criteria andFdSupCountLike(String value) {
            addCriterion("FD_SUP_COUNT like", value, "fdSupCount");
            return (Criteria) this;
        }

        public Criteria andFdSupCountNotLike(String value) {
            addCriterion("FD_SUP_COUNT not like", value, "fdSupCount");
            return (Criteria) this;
        }

        public Criteria andFdSupCountIn(List<String> values) {
            addCriterion("FD_SUP_COUNT in", values, "fdSupCount");
            return (Criteria) this;
        }

        public Criteria andFdSupCountNotIn(List<String> values) {
            addCriterion("FD_SUP_COUNT not in", values, "fdSupCount");
            return (Criteria) this;
        }

        public Criteria andFdSupCountBetween(String value1, String value2) {
            addCriterion("FD_SUP_COUNT between", value1, value2, "fdSupCount");
            return (Criteria) this;
        }

        public Criteria andFdSupCountNotBetween(String value1, String value2) {
            addCriterion("FD_SUP_COUNT not between", value1, value2, "fdSupCount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated do_not_delete_during_merge Fri Mar 31 14:06:44 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_BL_REPLY
     *
     * @mbggenerated Fri Mar 31 14:06:44 CST 2017
     */
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