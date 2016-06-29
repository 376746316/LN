package com.chinasofti.cetp.gensee.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenseeKeyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GenseeKeyExample() {
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

        public Criteria andGenseeKeyIdIsNull() {
            addCriterion("GENSEE_KEY_ID is null");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyIdIsNotNull() {
            addCriterion("GENSEE_KEY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyIdEqualTo(Long value) {
            addCriterion("GENSEE_KEY_ID =", value, "genseeKeyId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyIdNotEqualTo(Long value) {
            addCriterion("GENSEE_KEY_ID <>", value, "genseeKeyId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyIdGreaterThan(Long value) {
            addCriterion("GENSEE_KEY_ID >", value, "genseeKeyId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GENSEE_KEY_ID >=", value, "genseeKeyId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyIdLessThan(Long value) {
            addCriterion("GENSEE_KEY_ID <", value, "genseeKeyId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyIdLessThanOrEqualTo(Long value) {
            addCriterion("GENSEE_KEY_ID <=", value, "genseeKeyId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyIdIn(List<Long> values) {
            addCriterion("GENSEE_KEY_ID in", values, "genseeKeyId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyIdNotIn(List<Long> values) {
            addCriterion("GENSEE_KEY_ID not in", values, "genseeKeyId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyIdBetween(Long value1, Long value2) {
            addCriterion("GENSEE_KEY_ID between", value1, value2, "genseeKeyId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyIdNotBetween(Long value1, Long value2) {
            addCriterion("GENSEE_KEY_ID not between", value1, value2, "genseeKeyId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyIsNull() {
            addCriterion("GENSEE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyIsNotNull() {
            addCriterion("GENSEE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyEqualTo(String value) {
            addCriterion("GENSEE_KEY =", value, "genseeKey");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyNotEqualTo(String value) {
            addCriterion("GENSEE_KEY <>", value, "genseeKey");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyGreaterThan(String value) {
            addCriterion("GENSEE_KEY >", value, "genseeKey");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyGreaterThanOrEqualTo(String value) {
            addCriterion("GENSEE_KEY >=", value, "genseeKey");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyLessThan(String value) {
            addCriterion("GENSEE_KEY <", value, "genseeKey");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyLessThanOrEqualTo(String value) {
            addCriterion("GENSEE_KEY <=", value, "genseeKey");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyLike(String value) {
            addCriterion("GENSEE_KEY like", value, "genseeKey");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyNotLike(String value) {
            addCriterion("GENSEE_KEY not like", value, "genseeKey");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyIn(List<String> values) {
            addCriterion("GENSEE_KEY in", values, "genseeKey");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyNotIn(List<String> values) {
            addCriterion("GENSEE_KEY not in", values, "genseeKey");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyBetween(String value1, String value2) {
            addCriterion("GENSEE_KEY between", value1, value2, "genseeKey");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyNotBetween(String value1, String value2) {
            addCriterion("GENSEE_KEY not between", value1, value2, "genseeKey");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyUserNoIsNull() {
            addCriterion("GENSEE_KEY_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyUserNoIsNotNull() {
            addCriterion("GENSEE_KEY_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyUserNoEqualTo(Integer value) {
            addCriterion("GENSEE_KEY_USER_NO =", value, "genseeKeyUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyUserNoNotEqualTo(Integer value) {
            addCriterion("GENSEE_KEY_USER_NO <>", value, "genseeKeyUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyUserNoGreaterThan(Integer value) {
            addCriterion("GENSEE_KEY_USER_NO >", value, "genseeKeyUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("GENSEE_KEY_USER_NO >=", value, "genseeKeyUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyUserNoLessThan(Integer value) {
            addCriterion("GENSEE_KEY_USER_NO <", value, "genseeKeyUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("GENSEE_KEY_USER_NO <=", value, "genseeKeyUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyUserNoIn(List<Integer> values) {
            addCriterion("GENSEE_KEY_USER_NO in", values, "genseeKeyUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyUserNoNotIn(List<Integer> values) {
            addCriterion("GENSEE_KEY_USER_NO not in", values, "genseeKeyUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyUserNoBetween(Integer value1, Integer value2) {
            addCriterion("GENSEE_KEY_USER_NO between", value1, value2, "genseeKeyUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("GENSEE_KEY_USER_NO not between", value1, value2, "genseeKeyUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyRoomIdIsNull() {
            addCriterion("GENSEE_KEY_ROOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyRoomIdIsNotNull() {
            addCriterion("GENSEE_KEY_ROOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyRoomIdEqualTo(String value) {
            addCriterion("GENSEE_KEY_ROOM_ID =", value, "genseeKeyRoomId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyRoomIdNotEqualTo(String value) {
            addCriterion("GENSEE_KEY_ROOM_ID <>", value, "genseeKeyRoomId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyRoomIdGreaterThan(String value) {
            addCriterion("GENSEE_KEY_ROOM_ID >", value, "genseeKeyRoomId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("GENSEE_KEY_ROOM_ID >=", value, "genseeKeyRoomId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyRoomIdLessThan(String value) {
            addCriterion("GENSEE_KEY_ROOM_ID <", value, "genseeKeyRoomId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyRoomIdLessThanOrEqualTo(String value) {
            addCriterion("GENSEE_KEY_ROOM_ID <=", value, "genseeKeyRoomId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyRoomIdLike(String value) {
            addCriterion("GENSEE_KEY_ROOM_ID like", value, "genseeKeyRoomId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyRoomIdNotLike(String value) {
            addCriterion("GENSEE_KEY_ROOM_ID not like", value, "genseeKeyRoomId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyRoomIdIn(List<String> values) {
            addCriterion("GENSEE_KEY_ROOM_ID in", values, "genseeKeyRoomId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyRoomIdNotIn(List<String> values) {
            addCriterion("GENSEE_KEY_ROOM_ID not in", values, "genseeKeyRoomId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyRoomIdBetween(String value1, String value2) {
            addCriterion("GENSEE_KEY_ROOM_ID between", value1, value2, "genseeKeyRoomId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyRoomIdNotBetween(String value1, String value2) {
            addCriterion("GENSEE_KEY_ROOM_ID not between", value1, value2, "genseeKeyRoomId");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyStartTimeIsNull() {
            addCriterion("GENSEE_KEY_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyStartTimeIsNotNull() {
            addCriterion("GENSEE_KEY_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyStartTimeEqualTo(Date value) {
            addCriterion("GENSEE_KEY_START_TIME =", value, "genseeKeyStartTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyStartTimeNotEqualTo(Date value) {
            addCriterion("GENSEE_KEY_START_TIME <>", value, "genseeKeyStartTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyStartTimeGreaterThan(Date value) {
            addCriterion("GENSEE_KEY_START_TIME >", value, "genseeKeyStartTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GENSEE_KEY_START_TIME >=", value, "genseeKeyStartTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyStartTimeLessThan(Date value) {
            addCriterion("GENSEE_KEY_START_TIME <", value, "genseeKeyStartTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("GENSEE_KEY_START_TIME <=", value, "genseeKeyStartTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyStartTimeIn(List<Date> values) {
            addCriterion("GENSEE_KEY_START_TIME in", values, "genseeKeyStartTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyStartTimeNotIn(List<Date> values) {
            addCriterion("GENSEE_KEY_START_TIME not in", values, "genseeKeyStartTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyStartTimeBetween(Date value1, Date value2) {
            addCriterion("GENSEE_KEY_START_TIME between", value1, value2, "genseeKeyStartTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("GENSEE_KEY_START_TIME not between", value1, value2, "genseeKeyStartTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyEndTimeIsNull() {
            addCriterion("GENSEE_KEY_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyEndTimeIsNotNull() {
            addCriterion("GENSEE_KEY_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyEndTimeEqualTo(Date value) {
            addCriterion("GENSEE_KEY_END_TIME =", value, "genseeKeyEndTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyEndTimeNotEqualTo(Date value) {
            addCriterion("GENSEE_KEY_END_TIME <>", value, "genseeKeyEndTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyEndTimeGreaterThan(Date value) {
            addCriterion("GENSEE_KEY_END_TIME >", value, "genseeKeyEndTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GENSEE_KEY_END_TIME >=", value, "genseeKeyEndTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyEndTimeLessThan(Date value) {
            addCriterion("GENSEE_KEY_END_TIME <", value, "genseeKeyEndTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("GENSEE_KEY_END_TIME <=", value, "genseeKeyEndTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyEndTimeIn(List<Date> values) {
            addCriterion("GENSEE_KEY_END_TIME in", values, "genseeKeyEndTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyEndTimeNotIn(List<Date> values) {
            addCriterion("GENSEE_KEY_END_TIME not in", values, "genseeKeyEndTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyEndTimeBetween(Date value1, Date value2) {
            addCriterion("GENSEE_KEY_END_TIME between", value1, value2, "genseeKeyEndTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("GENSEE_KEY_END_TIME not between", value1, value2, "genseeKeyEndTime");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyFlagIsNull() {
            addCriterion("GENSEE_KEY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyFlagIsNotNull() {
            addCriterion("GENSEE_KEY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyFlagEqualTo(String value) {
            addCriterion("GENSEE_KEY_FLAG =", value, "genseeKeyFlag");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyFlagNotEqualTo(String value) {
            addCriterion("GENSEE_KEY_FLAG <>", value, "genseeKeyFlag");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyFlagGreaterThan(String value) {
            addCriterion("GENSEE_KEY_FLAG >", value, "genseeKeyFlag");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyFlagGreaterThanOrEqualTo(String value) {
            addCriterion("GENSEE_KEY_FLAG >=", value, "genseeKeyFlag");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyFlagLessThan(String value) {
            addCriterion("GENSEE_KEY_FLAG <", value, "genseeKeyFlag");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyFlagLessThanOrEqualTo(String value) {
            addCriterion("GENSEE_KEY_FLAG <=", value, "genseeKeyFlag");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyFlagLike(String value) {
            addCriterion("GENSEE_KEY_FLAG like", value, "genseeKeyFlag");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyFlagNotLike(String value) {
            addCriterion("GENSEE_KEY_FLAG not like", value, "genseeKeyFlag");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyFlagIn(List<String> values) {
            addCriterion("GENSEE_KEY_FLAG in", values, "genseeKeyFlag");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyFlagNotIn(List<String> values) {
            addCriterion("GENSEE_KEY_FLAG not in", values, "genseeKeyFlag");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyFlagBetween(String value1, String value2) {
            addCriterion("GENSEE_KEY_FLAG between", value1, value2, "genseeKeyFlag");
            return (Criteria) this;
        }

        public Criteria andGenseeKeyFlagNotBetween(String value1, String value2) {
            addCriterion("GENSEE_KEY_FLAG not between", value1, value2, "genseeKeyFlag");
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