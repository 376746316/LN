package com.chinasofti.cetp.admin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMsgIdIsNull() {
            addCriterion("MSG_ID is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("MSG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(Long value) {
            addCriterion("MSG_ID =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(Long value) {
            addCriterion("MSG_ID <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(Long value) {
            addCriterion("MSG_ID >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MSG_ID >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(Long value) {
            addCriterion("MSG_ID <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(Long value) {
            addCriterion("MSG_ID <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<Long> values) {
            addCriterion("MSG_ID in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<Long> values) {
            addCriterion("MSG_ID not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(Long value1, Long value2) {
            addCriterion("MSG_ID between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(Long value1, Long value2) {
            addCriterion("MSG_ID not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNull() {
            addCriterion("MSG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("MSG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(String value) {
            addCriterion("MSG_TYPE =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(String value) {
            addCriterion("MSG_TYPE <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(String value) {
            addCriterion("MSG_TYPE >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_TYPE >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(String value) {
            addCriterion("MSG_TYPE <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(String value) {
            addCriterion("MSG_TYPE <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLike(String value) {
            addCriterion("MSG_TYPE like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotLike(String value) {
            addCriterion("MSG_TYPE not like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<String> values) {
            addCriterion("MSG_TYPE in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<String> values) {
            addCriterion("MSG_TYPE not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(String value1, String value2) {
            addCriterion("MSG_TYPE between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(String value1, String value2) {
            addCriterion("MSG_TYPE not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNull() {
            addCriterion("MSG_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNotNull() {
            addCriterion("MSG_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andMsgContentEqualTo(String value) {
            addCriterion("MSG_CONTENT =", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotEqualTo(String value) {
            addCriterion("MSG_CONTENT <>", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThan(String value) {
            addCriterion("MSG_CONTENT >", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_CONTENT >=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThan(String value) {
            addCriterion("MSG_CONTENT <", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThanOrEqualTo(String value) {
            addCriterion("MSG_CONTENT <=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLike(String value) {
            addCriterion("MSG_CONTENT like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotLike(String value) {
            addCriterion("MSG_CONTENT not like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentIn(List<String> values) {
            addCriterion("MSG_CONTENT in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotIn(List<String> values) {
            addCriterion("MSG_CONTENT not in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentBetween(String value1, String value2) {
            addCriterion("MSG_CONTENT between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotBetween(String value1, String value2) {
            addCriterion("MSG_CONTENT not between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgStuNoIsNull() {
            addCriterion("MSG_STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andMsgStuNoIsNotNull() {
            addCriterion("MSG_STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMsgStuNoEqualTo(Integer value) {
            addCriterion("MSG_STU_NO =", value, "msgStuNo");
            return (Criteria) this;
        }

        public Criteria andMsgStuNoNotEqualTo(Integer value) {
            addCriterion("MSG_STU_NO <>", value, "msgStuNo");
            return (Criteria) this;
        }

        public Criteria andMsgStuNoGreaterThan(Integer value) {
            addCriterion("MSG_STU_NO >", value, "msgStuNo");
            return (Criteria) this;
        }

        public Criteria andMsgStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("MSG_STU_NO >=", value, "msgStuNo");
            return (Criteria) this;
        }

        public Criteria andMsgStuNoLessThan(Integer value) {
            addCriterion("MSG_STU_NO <", value, "msgStuNo");
            return (Criteria) this;
        }

        public Criteria andMsgStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("MSG_STU_NO <=", value, "msgStuNo");
            return (Criteria) this;
        }

        public Criteria andMsgStuNoIn(List<Integer> values) {
            addCriterion("MSG_STU_NO in", values, "msgStuNo");
            return (Criteria) this;
        }

        public Criteria andMsgStuNoNotIn(List<Integer> values) {
            addCriterion("MSG_STU_NO not in", values, "msgStuNo");
            return (Criteria) this;
        }

        public Criteria andMsgStuNoBetween(Integer value1, Integer value2) {
            addCriterion("MSG_STU_NO between", value1, value2, "msgStuNo");
            return (Criteria) this;
        }

        public Criteria andMsgStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("MSG_STU_NO not between", value1, value2, "msgStuNo");
            return (Criteria) this;
        }

        public Criteria andMsgUserNoIsNull() {
            addCriterion("MSG_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andMsgUserNoIsNotNull() {
            addCriterion("MSG_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMsgUserNoEqualTo(Integer value) {
            addCriterion("MSG_USER_NO =", value, "msgUserNo");
            return (Criteria) this;
        }

        public Criteria andMsgUserNoNotEqualTo(Integer value) {
            addCriterion("MSG_USER_NO <>", value, "msgUserNo");
            return (Criteria) this;
        }

        public Criteria andMsgUserNoGreaterThan(Integer value) {
            addCriterion("MSG_USER_NO >", value, "msgUserNo");
            return (Criteria) this;
        }

        public Criteria andMsgUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("MSG_USER_NO >=", value, "msgUserNo");
            return (Criteria) this;
        }

        public Criteria andMsgUserNoLessThan(Integer value) {
            addCriterion("MSG_USER_NO <", value, "msgUserNo");
            return (Criteria) this;
        }

        public Criteria andMsgUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("MSG_USER_NO <=", value, "msgUserNo");
            return (Criteria) this;
        }

        public Criteria andMsgUserNoIn(List<Integer> values) {
            addCriterion("MSG_USER_NO in", values, "msgUserNo");
            return (Criteria) this;
        }

        public Criteria andMsgUserNoNotIn(List<Integer> values) {
            addCriterion("MSG_USER_NO not in", values, "msgUserNo");
            return (Criteria) this;
        }

        public Criteria andMsgUserNoBetween(Integer value1, Integer value2) {
            addCriterion("MSG_USER_NO between", value1, value2, "msgUserNo");
            return (Criteria) this;
        }

        public Criteria andMsgUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("MSG_USER_NO not between", value1, value2, "msgUserNo");
            return (Criteria) this;
        }

        public Criteria andMsgStatusIsNull() {
            addCriterion("MSG_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMsgStatusIsNotNull() {
            addCriterion("MSG_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMsgStatusEqualTo(String value) {
            addCriterion("MSG_STATUS =", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusNotEqualTo(String value) {
            addCriterion("MSG_STATUS <>", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusGreaterThan(String value) {
            addCriterion("MSG_STATUS >", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_STATUS >=", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusLessThan(String value) {
            addCriterion("MSG_STATUS <", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusLessThanOrEqualTo(String value) {
            addCriterion("MSG_STATUS <=", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusLike(String value) {
            addCriterion("MSG_STATUS like", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusNotLike(String value) {
            addCriterion("MSG_STATUS not like", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusIn(List<String> values) {
            addCriterion("MSG_STATUS in", values, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusNotIn(List<String> values) {
            addCriterion("MSG_STATUS not in", values, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusBetween(String value1, String value2) {
            addCriterion("MSG_STATUS between", value1, value2, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusNotBetween(String value1, String value2) {
            addCriterion("MSG_STATUS not between", value1, value2, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgTimeIsNull() {
            addCriterion("MSG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMsgTimeIsNotNull() {
            addCriterion("MSG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTimeEqualTo(Date value) {
            addCriterion("MSG_TIME =", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeNotEqualTo(Date value) {
            addCriterion("MSG_TIME <>", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeGreaterThan(Date value) {
            addCriterion("MSG_TIME >", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MSG_TIME >=", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeLessThan(Date value) {
            addCriterion("MSG_TIME <", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeLessThanOrEqualTo(Date value) {
            addCriterion("MSG_TIME <=", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeIn(List<Date> values) {
            addCriterion("MSG_TIME in", values, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeNotIn(List<Date> values) {
            addCriterion("MSG_TIME not in", values, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeBetween(Date value1, Date value2) {
            addCriterion("MSG_TIME between", value1, value2, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeNotBetween(Date value1, Date value2) {
            addCriterion("MSG_TIME not between", value1, value2, "msgTime");
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