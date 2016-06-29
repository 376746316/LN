package com.chinasofti.cetp.live.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiveCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiveCourseExample() {
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

        public Criteria andLiveCourseIdIsNull() {
            addCriterion("LIVE_COURSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLiveCourseIdIsNotNull() {
            addCriterion("LIVE_COURSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLiveCourseIdEqualTo(Integer value) {
            addCriterion("LIVE_COURSE_ID =", value, "liveCourseId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseIdNotEqualTo(Integer value) {
            addCriterion("LIVE_COURSE_ID <>", value, "liveCourseId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseIdGreaterThan(Integer value) {
            addCriterion("LIVE_COURSE_ID >", value, "liveCourseId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIVE_COURSE_ID >=", value, "liveCourseId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseIdLessThan(Integer value) {
            addCriterion("LIVE_COURSE_ID <", value, "liveCourseId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("LIVE_COURSE_ID <=", value, "liveCourseId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseIdIn(List<Integer> values) {
            addCriterion("LIVE_COURSE_ID in", values, "liveCourseId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseIdNotIn(List<Integer> values) {
            addCriterion("LIVE_COURSE_ID not in", values, "liveCourseId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_COURSE_ID between", value1, value2, "liveCourseId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_COURSE_ID not between", value1, value2, "liveCourseId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseChapIdIsNull() {
            addCriterion("LIVE_COURSE_CHAP_ID is null");
            return (Criteria) this;
        }

        public Criteria andLiveCourseChapIdIsNotNull() {
            addCriterion("LIVE_COURSE_CHAP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLiveCourseChapIdEqualTo(Integer value) {
            addCriterion("LIVE_COURSE_CHAP_ID =", value, "liveCourseChapId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseChapIdNotEqualTo(Integer value) {
            addCriterion("LIVE_COURSE_CHAP_ID <>", value, "liveCourseChapId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseChapIdGreaterThan(Integer value) {
            addCriterion("LIVE_COURSE_CHAP_ID >", value, "liveCourseChapId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseChapIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIVE_COURSE_CHAP_ID >=", value, "liveCourseChapId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseChapIdLessThan(Integer value) {
            addCriterion("LIVE_COURSE_CHAP_ID <", value, "liveCourseChapId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseChapIdLessThanOrEqualTo(Integer value) {
            addCriterion("LIVE_COURSE_CHAP_ID <=", value, "liveCourseChapId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseChapIdIn(List<Integer> values) {
            addCriterion("LIVE_COURSE_CHAP_ID in", values, "liveCourseChapId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseChapIdNotIn(List<Integer> values) {
            addCriterion("LIVE_COURSE_CHAP_ID not in", values, "liveCourseChapId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseChapIdBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_COURSE_CHAP_ID between", value1, value2, "liveCourseChapId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseChapIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_COURSE_CHAP_ID not between", value1, value2, "liveCourseChapId");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTitleIsNull() {
            addCriterion("LIVE_COURSE_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTitleIsNotNull() {
            addCriterion("LIVE_COURSE_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTitleEqualTo(String value) {
            addCriterion("LIVE_COURSE_TITLE =", value, "liveCourseTitle");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTitleNotEqualTo(String value) {
            addCriterion("LIVE_COURSE_TITLE <>", value, "liveCourseTitle");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTitleGreaterThan(String value) {
            addCriterion("LIVE_COURSE_TITLE >", value, "liveCourseTitle");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTitleGreaterThanOrEqualTo(String value) {
            addCriterion("LIVE_COURSE_TITLE >=", value, "liveCourseTitle");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTitleLessThan(String value) {
            addCriterion("LIVE_COURSE_TITLE <", value, "liveCourseTitle");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTitleLessThanOrEqualTo(String value) {
            addCriterion("LIVE_COURSE_TITLE <=", value, "liveCourseTitle");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTitleLike(String value) {
            addCriterion("LIVE_COURSE_TITLE like", value, "liveCourseTitle");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTitleNotLike(String value) {
            addCriterion("LIVE_COURSE_TITLE not like", value, "liveCourseTitle");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTitleIn(List<String> values) {
            addCriterion("LIVE_COURSE_TITLE in", values, "liveCourseTitle");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTitleNotIn(List<String> values) {
            addCriterion("LIVE_COURSE_TITLE not in", values, "liveCourseTitle");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTitleBetween(String value1, String value2) {
            addCriterion("LIVE_COURSE_TITLE between", value1, value2, "liveCourseTitle");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTitleNotBetween(String value1, String value2) {
            addCriterion("LIVE_COURSE_TITLE not between", value1, value2, "liveCourseTitle");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStartIsNull() {
            addCriterion("LIVE_COURSE_START is null");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStartIsNotNull() {
            addCriterion("LIVE_COURSE_START is not null");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStartEqualTo(Date value) {
            addCriterion("LIVE_COURSE_START =", value, "liveCourseStart");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStartNotEqualTo(Date value) {
            addCriterion("LIVE_COURSE_START <>", value, "liveCourseStart");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStartGreaterThan(Date value) {
            addCriterion("LIVE_COURSE_START >", value, "liveCourseStart");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStartGreaterThanOrEqualTo(Date value) {
            addCriterion("LIVE_COURSE_START >=", value, "liveCourseStart");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStartLessThan(Date value) {
            addCriterion("LIVE_COURSE_START <", value, "liveCourseStart");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStartLessThanOrEqualTo(Date value) {
            addCriterion("LIVE_COURSE_START <=", value, "liveCourseStart");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStartIn(List<Date> values) {
            addCriterion("LIVE_COURSE_START in", values, "liveCourseStart");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStartNotIn(List<Date> values) {
            addCriterion("LIVE_COURSE_START not in", values, "liveCourseStart");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStartBetween(Date value1, Date value2) {
            addCriterion("LIVE_COURSE_START between", value1, value2, "liveCourseStart");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStartNotBetween(Date value1, Date value2) {
            addCriterion("LIVE_COURSE_START not between", value1, value2, "liveCourseStart");
            return (Criteria) this;
        }

        public Criteria andLiveCourseEndIsNull() {
            addCriterion("LIVE_COURSE_END is null");
            return (Criteria) this;
        }

        public Criteria andLiveCourseEndIsNotNull() {
            addCriterion("LIVE_COURSE_END is not null");
            return (Criteria) this;
        }

        public Criteria andLiveCourseEndEqualTo(Date value) {
            addCriterion("LIVE_COURSE_END =", value, "liveCourseEnd");
            return (Criteria) this;
        }

        public Criteria andLiveCourseEndNotEqualTo(Date value) {
            addCriterion("LIVE_COURSE_END <>", value, "liveCourseEnd");
            return (Criteria) this;
        }

        public Criteria andLiveCourseEndGreaterThan(Date value) {
            addCriterion("LIVE_COURSE_END >", value, "liveCourseEnd");
            return (Criteria) this;
        }

        public Criteria andLiveCourseEndGreaterThanOrEqualTo(Date value) {
            addCriterion("LIVE_COURSE_END >=", value, "liveCourseEnd");
            return (Criteria) this;
        }

        public Criteria andLiveCourseEndLessThan(Date value) {
            addCriterion("LIVE_COURSE_END <", value, "liveCourseEnd");
            return (Criteria) this;
        }

        public Criteria andLiveCourseEndLessThanOrEqualTo(Date value) {
            addCriterion("LIVE_COURSE_END <=", value, "liveCourseEnd");
            return (Criteria) this;
        }

        public Criteria andLiveCourseEndIn(List<Date> values) {
            addCriterion("LIVE_COURSE_END in", values, "liveCourseEnd");
            return (Criteria) this;
        }

        public Criteria andLiveCourseEndNotIn(List<Date> values) {
            addCriterion("LIVE_COURSE_END not in", values, "liveCourseEnd");
            return (Criteria) this;
        }

        public Criteria andLiveCourseEndBetween(Date value1, Date value2) {
            addCriterion("LIVE_COURSE_END between", value1, value2, "liveCourseEnd");
            return (Criteria) this;
        }

        public Criteria andLiveCourseEndNotBetween(Date value1, Date value2) {
            addCriterion("LIVE_COURSE_END not between", value1, value2, "liveCourseEnd");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTimeIsNull() {
            addCriterion("LIVE_COURSE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTimeIsNotNull() {
            addCriterion("LIVE_COURSE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTimeEqualTo(Integer value) {
            addCriterion("LIVE_COURSE_TIME =", value, "liveCourseTime");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTimeNotEqualTo(Integer value) {
            addCriterion("LIVE_COURSE_TIME <>", value, "liveCourseTime");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTimeGreaterThan(Integer value) {
            addCriterion("LIVE_COURSE_TIME >", value, "liveCourseTime");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIVE_COURSE_TIME >=", value, "liveCourseTime");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTimeLessThan(Integer value) {
            addCriterion("LIVE_COURSE_TIME <", value, "liveCourseTime");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("LIVE_COURSE_TIME <=", value, "liveCourseTime");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTimeIn(List<Integer> values) {
            addCriterion("LIVE_COURSE_TIME in", values, "liveCourseTime");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTimeNotIn(List<Integer> values) {
            addCriterion("LIVE_COURSE_TIME not in", values, "liveCourseTime");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTimeBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_COURSE_TIME between", value1, value2, "liveCourseTime");
            return (Criteria) this;
        }

        public Criteria andLiveCourseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("LIVE_COURSE_TIME not between", value1, value2, "liveCourseTime");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStatusIsNull() {
            addCriterion("LIVE_COURSE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStatusIsNotNull() {
            addCriterion("LIVE_COURSE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStatusEqualTo(String value) {
            addCriterion("LIVE_COURSE_STATUS =", value, "liveCourseStatus");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStatusNotEqualTo(String value) {
            addCriterion("LIVE_COURSE_STATUS <>", value, "liveCourseStatus");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStatusGreaterThan(String value) {
            addCriterion("LIVE_COURSE_STATUS >", value, "liveCourseStatus");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("LIVE_COURSE_STATUS >=", value, "liveCourseStatus");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStatusLessThan(String value) {
            addCriterion("LIVE_COURSE_STATUS <", value, "liveCourseStatus");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStatusLessThanOrEqualTo(String value) {
            addCriterion("LIVE_COURSE_STATUS <=", value, "liveCourseStatus");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStatusLike(String value) {
            addCriterion("LIVE_COURSE_STATUS like", value, "liveCourseStatus");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStatusNotLike(String value) {
            addCriterion("LIVE_COURSE_STATUS not like", value, "liveCourseStatus");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStatusIn(List<String> values) {
            addCriterion("LIVE_COURSE_STATUS in", values, "liveCourseStatus");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStatusNotIn(List<String> values) {
            addCriterion("LIVE_COURSE_STATUS not in", values, "liveCourseStatus");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStatusBetween(String value1, String value2) {
            addCriterion("LIVE_COURSE_STATUS between", value1, value2, "liveCourseStatus");
            return (Criteria) this;
        }

        public Criteria andLiveCourseStatusNotBetween(String value1, String value2) {
            addCriterion("LIVE_COURSE_STATUS not between", value1, value2, "liveCourseStatus");
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