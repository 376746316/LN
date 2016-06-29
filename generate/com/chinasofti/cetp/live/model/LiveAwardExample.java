package com.chinasofti.cetp.live.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiveAwardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiveAwardExample() {
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

        public Criteria andAwardIdIsNull() {
            addCriterion("AWARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andAwardIdIsNotNull() {
            addCriterion("AWARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAwardIdEqualTo(Integer value) {
            addCriterion("AWARD_ID =", value, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdNotEqualTo(Integer value) {
            addCriterion("AWARD_ID <>", value, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdGreaterThan(Integer value) {
            addCriterion("AWARD_ID >", value, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AWARD_ID >=", value, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdLessThan(Integer value) {
            addCriterion("AWARD_ID <", value, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdLessThanOrEqualTo(Integer value) {
            addCriterion("AWARD_ID <=", value, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdIn(List<Integer> values) {
            addCriterion("AWARD_ID in", values, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdNotIn(List<Integer> values) {
            addCriterion("AWARD_ID not in", values, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdBetween(Integer value1, Integer value2) {
            addCriterion("AWARD_ID between", value1, value2, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AWARD_ID not between", value1, value2, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardLiveclassIdIsNull() {
            addCriterion("AWARD_LIVECLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andAwardLiveclassIdIsNotNull() {
            addCriterion("AWARD_LIVECLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAwardLiveclassIdEqualTo(Integer value) {
            addCriterion("AWARD_LIVECLASS_ID =", value, "awardLiveclassId");
            return (Criteria) this;
        }

        public Criteria andAwardLiveclassIdNotEqualTo(Integer value) {
            addCriterion("AWARD_LIVECLASS_ID <>", value, "awardLiveclassId");
            return (Criteria) this;
        }

        public Criteria andAwardLiveclassIdGreaterThan(Integer value) {
            addCriterion("AWARD_LIVECLASS_ID >", value, "awardLiveclassId");
            return (Criteria) this;
        }

        public Criteria andAwardLiveclassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AWARD_LIVECLASS_ID >=", value, "awardLiveclassId");
            return (Criteria) this;
        }

        public Criteria andAwardLiveclassIdLessThan(Integer value) {
            addCriterion("AWARD_LIVECLASS_ID <", value, "awardLiveclassId");
            return (Criteria) this;
        }

        public Criteria andAwardLiveclassIdLessThanOrEqualTo(Integer value) {
            addCriterion("AWARD_LIVECLASS_ID <=", value, "awardLiveclassId");
            return (Criteria) this;
        }

        public Criteria andAwardLiveclassIdIn(List<Integer> values) {
            addCriterion("AWARD_LIVECLASS_ID in", values, "awardLiveclassId");
            return (Criteria) this;
        }

        public Criteria andAwardLiveclassIdNotIn(List<Integer> values) {
            addCriterion("AWARD_LIVECLASS_ID not in", values, "awardLiveclassId");
            return (Criteria) this;
        }

        public Criteria andAwardLiveclassIdBetween(Integer value1, Integer value2) {
            addCriterion("AWARD_LIVECLASS_ID between", value1, value2, "awardLiveclassId");
            return (Criteria) this;
        }

        public Criteria andAwardLiveclassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AWARD_LIVECLASS_ID not between", value1, value2, "awardLiveclassId");
            return (Criteria) this;
        }

        public Criteria andAwardFlagIsNull() {
            addCriterion("AWARD_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAwardFlagIsNotNull() {
            addCriterion("AWARD_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAwardFlagEqualTo(String value) {
            addCriterion("AWARD_FLAG =", value, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagNotEqualTo(String value) {
            addCriterion("AWARD_FLAG <>", value, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagGreaterThan(String value) {
            addCriterion("AWARD_FLAG >", value, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AWARD_FLAG >=", value, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagLessThan(String value) {
            addCriterion("AWARD_FLAG <", value, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagLessThanOrEqualTo(String value) {
            addCriterion("AWARD_FLAG <=", value, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagLike(String value) {
            addCriterion("AWARD_FLAG like", value, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagNotLike(String value) {
            addCriterion("AWARD_FLAG not like", value, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagIn(List<String> values) {
            addCriterion("AWARD_FLAG in", values, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagNotIn(List<String> values) {
            addCriterion("AWARD_FLAG not in", values, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagBetween(String value1, String value2) {
            addCriterion("AWARD_FLAG between", value1, value2, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagNotBetween(String value1, String value2) {
            addCriterion("AWARD_FLAG not between", value1, value2, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardPriceIsNull() {
            addCriterion("AWARD_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andAwardPriceIsNotNull() {
            addCriterion("AWARD_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andAwardPriceEqualTo(Integer value) {
            addCriterion("AWARD_PRICE =", value, "awardPrice");
            return (Criteria) this;
        }

        public Criteria andAwardPriceNotEqualTo(Integer value) {
            addCriterion("AWARD_PRICE <>", value, "awardPrice");
            return (Criteria) this;
        }

        public Criteria andAwardPriceGreaterThan(Integer value) {
            addCriterion("AWARD_PRICE >", value, "awardPrice");
            return (Criteria) this;
        }

        public Criteria andAwardPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("AWARD_PRICE >=", value, "awardPrice");
            return (Criteria) this;
        }

        public Criteria andAwardPriceLessThan(Integer value) {
            addCriterion("AWARD_PRICE <", value, "awardPrice");
            return (Criteria) this;
        }

        public Criteria andAwardPriceLessThanOrEqualTo(Integer value) {
            addCriterion("AWARD_PRICE <=", value, "awardPrice");
            return (Criteria) this;
        }

        public Criteria andAwardPriceIn(List<Integer> values) {
            addCriterion("AWARD_PRICE in", values, "awardPrice");
            return (Criteria) this;
        }

        public Criteria andAwardPriceNotIn(List<Integer> values) {
            addCriterion("AWARD_PRICE not in", values, "awardPrice");
            return (Criteria) this;
        }

        public Criteria andAwardPriceBetween(Integer value1, Integer value2) {
            addCriterion("AWARD_PRICE between", value1, value2, "awardPrice");
            return (Criteria) this;
        }

        public Criteria andAwardPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("AWARD_PRICE not between", value1, value2, "awardPrice");
            return (Criteria) this;
        }

        public Criteria andAwardCountIsNull() {
            addCriterion("AWARD_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andAwardCountIsNotNull() {
            addCriterion("AWARD_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAwardCountEqualTo(Integer value) {
            addCriterion("AWARD_COUNT =", value, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountNotEqualTo(Integer value) {
            addCriterion("AWARD_COUNT <>", value, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountGreaterThan(Integer value) {
            addCriterion("AWARD_COUNT >", value, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("AWARD_COUNT >=", value, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountLessThan(Integer value) {
            addCriterion("AWARD_COUNT <", value, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountLessThanOrEqualTo(Integer value) {
            addCriterion("AWARD_COUNT <=", value, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountIn(List<Integer> values) {
            addCriterion("AWARD_COUNT in", values, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountNotIn(List<Integer> values) {
            addCriterion("AWARD_COUNT not in", values, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountBetween(Integer value1, Integer value2) {
            addCriterion("AWARD_COUNT between", value1, value2, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountNotBetween(Integer value1, Integer value2) {
            addCriterion("AWARD_COUNT not between", value1, value2, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardStartTimeIsNull() {
            addCriterion("AWARD_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAwardStartTimeIsNotNull() {
            addCriterion("AWARD_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAwardStartTimeEqualTo(Date value) {
            addCriterion("AWARD_START_TIME =", value, "awardStartTime");
            return (Criteria) this;
        }

        public Criteria andAwardStartTimeNotEqualTo(Date value) {
            addCriterion("AWARD_START_TIME <>", value, "awardStartTime");
            return (Criteria) this;
        }

        public Criteria andAwardStartTimeGreaterThan(Date value) {
            addCriterion("AWARD_START_TIME >", value, "awardStartTime");
            return (Criteria) this;
        }

        public Criteria andAwardStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AWARD_START_TIME >=", value, "awardStartTime");
            return (Criteria) this;
        }

        public Criteria andAwardStartTimeLessThan(Date value) {
            addCriterion("AWARD_START_TIME <", value, "awardStartTime");
            return (Criteria) this;
        }

        public Criteria andAwardStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("AWARD_START_TIME <=", value, "awardStartTime");
            return (Criteria) this;
        }

        public Criteria andAwardStartTimeIn(List<Date> values) {
            addCriterion("AWARD_START_TIME in", values, "awardStartTime");
            return (Criteria) this;
        }

        public Criteria andAwardStartTimeNotIn(List<Date> values) {
            addCriterion("AWARD_START_TIME not in", values, "awardStartTime");
            return (Criteria) this;
        }

        public Criteria andAwardStartTimeBetween(Date value1, Date value2) {
            addCriterion("AWARD_START_TIME between", value1, value2, "awardStartTime");
            return (Criteria) this;
        }

        public Criteria andAwardStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("AWARD_START_TIME not between", value1, value2, "awardStartTime");
            return (Criteria) this;
        }

        public Criteria andAwardEndTimeIsNull() {
            addCriterion("AWARD_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAwardEndTimeIsNotNull() {
            addCriterion("AWARD_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAwardEndTimeEqualTo(Date value) {
            addCriterion("AWARD_END_TIME =", value, "awardEndTime");
            return (Criteria) this;
        }

        public Criteria andAwardEndTimeNotEqualTo(Date value) {
            addCriterion("AWARD_END_TIME <>", value, "awardEndTime");
            return (Criteria) this;
        }

        public Criteria andAwardEndTimeGreaterThan(Date value) {
            addCriterion("AWARD_END_TIME >", value, "awardEndTime");
            return (Criteria) this;
        }

        public Criteria andAwardEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AWARD_END_TIME >=", value, "awardEndTime");
            return (Criteria) this;
        }

        public Criteria andAwardEndTimeLessThan(Date value) {
            addCriterion("AWARD_END_TIME <", value, "awardEndTime");
            return (Criteria) this;
        }

        public Criteria andAwardEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("AWARD_END_TIME <=", value, "awardEndTime");
            return (Criteria) this;
        }

        public Criteria andAwardEndTimeIn(List<Date> values) {
            addCriterion("AWARD_END_TIME in", values, "awardEndTime");
            return (Criteria) this;
        }

        public Criteria andAwardEndTimeNotIn(List<Date> values) {
            addCriterion("AWARD_END_TIME not in", values, "awardEndTime");
            return (Criteria) this;
        }

        public Criteria andAwardEndTimeBetween(Date value1, Date value2) {
            addCriterion("AWARD_END_TIME between", value1, value2, "awardEndTime");
            return (Criteria) this;
        }

        public Criteria andAwardEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("AWARD_END_TIME not between", value1, value2, "awardEndTime");
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