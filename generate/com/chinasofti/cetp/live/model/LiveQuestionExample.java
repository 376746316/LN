package com.chinasofti.cetp.live.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiveQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiveQuestionExample() {
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

        public Criteria andLqQuestionIdIsNull() {
            addCriterion("LQ_QUESTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andLqQuestionIdIsNotNull() {
            addCriterion("LQ_QUESTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLqQuestionIdEqualTo(Integer value) {
            addCriterion("LQ_QUESTION_ID =", value, "lqQuestionId");
            return (Criteria) this;
        }

        public Criteria andLqQuestionIdNotEqualTo(Integer value) {
            addCriterion("LQ_QUESTION_ID <>", value, "lqQuestionId");
            return (Criteria) this;
        }

        public Criteria andLqQuestionIdGreaterThan(Integer value) {
            addCriterion("LQ_QUESTION_ID >", value, "lqQuestionId");
            return (Criteria) this;
        }

        public Criteria andLqQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LQ_QUESTION_ID >=", value, "lqQuestionId");
            return (Criteria) this;
        }

        public Criteria andLqQuestionIdLessThan(Integer value) {
            addCriterion("LQ_QUESTION_ID <", value, "lqQuestionId");
            return (Criteria) this;
        }

        public Criteria andLqQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("LQ_QUESTION_ID <=", value, "lqQuestionId");
            return (Criteria) this;
        }

        public Criteria andLqQuestionIdIn(List<Integer> values) {
            addCriterion("LQ_QUESTION_ID in", values, "lqQuestionId");
            return (Criteria) this;
        }

        public Criteria andLqQuestionIdNotIn(List<Integer> values) {
            addCriterion("LQ_QUESTION_ID not in", values, "lqQuestionId");
            return (Criteria) this;
        }

        public Criteria andLqQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("LQ_QUESTION_ID between", value1, value2, "lqQuestionId");
            return (Criteria) this;
        }

        public Criteria andLqQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LQ_QUESTION_ID not between", value1, value2, "lqQuestionId");
            return (Criteria) this;
        }

        public Criteria andLqLiveIdIsNull() {
            addCriterion("LQ_LIVE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLqLiveIdIsNotNull() {
            addCriterion("LQ_LIVE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLqLiveIdEqualTo(Integer value) {
            addCriterion("LQ_LIVE_ID =", value, "lqLiveId");
            return (Criteria) this;
        }

        public Criteria andLqLiveIdNotEqualTo(Integer value) {
            addCriterion("LQ_LIVE_ID <>", value, "lqLiveId");
            return (Criteria) this;
        }

        public Criteria andLqLiveIdGreaterThan(Integer value) {
            addCriterion("LQ_LIVE_ID >", value, "lqLiveId");
            return (Criteria) this;
        }

        public Criteria andLqLiveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LQ_LIVE_ID >=", value, "lqLiveId");
            return (Criteria) this;
        }

        public Criteria andLqLiveIdLessThan(Integer value) {
            addCriterion("LQ_LIVE_ID <", value, "lqLiveId");
            return (Criteria) this;
        }

        public Criteria andLqLiveIdLessThanOrEqualTo(Integer value) {
            addCriterion("LQ_LIVE_ID <=", value, "lqLiveId");
            return (Criteria) this;
        }

        public Criteria andLqLiveIdIn(List<Integer> values) {
            addCriterion("LQ_LIVE_ID in", values, "lqLiveId");
            return (Criteria) this;
        }

        public Criteria andLqLiveIdNotIn(List<Integer> values) {
            addCriterion("LQ_LIVE_ID not in", values, "lqLiveId");
            return (Criteria) this;
        }

        public Criteria andLqLiveIdBetween(Integer value1, Integer value2) {
            addCriterion("LQ_LIVE_ID between", value1, value2, "lqLiveId");
            return (Criteria) this;
        }

        public Criteria andLqLiveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LQ_LIVE_ID not between", value1, value2, "lqLiveId");
            return (Criteria) this;
        }

        public Criteria andLqStuIdIsNull() {
            addCriterion("LQ_STU_ID is null");
            return (Criteria) this;
        }

        public Criteria andLqStuIdIsNotNull() {
            addCriterion("LQ_STU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLqStuIdEqualTo(Integer value) {
            addCriterion("LQ_STU_ID =", value, "lqStuId");
            return (Criteria) this;
        }

        public Criteria andLqStuIdNotEqualTo(Integer value) {
            addCriterion("LQ_STU_ID <>", value, "lqStuId");
            return (Criteria) this;
        }

        public Criteria andLqStuIdGreaterThan(Integer value) {
            addCriterion("LQ_STU_ID >", value, "lqStuId");
            return (Criteria) this;
        }

        public Criteria andLqStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LQ_STU_ID >=", value, "lqStuId");
            return (Criteria) this;
        }

        public Criteria andLqStuIdLessThan(Integer value) {
            addCriterion("LQ_STU_ID <", value, "lqStuId");
            return (Criteria) this;
        }

        public Criteria andLqStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("LQ_STU_ID <=", value, "lqStuId");
            return (Criteria) this;
        }

        public Criteria andLqStuIdIn(List<Integer> values) {
            addCriterion("LQ_STU_ID in", values, "lqStuId");
            return (Criteria) this;
        }

        public Criteria andLqStuIdNotIn(List<Integer> values) {
            addCriterion("LQ_STU_ID not in", values, "lqStuId");
            return (Criteria) this;
        }

        public Criteria andLqStuIdBetween(Integer value1, Integer value2) {
            addCriterion("LQ_STU_ID between", value1, value2, "lqStuId");
            return (Criteria) this;
        }

        public Criteria andLqStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LQ_STU_ID not between", value1, value2, "lqStuId");
            return (Criteria) this;
        }

        public Criteria andLqTitleIsNull() {
            addCriterion("LQ_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andLqTitleIsNotNull() {
            addCriterion("LQ_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andLqTitleEqualTo(String value) {
            addCriterion("LQ_TITLE =", value, "lqTitle");
            return (Criteria) this;
        }

        public Criteria andLqTitleNotEqualTo(String value) {
            addCriterion("LQ_TITLE <>", value, "lqTitle");
            return (Criteria) this;
        }

        public Criteria andLqTitleGreaterThan(String value) {
            addCriterion("LQ_TITLE >", value, "lqTitle");
            return (Criteria) this;
        }

        public Criteria andLqTitleGreaterThanOrEqualTo(String value) {
            addCriterion("LQ_TITLE >=", value, "lqTitle");
            return (Criteria) this;
        }

        public Criteria andLqTitleLessThan(String value) {
            addCriterion("LQ_TITLE <", value, "lqTitle");
            return (Criteria) this;
        }

        public Criteria andLqTitleLessThanOrEqualTo(String value) {
            addCriterion("LQ_TITLE <=", value, "lqTitle");
            return (Criteria) this;
        }

        public Criteria andLqTitleLike(String value) {
            addCriterion("LQ_TITLE like", value, "lqTitle");
            return (Criteria) this;
        }

        public Criteria andLqTitleNotLike(String value) {
            addCriterion("LQ_TITLE not like", value, "lqTitle");
            return (Criteria) this;
        }

        public Criteria andLqTitleIn(List<String> values) {
            addCriterion("LQ_TITLE in", values, "lqTitle");
            return (Criteria) this;
        }

        public Criteria andLqTitleNotIn(List<String> values) {
            addCriterion("LQ_TITLE not in", values, "lqTitle");
            return (Criteria) this;
        }

        public Criteria andLqTitleBetween(String value1, String value2) {
            addCriterion("LQ_TITLE between", value1, value2, "lqTitle");
            return (Criteria) this;
        }

        public Criteria andLqTitleNotBetween(String value1, String value2) {
            addCriterion("LQ_TITLE not between", value1, value2, "lqTitle");
            return (Criteria) this;
        }

        public Criteria andLqKeywordIsNull() {
            addCriterion("LQ_KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andLqKeywordIsNotNull() {
            addCriterion("LQ_KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andLqKeywordEqualTo(String value) {
            addCriterion("LQ_KEYWORD =", value, "lqKeyword");
            return (Criteria) this;
        }

        public Criteria andLqKeywordNotEqualTo(String value) {
            addCriterion("LQ_KEYWORD <>", value, "lqKeyword");
            return (Criteria) this;
        }

        public Criteria andLqKeywordGreaterThan(String value) {
            addCriterion("LQ_KEYWORD >", value, "lqKeyword");
            return (Criteria) this;
        }

        public Criteria andLqKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("LQ_KEYWORD >=", value, "lqKeyword");
            return (Criteria) this;
        }

        public Criteria andLqKeywordLessThan(String value) {
            addCriterion("LQ_KEYWORD <", value, "lqKeyword");
            return (Criteria) this;
        }

        public Criteria andLqKeywordLessThanOrEqualTo(String value) {
            addCriterion("LQ_KEYWORD <=", value, "lqKeyword");
            return (Criteria) this;
        }

        public Criteria andLqKeywordLike(String value) {
            addCriterion("LQ_KEYWORD like", value, "lqKeyword");
            return (Criteria) this;
        }

        public Criteria andLqKeywordNotLike(String value) {
            addCriterion("LQ_KEYWORD not like", value, "lqKeyword");
            return (Criteria) this;
        }

        public Criteria andLqKeywordIn(List<String> values) {
            addCriterion("LQ_KEYWORD in", values, "lqKeyword");
            return (Criteria) this;
        }

        public Criteria andLqKeywordNotIn(List<String> values) {
            addCriterion("LQ_KEYWORD not in", values, "lqKeyword");
            return (Criteria) this;
        }

        public Criteria andLqKeywordBetween(String value1, String value2) {
            addCriterion("LQ_KEYWORD between", value1, value2, "lqKeyword");
            return (Criteria) this;
        }

        public Criteria andLqKeywordNotBetween(String value1, String value2) {
            addCriterion("LQ_KEYWORD not between", value1, value2, "lqKeyword");
            return (Criteria) this;
        }

        public Criteria andLqTypeIdIsNull() {
            addCriterion("LQ_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLqTypeIdIsNotNull() {
            addCriterion("LQ_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLqTypeIdEqualTo(Integer value) {
            addCriterion("LQ_TYPE_ID =", value, "lqTypeId");
            return (Criteria) this;
        }

        public Criteria andLqTypeIdNotEqualTo(Integer value) {
            addCriterion("LQ_TYPE_ID <>", value, "lqTypeId");
            return (Criteria) this;
        }

        public Criteria andLqTypeIdGreaterThan(Integer value) {
            addCriterion("LQ_TYPE_ID >", value, "lqTypeId");
            return (Criteria) this;
        }

        public Criteria andLqTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LQ_TYPE_ID >=", value, "lqTypeId");
            return (Criteria) this;
        }

        public Criteria andLqTypeIdLessThan(Integer value) {
            addCriterion("LQ_TYPE_ID <", value, "lqTypeId");
            return (Criteria) this;
        }

        public Criteria andLqTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("LQ_TYPE_ID <=", value, "lqTypeId");
            return (Criteria) this;
        }

        public Criteria andLqTypeIdIn(List<Integer> values) {
            addCriterion("LQ_TYPE_ID in", values, "lqTypeId");
            return (Criteria) this;
        }

        public Criteria andLqTypeIdNotIn(List<Integer> values) {
            addCriterion("LQ_TYPE_ID not in", values, "lqTypeId");
            return (Criteria) this;
        }

        public Criteria andLqTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("LQ_TYPE_ID between", value1, value2, "lqTypeId");
            return (Criteria) this;
        }

        public Criteria andLqTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LQ_TYPE_ID not between", value1, value2, "lqTypeId");
            return (Criteria) this;
        }

        public Criteria andLqEmergencyIsNull() {
            addCriterion("LQ_EMERGENCY is null");
            return (Criteria) this;
        }

        public Criteria andLqEmergencyIsNotNull() {
            addCriterion("LQ_EMERGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andLqEmergencyEqualTo(String value) {
            addCriterion("LQ_EMERGENCY =", value, "lqEmergency");
            return (Criteria) this;
        }

        public Criteria andLqEmergencyNotEqualTo(String value) {
            addCriterion("LQ_EMERGENCY <>", value, "lqEmergency");
            return (Criteria) this;
        }

        public Criteria andLqEmergencyGreaterThan(String value) {
            addCriterion("LQ_EMERGENCY >", value, "lqEmergency");
            return (Criteria) this;
        }

        public Criteria andLqEmergencyGreaterThanOrEqualTo(String value) {
            addCriterion("LQ_EMERGENCY >=", value, "lqEmergency");
            return (Criteria) this;
        }

        public Criteria andLqEmergencyLessThan(String value) {
            addCriterion("LQ_EMERGENCY <", value, "lqEmergency");
            return (Criteria) this;
        }

        public Criteria andLqEmergencyLessThanOrEqualTo(String value) {
            addCriterion("LQ_EMERGENCY <=", value, "lqEmergency");
            return (Criteria) this;
        }

        public Criteria andLqEmergencyLike(String value) {
            addCriterion("LQ_EMERGENCY like", value, "lqEmergency");
            return (Criteria) this;
        }

        public Criteria andLqEmergencyNotLike(String value) {
            addCriterion("LQ_EMERGENCY not like", value, "lqEmergency");
            return (Criteria) this;
        }

        public Criteria andLqEmergencyIn(List<String> values) {
            addCriterion("LQ_EMERGENCY in", values, "lqEmergency");
            return (Criteria) this;
        }

        public Criteria andLqEmergencyNotIn(List<String> values) {
            addCriterion("LQ_EMERGENCY not in", values, "lqEmergency");
            return (Criteria) this;
        }

        public Criteria andLqEmergencyBetween(String value1, String value2) {
            addCriterion("LQ_EMERGENCY between", value1, value2, "lqEmergency");
            return (Criteria) this;
        }

        public Criteria andLqEmergencyNotBetween(String value1, String value2) {
            addCriterion("LQ_EMERGENCY not between", value1, value2, "lqEmergency");
            return (Criteria) this;
        }

        public Criteria andLqQueTimeIsNull() {
            addCriterion("LQ_QUE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLqQueTimeIsNotNull() {
            addCriterion("LQ_QUE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLqQueTimeEqualTo(Date value) {
            addCriterion("LQ_QUE_TIME =", value, "lqQueTime");
            return (Criteria) this;
        }

        public Criteria andLqQueTimeNotEqualTo(Date value) {
            addCriterion("LQ_QUE_TIME <>", value, "lqQueTime");
            return (Criteria) this;
        }

        public Criteria andLqQueTimeGreaterThan(Date value) {
            addCriterion("LQ_QUE_TIME >", value, "lqQueTime");
            return (Criteria) this;
        }

        public Criteria andLqQueTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LQ_QUE_TIME >=", value, "lqQueTime");
            return (Criteria) this;
        }

        public Criteria andLqQueTimeLessThan(Date value) {
            addCriterion("LQ_QUE_TIME <", value, "lqQueTime");
            return (Criteria) this;
        }

        public Criteria andLqQueTimeLessThanOrEqualTo(Date value) {
            addCriterion("LQ_QUE_TIME <=", value, "lqQueTime");
            return (Criteria) this;
        }

        public Criteria andLqQueTimeIn(List<Date> values) {
            addCriterion("LQ_QUE_TIME in", values, "lqQueTime");
            return (Criteria) this;
        }

        public Criteria andLqQueTimeNotIn(List<Date> values) {
            addCriterion("LQ_QUE_TIME not in", values, "lqQueTime");
            return (Criteria) this;
        }

        public Criteria andLqQueTimeBetween(Date value1, Date value2) {
            addCriterion("LQ_QUE_TIME between", value1, value2, "lqQueTime");
            return (Criteria) this;
        }

        public Criteria andLqQueTimeNotBetween(Date value1, Date value2) {
            addCriterion("LQ_QUE_TIME not between", value1, value2, "lqQueTime");
            return (Criteria) this;
        }

        public Criteria andLqStatusIsNull() {
            addCriterion("LQ_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andLqStatusIsNotNull() {
            addCriterion("LQ_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLqStatusEqualTo(String value) {
            addCriterion("LQ_STATUS =", value, "lqStatus");
            return (Criteria) this;
        }

        public Criteria andLqStatusNotEqualTo(String value) {
            addCriterion("LQ_STATUS <>", value, "lqStatus");
            return (Criteria) this;
        }

        public Criteria andLqStatusGreaterThan(String value) {
            addCriterion("LQ_STATUS >", value, "lqStatus");
            return (Criteria) this;
        }

        public Criteria andLqStatusGreaterThanOrEqualTo(String value) {
            addCriterion("LQ_STATUS >=", value, "lqStatus");
            return (Criteria) this;
        }

        public Criteria andLqStatusLessThan(String value) {
            addCriterion("LQ_STATUS <", value, "lqStatus");
            return (Criteria) this;
        }

        public Criteria andLqStatusLessThanOrEqualTo(String value) {
            addCriterion("LQ_STATUS <=", value, "lqStatus");
            return (Criteria) this;
        }

        public Criteria andLqStatusLike(String value) {
            addCriterion("LQ_STATUS like", value, "lqStatus");
            return (Criteria) this;
        }

        public Criteria andLqStatusNotLike(String value) {
            addCriterion("LQ_STATUS not like", value, "lqStatus");
            return (Criteria) this;
        }

        public Criteria andLqStatusIn(List<String> values) {
            addCriterion("LQ_STATUS in", values, "lqStatus");
            return (Criteria) this;
        }

        public Criteria andLqStatusNotIn(List<String> values) {
            addCriterion("LQ_STATUS not in", values, "lqStatus");
            return (Criteria) this;
        }

        public Criteria andLqStatusBetween(String value1, String value2) {
            addCriterion("LQ_STATUS between", value1, value2, "lqStatus");
            return (Criteria) this;
        }

        public Criteria andLqStatusNotBetween(String value1, String value2) {
            addCriterion("LQ_STATUS not between", value1, value2, "lqStatus");
            return (Criteria) this;
        }

        public Criteria andLqBestAnswerIsNull() {
            addCriterion("LQ_BEST_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andLqBestAnswerIsNotNull() {
            addCriterion("LQ_BEST_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andLqBestAnswerEqualTo(Integer value) {
            addCriterion("LQ_BEST_ANSWER =", value, "lqBestAnswer");
            return (Criteria) this;
        }

        public Criteria andLqBestAnswerNotEqualTo(Integer value) {
            addCriterion("LQ_BEST_ANSWER <>", value, "lqBestAnswer");
            return (Criteria) this;
        }

        public Criteria andLqBestAnswerGreaterThan(Integer value) {
            addCriterion("LQ_BEST_ANSWER >", value, "lqBestAnswer");
            return (Criteria) this;
        }

        public Criteria andLqBestAnswerGreaterThanOrEqualTo(Integer value) {
            addCriterion("LQ_BEST_ANSWER >=", value, "lqBestAnswer");
            return (Criteria) this;
        }

        public Criteria andLqBestAnswerLessThan(Integer value) {
            addCriterion("LQ_BEST_ANSWER <", value, "lqBestAnswer");
            return (Criteria) this;
        }

        public Criteria andLqBestAnswerLessThanOrEqualTo(Integer value) {
            addCriterion("LQ_BEST_ANSWER <=", value, "lqBestAnswer");
            return (Criteria) this;
        }

        public Criteria andLqBestAnswerIn(List<Integer> values) {
            addCriterion("LQ_BEST_ANSWER in", values, "lqBestAnswer");
            return (Criteria) this;
        }

        public Criteria andLqBestAnswerNotIn(List<Integer> values) {
            addCriterion("LQ_BEST_ANSWER not in", values, "lqBestAnswer");
            return (Criteria) this;
        }

        public Criteria andLqBestAnswerBetween(Integer value1, Integer value2) {
            addCriterion("LQ_BEST_ANSWER between", value1, value2, "lqBestAnswer");
            return (Criteria) this;
        }

        public Criteria andLqBestAnswerNotBetween(Integer value1, Integer value2) {
            addCriterion("LQ_BEST_ANSWER not between", value1, value2, "lqBestAnswer");
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