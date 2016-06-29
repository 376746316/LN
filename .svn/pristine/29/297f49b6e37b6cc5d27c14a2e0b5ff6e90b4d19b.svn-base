package com.chinasofti.cetp.live.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiveExample() {
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

        public Criteria andLiveIdIsNull() {
            addCriterion("LIVE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLiveIdIsNotNull() {
            addCriterion("LIVE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLiveIdEqualTo(Integer value) {
            addCriterion("LIVE_ID =", value, "liveId");
            return (Criteria) this;
        }

        public Criteria andLiveIdNotEqualTo(Integer value) {
            addCriterion("LIVE_ID <>", value, "liveId");
            return (Criteria) this;
        }

        public Criteria andLiveIdGreaterThan(Integer value) {
            addCriterion("LIVE_ID >", value, "liveId");
            return (Criteria) this;
        }

        public Criteria andLiveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIVE_ID >=", value, "liveId");
            return (Criteria) this;
        }

        public Criteria andLiveIdLessThan(Integer value) {
            addCriterion("LIVE_ID <", value, "liveId");
            return (Criteria) this;
        }

        public Criteria andLiveIdLessThanOrEqualTo(Integer value) {
            addCriterion("LIVE_ID <=", value, "liveId");
            return (Criteria) this;
        }

        public Criteria andLiveIdIn(List<Integer> values) {
            addCriterion("LIVE_ID in", values, "liveId");
            return (Criteria) this;
        }

        public Criteria andLiveIdNotIn(List<Integer> values) {
            addCriterion("LIVE_ID not in", values, "liveId");
            return (Criteria) this;
        }

        public Criteria andLiveIdBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_ID between", value1, value2, "liveId");
            return (Criteria) this;
        }

        public Criteria andLiveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_ID not between", value1, value2, "liveId");
            return (Criteria) this;
        }

        public Criteria andLiveNameIsNull() {
            addCriterion("LIVE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLiveNameIsNotNull() {
            addCriterion("LIVE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLiveNameEqualTo(String value) {
            addCriterion("LIVE_NAME =", value, "liveName");
            return (Criteria) this;
        }

        public Criteria andLiveNameNotEqualTo(String value) {
            addCriterion("LIVE_NAME <>", value, "liveName");
            return (Criteria) this;
        }

        public Criteria andLiveNameGreaterThan(String value) {
            addCriterion("LIVE_NAME >", value, "liveName");
            return (Criteria) this;
        }

        public Criteria andLiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("LIVE_NAME >=", value, "liveName");
            return (Criteria) this;
        }

        public Criteria andLiveNameLessThan(String value) {
            addCriterion("LIVE_NAME <", value, "liveName");
            return (Criteria) this;
        }

        public Criteria andLiveNameLessThanOrEqualTo(String value) {
            addCriterion("LIVE_NAME <=", value, "liveName");
            return (Criteria) this;
        }

        public Criteria andLiveNameLike(String value) {
            addCriterion("LIVE_NAME like", value, "liveName");
            return (Criteria) this;
        }

        public Criteria andLiveNameNotLike(String value) {
            addCriterion("LIVE_NAME not like", value, "liveName");
            return (Criteria) this;
        }

        public Criteria andLiveNameIn(List<String> values) {
            addCriterion("LIVE_NAME in", values, "liveName");
            return (Criteria) this;
        }

        public Criteria andLiveNameNotIn(List<String> values) {
            addCriterion("LIVE_NAME not in", values, "liveName");
            return (Criteria) this;
        }

        public Criteria andLiveNameBetween(String value1, String value2) {
            addCriterion("LIVE_NAME between", value1, value2, "liveName");
            return (Criteria) this;
        }

        public Criteria andLiveNameNotBetween(String value1, String value2) {
            addCriterion("LIVE_NAME not between", value1, value2, "liveName");
            return (Criteria) this;
        }

        public Criteria andLiveTeacherNoIsNull() {
            addCriterion("LIVE_TEACHER_NO is null");
            return (Criteria) this;
        }

        public Criteria andLiveTeacherNoIsNotNull() {
            addCriterion("LIVE_TEACHER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLiveTeacherNoEqualTo(Integer value) {
            addCriterion("LIVE_TEACHER_NO =", value, "liveTeacherNo");
            return (Criteria) this;
        }

        public Criteria andLiveTeacherNoNotEqualTo(Integer value) {
            addCriterion("LIVE_TEACHER_NO <>", value, "liveTeacherNo");
            return (Criteria) this;
        }

        public Criteria andLiveTeacherNoGreaterThan(Integer value) {
            addCriterion("LIVE_TEACHER_NO >", value, "liveTeacherNo");
            return (Criteria) this;
        }

        public Criteria andLiveTeacherNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIVE_TEACHER_NO >=", value, "liveTeacherNo");
            return (Criteria) this;
        }

        public Criteria andLiveTeacherNoLessThan(Integer value) {
            addCriterion("LIVE_TEACHER_NO <", value, "liveTeacherNo");
            return (Criteria) this;
        }

        public Criteria andLiveTeacherNoLessThanOrEqualTo(Integer value) {
            addCriterion("LIVE_TEACHER_NO <=", value, "liveTeacherNo");
            return (Criteria) this;
        }

        public Criteria andLiveTeacherNoIn(List<Integer> values) {
            addCriterion("LIVE_TEACHER_NO in", values, "liveTeacherNo");
            return (Criteria) this;
        }

        public Criteria andLiveTeacherNoNotIn(List<Integer> values) {
            addCriterion("LIVE_TEACHER_NO not in", values, "liveTeacherNo");
            return (Criteria) this;
        }

        public Criteria andLiveTeacherNoBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_TEACHER_NO between", value1, value2, "liveTeacherNo");
            return (Criteria) this;
        }

        public Criteria andLiveTeacherNoNotBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_TEACHER_NO not between", value1, value2, "liveTeacherNo");
            return (Criteria) this;
        }

        public Criteria andLiveFlagIsNull() {
            addCriterion("LIVE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLiveFlagIsNotNull() {
            addCriterion("LIVE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLiveFlagEqualTo(String value) {
            addCriterion("LIVE_FLAG =", value, "liveFlag");
            return (Criteria) this;
        }

        public Criteria andLiveFlagNotEqualTo(String value) {
            addCriterion("LIVE_FLAG <>", value, "liveFlag");
            return (Criteria) this;
        }

        public Criteria andLiveFlagGreaterThan(String value) {
            addCriterion("LIVE_FLAG >", value, "liveFlag");
            return (Criteria) this;
        }

        public Criteria andLiveFlagGreaterThanOrEqualTo(String value) {
            addCriterion("LIVE_FLAG >=", value, "liveFlag");
            return (Criteria) this;
        }

        public Criteria andLiveFlagLessThan(String value) {
            addCriterion("LIVE_FLAG <", value, "liveFlag");
            return (Criteria) this;
        }

        public Criteria andLiveFlagLessThanOrEqualTo(String value) {
            addCriterion("LIVE_FLAG <=", value, "liveFlag");
            return (Criteria) this;
        }

        public Criteria andLiveFlagLike(String value) {
            addCriterion("LIVE_FLAG like", value, "liveFlag");
            return (Criteria) this;
        }

        public Criteria andLiveFlagNotLike(String value) {
            addCriterion("LIVE_FLAG not like", value, "liveFlag");
            return (Criteria) this;
        }

        public Criteria andLiveFlagIn(List<String> values) {
            addCriterion("LIVE_FLAG in", values, "liveFlag");
            return (Criteria) this;
        }

        public Criteria andLiveFlagNotIn(List<String> values) {
            addCriterion("LIVE_FLAG not in", values, "liveFlag");
            return (Criteria) this;
        }

        public Criteria andLiveFlagBetween(String value1, String value2) {
            addCriterion("LIVE_FLAG between", value1, value2, "liveFlag");
            return (Criteria) this;
        }

        public Criteria andLiveFlagNotBetween(String value1, String value2) {
            addCriterion("LIVE_FLAG not between", value1, value2, "liveFlag");
            return (Criteria) this;
        }

        public Criteria andLivePwdIsNull() {
            addCriterion("LIVE_PWD is null");
            return (Criteria) this;
        }

        public Criteria andLivePwdIsNotNull() {
            addCriterion("LIVE_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andLivePwdEqualTo(String value) {
            addCriterion("LIVE_PWD =", value, "livePwd");
            return (Criteria) this;
        }

        public Criteria andLivePwdNotEqualTo(String value) {
            addCriterion("LIVE_PWD <>", value, "livePwd");
            return (Criteria) this;
        }

        public Criteria andLivePwdGreaterThan(String value) {
            addCriterion("LIVE_PWD >", value, "livePwd");
            return (Criteria) this;
        }

        public Criteria andLivePwdGreaterThanOrEqualTo(String value) {
            addCriterion("LIVE_PWD >=", value, "livePwd");
            return (Criteria) this;
        }

        public Criteria andLivePwdLessThan(String value) {
            addCriterion("LIVE_PWD <", value, "livePwd");
            return (Criteria) this;
        }

        public Criteria andLivePwdLessThanOrEqualTo(String value) {
            addCriterion("LIVE_PWD <=", value, "livePwd");
            return (Criteria) this;
        }

        public Criteria andLivePwdLike(String value) {
            addCriterion("LIVE_PWD like", value, "livePwd");
            return (Criteria) this;
        }

        public Criteria andLivePwdNotLike(String value) {
            addCriterion("LIVE_PWD not like", value, "livePwd");
            return (Criteria) this;
        }

        public Criteria andLivePwdIn(List<String> values) {
            addCriterion("LIVE_PWD in", values, "livePwd");
            return (Criteria) this;
        }

        public Criteria andLivePwdNotIn(List<String> values) {
            addCriterion("LIVE_PWD not in", values, "livePwd");
            return (Criteria) this;
        }

        public Criteria andLivePwdBetween(String value1, String value2) {
            addCriterion("LIVE_PWD between", value1, value2, "livePwd");
            return (Criteria) this;
        }

        public Criteria andLivePwdNotBetween(String value1, String value2) {
            addCriterion("LIVE_PWD not between", value1, value2, "livePwd");
            return (Criteria) this;
        }

        public Criteria andLiveCostIsNull() {
            addCriterion("LIVE_COST is null");
            return (Criteria) this;
        }

        public Criteria andLiveCostIsNotNull() {
            addCriterion("LIVE_COST is not null");
            return (Criteria) this;
        }

        public Criteria andLiveCostEqualTo(Integer value) {
            addCriterion("LIVE_COST =", value, "liveCost");
            return (Criteria) this;
        }

        public Criteria andLiveCostNotEqualTo(Integer value) {
            addCriterion("LIVE_COST <>", value, "liveCost");
            return (Criteria) this;
        }

        public Criteria andLiveCostGreaterThan(Integer value) {
            addCriterion("LIVE_COST >", value, "liveCost");
            return (Criteria) this;
        }

        public Criteria andLiveCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIVE_COST >=", value, "liveCost");
            return (Criteria) this;
        }

        public Criteria andLiveCostLessThan(Integer value) {
            addCriterion("LIVE_COST <", value, "liveCost");
            return (Criteria) this;
        }

        public Criteria andLiveCostLessThanOrEqualTo(Integer value) {
            addCriterion("LIVE_COST <=", value, "liveCost");
            return (Criteria) this;
        }

        public Criteria andLiveCostIn(List<Integer> values) {
            addCriterion("LIVE_COST in", values, "liveCost");
            return (Criteria) this;
        }

        public Criteria andLiveCostNotIn(List<Integer> values) {
            addCriterion("LIVE_COST not in", values, "liveCost");
            return (Criteria) this;
        }

        public Criteria andLiveCostBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_COST between", value1, value2, "liveCost");
            return (Criteria) this;
        }

        public Criteria andLiveCostNotBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_COST not between", value1, value2, "liveCost");
            return (Criteria) this;
        }

        public Criteria andLiveCountIsNull() {
            addCriterion("LIVE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLiveCountIsNotNull() {
            addCriterion("LIVE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLiveCountEqualTo(Long value) {
            addCriterion("LIVE_COUNT =", value, "liveCount");
            return (Criteria) this;
        }

        public Criteria andLiveCountNotEqualTo(Long value) {
            addCriterion("LIVE_COUNT <>", value, "liveCount");
            return (Criteria) this;
        }

        public Criteria andLiveCountGreaterThan(Long value) {
            addCriterion("LIVE_COUNT >", value, "liveCount");
            return (Criteria) this;
        }

        public Criteria andLiveCountGreaterThanOrEqualTo(Long value) {
            addCriterion("LIVE_COUNT >=", value, "liveCount");
            return (Criteria) this;
        }

        public Criteria andLiveCountLessThan(Long value) {
            addCriterion("LIVE_COUNT <", value, "liveCount");
            return (Criteria) this;
        }

        public Criteria andLiveCountLessThanOrEqualTo(Long value) {
            addCriterion("LIVE_COUNT <=", value, "liveCount");
            return (Criteria) this;
        }

        public Criteria andLiveCountIn(List<Long> values) {
            addCriterion("LIVE_COUNT in", values, "liveCount");
            return (Criteria) this;
        }

        public Criteria andLiveCountNotIn(List<Long> values) {
            addCriterion("LIVE_COUNT not in", values, "liveCount");
            return (Criteria) this;
        }

        public Criteria andLiveCountBetween(Long value1, Long value2) {
            addCriterion("LIVE_COUNT between", value1, value2, "liveCount");
            return (Criteria) this;
        }

        public Criteria andLiveCountNotBetween(Long value1, Long value2) {
            addCriterion("LIVE_COUNT not between", value1, value2, "liveCount");
            return (Criteria) this;
        }

        public Criteria andLiveStatusIsNull() {
            addCriterion("LIVE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andLiveStatusIsNotNull() {
            addCriterion("LIVE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLiveStatusEqualTo(String value) {
            addCriterion("LIVE_STATUS =", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusNotEqualTo(String value) {
            addCriterion("LIVE_STATUS <>", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusGreaterThan(String value) {
            addCriterion("LIVE_STATUS >", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("LIVE_STATUS >=", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusLessThan(String value) {
            addCriterion("LIVE_STATUS <", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusLessThanOrEqualTo(String value) {
            addCriterion("LIVE_STATUS <=", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusLike(String value) {
            addCriterion("LIVE_STATUS like", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusNotLike(String value) {
            addCriterion("LIVE_STATUS not like", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusIn(List<String> values) {
            addCriterion("LIVE_STATUS in", values, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusNotIn(List<String> values) {
            addCriterion("LIVE_STATUS not in", values, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusBetween(String value1, String value2) {
            addCriterion("LIVE_STATUS between", value1, value2, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusNotBetween(String value1, String value2) {
            addCriterion("LIVE_STATUS not between", value1, value2, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveRegtimeIsNull() {
            addCriterion("LIVE_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andLiveRegtimeIsNotNull() {
            addCriterion("LIVE_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLiveRegtimeEqualTo(Date value) {
            addCriterion("LIVE_REGTIME =", value, "liveRegtime");
            return (Criteria) this;
        }

        public Criteria andLiveRegtimeNotEqualTo(Date value) {
            addCriterion("LIVE_REGTIME <>", value, "liveRegtime");
            return (Criteria) this;
        }

        public Criteria andLiveRegtimeGreaterThan(Date value) {
            addCriterion("LIVE_REGTIME >", value, "liveRegtime");
            return (Criteria) this;
        }

        public Criteria andLiveRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LIVE_REGTIME >=", value, "liveRegtime");
            return (Criteria) this;
        }

        public Criteria andLiveRegtimeLessThan(Date value) {
            addCriterion("LIVE_REGTIME <", value, "liveRegtime");
            return (Criteria) this;
        }

        public Criteria andLiveRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("LIVE_REGTIME <=", value, "liveRegtime");
            return (Criteria) this;
        }

        public Criteria andLiveRegtimeIn(List<Date> values) {
            addCriterion("LIVE_REGTIME in", values, "liveRegtime");
            return (Criteria) this;
        }

        public Criteria andLiveRegtimeNotIn(List<Date> values) {
            addCriterion("LIVE_REGTIME not in", values, "liveRegtime");
            return (Criteria) this;
        }

        public Criteria andLiveRegtimeBetween(Date value1, Date value2) {
            addCriterion("LIVE_REGTIME between", value1, value2, "liveRegtime");
            return (Criteria) this;
        }

        public Criteria andLiveRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("LIVE_REGTIME not between", value1, value2, "liveRegtime");
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