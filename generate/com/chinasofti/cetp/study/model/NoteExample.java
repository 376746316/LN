package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoteExample() {
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

        public Criteria andNoteIdIsNull() {
            addCriterion("NOTE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNotNull() {
            addCriterion("NOTE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNoteIdEqualTo(Integer value) {
            addCriterion("NOTE_ID =", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotEqualTo(Integer value) {
            addCriterion("NOTE_ID <>", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThan(Integer value) {
            addCriterion("NOTE_ID >", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NOTE_ID >=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThan(Integer value) {
            addCriterion("NOTE_ID <", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThanOrEqualTo(Integer value) {
            addCriterion("NOTE_ID <=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdIn(List<Integer> values) {
            addCriterion("NOTE_ID in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotIn(List<Integer> values) {
            addCriterion("NOTE_ID not in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdBetween(Integer value1, Integer value2) {
            addCriterion("NOTE_ID between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NOTE_ID not between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteScidIsNull() {
            addCriterion("NOTE_SCID is null");
            return (Criteria) this;
        }

        public Criteria andNoteScidIsNotNull() {
            addCriterion("NOTE_SCID is not null");
            return (Criteria) this;
        }

        public Criteria andNoteScidEqualTo(Integer value) {
            addCriterion("NOTE_SCID =", value, "noteScid");
            return (Criteria) this;
        }

        public Criteria andNoteScidNotEqualTo(Integer value) {
            addCriterion("NOTE_SCID <>", value, "noteScid");
            return (Criteria) this;
        }

        public Criteria andNoteScidGreaterThan(Integer value) {
            addCriterion("NOTE_SCID >", value, "noteScid");
            return (Criteria) this;
        }

        public Criteria andNoteScidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NOTE_SCID >=", value, "noteScid");
            return (Criteria) this;
        }

        public Criteria andNoteScidLessThan(Integer value) {
            addCriterion("NOTE_SCID <", value, "noteScid");
            return (Criteria) this;
        }

        public Criteria andNoteScidLessThanOrEqualTo(Integer value) {
            addCriterion("NOTE_SCID <=", value, "noteScid");
            return (Criteria) this;
        }

        public Criteria andNoteScidIn(List<Integer> values) {
            addCriterion("NOTE_SCID in", values, "noteScid");
            return (Criteria) this;
        }

        public Criteria andNoteScidNotIn(List<Integer> values) {
            addCriterion("NOTE_SCID not in", values, "noteScid");
            return (Criteria) this;
        }

        public Criteria andNoteScidBetween(Integer value1, Integer value2) {
            addCriterion("NOTE_SCID between", value1, value2, "noteScid");
            return (Criteria) this;
        }

        public Criteria andNoteScidNotBetween(Integer value1, Integer value2) {
            addCriterion("NOTE_SCID not between", value1, value2, "noteScid");
            return (Criteria) this;
        }

        public Criteria andNoteStuNoIsNull() {
            addCriterion("NOTE_STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andNoteStuNoIsNotNull() {
            addCriterion("NOTE_STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andNoteStuNoEqualTo(Integer value) {
            addCriterion("NOTE_STU_NO =", value, "noteStuNo");
            return (Criteria) this;
        }

        public Criteria andNoteStuNoNotEqualTo(Integer value) {
            addCriterion("NOTE_STU_NO <>", value, "noteStuNo");
            return (Criteria) this;
        }

        public Criteria andNoteStuNoGreaterThan(Integer value) {
            addCriterion("NOTE_STU_NO >", value, "noteStuNo");
            return (Criteria) this;
        }

        public Criteria andNoteStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("NOTE_STU_NO >=", value, "noteStuNo");
            return (Criteria) this;
        }

        public Criteria andNoteStuNoLessThan(Integer value) {
            addCriterion("NOTE_STU_NO <", value, "noteStuNo");
            return (Criteria) this;
        }

        public Criteria andNoteStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("NOTE_STU_NO <=", value, "noteStuNo");
            return (Criteria) this;
        }

        public Criteria andNoteStuNoIn(List<Integer> values) {
            addCriterion("NOTE_STU_NO in", values, "noteStuNo");
            return (Criteria) this;
        }

        public Criteria andNoteStuNoNotIn(List<Integer> values) {
            addCriterion("NOTE_STU_NO not in", values, "noteStuNo");
            return (Criteria) this;
        }

        public Criteria andNoteStuNoBetween(Integer value1, Integer value2) {
            addCriterion("NOTE_STU_NO between", value1, value2, "noteStuNo");
            return (Criteria) this;
        }

        public Criteria andNoteStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("NOTE_STU_NO not between", value1, value2, "noteStuNo");
            return (Criteria) this;
        }

        public Criteria andNotePlayTimeIsNull() {
            addCriterion("NOTE_PLAY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andNotePlayTimeIsNotNull() {
            addCriterion("NOTE_PLAY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andNotePlayTimeEqualTo(String value) {
            addCriterion("NOTE_PLAY_TIME =", value, "notePlayTime");
            return (Criteria) this;
        }

        public Criteria andNotePlayTimeNotEqualTo(String value) {
            addCriterion("NOTE_PLAY_TIME <>", value, "notePlayTime");
            return (Criteria) this;
        }

        public Criteria andNotePlayTimeGreaterThan(String value) {
            addCriterion("NOTE_PLAY_TIME >", value, "notePlayTime");
            return (Criteria) this;
        }

        public Criteria andNotePlayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE_PLAY_TIME >=", value, "notePlayTime");
            return (Criteria) this;
        }

        public Criteria andNotePlayTimeLessThan(String value) {
            addCriterion("NOTE_PLAY_TIME <", value, "notePlayTime");
            return (Criteria) this;
        }

        public Criteria andNotePlayTimeLessThanOrEqualTo(String value) {
            addCriterion("NOTE_PLAY_TIME <=", value, "notePlayTime");
            return (Criteria) this;
        }

        public Criteria andNotePlayTimeLike(String value) {
            addCriterion("NOTE_PLAY_TIME like", value, "notePlayTime");
            return (Criteria) this;
        }

        public Criteria andNotePlayTimeNotLike(String value) {
            addCriterion("NOTE_PLAY_TIME not like", value, "notePlayTime");
            return (Criteria) this;
        }

        public Criteria andNotePlayTimeIn(List<String> values) {
            addCriterion("NOTE_PLAY_TIME in", values, "notePlayTime");
            return (Criteria) this;
        }

        public Criteria andNotePlayTimeNotIn(List<String> values) {
            addCriterion("NOTE_PLAY_TIME not in", values, "notePlayTime");
            return (Criteria) this;
        }

        public Criteria andNotePlayTimeBetween(String value1, String value2) {
            addCriterion("NOTE_PLAY_TIME between", value1, value2, "notePlayTime");
            return (Criteria) this;
        }

        public Criteria andNotePlayTimeNotBetween(String value1, String value2) {
            addCriterion("NOTE_PLAY_TIME not between", value1, value2, "notePlayTime");
            return (Criteria) this;
        }

        public Criteria andNoteRegtimeIsNull() {
            addCriterion("NOTE_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andNoteRegtimeIsNotNull() {
            addCriterion("NOTE_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andNoteRegtimeEqualTo(Date value) {
            addCriterion("NOTE_REGTIME =", value, "noteRegtime");
            return (Criteria) this;
        }

        public Criteria andNoteRegtimeNotEqualTo(Date value) {
            addCriterion("NOTE_REGTIME <>", value, "noteRegtime");
            return (Criteria) this;
        }

        public Criteria andNoteRegtimeGreaterThan(Date value) {
            addCriterion("NOTE_REGTIME >", value, "noteRegtime");
            return (Criteria) this;
        }

        public Criteria andNoteRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NOTE_REGTIME >=", value, "noteRegtime");
            return (Criteria) this;
        }

        public Criteria andNoteRegtimeLessThan(Date value) {
            addCriterion("NOTE_REGTIME <", value, "noteRegtime");
            return (Criteria) this;
        }

        public Criteria andNoteRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("NOTE_REGTIME <=", value, "noteRegtime");
            return (Criteria) this;
        }

        public Criteria andNoteRegtimeIn(List<Date> values) {
            addCriterion("NOTE_REGTIME in", values, "noteRegtime");
            return (Criteria) this;
        }

        public Criteria andNoteRegtimeNotIn(List<Date> values) {
            addCriterion("NOTE_REGTIME not in", values, "noteRegtime");
            return (Criteria) this;
        }

        public Criteria andNoteRegtimeBetween(Date value1, Date value2) {
            addCriterion("NOTE_REGTIME between", value1, value2, "noteRegtime");
            return (Criteria) this;
        }

        public Criteria andNoteRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("NOTE_REGTIME not between", value1, value2, "noteRegtime");
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