package com.chinasofti.cetp.live.model;

import java.util.ArrayList;
import java.util.List;

public class LiveChapterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiveChapterExample() {
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

        public Criteria andLiveChapIdIsNull() {
            addCriterion("LIVE_CHAP_ID is null");
            return (Criteria) this;
        }

        public Criteria andLiveChapIdIsNotNull() {
            addCriterion("LIVE_CHAP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLiveChapIdEqualTo(Integer value) {
            addCriterion("LIVE_CHAP_ID =", value, "liveChapId");
            return (Criteria) this;
        }

        public Criteria andLiveChapIdNotEqualTo(Integer value) {
            addCriterion("LIVE_CHAP_ID <>", value, "liveChapId");
            return (Criteria) this;
        }

        public Criteria andLiveChapIdGreaterThan(Integer value) {
            addCriterion("LIVE_CHAP_ID >", value, "liveChapId");
            return (Criteria) this;
        }

        public Criteria andLiveChapIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIVE_CHAP_ID >=", value, "liveChapId");
            return (Criteria) this;
        }

        public Criteria andLiveChapIdLessThan(Integer value) {
            addCriterion("LIVE_CHAP_ID <", value, "liveChapId");
            return (Criteria) this;
        }

        public Criteria andLiveChapIdLessThanOrEqualTo(Integer value) {
            addCriterion("LIVE_CHAP_ID <=", value, "liveChapId");
            return (Criteria) this;
        }

        public Criteria andLiveChapIdIn(List<Integer> values) {
            addCriterion("LIVE_CHAP_ID in", values, "liveChapId");
            return (Criteria) this;
        }

        public Criteria andLiveChapIdNotIn(List<Integer> values) {
            addCriterion("LIVE_CHAP_ID not in", values, "liveChapId");
            return (Criteria) this;
        }

        public Criteria andLiveChapIdBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_CHAP_ID between", value1, value2, "liveChapId");
            return (Criteria) this;
        }

        public Criteria andLiveChapIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_CHAP_ID not between", value1, value2, "liveChapId");
            return (Criteria) this;
        }

        public Criteria andLiveChapNameIsNull() {
            addCriterion("LIVE_CHAP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLiveChapNameIsNotNull() {
            addCriterion("LIVE_CHAP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLiveChapNameEqualTo(String value) {
            addCriterion("LIVE_CHAP_NAME =", value, "liveChapName");
            return (Criteria) this;
        }

        public Criteria andLiveChapNameNotEqualTo(String value) {
            addCriterion("LIVE_CHAP_NAME <>", value, "liveChapName");
            return (Criteria) this;
        }

        public Criteria andLiveChapNameGreaterThan(String value) {
            addCriterion("LIVE_CHAP_NAME >", value, "liveChapName");
            return (Criteria) this;
        }

        public Criteria andLiveChapNameGreaterThanOrEqualTo(String value) {
            addCriterion("LIVE_CHAP_NAME >=", value, "liveChapName");
            return (Criteria) this;
        }

        public Criteria andLiveChapNameLessThan(String value) {
            addCriterion("LIVE_CHAP_NAME <", value, "liveChapName");
            return (Criteria) this;
        }

        public Criteria andLiveChapNameLessThanOrEqualTo(String value) {
            addCriterion("LIVE_CHAP_NAME <=", value, "liveChapName");
            return (Criteria) this;
        }

        public Criteria andLiveChapNameLike(String value) {
            addCriterion("LIVE_CHAP_NAME like", value, "liveChapName");
            return (Criteria) this;
        }

        public Criteria andLiveChapNameNotLike(String value) {
            addCriterion("LIVE_CHAP_NAME not like", value, "liveChapName");
            return (Criteria) this;
        }

        public Criteria andLiveChapNameIn(List<String> values) {
            addCriterion("LIVE_CHAP_NAME in", values, "liveChapName");
            return (Criteria) this;
        }

        public Criteria andLiveChapNameNotIn(List<String> values) {
            addCriterion("LIVE_CHAP_NAME not in", values, "liveChapName");
            return (Criteria) this;
        }

        public Criteria andLiveChapNameBetween(String value1, String value2) {
            addCriterion("LIVE_CHAP_NAME between", value1, value2, "liveChapName");
            return (Criteria) this;
        }

        public Criteria andLiveChapNameNotBetween(String value1, String value2) {
            addCriterion("LIVE_CHAP_NAME not between", value1, value2, "liveChapName");
            return (Criteria) this;
        }

        public Criteria andLiveChapClassIdIsNull() {
            addCriterion("LIVE_CHAP_CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andLiveChapClassIdIsNotNull() {
            addCriterion("LIVE_CHAP_CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLiveChapClassIdEqualTo(Integer value) {
            addCriterion("LIVE_CHAP_CLASS_ID =", value, "liveChapClassId");
            return (Criteria) this;
        }

        public Criteria andLiveChapClassIdNotEqualTo(Integer value) {
            addCriterion("LIVE_CHAP_CLASS_ID <>", value, "liveChapClassId");
            return (Criteria) this;
        }

        public Criteria andLiveChapClassIdGreaterThan(Integer value) {
            addCriterion("LIVE_CHAP_CLASS_ID >", value, "liveChapClassId");
            return (Criteria) this;
        }

        public Criteria andLiveChapClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIVE_CHAP_CLASS_ID >=", value, "liveChapClassId");
            return (Criteria) this;
        }

        public Criteria andLiveChapClassIdLessThan(Integer value) {
            addCriterion("LIVE_CHAP_CLASS_ID <", value, "liveChapClassId");
            return (Criteria) this;
        }

        public Criteria andLiveChapClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("LIVE_CHAP_CLASS_ID <=", value, "liveChapClassId");
            return (Criteria) this;
        }

        public Criteria andLiveChapClassIdIn(List<Integer> values) {
            addCriterion("LIVE_CHAP_CLASS_ID in", values, "liveChapClassId");
            return (Criteria) this;
        }

        public Criteria andLiveChapClassIdNotIn(List<Integer> values) {
            addCriterion("LIVE_CHAP_CLASS_ID not in", values, "liveChapClassId");
            return (Criteria) this;
        }

        public Criteria andLiveChapClassIdBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_CHAP_CLASS_ID between", value1, value2, "liveChapClassId");
            return (Criteria) this;
        }

        public Criteria andLiveChapClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_CHAP_CLASS_ID not between", value1, value2, "liveChapClassId");
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