package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubwareStuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubwareStuExample() {
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

        public Criteria andWtSubwareIdIsNull() {
            addCriterion("WT_SUBWARE_ID is null");
            return (Criteria) this;
        }

        public Criteria andWtSubwareIdIsNotNull() {
            addCriterion("WT_SUBWARE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWtSubwareIdEqualTo(Integer value) {
            addCriterion("WT_SUBWARE_ID =", value, "wtSubwareId");
            return (Criteria) this;
        }

        public Criteria andWtSubwareIdNotEqualTo(Integer value) {
            addCriterion("WT_SUBWARE_ID <>", value, "wtSubwareId");
            return (Criteria) this;
        }

        public Criteria andWtSubwareIdGreaterThan(Integer value) {
            addCriterion("WT_SUBWARE_ID >", value, "wtSubwareId");
            return (Criteria) this;
        }

        public Criteria andWtSubwareIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WT_SUBWARE_ID >=", value, "wtSubwareId");
            return (Criteria) this;
        }

        public Criteria andWtSubwareIdLessThan(Integer value) {
            addCriterion("WT_SUBWARE_ID <", value, "wtSubwareId");
            return (Criteria) this;
        }

        public Criteria andWtSubwareIdLessThanOrEqualTo(Integer value) {
            addCriterion("WT_SUBWARE_ID <=", value, "wtSubwareId");
            return (Criteria) this;
        }

        public Criteria andWtSubwareIdIn(List<Integer> values) {
            addCriterion("WT_SUBWARE_ID in", values, "wtSubwareId");
            return (Criteria) this;
        }

        public Criteria andWtSubwareIdNotIn(List<Integer> values) {
            addCriterion("WT_SUBWARE_ID not in", values, "wtSubwareId");
            return (Criteria) this;
        }

        public Criteria andWtSubwareIdBetween(Integer value1, Integer value2) {
            addCriterion("WT_SUBWARE_ID between", value1, value2, "wtSubwareId");
            return (Criteria) this;
        }

        public Criteria andWtSubwareIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WT_SUBWARE_ID not between", value1, value2, "wtSubwareId");
            return (Criteria) this;
        }

        public Criteria andWtStuIdIsNull() {
            addCriterion("WT_STU_ID is null");
            return (Criteria) this;
        }

        public Criteria andWtStuIdIsNotNull() {
            addCriterion("WT_STU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWtStuIdEqualTo(Integer value) {
            addCriterion("WT_STU_ID =", value, "wtStuId");
            return (Criteria) this;
        }

        public Criteria andWtStuIdNotEqualTo(Integer value) {
            addCriterion("WT_STU_ID <>", value, "wtStuId");
            return (Criteria) this;
        }

        public Criteria andWtStuIdGreaterThan(Integer value) {
            addCriterion("WT_STU_ID >", value, "wtStuId");
            return (Criteria) this;
        }

        public Criteria andWtStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WT_STU_ID >=", value, "wtStuId");
            return (Criteria) this;
        }

        public Criteria andWtStuIdLessThan(Integer value) {
            addCriterion("WT_STU_ID <", value, "wtStuId");
            return (Criteria) this;
        }

        public Criteria andWtStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("WT_STU_ID <=", value, "wtStuId");
            return (Criteria) this;
        }

        public Criteria andWtStuIdIn(List<Integer> values) {
            addCriterion("WT_STU_ID in", values, "wtStuId");
            return (Criteria) this;
        }

        public Criteria andWtStuIdNotIn(List<Integer> values) {
            addCriterion("WT_STU_ID not in", values, "wtStuId");
            return (Criteria) this;
        }

        public Criteria andWtStuIdBetween(Integer value1, Integer value2) {
            addCriterion("WT_STU_ID between", value1, value2, "wtStuId");
            return (Criteria) this;
        }

        public Criteria andWtStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WT_STU_ID not between", value1, value2, "wtStuId");
            return (Criteria) this;
        }

        public Criteria andWtStudyTimeIsNull() {
            addCriterion("WT_STUDY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWtStudyTimeIsNotNull() {
            addCriterion("WT_STUDY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWtStudyTimeEqualTo(String value) {
            addCriterion("WT_STUDY_TIME =", value, "wtStudyTime");
            return (Criteria) this;
        }

        public Criteria andWtStudyTimeNotEqualTo(String value) {
            addCriterion("WT_STUDY_TIME <>", value, "wtStudyTime");
            return (Criteria) this;
        }

        public Criteria andWtStudyTimeGreaterThan(String value) {
            addCriterion("WT_STUDY_TIME >", value, "wtStudyTime");
            return (Criteria) this;
        }

        public Criteria andWtStudyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("WT_STUDY_TIME >=", value, "wtStudyTime");
            return (Criteria) this;
        }

        public Criteria andWtStudyTimeLessThan(String value) {
            addCriterion("WT_STUDY_TIME <", value, "wtStudyTime");
            return (Criteria) this;
        }

        public Criteria andWtStudyTimeLessThanOrEqualTo(String value) {
            addCriterion("WT_STUDY_TIME <=", value, "wtStudyTime");
            return (Criteria) this;
        }

        public Criteria andWtStudyTimeLike(String value) {
            addCriterion("WT_STUDY_TIME like", value, "wtStudyTime");
            return (Criteria) this;
        }

        public Criteria andWtStudyTimeNotLike(String value) {
            addCriterion("WT_STUDY_TIME not like", value, "wtStudyTime");
            return (Criteria) this;
        }

        public Criteria andWtStudyTimeIn(List<String> values) {
            addCriterion("WT_STUDY_TIME in", values, "wtStudyTime");
            return (Criteria) this;
        }

        public Criteria andWtStudyTimeNotIn(List<String> values) {
            addCriterion("WT_STUDY_TIME not in", values, "wtStudyTime");
            return (Criteria) this;
        }

        public Criteria andWtStudyTimeBetween(String value1, String value2) {
            addCriterion("WT_STUDY_TIME between", value1, value2, "wtStudyTime");
            return (Criteria) this;
        }

        public Criteria andWtStudyTimeNotBetween(String value1, String value2) {
            addCriterion("WT_STUDY_TIME not between", value1, value2, "wtStudyTime");
            return (Criteria) this;
        }

        public Criteria andWtStatusIsNull() {
            addCriterion("WT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andWtStatusIsNotNull() {
            addCriterion("WT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andWtStatusEqualTo(String value) {
            addCriterion("WT_STATUS =", value, "wtStatus");
            return (Criteria) this;
        }

        public Criteria andWtStatusNotEqualTo(String value) {
            addCriterion("WT_STATUS <>", value, "wtStatus");
            return (Criteria) this;
        }

        public Criteria andWtStatusGreaterThan(String value) {
            addCriterion("WT_STATUS >", value, "wtStatus");
            return (Criteria) this;
        }

        public Criteria andWtStatusGreaterThanOrEqualTo(String value) {
            addCriterion("WT_STATUS >=", value, "wtStatus");
            return (Criteria) this;
        }

        public Criteria andWtStatusLessThan(String value) {
            addCriterion("WT_STATUS <", value, "wtStatus");
            return (Criteria) this;
        }

        public Criteria andWtStatusLessThanOrEqualTo(String value) {
            addCriterion("WT_STATUS <=", value, "wtStatus");
            return (Criteria) this;
        }

        public Criteria andWtStatusLike(String value) {
            addCriterion("WT_STATUS like", value, "wtStatus");
            return (Criteria) this;
        }

        public Criteria andWtStatusNotLike(String value) {
            addCriterion("WT_STATUS not like", value, "wtStatus");
            return (Criteria) this;
        }

        public Criteria andWtStatusIn(List<String> values) {
            addCriterion("WT_STATUS in", values, "wtStatus");
            return (Criteria) this;
        }

        public Criteria andWtStatusNotIn(List<String> values) {
            addCriterion("WT_STATUS not in", values, "wtStatus");
            return (Criteria) this;
        }

        public Criteria andWtStatusBetween(String value1, String value2) {
            addCriterion("WT_STATUS between", value1, value2, "wtStatus");
            return (Criteria) this;
        }

        public Criteria andWtStatusNotBetween(String value1, String value2) {
            addCriterion("WT_STATUS not between", value1, value2, "wtStatus");
            return (Criteria) this;
        }

        public Criteria andWtUpdateTimeIsNull() {
            addCriterion("WT_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWtUpdateTimeIsNotNull() {
            addCriterion("WT_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWtUpdateTimeEqualTo(Date value) {
            addCriterion("WT_UPDATE_TIME =", value, "wtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWtUpdateTimeNotEqualTo(Date value) {
            addCriterion("WT_UPDATE_TIME <>", value, "wtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWtUpdateTimeGreaterThan(Date value) {
            addCriterion("WT_UPDATE_TIME >", value, "wtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWtUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WT_UPDATE_TIME >=", value, "wtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWtUpdateTimeLessThan(Date value) {
            addCriterion("WT_UPDATE_TIME <", value, "wtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWtUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("WT_UPDATE_TIME <=", value, "wtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWtUpdateTimeIn(List<Date> values) {
            addCriterion("WT_UPDATE_TIME in", values, "wtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWtUpdateTimeNotIn(List<Date> values) {
            addCriterion("WT_UPDATE_TIME not in", values, "wtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWtUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("WT_UPDATE_TIME between", value1, value2, "wtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWtUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("WT_UPDATE_TIME not between", value1, value2, "wtUpdateTime");
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