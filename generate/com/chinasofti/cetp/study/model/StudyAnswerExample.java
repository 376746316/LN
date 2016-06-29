package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudyAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudyAnswerExample() {
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

        public Criteria andSaAnswerIdIsNull() {
            addCriterion("SA_ANSWER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaAnswerIdIsNotNull() {
            addCriterion("SA_ANSWER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaAnswerIdEqualTo(Integer value) {
            addCriterion("SA_ANSWER_ID =", value, "saAnswerId");
            return (Criteria) this;
        }

        public Criteria andSaAnswerIdNotEqualTo(Integer value) {
            addCriterion("SA_ANSWER_ID <>", value, "saAnswerId");
            return (Criteria) this;
        }

        public Criteria andSaAnswerIdGreaterThan(Integer value) {
            addCriterion("SA_ANSWER_ID >", value, "saAnswerId");
            return (Criteria) this;
        }

        public Criteria andSaAnswerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SA_ANSWER_ID >=", value, "saAnswerId");
            return (Criteria) this;
        }

        public Criteria andSaAnswerIdLessThan(Integer value) {
            addCriterion("SA_ANSWER_ID <", value, "saAnswerId");
            return (Criteria) this;
        }

        public Criteria andSaAnswerIdLessThanOrEqualTo(Integer value) {
            addCriterion("SA_ANSWER_ID <=", value, "saAnswerId");
            return (Criteria) this;
        }

        public Criteria andSaAnswerIdIn(List<Integer> values) {
            addCriterion("SA_ANSWER_ID in", values, "saAnswerId");
            return (Criteria) this;
        }

        public Criteria andSaAnswerIdNotIn(List<Integer> values) {
            addCriterion("SA_ANSWER_ID not in", values, "saAnswerId");
            return (Criteria) this;
        }

        public Criteria andSaAnswerIdBetween(Integer value1, Integer value2) {
            addCriterion("SA_ANSWER_ID between", value1, value2, "saAnswerId");
            return (Criteria) this;
        }

        public Criteria andSaAnswerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SA_ANSWER_ID not between", value1, value2, "saAnswerId");
            return (Criteria) this;
        }

        public Criteria andSaQuestionIdIsNull() {
            addCriterion("SA_QUESTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaQuestionIdIsNotNull() {
            addCriterion("SA_QUESTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaQuestionIdEqualTo(Integer value) {
            addCriterion("SA_QUESTION_ID =", value, "saQuestionId");
            return (Criteria) this;
        }

        public Criteria andSaQuestionIdNotEqualTo(Integer value) {
            addCriterion("SA_QUESTION_ID <>", value, "saQuestionId");
            return (Criteria) this;
        }

        public Criteria andSaQuestionIdGreaterThan(Integer value) {
            addCriterion("SA_QUESTION_ID >", value, "saQuestionId");
            return (Criteria) this;
        }

        public Criteria andSaQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SA_QUESTION_ID >=", value, "saQuestionId");
            return (Criteria) this;
        }

        public Criteria andSaQuestionIdLessThan(Integer value) {
            addCriterion("SA_QUESTION_ID <", value, "saQuestionId");
            return (Criteria) this;
        }

        public Criteria andSaQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("SA_QUESTION_ID <=", value, "saQuestionId");
            return (Criteria) this;
        }

        public Criteria andSaQuestionIdIn(List<Integer> values) {
            addCriterion("SA_QUESTION_ID in", values, "saQuestionId");
            return (Criteria) this;
        }

        public Criteria andSaQuestionIdNotIn(List<Integer> values) {
            addCriterion("SA_QUESTION_ID not in", values, "saQuestionId");
            return (Criteria) this;
        }

        public Criteria andSaQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("SA_QUESTION_ID between", value1, value2, "saQuestionId");
            return (Criteria) this;
        }

        public Criteria andSaQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SA_QUESTION_ID not between", value1, value2, "saQuestionId");
            return (Criteria) this;
        }

        public Criteria andSaAnswerUserIsNull() {
            addCriterion("SA_ANSWER_USER is null");
            return (Criteria) this;
        }

        public Criteria andSaAnswerUserIsNotNull() {
            addCriterion("SA_ANSWER_USER is not null");
            return (Criteria) this;
        }

        public Criteria andSaAnswerUserEqualTo(Integer value) {
            addCriterion("SA_ANSWER_USER =", value, "saAnswerUser");
            return (Criteria) this;
        }

        public Criteria andSaAnswerUserNotEqualTo(Integer value) {
            addCriterion("SA_ANSWER_USER <>", value, "saAnswerUser");
            return (Criteria) this;
        }

        public Criteria andSaAnswerUserGreaterThan(Integer value) {
            addCriterion("SA_ANSWER_USER >", value, "saAnswerUser");
            return (Criteria) this;
        }

        public Criteria andSaAnswerUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("SA_ANSWER_USER >=", value, "saAnswerUser");
            return (Criteria) this;
        }

        public Criteria andSaAnswerUserLessThan(Integer value) {
            addCriterion("SA_ANSWER_USER <", value, "saAnswerUser");
            return (Criteria) this;
        }

        public Criteria andSaAnswerUserLessThanOrEqualTo(Integer value) {
            addCriterion("SA_ANSWER_USER <=", value, "saAnswerUser");
            return (Criteria) this;
        }

        public Criteria andSaAnswerUserIn(List<Integer> values) {
            addCriterion("SA_ANSWER_USER in", values, "saAnswerUser");
            return (Criteria) this;
        }

        public Criteria andSaAnswerUserNotIn(List<Integer> values) {
            addCriterion("SA_ANSWER_USER not in", values, "saAnswerUser");
            return (Criteria) this;
        }

        public Criteria andSaAnswerUserBetween(Integer value1, Integer value2) {
            addCriterion("SA_ANSWER_USER between", value1, value2, "saAnswerUser");
            return (Criteria) this;
        }

        public Criteria andSaAnswerUserNotBetween(Integer value1, Integer value2) {
            addCriterion("SA_ANSWER_USER not between", value1, value2, "saAnswerUser");
            return (Criteria) this;
        }

        public Criteria andSaAnswerRoleIsNull() {
            addCriterion("SA_ANSWER_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andSaAnswerRoleIsNotNull() {
            addCriterion("SA_ANSWER_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andSaAnswerRoleEqualTo(String value) {
            addCriterion("SA_ANSWER_ROLE =", value, "saAnswerRole");
            return (Criteria) this;
        }

        public Criteria andSaAnswerRoleNotEqualTo(String value) {
            addCriterion("SA_ANSWER_ROLE <>", value, "saAnswerRole");
            return (Criteria) this;
        }

        public Criteria andSaAnswerRoleGreaterThan(String value) {
            addCriterion("SA_ANSWER_ROLE >", value, "saAnswerRole");
            return (Criteria) this;
        }

        public Criteria andSaAnswerRoleGreaterThanOrEqualTo(String value) {
            addCriterion("SA_ANSWER_ROLE >=", value, "saAnswerRole");
            return (Criteria) this;
        }

        public Criteria andSaAnswerRoleLessThan(String value) {
            addCriterion("SA_ANSWER_ROLE <", value, "saAnswerRole");
            return (Criteria) this;
        }

        public Criteria andSaAnswerRoleLessThanOrEqualTo(String value) {
            addCriterion("SA_ANSWER_ROLE <=", value, "saAnswerRole");
            return (Criteria) this;
        }

        public Criteria andSaAnswerRoleLike(String value) {
            addCriterion("SA_ANSWER_ROLE like", value, "saAnswerRole");
            return (Criteria) this;
        }

        public Criteria andSaAnswerRoleNotLike(String value) {
            addCriterion("SA_ANSWER_ROLE not like", value, "saAnswerRole");
            return (Criteria) this;
        }

        public Criteria andSaAnswerRoleIn(List<String> values) {
            addCriterion("SA_ANSWER_ROLE in", values, "saAnswerRole");
            return (Criteria) this;
        }

        public Criteria andSaAnswerRoleNotIn(List<String> values) {
            addCriterion("SA_ANSWER_ROLE not in", values, "saAnswerRole");
            return (Criteria) this;
        }

        public Criteria andSaAnswerRoleBetween(String value1, String value2) {
            addCriterion("SA_ANSWER_ROLE between", value1, value2, "saAnswerRole");
            return (Criteria) this;
        }

        public Criteria andSaAnswerRoleNotBetween(String value1, String value2) {
            addCriterion("SA_ANSWER_ROLE not between", value1, value2, "saAnswerRole");
            return (Criteria) this;
        }

        public Criteria andSaReplyAttachIsNull() {
            addCriterion("SA_REPLY_ATTACH is null");
            return (Criteria) this;
        }

        public Criteria andSaReplyAttachIsNotNull() {
            addCriterion("SA_REPLY_ATTACH is not null");
            return (Criteria) this;
        }

        public Criteria andSaReplyAttachEqualTo(String value) {
            addCriterion("SA_REPLY_ATTACH =", value, "saReplyAttach");
            return (Criteria) this;
        }

        public Criteria andSaReplyAttachNotEqualTo(String value) {
            addCriterion("SA_REPLY_ATTACH <>", value, "saReplyAttach");
            return (Criteria) this;
        }

        public Criteria andSaReplyAttachGreaterThan(String value) {
            addCriterion("SA_REPLY_ATTACH >", value, "saReplyAttach");
            return (Criteria) this;
        }

        public Criteria andSaReplyAttachGreaterThanOrEqualTo(String value) {
            addCriterion("SA_REPLY_ATTACH >=", value, "saReplyAttach");
            return (Criteria) this;
        }

        public Criteria andSaReplyAttachLessThan(String value) {
            addCriterion("SA_REPLY_ATTACH <", value, "saReplyAttach");
            return (Criteria) this;
        }

        public Criteria andSaReplyAttachLessThanOrEqualTo(String value) {
            addCriterion("SA_REPLY_ATTACH <=", value, "saReplyAttach");
            return (Criteria) this;
        }

        public Criteria andSaReplyAttachLike(String value) {
            addCriterion("SA_REPLY_ATTACH like", value, "saReplyAttach");
            return (Criteria) this;
        }

        public Criteria andSaReplyAttachNotLike(String value) {
            addCriterion("SA_REPLY_ATTACH not like", value, "saReplyAttach");
            return (Criteria) this;
        }

        public Criteria andSaReplyAttachIn(List<String> values) {
            addCriterion("SA_REPLY_ATTACH in", values, "saReplyAttach");
            return (Criteria) this;
        }

        public Criteria andSaReplyAttachNotIn(List<String> values) {
            addCriterion("SA_REPLY_ATTACH not in", values, "saReplyAttach");
            return (Criteria) this;
        }

        public Criteria andSaReplyAttachBetween(String value1, String value2) {
            addCriterion("SA_REPLY_ATTACH between", value1, value2, "saReplyAttach");
            return (Criteria) this;
        }

        public Criteria andSaReplyAttachNotBetween(String value1, String value2) {
            addCriterion("SA_REPLY_ATTACH not between", value1, value2, "saReplyAttach");
            return (Criteria) this;
        }

        public Criteria andSaReplyTimeIsNull() {
            addCriterion("SA_REPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSaReplyTimeIsNotNull() {
            addCriterion("SA_REPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSaReplyTimeEqualTo(Date value) {
            addCriterion("SA_REPLY_TIME =", value, "saReplyTime");
            return (Criteria) this;
        }

        public Criteria andSaReplyTimeNotEqualTo(Date value) {
            addCriterion("SA_REPLY_TIME <>", value, "saReplyTime");
            return (Criteria) this;
        }

        public Criteria andSaReplyTimeGreaterThan(Date value) {
            addCriterion("SA_REPLY_TIME >", value, "saReplyTime");
            return (Criteria) this;
        }

        public Criteria andSaReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SA_REPLY_TIME >=", value, "saReplyTime");
            return (Criteria) this;
        }

        public Criteria andSaReplyTimeLessThan(Date value) {
            addCriterion("SA_REPLY_TIME <", value, "saReplyTime");
            return (Criteria) this;
        }

        public Criteria andSaReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("SA_REPLY_TIME <=", value, "saReplyTime");
            return (Criteria) this;
        }

        public Criteria andSaReplyTimeIn(List<Date> values) {
            addCriterion("SA_REPLY_TIME in", values, "saReplyTime");
            return (Criteria) this;
        }

        public Criteria andSaReplyTimeNotIn(List<Date> values) {
            addCriterion("SA_REPLY_TIME not in", values, "saReplyTime");
            return (Criteria) this;
        }

        public Criteria andSaReplyTimeBetween(Date value1, Date value2) {
            addCriterion("SA_REPLY_TIME between", value1, value2, "saReplyTime");
            return (Criteria) this;
        }

        public Criteria andSaReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("SA_REPLY_TIME not between", value1, value2, "saReplyTime");
            return (Criteria) this;
        }

        public Criteria andSaPumpIsNull() {
            addCriterion("SA_PUMP is null");
            return (Criteria) this;
        }

        public Criteria andSaPumpIsNotNull() {
            addCriterion("SA_PUMP is not null");
            return (Criteria) this;
        }

        public Criteria andSaPumpEqualTo(Integer value) {
            addCriterion("SA_PUMP =", value, "saPump");
            return (Criteria) this;
        }

        public Criteria andSaPumpNotEqualTo(Integer value) {
            addCriterion("SA_PUMP <>", value, "saPump");
            return (Criteria) this;
        }

        public Criteria andSaPumpGreaterThan(Integer value) {
            addCriterion("SA_PUMP >", value, "saPump");
            return (Criteria) this;
        }

        public Criteria andSaPumpGreaterThanOrEqualTo(Integer value) {
            addCriterion("SA_PUMP >=", value, "saPump");
            return (Criteria) this;
        }

        public Criteria andSaPumpLessThan(Integer value) {
            addCriterion("SA_PUMP <", value, "saPump");
            return (Criteria) this;
        }

        public Criteria andSaPumpLessThanOrEqualTo(Integer value) {
            addCriterion("SA_PUMP <=", value, "saPump");
            return (Criteria) this;
        }

        public Criteria andSaPumpIn(List<Integer> values) {
            addCriterion("SA_PUMP in", values, "saPump");
            return (Criteria) this;
        }

        public Criteria andSaPumpNotIn(List<Integer> values) {
            addCriterion("SA_PUMP not in", values, "saPump");
            return (Criteria) this;
        }

        public Criteria andSaPumpBetween(Integer value1, Integer value2) {
            addCriterion("SA_PUMP between", value1, value2, "saPump");
            return (Criteria) this;
        }

        public Criteria andSaPumpNotBetween(Integer value1, Integer value2) {
            addCriterion("SA_PUMP not between", value1, value2, "saPump");
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