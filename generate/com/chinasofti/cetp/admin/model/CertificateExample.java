package com.chinasofti.cetp.admin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CertificateExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public CertificateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
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
     * This method corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
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

        public Criteria andCertIdIsNull() {
            addCriterion("CERT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCertIdIsNotNull() {
            addCriterion("CERT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCertIdEqualTo(Integer value) {
            addCriterion("CERT_ID =", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotEqualTo(Integer value) {
            addCriterion("CERT_ID <>", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdGreaterThan(Integer value) {
            addCriterion("CERT_ID >", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CERT_ID >=", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdLessThan(Integer value) {
            addCriterion("CERT_ID <", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdLessThanOrEqualTo(Integer value) {
            addCriterion("CERT_ID <=", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdIn(List<Integer> values) {
            addCriterion("CERT_ID in", values, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotIn(List<Integer> values) {
            addCriterion("CERT_ID not in", values, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdBetween(Integer value1, Integer value2) {
            addCriterion("CERT_ID between", value1, value2, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CERT_ID not between", value1, value2, "certId");
            return (Criteria) this;
        }

        public Criteria andStuNoIsNull() {
            addCriterion("STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andStuNoIsNotNull() {
            addCriterion("STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStuNoEqualTo(Integer value) {
            addCriterion("STU_NO =", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotEqualTo(Integer value) {
            addCriterion("STU_NO <>", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoGreaterThan(Integer value) {
            addCriterion("STU_NO >", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_NO >=", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLessThan(Integer value) {
            addCriterion("STU_NO <", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("STU_NO <=", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoIn(List<Integer> values) {
            addCriterion("STU_NO in", values, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotIn(List<Integer> values) {
            addCriterion("STU_NO not in", values, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoBetween(Integer value1, Integer value2) {
            addCriterion("STU_NO between", value1, value2, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_NO not between", value1, value2, "stuNo");
            return (Criteria) this;
        }

        public Criteria andCertNameIsNull() {
            addCriterion("CERT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCertNameIsNotNull() {
            addCriterion("CERT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCertNameEqualTo(String value) {
            addCriterion("CERT_NAME =", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameNotEqualTo(String value) {
            addCriterion("CERT_NAME <>", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameGreaterThan(String value) {
            addCriterion("CERT_NAME >", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_NAME >=", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameLessThan(String value) {
            addCriterion("CERT_NAME <", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameLessThanOrEqualTo(String value) {
            addCriterion("CERT_NAME <=", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameLike(String value) {
            addCriterion("CERT_NAME like", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameNotLike(String value) {
            addCriterion("CERT_NAME not like", value, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameIn(List<String> values) {
            addCriterion("CERT_NAME in", values, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameNotIn(List<String> values) {
            addCriterion("CERT_NAME not in", values, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameBetween(String value1, String value2) {
            addCriterion("CERT_NAME between", value1, value2, "certName");
            return (Criteria) this;
        }

        public Criteria andCertNameNotBetween(String value1, String value2) {
            addCriterion("CERT_NAME not between", value1, value2, "certName");
            return (Criteria) this;
        }

        public Criteria andCertUrlIsNull() {
            addCriterion("CERT_URL is null");
            return (Criteria) this;
        }

        public Criteria andCertUrlIsNotNull() {
            addCriterion("CERT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCertUrlEqualTo(String value) {
            addCriterion("CERT_URL =", value, "certUrl");
            return (Criteria) this;
        }

        public Criteria andCertUrlNotEqualTo(String value) {
            addCriterion("CERT_URL <>", value, "certUrl");
            return (Criteria) this;
        }

        public Criteria andCertUrlGreaterThan(String value) {
            addCriterion("CERT_URL >", value, "certUrl");
            return (Criteria) this;
        }

        public Criteria andCertUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_URL >=", value, "certUrl");
            return (Criteria) this;
        }

        public Criteria andCertUrlLessThan(String value) {
            addCriterion("CERT_URL <", value, "certUrl");
            return (Criteria) this;
        }

        public Criteria andCertUrlLessThanOrEqualTo(String value) {
            addCriterion("CERT_URL <=", value, "certUrl");
            return (Criteria) this;
        }

        public Criteria andCertUrlLike(String value) {
            addCriterion("CERT_URL like", value, "certUrl");
            return (Criteria) this;
        }

        public Criteria andCertUrlNotLike(String value) {
            addCriterion("CERT_URL not like", value, "certUrl");
            return (Criteria) this;
        }

        public Criteria andCertUrlIn(List<String> values) {
            addCriterion("CERT_URL in", values, "certUrl");
            return (Criteria) this;
        }

        public Criteria andCertUrlNotIn(List<String> values) {
            addCriterion("CERT_URL not in", values, "certUrl");
            return (Criteria) this;
        }

        public Criteria andCertUrlBetween(String value1, String value2) {
            addCriterion("CERT_URL between", value1, value2, "certUrl");
            return (Criteria) this;
        }

        public Criteria andCertUrlNotBetween(String value1, String value2) {
            addCriterion("CERT_URL not between", value1, value2, "certUrl");
            return (Criteria) this;
        }

        public Criteria andCertStuIdIsNull() {
            addCriterion("CERT_STU_ID is null");
            return (Criteria) this;
        }

        public Criteria andCertStuIdIsNotNull() {
            addCriterion("CERT_STU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCertStuIdEqualTo(Integer value) {
            addCriterion("CERT_STU_ID =", value, "certStuId");
            return (Criteria) this;
        }

        public Criteria andCertStuIdNotEqualTo(Integer value) {
            addCriterion("CERT_STU_ID <>", value, "certStuId");
            return (Criteria) this;
        }

        public Criteria andCertStuIdGreaterThan(Integer value) {
            addCriterion("CERT_STU_ID >", value, "certStuId");
            return (Criteria) this;
        }

        public Criteria andCertStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CERT_STU_ID >=", value, "certStuId");
            return (Criteria) this;
        }

        public Criteria andCertStuIdLessThan(Integer value) {
            addCriterion("CERT_STU_ID <", value, "certStuId");
            return (Criteria) this;
        }

        public Criteria andCertStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("CERT_STU_ID <=", value, "certStuId");
            return (Criteria) this;
        }

        public Criteria andCertStuIdIn(List<Integer> values) {
            addCriterion("CERT_STU_ID in", values, "certStuId");
            return (Criteria) this;
        }

        public Criteria andCertStuIdNotIn(List<Integer> values) {
            addCriterion("CERT_STU_ID not in", values, "certStuId");
            return (Criteria) this;
        }

        public Criteria andCertStuIdBetween(Integer value1, Integer value2) {
            addCriterion("CERT_STU_ID between", value1, value2, "certStuId");
            return (Criteria) this;
        }

        public Criteria andCertStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CERT_STU_ID not between", value1, value2, "certStuId");
            return (Criteria) this;
        }

        public Criteria andCertRegtimeIsNull() {
            addCriterion("CERT_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andCertRegtimeIsNotNull() {
            addCriterion("CERT_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCertRegtimeEqualTo(Date value) {
            addCriterion("CERT_REGTIME =", value, "certRegtime");
            return (Criteria) this;
        }

        public Criteria andCertRegtimeNotEqualTo(Date value) {
            addCriterion("CERT_REGTIME <>", value, "certRegtime");
            return (Criteria) this;
        }

        public Criteria andCertRegtimeGreaterThan(Date value) {
            addCriterion("CERT_REGTIME >", value, "certRegtime");
            return (Criteria) this;
        }

        public Criteria andCertRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CERT_REGTIME >=", value, "certRegtime");
            return (Criteria) this;
        }

        public Criteria andCertRegtimeLessThan(Date value) {
            addCriterion("CERT_REGTIME <", value, "certRegtime");
            return (Criteria) this;
        }

        public Criteria andCertRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("CERT_REGTIME <=", value, "certRegtime");
            return (Criteria) this;
        }

        public Criteria andCertRegtimeIn(List<Date> values) {
            addCriterion("CERT_REGTIME in", values, "certRegtime");
            return (Criteria) this;
        }

        public Criteria andCertRegtimeNotIn(List<Date> values) {
            addCriterion("CERT_REGTIME not in", values, "certRegtime");
            return (Criteria) this;
        }

        public Criteria andCertRegtimeBetween(Date value1, Date value2) {
            addCriterion("CERT_REGTIME between", value1, value2, "certRegtime");
            return (Criteria) this;
        }

        public Criteria andCertRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("CERT_REGTIME not between", value1, value2, "certRegtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_certificate
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 25 19:01:39 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_certificate
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
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