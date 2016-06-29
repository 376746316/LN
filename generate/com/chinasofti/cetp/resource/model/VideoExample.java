package com.chinasofti.cetp.resource.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVIdIsNull() {
            addCriterion("V_ID is null");
            return (Criteria) this;
        }

        public Criteria andVIdIsNotNull() {
            addCriterion("V_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVIdEqualTo(Integer value) {
            addCriterion("V_ID =", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotEqualTo(Integer value) {
            addCriterion("V_ID <>", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdGreaterThan(Integer value) {
            addCriterion("V_ID >", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("V_ID >=", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdLessThan(Integer value) {
            addCriterion("V_ID <", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdLessThanOrEqualTo(Integer value) {
            addCriterion("V_ID <=", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdIn(List<Integer> values) {
            addCriterion("V_ID in", values, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotIn(List<Integer> values) {
            addCriterion("V_ID not in", values, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdBetween(Integer value1, Integer value2) {
            addCriterion("V_ID between", value1, value2, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotBetween(Integer value1, Integer value2) {
            addCriterion("V_ID not between", value1, value2, "vId");
            return (Criteria) this;
        }

        public Criteria andVTechTypeIsNull() {
            addCriterion("V_TECH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVTechTypeIsNotNull() {
            addCriterion("V_TECH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVTechTypeEqualTo(Integer value) {
            addCriterion("V_TECH_TYPE =", value, "vTechType");
            return (Criteria) this;
        }

        public Criteria andVTechTypeNotEqualTo(Integer value) {
            addCriterion("V_TECH_TYPE <>", value, "vTechType");
            return (Criteria) this;
        }

        public Criteria andVTechTypeGreaterThan(Integer value) {
            addCriterion("V_TECH_TYPE >", value, "vTechType");
            return (Criteria) this;
        }

        public Criteria andVTechTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("V_TECH_TYPE >=", value, "vTechType");
            return (Criteria) this;
        }

        public Criteria andVTechTypeLessThan(Integer value) {
            addCriterion("V_TECH_TYPE <", value, "vTechType");
            return (Criteria) this;
        }

        public Criteria andVTechTypeLessThanOrEqualTo(Integer value) {
            addCriterion("V_TECH_TYPE <=", value, "vTechType");
            return (Criteria) this;
        }

        public Criteria andVTechTypeIn(List<Integer> values) {
            addCriterion("V_TECH_TYPE in", values, "vTechType");
            return (Criteria) this;
        }

        public Criteria andVTechTypeNotIn(List<Integer> values) {
            addCriterion("V_TECH_TYPE not in", values, "vTechType");
            return (Criteria) this;
        }

        public Criteria andVTechTypeBetween(Integer value1, Integer value2) {
            addCriterion("V_TECH_TYPE between", value1, value2, "vTechType");
            return (Criteria) this;
        }

        public Criteria andVTechTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("V_TECH_TYPE not between", value1, value2, "vTechType");
            return (Criteria) this;
        }

        public Criteria andVStatusIsNull() {
            addCriterion("V_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andVStatusIsNotNull() {
            addCriterion("V_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andVStatusEqualTo(String value) {
            addCriterion("V_STATUS =", value, "vStatus");
            return (Criteria) this;
        }

        public Criteria andVStatusNotEqualTo(String value) {
            addCriterion("V_STATUS <>", value, "vStatus");
            return (Criteria) this;
        }

        public Criteria andVStatusGreaterThan(String value) {
            addCriterion("V_STATUS >", value, "vStatus");
            return (Criteria) this;
        }

        public Criteria andVStatusGreaterThanOrEqualTo(String value) {
            addCriterion("V_STATUS >=", value, "vStatus");
            return (Criteria) this;
        }

        public Criteria andVStatusLessThan(String value) {
            addCriterion("V_STATUS <", value, "vStatus");
            return (Criteria) this;
        }

        public Criteria andVStatusLessThanOrEqualTo(String value) {
            addCriterion("V_STATUS <=", value, "vStatus");
            return (Criteria) this;
        }

        public Criteria andVStatusLike(String value) {
            addCriterion("V_STATUS like", value, "vStatus");
            return (Criteria) this;
        }

        public Criteria andVStatusNotLike(String value) {
            addCriterion("V_STATUS not like", value, "vStatus");
            return (Criteria) this;
        }

        public Criteria andVStatusIn(List<String> values) {
            addCriterion("V_STATUS in", values, "vStatus");
            return (Criteria) this;
        }

        public Criteria andVStatusNotIn(List<String> values) {
            addCriterion("V_STATUS not in", values, "vStatus");
            return (Criteria) this;
        }

        public Criteria andVStatusBetween(String value1, String value2) {
            addCriterion("V_STATUS between", value1, value2, "vStatus");
            return (Criteria) this;
        }

        public Criteria andVStatusNotBetween(String value1, String value2) {
            addCriterion("V_STATUS not between", value1, value2, "vStatus");
            return (Criteria) this;
        }

        public Criteria andVTypeIsNull() {
            addCriterion("V_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVTypeIsNotNull() {
            addCriterion("V_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVTypeEqualTo(String value) {
            addCriterion("V_TYPE =", value, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeNotEqualTo(String value) {
            addCriterion("V_TYPE <>", value, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeGreaterThan(String value) {
            addCriterion("V_TYPE >", value, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeGreaterThanOrEqualTo(String value) {
            addCriterion("V_TYPE >=", value, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeLessThan(String value) {
            addCriterion("V_TYPE <", value, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeLessThanOrEqualTo(String value) {
            addCriterion("V_TYPE <=", value, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeLike(String value) {
            addCriterion("V_TYPE like", value, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeNotLike(String value) {
            addCriterion("V_TYPE not like", value, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeIn(List<String> values) {
            addCriterion("V_TYPE in", values, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeNotIn(List<String> values) {
            addCriterion("V_TYPE not in", values, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeBetween(String value1, String value2) {
            addCriterion("V_TYPE between", value1, value2, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeNotBetween(String value1, String value2) {
            addCriterion("V_TYPE not between", value1, value2, "vType");
            return (Criteria) this;
        }

        public Criteria andVFileNameIsNull() {
            addCriterion("V_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVFileNameIsNotNull() {
            addCriterion("V_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVFileNameEqualTo(String value) {
            addCriterion("V_FILE_NAME =", value, "vFileName");
            return (Criteria) this;
        }

        public Criteria andVFileNameNotEqualTo(String value) {
            addCriterion("V_FILE_NAME <>", value, "vFileName");
            return (Criteria) this;
        }

        public Criteria andVFileNameGreaterThan(String value) {
            addCriterion("V_FILE_NAME >", value, "vFileName");
            return (Criteria) this;
        }

        public Criteria andVFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("V_FILE_NAME >=", value, "vFileName");
            return (Criteria) this;
        }

        public Criteria andVFileNameLessThan(String value) {
            addCriterion("V_FILE_NAME <", value, "vFileName");
            return (Criteria) this;
        }

        public Criteria andVFileNameLessThanOrEqualTo(String value) {
            addCriterion("V_FILE_NAME <=", value, "vFileName");
            return (Criteria) this;
        }

        public Criteria andVFileNameLike(String value) {
            addCriterion("V_FILE_NAME like", value, "vFileName");
            return (Criteria) this;
        }

        public Criteria andVFileNameNotLike(String value) {
            addCriterion("V_FILE_NAME not like", value, "vFileName");
            return (Criteria) this;
        }

        public Criteria andVFileNameIn(List<String> values) {
            addCriterion("V_FILE_NAME in", values, "vFileName");
            return (Criteria) this;
        }

        public Criteria andVFileNameNotIn(List<String> values) {
            addCriterion("V_FILE_NAME not in", values, "vFileName");
            return (Criteria) this;
        }

        public Criteria andVFileNameBetween(String value1, String value2) {
            addCriterion("V_FILE_NAME between", value1, value2, "vFileName");
            return (Criteria) this;
        }

        public Criteria andVFileNameNotBetween(String value1, String value2) {
            addCriterion("V_FILE_NAME not between", value1, value2, "vFileName");
            return (Criteria) this;
        }

        public Criteria andVNameIsNull() {
            addCriterion("V_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVNameIsNotNull() {
            addCriterion("V_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVNameEqualTo(String value) {
            addCriterion("V_NAME =", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotEqualTo(String value) {
            addCriterion("V_NAME <>", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameGreaterThan(String value) {
            addCriterion("V_NAME >", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameGreaterThanOrEqualTo(String value) {
            addCriterion("V_NAME >=", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLessThan(String value) {
            addCriterion("V_NAME <", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLessThanOrEqualTo(String value) {
            addCriterion("V_NAME <=", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLike(String value) {
            addCriterion("V_NAME like", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotLike(String value) {
            addCriterion("V_NAME not like", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameIn(List<String> values) {
            addCriterion("V_NAME in", values, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotIn(List<String> values) {
            addCriterion("V_NAME not in", values, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameBetween(String value1, String value2) {
            addCriterion("V_NAME between", value1, value2, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotBetween(String value1, String value2) {
            addCriterion("V_NAME not between", value1, value2, "vName");
            return (Criteria) this;
        }

        public Criteria andVPlayCountIsNull() {
            addCriterion("V_PLAY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andVPlayCountIsNotNull() {
            addCriterion("V_PLAY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andVPlayCountEqualTo(Integer value) {
            addCriterion("V_PLAY_COUNT =", value, "vPlayCount");
            return (Criteria) this;
        }

        public Criteria andVPlayCountNotEqualTo(Integer value) {
            addCriterion("V_PLAY_COUNT <>", value, "vPlayCount");
            return (Criteria) this;
        }

        public Criteria andVPlayCountGreaterThan(Integer value) {
            addCriterion("V_PLAY_COUNT >", value, "vPlayCount");
            return (Criteria) this;
        }

        public Criteria andVPlayCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("V_PLAY_COUNT >=", value, "vPlayCount");
            return (Criteria) this;
        }

        public Criteria andVPlayCountLessThan(Integer value) {
            addCriterion("V_PLAY_COUNT <", value, "vPlayCount");
            return (Criteria) this;
        }

        public Criteria andVPlayCountLessThanOrEqualTo(Integer value) {
            addCriterion("V_PLAY_COUNT <=", value, "vPlayCount");
            return (Criteria) this;
        }

        public Criteria andVPlayCountIn(List<Integer> values) {
            addCriterion("V_PLAY_COUNT in", values, "vPlayCount");
            return (Criteria) this;
        }

        public Criteria andVPlayCountNotIn(List<Integer> values) {
            addCriterion("V_PLAY_COUNT not in", values, "vPlayCount");
            return (Criteria) this;
        }

        public Criteria andVPlayCountBetween(Integer value1, Integer value2) {
            addCriterion("V_PLAY_COUNT between", value1, value2, "vPlayCount");
            return (Criteria) this;
        }

        public Criteria andVPlayCountNotBetween(Integer value1, Integer value2) {
            addCriterion("V_PLAY_COUNT not between", value1, value2, "vPlayCount");
            return (Criteria) this;
        }

        public Criteria andVDownloadCountIsNull() {
            addCriterion("V_DOWNLOAD_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andVDownloadCountIsNotNull() {
            addCriterion("V_DOWNLOAD_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andVDownloadCountEqualTo(Integer value) {
            addCriterion("V_DOWNLOAD_COUNT =", value, "vDownloadCount");
            return (Criteria) this;
        }

        public Criteria andVDownloadCountNotEqualTo(Integer value) {
            addCriterion("V_DOWNLOAD_COUNT <>", value, "vDownloadCount");
            return (Criteria) this;
        }

        public Criteria andVDownloadCountGreaterThan(Integer value) {
            addCriterion("V_DOWNLOAD_COUNT >", value, "vDownloadCount");
            return (Criteria) this;
        }

        public Criteria andVDownloadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("V_DOWNLOAD_COUNT >=", value, "vDownloadCount");
            return (Criteria) this;
        }

        public Criteria andVDownloadCountLessThan(Integer value) {
            addCriterion("V_DOWNLOAD_COUNT <", value, "vDownloadCount");
            return (Criteria) this;
        }

        public Criteria andVDownloadCountLessThanOrEqualTo(Integer value) {
            addCriterion("V_DOWNLOAD_COUNT <=", value, "vDownloadCount");
            return (Criteria) this;
        }

        public Criteria andVDownloadCountIn(List<Integer> values) {
            addCriterion("V_DOWNLOAD_COUNT in", values, "vDownloadCount");
            return (Criteria) this;
        }

        public Criteria andVDownloadCountNotIn(List<Integer> values) {
            addCriterion("V_DOWNLOAD_COUNT not in", values, "vDownloadCount");
            return (Criteria) this;
        }

        public Criteria andVDownloadCountBetween(Integer value1, Integer value2) {
            addCriterion("V_DOWNLOAD_COUNT between", value1, value2, "vDownloadCount");
            return (Criteria) this;
        }

        public Criteria andVDownloadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("V_DOWNLOAD_COUNT not between", value1, value2, "vDownloadCount");
            return (Criteria) this;
        }

        public Criteria andVCommentIsNull() {
            addCriterion("V_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andVCommentIsNotNull() {
            addCriterion("V_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andVCommentEqualTo(String value) {
            addCriterion("V_COMMENT =", value, "vComment");
            return (Criteria) this;
        }

        public Criteria andVCommentNotEqualTo(String value) {
            addCriterion("V_COMMENT <>", value, "vComment");
            return (Criteria) this;
        }

        public Criteria andVCommentGreaterThan(String value) {
            addCriterion("V_COMMENT >", value, "vComment");
            return (Criteria) this;
        }

        public Criteria andVCommentGreaterThanOrEqualTo(String value) {
            addCriterion("V_COMMENT >=", value, "vComment");
            return (Criteria) this;
        }

        public Criteria andVCommentLessThan(String value) {
            addCriterion("V_COMMENT <", value, "vComment");
            return (Criteria) this;
        }

        public Criteria andVCommentLessThanOrEqualTo(String value) {
            addCriterion("V_COMMENT <=", value, "vComment");
            return (Criteria) this;
        }

        public Criteria andVCommentLike(String value) {
            addCriterion("V_COMMENT like", value, "vComment");
            return (Criteria) this;
        }

        public Criteria andVCommentNotLike(String value) {
            addCriterion("V_COMMENT not like", value, "vComment");
            return (Criteria) this;
        }

        public Criteria andVCommentIn(List<String> values) {
            addCriterion("V_COMMENT in", values, "vComment");
            return (Criteria) this;
        }

        public Criteria andVCommentNotIn(List<String> values) {
            addCriterion("V_COMMENT not in", values, "vComment");
            return (Criteria) this;
        }

        public Criteria andVCommentBetween(String value1, String value2) {
            addCriterion("V_COMMENT between", value1, value2, "vComment");
            return (Criteria) this;
        }

        public Criteria andVCommentNotBetween(String value1, String value2) {
            addCriterion("V_COMMENT not between", value1, value2, "vComment");
            return (Criteria) this;
        }

        public Criteria andVRegtimeIsNull() {
            addCriterion("V_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andVRegtimeIsNotNull() {
            addCriterion("V_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andVRegtimeEqualTo(Date value) {
            addCriterion("V_REGTIME =", value, "vRegtime");
            return (Criteria) this;
        }

        public Criteria andVRegtimeNotEqualTo(Date value) {
            addCriterion("V_REGTIME <>", value, "vRegtime");
            return (Criteria) this;
        }

        public Criteria andVRegtimeGreaterThan(Date value) {
            addCriterion("V_REGTIME >", value, "vRegtime");
            return (Criteria) this;
        }

        public Criteria andVRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("V_REGTIME >=", value, "vRegtime");
            return (Criteria) this;
        }

        public Criteria andVRegtimeLessThan(Date value) {
            addCriterion("V_REGTIME <", value, "vRegtime");
            return (Criteria) this;
        }

        public Criteria andVRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("V_REGTIME <=", value, "vRegtime");
            return (Criteria) this;
        }

        public Criteria andVRegtimeIn(List<Date> values) {
            addCriterion("V_REGTIME in", values, "vRegtime");
            return (Criteria) this;
        }

        public Criteria andVRegtimeNotIn(List<Date> values) {
            addCriterion("V_REGTIME not in", values, "vRegtime");
            return (Criteria) this;
        }

        public Criteria andVRegtimeBetween(Date value1, Date value2) {
            addCriterion("V_REGTIME between", value1, value2, "vRegtime");
            return (Criteria) this;
        }

        public Criteria andVRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("V_REGTIME not between", value1, value2, "vRegtime");
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