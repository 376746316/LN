package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TExamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TExamExample() {
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

        public Criteria andEIdIsNull() {
            addCriterion("E_ID is null");
            return (Criteria) this;
        }

        public Criteria andEIdIsNotNull() {
            addCriterion("E_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEIdEqualTo(Long value) {
            addCriterion("E_ID =", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotEqualTo(Long value) {
            addCriterion("E_ID <>", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThan(Long value) {
            addCriterion("E_ID >", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThanOrEqualTo(Long value) {
            addCriterion("E_ID >=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThan(Long value) {
            addCriterion("E_ID <", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThanOrEqualTo(Long value) {
            addCriterion("E_ID <=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdIn(List<Long> values) {
            addCriterion("E_ID in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotIn(List<Long> values) {
            addCriterion("E_ID not in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdBetween(Long value1, Long value2) {
            addCriterion("E_ID between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotBetween(Long value1, Long value2) {
            addCriterion("E_ID not between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andEpIdIsNull() {
            addCriterion("EP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEpIdIsNotNull() {
            addCriterion("EP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEpIdEqualTo(Long value) {
            addCriterion("EP_ID =", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotEqualTo(Long value) {
            addCriterion("EP_ID <>", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdGreaterThan(Long value) {
            addCriterion("EP_ID >", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EP_ID >=", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdLessThan(Long value) {
            addCriterion("EP_ID <", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdLessThanOrEqualTo(Long value) {
            addCriterion("EP_ID <=", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdIn(List<Long> values) {
            addCriterion("EP_ID in", values, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotIn(List<Long> values) {
            addCriterion("EP_ID not in", values, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdBetween(Long value1, Long value2) {
            addCriterion("EP_ID between", value1, value2, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotBetween(Long value1, Long value2) {
            addCriterion("EP_ID not between", value1, value2, "epId");
            return (Criteria) this;
        }

        public Criteria andENameIsNull() {
            addCriterion("E_NAME is null");
            return (Criteria) this;
        }

        public Criteria andENameIsNotNull() {
            addCriterion("E_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andENameEqualTo(String value) {
            addCriterion("E_NAME =", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotEqualTo(String value) {
            addCriterion("E_NAME <>", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThan(String value) {
            addCriterion("E_NAME >", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThanOrEqualTo(String value) {
            addCriterion("E_NAME >=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThan(String value) {
            addCriterion("E_NAME <", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThanOrEqualTo(String value) {
            addCriterion("E_NAME <=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLike(String value) {
            addCriterion("E_NAME like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotLike(String value) {
            addCriterion("E_NAME not like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameIn(List<String> values) {
            addCriterion("E_NAME in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotIn(List<String> values) {
            addCriterion("E_NAME not in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameBetween(String value1, String value2) {
            addCriterion("E_NAME between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotBetween(String value1, String value2) {
            addCriterion("E_NAME not between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andEStatusIsNull() {
            addCriterion("E_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEStatusIsNotNull() {
            addCriterion("E_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEStatusEqualTo(Long value) {
            addCriterion("E_STATUS =", value, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusNotEqualTo(Long value) {
            addCriterion("E_STATUS <>", value, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusGreaterThan(Long value) {
            addCriterion("E_STATUS >", value, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("E_STATUS >=", value, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusLessThan(Long value) {
            addCriterion("E_STATUS <", value, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusLessThanOrEqualTo(Long value) {
            addCriterion("E_STATUS <=", value, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusIn(List<Long> values) {
            addCriterion("E_STATUS in", values, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusNotIn(List<Long> values) {
            addCriterion("E_STATUS not in", values, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusBetween(Long value1, Long value2) {
            addCriterion("E_STATUS between", value1, value2, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusNotBetween(Long value1, Long value2) {
            addCriterion("E_STATUS not between", value1, value2, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStartdateIsNull() {
            addCriterion("E_STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andEStartdateIsNotNull() {
            addCriterion("E_STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEStartdateEqualTo(Date value) {
            addCriterion("E_STARTDATE =", value, "eStartdate");
            return (Criteria) this;
        }

        public Criteria andEStartdateNotEqualTo(Date value) {
            addCriterion("E_STARTDATE <>", value, "eStartdate");
            return (Criteria) this;
        }

        public Criteria andEStartdateGreaterThan(Date value) {
            addCriterion("E_STARTDATE >", value, "eStartdate");
            return (Criteria) this;
        }

        public Criteria andEStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("E_STARTDATE >=", value, "eStartdate");
            return (Criteria) this;
        }

        public Criteria andEStartdateLessThan(Date value) {
            addCriterion("E_STARTDATE <", value, "eStartdate");
            return (Criteria) this;
        }

        public Criteria andEStartdateLessThanOrEqualTo(Date value) {
            addCriterion("E_STARTDATE <=", value, "eStartdate");
            return (Criteria) this;
        }

        public Criteria andEStartdateIn(List<Date> values) {
            addCriterion("E_STARTDATE in", values, "eStartdate");
            return (Criteria) this;
        }

        public Criteria andEStartdateNotIn(List<Date> values) {
            addCriterion("E_STARTDATE not in", values, "eStartdate");
            return (Criteria) this;
        }

        public Criteria andEStartdateBetween(Date value1, Date value2) {
            addCriterion("E_STARTDATE between", value1, value2, "eStartdate");
            return (Criteria) this;
        }

        public Criteria andEStartdateNotBetween(Date value1, Date value2) {
            addCriterion("E_STARTDATE not between", value1, value2, "eStartdate");
            return (Criteria) this;
        }

        public Criteria andEEnddateIsNull() {
            addCriterion("E_ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEEnddateIsNotNull() {
            addCriterion("E_ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEEnddateEqualTo(Date value) {
            addCriterion("E_ENDDATE =", value, "eEnddate");
            return (Criteria) this;
        }

        public Criteria andEEnddateNotEqualTo(Date value) {
            addCriterion("E_ENDDATE <>", value, "eEnddate");
            return (Criteria) this;
        }

        public Criteria andEEnddateGreaterThan(Date value) {
            addCriterion("E_ENDDATE >", value, "eEnddate");
            return (Criteria) this;
        }

        public Criteria andEEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("E_ENDDATE >=", value, "eEnddate");
            return (Criteria) this;
        }

        public Criteria andEEnddateLessThan(Date value) {
            addCriterion("E_ENDDATE <", value, "eEnddate");
            return (Criteria) this;
        }

        public Criteria andEEnddateLessThanOrEqualTo(Date value) {
            addCriterion("E_ENDDATE <=", value, "eEnddate");
            return (Criteria) this;
        }

        public Criteria andEEnddateIn(List<Date> values) {
            addCriterion("E_ENDDATE in", values, "eEnddate");
            return (Criteria) this;
        }

        public Criteria andEEnddateNotIn(List<Date> values) {
            addCriterion("E_ENDDATE not in", values, "eEnddate");
            return (Criteria) this;
        }

        public Criteria andEEnddateBetween(Date value1, Date value2) {
            addCriterion("E_ENDDATE between", value1, value2, "eEnddate");
            return (Criteria) this;
        }

        public Criteria andEEnddateNotBetween(Date value1, Date value2) {
            addCriterion("E_ENDDATE not between", value1, value2, "eEnddate");
            return (Criteria) this;
        }

        public Criteria andEStarttimeIsNull() {
            addCriterion("E_STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andEStarttimeIsNotNull() {
            addCriterion("E_STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEStarttimeEqualTo(String value) {
            addCriterion("E_STARTTIME =", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeNotEqualTo(String value) {
            addCriterion("E_STARTTIME <>", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeGreaterThan(String value) {
            addCriterion("E_STARTTIME >", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("E_STARTTIME >=", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeLessThan(String value) {
            addCriterion("E_STARTTIME <", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeLessThanOrEqualTo(String value) {
            addCriterion("E_STARTTIME <=", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeLike(String value) {
            addCriterion("E_STARTTIME like", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeNotLike(String value) {
            addCriterion("E_STARTTIME not like", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeIn(List<String> values) {
            addCriterion("E_STARTTIME in", values, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeNotIn(List<String> values) {
            addCriterion("E_STARTTIME not in", values, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeBetween(String value1, String value2) {
            addCriterion("E_STARTTIME between", value1, value2, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeNotBetween(String value1, String value2) {
            addCriterion("E_STARTTIME not between", value1, value2, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeIsNull() {
            addCriterion("E_ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEEndtimeIsNotNull() {
            addCriterion("E_ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEEndtimeEqualTo(String value) {
            addCriterion("E_ENDTIME =", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeNotEqualTo(String value) {
            addCriterion("E_ENDTIME <>", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeGreaterThan(String value) {
            addCriterion("E_ENDTIME >", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("E_ENDTIME >=", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeLessThan(String value) {
            addCriterion("E_ENDTIME <", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeLessThanOrEqualTo(String value) {
            addCriterion("E_ENDTIME <=", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeLike(String value) {
            addCriterion("E_ENDTIME like", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeNotLike(String value) {
            addCriterion("E_ENDTIME not like", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeIn(List<String> values) {
            addCriterion("E_ENDTIME in", values, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeNotIn(List<String> values) {
            addCriterion("E_ENDTIME not in", values, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeBetween(String value1, String value2) {
            addCriterion("E_ENDTIME between", value1, value2, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeNotBetween(String value1, String value2) {
            addCriterion("E_ENDTIME not between", value1, value2, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEDurationIsNull() {
            addCriterion("E_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andEDurationIsNotNull() {
            addCriterion("E_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andEDurationEqualTo(Long value) {
            addCriterion("E_DURATION =", value, "eDuration");
            return (Criteria) this;
        }

        public Criteria andEDurationNotEqualTo(Long value) {
            addCriterion("E_DURATION <>", value, "eDuration");
            return (Criteria) this;
        }

        public Criteria andEDurationGreaterThan(Long value) {
            addCriterion("E_DURATION >", value, "eDuration");
            return (Criteria) this;
        }

        public Criteria andEDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("E_DURATION >=", value, "eDuration");
            return (Criteria) this;
        }

        public Criteria andEDurationLessThan(Long value) {
            addCriterion("E_DURATION <", value, "eDuration");
            return (Criteria) this;
        }

        public Criteria andEDurationLessThanOrEqualTo(Long value) {
            addCriterion("E_DURATION <=", value, "eDuration");
            return (Criteria) this;
        }

        public Criteria andEDurationIn(List<Long> values) {
            addCriterion("E_DURATION in", values, "eDuration");
            return (Criteria) this;
        }

        public Criteria andEDurationNotIn(List<Long> values) {
            addCriterion("E_DURATION not in", values, "eDuration");
            return (Criteria) this;
        }

        public Criteria andEDurationBetween(Long value1, Long value2) {
            addCriterion("E_DURATION between", value1, value2, "eDuration");
            return (Criteria) this;
        }

        public Criteria andEDurationNotBetween(Long value1, Long value2) {
            addCriterion("E_DURATION not between", value1, value2, "eDuration");
            return (Criteria) this;
        }

        public Criteria andEAllowtimesIsNull() {
            addCriterion("E_ALLOWTIMES is null");
            return (Criteria) this;
        }

        public Criteria andEAllowtimesIsNotNull() {
            addCriterion("E_ALLOWTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andEAllowtimesEqualTo(Long value) {
            addCriterion("E_ALLOWTIMES =", value, "eAllowtimes");
            return (Criteria) this;
        }

        public Criteria andEAllowtimesNotEqualTo(Long value) {
            addCriterion("E_ALLOWTIMES <>", value, "eAllowtimes");
            return (Criteria) this;
        }

        public Criteria andEAllowtimesGreaterThan(Long value) {
            addCriterion("E_ALLOWTIMES >", value, "eAllowtimes");
            return (Criteria) this;
        }

        public Criteria andEAllowtimesGreaterThanOrEqualTo(Long value) {
            addCriterion("E_ALLOWTIMES >=", value, "eAllowtimes");
            return (Criteria) this;
        }

        public Criteria andEAllowtimesLessThan(Long value) {
            addCriterion("E_ALLOWTIMES <", value, "eAllowtimes");
            return (Criteria) this;
        }

        public Criteria andEAllowtimesLessThanOrEqualTo(Long value) {
            addCriterion("E_ALLOWTIMES <=", value, "eAllowtimes");
            return (Criteria) this;
        }

        public Criteria andEAllowtimesIn(List<Long> values) {
            addCriterion("E_ALLOWTIMES in", values, "eAllowtimes");
            return (Criteria) this;
        }

        public Criteria andEAllowtimesNotIn(List<Long> values) {
            addCriterion("E_ALLOWTIMES not in", values, "eAllowtimes");
            return (Criteria) this;
        }

        public Criteria andEAllowtimesBetween(Long value1, Long value2) {
            addCriterion("E_ALLOWTIMES between", value1, value2, "eAllowtimes");
            return (Criteria) this;
        }

        public Criteria andEAllowtimesNotBetween(Long value1, Long value2) {
            addCriterion("E_ALLOWTIMES not between", value1, value2, "eAllowtimes");
            return (Criteria) this;
        }

        public Criteria andEModeIsNull() {
            addCriterion("E_MODE is null");
            return (Criteria) this;
        }

        public Criteria andEModeIsNotNull() {
            addCriterion("E_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andEModeEqualTo(String value) {
            addCriterion("E_MODE =", value, "eMode");
            return (Criteria) this;
        }

        public Criteria andEModeNotEqualTo(String value) {
            addCriterion("E_MODE <>", value, "eMode");
            return (Criteria) this;
        }

        public Criteria andEModeGreaterThan(String value) {
            addCriterion("E_MODE >", value, "eMode");
            return (Criteria) this;
        }

        public Criteria andEModeGreaterThanOrEqualTo(String value) {
            addCriterion("E_MODE >=", value, "eMode");
            return (Criteria) this;
        }

        public Criteria andEModeLessThan(String value) {
            addCriterion("E_MODE <", value, "eMode");
            return (Criteria) this;
        }

        public Criteria andEModeLessThanOrEqualTo(String value) {
            addCriterion("E_MODE <=", value, "eMode");
            return (Criteria) this;
        }

        public Criteria andEModeLike(String value) {
            addCriterion("E_MODE like", value, "eMode");
            return (Criteria) this;
        }

        public Criteria andEModeNotLike(String value) {
            addCriterion("E_MODE not like", value, "eMode");
            return (Criteria) this;
        }

        public Criteria andEModeIn(List<String> values) {
            addCriterion("E_MODE in", values, "eMode");
            return (Criteria) this;
        }

        public Criteria andEModeNotIn(List<String> values) {
            addCriterion("E_MODE not in", values, "eMode");
            return (Criteria) this;
        }

        public Criteria andEModeBetween(String value1, String value2) {
            addCriterion("E_MODE between", value1, value2, "eMode");
            return (Criteria) this;
        }

        public Criteria andEModeNotBetween(String value1, String value2) {
            addCriterion("E_MODE not between", value1, value2, "eMode");
            return (Criteria) this;
        }

        public Criteria andEAnsmodeIsNull() {
            addCriterion("E_ANSMODE is null");
            return (Criteria) this;
        }

        public Criteria andEAnsmodeIsNotNull() {
            addCriterion("E_ANSMODE is not null");
            return (Criteria) this;
        }

        public Criteria andEAnsmodeEqualTo(String value) {
            addCriterion("E_ANSMODE =", value, "eAnsmode");
            return (Criteria) this;
        }

        public Criteria andEAnsmodeNotEqualTo(String value) {
            addCriterion("E_ANSMODE <>", value, "eAnsmode");
            return (Criteria) this;
        }

        public Criteria andEAnsmodeGreaterThan(String value) {
            addCriterion("E_ANSMODE >", value, "eAnsmode");
            return (Criteria) this;
        }

        public Criteria andEAnsmodeGreaterThanOrEqualTo(String value) {
            addCriterion("E_ANSMODE >=", value, "eAnsmode");
            return (Criteria) this;
        }

        public Criteria andEAnsmodeLessThan(String value) {
            addCriterion("E_ANSMODE <", value, "eAnsmode");
            return (Criteria) this;
        }

        public Criteria andEAnsmodeLessThanOrEqualTo(String value) {
            addCriterion("E_ANSMODE <=", value, "eAnsmode");
            return (Criteria) this;
        }

        public Criteria andEAnsmodeLike(String value) {
            addCriterion("E_ANSMODE like", value, "eAnsmode");
            return (Criteria) this;
        }

        public Criteria andEAnsmodeNotLike(String value) {
            addCriterion("E_ANSMODE not like", value, "eAnsmode");
            return (Criteria) this;
        }

        public Criteria andEAnsmodeIn(List<String> values) {
            addCriterion("E_ANSMODE in", values, "eAnsmode");
            return (Criteria) this;
        }

        public Criteria andEAnsmodeNotIn(List<String> values) {
            addCriterion("E_ANSMODE not in", values, "eAnsmode");
            return (Criteria) this;
        }

        public Criteria andEAnsmodeBetween(String value1, String value2) {
            addCriterion("E_ANSMODE between", value1, value2, "eAnsmode");
            return (Criteria) this;
        }

        public Criteria andEAnsmodeNotBetween(String value1, String value2) {
            addCriterion("E_ANSMODE not between", value1, value2, "eAnsmode");
            return (Criteria) this;
        }

        public Criteria andESingletimeIsNull() {
            addCriterion("E_SINGLETIME is null");
            return (Criteria) this;
        }

        public Criteria andESingletimeIsNotNull() {
            addCriterion("E_SINGLETIME is not null");
            return (Criteria) this;
        }

        public Criteria andESingletimeEqualTo(Long value) {
            addCriterion("E_SINGLETIME =", value, "eSingletime");
            return (Criteria) this;
        }

        public Criteria andESingletimeNotEqualTo(Long value) {
            addCriterion("E_SINGLETIME <>", value, "eSingletime");
            return (Criteria) this;
        }

        public Criteria andESingletimeGreaterThan(Long value) {
            addCriterion("E_SINGLETIME >", value, "eSingletime");
            return (Criteria) this;
        }

        public Criteria andESingletimeGreaterThanOrEqualTo(Long value) {
            addCriterion("E_SINGLETIME >=", value, "eSingletime");
            return (Criteria) this;
        }

        public Criteria andESingletimeLessThan(Long value) {
            addCriterion("E_SINGLETIME <", value, "eSingletime");
            return (Criteria) this;
        }

        public Criteria andESingletimeLessThanOrEqualTo(Long value) {
            addCriterion("E_SINGLETIME <=", value, "eSingletime");
            return (Criteria) this;
        }

        public Criteria andESingletimeIn(List<Long> values) {
            addCriterion("E_SINGLETIME in", values, "eSingletime");
            return (Criteria) this;
        }

        public Criteria andESingletimeNotIn(List<Long> values) {
            addCriterion("E_SINGLETIME not in", values, "eSingletime");
            return (Criteria) this;
        }

        public Criteria andESingletimeBetween(Long value1, Long value2) {
            addCriterion("E_SINGLETIME between", value1, value2, "eSingletime");
            return (Criteria) this;
        }

        public Criteria andESingletimeNotBetween(Long value1, Long value2) {
            addCriterion("E_SINGLETIME not between", value1, value2, "eSingletime");
            return (Criteria) this;
        }

        public Criteria andEConfusionquesIsNull() {
            addCriterion("E_CONFUSIONQUES is null");
            return (Criteria) this;
        }

        public Criteria andEConfusionquesIsNotNull() {
            addCriterion("E_CONFUSIONQUES is not null");
            return (Criteria) this;
        }

        public Criteria andEConfusionquesEqualTo(Long value) {
            addCriterion("E_CONFUSIONQUES =", value, "eConfusionques");
            return (Criteria) this;
        }

        public Criteria andEConfusionquesNotEqualTo(Long value) {
            addCriterion("E_CONFUSIONQUES <>", value, "eConfusionques");
            return (Criteria) this;
        }

        public Criteria andEConfusionquesGreaterThan(Long value) {
            addCriterion("E_CONFUSIONQUES >", value, "eConfusionques");
            return (Criteria) this;
        }

        public Criteria andEConfusionquesGreaterThanOrEqualTo(Long value) {
            addCriterion("E_CONFUSIONQUES >=", value, "eConfusionques");
            return (Criteria) this;
        }

        public Criteria andEConfusionquesLessThan(Long value) {
            addCriterion("E_CONFUSIONQUES <", value, "eConfusionques");
            return (Criteria) this;
        }

        public Criteria andEConfusionquesLessThanOrEqualTo(Long value) {
            addCriterion("E_CONFUSIONQUES <=", value, "eConfusionques");
            return (Criteria) this;
        }

        public Criteria andEConfusionquesIn(List<Long> values) {
            addCriterion("E_CONFUSIONQUES in", values, "eConfusionques");
            return (Criteria) this;
        }

        public Criteria andEConfusionquesNotIn(List<Long> values) {
            addCriterion("E_CONFUSIONQUES not in", values, "eConfusionques");
            return (Criteria) this;
        }

        public Criteria andEConfusionquesBetween(Long value1, Long value2) {
            addCriterion("E_CONFUSIONQUES between", value1, value2, "eConfusionques");
            return (Criteria) this;
        }

        public Criteria andEConfusionquesNotBetween(Long value1, Long value2) {
            addCriterion("E_CONFUSIONQUES not between", value1, value2, "eConfusionques");
            return (Criteria) this;
        }

        public Criteria andEConfusionansIsNull() {
            addCriterion("E_CONFUSIONANS is null");
            return (Criteria) this;
        }

        public Criteria andEConfusionansIsNotNull() {
            addCriterion("E_CONFUSIONANS is not null");
            return (Criteria) this;
        }

        public Criteria andEConfusionansEqualTo(Long value) {
            addCriterion("E_CONFUSIONANS =", value, "eConfusionans");
            return (Criteria) this;
        }

        public Criteria andEConfusionansNotEqualTo(Long value) {
            addCriterion("E_CONFUSIONANS <>", value, "eConfusionans");
            return (Criteria) this;
        }

        public Criteria andEConfusionansGreaterThan(Long value) {
            addCriterion("E_CONFUSIONANS >", value, "eConfusionans");
            return (Criteria) this;
        }

        public Criteria andEConfusionansGreaterThanOrEqualTo(Long value) {
            addCriterion("E_CONFUSIONANS >=", value, "eConfusionans");
            return (Criteria) this;
        }

        public Criteria andEConfusionansLessThan(Long value) {
            addCriterion("E_CONFUSIONANS <", value, "eConfusionans");
            return (Criteria) this;
        }

        public Criteria andEConfusionansLessThanOrEqualTo(Long value) {
            addCriterion("E_CONFUSIONANS <=", value, "eConfusionans");
            return (Criteria) this;
        }

        public Criteria andEConfusionansIn(List<Long> values) {
            addCriterion("E_CONFUSIONANS in", values, "eConfusionans");
            return (Criteria) this;
        }

        public Criteria andEConfusionansNotIn(List<Long> values) {
            addCriterion("E_CONFUSIONANS not in", values, "eConfusionans");
            return (Criteria) this;
        }

        public Criteria andEConfusionansBetween(Long value1, Long value2) {
            addCriterion("E_CONFUSIONANS between", value1, value2, "eConfusionans");
            return (Criteria) this;
        }

        public Criteria andEConfusionansNotBetween(Long value1, Long value2) {
            addCriterion("E_CONFUSIONANS not between", value1, value2, "eConfusionans");
            return (Criteria) this;
        }

        public Criteria andEViewanstimeIsNull() {
            addCriterion("E_VIEWANSTIME is null");
            return (Criteria) this;
        }

        public Criteria andEViewanstimeIsNotNull() {
            addCriterion("E_VIEWANSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEViewanstimeEqualTo(Long value) {
            addCriterion("E_VIEWANSTIME =", value, "eViewanstime");
            return (Criteria) this;
        }

        public Criteria andEViewanstimeNotEqualTo(Long value) {
            addCriterion("E_VIEWANSTIME <>", value, "eViewanstime");
            return (Criteria) this;
        }

        public Criteria andEViewanstimeGreaterThan(Long value) {
            addCriterion("E_VIEWANSTIME >", value, "eViewanstime");
            return (Criteria) this;
        }

        public Criteria andEViewanstimeGreaterThanOrEqualTo(Long value) {
            addCriterion("E_VIEWANSTIME >=", value, "eViewanstime");
            return (Criteria) this;
        }

        public Criteria andEViewanstimeLessThan(Long value) {
            addCriterion("E_VIEWANSTIME <", value, "eViewanstime");
            return (Criteria) this;
        }

        public Criteria andEViewanstimeLessThanOrEqualTo(Long value) {
            addCriterion("E_VIEWANSTIME <=", value, "eViewanstime");
            return (Criteria) this;
        }

        public Criteria andEViewanstimeIn(List<Long> values) {
            addCriterion("E_VIEWANSTIME in", values, "eViewanstime");
            return (Criteria) this;
        }

        public Criteria andEViewanstimeNotIn(List<Long> values) {
            addCriterion("E_VIEWANSTIME not in", values, "eViewanstime");
            return (Criteria) this;
        }

        public Criteria andEViewanstimeBetween(Long value1, Long value2) {
            addCriterion("E_VIEWANSTIME between", value1, value2, "eViewanstime");
            return (Criteria) this;
        }

        public Criteria andEViewanstimeNotBetween(Long value1, Long value2) {
            addCriterion("E_VIEWANSTIME not between", value1, value2, "eViewanstime");
            return (Criteria) this;
        }

        public Criteria andENumpeopleIsNull() {
            addCriterion("E_NUMPEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andENumpeopleIsNotNull() {
            addCriterion("E_NUMPEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andENumpeopleEqualTo(Long value) {
            addCriterion("E_NUMPEOPLE =", value, "eNumpeople");
            return (Criteria) this;
        }

        public Criteria andENumpeopleNotEqualTo(Long value) {
            addCriterion("E_NUMPEOPLE <>", value, "eNumpeople");
            return (Criteria) this;
        }

        public Criteria andENumpeopleGreaterThan(Long value) {
            addCriterion("E_NUMPEOPLE >", value, "eNumpeople");
            return (Criteria) this;
        }

        public Criteria andENumpeopleGreaterThanOrEqualTo(Long value) {
            addCriterion("E_NUMPEOPLE >=", value, "eNumpeople");
            return (Criteria) this;
        }

        public Criteria andENumpeopleLessThan(Long value) {
            addCriterion("E_NUMPEOPLE <", value, "eNumpeople");
            return (Criteria) this;
        }

        public Criteria andENumpeopleLessThanOrEqualTo(Long value) {
            addCriterion("E_NUMPEOPLE <=", value, "eNumpeople");
            return (Criteria) this;
        }

        public Criteria andENumpeopleIn(List<Long> values) {
            addCriterion("E_NUMPEOPLE in", values, "eNumpeople");
            return (Criteria) this;
        }

        public Criteria andENumpeopleNotIn(List<Long> values) {
            addCriterion("E_NUMPEOPLE not in", values, "eNumpeople");
            return (Criteria) this;
        }

        public Criteria andENumpeopleBetween(Long value1, Long value2) {
            addCriterion("E_NUMPEOPLE between", value1, value2, "eNumpeople");
            return (Criteria) this;
        }

        public Criteria andENumpeopleNotBetween(Long value1, Long value2) {
            addCriterion("E_NUMPEOPLE not between", value1, value2, "eNumpeople");
            return (Criteria) this;
        }

        public Criteria andESceneIsNull() {
            addCriterion("E_SCENE is null");
            return (Criteria) this;
        }

        public Criteria andESceneIsNotNull() {
            addCriterion("E_SCENE is not null");
            return (Criteria) this;
        }

        public Criteria andESceneEqualTo(Long value) {
            addCriterion("E_SCENE =", value, "eScene");
            return (Criteria) this;
        }

        public Criteria andESceneNotEqualTo(Long value) {
            addCriterion("E_SCENE <>", value, "eScene");
            return (Criteria) this;
        }

        public Criteria andESceneGreaterThan(Long value) {
            addCriterion("E_SCENE >", value, "eScene");
            return (Criteria) this;
        }

        public Criteria andESceneGreaterThanOrEqualTo(Long value) {
            addCriterion("E_SCENE >=", value, "eScene");
            return (Criteria) this;
        }

        public Criteria andESceneLessThan(Long value) {
            addCriterion("E_SCENE <", value, "eScene");
            return (Criteria) this;
        }

        public Criteria andESceneLessThanOrEqualTo(Long value) {
            addCriterion("E_SCENE <=", value, "eScene");
            return (Criteria) this;
        }

        public Criteria andESceneIn(List<Long> values) {
            addCriterion("E_SCENE in", values, "eScene");
            return (Criteria) this;
        }

        public Criteria andESceneNotIn(List<Long> values) {
            addCriterion("E_SCENE not in", values, "eScene");
            return (Criteria) this;
        }

        public Criteria andESceneBetween(Long value1, Long value2) {
            addCriterion("E_SCENE between", value1, value2, "eScene");
            return (Criteria) this;
        }

        public Criteria andESceneNotBetween(Long value1, Long value2) {
            addCriterion("E_SCENE not between", value1, value2, "eScene");
            return (Criteria) this;
        }

        public Criteria andEScenescaleIsNull() {
            addCriterion("E_SCENESCALE is null");
            return (Criteria) this;
        }

        public Criteria andEScenescaleIsNotNull() {
            addCriterion("E_SCENESCALE is not null");
            return (Criteria) this;
        }

        public Criteria andEScenescaleEqualTo(String value) {
            addCriterion("E_SCENESCALE =", value, "eScenescale");
            return (Criteria) this;
        }

        public Criteria andEScenescaleNotEqualTo(String value) {
            addCriterion("E_SCENESCALE <>", value, "eScenescale");
            return (Criteria) this;
        }

        public Criteria andEScenescaleGreaterThan(String value) {
            addCriterion("E_SCENESCALE >", value, "eScenescale");
            return (Criteria) this;
        }

        public Criteria andEScenescaleGreaterThanOrEqualTo(String value) {
            addCriterion("E_SCENESCALE >=", value, "eScenescale");
            return (Criteria) this;
        }

        public Criteria andEScenescaleLessThan(String value) {
            addCriterion("E_SCENESCALE <", value, "eScenescale");
            return (Criteria) this;
        }

        public Criteria andEScenescaleLessThanOrEqualTo(String value) {
            addCriterion("E_SCENESCALE <=", value, "eScenescale");
            return (Criteria) this;
        }

        public Criteria andEScenescaleLike(String value) {
            addCriterion("E_SCENESCALE like", value, "eScenescale");
            return (Criteria) this;
        }

        public Criteria andEScenescaleNotLike(String value) {
            addCriterion("E_SCENESCALE not like", value, "eScenescale");
            return (Criteria) this;
        }

        public Criteria andEScenescaleIn(List<String> values) {
            addCriterion("E_SCENESCALE in", values, "eScenescale");
            return (Criteria) this;
        }

        public Criteria andEScenescaleNotIn(List<String> values) {
            addCriterion("E_SCENESCALE not in", values, "eScenescale");
            return (Criteria) this;
        }

        public Criteria andEScenescaleBetween(String value1, String value2) {
            addCriterion("E_SCENESCALE between", value1, value2, "eScenescale");
            return (Criteria) this;
        }

        public Criteria andEScenescaleNotBetween(String value1, String value2) {
            addCriterion("E_SCENESCALE not between", value1, value2, "eScenescale");
            return (Criteria) this;
        }

        public Criteria andEInstimeIsNull() {
            addCriterion("E_INSTIME is null");
            return (Criteria) this;
        }

        public Criteria andEInstimeIsNotNull() {
            addCriterion("E_INSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEInstimeEqualTo(Date value) {
            addCriterion("E_INSTIME =", value, "eInstime");
            return (Criteria) this;
        }

        public Criteria andEInstimeNotEqualTo(Date value) {
            addCriterion("E_INSTIME <>", value, "eInstime");
            return (Criteria) this;
        }

        public Criteria andEInstimeGreaterThan(Date value) {
            addCriterion("E_INSTIME >", value, "eInstime");
            return (Criteria) this;
        }

        public Criteria andEInstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("E_INSTIME >=", value, "eInstime");
            return (Criteria) this;
        }

        public Criteria andEInstimeLessThan(Date value) {
            addCriterion("E_INSTIME <", value, "eInstime");
            return (Criteria) this;
        }

        public Criteria andEInstimeLessThanOrEqualTo(Date value) {
            addCriterion("E_INSTIME <=", value, "eInstime");
            return (Criteria) this;
        }

        public Criteria andEInstimeIn(List<Date> values) {
            addCriterion("E_INSTIME in", values, "eInstime");
            return (Criteria) this;
        }

        public Criteria andEInstimeNotIn(List<Date> values) {
            addCriterion("E_INSTIME not in", values, "eInstime");
            return (Criteria) this;
        }

        public Criteria andEInstimeBetween(Date value1, Date value2) {
            addCriterion("E_INSTIME between", value1, value2, "eInstime");
            return (Criteria) this;
        }

        public Criteria andEInstimeNotBetween(Date value1, Date value2) {
            addCriterion("E_INSTIME not between", value1, value2, "eInstime");
            return (Criteria) this;
        }

        public Criteria andESelftestIsNull() {
            addCriterion("E_SELFTEST is null");
            return (Criteria) this;
        }

        public Criteria andESelftestIsNotNull() {
            addCriterion("E_SELFTEST is not null");
            return (Criteria) this;
        }

        public Criteria andESelftestEqualTo(Long value) {
            addCriterion("E_SELFTEST =", value, "eSelftest");
            return (Criteria) this;
        }

        public Criteria andESelftestNotEqualTo(Long value) {
            addCriterion("E_SELFTEST <>", value, "eSelftest");
            return (Criteria) this;
        }

        public Criteria andESelftestGreaterThan(Long value) {
            addCriterion("E_SELFTEST >", value, "eSelftest");
            return (Criteria) this;
        }

        public Criteria andESelftestGreaterThanOrEqualTo(Long value) {
            addCriterion("E_SELFTEST >=", value, "eSelftest");
            return (Criteria) this;
        }

        public Criteria andESelftestLessThan(Long value) {
            addCriterion("E_SELFTEST <", value, "eSelftest");
            return (Criteria) this;
        }

        public Criteria andESelftestLessThanOrEqualTo(Long value) {
            addCriterion("E_SELFTEST <=", value, "eSelftest");
            return (Criteria) this;
        }

        public Criteria andESelftestIn(List<Long> values) {
            addCriterion("E_SELFTEST in", values, "eSelftest");
            return (Criteria) this;
        }

        public Criteria andESelftestNotIn(List<Long> values) {
            addCriterion("E_SELFTEST not in", values, "eSelftest");
            return (Criteria) this;
        }

        public Criteria andESelftestBetween(Long value1, Long value2) {
            addCriterion("E_SELFTEST between", value1, value2, "eSelftest");
            return (Criteria) this;
        }

        public Criteria andESelftestNotBetween(Long value1, Long value2) {
            addCriterion("E_SELFTEST not between", value1, value2, "eSelftest");
            return (Criteria) this;
        }

        public Criteria andECreateEpModelIsNull() {
            addCriterion("E_CREATE_EP_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andECreateEpModelIsNotNull() {
            addCriterion("E_CREATE_EP_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andECreateEpModelEqualTo(Long value) {
            addCriterion("E_CREATE_EP_MODEL =", value, "eCreateEpModel");
            return (Criteria) this;
        }

        public Criteria andECreateEpModelNotEqualTo(Long value) {
            addCriterion("E_CREATE_EP_MODEL <>", value, "eCreateEpModel");
            return (Criteria) this;
        }

        public Criteria andECreateEpModelGreaterThan(Long value) {
            addCriterion("E_CREATE_EP_MODEL >", value, "eCreateEpModel");
            return (Criteria) this;
        }

        public Criteria andECreateEpModelGreaterThanOrEqualTo(Long value) {
            addCriterion("E_CREATE_EP_MODEL >=", value, "eCreateEpModel");
            return (Criteria) this;
        }

        public Criteria andECreateEpModelLessThan(Long value) {
            addCriterion("E_CREATE_EP_MODEL <", value, "eCreateEpModel");
            return (Criteria) this;
        }

        public Criteria andECreateEpModelLessThanOrEqualTo(Long value) {
            addCriterion("E_CREATE_EP_MODEL <=", value, "eCreateEpModel");
            return (Criteria) this;
        }

        public Criteria andECreateEpModelIn(List<Long> values) {
            addCriterion("E_CREATE_EP_MODEL in", values, "eCreateEpModel");
            return (Criteria) this;
        }

        public Criteria andECreateEpModelNotIn(List<Long> values) {
            addCriterion("E_CREATE_EP_MODEL not in", values, "eCreateEpModel");
            return (Criteria) this;
        }

        public Criteria andECreateEpModelBetween(Long value1, Long value2) {
            addCriterion("E_CREATE_EP_MODEL between", value1, value2, "eCreateEpModel");
            return (Criteria) this;
        }

        public Criteria andECreateEpModelNotBetween(Long value1, Long value2) {
            addCriterion("E_CREATE_EP_MODEL not between", value1, value2, "eCreateEpModel");
            return (Criteria) this;
        }

        public Criteria andECreateEpTimeIsNull() {
            addCriterion("E_CREATE_EP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andECreateEpTimeIsNotNull() {
            addCriterion("E_CREATE_EP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andECreateEpTimeEqualTo(Date value) {
            addCriterion("E_CREATE_EP_TIME =", value, "eCreateEpTime");
            return (Criteria) this;
        }

        public Criteria andECreateEpTimeNotEqualTo(Date value) {
            addCriterion("E_CREATE_EP_TIME <>", value, "eCreateEpTime");
            return (Criteria) this;
        }

        public Criteria andECreateEpTimeGreaterThan(Date value) {
            addCriterion("E_CREATE_EP_TIME >", value, "eCreateEpTime");
            return (Criteria) this;
        }

        public Criteria andECreateEpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("E_CREATE_EP_TIME >=", value, "eCreateEpTime");
            return (Criteria) this;
        }

        public Criteria andECreateEpTimeLessThan(Date value) {
            addCriterion("E_CREATE_EP_TIME <", value, "eCreateEpTime");
            return (Criteria) this;
        }

        public Criteria andECreateEpTimeLessThanOrEqualTo(Date value) {
            addCriterion("E_CREATE_EP_TIME <=", value, "eCreateEpTime");
            return (Criteria) this;
        }

        public Criteria andECreateEpTimeIn(List<Date> values) {
            addCriterion("E_CREATE_EP_TIME in", values, "eCreateEpTime");
            return (Criteria) this;
        }

        public Criteria andECreateEpTimeNotIn(List<Date> values) {
            addCriterion("E_CREATE_EP_TIME not in", values, "eCreateEpTime");
            return (Criteria) this;
        }

        public Criteria andECreateEpTimeBetween(Date value1, Date value2) {
            addCriterion("E_CREATE_EP_TIME between", value1, value2, "eCreateEpTime");
            return (Criteria) this;
        }

        public Criteria andECreateEpTimeNotBetween(Date value1, Date value2) {
            addCriterion("E_CREATE_EP_TIME not between", value1, value2, "eCreateEpTime");
            return (Criteria) this;
        }

        public Criteria andEDecideEpModelIsNull() {
            addCriterion("E_DECIDE_EP_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andEDecideEpModelIsNotNull() {
            addCriterion("E_DECIDE_EP_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andEDecideEpModelEqualTo(Long value) {
            addCriterion("E_DECIDE_EP_MODEL =", value, "eDecideEpModel");
            return (Criteria) this;
        }

        public Criteria andEDecideEpModelNotEqualTo(Long value) {
            addCriterion("E_DECIDE_EP_MODEL <>", value, "eDecideEpModel");
            return (Criteria) this;
        }

        public Criteria andEDecideEpModelGreaterThan(Long value) {
            addCriterion("E_DECIDE_EP_MODEL >", value, "eDecideEpModel");
            return (Criteria) this;
        }

        public Criteria andEDecideEpModelGreaterThanOrEqualTo(Long value) {
            addCriterion("E_DECIDE_EP_MODEL >=", value, "eDecideEpModel");
            return (Criteria) this;
        }

        public Criteria andEDecideEpModelLessThan(Long value) {
            addCriterion("E_DECIDE_EP_MODEL <", value, "eDecideEpModel");
            return (Criteria) this;
        }

        public Criteria andEDecideEpModelLessThanOrEqualTo(Long value) {
            addCriterion("E_DECIDE_EP_MODEL <=", value, "eDecideEpModel");
            return (Criteria) this;
        }

        public Criteria andEDecideEpModelIn(List<Long> values) {
            addCriterion("E_DECIDE_EP_MODEL in", values, "eDecideEpModel");
            return (Criteria) this;
        }

        public Criteria andEDecideEpModelNotIn(List<Long> values) {
            addCriterion("E_DECIDE_EP_MODEL not in", values, "eDecideEpModel");
            return (Criteria) this;
        }

        public Criteria andEDecideEpModelBetween(Long value1, Long value2) {
            addCriterion("E_DECIDE_EP_MODEL between", value1, value2, "eDecideEpModel");
            return (Criteria) this;
        }

        public Criteria andEDecideEpModelNotBetween(Long value1, Long value2) {
            addCriterion("E_DECIDE_EP_MODEL not between", value1, value2, "eDecideEpModel");
            return (Criteria) this;
        }

        public Criteria andEDecideEpTimeIsNull() {
            addCriterion("E_DECIDE_EP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEDecideEpTimeIsNotNull() {
            addCriterion("E_DECIDE_EP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEDecideEpTimeEqualTo(Date value) {
            addCriterion("E_DECIDE_EP_TIME =", value, "eDecideEpTime");
            return (Criteria) this;
        }

        public Criteria andEDecideEpTimeNotEqualTo(Date value) {
            addCriterion("E_DECIDE_EP_TIME <>", value, "eDecideEpTime");
            return (Criteria) this;
        }

        public Criteria andEDecideEpTimeGreaterThan(Date value) {
            addCriterion("E_DECIDE_EP_TIME >", value, "eDecideEpTime");
            return (Criteria) this;
        }

        public Criteria andEDecideEpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("E_DECIDE_EP_TIME >=", value, "eDecideEpTime");
            return (Criteria) this;
        }

        public Criteria andEDecideEpTimeLessThan(Date value) {
            addCriterion("E_DECIDE_EP_TIME <", value, "eDecideEpTime");
            return (Criteria) this;
        }

        public Criteria andEDecideEpTimeLessThanOrEqualTo(Date value) {
            addCriterion("E_DECIDE_EP_TIME <=", value, "eDecideEpTime");
            return (Criteria) this;
        }

        public Criteria andEDecideEpTimeIn(List<Date> values) {
            addCriterion("E_DECIDE_EP_TIME in", values, "eDecideEpTime");
            return (Criteria) this;
        }

        public Criteria andEDecideEpTimeNotIn(List<Date> values) {
            addCriterion("E_DECIDE_EP_TIME not in", values, "eDecideEpTime");
            return (Criteria) this;
        }

        public Criteria andEDecideEpTimeBetween(Date value1, Date value2) {
            addCriterion("E_DECIDE_EP_TIME between", value1, value2, "eDecideEpTime");
            return (Criteria) this;
        }

        public Criteria andEDecideEpTimeNotBetween(Date value1, Date value2) {
            addCriterion("E_DECIDE_EP_TIME not between", value1, value2, "eDecideEpTime");
            return (Criteria) this;
        }

        public Criteria andETimesIsNull() {
            addCriterion("E_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andETimesIsNotNull() {
            addCriterion("E_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andETimesEqualTo(Long value) {
            addCriterion("E_TIMES =", value, "eTimes");
            return (Criteria) this;
        }

        public Criteria andETimesNotEqualTo(Long value) {
            addCriterion("E_TIMES <>", value, "eTimes");
            return (Criteria) this;
        }

        public Criteria andETimesGreaterThan(Long value) {
            addCriterion("E_TIMES >", value, "eTimes");
            return (Criteria) this;
        }

        public Criteria andETimesGreaterThanOrEqualTo(Long value) {
            addCriterion("E_TIMES >=", value, "eTimes");
            return (Criteria) this;
        }

        public Criteria andETimesLessThan(Long value) {
            addCriterion("E_TIMES <", value, "eTimes");
            return (Criteria) this;
        }

        public Criteria andETimesLessThanOrEqualTo(Long value) {
            addCriterion("E_TIMES <=", value, "eTimes");
            return (Criteria) this;
        }

        public Criteria andETimesIn(List<Long> values) {
            addCriterion("E_TIMES in", values, "eTimes");
            return (Criteria) this;
        }

        public Criteria andETimesNotIn(List<Long> values) {
            addCriterion("E_TIMES not in", values, "eTimes");
            return (Criteria) this;
        }

        public Criteria andETimesBetween(Long value1, Long value2) {
            addCriterion("E_TIMES between", value1, value2, "eTimes");
            return (Criteria) this;
        }

        public Criteria andETimesNotBetween(Long value1, Long value2) {
            addCriterion("E_TIMES not between", value1, value2, "eTimes");
            return (Criteria) this;
        }

        public Criteria andEGenerateStatusIsNull() {
            addCriterion("E_GENERATE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEGenerateStatusIsNotNull() {
            addCriterion("E_GENERATE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEGenerateStatusEqualTo(Long value) {
            addCriterion("E_GENERATE_STATUS =", value, "eGenerateStatus");
            return (Criteria) this;
        }

        public Criteria andEGenerateStatusNotEqualTo(Long value) {
            addCriterion("E_GENERATE_STATUS <>", value, "eGenerateStatus");
            return (Criteria) this;
        }

        public Criteria andEGenerateStatusGreaterThan(Long value) {
            addCriterion("E_GENERATE_STATUS >", value, "eGenerateStatus");
            return (Criteria) this;
        }

        public Criteria andEGenerateStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("E_GENERATE_STATUS >=", value, "eGenerateStatus");
            return (Criteria) this;
        }

        public Criteria andEGenerateStatusLessThan(Long value) {
            addCriterion("E_GENERATE_STATUS <", value, "eGenerateStatus");
            return (Criteria) this;
        }

        public Criteria andEGenerateStatusLessThanOrEqualTo(Long value) {
            addCriterion("E_GENERATE_STATUS <=", value, "eGenerateStatus");
            return (Criteria) this;
        }

        public Criteria andEGenerateStatusIn(List<Long> values) {
            addCriterion("E_GENERATE_STATUS in", values, "eGenerateStatus");
            return (Criteria) this;
        }

        public Criteria andEGenerateStatusNotIn(List<Long> values) {
            addCriterion("E_GENERATE_STATUS not in", values, "eGenerateStatus");
            return (Criteria) this;
        }

        public Criteria andEGenerateStatusBetween(Long value1, Long value2) {
            addCriterion("E_GENERATE_STATUS between", value1, value2, "eGenerateStatus");
            return (Criteria) this;
        }

        public Criteria andEGenerateStatusNotBetween(Long value1, Long value2) {
            addCriterion("E_GENERATE_STATUS not between", value1, value2, "eGenerateStatus");
            return (Criteria) this;
        }

        public Criteria andEPassscoreIsNull() {
            addCriterion("E_PASSSCORE is null");
            return (Criteria) this;
        }

        public Criteria andEPassscoreIsNotNull() {
            addCriterion("E_PASSSCORE is not null");
            return (Criteria) this;
        }

        public Criteria andEPassscoreEqualTo(Double value) {
            addCriterion("E_PASSSCORE =", value, "ePassscore");
            return (Criteria) this;
        }

        public Criteria andEPassscoreNotEqualTo(Double value) {
            addCriterion("E_PASSSCORE <>", value, "ePassscore");
            return (Criteria) this;
        }

        public Criteria andEPassscoreGreaterThan(Double value) {
            addCriterion("E_PASSSCORE >", value, "ePassscore");
            return (Criteria) this;
        }

        public Criteria andEPassscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("E_PASSSCORE >=", value, "ePassscore");
            return (Criteria) this;
        }

        public Criteria andEPassscoreLessThan(Double value) {
            addCriterion("E_PASSSCORE <", value, "ePassscore");
            return (Criteria) this;
        }

        public Criteria andEPassscoreLessThanOrEqualTo(Double value) {
            addCriterion("E_PASSSCORE <=", value, "ePassscore");
            return (Criteria) this;
        }

        public Criteria andEPassscoreIn(List<Double> values) {
            addCriterion("E_PASSSCORE in", values, "ePassscore");
            return (Criteria) this;
        }

        public Criteria andEPassscoreNotIn(List<Double> values) {
            addCriterion("E_PASSSCORE not in", values, "ePassscore");
            return (Criteria) this;
        }

        public Criteria andEPassscoreBetween(Double value1, Double value2) {
            addCriterion("E_PASSSCORE between", value1, value2, "ePassscore");
            return (Criteria) this;
        }

        public Criteria andEPassscoreNotBetween(Double value1, Double value2) {
            addCriterion("E_PASSSCORE not between", value1, value2, "ePassscore");
            return (Criteria) this;
        }

        public Criteria andEPidIsNull() {
            addCriterion("E_PID is null");
            return (Criteria) this;
        }

        public Criteria andEPidIsNotNull() {
            addCriterion("E_PID is not null");
            return (Criteria) this;
        }

        public Criteria andEPidEqualTo(Long value) {
            addCriterion("E_PID =", value, "ePid");
            return (Criteria) this;
        }

        public Criteria andEPidNotEqualTo(Long value) {
            addCriterion("E_PID <>", value, "ePid");
            return (Criteria) this;
        }

        public Criteria andEPidGreaterThan(Long value) {
            addCriterion("E_PID >", value, "ePid");
            return (Criteria) this;
        }

        public Criteria andEPidGreaterThanOrEqualTo(Long value) {
            addCriterion("E_PID >=", value, "ePid");
            return (Criteria) this;
        }

        public Criteria andEPidLessThan(Long value) {
            addCriterion("E_PID <", value, "ePid");
            return (Criteria) this;
        }

        public Criteria andEPidLessThanOrEqualTo(Long value) {
            addCriterion("E_PID <=", value, "ePid");
            return (Criteria) this;
        }

        public Criteria andEPidIn(List<Long> values) {
            addCriterion("E_PID in", values, "ePid");
            return (Criteria) this;
        }

        public Criteria andEPidNotIn(List<Long> values) {
            addCriterion("E_PID not in", values, "ePid");
            return (Criteria) this;
        }

        public Criteria andEPidBetween(Long value1, Long value2) {
            addCriterion("E_PID between", value1, value2, "ePid");
            return (Criteria) this;
        }

        public Criteria andEPidNotBetween(Long value1, Long value2) {
            addCriterion("E_PID not between", value1, value2, "ePid");
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