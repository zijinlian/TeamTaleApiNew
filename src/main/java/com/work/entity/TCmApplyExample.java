package com.work.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TCmApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCmApplyExample() {
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

        public Criteria andApplyidIsNull() {
            addCriterion("APPLYID is null");
            return (Criteria) this;
        }

        public Criteria andApplyidIsNotNull() {
            addCriterion("APPLYID is not null");
            return (Criteria) this;
        }

        public Criteria andApplyidEqualTo(String value) {
            addCriterion("APPLYID =", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidNotEqualTo(String value) {
            addCriterion("APPLYID <>", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidGreaterThan(String value) {
            addCriterion("APPLYID >", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYID >=", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidLessThan(String value) {
            addCriterion("APPLYID <", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidLessThanOrEqualTo(String value) {
            addCriterion("APPLYID <=", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidLike(String value) {
            addCriterion("APPLYID like", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidNotLike(String value) {
            addCriterion("APPLYID not like", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidIn(List<String> values) {
            addCriterion("APPLYID in", values, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidNotIn(List<String> values) {
            addCriterion("APPLYID not in", values, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidBetween(String value1, String value2) {
            addCriterion("APPLYID between", value1, value2, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidNotBetween(String value1, String value2) {
            addCriterion("APPLYID not between", value1, value2, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplydepartmentIsNull() {
            addCriterion("APPLYDEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andApplydepartmentIsNotNull() {
            addCriterion("APPLYDEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andApplydepartmentEqualTo(String value) {
            addCriterion("APPLYDEPARTMENT =", value, "applydepartment");
            return (Criteria) this;
        }

        public Criteria andApplydepartmentNotEqualTo(String value) {
            addCriterion("APPLYDEPARTMENT <>", value, "applydepartment");
            return (Criteria) this;
        }

        public Criteria andApplydepartmentGreaterThan(String value) {
            addCriterion("APPLYDEPARTMENT >", value, "applydepartment");
            return (Criteria) this;
        }

        public Criteria andApplydepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYDEPARTMENT >=", value, "applydepartment");
            return (Criteria) this;
        }

        public Criteria andApplydepartmentLessThan(String value) {
            addCriterion("APPLYDEPARTMENT <", value, "applydepartment");
            return (Criteria) this;
        }

        public Criteria andApplydepartmentLessThanOrEqualTo(String value) {
            addCriterion("APPLYDEPARTMENT <=", value, "applydepartment");
            return (Criteria) this;
        }

        public Criteria andApplydepartmentLike(String value) {
            addCriterion("APPLYDEPARTMENT like", value, "applydepartment");
            return (Criteria) this;
        }

        public Criteria andApplydepartmentNotLike(String value) {
            addCriterion("APPLYDEPARTMENT not like", value, "applydepartment");
            return (Criteria) this;
        }

        public Criteria andApplydepartmentIn(List<String> values) {
            addCriterion("APPLYDEPARTMENT in", values, "applydepartment");
            return (Criteria) this;
        }

        public Criteria andApplydepartmentNotIn(List<String> values) {
            addCriterion("APPLYDEPARTMENT not in", values, "applydepartment");
            return (Criteria) this;
        }

        public Criteria andApplydepartmentBetween(String value1, String value2) {
            addCriterion("APPLYDEPARTMENT between", value1, value2, "applydepartment");
            return (Criteria) this;
        }

        public Criteria andApplydepartmentNotBetween(String value1, String value2) {
            addCriterion("APPLYDEPARTMENT not between", value1, value2, "applydepartment");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("CONTACTS is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("CONTACTS is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("CONTACTS =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("CONTACTS <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("CONTACTS >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTS >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("CONTACTS <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("CONTACTS <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("CONTACTS like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("CONTACTS not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("CONTACTS in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("CONTACTS not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("CONTACTS between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("CONTACTS not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("TELPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("TELPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("TELPHONE =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("TELPHONE <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("TELPHONE >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELPHONE >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("TELPHONE <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("TELPHONE <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("TELPHONE like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("TELPHONE not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("TELPHONE in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("TELPHONE not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("TELPHONE between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("TELPHONE not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andMeetpeoplesIsNull() {
            addCriterion("MEETPEOPLES is null");
            return (Criteria) this;
        }

        public Criteria andMeetpeoplesIsNotNull() {
            addCriterion("MEETPEOPLES is not null");
            return (Criteria) this;
        }

        public Criteria andMeetpeoplesEqualTo(BigDecimal value) {
            addCriterion("MEETPEOPLES =", value, "meetpeoples");
            return (Criteria) this;
        }

        public Criteria andMeetpeoplesNotEqualTo(BigDecimal value) {
            addCriterion("MEETPEOPLES <>", value, "meetpeoples");
            return (Criteria) this;
        }

        public Criteria andMeetpeoplesGreaterThan(BigDecimal value) {
            addCriterion("MEETPEOPLES >", value, "meetpeoples");
            return (Criteria) this;
        }

        public Criteria andMeetpeoplesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MEETPEOPLES >=", value, "meetpeoples");
            return (Criteria) this;
        }

        public Criteria andMeetpeoplesLessThan(BigDecimal value) {
            addCriterion("MEETPEOPLES <", value, "meetpeoples");
            return (Criteria) this;
        }

        public Criteria andMeetpeoplesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MEETPEOPLES <=", value, "meetpeoples");
            return (Criteria) this;
        }

        public Criteria andMeetpeoplesIn(List<BigDecimal> values) {
            addCriterion("MEETPEOPLES in", values, "meetpeoples");
            return (Criteria) this;
        }

        public Criteria andMeetpeoplesNotIn(List<BigDecimal> values) {
            addCriterion("MEETPEOPLES not in", values, "meetpeoples");
            return (Criteria) this;
        }

        public Criteria andMeetpeoplesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MEETPEOPLES between", value1, value2, "meetpeoples");
            return (Criteria) this;
        }

        public Criteria andMeetpeoplesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MEETPEOPLES not between", value1, value2, "meetpeoples");
            return (Criteria) this;
        }

        public Criteria andMeetnameIsNull() {
            addCriterion("MEETNAME is null");
            return (Criteria) this;
        }

        public Criteria andMeetnameIsNotNull() {
            addCriterion("MEETNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMeetnameEqualTo(String value) {
            addCriterion("MEETNAME =", value, "meetname");
            return (Criteria) this;
        }

        public Criteria andMeetnameNotEqualTo(String value) {
            addCriterion("MEETNAME <>", value, "meetname");
            return (Criteria) this;
        }

        public Criteria andMeetnameGreaterThan(String value) {
            addCriterion("MEETNAME >", value, "meetname");
            return (Criteria) this;
        }

        public Criteria andMeetnameGreaterThanOrEqualTo(String value) {
            addCriterion("MEETNAME >=", value, "meetname");
            return (Criteria) this;
        }

        public Criteria andMeetnameLessThan(String value) {
            addCriterion("MEETNAME <", value, "meetname");
            return (Criteria) this;
        }

        public Criteria andMeetnameLessThanOrEqualTo(String value) {
            addCriterion("MEETNAME <=", value, "meetname");
            return (Criteria) this;
        }

        public Criteria andMeetnameLike(String value) {
            addCriterion("MEETNAME like", value, "meetname");
            return (Criteria) this;
        }

        public Criteria andMeetnameNotLike(String value) {
            addCriterion("MEETNAME not like", value, "meetname");
            return (Criteria) this;
        }

        public Criteria andMeetnameIn(List<String> values) {
            addCriterion("MEETNAME in", values, "meetname");
            return (Criteria) this;
        }

        public Criteria andMeetnameNotIn(List<String> values) {
            addCriterion("MEETNAME not in", values, "meetname");
            return (Criteria) this;
        }

        public Criteria andMeetnameBetween(String value1, String value2) {
            addCriterion("MEETNAME between", value1, value2, "meetname");
            return (Criteria) this;
        }

        public Criteria andMeetnameNotBetween(String value1, String value2) {
            addCriterion("MEETNAME not between", value1, value2, "meetname");
            return (Criteria) this;
        }

        public Criteria andMeetstarttimeIsNull() {
            addCriterion("MEETSTARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andMeetstarttimeIsNotNull() {
            addCriterion("MEETSTARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andMeetstarttimeEqualTo(String value) {
            addCriterion("MEETSTARTTIME =", value, "meetstarttime");
            return (Criteria) this;
        }

        public Criteria andMeetstarttimeNotEqualTo(String value) {
            addCriterion("MEETSTARTTIME <>", value, "meetstarttime");
            return (Criteria) this;
        }

        public Criteria andMeetstarttimeGreaterThan(String value) {
            addCriterion("MEETSTARTTIME >", value, "meetstarttime");
            return (Criteria) this;
        }

        public Criteria andMeetstarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("MEETSTARTTIME >=", value, "meetstarttime");
            return (Criteria) this;
        }

        public Criteria andMeetstarttimeLessThan(String value) {
            addCriterion("MEETSTARTTIME <", value, "meetstarttime");
            return (Criteria) this;
        }

        public Criteria andMeetstarttimeLessThanOrEqualTo(String value) {
            addCriterion("MEETSTARTTIME <=", value, "meetstarttime");
            return (Criteria) this;
        }

        public Criteria andMeetstarttimeLike(String value) {
            addCriterion("MEETSTARTTIME like", value, "meetstarttime");
            return (Criteria) this;
        }

        public Criteria andMeetstarttimeNotLike(String value) {
            addCriterion("MEETSTARTTIME not like", value, "meetstarttime");
            return (Criteria) this;
        }

        public Criteria andMeetstarttimeIn(List<String> values) {
            addCriterion("MEETSTARTTIME in", values, "meetstarttime");
            return (Criteria) this;
        }

        public Criteria andMeetstarttimeNotIn(List<String> values) {
            addCriterion("MEETSTARTTIME not in", values, "meetstarttime");
            return (Criteria) this;
        }

        public Criteria andMeetstarttimeBetween(String value1, String value2) {
            addCriterion("MEETSTARTTIME between", value1, value2, "meetstarttime");
            return (Criteria) this;
        }

        public Criteria andMeetstarttimeNotBetween(String value1, String value2) {
            addCriterion("MEETSTARTTIME not between", value1, value2, "meetstarttime");
            return (Criteria) this;
        }

        public Criteria andMeetendtimeIsNull() {
            addCriterion("MEETENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andMeetendtimeIsNotNull() {
            addCriterion("MEETENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andMeetendtimeEqualTo(String value) {
            addCriterion("MEETENDTIME =", value, "meetendtime");
            return (Criteria) this;
        }

        public Criteria andMeetendtimeNotEqualTo(String value) {
            addCriterion("MEETENDTIME <>", value, "meetendtime");
            return (Criteria) this;
        }

        public Criteria andMeetendtimeGreaterThan(String value) {
            addCriterion("MEETENDTIME >", value, "meetendtime");
            return (Criteria) this;
        }

        public Criteria andMeetendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("MEETENDTIME >=", value, "meetendtime");
            return (Criteria) this;
        }

        public Criteria andMeetendtimeLessThan(String value) {
            addCriterion("MEETENDTIME <", value, "meetendtime");
            return (Criteria) this;
        }

        public Criteria andMeetendtimeLessThanOrEqualTo(String value) {
            addCriterion("MEETENDTIME <=", value, "meetendtime");
            return (Criteria) this;
        }

        public Criteria andMeetendtimeLike(String value) {
            addCriterion("MEETENDTIME like", value, "meetendtime");
            return (Criteria) this;
        }

        public Criteria andMeetendtimeNotLike(String value) {
            addCriterion("MEETENDTIME not like", value, "meetendtime");
            return (Criteria) this;
        }

        public Criteria andMeetendtimeIn(List<String> values) {
            addCriterion("MEETENDTIME in", values, "meetendtime");
            return (Criteria) this;
        }

        public Criteria andMeetendtimeNotIn(List<String> values) {
            addCriterion("MEETENDTIME not in", values, "meetendtime");
            return (Criteria) this;
        }

        public Criteria andMeetendtimeBetween(String value1, String value2) {
            addCriterion("MEETENDTIME between", value1, value2, "meetendtime");
            return (Criteria) this;
        }

        public Criteria andMeetendtimeNotBetween(String value1, String value2) {
            addCriterion("MEETENDTIME not between", value1, value2, "meetendtime");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("LEADER is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("LEADER =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("LEADER <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("LEADER >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("LEADER >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("LEADER <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("LEADER <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("LEADER like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("LEADER not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("LEADER in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("LEADER not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("LEADER between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("LEADER not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andParticipantsIsNull() {
            addCriterion("PARTICIPANTS is null");
            return (Criteria) this;
        }

        public Criteria andParticipantsIsNotNull() {
            addCriterion("PARTICIPANTS is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantsEqualTo(String value) {
            addCriterion("PARTICIPANTS =", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsNotEqualTo(String value) {
            addCriterion("PARTICIPANTS <>", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsGreaterThan(String value) {
            addCriterion("PARTICIPANTS >", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsGreaterThanOrEqualTo(String value) {
            addCriterion("PARTICIPANTS >=", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsLessThan(String value) {
            addCriterion("PARTICIPANTS <", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsLessThanOrEqualTo(String value) {
            addCriterion("PARTICIPANTS <=", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsLike(String value) {
            addCriterion("PARTICIPANTS like", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsNotLike(String value) {
            addCriterion("PARTICIPANTS not like", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsIn(List<String> values) {
            addCriterion("PARTICIPANTS in", values, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsNotIn(List<String> values) {
            addCriterion("PARTICIPANTS not in", values, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsBetween(String value1, String value2) {
            addCriterion("PARTICIPANTS between", value1, value2, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsNotBetween(String value1, String value2) {
            addCriterion("PARTICIPANTS not between", value1, value2, "participants");
            return (Criteria) this;
        }

        public Criteria andMeetdemandIsNull() {
            addCriterion("MEETDEMAND is null");
            return (Criteria) this;
        }

        public Criteria andMeetdemandIsNotNull() {
            addCriterion("MEETDEMAND is not null");
            return (Criteria) this;
        }

        public Criteria andMeetdemandEqualTo(String value) {
            addCriterion("MEETDEMAND =", value, "meetdemand");
            return (Criteria) this;
        }

        public Criteria andMeetdemandNotEqualTo(String value) {
            addCriterion("MEETDEMAND <>", value, "meetdemand");
            return (Criteria) this;
        }

        public Criteria andMeetdemandGreaterThan(String value) {
            addCriterion("MEETDEMAND >", value, "meetdemand");
            return (Criteria) this;
        }

        public Criteria andMeetdemandGreaterThanOrEqualTo(String value) {
            addCriterion("MEETDEMAND >=", value, "meetdemand");
            return (Criteria) this;
        }

        public Criteria andMeetdemandLessThan(String value) {
            addCriterion("MEETDEMAND <", value, "meetdemand");
            return (Criteria) this;
        }

        public Criteria andMeetdemandLessThanOrEqualTo(String value) {
            addCriterion("MEETDEMAND <=", value, "meetdemand");
            return (Criteria) this;
        }

        public Criteria andMeetdemandLike(String value) {
            addCriterion("MEETDEMAND like", value, "meetdemand");
            return (Criteria) this;
        }

        public Criteria andMeetdemandNotLike(String value) {
            addCriterion("MEETDEMAND not like", value, "meetdemand");
            return (Criteria) this;
        }

        public Criteria andMeetdemandIn(List<String> values) {
            addCriterion("MEETDEMAND in", values, "meetdemand");
            return (Criteria) this;
        }

        public Criteria andMeetdemandNotIn(List<String> values) {
            addCriterion("MEETDEMAND not in", values, "meetdemand");
            return (Criteria) this;
        }

        public Criteria andMeetdemandBetween(String value1, String value2) {
            addCriterion("MEETDEMAND between", value1, value2, "meetdemand");
            return (Criteria) this;
        }

        public Criteria andMeetdemandNotBetween(String value1, String value2) {
            addCriterion("MEETDEMAND not between", value1, value2, "meetdemand");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNull() {
            addCriterion("EMPID is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(String value) {
            addCriterion("EMPID =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(String value) {
            addCriterion("EMPID <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(String value) {
            addCriterion("EMPID >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("EMPID >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(String value) {
            addCriterion("EMPID <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(String value) {
            addCriterion("EMPID <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLike(String value) {
            addCriterion("EMPID like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotLike(String value) {
            addCriterion("EMPID not like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<String> values) {
            addCriterion("EMPID in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<String> values) {
            addCriterion("EMPID not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(String value1, String value2) {
            addCriterion("EMPID between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(String value1, String value2) {
            addCriterion("EMPID not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNull() {
            addCriterion("EMPNAME is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("EMPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("EMPNAME =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("EMPNAME <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("EMPNAME >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPNAME >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("EMPNAME <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("EMPNAME <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("EMPNAME like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("EMPNAME not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("EMPNAME in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("EMPNAME not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("EMPNAME between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("EMPNAME not between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("APPLYTIME is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("APPLYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(String value) {
            addCriterion("APPLYTIME =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(String value) {
            addCriterion("APPLYTIME <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(String value) {
            addCriterion("APPLYTIME >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYTIME >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(String value) {
            addCriterion("APPLYTIME <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(String value) {
            addCriterion("APPLYTIME <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLike(String value) {
            addCriterion("APPLYTIME like", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotLike(String value) {
            addCriterion("APPLYTIME not like", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<String> values) {
            addCriterion("APPLYTIME in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<String> values) {
            addCriterion("APPLYTIME not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(String value1, String value2) {
            addCriterion("APPLYTIME between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(String value1, String value2) {
            addCriterion("APPLYTIME not between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplyWaterIsNull() {
            addCriterion("APPLY_WATER is null");
            return (Criteria) this;
        }

        public Criteria andApplyWaterIsNotNull() {
            addCriterion("APPLY_WATER is not null");
            return (Criteria) this;
        }

        public Criteria andApplyWaterEqualTo(BigDecimal value) {
            addCriterion("APPLY_WATER =", value, "applyWater");
            return (Criteria) this;
        }

        public Criteria andApplyWaterNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_WATER <>", value, "applyWater");
            return (Criteria) this;
        }

        public Criteria andApplyWaterGreaterThan(BigDecimal value) {
            addCriterion("APPLY_WATER >", value, "applyWater");
            return (Criteria) this;
        }

        public Criteria andApplyWaterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_WATER >=", value, "applyWater");
            return (Criteria) this;
        }

        public Criteria andApplyWaterLessThan(BigDecimal value) {
            addCriterion("APPLY_WATER <", value, "applyWater");
            return (Criteria) this;
        }

        public Criteria andApplyWaterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_WATER <=", value, "applyWater");
            return (Criteria) this;
        }

        public Criteria andApplyWaterIn(List<BigDecimal> values) {
            addCriterion("APPLY_WATER in", values, "applyWater");
            return (Criteria) this;
        }

        public Criteria andApplyWaterNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_WATER not in", values, "applyWater");
            return (Criteria) this;
        }

        public Criteria andApplyWaterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_WATER between", value1, value2, "applyWater");
            return (Criteria) this;
        }

        public Criteria andApplyWaterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_WATER not between", value1, value2, "applyWater");
            return (Criteria) this;
        }

        public Criteria andApplyTeamIsNull() {
            addCriterion("APPLY_TEAM is null");
            return (Criteria) this;
        }

        public Criteria andApplyTeamIsNotNull() {
            addCriterion("APPLY_TEAM is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTeamEqualTo(BigDecimal value) {
            addCriterion("APPLY_TEAM =", value, "applyTeam");
            return (Criteria) this;
        }

        public Criteria andApplyTeamNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_TEAM <>", value, "applyTeam");
            return (Criteria) this;
        }

        public Criteria andApplyTeamGreaterThan(BigDecimal value) {
            addCriterion("APPLY_TEAM >", value, "applyTeam");
            return (Criteria) this;
        }

        public Criteria andApplyTeamGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_TEAM >=", value, "applyTeam");
            return (Criteria) this;
        }

        public Criteria andApplyTeamLessThan(BigDecimal value) {
            addCriterion("APPLY_TEAM <", value, "applyTeam");
            return (Criteria) this;
        }

        public Criteria andApplyTeamLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_TEAM <=", value, "applyTeam");
            return (Criteria) this;
        }

        public Criteria andApplyTeamIn(List<BigDecimal> values) {
            addCriterion("APPLY_TEAM in", values, "applyTeam");
            return (Criteria) this;
        }

        public Criteria andApplyTeamNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_TEAM not in", values, "applyTeam");
            return (Criteria) this;
        }

        public Criteria andApplyTeamBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_TEAM between", value1, value2, "applyTeam");
            return (Criteria) this;
        }

        public Criteria andApplyTeamNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_TEAM not between", value1, value2, "applyTeam");
            return (Criteria) this;
        }

        public Criteria andApplyContenIsNull() {
            addCriterion("APPLY_CONTEN is null");
            return (Criteria) this;
        }

        public Criteria andApplyContenIsNotNull() {
            addCriterion("APPLY_CONTEN is not null");
            return (Criteria) this;
        }

        public Criteria andApplyContenEqualTo(String value) {
            addCriterion("APPLY_CONTEN =", value, "applyConten");
            return (Criteria) this;
        }

        public Criteria andApplyContenNotEqualTo(String value) {
            addCriterion("APPLY_CONTEN <>", value, "applyConten");
            return (Criteria) this;
        }

        public Criteria andApplyContenGreaterThan(String value) {
            addCriterion("APPLY_CONTEN >", value, "applyConten");
            return (Criteria) this;
        }

        public Criteria andApplyContenGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_CONTEN >=", value, "applyConten");
            return (Criteria) this;
        }

        public Criteria andApplyContenLessThan(String value) {
            addCriterion("APPLY_CONTEN <", value, "applyConten");
            return (Criteria) this;
        }

        public Criteria andApplyContenLessThanOrEqualTo(String value) {
            addCriterion("APPLY_CONTEN <=", value, "applyConten");
            return (Criteria) this;
        }

        public Criteria andApplyContenLike(String value) {
            addCriterion("APPLY_CONTEN like", value, "applyConten");
            return (Criteria) this;
        }

        public Criteria andApplyContenNotLike(String value) {
            addCriterion("APPLY_CONTEN not like", value, "applyConten");
            return (Criteria) this;
        }

        public Criteria andApplyContenIn(List<String> values) {
            addCriterion("APPLY_CONTEN in", values, "applyConten");
            return (Criteria) this;
        }

        public Criteria andApplyContenNotIn(List<String> values) {
            addCriterion("APPLY_CONTEN not in", values, "applyConten");
            return (Criteria) this;
        }

        public Criteria andApplyContenBetween(String value1, String value2) {
            addCriterion("APPLY_CONTEN between", value1, value2, "applyConten");
            return (Criteria) this;
        }

        public Criteria andApplyContenNotBetween(String value1, String value2) {
            addCriterion("APPLY_CONTEN not between", value1, value2, "applyConten");
            return (Criteria) this;
        }

        public Criteria andApplySuperIsNull() {
            addCriterion("APPLY_SUPER is null");
            return (Criteria) this;
        }

        public Criteria andApplySuperIsNotNull() {
            addCriterion("APPLY_SUPER is not null");
            return (Criteria) this;
        }

        public Criteria andApplySuperEqualTo(BigDecimal value) {
            addCriterion("APPLY_SUPER =", value, "applySuper");
            return (Criteria) this;
        }

        public Criteria andApplySuperNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_SUPER <>", value, "applySuper");
            return (Criteria) this;
        }

        public Criteria andApplySuperGreaterThan(BigDecimal value) {
            addCriterion("APPLY_SUPER >", value, "applySuper");
            return (Criteria) this;
        }

        public Criteria andApplySuperGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_SUPER >=", value, "applySuper");
            return (Criteria) this;
        }

        public Criteria andApplySuperLessThan(BigDecimal value) {
            addCriterion("APPLY_SUPER <", value, "applySuper");
            return (Criteria) this;
        }

        public Criteria andApplySuperLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_SUPER <=", value, "applySuper");
            return (Criteria) this;
        }

        public Criteria andApplySuperIn(List<BigDecimal> values) {
            addCriterion("APPLY_SUPER in", values, "applySuper");
            return (Criteria) this;
        }

        public Criteria andApplySuperNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_SUPER not in", values, "applySuper");
            return (Criteria) this;
        }

        public Criteria andApplySuperBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_SUPER between", value1, value2, "applySuper");
            return (Criteria) this;
        }

        public Criteria andApplySuperNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_SUPER not between", value1, value2, "applySuper");
            return (Criteria) this;
        }

        public Criteria andApplyDeskIsNull() {
            addCriterion("APPLY_DESK is null");
            return (Criteria) this;
        }

        public Criteria andApplyDeskIsNotNull() {
            addCriterion("APPLY_DESK is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDeskEqualTo(BigDecimal value) {
            addCriterion("APPLY_DESK =", value, "applyDesk");
            return (Criteria) this;
        }

        public Criteria andApplyDeskNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_DESK <>", value, "applyDesk");
            return (Criteria) this;
        }

        public Criteria andApplyDeskGreaterThan(BigDecimal value) {
            addCriterion("APPLY_DESK >", value, "applyDesk");
            return (Criteria) this;
        }

        public Criteria andApplyDeskGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_DESK >=", value, "applyDesk");
            return (Criteria) this;
        }

        public Criteria andApplyDeskLessThan(BigDecimal value) {
            addCriterion("APPLY_DESK <", value, "applyDesk");
            return (Criteria) this;
        }

        public Criteria andApplyDeskLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_DESK <=", value, "applyDesk");
            return (Criteria) this;
        }

        public Criteria andApplyDeskIn(List<BigDecimal> values) {
            addCriterion("APPLY_DESK in", values, "applyDesk");
            return (Criteria) this;
        }

        public Criteria andApplyDeskNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_DESK not in", values, "applyDesk");
            return (Criteria) this;
        }

        public Criteria andApplyDeskBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_DESK between", value1, value2, "applyDesk");
            return (Criteria) this;
        }

        public Criteria andApplyDeskNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_DESK not between", value1, value2, "applyDesk");
            return (Criteria) this;
        }

        public Criteria andApplySignIsNull() {
            addCriterion("APPLY_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andApplySignIsNotNull() {
            addCriterion("APPLY_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andApplySignEqualTo(BigDecimal value) {
            addCriterion("APPLY_SIGN =", value, "applySign");
            return (Criteria) this;
        }

        public Criteria andApplySignNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_SIGN <>", value, "applySign");
            return (Criteria) this;
        }

        public Criteria andApplySignGreaterThan(BigDecimal value) {
            addCriterion("APPLY_SIGN >", value, "applySign");
            return (Criteria) this;
        }

        public Criteria andApplySignGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_SIGN >=", value, "applySign");
            return (Criteria) this;
        }

        public Criteria andApplySignLessThan(BigDecimal value) {
            addCriterion("APPLY_SIGN <", value, "applySign");
            return (Criteria) this;
        }

        public Criteria andApplySignLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_SIGN <=", value, "applySign");
            return (Criteria) this;
        }

        public Criteria andApplySignIn(List<BigDecimal> values) {
            addCriterion("APPLY_SIGN in", values, "applySign");
            return (Criteria) this;
        }

        public Criteria andApplySignNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_SIGN not in", values, "applySign");
            return (Criteria) this;
        }

        public Criteria andApplySignBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_SIGN between", value1, value2, "applySign");
            return (Criteria) this;
        }

        public Criteria andApplySignNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_SIGN not between", value1, value2, "applySign");
            return (Criteria) this;
        }

        public Criteria andApplyWhiteIsNull() {
            addCriterion("APPLY_WHITE is null");
            return (Criteria) this;
        }

        public Criteria andApplyWhiteIsNotNull() {
            addCriterion("APPLY_WHITE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyWhiteEqualTo(BigDecimal value) {
            addCriterion("APPLY_WHITE =", value, "applyWhite");
            return (Criteria) this;
        }

        public Criteria andApplyWhiteNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_WHITE <>", value, "applyWhite");
            return (Criteria) this;
        }

        public Criteria andApplyWhiteGreaterThan(BigDecimal value) {
            addCriterion("APPLY_WHITE >", value, "applyWhite");
            return (Criteria) this;
        }

        public Criteria andApplyWhiteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_WHITE >=", value, "applyWhite");
            return (Criteria) this;
        }

        public Criteria andApplyWhiteLessThan(BigDecimal value) {
            addCriterion("APPLY_WHITE <", value, "applyWhite");
            return (Criteria) this;
        }

        public Criteria andApplyWhiteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_WHITE <=", value, "applyWhite");
            return (Criteria) this;
        }

        public Criteria andApplyWhiteIn(List<BigDecimal> values) {
            addCriterion("APPLY_WHITE in", values, "applyWhite");
            return (Criteria) this;
        }

        public Criteria andApplyWhiteNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_WHITE not in", values, "applyWhite");
            return (Criteria) this;
        }

        public Criteria andApplyWhiteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_WHITE between", value1, value2, "applyWhite");
            return (Criteria) this;
        }

        public Criteria andApplyWhiteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_WHITE not between", value1, value2, "applyWhite");
            return (Criteria) this;
        }

        public Criteria andApplyResetIsNull() {
            addCriterion("APPLY_RESET is null");
            return (Criteria) this;
        }

        public Criteria andApplyResetIsNotNull() {
            addCriterion("APPLY_RESET is not null");
            return (Criteria) this;
        }

        public Criteria andApplyResetEqualTo(BigDecimal value) {
            addCriterion("APPLY_RESET =", value, "applyReset");
            return (Criteria) this;
        }

        public Criteria andApplyResetNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_RESET <>", value, "applyReset");
            return (Criteria) this;
        }

        public Criteria andApplyResetGreaterThan(BigDecimal value) {
            addCriterion("APPLY_RESET >", value, "applyReset");
            return (Criteria) this;
        }

        public Criteria andApplyResetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_RESET >=", value, "applyReset");
            return (Criteria) this;
        }

        public Criteria andApplyResetLessThan(BigDecimal value) {
            addCriterion("APPLY_RESET <", value, "applyReset");
            return (Criteria) this;
        }

        public Criteria andApplyResetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_RESET <=", value, "applyReset");
            return (Criteria) this;
        }

        public Criteria andApplyResetIn(List<BigDecimal> values) {
            addCriterion("APPLY_RESET in", values, "applyReset");
            return (Criteria) this;
        }

        public Criteria andApplyResetNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_RESET not in", values, "applyReset");
            return (Criteria) this;
        }

        public Criteria andApplyResetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_RESET between", value1, value2, "applyReset");
            return (Criteria) this;
        }

        public Criteria andApplyResetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_RESET not between", value1, value2, "applyReset");
            return (Criteria) this;
        }

        public Criteria andApplyVideoIsNull() {
            addCriterion("APPLY_VIDEO is null");
            return (Criteria) this;
        }

        public Criteria andApplyVideoIsNotNull() {
            addCriterion("APPLY_VIDEO is not null");
            return (Criteria) this;
        }

        public Criteria andApplyVideoEqualTo(BigDecimal value) {
            addCriterion("APPLY_VIDEO =", value, "applyVideo");
            return (Criteria) this;
        }

        public Criteria andApplyVideoNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_VIDEO <>", value, "applyVideo");
            return (Criteria) this;
        }

        public Criteria andApplyVideoGreaterThan(BigDecimal value) {
            addCriterion("APPLY_VIDEO >", value, "applyVideo");
            return (Criteria) this;
        }

        public Criteria andApplyVideoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_VIDEO >=", value, "applyVideo");
            return (Criteria) this;
        }

        public Criteria andApplyVideoLessThan(BigDecimal value) {
            addCriterion("APPLY_VIDEO <", value, "applyVideo");
            return (Criteria) this;
        }

        public Criteria andApplyVideoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_VIDEO <=", value, "applyVideo");
            return (Criteria) this;
        }

        public Criteria andApplyVideoIn(List<BigDecimal> values) {
            addCriterion("APPLY_VIDEO in", values, "applyVideo");
            return (Criteria) this;
        }

        public Criteria andApplyVideoNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_VIDEO not in", values, "applyVideo");
            return (Criteria) this;
        }

        public Criteria andApplyVideoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_VIDEO between", value1, value2, "applyVideo");
            return (Criteria) this;
        }

        public Criteria andApplyVideoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_VIDEO not between", value1, value2, "applyVideo");
            return (Criteria) this;
        }

        public Criteria andApplyProjectorIsNull() {
            addCriterion("APPLY_PROJECTOR is null");
            return (Criteria) this;
        }

        public Criteria andApplyProjectorIsNotNull() {
            addCriterion("APPLY_PROJECTOR is not null");
            return (Criteria) this;
        }

        public Criteria andApplyProjectorEqualTo(BigDecimal value) {
            addCriterion("APPLY_PROJECTOR =", value, "applyProjector");
            return (Criteria) this;
        }

        public Criteria andApplyProjectorNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_PROJECTOR <>", value, "applyProjector");
            return (Criteria) this;
        }

        public Criteria andApplyProjectorGreaterThan(BigDecimal value) {
            addCriterion("APPLY_PROJECTOR >", value, "applyProjector");
            return (Criteria) this;
        }

        public Criteria andApplyProjectorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_PROJECTOR >=", value, "applyProjector");
            return (Criteria) this;
        }

        public Criteria andApplyProjectorLessThan(BigDecimal value) {
            addCriterion("APPLY_PROJECTOR <", value, "applyProjector");
            return (Criteria) this;
        }

        public Criteria andApplyProjectorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_PROJECTOR <=", value, "applyProjector");
            return (Criteria) this;
        }

        public Criteria andApplyProjectorIn(List<BigDecimal> values) {
            addCriterion("APPLY_PROJECTOR in", values, "applyProjector");
            return (Criteria) this;
        }

        public Criteria andApplyProjectorNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_PROJECTOR not in", values, "applyProjector");
            return (Criteria) this;
        }

        public Criteria andApplyProjectorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_PROJECTOR between", value1, value2, "applyProjector");
            return (Criteria) this;
        }

        public Criteria andApplyProjectorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_PROJECTOR not between", value1, value2, "applyProjector");
            return (Criteria) this;
        }

        public Criteria andApplyMakeIsNull() {
            addCriterion("APPLY_MAKE is null");
            return (Criteria) this;
        }

        public Criteria andApplyMakeIsNotNull() {
            addCriterion("APPLY_MAKE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyMakeEqualTo(BigDecimal value) {
            addCriterion("APPLY_MAKE =", value, "applyMake");
            return (Criteria) this;
        }

        public Criteria andApplyMakeNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_MAKE <>", value, "applyMake");
            return (Criteria) this;
        }

        public Criteria andApplyMakeGreaterThan(BigDecimal value) {
            addCriterion("APPLY_MAKE >", value, "applyMake");
            return (Criteria) this;
        }

        public Criteria andApplyMakeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_MAKE >=", value, "applyMake");
            return (Criteria) this;
        }

        public Criteria andApplyMakeLessThan(BigDecimal value) {
            addCriterion("APPLY_MAKE <", value, "applyMake");
            return (Criteria) this;
        }

        public Criteria andApplyMakeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_MAKE <=", value, "applyMake");
            return (Criteria) this;
        }

        public Criteria andApplyMakeIn(List<BigDecimal> values) {
            addCriterion("APPLY_MAKE in", values, "applyMake");
            return (Criteria) this;
        }

        public Criteria andApplyMakeNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_MAKE not in", values, "applyMake");
            return (Criteria) this;
        }

        public Criteria andApplyMakeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_MAKE between", value1, value2, "applyMake");
            return (Criteria) this;
        }

        public Criteria andApplyMakeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_MAKE not between", value1, value2, "applyMake");
            return (Criteria) this;
        }

        public Criteria andApplyTapeIsNull() {
            addCriterion("APPLY_TAPE is null");
            return (Criteria) this;
        }

        public Criteria andApplyTapeIsNotNull() {
            addCriterion("APPLY_TAPE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTapeEqualTo(BigDecimal value) {
            addCriterion("APPLY_TAPE =", value, "applyTape");
            return (Criteria) this;
        }

        public Criteria andApplyTapeNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_TAPE <>", value, "applyTape");
            return (Criteria) this;
        }

        public Criteria andApplyTapeGreaterThan(BigDecimal value) {
            addCriterion("APPLY_TAPE >", value, "applyTape");
            return (Criteria) this;
        }

        public Criteria andApplyTapeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_TAPE >=", value, "applyTape");
            return (Criteria) this;
        }

        public Criteria andApplyTapeLessThan(BigDecimal value) {
            addCriterion("APPLY_TAPE <", value, "applyTape");
            return (Criteria) this;
        }

        public Criteria andApplyTapeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_TAPE <=", value, "applyTape");
            return (Criteria) this;
        }

        public Criteria andApplyTapeIn(List<BigDecimal> values) {
            addCriterion("APPLY_TAPE in", values, "applyTape");
            return (Criteria) this;
        }

        public Criteria andApplyTapeNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_TAPE not in", values, "applyTape");
            return (Criteria) this;
        }

        public Criteria andApplyTapeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_TAPE between", value1, value2, "applyTape");
            return (Criteria) this;
        }

        public Criteria andApplyTapeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_TAPE not between", value1, value2, "applyTape");
            return (Criteria) this;
        }

        public Criteria andApplyVideotapeIsNull() {
            addCriterion("APPLY_VIDEOTAPE is null");
            return (Criteria) this;
        }

        public Criteria andApplyVideotapeIsNotNull() {
            addCriterion("APPLY_VIDEOTAPE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyVideotapeEqualTo(BigDecimal value) {
            addCriterion("APPLY_VIDEOTAPE =", value, "applyVideotape");
            return (Criteria) this;
        }

        public Criteria andApplyVideotapeNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_VIDEOTAPE <>", value, "applyVideotape");
            return (Criteria) this;
        }

        public Criteria andApplyVideotapeGreaterThan(BigDecimal value) {
            addCriterion("APPLY_VIDEOTAPE >", value, "applyVideotape");
            return (Criteria) this;
        }

        public Criteria andApplyVideotapeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_VIDEOTAPE >=", value, "applyVideotape");
            return (Criteria) this;
        }

        public Criteria andApplyVideotapeLessThan(BigDecimal value) {
            addCriterion("APPLY_VIDEOTAPE <", value, "applyVideotape");
            return (Criteria) this;
        }

        public Criteria andApplyVideotapeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_VIDEOTAPE <=", value, "applyVideotape");
            return (Criteria) this;
        }

        public Criteria andApplyVideotapeIn(List<BigDecimal> values) {
            addCriterion("APPLY_VIDEOTAPE in", values, "applyVideotape");
            return (Criteria) this;
        }

        public Criteria andApplyVideotapeNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_VIDEOTAPE not in", values, "applyVideotape");
            return (Criteria) this;
        }

        public Criteria andApplyVideotapeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_VIDEOTAPE between", value1, value2, "applyVideotape");
            return (Criteria) this;
        }

        public Criteria andApplyVideotapeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_VIDEOTAPE not between", value1, value2, "applyVideotape");
            return (Criteria) this;
        }

        public Criteria andApplyLevelIsNull() {
            addCriterion("APPLY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andApplyLevelIsNotNull() {
            addCriterion("APPLY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andApplyLevelEqualTo(BigDecimal value) {
            addCriterion("APPLY_LEVEL =", value, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_LEVEL <>", value, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelGreaterThan(BigDecimal value) {
            addCriterion("APPLY_LEVEL >", value, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_LEVEL >=", value, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelLessThan(BigDecimal value) {
            addCriterion("APPLY_LEVEL <", value, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_LEVEL <=", value, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelIn(List<BigDecimal> values) {
            addCriterion("APPLY_LEVEL in", values, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_LEVEL not in", values, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_LEVEL between", value1, value2, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplyLevelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_LEVEL not between", value1, value2, "applyLevel");
            return (Criteria) this;
        }

        public Criteria andApplystatusIsNull() {
            addCriterion("APPLYSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andApplystatusIsNotNull() {
            addCriterion("APPLYSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andApplystatusEqualTo(String value) {
            addCriterion("APPLYSTATUS =", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotEqualTo(String value) {
            addCriterion("APPLYSTATUS <>", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusGreaterThan(String value) {
            addCriterion("APPLYSTATUS >", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYSTATUS >=", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLessThan(String value) {
            addCriterion("APPLYSTATUS <", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLessThanOrEqualTo(String value) {
            addCriterion("APPLYSTATUS <=", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLike(String value) {
            addCriterion("APPLYSTATUS like", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotLike(String value) {
            addCriterion("APPLYSTATUS not like", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusIn(List<String> values) {
            addCriterion("APPLYSTATUS in", values, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotIn(List<String> values) {
            addCriterion("APPLYSTATUS not in", values, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusBetween(String value1, String value2) {
            addCriterion("APPLYSTATUS between", value1, value2, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotBetween(String value1, String value2) {
            addCriterion("APPLYSTATUS not between", value1, value2, "applystatus");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidIsNull() {
            addCriterion("ROOMTYPEID is null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidIsNotNull() {
            addCriterion("ROOMTYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidEqualTo(String value) {
            addCriterion("ROOMTYPEID =", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidNotEqualTo(String value) {
            addCriterion("ROOMTYPEID <>", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidGreaterThan(String value) {
            addCriterion("ROOMTYPEID >", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("ROOMTYPEID >=", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidLessThan(String value) {
            addCriterion("ROOMTYPEID <", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidLessThanOrEqualTo(String value) {
            addCriterion("ROOMTYPEID <=", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidLike(String value) {
            addCriterion("ROOMTYPEID like", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidNotLike(String value) {
            addCriterion("ROOMTYPEID not like", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidIn(List<String> values) {
            addCriterion("ROOMTYPEID in", values, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidNotIn(List<String> values) {
            addCriterion("ROOMTYPEID not in", values, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidBetween(String value1, String value2) {
            addCriterion("ROOMTYPEID between", value1, value2, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidNotBetween(String value1, String value2) {
            addCriterion("ROOMTYPEID not between", value1, value2, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomimageidIsNull() {
            addCriterion("ROOMIMAGEID is null");
            return (Criteria) this;
        }

        public Criteria andRoomimageidIsNotNull() {
            addCriterion("ROOMIMAGEID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomimageidEqualTo(String value) {
            addCriterion("ROOMIMAGEID =", value, "roomimageid");
            return (Criteria) this;
        }

        public Criteria andRoomimageidNotEqualTo(String value) {
            addCriterion("ROOMIMAGEID <>", value, "roomimageid");
            return (Criteria) this;
        }

        public Criteria andRoomimageidGreaterThan(String value) {
            addCriterion("ROOMIMAGEID >", value, "roomimageid");
            return (Criteria) this;
        }

        public Criteria andRoomimageidGreaterThanOrEqualTo(String value) {
            addCriterion("ROOMIMAGEID >=", value, "roomimageid");
            return (Criteria) this;
        }

        public Criteria andRoomimageidLessThan(String value) {
            addCriterion("ROOMIMAGEID <", value, "roomimageid");
            return (Criteria) this;
        }

        public Criteria andRoomimageidLessThanOrEqualTo(String value) {
            addCriterion("ROOMIMAGEID <=", value, "roomimageid");
            return (Criteria) this;
        }

        public Criteria andRoomimageidLike(String value) {
            addCriterion("ROOMIMAGEID like", value, "roomimageid");
            return (Criteria) this;
        }

        public Criteria andRoomimageidNotLike(String value) {
            addCriterion("ROOMIMAGEID not like", value, "roomimageid");
            return (Criteria) this;
        }

        public Criteria andRoomimageidIn(List<String> values) {
            addCriterion("ROOMIMAGEID in", values, "roomimageid");
            return (Criteria) this;
        }

        public Criteria andRoomimageidNotIn(List<String> values) {
            addCriterion("ROOMIMAGEID not in", values, "roomimageid");
            return (Criteria) this;
        }

        public Criteria andRoomimageidBetween(String value1, String value2) {
            addCriterion("ROOMIMAGEID between", value1, value2, "roomimageid");
            return (Criteria) this;
        }

        public Criteria andRoomimageidNotBetween(String value1, String value2) {
            addCriterion("ROOMIMAGEID not between", value1, value2, "roomimageid");
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