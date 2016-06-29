package com.chinasofti.cetp.live.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiveLCDocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiveLCDocExample() {
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

        public Criteria andLcdLcIdIsNull() {
            addCriterion("LCD_LC_ID is null");
            return (Criteria) this;
        }

        public Criteria andLcdLcIdIsNotNull() {
            addCriterion("LCD_LC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLcdLcIdEqualTo(Integer value) {
            addCriterion("LCD_LC_ID =", value, "lcdLcId");
            return (Criteria) this;
        }

        public Criteria andLcdLcIdNotEqualTo(Integer value) {
            addCriterion("LCD_LC_ID <>", value, "lcdLcId");
            return (Criteria) this;
        }

        public Criteria andLcdLcIdGreaterThan(Integer value) {
            addCriterion("LCD_LC_ID >", value, "lcdLcId");
            return (Criteria) this;
        }

        public Criteria andLcdLcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LCD_LC_ID >=", value, "lcdLcId");
            return (Criteria) this;
        }

        public Criteria andLcdLcIdLessThan(Integer value) {
            addCriterion("LCD_LC_ID <", value, "lcdLcId");
            return (Criteria) this;
        }

        public Criteria andLcdLcIdLessThanOrEqualTo(Integer value) {
            addCriterion("LCD_LC_ID <=", value, "lcdLcId");
            return (Criteria) this;
        }

        public Criteria andLcdLcIdIn(List<Integer> values) {
            addCriterion("LCD_LC_ID in", values, "lcdLcId");
            return (Criteria) this;
        }

        public Criteria andLcdLcIdNotIn(List<Integer> values) {
            addCriterion("LCD_LC_ID not in", values, "lcdLcId");
            return (Criteria) this;
        }

        public Criteria andLcdLcIdBetween(Integer value1, Integer value2) {
            addCriterion("LCD_LC_ID between", value1, value2, "lcdLcId");
            return (Criteria) this;
        }

        public Criteria andLcdLcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LCD_LC_ID not between", value1, value2, "lcdLcId");
            return (Criteria) this;
        }

        public Criteria andLcdFilenameIsNull() {
            addCriterion("LCD_FILENAME is null");
            return (Criteria) this;
        }

        public Criteria andLcdFilenameIsNotNull() {
            addCriterion("LCD_FILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andLcdFilenameEqualTo(String value) {
            addCriterion("LCD_FILENAME =", value, "lcdFilename");
            return (Criteria) this;
        }

        public Criteria andLcdFilenameNotEqualTo(String value) {
            addCriterion("LCD_FILENAME <>", value, "lcdFilename");
            return (Criteria) this;
        }

        public Criteria andLcdFilenameGreaterThan(String value) {
            addCriterion("LCD_FILENAME >", value, "lcdFilename");
            return (Criteria) this;
        }

        public Criteria andLcdFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("LCD_FILENAME >=", value, "lcdFilename");
            return (Criteria) this;
        }

        public Criteria andLcdFilenameLessThan(String value) {
            addCriterion("LCD_FILENAME <", value, "lcdFilename");
            return (Criteria) this;
        }

        public Criteria andLcdFilenameLessThanOrEqualTo(String value) {
            addCriterion("LCD_FILENAME <=", value, "lcdFilename");
            return (Criteria) this;
        }

        public Criteria andLcdFilenameLike(String value) {
            addCriterion("LCD_FILENAME like", value, "lcdFilename");
            return (Criteria) this;
        }

        public Criteria andLcdFilenameNotLike(String value) {
            addCriterion("LCD_FILENAME not like", value, "lcdFilename");
            return (Criteria) this;
        }

        public Criteria andLcdFilenameIn(List<String> values) {
            addCriterion("LCD_FILENAME in", values, "lcdFilename");
            return (Criteria) this;
        }

        public Criteria andLcdFilenameNotIn(List<String> values) {
            addCriterion("LCD_FILENAME not in", values, "lcdFilename");
            return (Criteria) this;
        }

        public Criteria andLcdFilenameBetween(String value1, String value2) {
            addCriterion("LCD_FILENAME between", value1, value2, "lcdFilename");
            return (Criteria) this;
        }

        public Criteria andLcdFilenameNotBetween(String value1, String value2) {
            addCriterion("LCD_FILENAME not between", value1, value2, "lcdFilename");
            return (Criteria) this;
        }

        public Criteria andLcdRegtimeIsNull() {
            addCriterion("LCD_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andLcdRegtimeIsNotNull() {
            addCriterion("LCD_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLcdRegtimeEqualTo(Date value) {
            addCriterion("LCD_REGTIME =", value, "lcdRegtime");
            return (Criteria) this;
        }

        public Criteria andLcdRegtimeNotEqualTo(Date value) {
            addCriterion("LCD_REGTIME <>", value, "lcdRegtime");
            return (Criteria) this;
        }

        public Criteria andLcdRegtimeGreaterThan(Date value) {
            addCriterion("LCD_REGTIME >", value, "lcdRegtime");
            return (Criteria) this;
        }

        public Criteria andLcdRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LCD_REGTIME >=", value, "lcdRegtime");
            return (Criteria) this;
        }

        public Criteria andLcdRegtimeLessThan(Date value) {
            addCriterion("LCD_REGTIME <", value, "lcdRegtime");
            return (Criteria) this;
        }

        public Criteria andLcdRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("LCD_REGTIME <=", value, "lcdRegtime");
            return (Criteria) this;
        }

        public Criteria andLcdRegtimeIn(List<Date> values) {
            addCriterion("LCD_REGTIME in", values, "lcdRegtime");
            return (Criteria) this;
        }

        public Criteria andLcdRegtimeNotIn(List<Date> values) {
            addCriterion("LCD_REGTIME not in", values, "lcdRegtime");
            return (Criteria) this;
        }

        public Criteria andLcdRegtimeBetween(Date value1, Date value2) {
            addCriterion("LCD_REGTIME between", value1, value2, "lcdRegtime");
            return (Criteria) this;
        }

        public Criteria andLcdRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("LCD_REGTIME not between", value1, value2, "lcdRegtime");
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