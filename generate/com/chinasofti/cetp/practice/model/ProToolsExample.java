package com.chinasofti.cetp.practice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProToolsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public ProToolsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
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

        public Criteria andPtToolsIdIsNull() {
            addCriterion("PT_TOOLS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPtToolsIdIsNotNull() {
            addCriterion("PT_TOOLS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPtToolsIdEqualTo(Integer value) {
            addCriterion("PT_TOOLS_ID =", value, "ptToolsId");
            return (Criteria) this;
        }

        public Criteria andPtToolsIdNotEqualTo(Integer value) {
            addCriterion("PT_TOOLS_ID <>", value, "ptToolsId");
            return (Criteria) this;
        }

        public Criteria andPtToolsIdGreaterThan(Integer value) {
            addCriterion("PT_TOOLS_ID >", value, "ptToolsId");
            return (Criteria) this;
        }

        public Criteria andPtToolsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PT_TOOLS_ID >=", value, "ptToolsId");
            return (Criteria) this;
        }

        public Criteria andPtToolsIdLessThan(Integer value) {
            addCriterion("PT_TOOLS_ID <", value, "ptToolsId");
            return (Criteria) this;
        }

        public Criteria andPtToolsIdLessThanOrEqualTo(Integer value) {
            addCriterion("PT_TOOLS_ID <=", value, "ptToolsId");
            return (Criteria) this;
        }

        public Criteria andPtToolsIdIn(List<Integer> values) {
            addCriterion("PT_TOOLS_ID in", values, "ptToolsId");
            return (Criteria) this;
        }

        public Criteria andPtToolsIdNotIn(List<Integer> values) {
            addCriterion("PT_TOOLS_ID not in", values, "ptToolsId");
            return (Criteria) this;
        }

        public Criteria andPtToolsIdBetween(Integer value1, Integer value2) {
            addCriterion("PT_TOOLS_ID between", value1, value2, "ptToolsId");
            return (Criteria) this;
        }

        public Criteria andPtToolsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PT_TOOLS_ID not between", value1, value2, "ptToolsId");
            return (Criteria) this;
        }

        public Criteria andPtProIdIsNull() {
            addCriterion("PT_PRO_ID is null");
            return (Criteria) this;
        }

        public Criteria andPtProIdIsNotNull() {
            addCriterion("PT_PRO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPtProIdEqualTo(Integer value) {
            addCriterion("PT_PRO_ID =", value, "ptProId");
            return (Criteria) this;
        }

        public Criteria andPtProIdNotEqualTo(Integer value) {
            addCriterion("PT_PRO_ID <>", value, "ptProId");
            return (Criteria) this;
        }

        public Criteria andPtProIdGreaterThan(Integer value) {
            addCriterion("PT_PRO_ID >", value, "ptProId");
            return (Criteria) this;
        }

        public Criteria andPtProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PT_PRO_ID >=", value, "ptProId");
            return (Criteria) this;
        }

        public Criteria andPtProIdLessThan(Integer value) {
            addCriterion("PT_PRO_ID <", value, "ptProId");
            return (Criteria) this;
        }

        public Criteria andPtProIdLessThanOrEqualTo(Integer value) {
            addCriterion("PT_PRO_ID <=", value, "ptProId");
            return (Criteria) this;
        }

        public Criteria andPtProIdIn(List<Integer> values) {
            addCriterion("PT_PRO_ID in", values, "ptProId");
            return (Criteria) this;
        }

        public Criteria andPtProIdNotIn(List<Integer> values) {
            addCriterion("PT_PRO_ID not in", values, "ptProId");
            return (Criteria) this;
        }

        public Criteria andPtProIdBetween(Integer value1, Integer value2) {
            addCriterion("PT_PRO_ID between", value1, value2, "ptProId");
            return (Criteria) this;
        }

        public Criteria andPtProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PT_PRO_ID not between", value1, value2, "ptProId");
            return (Criteria) this;
        }

        public Criteria andPtToolNameIsNull() {
            addCriterion("PT_TOOL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPtToolNameIsNotNull() {
            addCriterion("PT_TOOL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPtToolNameEqualTo(String value) {
            addCriterion("PT_TOOL_NAME =", value, "ptToolName");
            return (Criteria) this;
        }

        public Criteria andPtToolNameNotEqualTo(String value) {
            addCriterion("PT_TOOL_NAME <>", value, "ptToolName");
            return (Criteria) this;
        }

        public Criteria andPtToolNameGreaterThan(String value) {
            addCriterion("PT_TOOL_NAME >", value, "ptToolName");
            return (Criteria) this;
        }

        public Criteria andPtToolNameGreaterThanOrEqualTo(String value) {
            addCriterion("PT_TOOL_NAME >=", value, "ptToolName");
            return (Criteria) this;
        }

        public Criteria andPtToolNameLessThan(String value) {
            addCriterion("PT_TOOL_NAME <", value, "ptToolName");
            return (Criteria) this;
        }

        public Criteria andPtToolNameLessThanOrEqualTo(String value) {
            addCriterion("PT_TOOL_NAME <=", value, "ptToolName");
            return (Criteria) this;
        }

        public Criteria andPtToolNameLike(String value) {
            addCriterion("PT_TOOL_NAME like", value, "ptToolName");
            return (Criteria) this;
        }

        public Criteria andPtToolNameNotLike(String value) {
            addCriterion("PT_TOOL_NAME not like", value, "ptToolName");
            return (Criteria) this;
        }

        public Criteria andPtToolNameIn(List<String> values) {
            addCriterion("PT_TOOL_NAME in", values, "ptToolName");
            return (Criteria) this;
        }

        public Criteria andPtToolNameNotIn(List<String> values) {
            addCriterion("PT_TOOL_NAME not in", values, "ptToolName");
            return (Criteria) this;
        }

        public Criteria andPtToolNameBetween(String value1, String value2) {
            addCriterion("PT_TOOL_NAME between", value1, value2, "ptToolName");
            return (Criteria) this;
        }

        public Criteria andPtToolNameNotBetween(String value1, String value2) {
            addCriterion("PT_TOOL_NAME not between", value1, value2, "ptToolName");
            return (Criteria) this;
        }

        public Criteria andPtToolsUrlIsNull() {
            addCriterion("PT_TOOLS_URL is null");
            return (Criteria) this;
        }

        public Criteria andPtToolsUrlIsNotNull() {
            addCriterion("PT_TOOLS_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPtToolsUrlEqualTo(String value) {
            addCriterion("PT_TOOLS_URL =", value, "ptToolsUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsUrlNotEqualTo(String value) {
            addCriterion("PT_TOOLS_URL <>", value, "ptToolsUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsUrlGreaterThan(String value) {
            addCriterion("PT_TOOLS_URL >", value, "ptToolsUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PT_TOOLS_URL >=", value, "ptToolsUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsUrlLessThan(String value) {
            addCriterion("PT_TOOLS_URL <", value, "ptToolsUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsUrlLessThanOrEqualTo(String value) {
            addCriterion("PT_TOOLS_URL <=", value, "ptToolsUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsUrlLike(String value) {
            addCriterion("PT_TOOLS_URL like", value, "ptToolsUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsUrlNotLike(String value) {
            addCriterion("PT_TOOLS_URL not like", value, "ptToolsUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsUrlIn(List<String> values) {
            addCriterion("PT_TOOLS_URL in", values, "ptToolsUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsUrlNotIn(List<String> values) {
            addCriterion("PT_TOOLS_URL not in", values, "ptToolsUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsUrlBetween(String value1, String value2) {
            addCriterion("PT_TOOLS_URL between", value1, value2, "ptToolsUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsUrlNotBetween(String value1, String value2) {
            addCriterion("PT_TOOLS_URL not between", value1, value2, "ptToolsUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsVideoUrlIsNull() {
            addCriterion("PT_TOOLS_VIDEO_URL is null");
            return (Criteria) this;
        }

        public Criteria andPtToolsVideoUrlIsNotNull() {
            addCriterion("PT_TOOLS_VIDEO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPtToolsVideoUrlEqualTo(String value) {
            addCriterion("PT_TOOLS_VIDEO_URL =", value, "ptToolsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsVideoUrlNotEqualTo(String value) {
            addCriterion("PT_TOOLS_VIDEO_URL <>", value, "ptToolsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsVideoUrlGreaterThan(String value) {
            addCriterion("PT_TOOLS_VIDEO_URL >", value, "ptToolsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PT_TOOLS_VIDEO_URL >=", value, "ptToolsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsVideoUrlLessThan(String value) {
            addCriterion("PT_TOOLS_VIDEO_URL <", value, "ptToolsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("PT_TOOLS_VIDEO_URL <=", value, "ptToolsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsVideoUrlLike(String value) {
            addCriterion("PT_TOOLS_VIDEO_URL like", value, "ptToolsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsVideoUrlNotLike(String value) {
            addCriterion("PT_TOOLS_VIDEO_URL not like", value, "ptToolsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsVideoUrlIn(List<String> values) {
            addCriterion("PT_TOOLS_VIDEO_URL in", values, "ptToolsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsVideoUrlNotIn(List<String> values) {
            addCriterion("PT_TOOLS_VIDEO_URL not in", values, "ptToolsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsVideoUrlBetween(String value1, String value2) {
            addCriterion("PT_TOOLS_VIDEO_URL between", value1, value2, "ptToolsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsVideoUrlNotBetween(String value1, String value2) {
            addCriterion("PT_TOOLS_VIDEO_URL not between", value1, value2, "ptToolsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andPtToolsTypeIsNull() {
            addCriterion("PT_TOOLS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPtToolsTypeIsNotNull() {
            addCriterion("PT_TOOLS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPtToolsTypeEqualTo(String value) {
            addCriterion("PT_TOOLS_TYPE =", value, "ptToolsType");
            return (Criteria) this;
        }

        public Criteria andPtToolsTypeNotEqualTo(String value) {
            addCriterion("PT_TOOLS_TYPE <>", value, "ptToolsType");
            return (Criteria) this;
        }

        public Criteria andPtToolsTypeGreaterThan(String value) {
            addCriterion("PT_TOOLS_TYPE >", value, "ptToolsType");
            return (Criteria) this;
        }

        public Criteria andPtToolsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PT_TOOLS_TYPE >=", value, "ptToolsType");
            return (Criteria) this;
        }

        public Criteria andPtToolsTypeLessThan(String value) {
            addCriterion("PT_TOOLS_TYPE <", value, "ptToolsType");
            return (Criteria) this;
        }

        public Criteria andPtToolsTypeLessThanOrEqualTo(String value) {
            addCriterion("PT_TOOLS_TYPE <=", value, "ptToolsType");
            return (Criteria) this;
        }

        public Criteria andPtToolsTypeLike(String value) {
            addCriterion("PT_TOOLS_TYPE like", value, "ptToolsType");
            return (Criteria) this;
        }

        public Criteria andPtToolsTypeNotLike(String value) {
            addCriterion("PT_TOOLS_TYPE not like", value, "ptToolsType");
            return (Criteria) this;
        }

        public Criteria andPtToolsTypeIn(List<String> values) {
            addCriterion("PT_TOOLS_TYPE in", values, "ptToolsType");
            return (Criteria) this;
        }

        public Criteria andPtToolsTypeNotIn(List<String> values) {
            addCriterion("PT_TOOLS_TYPE not in", values, "ptToolsType");
            return (Criteria) this;
        }

        public Criteria andPtToolsTypeBetween(String value1, String value2) {
            addCriterion("PT_TOOLS_TYPE between", value1, value2, "ptToolsType");
            return (Criteria) this;
        }

        public Criteria andPtToolsTypeNotBetween(String value1, String value2) {
            addCriterion("PT_TOOLS_TYPE not between", value1, value2, "ptToolsType");
            return (Criteria) this;
        }

        public Criteria andPtUserNoIsNull() {
            addCriterion("PT_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andPtUserNoIsNotNull() {
            addCriterion("PT_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPtUserNoEqualTo(Integer value) {
            addCriterion("PT_USER_NO =", value, "ptUserNo");
            return (Criteria) this;
        }

        public Criteria andPtUserNoNotEqualTo(Integer value) {
            addCriterion("PT_USER_NO <>", value, "ptUserNo");
            return (Criteria) this;
        }

        public Criteria andPtUserNoGreaterThan(Integer value) {
            addCriterion("PT_USER_NO >", value, "ptUserNo");
            return (Criteria) this;
        }

        public Criteria andPtUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("PT_USER_NO >=", value, "ptUserNo");
            return (Criteria) this;
        }

        public Criteria andPtUserNoLessThan(Integer value) {
            addCriterion("PT_USER_NO <", value, "ptUserNo");
            return (Criteria) this;
        }

        public Criteria andPtUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("PT_USER_NO <=", value, "ptUserNo");
            return (Criteria) this;
        }

        public Criteria andPtUserNoIn(List<Integer> values) {
            addCriterion("PT_USER_NO in", values, "ptUserNo");
            return (Criteria) this;
        }

        public Criteria andPtUserNoNotIn(List<Integer> values) {
            addCriterion("PT_USER_NO not in", values, "ptUserNo");
            return (Criteria) this;
        }

        public Criteria andPtUserNoBetween(Integer value1, Integer value2) {
            addCriterion("PT_USER_NO between", value1, value2, "ptUserNo");
            return (Criteria) this;
        }

        public Criteria andPtUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("PT_USER_NO not between", value1, value2, "ptUserNo");
            return (Criteria) this;
        }

        public Criteria andPtRegtimeIsNull() {
            addCriterion("PT_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andPtRegtimeIsNotNull() {
            addCriterion("PT_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPtRegtimeEqualTo(Date value) {
            addCriterion("PT_REGTIME =", value, "ptRegtime");
            return (Criteria) this;
        }

        public Criteria andPtRegtimeNotEqualTo(Date value) {
            addCriterion("PT_REGTIME <>", value, "ptRegtime");
            return (Criteria) this;
        }

        public Criteria andPtRegtimeGreaterThan(Date value) {
            addCriterion("PT_REGTIME >", value, "ptRegtime");
            return (Criteria) this;
        }

        public Criteria andPtRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PT_REGTIME >=", value, "ptRegtime");
            return (Criteria) this;
        }

        public Criteria andPtRegtimeLessThan(Date value) {
            addCriterion("PT_REGTIME <", value, "ptRegtime");
            return (Criteria) this;
        }

        public Criteria andPtRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("PT_REGTIME <=", value, "ptRegtime");
            return (Criteria) this;
        }

        public Criteria andPtRegtimeIn(List<Date> values) {
            addCriterion("PT_REGTIME in", values, "ptRegtime");
            return (Criteria) this;
        }

        public Criteria andPtRegtimeNotIn(List<Date> values) {
            addCriterion("PT_REGTIME not in", values, "ptRegtime");
            return (Criteria) this;
        }

        public Criteria andPtRegtimeBetween(Date value1, Date value2) {
            addCriterion("PT_REGTIME between", value1, value2, "ptRegtime");
            return (Criteria) this;
        }

        public Criteria andPtRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("PT_REGTIME not between", value1, value2, "ptRegtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_pro_tools
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 25 19:47:24 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_pro_tools
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
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