package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TExamUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TExamUserExample() {
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

        public Criteria andEuIdIsNull() {
            addCriterion("EU_ID is null");
            return (Criteria) this;
        }

        public Criteria andEuIdIsNotNull() {
            addCriterion("EU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEuIdEqualTo(Long value) {
            addCriterion("EU_ID =", value, "euId");
            return (Criteria) this;
        }

        public Criteria andEuIdNotEqualTo(Long value) {
            addCriterion("EU_ID <>", value, "euId");
            return (Criteria) this;
        }

        public Criteria andEuIdGreaterThan(Long value) {
            addCriterion("EU_ID >", value, "euId");
            return (Criteria) this;
        }

        public Criteria andEuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EU_ID >=", value, "euId");
            return (Criteria) this;
        }

        public Criteria andEuIdLessThan(Long value) {
            addCriterion("EU_ID <", value, "euId");
            return (Criteria) this;
        }

        public Criteria andEuIdLessThanOrEqualTo(Long value) {
            addCriterion("EU_ID <=", value, "euId");
            return (Criteria) this;
        }

        public Criteria andEuIdIn(List<Long> values) {
            addCriterion("EU_ID in", values, "euId");
            return (Criteria) this;
        }

        public Criteria andEuIdNotIn(List<Long> values) {
            addCriterion("EU_ID not in", values, "euId");
            return (Criteria) this;
        }

        public Criteria andEuIdBetween(Long value1, Long value2) {
            addCriterion("EU_ID between", value1, value2, "euId");
            return (Criteria) this;
        }

        public Criteria andEuIdNotBetween(Long value1, Long value2) {
            addCriterion("EU_ID not between", value1, value2, "euId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
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

        public Criteria andEuTimeIsNull() {
            addCriterion("EU_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEuTimeIsNotNull() {
            addCriterion("EU_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEuTimeEqualTo(Date value) {
            addCriterion("EU_TIME =", value, "euTime");
            return (Criteria) this;
        }

        public Criteria andEuTimeNotEqualTo(Date value) {
            addCriterion("EU_TIME <>", value, "euTime");
            return (Criteria) this;
        }

        public Criteria andEuTimeGreaterThan(Date value) {
            addCriterion("EU_TIME >", value, "euTime");
            return (Criteria) this;
        }

        public Criteria andEuTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EU_TIME >=", value, "euTime");
            return (Criteria) this;
        }

        public Criteria andEuTimeLessThan(Date value) {
            addCriterion("EU_TIME <", value, "euTime");
            return (Criteria) this;
        }

        public Criteria andEuTimeLessThanOrEqualTo(Date value) {
            addCriterion("EU_TIME <=", value, "euTime");
            return (Criteria) this;
        }

        public Criteria andEuTimeIn(List<Date> values) {
            addCriterion("EU_TIME in", values, "euTime");
            return (Criteria) this;
        }

        public Criteria andEuTimeNotIn(List<Date> values) {
            addCriterion("EU_TIME not in", values, "euTime");
            return (Criteria) this;
        }

        public Criteria andEuTimeBetween(Date value1, Date value2) {
            addCriterion("EU_TIME between", value1, value2, "euTime");
            return (Criteria) this;
        }

        public Criteria andEuTimeNotBetween(Date value1, Date value2) {
            addCriterion("EU_TIME not between", value1, value2, "euTime");
            return (Criteria) this;
        }

        public Criteria andEuIpIsNull() {
            addCriterion("EU_IP is null");
            return (Criteria) this;
        }

        public Criteria andEuIpIsNotNull() {
            addCriterion("EU_IP is not null");
            return (Criteria) this;
        }

        public Criteria andEuIpEqualTo(String value) {
            addCriterion("EU_IP =", value, "euIp");
            return (Criteria) this;
        }

        public Criteria andEuIpNotEqualTo(String value) {
            addCriterion("EU_IP <>", value, "euIp");
            return (Criteria) this;
        }

        public Criteria andEuIpGreaterThan(String value) {
            addCriterion("EU_IP >", value, "euIp");
            return (Criteria) this;
        }

        public Criteria andEuIpGreaterThanOrEqualTo(String value) {
            addCriterion("EU_IP >=", value, "euIp");
            return (Criteria) this;
        }

        public Criteria andEuIpLessThan(String value) {
            addCriterion("EU_IP <", value, "euIp");
            return (Criteria) this;
        }

        public Criteria andEuIpLessThanOrEqualTo(String value) {
            addCriterion("EU_IP <=", value, "euIp");
            return (Criteria) this;
        }

        public Criteria andEuIpLike(String value) {
            addCriterion("EU_IP like", value, "euIp");
            return (Criteria) this;
        }

        public Criteria andEuIpNotLike(String value) {
            addCriterion("EU_IP not like", value, "euIp");
            return (Criteria) this;
        }

        public Criteria andEuIpIn(List<String> values) {
            addCriterion("EU_IP in", values, "euIp");
            return (Criteria) this;
        }

        public Criteria andEuIpNotIn(List<String> values) {
            addCriterion("EU_IP not in", values, "euIp");
            return (Criteria) this;
        }

        public Criteria andEuIpBetween(String value1, String value2) {
            addCriterion("EU_IP between", value1, value2, "euIp");
            return (Criteria) this;
        }

        public Criteria andEuIpNotBetween(String value1, String value2) {
            addCriterion("EU_IP not between", value1, value2, "euIp");
            return (Criteria) this;
        }

        public Criteria andEuScoreIsNull() {
            addCriterion("EU_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andEuScoreIsNotNull() {
            addCriterion("EU_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andEuScoreEqualTo(Double value) {
            addCriterion("EU_SCORE =", value, "euScore");
            return (Criteria) this;
        }

        public Criteria andEuScoreNotEqualTo(Double value) {
            addCriterion("EU_SCORE <>", value, "euScore");
            return (Criteria) this;
        }

        public Criteria andEuScoreGreaterThan(Double value) {
            addCriterion("EU_SCORE >", value, "euScore");
            return (Criteria) this;
        }

        public Criteria andEuScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("EU_SCORE >=", value, "euScore");
            return (Criteria) this;
        }

        public Criteria andEuScoreLessThan(Double value) {
            addCriterion("EU_SCORE <", value, "euScore");
            return (Criteria) this;
        }

        public Criteria andEuScoreLessThanOrEqualTo(Double value) {
            addCriterion("EU_SCORE <=", value, "euScore");
            return (Criteria) this;
        }

        public Criteria andEuScoreIn(List<Double> values) {
            addCriterion("EU_SCORE in", values, "euScore");
            return (Criteria) this;
        }

        public Criteria andEuScoreNotIn(List<Double> values) {
            addCriterion("EU_SCORE not in", values, "euScore");
            return (Criteria) this;
        }

        public Criteria andEuScoreBetween(Double value1, Double value2) {
            addCriterion("EU_SCORE between", value1, value2, "euScore");
            return (Criteria) this;
        }

        public Criteria andEuScoreNotBetween(Double value1, Double value2) {
            addCriterion("EU_SCORE not between", value1, value2, "euScore");
            return (Criteria) this;
        }

        public Criteria andEuStatusIsNull() {
            addCriterion("EU_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEuStatusIsNotNull() {
            addCriterion("EU_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEuStatusEqualTo(Long value) {
            addCriterion("EU_STATUS =", value, "euStatus");
            return (Criteria) this;
        }

        public Criteria andEuStatusNotEqualTo(Long value) {
            addCriterion("EU_STATUS <>", value, "euStatus");
            return (Criteria) this;
        }

        public Criteria andEuStatusGreaterThan(Long value) {
            addCriterion("EU_STATUS >", value, "euStatus");
            return (Criteria) this;
        }

        public Criteria andEuStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("EU_STATUS >=", value, "euStatus");
            return (Criteria) this;
        }

        public Criteria andEuStatusLessThan(Long value) {
            addCriterion("EU_STATUS <", value, "euStatus");
            return (Criteria) this;
        }

        public Criteria andEuStatusLessThanOrEqualTo(Long value) {
            addCriterion("EU_STATUS <=", value, "euStatus");
            return (Criteria) this;
        }

        public Criteria andEuStatusIn(List<Long> values) {
            addCriterion("EU_STATUS in", values, "euStatus");
            return (Criteria) this;
        }

        public Criteria andEuStatusNotIn(List<Long> values) {
            addCriterion("EU_STATUS not in", values, "euStatus");
            return (Criteria) this;
        }

        public Criteria andEuStatusBetween(Long value1, Long value2) {
            addCriterion("EU_STATUS between", value1, value2, "euStatus");
            return (Criteria) this;
        }

        public Criteria andEuStatusNotBetween(Long value1, Long value2) {
            addCriterion("EU_STATUS not between", value1, value2, "euStatus");
            return (Criteria) this;
        }

        public Criteria andEuEscoreIsNull() {
            addCriterion("EU_ESCORE is null");
            return (Criteria) this;
        }

        public Criteria andEuEscoreIsNotNull() {
            addCriterion("EU_ESCORE is not null");
            return (Criteria) this;
        }

        public Criteria andEuEscoreEqualTo(Double value) {
            addCriterion("EU_ESCORE =", value, "euEscore");
            return (Criteria) this;
        }

        public Criteria andEuEscoreNotEqualTo(Double value) {
            addCriterion("EU_ESCORE <>", value, "euEscore");
            return (Criteria) this;
        }

        public Criteria andEuEscoreGreaterThan(Double value) {
            addCriterion("EU_ESCORE >", value, "euEscore");
            return (Criteria) this;
        }

        public Criteria andEuEscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("EU_ESCORE >=", value, "euEscore");
            return (Criteria) this;
        }

        public Criteria andEuEscoreLessThan(Double value) {
            addCriterion("EU_ESCORE <", value, "euEscore");
            return (Criteria) this;
        }

        public Criteria andEuEscoreLessThanOrEqualTo(Double value) {
            addCriterion("EU_ESCORE <=", value, "euEscore");
            return (Criteria) this;
        }

        public Criteria andEuEscoreIn(List<Double> values) {
            addCriterion("EU_ESCORE in", values, "euEscore");
            return (Criteria) this;
        }

        public Criteria andEuEscoreNotIn(List<Double> values) {
            addCriterion("EU_ESCORE not in", values, "euEscore");
            return (Criteria) this;
        }

        public Criteria andEuEscoreBetween(Double value1, Double value2) {
            addCriterion("EU_ESCORE between", value1, value2, "euEscore");
            return (Criteria) this;
        }

        public Criteria andEuEscoreNotBetween(Double value1, Double value2) {
            addCriterion("EU_ESCORE not between", value1, value2, "euEscore");
            return (Criteria) this;
        }

        public Criteria andEuSscoreIsNull() {
            addCriterion("EU_SSCORE is null");
            return (Criteria) this;
        }

        public Criteria andEuSscoreIsNotNull() {
            addCriterion("EU_SSCORE is not null");
            return (Criteria) this;
        }

        public Criteria andEuSscoreEqualTo(Double value) {
            addCriterion("EU_SSCORE =", value, "euSscore");
            return (Criteria) this;
        }

        public Criteria andEuSscoreNotEqualTo(Double value) {
            addCriterion("EU_SSCORE <>", value, "euSscore");
            return (Criteria) this;
        }

        public Criteria andEuSscoreGreaterThan(Double value) {
            addCriterion("EU_SSCORE >", value, "euSscore");
            return (Criteria) this;
        }

        public Criteria andEuSscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("EU_SSCORE >=", value, "euSscore");
            return (Criteria) this;
        }

        public Criteria andEuSscoreLessThan(Double value) {
            addCriterion("EU_SSCORE <", value, "euSscore");
            return (Criteria) this;
        }

        public Criteria andEuSscoreLessThanOrEqualTo(Double value) {
            addCriterion("EU_SSCORE <=", value, "euSscore");
            return (Criteria) this;
        }

        public Criteria andEuSscoreIn(List<Double> values) {
            addCriterion("EU_SSCORE in", values, "euSscore");
            return (Criteria) this;
        }

        public Criteria andEuSscoreNotIn(List<Double> values) {
            addCriterion("EU_SSCORE not in", values, "euSscore");
            return (Criteria) this;
        }

        public Criteria andEuSscoreBetween(Double value1, Double value2) {
            addCriterion("EU_SSCORE between", value1, value2, "euSscore");
            return (Criteria) this;
        }

        public Criteria andEuSscoreNotBetween(Double value1, Double value2) {
            addCriterion("EU_SSCORE not between", value1, value2, "euSscore");
            return (Criteria) this;
        }

        public Criteria andEuEoscoreIsNull() {
            addCriterion("EU_EOSCORE is null");
            return (Criteria) this;
        }

        public Criteria andEuEoscoreIsNotNull() {
            addCriterion("EU_EOSCORE is not null");
            return (Criteria) this;
        }

        public Criteria andEuEoscoreEqualTo(Double value) {
            addCriterion("EU_EOSCORE =", value, "euEoscore");
            return (Criteria) this;
        }

        public Criteria andEuEoscoreNotEqualTo(Double value) {
            addCriterion("EU_EOSCORE <>", value, "euEoscore");
            return (Criteria) this;
        }

        public Criteria andEuEoscoreGreaterThan(Double value) {
            addCriterion("EU_EOSCORE >", value, "euEoscore");
            return (Criteria) this;
        }

        public Criteria andEuEoscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("EU_EOSCORE >=", value, "euEoscore");
            return (Criteria) this;
        }

        public Criteria andEuEoscoreLessThan(Double value) {
            addCriterion("EU_EOSCORE <", value, "euEoscore");
            return (Criteria) this;
        }

        public Criteria andEuEoscoreLessThanOrEqualTo(Double value) {
            addCriterion("EU_EOSCORE <=", value, "euEoscore");
            return (Criteria) this;
        }

        public Criteria andEuEoscoreIn(List<Double> values) {
            addCriterion("EU_EOSCORE in", values, "euEoscore");
            return (Criteria) this;
        }

        public Criteria andEuEoscoreNotIn(List<Double> values) {
            addCriterion("EU_EOSCORE not in", values, "euEoscore");
            return (Criteria) this;
        }

        public Criteria andEuEoscoreBetween(Double value1, Double value2) {
            addCriterion("EU_EOSCORE between", value1, value2, "euEoscore");
            return (Criteria) this;
        }

        public Criteria andEuEoscoreNotBetween(Double value1, Double value2) {
            addCriterion("EU_EOSCORE not between", value1, value2, "euEoscore");
            return (Criteria) this;
        }

        public Criteria andEuExampathIsNull() {
            addCriterion("EU_EXAMPATH is null");
            return (Criteria) this;
        }

        public Criteria andEuExampathIsNotNull() {
            addCriterion("EU_EXAMPATH is not null");
            return (Criteria) this;
        }

        public Criteria andEuExampathEqualTo(String value) {
            addCriterion("EU_EXAMPATH =", value, "euExampath");
            return (Criteria) this;
        }

        public Criteria andEuExampathNotEqualTo(String value) {
            addCriterion("EU_EXAMPATH <>", value, "euExampath");
            return (Criteria) this;
        }

        public Criteria andEuExampathGreaterThan(String value) {
            addCriterion("EU_EXAMPATH >", value, "euExampath");
            return (Criteria) this;
        }

        public Criteria andEuExampathGreaterThanOrEqualTo(String value) {
            addCriterion("EU_EXAMPATH >=", value, "euExampath");
            return (Criteria) this;
        }

        public Criteria andEuExampathLessThan(String value) {
            addCriterion("EU_EXAMPATH <", value, "euExampath");
            return (Criteria) this;
        }

        public Criteria andEuExampathLessThanOrEqualTo(String value) {
            addCriterion("EU_EXAMPATH <=", value, "euExampath");
            return (Criteria) this;
        }

        public Criteria andEuExampathLike(String value) {
            addCriterion("EU_EXAMPATH like", value, "euExampath");
            return (Criteria) this;
        }

        public Criteria andEuExampathNotLike(String value) {
            addCriterion("EU_EXAMPATH not like", value, "euExampath");
            return (Criteria) this;
        }

        public Criteria andEuExampathIn(List<String> values) {
            addCriterion("EU_EXAMPATH in", values, "euExampath");
            return (Criteria) this;
        }

        public Criteria andEuExampathNotIn(List<String> values) {
            addCriterion("EU_EXAMPATH not in", values, "euExampath");
            return (Criteria) this;
        }

        public Criteria andEuExampathBetween(String value1, String value2) {
            addCriterion("EU_EXAMPATH between", value1, value2, "euExampath");
            return (Criteria) this;
        }

        public Criteria andEuExampathNotBetween(String value1, String value2) {
            addCriterion("EU_EXAMPATH not between", value1, value2, "euExampath");
            return (Criteria) this;
        }

        public Criteria andEuEndtimeIsNull() {
            addCriterion("EU_ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEuEndtimeIsNotNull() {
            addCriterion("EU_ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEuEndtimeEqualTo(Date value) {
            addCriterion("EU_ENDTIME =", value, "euEndtime");
            return (Criteria) this;
        }

        public Criteria andEuEndtimeNotEqualTo(Date value) {
            addCriterion("EU_ENDTIME <>", value, "euEndtime");
            return (Criteria) this;
        }

        public Criteria andEuEndtimeGreaterThan(Date value) {
            addCriterion("EU_ENDTIME >", value, "euEndtime");
            return (Criteria) this;
        }

        public Criteria andEuEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EU_ENDTIME >=", value, "euEndtime");
            return (Criteria) this;
        }

        public Criteria andEuEndtimeLessThan(Date value) {
            addCriterion("EU_ENDTIME <", value, "euEndtime");
            return (Criteria) this;
        }

        public Criteria andEuEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("EU_ENDTIME <=", value, "euEndtime");
            return (Criteria) this;
        }

        public Criteria andEuEndtimeIn(List<Date> values) {
            addCriterion("EU_ENDTIME in", values, "euEndtime");
            return (Criteria) this;
        }

        public Criteria andEuEndtimeNotIn(List<Date> values) {
            addCriterion("EU_ENDTIME not in", values, "euEndtime");
            return (Criteria) this;
        }

        public Criteria andEuEndtimeBetween(Date value1, Date value2) {
            addCriterion("EU_ENDTIME between", value1, value2, "euEndtime");
            return (Criteria) this;
        }

        public Criteria andEuEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("EU_ENDTIME not between", value1, value2, "euEndtime");
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