package com.chinasofti.cetp.resource.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReferenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReferenceExample() {
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

        public Criteria andRefIdIsNull() {
            addCriterion("REF_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNotNull() {
            addCriterion("REF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdEqualTo(Integer value) {
            addCriterion("REF_ID =", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotEqualTo(Integer value) {
            addCriterion("REF_ID <>", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThan(Integer value) {
            addCriterion("REF_ID >", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("REF_ID >=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThan(Integer value) {
            addCriterion("REF_ID <", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThanOrEqualTo(Integer value) {
            addCriterion("REF_ID <=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdIn(List<Integer> values) {
            addCriterion("REF_ID in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotIn(List<Integer> values) {
            addCriterion("REF_ID not in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdBetween(Integer value1, Integer value2) {
            addCriterion("REF_ID between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotBetween(Integer value1, Integer value2) {
            addCriterion("REF_ID not between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefNameIsNull() {
            addCriterion("REF_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRefNameIsNotNull() {
            addCriterion("REF_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRefNameEqualTo(String value) {
            addCriterion("REF_NAME =", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameNotEqualTo(String value) {
            addCriterion("REF_NAME <>", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameGreaterThan(String value) {
            addCriterion("REF_NAME >", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameGreaterThanOrEqualTo(String value) {
            addCriterion("REF_NAME >=", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameLessThan(String value) {
            addCriterion("REF_NAME <", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameLessThanOrEqualTo(String value) {
            addCriterion("REF_NAME <=", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameLike(String value) {
            addCriterion("REF_NAME like", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameNotLike(String value) {
            addCriterion("REF_NAME not like", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameIn(List<String> values) {
            addCriterion("REF_NAME in", values, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameNotIn(List<String> values) {
            addCriterion("REF_NAME not in", values, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameBetween(String value1, String value2) {
            addCriterion("REF_NAME between", value1, value2, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameNotBetween(String value1, String value2) {
            addCriterion("REF_NAME not between", value1, value2, "refName");
            return (Criteria) this;
        }

        public Criteria andRefPlayCountIsNull() {
            addCriterion("REF_PLAY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andRefPlayCountIsNotNull() {
            addCriterion("REF_PLAY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRefPlayCountEqualTo(Integer value) {
            addCriterion("REF_PLAY_COUNT =", value, "refPlayCount");
            return (Criteria) this;
        }

        public Criteria andRefPlayCountNotEqualTo(Integer value) {
            addCriterion("REF_PLAY_COUNT <>", value, "refPlayCount");
            return (Criteria) this;
        }

        public Criteria andRefPlayCountGreaterThan(Integer value) {
            addCriterion("REF_PLAY_COUNT >", value, "refPlayCount");
            return (Criteria) this;
        }

        public Criteria andRefPlayCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("REF_PLAY_COUNT >=", value, "refPlayCount");
            return (Criteria) this;
        }

        public Criteria andRefPlayCountLessThan(Integer value) {
            addCriterion("REF_PLAY_COUNT <", value, "refPlayCount");
            return (Criteria) this;
        }

        public Criteria andRefPlayCountLessThanOrEqualTo(Integer value) {
            addCriterion("REF_PLAY_COUNT <=", value, "refPlayCount");
            return (Criteria) this;
        }

        public Criteria andRefPlayCountIn(List<Integer> values) {
            addCriterion("REF_PLAY_COUNT in", values, "refPlayCount");
            return (Criteria) this;
        }

        public Criteria andRefPlayCountNotIn(List<Integer> values) {
            addCriterion("REF_PLAY_COUNT not in", values, "refPlayCount");
            return (Criteria) this;
        }

        public Criteria andRefPlayCountBetween(Integer value1, Integer value2) {
            addCriterion("REF_PLAY_COUNT between", value1, value2, "refPlayCount");
            return (Criteria) this;
        }

        public Criteria andRefPlayCountNotBetween(Integer value1, Integer value2) {
            addCriterion("REF_PLAY_COUNT not between", value1, value2, "refPlayCount");
            return (Criteria) this;
        }

        public Criteria andRefDownloadCountIsNull() {
            addCriterion("REF_DOWNLOAD_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andRefDownloadCountIsNotNull() {
            addCriterion("REF_DOWNLOAD_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRefDownloadCountEqualTo(Integer value) {
            addCriterion("REF_DOWNLOAD_COUNT =", value, "refDownloadCount");
            return (Criteria) this;
        }

        public Criteria andRefDownloadCountNotEqualTo(Integer value) {
            addCriterion("REF_DOWNLOAD_COUNT <>", value, "refDownloadCount");
            return (Criteria) this;
        }

        public Criteria andRefDownloadCountGreaterThan(Integer value) {
            addCriterion("REF_DOWNLOAD_COUNT >", value, "refDownloadCount");
            return (Criteria) this;
        }

        public Criteria andRefDownloadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("REF_DOWNLOAD_COUNT >=", value, "refDownloadCount");
            return (Criteria) this;
        }

        public Criteria andRefDownloadCountLessThan(Integer value) {
            addCriterion("REF_DOWNLOAD_COUNT <", value, "refDownloadCount");
            return (Criteria) this;
        }

        public Criteria andRefDownloadCountLessThanOrEqualTo(Integer value) {
            addCriterion("REF_DOWNLOAD_COUNT <=", value, "refDownloadCount");
            return (Criteria) this;
        }

        public Criteria andRefDownloadCountIn(List<Integer> values) {
            addCriterion("REF_DOWNLOAD_COUNT in", values, "refDownloadCount");
            return (Criteria) this;
        }

        public Criteria andRefDownloadCountNotIn(List<Integer> values) {
            addCriterion("REF_DOWNLOAD_COUNT not in", values, "refDownloadCount");
            return (Criteria) this;
        }

        public Criteria andRefDownloadCountBetween(Integer value1, Integer value2) {
            addCriterion("REF_DOWNLOAD_COUNT between", value1, value2, "refDownloadCount");
            return (Criteria) this;
        }

        public Criteria andRefDownloadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("REF_DOWNLOAD_COUNT not between", value1, value2, "refDownloadCount");
            return (Criteria) this;
        }

        public Criteria andRefCostIsNull() {
            addCriterion("REF_COST is null");
            return (Criteria) this;
        }

        public Criteria andRefCostIsNotNull() {
            addCriterion("REF_COST is not null");
            return (Criteria) this;
        }

        public Criteria andRefCostEqualTo(Integer value) {
            addCriterion("REF_COST =", value, "refCost");
            return (Criteria) this;
        }

        public Criteria andRefCostNotEqualTo(Integer value) {
            addCriterion("REF_COST <>", value, "refCost");
            return (Criteria) this;
        }

        public Criteria andRefCostGreaterThan(Integer value) {
            addCriterion("REF_COST >", value, "refCost");
            return (Criteria) this;
        }

        public Criteria andRefCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("REF_COST >=", value, "refCost");
            return (Criteria) this;
        }

        public Criteria andRefCostLessThan(Integer value) {
            addCriterion("REF_COST <", value, "refCost");
            return (Criteria) this;
        }

        public Criteria andRefCostLessThanOrEqualTo(Integer value) {
            addCriterion("REF_COST <=", value, "refCost");
            return (Criteria) this;
        }

        public Criteria andRefCostIn(List<Integer> values) {
            addCriterion("REF_COST in", values, "refCost");
            return (Criteria) this;
        }

        public Criteria andRefCostNotIn(List<Integer> values) {
            addCriterion("REF_COST not in", values, "refCost");
            return (Criteria) this;
        }

        public Criteria andRefCostBetween(Integer value1, Integer value2) {
            addCriterion("REF_COST between", value1, value2, "refCost");
            return (Criteria) this;
        }

        public Criteria andRefCostNotBetween(Integer value1, Integer value2) {
            addCriterion("REF_COST not between", value1, value2, "refCost");
            return (Criteria) this;
        }

        public Criteria andRefCommentIsNull() {
            addCriterion("REF_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andRefCommentIsNotNull() {
            addCriterion("REF_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andRefCommentEqualTo(String value) {
            addCriterion("REF_COMMENT =", value, "refComment");
            return (Criteria) this;
        }

        public Criteria andRefCommentNotEqualTo(String value) {
            addCriterion("REF_COMMENT <>", value, "refComment");
            return (Criteria) this;
        }

        public Criteria andRefCommentGreaterThan(String value) {
            addCriterion("REF_COMMENT >", value, "refComment");
            return (Criteria) this;
        }

        public Criteria andRefCommentGreaterThanOrEqualTo(String value) {
            addCriterion("REF_COMMENT >=", value, "refComment");
            return (Criteria) this;
        }

        public Criteria andRefCommentLessThan(String value) {
            addCriterion("REF_COMMENT <", value, "refComment");
            return (Criteria) this;
        }

        public Criteria andRefCommentLessThanOrEqualTo(String value) {
            addCriterion("REF_COMMENT <=", value, "refComment");
            return (Criteria) this;
        }

        public Criteria andRefCommentLike(String value) {
            addCriterion("REF_COMMENT like", value, "refComment");
            return (Criteria) this;
        }

        public Criteria andRefCommentNotLike(String value) {
            addCriterion("REF_COMMENT not like", value, "refComment");
            return (Criteria) this;
        }

        public Criteria andRefCommentIn(List<String> values) {
            addCriterion("REF_COMMENT in", values, "refComment");
            return (Criteria) this;
        }

        public Criteria andRefCommentNotIn(List<String> values) {
            addCriterion("REF_COMMENT not in", values, "refComment");
            return (Criteria) this;
        }

        public Criteria andRefCommentBetween(String value1, String value2) {
            addCriterion("REF_COMMENT between", value1, value2, "refComment");
            return (Criteria) this;
        }

        public Criteria andRefCommentNotBetween(String value1, String value2) {
            addCriterion("REF_COMMENT not between", value1, value2, "refComment");
            return (Criteria) this;
        }

        public Criteria andRefRegtimeIsNull() {
            addCriterion("REF_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andRefRegtimeIsNotNull() {
            addCriterion("REF_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefRegtimeEqualTo(Date value) {
            addCriterion("REF_REGTIME =", value, "refRegtime");
            return (Criteria) this;
        }

        public Criteria andRefRegtimeNotEqualTo(Date value) {
            addCriterion("REF_REGTIME <>", value, "refRegtime");
            return (Criteria) this;
        }

        public Criteria andRefRegtimeGreaterThan(Date value) {
            addCriterion("REF_REGTIME >", value, "refRegtime");
            return (Criteria) this;
        }

        public Criteria andRefRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REF_REGTIME >=", value, "refRegtime");
            return (Criteria) this;
        }

        public Criteria andRefRegtimeLessThan(Date value) {
            addCriterion("REF_REGTIME <", value, "refRegtime");
            return (Criteria) this;
        }

        public Criteria andRefRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("REF_REGTIME <=", value, "refRegtime");
            return (Criteria) this;
        }

        public Criteria andRefRegtimeIn(List<Date> values) {
            addCriterion("REF_REGTIME in", values, "refRegtime");
            return (Criteria) this;
        }

        public Criteria andRefRegtimeNotIn(List<Date> values) {
            addCriterion("REF_REGTIME not in", values, "refRegtime");
            return (Criteria) this;
        }

        public Criteria andRefRegtimeBetween(Date value1, Date value2) {
            addCriterion("REF_REGTIME between", value1, value2, "refRegtime");
            return (Criteria) this;
        }

        public Criteria andRefRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("REF_REGTIME not between", value1, value2, "refRegtime");
            return (Criteria) this;
        }

        public Criteria andRefUserNoIsNull() {
            addCriterion("REF_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andRefUserNoIsNotNull() {
            addCriterion("REF_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRefUserNoEqualTo(Integer value) {
            addCriterion("REF_USER_NO =", value, "refUserNo");
            return (Criteria) this;
        }

        public Criteria andRefUserNoNotEqualTo(Integer value) {
            addCriterion("REF_USER_NO <>", value, "refUserNo");
            return (Criteria) this;
        }

        public Criteria andRefUserNoGreaterThan(Integer value) {
            addCriterion("REF_USER_NO >", value, "refUserNo");
            return (Criteria) this;
        }

        public Criteria andRefUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("REF_USER_NO >=", value, "refUserNo");
            return (Criteria) this;
        }

        public Criteria andRefUserNoLessThan(Integer value) {
            addCriterion("REF_USER_NO <", value, "refUserNo");
            return (Criteria) this;
        }

        public Criteria andRefUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("REF_USER_NO <=", value, "refUserNo");
            return (Criteria) this;
        }

        public Criteria andRefUserNoIn(List<Integer> values) {
            addCriterion("REF_USER_NO in", values, "refUserNo");
            return (Criteria) this;
        }

        public Criteria andRefUserNoNotIn(List<Integer> values) {
            addCriterion("REF_USER_NO not in", values, "refUserNo");
            return (Criteria) this;
        }

        public Criteria andRefUserNoBetween(Integer value1, Integer value2) {
            addCriterion("REF_USER_NO between", value1, value2, "refUserNo");
            return (Criteria) this;
        }

        public Criteria andRefUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("REF_USER_NO not between", value1, value2, "refUserNo");
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