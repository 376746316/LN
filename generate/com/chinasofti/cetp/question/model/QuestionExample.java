package com.chinasofti.cetp.question.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQueIdIsNull() {
            addCriterion("QUE_ID is null");
            return (Criteria) this;
        }

        public Criteria andQueIdIsNotNull() {
            addCriterion("QUE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQueIdEqualTo(Integer value) {
            addCriterion("QUE_ID =", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotEqualTo(Integer value) {
            addCriterion("QUE_ID <>", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdGreaterThan(Integer value) {
            addCriterion("QUE_ID >", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUE_ID >=", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLessThan(Integer value) {
            addCriterion("QUE_ID <", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLessThanOrEqualTo(Integer value) {
            addCriterion("QUE_ID <=", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdIn(List<Integer> values) {
            addCriterion("QUE_ID in", values, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotIn(List<Integer> values) {
            addCriterion("QUE_ID not in", values, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdBetween(Integer value1, Integer value2) {
            addCriterion("QUE_ID between", value1, value2, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("QUE_ID not between", value1, value2, "queId");
            return (Criteria) this;
        }

        public Criteria andQueStuNoIsNull() {
            addCriterion("QUE_STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andQueStuNoIsNotNull() {
            addCriterion("QUE_STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andQueStuNoEqualTo(Integer value) {
            addCriterion("QUE_STU_NO =", value, "queStuNo");
            return (Criteria) this;
        }

        public Criteria andQueStuNoNotEqualTo(Integer value) {
            addCriterion("QUE_STU_NO <>", value, "queStuNo");
            return (Criteria) this;
        }

        public Criteria andQueStuNoGreaterThan(Integer value) {
            addCriterion("QUE_STU_NO >", value, "queStuNo");
            return (Criteria) this;
        }

        public Criteria andQueStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUE_STU_NO >=", value, "queStuNo");
            return (Criteria) this;
        }

        public Criteria andQueStuNoLessThan(Integer value) {
            addCriterion("QUE_STU_NO <", value, "queStuNo");
            return (Criteria) this;
        }

        public Criteria andQueStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("QUE_STU_NO <=", value, "queStuNo");
            return (Criteria) this;
        }

        public Criteria andQueStuNoIn(List<Integer> values) {
            addCriterion("QUE_STU_NO in", values, "queStuNo");
            return (Criteria) this;
        }

        public Criteria andQueStuNoNotIn(List<Integer> values) {
            addCriterion("QUE_STU_NO not in", values, "queStuNo");
            return (Criteria) this;
        }

        public Criteria andQueStuNoBetween(Integer value1, Integer value2) {
            addCriterion("QUE_STU_NO between", value1, value2, "queStuNo");
            return (Criteria) this;
        }

        public Criteria andQueStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("QUE_STU_NO not between", value1, value2, "queStuNo");
            return (Criteria) this;
        }

        public Criteria andQueTitleIsNull() {
            addCriterion("QUE_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andQueTitleIsNotNull() {
            addCriterion("QUE_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andQueTitleEqualTo(String value) {
            addCriterion("QUE_TITLE =", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleNotEqualTo(String value) {
            addCriterion("QUE_TITLE <>", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleGreaterThan(String value) {
            addCriterion("QUE_TITLE >", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleGreaterThanOrEqualTo(String value) {
            addCriterion("QUE_TITLE >=", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleLessThan(String value) {
            addCriterion("QUE_TITLE <", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleLessThanOrEqualTo(String value) {
            addCriterion("QUE_TITLE <=", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleLike(String value) {
            addCriterion("QUE_TITLE like", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleNotLike(String value) {
            addCriterion("QUE_TITLE not like", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleIn(List<String> values) {
            addCriterion("QUE_TITLE in", values, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleNotIn(List<String> values) {
            addCriterion("QUE_TITLE not in", values, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleBetween(String value1, String value2) {
            addCriterion("QUE_TITLE between", value1, value2, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleNotBetween(String value1, String value2) {
            addCriterion("QUE_TITLE not between", value1, value2, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTimeIsNull() {
            addCriterion("QUE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andQueTimeIsNotNull() {
            addCriterion("QUE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andQueTimeEqualTo(Date value) {
            addCriterion("QUE_TIME =", value, "queTime");
            return (Criteria) this;
        }

        public Criteria andQueTimeNotEqualTo(Date value) {
            addCriterion("QUE_TIME <>", value, "queTime");
            return (Criteria) this;
        }

        public Criteria andQueTimeGreaterThan(Date value) {
            addCriterion("QUE_TIME >", value, "queTime");
            return (Criteria) this;
        }

        public Criteria andQueTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("QUE_TIME >=", value, "queTime");
            return (Criteria) this;
        }

        public Criteria andQueTimeLessThan(Date value) {
            addCriterion("QUE_TIME <", value, "queTime");
            return (Criteria) this;
        }

        public Criteria andQueTimeLessThanOrEqualTo(Date value) {
            addCriterion("QUE_TIME <=", value, "queTime");
            return (Criteria) this;
        }

        public Criteria andQueTimeIn(List<Date> values) {
            addCriterion("QUE_TIME in", values, "queTime");
            return (Criteria) this;
        }

        public Criteria andQueTimeNotIn(List<Date> values) {
            addCriterion("QUE_TIME not in", values, "queTime");
            return (Criteria) this;
        }

        public Criteria andQueTimeBetween(Date value1, Date value2) {
            addCriterion("QUE_TIME between", value1, value2, "queTime");
            return (Criteria) this;
        }

        public Criteria andQueTimeNotBetween(Date value1, Date value2) {
            addCriterion("QUE_TIME not between", value1, value2, "queTime");
            return (Criteria) this;
        }

        public Criteria andQueStatusIsNull() {
            addCriterion("QUE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andQueStatusIsNotNull() {
            addCriterion("QUE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andQueStatusEqualTo(String value) {
            addCriterion("QUE_STATUS =", value, "queStatus");
            return (Criteria) this;
        }

        public Criteria andQueStatusNotEqualTo(String value) {
            addCriterion("QUE_STATUS <>", value, "queStatus");
            return (Criteria) this;
        }

        public Criteria andQueStatusGreaterThan(String value) {
            addCriterion("QUE_STATUS >", value, "queStatus");
            return (Criteria) this;
        }

        public Criteria andQueStatusGreaterThanOrEqualTo(String value) {
            addCriterion("QUE_STATUS >=", value, "queStatus");
            return (Criteria) this;
        }

        public Criteria andQueStatusLessThan(String value) {
            addCriterion("QUE_STATUS <", value, "queStatus");
            return (Criteria) this;
        }

        public Criteria andQueStatusLessThanOrEqualTo(String value) {
            addCriterion("QUE_STATUS <=", value, "queStatus");
            return (Criteria) this;
        }

        public Criteria andQueStatusLike(String value) {
            addCriterion("QUE_STATUS like", value, "queStatus");
            return (Criteria) this;
        }

        public Criteria andQueStatusNotLike(String value) {
            addCriterion("QUE_STATUS not like", value, "queStatus");
            return (Criteria) this;
        }

        public Criteria andQueStatusIn(List<String> values) {
            addCriterion("QUE_STATUS in", values, "queStatus");
            return (Criteria) this;
        }

        public Criteria andQueStatusNotIn(List<String> values) {
            addCriterion("QUE_STATUS not in", values, "queStatus");
            return (Criteria) this;
        }

        public Criteria andQueStatusBetween(String value1, String value2) {
            addCriterion("QUE_STATUS between", value1, value2, "queStatus");
            return (Criteria) this;
        }

        public Criteria andQueStatusNotBetween(String value1, String value2) {
            addCriterion("QUE_STATUS not between", value1, value2, "queStatus");
            return (Criteria) this;
        }

        public Criteria andQueBestAnswerIsNull() {
            addCriterion("QUE_BEST_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andQueBestAnswerIsNotNull() {
            addCriterion("QUE_BEST_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andQueBestAnswerEqualTo(Integer value) {
            addCriterion("QUE_BEST_ANSWER =", value, "queBestAnswer");
            return (Criteria) this;
        }

        public Criteria andQueBestAnswerNotEqualTo(Integer value) {
            addCriterion("QUE_BEST_ANSWER <>", value, "queBestAnswer");
            return (Criteria) this;
        }

        public Criteria andQueBestAnswerGreaterThan(Integer value) {
            addCriterion("QUE_BEST_ANSWER >", value, "queBestAnswer");
            return (Criteria) this;
        }

        public Criteria andQueBestAnswerGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUE_BEST_ANSWER >=", value, "queBestAnswer");
            return (Criteria) this;
        }

        public Criteria andQueBestAnswerLessThan(Integer value) {
            addCriterion("QUE_BEST_ANSWER <", value, "queBestAnswer");
            return (Criteria) this;
        }

        public Criteria andQueBestAnswerLessThanOrEqualTo(Integer value) {
            addCriterion("QUE_BEST_ANSWER <=", value, "queBestAnswer");
            return (Criteria) this;
        }

        public Criteria andQueBestAnswerIn(List<Integer> values) {
            addCriterion("QUE_BEST_ANSWER in", values, "queBestAnswer");
            return (Criteria) this;
        }

        public Criteria andQueBestAnswerNotIn(List<Integer> values) {
            addCriterion("QUE_BEST_ANSWER not in", values, "queBestAnswer");
            return (Criteria) this;
        }

        public Criteria andQueBestAnswerBetween(Integer value1, Integer value2) {
            addCriterion("QUE_BEST_ANSWER between", value1, value2, "queBestAnswer");
            return (Criteria) this;
        }

        public Criteria andQueBestAnswerNotBetween(Integer value1, Integer value2) {
            addCriterion("QUE_BEST_ANSWER not between", value1, value2, "queBestAnswer");
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