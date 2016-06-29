package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecommendSpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecommendSpecExample() {
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

        public Criteria andRsSpecIdIsNull() {
            addCriterion("RS_SPEC_ID is null");
            return (Criteria) this;
        }

        public Criteria andRsSpecIdIsNotNull() {
            addCriterion("RS_SPEC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRsSpecIdEqualTo(Integer value) {
            addCriterion("RS_SPEC_ID =", value, "rsSpecId");
            return (Criteria) this;
        }

        public Criteria andRsSpecIdNotEqualTo(Integer value) {
            addCriterion("RS_SPEC_ID <>", value, "rsSpecId");
            return (Criteria) this;
        }

        public Criteria andRsSpecIdGreaterThan(Integer value) {
            addCriterion("RS_SPEC_ID >", value, "rsSpecId");
            return (Criteria) this;
        }

        public Criteria andRsSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RS_SPEC_ID >=", value, "rsSpecId");
            return (Criteria) this;
        }

        public Criteria andRsSpecIdLessThan(Integer value) {
            addCriterion("RS_SPEC_ID <", value, "rsSpecId");
            return (Criteria) this;
        }

        public Criteria andRsSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("RS_SPEC_ID <=", value, "rsSpecId");
            return (Criteria) this;
        }

        public Criteria andRsSpecIdIn(List<Integer> values) {
            addCriterion("RS_SPEC_ID in", values, "rsSpecId");
            return (Criteria) this;
        }

        public Criteria andRsSpecIdNotIn(List<Integer> values) {
            addCriterion("RS_SPEC_ID not in", values, "rsSpecId");
            return (Criteria) this;
        }

        public Criteria andRsSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("RS_SPEC_ID between", value1, value2, "rsSpecId");
            return (Criteria) this;
        }

        public Criteria andRsSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RS_SPEC_ID not between", value1, value2, "rsSpecId");
            return (Criteria) this;
        }

        public Criteria andRsTypeIsNull() {
            addCriterion("RS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRsTypeIsNotNull() {
            addCriterion("RS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRsTypeEqualTo(String value) {
            addCriterion("RS_TYPE =", value, "rsType");
            return (Criteria) this;
        }

        public Criteria andRsTypeNotEqualTo(String value) {
            addCriterion("RS_TYPE <>", value, "rsType");
            return (Criteria) this;
        }

        public Criteria andRsTypeGreaterThan(String value) {
            addCriterion("RS_TYPE >", value, "rsType");
            return (Criteria) this;
        }

        public Criteria andRsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RS_TYPE >=", value, "rsType");
            return (Criteria) this;
        }

        public Criteria andRsTypeLessThan(String value) {
            addCriterion("RS_TYPE <", value, "rsType");
            return (Criteria) this;
        }

        public Criteria andRsTypeLessThanOrEqualTo(String value) {
            addCriterion("RS_TYPE <=", value, "rsType");
            return (Criteria) this;
        }

        public Criteria andRsTypeLike(String value) {
            addCriterion("RS_TYPE like", value, "rsType");
            return (Criteria) this;
        }

        public Criteria andRsTypeNotLike(String value) {
            addCriterion("RS_TYPE not like", value, "rsType");
            return (Criteria) this;
        }

        public Criteria andRsTypeIn(List<String> values) {
            addCriterion("RS_TYPE in", values, "rsType");
            return (Criteria) this;
        }

        public Criteria andRsTypeNotIn(List<String> values) {
            addCriterion("RS_TYPE not in", values, "rsType");
            return (Criteria) this;
        }

        public Criteria andRsTypeBetween(String value1, String value2) {
            addCriterion("RS_TYPE between", value1, value2, "rsType");
            return (Criteria) this;
        }

        public Criteria andRsTypeNotBetween(String value1, String value2) {
            addCriterion("RS_TYPE not between", value1, value2, "rsType");
            return (Criteria) this;
        }

        public Criteria andRsRegtimeIsNull() {
            addCriterion("RS_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andRsRegtimeIsNotNull() {
            addCriterion("RS_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRsRegtimeEqualTo(Date value) {
            addCriterion("RS_REGTIME =", value, "rsRegtime");
            return (Criteria) this;
        }

        public Criteria andRsRegtimeNotEqualTo(Date value) {
            addCriterion("RS_REGTIME <>", value, "rsRegtime");
            return (Criteria) this;
        }

        public Criteria andRsRegtimeGreaterThan(Date value) {
            addCriterion("RS_REGTIME >", value, "rsRegtime");
            return (Criteria) this;
        }

        public Criteria andRsRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RS_REGTIME >=", value, "rsRegtime");
            return (Criteria) this;
        }

        public Criteria andRsRegtimeLessThan(Date value) {
            addCriterion("RS_REGTIME <", value, "rsRegtime");
            return (Criteria) this;
        }

        public Criteria andRsRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("RS_REGTIME <=", value, "rsRegtime");
            return (Criteria) this;
        }

        public Criteria andRsRegtimeIn(List<Date> values) {
            addCriterion("RS_REGTIME in", values, "rsRegtime");
            return (Criteria) this;
        }

        public Criteria andRsRegtimeNotIn(List<Date> values) {
            addCriterion("RS_REGTIME not in", values, "rsRegtime");
            return (Criteria) this;
        }

        public Criteria andRsRegtimeBetween(Date value1, Date value2) {
            addCriterion("RS_REGTIME between", value1, value2, "rsRegtime");
            return (Criteria) this;
        }

        public Criteria andRsRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("RS_REGTIME not between", value1, value2, "rsRegtime");
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