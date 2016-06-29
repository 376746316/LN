package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubcwExerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubcwExerExample() {
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

        public Criteria andSeSubcwIdIsNull() {
            addCriterion("SE_SUBCW_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeSubcwIdIsNotNull() {
            addCriterion("SE_SUBCW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeSubcwIdEqualTo(Integer value) {
            addCriterion("SE_SUBCW_ID =", value, "seSubcwId");
            return (Criteria) this;
        }

        public Criteria andSeSubcwIdNotEqualTo(Integer value) {
            addCriterion("SE_SUBCW_ID <>", value, "seSubcwId");
            return (Criteria) this;
        }

        public Criteria andSeSubcwIdGreaterThan(Integer value) {
            addCriterion("SE_SUBCW_ID >", value, "seSubcwId");
            return (Criteria) this;
        }

        public Criteria andSeSubcwIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SE_SUBCW_ID >=", value, "seSubcwId");
            return (Criteria) this;
        }

        public Criteria andSeSubcwIdLessThan(Integer value) {
            addCriterion("SE_SUBCW_ID <", value, "seSubcwId");
            return (Criteria) this;
        }

        public Criteria andSeSubcwIdLessThanOrEqualTo(Integer value) {
            addCriterion("SE_SUBCW_ID <=", value, "seSubcwId");
            return (Criteria) this;
        }

        public Criteria andSeSubcwIdIn(List<Integer> values) {
            addCriterion("SE_SUBCW_ID in", values, "seSubcwId");
            return (Criteria) this;
        }

        public Criteria andSeSubcwIdNotIn(List<Integer> values) {
            addCriterion("SE_SUBCW_ID not in", values, "seSubcwId");
            return (Criteria) this;
        }

        public Criteria andSeSubcwIdBetween(Integer value1, Integer value2) {
            addCriterion("SE_SUBCW_ID between", value1, value2, "seSubcwId");
            return (Criteria) this;
        }

        public Criteria andSeSubcwIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SE_SUBCW_ID not between", value1, value2, "seSubcwId");
            return (Criteria) this;
        }

        public Criteria andSeExerIdIsNull() {
            addCriterion("SE_EXER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeExerIdIsNotNull() {
            addCriterion("SE_EXER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeExerIdEqualTo(Integer value) {
            addCriterion("SE_EXER_ID =", value, "seExerId");
            return (Criteria) this;
        }

        public Criteria andSeExerIdNotEqualTo(Integer value) {
            addCriterion("SE_EXER_ID <>", value, "seExerId");
            return (Criteria) this;
        }

        public Criteria andSeExerIdGreaterThan(Integer value) {
            addCriterion("SE_EXER_ID >", value, "seExerId");
            return (Criteria) this;
        }

        public Criteria andSeExerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SE_EXER_ID >=", value, "seExerId");
            return (Criteria) this;
        }

        public Criteria andSeExerIdLessThan(Integer value) {
            addCriterion("SE_EXER_ID <", value, "seExerId");
            return (Criteria) this;
        }

        public Criteria andSeExerIdLessThanOrEqualTo(Integer value) {
            addCriterion("SE_EXER_ID <=", value, "seExerId");
            return (Criteria) this;
        }

        public Criteria andSeExerIdIn(List<Integer> values) {
            addCriterion("SE_EXER_ID in", values, "seExerId");
            return (Criteria) this;
        }

        public Criteria andSeExerIdNotIn(List<Integer> values) {
            addCriterion("SE_EXER_ID not in", values, "seExerId");
            return (Criteria) this;
        }

        public Criteria andSeExerIdBetween(Integer value1, Integer value2) {
            addCriterion("SE_EXER_ID between", value1, value2, "seExerId");
            return (Criteria) this;
        }

        public Criteria andSeExerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SE_EXER_ID not between", value1, value2, "seExerId");
            return (Criteria) this;
        }

        public Criteria andSeExerSeqIsNull() {
            addCriterion("SE_EXER_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSeExerSeqIsNotNull() {
            addCriterion("SE_EXER_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSeExerSeqEqualTo(Integer value) {
            addCriterion("SE_EXER_SEQ =", value, "seExerSeq");
            return (Criteria) this;
        }

        public Criteria andSeExerSeqNotEqualTo(Integer value) {
            addCriterion("SE_EXER_SEQ <>", value, "seExerSeq");
            return (Criteria) this;
        }

        public Criteria andSeExerSeqGreaterThan(Integer value) {
            addCriterion("SE_EXER_SEQ >", value, "seExerSeq");
            return (Criteria) this;
        }

        public Criteria andSeExerSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("SE_EXER_SEQ >=", value, "seExerSeq");
            return (Criteria) this;
        }

        public Criteria andSeExerSeqLessThan(Integer value) {
            addCriterion("SE_EXER_SEQ <", value, "seExerSeq");
            return (Criteria) this;
        }

        public Criteria andSeExerSeqLessThanOrEqualTo(Integer value) {
            addCriterion("SE_EXER_SEQ <=", value, "seExerSeq");
            return (Criteria) this;
        }

        public Criteria andSeExerSeqIn(List<Integer> values) {
            addCriterion("SE_EXER_SEQ in", values, "seExerSeq");
            return (Criteria) this;
        }

        public Criteria andSeExerSeqNotIn(List<Integer> values) {
            addCriterion("SE_EXER_SEQ not in", values, "seExerSeq");
            return (Criteria) this;
        }

        public Criteria andSeExerSeqBetween(Integer value1, Integer value2) {
            addCriterion("SE_EXER_SEQ between", value1, value2, "seExerSeq");
            return (Criteria) this;
        }

        public Criteria andSeExerSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("SE_EXER_SEQ not between", value1, value2, "seExerSeq");
            return (Criteria) this;
        }

        public Criteria andSeUserNoIsNull() {
            addCriterion("SE_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andSeUserNoIsNotNull() {
            addCriterion("SE_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSeUserNoEqualTo(Integer value) {
            addCriterion("SE_USER_NO =", value, "seUserNo");
            return (Criteria) this;
        }

        public Criteria andSeUserNoNotEqualTo(Integer value) {
            addCriterion("SE_USER_NO <>", value, "seUserNo");
            return (Criteria) this;
        }

        public Criteria andSeUserNoGreaterThan(Integer value) {
            addCriterion("SE_USER_NO >", value, "seUserNo");
            return (Criteria) this;
        }

        public Criteria andSeUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SE_USER_NO >=", value, "seUserNo");
            return (Criteria) this;
        }

        public Criteria andSeUserNoLessThan(Integer value) {
            addCriterion("SE_USER_NO <", value, "seUserNo");
            return (Criteria) this;
        }

        public Criteria andSeUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("SE_USER_NO <=", value, "seUserNo");
            return (Criteria) this;
        }

        public Criteria andSeUserNoIn(List<Integer> values) {
            addCriterion("SE_USER_NO in", values, "seUserNo");
            return (Criteria) this;
        }

        public Criteria andSeUserNoNotIn(List<Integer> values) {
            addCriterion("SE_USER_NO not in", values, "seUserNo");
            return (Criteria) this;
        }

        public Criteria andSeUserNoBetween(Integer value1, Integer value2) {
            addCriterion("SE_USER_NO between", value1, value2, "seUserNo");
            return (Criteria) this;
        }

        public Criteria andSeUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("SE_USER_NO not between", value1, value2, "seUserNo");
            return (Criteria) this;
        }

        public Criteria andSeRegtimeIsNull() {
            addCriterion("SE_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andSeRegtimeIsNotNull() {
            addCriterion("SE_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSeRegtimeEqualTo(Date value) {
            addCriterion("SE_REGTIME =", value, "seRegtime");
            return (Criteria) this;
        }

        public Criteria andSeRegtimeNotEqualTo(Date value) {
            addCriterion("SE_REGTIME <>", value, "seRegtime");
            return (Criteria) this;
        }

        public Criteria andSeRegtimeGreaterThan(Date value) {
            addCriterion("SE_REGTIME >", value, "seRegtime");
            return (Criteria) this;
        }

        public Criteria andSeRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SE_REGTIME >=", value, "seRegtime");
            return (Criteria) this;
        }

        public Criteria andSeRegtimeLessThan(Date value) {
            addCriterion("SE_REGTIME <", value, "seRegtime");
            return (Criteria) this;
        }

        public Criteria andSeRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("SE_REGTIME <=", value, "seRegtime");
            return (Criteria) this;
        }

        public Criteria andSeRegtimeIn(List<Date> values) {
            addCriterion("SE_REGTIME in", values, "seRegtime");
            return (Criteria) this;
        }

        public Criteria andSeRegtimeNotIn(List<Date> values) {
            addCriterion("SE_REGTIME not in", values, "seRegtime");
            return (Criteria) this;
        }

        public Criteria andSeRegtimeBetween(Date value1, Date value2) {
            addCriterion("SE_REGTIME between", value1, value2, "seRegtime");
            return (Criteria) this;
        }

        public Criteria andSeRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("SE_REGTIME not between", value1, value2, "seRegtime");
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