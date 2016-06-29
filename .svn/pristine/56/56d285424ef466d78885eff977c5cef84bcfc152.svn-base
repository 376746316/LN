package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RealtimeQAExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RealtimeQAExample() {
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

        public Criteria andRqaIdIsNull() {
            addCriterion("RQA_ID is null");
            return (Criteria) this;
        }

        public Criteria andRqaIdIsNotNull() {
            addCriterion("RQA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRqaIdEqualTo(Long value) {
            addCriterion("RQA_ID =", value, "rqaId");
            return (Criteria) this;
        }

        public Criteria andRqaIdNotEqualTo(Long value) {
            addCriterion("RQA_ID <>", value, "rqaId");
            return (Criteria) this;
        }

        public Criteria andRqaIdGreaterThan(Long value) {
            addCriterion("RQA_ID >", value, "rqaId");
            return (Criteria) this;
        }

        public Criteria andRqaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RQA_ID >=", value, "rqaId");
            return (Criteria) this;
        }

        public Criteria andRqaIdLessThan(Long value) {
            addCriterion("RQA_ID <", value, "rqaId");
            return (Criteria) this;
        }

        public Criteria andRqaIdLessThanOrEqualTo(Long value) {
            addCriterion("RQA_ID <=", value, "rqaId");
            return (Criteria) this;
        }

        public Criteria andRqaIdIn(List<Long> values) {
            addCriterion("RQA_ID in", values, "rqaId");
            return (Criteria) this;
        }

        public Criteria andRqaIdNotIn(List<Long> values) {
            addCriterion("RQA_ID not in", values, "rqaId");
            return (Criteria) this;
        }

        public Criteria andRqaIdBetween(Long value1, Long value2) {
            addCriterion("RQA_ID between", value1, value2, "rqaId");
            return (Criteria) this;
        }

        public Criteria andRqaIdNotBetween(Long value1, Long value2) {
            addCriterion("RQA_ID not between", value1, value2, "rqaId");
            return (Criteria) this;
        }

        public Criteria andRqaStuNoIsNull() {
            addCriterion("RQA_STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andRqaStuNoIsNotNull() {
            addCriterion("RQA_STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRqaStuNoEqualTo(Integer value) {
            addCriterion("RQA_STU_NO =", value, "rqaStuNo");
            return (Criteria) this;
        }

        public Criteria andRqaStuNoNotEqualTo(Integer value) {
            addCriterion("RQA_STU_NO <>", value, "rqaStuNo");
            return (Criteria) this;
        }

        public Criteria andRqaStuNoGreaterThan(Integer value) {
            addCriterion("RQA_STU_NO >", value, "rqaStuNo");
            return (Criteria) this;
        }

        public Criteria andRqaStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("RQA_STU_NO >=", value, "rqaStuNo");
            return (Criteria) this;
        }

        public Criteria andRqaStuNoLessThan(Integer value) {
            addCriterion("RQA_STU_NO <", value, "rqaStuNo");
            return (Criteria) this;
        }

        public Criteria andRqaStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("RQA_STU_NO <=", value, "rqaStuNo");
            return (Criteria) this;
        }

        public Criteria andRqaStuNoIn(List<Integer> values) {
            addCriterion("RQA_STU_NO in", values, "rqaStuNo");
            return (Criteria) this;
        }

        public Criteria andRqaStuNoNotIn(List<Integer> values) {
            addCriterion("RQA_STU_NO not in", values, "rqaStuNo");
            return (Criteria) this;
        }

        public Criteria andRqaStuNoBetween(Integer value1, Integer value2) {
            addCriterion("RQA_STU_NO between", value1, value2, "rqaStuNo");
            return (Criteria) this;
        }

        public Criteria andRqaStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("RQA_STU_NO not between", value1, value2, "rqaStuNo");
            return (Criteria) this;
        }

        public Criteria andRqaUserNoIsNull() {
            addCriterion("RQA_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andRqaUserNoIsNotNull() {
            addCriterion("RQA_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRqaUserNoEqualTo(Integer value) {
            addCriterion("RQA_USER_NO =", value, "rqaUserNo");
            return (Criteria) this;
        }

        public Criteria andRqaUserNoNotEqualTo(Integer value) {
            addCriterion("RQA_USER_NO <>", value, "rqaUserNo");
            return (Criteria) this;
        }

        public Criteria andRqaUserNoGreaterThan(Integer value) {
            addCriterion("RQA_USER_NO >", value, "rqaUserNo");
            return (Criteria) this;
        }

        public Criteria andRqaUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("RQA_USER_NO >=", value, "rqaUserNo");
            return (Criteria) this;
        }

        public Criteria andRqaUserNoLessThan(Integer value) {
            addCriterion("RQA_USER_NO <", value, "rqaUserNo");
            return (Criteria) this;
        }

        public Criteria andRqaUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("RQA_USER_NO <=", value, "rqaUserNo");
            return (Criteria) this;
        }

        public Criteria andRqaUserNoIn(List<Integer> values) {
            addCriterion("RQA_USER_NO in", values, "rqaUserNo");
            return (Criteria) this;
        }

        public Criteria andRqaUserNoNotIn(List<Integer> values) {
            addCriterion("RQA_USER_NO not in", values, "rqaUserNo");
            return (Criteria) this;
        }

        public Criteria andRqaUserNoBetween(Integer value1, Integer value2) {
            addCriterion("RQA_USER_NO between", value1, value2, "rqaUserNo");
            return (Criteria) this;
        }

        public Criteria andRqaUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("RQA_USER_NO not between", value1, value2, "rqaUserNo");
            return (Criteria) this;
        }

        public Criteria andRqaTypeIdIsNull() {
            addCriterion("RQA_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRqaTypeIdIsNotNull() {
            addCriterion("RQA_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRqaTypeIdEqualTo(Integer value) {
            addCriterion("RQA_TYPE_ID =", value, "rqaTypeId");
            return (Criteria) this;
        }

        public Criteria andRqaTypeIdNotEqualTo(Integer value) {
            addCriterion("RQA_TYPE_ID <>", value, "rqaTypeId");
            return (Criteria) this;
        }

        public Criteria andRqaTypeIdGreaterThan(Integer value) {
            addCriterion("RQA_TYPE_ID >", value, "rqaTypeId");
            return (Criteria) this;
        }

        public Criteria andRqaTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RQA_TYPE_ID >=", value, "rqaTypeId");
            return (Criteria) this;
        }

        public Criteria andRqaTypeIdLessThan(Integer value) {
            addCriterion("RQA_TYPE_ID <", value, "rqaTypeId");
            return (Criteria) this;
        }

        public Criteria andRqaTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("RQA_TYPE_ID <=", value, "rqaTypeId");
            return (Criteria) this;
        }

        public Criteria andRqaTypeIdIn(List<Integer> values) {
            addCriterion("RQA_TYPE_ID in", values, "rqaTypeId");
            return (Criteria) this;
        }

        public Criteria andRqaTypeIdNotIn(List<Integer> values) {
            addCriterion("RQA_TYPE_ID not in", values, "rqaTypeId");
            return (Criteria) this;
        }

        public Criteria andRqaTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("RQA_TYPE_ID between", value1, value2, "rqaTypeId");
            return (Criteria) this;
        }

        public Criteria andRqaTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RQA_TYPE_ID not between", value1, value2, "rqaTypeId");
            return (Criteria) this;
        }

        public Criteria andRqaTitleIsNull() {
            addCriterion("RQA_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andRqaTitleIsNotNull() {
            addCriterion("RQA_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andRqaTitleEqualTo(String value) {
            addCriterion("RQA_TITLE =", value, "rqaTitle");
            return (Criteria) this;
        }

        public Criteria andRqaTitleNotEqualTo(String value) {
            addCriterion("RQA_TITLE <>", value, "rqaTitle");
            return (Criteria) this;
        }

        public Criteria andRqaTitleGreaterThan(String value) {
            addCriterion("RQA_TITLE >", value, "rqaTitle");
            return (Criteria) this;
        }

        public Criteria andRqaTitleGreaterThanOrEqualTo(String value) {
            addCriterion("RQA_TITLE >=", value, "rqaTitle");
            return (Criteria) this;
        }

        public Criteria andRqaTitleLessThan(String value) {
            addCriterion("RQA_TITLE <", value, "rqaTitle");
            return (Criteria) this;
        }

        public Criteria andRqaTitleLessThanOrEqualTo(String value) {
            addCriterion("RQA_TITLE <=", value, "rqaTitle");
            return (Criteria) this;
        }

        public Criteria andRqaTitleLike(String value) {
            addCriterion("RQA_TITLE like", value, "rqaTitle");
            return (Criteria) this;
        }

        public Criteria andRqaTitleNotLike(String value) {
            addCriterion("RQA_TITLE not like", value, "rqaTitle");
            return (Criteria) this;
        }

        public Criteria andRqaTitleIn(List<String> values) {
            addCriterion("RQA_TITLE in", values, "rqaTitle");
            return (Criteria) this;
        }

        public Criteria andRqaTitleNotIn(List<String> values) {
            addCriterion("RQA_TITLE not in", values, "rqaTitle");
            return (Criteria) this;
        }

        public Criteria andRqaTitleBetween(String value1, String value2) {
            addCriterion("RQA_TITLE between", value1, value2, "rqaTitle");
            return (Criteria) this;
        }

        public Criteria andRqaTitleNotBetween(String value1, String value2) {
            addCriterion("RQA_TITLE not between", value1, value2, "rqaTitle");
            return (Criteria) this;
        }

        public Criteria andRqaStatusIsNull() {
            addCriterion("RQA_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRqaStatusIsNotNull() {
            addCriterion("RQA_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRqaStatusEqualTo(String value) {
            addCriterion("RQA_STATUS =", value, "rqaStatus");
            return (Criteria) this;
        }

        public Criteria andRqaStatusNotEqualTo(String value) {
            addCriterion("RQA_STATUS <>", value, "rqaStatus");
            return (Criteria) this;
        }

        public Criteria andRqaStatusGreaterThan(String value) {
            addCriterion("RQA_STATUS >", value, "rqaStatus");
            return (Criteria) this;
        }

        public Criteria andRqaStatusGreaterThanOrEqualTo(String value) {
            addCriterion("RQA_STATUS >=", value, "rqaStatus");
            return (Criteria) this;
        }

        public Criteria andRqaStatusLessThan(String value) {
            addCriterion("RQA_STATUS <", value, "rqaStatus");
            return (Criteria) this;
        }

        public Criteria andRqaStatusLessThanOrEqualTo(String value) {
            addCriterion("RQA_STATUS <=", value, "rqaStatus");
            return (Criteria) this;
        }

        public Criteria andRqaStatusLike(String value) {
            addCriterion("RQA_STATUS like", value, "rqaStatus");
            return (Criteria) this;
        }

        public Criteria andRqaStatusNotLike(String value) {
            addCriterion("RQA_STATUS not like", value, "rqaStatus");
            return (Criteria) this;
        }

        public Criteria andRqaStatusIn(List<String> values) {
            addCriterion("RQA_STATUS in", values, "rqaStatus");
            return (Criteria) this;
        }

        public Criteria andRqaStatusNotIn(List<String> values) {
            addCriterion("RQA_STATUS not in", values, "rqaStatus");
            return (Criteria) this;
        }

        public Criteria andRqaStatusBetween(String value1, String value2) {
            addCriterion("RQA_STATUS between", value1, value2, "rqaStatus");
            return (Criteria) this;
        }

        public Criteria andRqaStatusNotBetween(String value1, String value2) {
            addCriterion("RQA_STATUS not between", value1, value2, "rqaStatus");
            return (Criteria) this;
        }

        public Criteria andRqaStartTimeIsNull() {
            addCriterion("RQA_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRqaStartTimeIsNotNull() {
            addCriterion("RQA_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRqaStartTimeEqualTo(Date value) {
            addCriterion("RQA_START_TIME =", value, "rqaStartTime");
            return (Criteria) this;
        }

        public Criteria andRqaStartTimeNotEqualTo(Date value) {
            addCriterion("RQA_START_TIME <>", value, "rqaStartTime");
            return (Criteria) this;
        }

        public Criteria andRqaStartTimeGreaterThan(Date value) {
            addCriterion("RQA_START_TIME >", value, "rqaStartTime");
            return (Criteria) this;
        }

        public Criteria andRqaStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RQA_START_TIME >=", value, "rqaStartTime");
            return (Criteria) this;
        }

        public Criteria andRqaStartTimeLessThan(Date value) {
            addCriterion("RQA_START_TIME <", value, "rqaStartTime");
            return (Criteria) this;
        }

        public Criteria andRqaStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("RQA_START_TIME <=", value, "rqaStartTime");
            return (Criteria) this;
        }

        public Criteria andRqaStartTimeIn(List<Date> values) {
            addCriterion("RQA_START_TIME in", values, "rqaStartTime");
            return (Criteria) this;
        }

        public Criteria andRqaStartTimeNotIn(List<Date> values) {
            addCriterion("RQA_START_TIME not in", values, "rqaStartTime");
            return (Criteria) this;
        }

        public Criteria andRqaStartTimeBetween(Date value1, Date value2) {
            addCriterion("RQA_START_TIME between", value1, value2, "rqaStartTime");
            return (Criteria) this;
        }

        public Criteria andRqaStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("RQA_START_TIME not between", value1, value2, "rqaStartTime");
            return (Criteria) this;
        }

        public Criteria andRqaEndTimeIsNull() {
            addCriterion("RQA_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRqaEndTimeIsNotNull() {
            addCriterion("RQA_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRqaEndTimeEqualTo(Date value) {
            addCriterion("RQA_END_TIME =", value, "rqaEndTime");
            return (Criteria) this;
        }

        public Criteria andRqaEndTimeNotEqualTo(Date value) {
            addCriterion("RQA_END_TIME <>", value, "rqaEndTime");
            return (Criteria) this;
        }

        public Criteria andRqaEndTimeGreaterThan(Date value) {
            addCriterion("RQA_END_TIME >", value, "rqaEndTime");
            return (Criteria) this;
        }

        public Criteria andRqaEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RQA_END_TIME >=", value, "rqaEndTime");
            return (Criteria) this;
        }

        public Criteria andRqaEndTimeLessThan(Date value) {
            addCriterion("RQA_END_TIME <", value, "rqaEndTime");
            return (Criteria) this;
        }

        public Criteria andRqaEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("RQA_END_TIME <=", value, "rqaEndTime");
            return (Criteria) this;
        }

        public Criteria andRqaEndTimeIn(List<Date> values) {
            addCriterion("RQA_END_TIME in", values, "rqaEndTime");
            return (Criteria) this;
        }

        public Criteria andRqaEndTimeNotIn(List<Date> values) {
            addCriterion("RQA_END_TIME not in", values, "rqaEndTime");
            return (Criteria) this;
        }

        public Criteria andRqaEndTimeBetween(Date value1, Date value2) {
            addCriterion("RQA_END_TIME between", value1, value2, "rqaEndTime");
            return (Criteria) this;
        }

        public Criteria andRqaEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("RQA_END_TIME not between", value1, value2, "rqaEndTime");
            return (Criteria) this;
        }

        public Criteria andRqaQualityIsNull() {
            addCriterion("RQA_QUALITY is null");
            return (Criteria) this;
        }

        public Criteria andRqaQualityIsNotNull() {
            addCriterion("RQA_QUALITY is not null");
            return (Criteria) this;
        }

        public Criteria andRqaQualityEqualTo(String value) {
            addCriterion("RQA_QUALITY =", value, "rqaQuality");
            return (Criteria) this;
        }

        public Criteria andRqaQualityNotEqualTo(String value) {
            addCriterion("RQA_QUALITY <>", value, "rqaQuality");
            return (Criteria) this;
        }

        public Criteria andRqaQualityGreaterThan(String value) {
            addCriterion("RQA_QUALITY >", value, "rqaQuality");
            return (Criteria) this;
        }

        public Criteria andRqaQualityGreaterThanOrEqualTo(String value) {
            addCriterion("RQA_QUALITY >=", value, "rqaQuality");
            return (Criteria) this;
        }

        public Criteria andRqaQualityLessThan(String value) {
            addCriterion("RQA_QUALITY <", value, "rqaQuality");
            return (Criteria) this;
        }

        public Criteria andRqaQualityLessThanOrEqualTo(String value) {
            addCriterion("RQA_QUALITY <=", value, "rqaQuality");
            return (Criteria) this;
        }

        public Criteria andRqaQualityLike(String value) {
            addCriterion("RQA_QUALITY like", value, "rqaQuality");
            return (Criteria) this;
        }

        public Criteria andRqaQualityNotLike(String value) {
            addCriterion("RQA_QUALITY not like", value, "rqaQuality");
            return (Criteria) this;
        }

        public Criteria andRqaQualityIn(List<String> values) {
            addCriterion("RQA_QUALITY in", values, "rqaQuality");
            return (Criteria) this;
        }

        public Criteria andRqaQualityNotIn(List<String> values) {
            addCriterion("RQA_QUALITY not in", values, "rqaQuality");
            return (Criteria) this;
        }

        public Criteria andRqaQualityBetween(String value1, String value2) {
            addCriterion("RQA_QUALITY between", value1, value2, "rqaQuality");
            return (Criteria) this;
        }

        public Criteria andRqaQualityNotBetween(String value1, String value2) {
            addCriterion("RQA_QUALITY not between", value1, value2, "rqaQuality");
            return (Criteria) this;
        }

        public Criteria andRqaRegtimeIsNull() {
            addCriterion("RQA_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andRqaRegtimeIsNotNull() {
            addCriterion("RQA_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRqaRegtimeEqualTo(Date value) {
            addCriterion("RQA_REGTIME =", value, "rqaRegtime");
            return (Criteria) this;
        }

        public Criteria andRqaRegtimeNotEqualTo(Date value) {
            addCriterion("RQA_REGTIME <>", value, "rqaRegtime");
            return (Criteria) this;
        }

        public Criteria andRqaRegtimeGreaterThan(Date value) {
            addCriterion("RQA_REGTIME >", value, "rqaRegtime");
            return (Criteria) this;
        }

        public Criteria andRqaRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RQA_REGTIME >=", value, "rqaRegtime");
            return (Criteria) this;
        }

        public Criteria andRqaRegtimeLessThan(Date value) {
            addCriterion("RQA_REGTIME <", value, "rqaRegtime");
            return (Criteria) this;
        }

        public Criteria andRqaRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("RQA_REGTIME <=", value, "rqaRegtime");
            return (Criteria) this;
        }

        public Criteria andRqaRegtimeIn(List<Date> values) {
            addCriterion("RQA_REGTIME in", values, "rqaRegtime");
            return (Criteria) this;
        }

        public Criteria andRqaRegtimeNotIn(List<Date> values) {
            addCriterion("RQA_REGTIME not in", values, "rqaRegtime");
            return (Criteria) this;
        }

        public Criteria andRqaRegtimeBetween(Date value1, Date value2) {
            addCriterion("RQA_REGTIME between", value1, value2, "rqaRegtime");
            return (Criteria) this;
        }

        public Criteria andRqaRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("RQA_REGTIME not between", value1, value2, "rqaRegtime");
            return (Criteria) this;
        }
        public Criteria andRqaChargemodeIsNull() {
            addCriterion("RQA_CHARGEMODE is null");
            return (Criteria) this;
        }
        public Criteria andRqaChargemodeIsNotNull() {
            addCriterion("RQA_CHARGEMODE is not null");
            return (Criteria) this;
        }
        public Criteria andRqaChargemodeEqualTo(String value) {
            addCriterion("RQA_CHARGEMODE =", value, "rqaChargemode");
            return (Criteria) this;
        }
        public Criteria andRqaChargemodeNotEqualTo(String value) {
            addCriterion("RQA_CHARGEMODE <>", value, "rqaChargemode");
            return (Criteria) this;
        }
        public Criteria andRqaChargemodeGreaterThan(String value) {
            addCriterion("RQA_CHARGEMODE >", value, "rqaChargemode");
            return (Criteria) this;
        }
        public Criteria andRqaChargemodeGreaterThanOrEqualTo(String value) {
            addCriterion("RQA_CHARGEMODE >=", value, "rqaChargemode");
            return (Criteria) this;
        }
        public Criteria andRqaChargemodeLessThan(String value) {
            addCriterion("RQA_CHARGEMODE <", value, "rqaChargemode");
            return (Criteria) this;
        }
        public Criteria andRqaChargemodeLessThanOrEqualTo(String value) {
            addCriterion("RQA_CHARGEMODE <=", value, "rqaChargemode");
            return (Criteria) this;
        }
        public Criteria andRqaChargemodeLike(String value) {
            addCriterion("RQA_CHARGEMODE like", value, "rqaChargemode");
            return (Criteria) this;
        }
        public Criteria andRqaChargemodeNotLike(String value) {
            addCriterion("RQA_CHARGEMODE not like", value, "rqaChargemode");
            return (Criteria) this;
        }
        public Criteria andRqaChargemodeIn(List<String> values) {
            addCriterion("RQA_CHARGEMODE in", values, "rqaChargemode");
            return (Criteria) this;
        }
        public Criteria andRqaChargemodeNotIn(List<String> values) {
            addCriterion("RQA_CHARGEMODE not in", values, "rqaChargemode");
            return (Criteria) this;
        }
        public Criteria andRqaChargemodeBetween(String value1, String value2) {
            addCriterion("RQA_CHARGEMODE between", value1, value2, "rqaChargemode");
            return (Criteria) this;
        }
        public Criteria andRqaChargemodeNotBetween(String value1, String value2) {
            addCriterion("RQA_CHARGEMODE not between", value1, value2, "rqaChargemode");
            return (Criteria) this;
        }
        public Criteria andRqaPercentageIsNull() {
            addCriterion("RQA_PERCENTAGE is null");
            return (Criteria) this;
        }
        public Criteria andRqaPercentageIsNotNull() {
            addCriterion("RQA_PERCENTAGE is not null");
            return (Criteria) this;
        }
        public Criteria andRqaPercentageEqualTo(Integer value) {
            addCriterion("RQA_PERCENTAGE =", value, "rqaPercentage");
            return (Criteria) this;
        }
        public Criteria andRqaPercentageNotEqualTo(Integer value) {
            addCriterion("RQA_PERCENTAGE <>", value, "rqaPercentage");
            return (Criteria) this;
        }
        public Criteria andRqaPercentageGreaterThan(Integer value) {
            addCriterion("RQA_PERCENTAGE >", value, "rqaPercentage");
            return (Criteria) this;
        }
        public Criteria andRqaPercentageGreaterThanOrEqualTo(Integer value) {
            addCriterion("RQA_PERCENTAGE >=", value, "rqaPercentage");
            return (Criteria) this;
        }
        public Criteria andRqaPercentageLessThan(Integer value) {
            addCriterion("RQA_PERCENTAGE <", value, "rqaPercentage");
            return (Criteria) this;
        }
        public Criteria andRqaPercentageLessThanOrEqualTo(Integer value) {
            addCriterion("RQA_PERCENTAGE <=", value, "rqaPercentage");
            return (Criteria) this;
        }
        public Criteria andRqaPercentageIn(List<Integer> values) {
            addCriterion("RQA_PERCENTAGE in", values, "rqaPercentage");
            return (Criteria) this;
        }
        public Criteria andRqaPercentageNotIn(List<Integer> values) {
            addCriterion("RQA_PERCENTAGE not in", values, "rqaPercentage");
            return (Criteria) this;
        }
        public Criteria andRqaPercentageBetween(Integer value1, Integer value2) {
            addCriterion("RQA_PERCENTAGE between", value1, value2, "rqaPercentage");
            return (Criteria) this;
        }
        public Criteria andRqaPercentageNotBetween(Integer value1, Integer value2) {
            addCriterion("RQA_PERCENTAGE not between", value1, value2, "rqaPercentage");
            return (Criteria) this;
        }
        public Criteria andRqaMoneyIsNull() {
            addCriterion("RQA_MONEY is null");
            return (Criteria) this;
        }
        public Criteria andRqaMoneyIsNotNull() {
            addCriterion("RQA_MONEY is not null");
            return (Criteria) this;
        }
        public Criteria andRqaMoneyEqualTo(Double value) {
            addCriterion("RQA_MONEY =", value, "rqaMoney");
            return (Criteria) this;
        }
        public Criteria andRqaMoneyNotEqualTo(Double value) {
            addCriterion("RQA_MONEY <>", value, "rqaMoney");
            return (Criteria) this;
        }
        public Criteria andRqaMoneyGreaterThan(Double value) {
            addCriterion("RQA_MONEY >", value, "rqaMoney");
            return (Criteria) this;
        }
        public Criteria andRqaMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("RQA_MONEY >=", value, "rqaMoney");
            return (Criteria) this;
        }
        public Criteria andRqaMoneyLessThan(Double value) {
            addCriterion("RQA_MONEY <", value, "rqaMoney");
            return (Criteria) this;
        }
        public Criteria andRqaMoneyLessThanOrEqualTo(Double value) {
            addCriterion("RQA_MONEY <=", value, "rqaMoney");
            return (Criteria) this;
        }
        public Criteria andRqaMoneyIn(List<Double> values) {
            addCriterion("RQA_MONEY in", values, "rqaMoney");
            return (Criteria) this;
        }
        public Criteria andRqaMoneyNotIn(List<Double> values) {
            addCriterion("RQA_MONEY not in", values, "rqaMoney");
            return (Criteria) this;
        }
        public Criteria andRqaMoneyBetween(Double value1, Double value2) {
            addCriterion("RQA_MONEY between", value1, value2, "rqaMoney");
            return (Criteria) this;
        }
        public Criteria andRqaMoneyNotBetween(Double value1, Double value2) {
            addCriterion("RQA_MONEY not between", value1, value2, "rqaMoney");
            return (Criteria) this;
        }
        public Criteria andRqaUnialenceIsNull() {
            addCriterion("RQA_UNIALENCE is null");
            return (Criteria) this;
        }
        public Criteria andRqaUnialenceIsNotNull() {
            addCriterion("RQA_UNIALENCE is not null");
            return (Criteria) this;
        }
        public Criteria andRqaUnialenceEqualTo(Double value) {
            addCriterion("RQA_UNIALENCE =", value, "rqaUnialence");
            return (Criteria) this;
        }
        public Criteria andRqaUnialenceNotEqualTo(Double value) {
            addCriterion("RQA_UNIALENCE <>", value, "rqaUnialence");
            return (Criteria) this;
        }
        public Criteria andRqaUnialenceGreaterThan(Double value) {
            addCriterion("RQA_UNIALENCE >", value, "rqaUnialence");
            return (Criteria) this;
        }
        public Criteria andRqaUnialenceGreaterThanOrEqualTo(Double value) {
            addCriterion("RQA_UNIALENCE >=", value, "rqaUnialence");
            return (Criteria) this;
        }
        public Criteria andRqaUnialenceLessThan(Double value) {
            addCriterion("RQA_UNIALENCE <", value, "rqaUnialence");
            return (Criteria) this;
        }
        public Criteria andRqaUnialenceLessThanOrEqualTo(Double value) {
            addCriterion("RQA_UNIALENCE <=", value, "rqaUnialence");
            return (Criteria) this;
        }
        public Criteria andRqaUnialenceIn(List<Double> values) {
            addCriterion("RQA_UNIALENCE in", values, "rqaUnialence");
            return (Criteria) this;
        }
        public Criteria andRqaUnialenceNotIn(List<Double> values) {
            addCriterion("RQA_UNIALENCE not in", values, "rqaUnialence");
            return (Criteria) this;
        }
        public Criteria andRqaUnialenceBetween(Double value1, Double value2) {
            addCriterion("RQA_UNIALENCE between", value1, value2, "rqaUnialence");
            return (Criteria) this;
        }
        public Criteria andRqaUnialenceNotBetween(Double value1, Double value2) {
            addCriterion("RQA_UNIALENCE not between", value1, value2, "rqaUnialence");
            return (Criteria) this;
        }
        public Criteria andRqaPeriodictityIsNull() {
            addCriterion("RQA_PERIODICTITY is null");
            return (Criteria) this;
        }
        public Criteria andRqaPeriodictityIsNotNull() {
            addCriterion("RQA_PERIODICTITY is not null");
            return (Criteria) this;
        }
        public Criteria andRqaPeriodictityEqualTo(Integer value) {
            addCriterion("RQA_PERIODICTITY =", value, "rqaPeriodictity");
            return (Criteria) this;
        }
        public Criteria andRqaPeriodictityNotEqualTo(Integer value) {
            addCriterion("RQA_PERIODICTITY <>", value, "rqaPeriodictity");
            return (Criteria) this;
        }
        public Criteria andRqaPeriodictityGreaterThan(Integer value) {
            addCriterion("RQA_PERIODICTITY >", value, "rqaPeriodictity");
            return (Criteria) this;
        }
        public Criteria andRqaPeriodictityGreaterThanOrEqualTo(Integer value) {
            addCriterion("RQA_PERIODICTITY >=", value, "rqaPeriodictity");
            return (Criteria) this;
        }
        public Criteria andRqaPeriodictityLessThan(Integer value) {
            addCriterion("RQA_PERIODICTITY <", value, "rqaPeriodictity");
            return (Criteria) this;
        }
        public Criteria andRqaPeriodictityLessThanOrEqualTo(Integer value) {
            addCriterion("RQA_PERIODICTITY <=", value, "rqaPeriodictity");
            return (Criteria) this;
        }
        public Criteria andRqaPeriodictityIn(List<Integer> values) {
            addCriterion("RQA_PERIODICTITY in", values, "rqaPeriodictity");
            return (Criteria) this;
        }
        public Criteria andRqaPeriodictityNotIn(List<Integer> values) {
            addCriterion("RQA_PERIODICTITY not in", values, "rqaPeriodictity");
            return (Criteria) this;
        }
        public Criteria andRqaPeriodictityBetween(Integer value1, Integer value2) {
            addCriterion("RQA_PERIODICTITY between", value1, value2, "rqaPeriodictity");
            return (Criteria) this;
        }
        public Criteria andRqaPeriodictityNotBetween(Integer value1, Integer value2) {
            addCriterion("RQA_PERIODICTITY not between", value1, value2, "rqaPeriodictity");
            return (Criteria) this;
        }
        public Criteria andRqaDurationIsNull() {
            addCriterion("RQA_DURATION is null");
            return (Criteria) this;
        }
        public Criteria andRqaDurationIsNotNull() {
            addCriterion("RQA_DURATION is not null");
            return (Criteria) this;
        }
        public Criteria andRqaDurationEqualTo(Integer value) {
            addCriterion("RQA_DURATION =", value, "rqaDuration");
            return (Criteria) this;
        }
        public Criteria andRqaDurationNotEqualTo(Integer value) {
            addCriterion("RQA_DURATION <>", value, "rqaDuration");
            return (Criteria) this;
        }
        public Criteria andRqaDurationGreaterThan(Integer value) {
            addCriterion("RQA_DURATION >", value, "rqaDuration");
            return (Criteria) this;
        }
        public Criteria andRqaDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("RQA_DURATION >=", value, "rqaDuration");
            return (Criteria) this;
        }
        public Criteria andRqaDurationLessThan(Integer value) {
            addCriterion("RQA_DURATION <", value, "rqaDuration");
            return (Criteria) this;
        }
        public Criteria andRqaDurationLessThanOrEqualTo(Integer value) {
            addCriterion("RQA_DURATION <=", value, "rqaDuration");
            return (Criteria) this;
        }
        public Criteria andRqaDurationIn(List<Integer> values) {
            addCriterion("RQA_DURATION in", values, "rqaDuration");
            return (Criteria) this;
        }
        public Criteria andRqaDurationNotIn(List<Integer> values) {
            addCriterion("RQA_DURATION not in", values, "rqaDuration");
            return (Criteria) this;
        }
        public Criteria andRqaDurationBetween(Integer value1, Integer value2) {
            addCriterion("RQA_DURATION between", value1, value2, "rqaDuration");
            return (Criteria) this;
        }
        public Criteria andRqaDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("RQA_DURATION not between", value1, value2, "rqaDuration");
            return (Criteria) this;
        }
        public Criteria andRqaCycletimeIsNull() {
            addCriterion("RQA_CYCLETIME is null");
            return (Criteria) this;
        }
        public Criteria andRqaCycletimeIsNotNull() {
            addCriterion("RQA_CYCLETIME is not null");
            return (Criteria) this;
        }
        public Criteria andRqaCycletimeEqualTo(Integer value) {
            addCriterion("RQA_CYCLETIME =", value, "rqaCycletime");
            return (Criteria) this;
        }
        public Criteria andRqaCycletimeNotEqualTo(Integer value) {
            addCriterion("RQA_CYCLETIME <>", value, "rqaCycletime");
            return (Criteria) this;
        }
        public Criteria andRqaCycletimeGreaterThan(Integer value) {
            addCriterion("RQA_CYCLETIME >", value, "rqaCycletime");
            return (Criteria) this;
        }
        public Criteria andRqaCycletimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RQA_CYCLETIME >=", value, "rqaCycletime");
            return (Criteria) this;
        }
        public Criteria andRqaCycletimeLessThan(Integer value) {
            addCriterion("RQA_CYCLETIME <", value, "rqaCycletime");
            return (Criteria) this;
        }
        public Criteria andRqaCycletimeLessThanOrEqualTo(Integer value) {
            addCriterion("RQA_CYCLETIME <=", value, "rqaCycletime");
            return (Criteria) this;
        }
        public Criteria andRqaCycletimeIn(List<Integer> values) {
            addCriterion("RQA_CYCLETIME in", values, "rqaCycletime");
            return (Criteria) this;
        }
        public Criteria andRqaCycletimeNotIn(List<Integer> values) {
            addCriterion("RQA_CYCLETIME not in", values, "rqaCycletime");
            return (Criteria) this;
        }
        public Criteria andRqaCycletimeBetween(Integer value1, Integer value2) {
            addCriterion("RQA_CYCLETIME between", value1, value2, "rqaCycletime");
            return (Criteria) this;
        }
        public Criteria andRqaCycletimeNotBetween(Integer value1, Integer value2) {
            addCriterion("RQA_CYCLETIME not between", value1, value2, "rqaCycletime");
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