package com.chinasofti.cetp.exam.model;

import java.util.ArrayList;
import java.util.List;

public class ExamAnswExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamAnswExample() {
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

        public Criteria andEaIdIsNull() {
            addCriterion("EA_ID is null");
            return (Criteria) this;
        }

        public Criteria andEaIdIsNotNull() {
            addCriterion("EA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEaIdEqualTo(Integer value) {
            addCriterion("EA_ID =", value, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdNotEqualTo(Integer value) {
            addCriterion("EA_ID <>", value, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdGreaterThan(Integer value) {
            addCriterion("EA_ID >", value, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EA_ID >=", value, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdLessThan(Integer value) {
            addCriterion("EA_ID <", value, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdLessThanOrEqualTo(Integer value) {
            addCriterion("EA_ID <=", value, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdIn(List<Integer> values) {
            addCriterion("EA_ID in", values, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdNotIn(List<Integer> values) {
            addCriterion("EA_ID not in", values, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdBetween(Integer value1, Integer value2) {
            addCriterion("EA_ID between", value1, value2, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EA_ID not between", value1, value2, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaChapIdIsNull() {
            addCriterion("EA_CHAP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEaChapIdIsNotNull() {
            addCriterion("EA_CHAP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEaChapIdEqualTo(Integer value) {
            addCriterion("EA_CHAP_ID =", value, "eaChapId");
            return (Criteria) this;
        }

        public Criteria andEaChapIdNotEqualTo(Integer value) {
            addCriterion("EA_CHAP_ID <>", value, "eaChapId");
            return (Criteria) this;
        }

        public Criteria andEaChapIdGreaterThan(Integer value) {
            addCriterion("EA_CHAP_ID >", value, "eaChapId");
            return (Criteria) this;
        }

        public Criteria andEaChapIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EA_CHAP_ID >=", value, "eaChapId");
            return (Criteria) this;
        }

        public Criteria andEaChapIdLessThan(Integer value) {
            addCriterion("EA_CHAP_ID <", value, "eaChapId");
            return (Criteria) this;
        }

        public Criteria andEaChapIdLessThanOrEqualTo(Integer value) {
            addCriterion("EA_CHAP_ID <=", value, "eaChapId");
            return (Criteria) this;
        }

        public Criteria andEaChapIdIn(List<Integer> values) {
            addCriterion("EA_CHAP_ID in", values, "eaChapId");
            return (Criteria) this;
        }

        public Criteria andEaChapIdNotIn(List<Integer> values) {
            addCriterion("EA_CHAP_ID not in", values, "eaChapId");
            return (Criteria) this;
        }

        public Criteria andEaChapIdBetween(Integer value1, Integer value2) {
            addCriterion("EA_CHAP_ID between", value1, value2, "eaChapId");
            return (Criteria) this;
        }

        public Criteria andEaChapIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EA_CHAP_ID not between", value1, value2, "eaChapId");
            return (Criteria) this;
        }

        public Criteria andEaStuNoIsNull() {
            addCriterion("EA_STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andEaStuNoIsNotNull() {
            addCriterion("EA_STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEaStuNoEqualTo(Integer value) {
            addCriterion("EA_STU_NO =", value, "eaStuNo");
            return (Criteria) this;
        }

        public Criteria andEaStuNoNotEqualTo(Integer value) {
            addCriterion("EA_STU_NO <>", value, "eaStuNo");
            return (Criteria) this;
        }

        public Criteria andEaStuNoGreaterThan(Integer value) {
            addCriterion("EA_STU_NO >", value, "eaStuNo");
            return (Criteria) this;
        }

        public Criteria andEaStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("EA_STU_NO >=", value, "eaStuNo");
            return (Criteria) this;
        }

        public Criteria andEaStuNoLessThan(Integer value) {
            addCriterion("EA_STU_NO <", value, "eaStuNo");
            return (Criteria) this;
        }

        public Criteria andEaStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("EA_STU_NO <=", value, "eaStuNo");
            return (Criteria) this;
        }

        public Criteria andEaStuNoIn(List<Integer> values) {
            addCriterion("EA_STU_NO in", values, "eaStuNo");
            return (Criteria) this;
        }

        public Criteria andEaStuNoNotIn(List<Integer> values) {
            addCriterion("EA_STU_NO not in", values, "eaStuNo");
            return (Criteria) this;
        }

        public Criteria andEaStuNoBetween(Integer value1, Integer value2) {
            addCriterion("EA_STU_NO between", value1, value2, "eaStuNo");
            return (Criteria) this;
        }

        public Criteria andEaStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("EA_STU_NO not between", value1, value2, "eaStuNo");
            return (Criteria) this;
        }

        public Criteria andEaQIdIsNull() {
            addCriterion("EA_Q_ID is null");
            return (Criteria) this;
        }

        public Criteria andEaQIdIsNotNull() {
            addCriterion("EA_Q_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEaQIdEqualTo(Long value) {
            addCriterion("EA_Q_ID =", value, "eaQId");
            return (Criteria) this;
        }

        public Criteria andEaQIdNotEqualTo(Long value) {
            addCriterion("EA_Q_ID <>", value, "eaQId");
            return (Criteria) this;
        }

        public Criteria andEaQIdGreaterThan(Long value) {
            addCriterion("EA_Q_ID >", value, "eaQId");
            return (Criteria) this;
        }

        public Criteria andEaQIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EA_Q_ID >=", value, "eaQId");
            return (Criteria) this;
        }

        public Criteria andEaQIdLessThan(Long value) {
            addCriterion("EA_Q_ID <", value, "eaQId");
            return (Criteria) this;
        }

        public Criteria andEaQIdLessThanOrEqualTo(Long value) {
            addCriterion("EA_Q_ID <=", value, "eaQId");
            return (Criteria) this;
        }

        public Criteria andEaQIdIn(List<Long> values) {
            addCriterion("EA_Q_ID in", values, "eaQId");
            return (Criteria) this;
        }

        public Criteria andEaQIdNotIn(List<Long> values) {
            addCriterion("EA_Q_ID not in", values, "eaQId");
            return (Criteria) this;
        }

        public Criteria andEaQIdBetween(Long value1, Long value2) {
            addCriterion("EA_Q_ID between", value1, value2, "eaQId");
            return (Criteria) this;
        }

        public Criteria andEaQIdNotBetween(Long value1, Long value2) {
            addCriterion("EA_Q_ID not between", value1, value2, "eaQId");
            return (Criteria) this;
        }

        public Criteria andEaStuanswIsNull() {
            addCriterion("EA_STUANSW is null");
            return (Criteria) this;
        }

        public Criteria andEaStuanswIsNotNull() {
            addCriterion("EA_STUANSW is not null");
            return (Criteria) this;
        }

        public Criteria andEaStuanswEqualTo(String value) {
            addCriterion("EA_STUANSW =", value, "eaStuansw");
            return (Criteria) this;
        }

        public Criteria andEaStuanswNotEqualTo(String value) {
            addCriterion("EA_STUANSW <>", value, "eaStuansw");
            return (Criteria) this;
        }

        public Criteria andEaStuanswGreaterThan(String value) {
            addCriterion("EA_STUANSW >", value, "eaStuansw");
            return (Criteria) this;
        }

        public Criteria andEaStuanswGreaterThanOrEqualTo(String value) {
            addCriterion("EA_STUANSW >=", value, "eaStuansw");
            return (Criteria) this;
        }

        public Criteria andEaStuanswLessThan(String value) {
            addCriterion("EA_STUANSW <", value, "eaStuansw");
            return (Criteria) this;
        }

        public Criteria andEaStuanswLessThanOrEqualTo(String value) {
            addCriterion("EA_STUANSW <=", value, "eaStuansw");
            return (Criteria) this;
        }

        public Criteria andEaStuanswLike(String value) {
            addCriterion("EA_STUANSW like", value, "eaStuansw");
            return (Criteria) this;
        }

        public Criteria andEaStuanswNotLike(String value) {
            addCriterion("EA_STUANSW not like", value, "eaStuansw");
            return (Criteria) this;
        }

        public Criteria andEaStuanswIn(List<String> values) {
            addCriterion("EA_STUANSW in", values, "eaStuansw");
            return (Criteria) this;
        }

        public Criteria andEaStuanswNotIn(List<String> values) {
            addCriterion("EA_STUANSW not in", values, "eaStuansw");
            return (Criteria) this;
        }

        public Criteria andEaStuanswBetween(String value1, String value2) {
            addCriterion("EA_STUANSW between", value1, value2, "eaStuansw");
            return (Criteria) this;
        }

        public Criteria andEaStuanswNotBetween(String value1, String value2) {
            addCriterion("EA_STUANSW not between", value1, value2, "eaStuansw");
            return (Criteria) this;
        }

        public Criteria andEaScoreIsNull() {
            addCriterion("EA_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andEaScoreIsNotNull() {
            addCriterion("EA_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andEaScoreEqualTo(Double value) {
            addCriterion("EA_SCORE =", value, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreNotEqualTo(Double value) {
            addCriterion("EA_SCORE <>", value, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreGreaterThan(Double value) {
            addCriterion("EA_SCORE >", value, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("EA_SCORE >=", value, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreLessThan(Double value) {
            addCriterion("EA_SCORE <", value, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreLessThanOrEqualTo(Double value) {
            addCriterion("EA_SCORE <=", value, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreIn(List<Double> values) {
            addCriterion("EA_SCORE in", values, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreNotIn(List<Double> values) {
            addCriterion("EA_SCORE not in", values, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreBetween(Double value1, Double value2) {
            addCriterion("EA_SCORE between", value1, value2, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreNotBetween(Double value1, Double value2) {
            addCriterion("EA_SCORE not between", value1, value2, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaLivecourseIdIsNull() {
            addCriterion("EA_LIVECOURSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEaLivecourseIdIsNotNull() {
            addCriterion("EA_LIVECOURSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEaLivecourseIdEqualTo(Integer value) {
            addCriterion("EA_LIVECOURSE_ID =", value, "eaLivecourseId");
            return (Criteria) this;
        }

        public Criteria andEaLivecourseIdNotEqualTo(Integer value) {
            addCriterion("EA_LIVECOURSE_ID <>", value, "eaLivecourseId");
            return (Criteria) this;
        }

        public Criteria andEaLivecourseIdGreaterThan(Integer value) {
            addCriterion("EA_LIVECOURSE_ID >", value, "eaLivecourseId");
            return (Criteria) this;
        }

        public Criteria andEaLivecourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EA_LIVECOURSE_ID >=", value, "eaLivecourseId");
            return (Criteria) this;
        }

        public Criteria andEaLivecourseIdLessThan(Integer value) {
            addCriterion("EA_LIVECOURSE_ID <", value, "eaLivecourseId");
            return (Criteria) this;
        }

        public Criteria andEaLivecourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("EA_LIVECOURSE_ID <=", value, "eaLivecourseId");
            return (Criteria) this;
        }

        public Criteria andEaLivecourseIdIn(List<Integer> values) {
            addCriterion("EA_LIVECOURSE_ID in", values, "eaLivecourseId");
            return (Criteria) this;
        }

        public Criteria andEaLivecourseIdNotIn(List<Integer> values) {
            addCriterion("EA_LIVECOURSE_ID not in", values, "eaLivecourseId");
            return (Criteria) this;
        }

        public Criteria andEaLivecourseIdBetween(Integer value1, Integer value2) {
            addCriterion("EA_LIVECOURSE_ID between", value1, value2, "eaLivecourseId");
            return (Criteria) this;
        }

        public Criteria andEaLivecourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EA_LIVECOURSE_ID not between", value1, value2, "eaLivecourseId");
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