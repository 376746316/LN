package com.chinasofti.cetp.admin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserNoIsNull() {
            addCriterion("USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(Integer value) {
            addCriterion("USER_NO =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(Integer value) {
            addCriterion("USER_NO <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(Integer value) {
            addCriterion("USER_NO >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_NO >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(Integer value) {
            addCriterion("USER_NO <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("USER_NO <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<Integer> values) {
            addCriterion("USER_NO in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<Integer> values) {
            addCriterion("USER_NO not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(Integer value1, Integer value2) {
            addCriterion("USER_NO between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_NO not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserOrgidIsNull() {
            addCriterion("USER_ORGID is null");
            return (Criteria) this;
        }

        public Criteria andUserOrgidIsNotNull() {
            addCriterion("USER_ORGID is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrgidEqualTo(Integer value) {
            addCriterion("USER_ORGID =", value, "userOrgid");
            return (Criteria) this;
        }

        public Criteria andUserOrgidNotEqualTo(Integer value) {
            addCriterion("USER_ORGID <>", value, "userOrgid");
            return (Criteria) this;
        }

        public Criteria andUserOrgidGreaterThan(Integer value) {
            addCriterion("USER_ORGID >", value, "userOrgid");
            return (Criteria) this;
        }

        public Criteria andUserOrgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ORGID >=", value, "userOrgid");
            return (Criteria) this;
        }

        public Criteria andUserOrgidLessThan(Integer value) {
            addCriterion("USER_ORGID <", value, "userOrgid");
            return (Criteria) this;
        }

        public Criteria andUserOrgidLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ORGID <=", value, "userOrgid");
            return (Criteria) this;
        }

        public Criteria andUserOrgidIn(List<Integer> values) {
            addCriterion("USER_ORGID in", values, "userOrgid");
            return (Criteria) this;
        }

        public Criteria andUserOrgidNotIn(List<Integer> values) {
            addCriterion("USER_ORGID not in", values, "userOrgid");
            return (Criteria) this;
        }

        public Criteria andUserOrgidBetween(Integer value1, Integer value2) {
            addCriterion("USER_ORGID between", value1, value2, "userOrgid");
            return (Criteria) this;
        }

        public Criteria andUserOrgidNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ORGID not between", value1, value2, "userOrgid");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("USER_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("USER_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("USER_PWD =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("USER_PWD <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("USER_PWD >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PWD >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("USER_PWD <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("USER_PWD <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("USER_PWD like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("USER_PWD not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("USER_PWD in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("USER_PWD not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("USER_PWD between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("USER_PWD not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNull() {
            addCriterion("USER_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("USER_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("USER_NICKNAME =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("USER_NICKNAME <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("USER_NICKNAME >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NICKNAME >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("USER_NICKNAME <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("USER_NICKNAME <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("USER_NICKNAME like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("USER_NICKNAME not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("USER_NICKNAME in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("USER_NICKNAME not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("USER_NICKNAME between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("USER_NICKNAME not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNull() {
            addCriterion("USER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("USER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("USER_MOBILE =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("USER_MOBILE <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("USER_MOBILE >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("USER_MOBILE >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("USER_MOBILE <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("USER_MOBILE <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("USER_MOBILE like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("USER_MOBILE not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("USER_MOBILE in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("USER_MOBILE not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("USER_MOBILE between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("USER_MOBILE not between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("USER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("USER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("USER_PHONE =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("USER_PHONE <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("USER_PHONE >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PHONE >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("USER_PHONE <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("USER_PHONE <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("USER_PHONE like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("USER_PHONE not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("USER_PHONE in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("USER_PHONE not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("USER_PHONE between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("USER_PHONE not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserMailIsNull() {
            addCriterion("USER_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andUserMailIsNotNull() {
            addCriterion("USER_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUserMailEqualTo(String value) {
            addCriterion("USER_MAIL =", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotEqualTo(String value) {
            addCriterion("USER_MAIL <>", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailGreaterThan(String value) {
            addCriterion("USER_MAIL >", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailGreaterThanOrEqualTo(String value) {
            addCriterion("USER_MAIL >=", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLessThan(String value) {
            addCriterion("USER_MAIL <", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLessThanOrEqualTo(String value) {
            addCriterion("USER_MAIL <=", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLike(String value) {
            addCriterion("USER_MAIL like", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotLike(String value) {
            addCriterion("USER_MAIL not like", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailIn(List<String> values) {
            addCriterion("USER_MAIL in", values, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotIn(List<String> values) {
            addCriterion("USER_MAIL not in", values, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailBetween(String value1, String value2) {
            addCriterion("USER_MAIL between", value1, value2, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotBetween(String value1, String value2) {
            addCriterion("USER_MAIL not between", value1, value2, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNull() {
            addCriterion("USER_QQ is null");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNotNull() {
            addCriterion("USER_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andUserQqEqualTo(String value) {
            addCriterion("USER_QQ =", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotEqualTo(String value) {
            addCriterion("USER_QQ <>", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThan(String value) {
            addCriterion("USER_QQ >", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThanOrEqualTo(String value) {
            addCriterion("USER_QQ >=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThan(String value) {
            addCriterion("USER_QQ <", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThanOrEqualTo(String value) {
            addCriterion("USER_QQ <=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLike(String value) {
            addCriterion("USER_QQ like", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotLike(String value) {
            addCriterion("USER_QQ not like", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqIn(List<String> values) {
            addCriterion("USER_QQ in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotIn(List<String> values) {
            addCriterion("USER_QQ not in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqBetween(String value1, String value2) {
            addCriterion("USER_QQ between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotBetween(String value1, String value2) {
            addCriterion("USER_QQ not between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserGrpQqIsNull() {
            addCriterion("USER_GRP_QQ is null");
            return (Criteria) this;
        }

        public Criteria andUserGrpQqIsNotNull() {
            addCriterion("USER_GRP_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andUserGrpQqEqualTo(String value) {
            addCriterion("USER_GRP_QQ =", value, "userGrpQq");
            return (Criteria) this;
        }

        public Criteria andUserGrpQqNotEqualTo(String value) {
            addCriterion("USER_GRP_QQ <>", value, "userGrpQq");
            return (Criteria) this;
        }

        public Criteria andUserGrpQqGreaterThan(String value) {
            addCriterion("USER_GRP_QQ >", value, "userGrpQq");
            return (Criteria) this;
        }

        public Criteria andUserGrpQqGreaterThanOrEqualTo(String value) {
            addCriterion("USER_GRP_QQ >=", value, "userGrpQq");
            return (Criteria) this;
        }

        public Criteria andUserGrpQqLessThan(String value) {
            addCriterion("USER_GRP_QQ <", value, "userGrpQq");
            return (Criteria) this;
        }

        public Criteria andUserGrpQqLessThanOrEqualTo(String value) {
            addCriterion("USER_GRP_QQ <=", value, "userGrpQq");
            return (Criteria) this;
        }

        public Criteria andUserGrpQqLike(String value) {
            addCriterion("USER_GRP_QQ like", value, "userGrpQq");
            return (Criteria) this;
        }

        public Criteria andUserGrpQqNotLike(String value) {
            addCriterion("USER_GRP_QQ not like", value, "userGrpQq");
            return (Criteria) this;
        }

        public Criteria andUserGrpQqIn(List<String> values) {
            addCriterion("USER_GRP_QQ in", values, "userGrpQq");
            return (Criteria) this;
        }

        public Criteria andUserGrpQqNotIn(List<String> values) {
            addCriterion("USER_GRP_QQ not in", values, "userGrpQq");
            return (Criteria) this;
        }

        public Criteria andUserGrpQqBetween(String value1, String value2) {
            addCriterion("USER_GRP_QQ between", value1, value2, "userGrpQq");
            return (Criteria) this;
        }

        public Criteria andUserGrpQqNotBetween(String value1, String value2) {
            addCriterion("USER_GRP_QQ not between", value1, value2, "userGrpQq");
            return (Criteria) this;
        }

        public Criteria andUserTitleIsNull() {
            addCriterion("USER_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andUserTitleIsNotNull() {
            addCriterion("USER_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTitleEqualTo(String value) {
            addCriterion("USER_TITLE =", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotEqualTo(String value) {
            addCriterion("USER_TITLE <>", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleGreaterThan(String value) {
            addCriterion("USER_TITLE >", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TITLE >=", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleLessThan(String value) {
            addCriterion("USER_TITLE <", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleLessThanOrEqualTo(String value) {
            addCriterion("USER_TITLE <=", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleLike(String value) {
            addCriterion("USER_TITLE like", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotLike(String value) {
            addCriterion("USER_TITLE not like", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleIn(List<String> values) {
            addCriterion("USER_TITLE in", values, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotIn(List<String> values) {
            addCriterion("USER_TITLE not in", values, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleBetween(String value1, String value2) {
            addCriterion("USER_TITLE between", value1, value2, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotBetween(String value1, String value2) {
            addCriterion("USER_TITLE not between", value1, value2, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("USER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("USER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("USER_SEX =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("USER_SEX <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("USER_SEX >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SEX >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("USER_SEX <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("USER_SEX <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("USER_SEX like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("USER_SEX not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("USER_SEX in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("USER_SEX not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("USER_SEX between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("USER_SEX not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserBirthIsNull() {
            addCriterion("USER_BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthIsNotNull() {
            addCriterion("USER_BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthEqualTo(Date value) {
            addCriterionForJDBCDate("USER_BIRTH =", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("USER_BIRTH <>", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("USER_BIRTH >", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USER_BIRTH >=", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthLessThan(Date value) {
            addCriterionForJDBCDate("USER_BIRTH <", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USER_BIRTH <=", value, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthIn(List<Date> values) {
            addCriterionForJDBCDate("USER_BIRTH in", values, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("USER_BIRTH not in", values, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USER_BIRTH between", value1, value2, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USER_BIRTH not between", value1, value2, "userBirth");
            return (Criteria) this;
        }

        public Criteria andUserAreaCodeIsNull() {
            addCriterion("USER_AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserAreaCodeIsNotNull() {
            addCriterion("USER_AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserAreaCodeEqualTo(String value) {
            addCriterion("USER_AREA_CODE =", value, "userAreaCode");
            return (Criteria) this;
        }

        public Criteria andUserAreaCodeNotEqualTo(String value) {
            addCriterion("USER_AREA_CODE <>", value, "userAreaCode");
            return (Criteria) this;
        }

        public Criteria andUserAreaCodeGreaterThan(String value) {
            addCriterion("USER_AREA_CODE >", value, "userAreaCode");
            return (Criteria) this;
        }

        public Criteria andUserAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_AREA_CODE >=", value, "userAreaCode");
            return (Criteria) this;
        }

        public Criteria andUserAreaCodeLessThan(String value) {
            addCriterion("USER_AREA_CODE <", value, "userAreaCode");
            return (Criteria) this;
        }

        public Criteria andUserAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_AREA_CODE <=", value, "userAreaCode");
            return (Criteria) this;
        }

        public Criteria andUserAreaCodeLike(String value) {
            addCriterion("USER_AREA_CODE like", value, "userAreaCode");
            return (Criteria) this;
        }

        public Criteria andUserAreaCodeNotLike(String value) {
            addCriterion("USER_AREA_CODE not like", value, "userAreaCode");
            return (Criteria) this;
        }

        public Criteria andUserAreaCodeIn(List<String> values) {
            addCriterion("USER_AREA_CODE in", values, "userAreaCode");
            return (Criteria) this;
        }

        public Criteria andUserAreaCodeNotIn(List<String> values) {
            addCriterion("USER_AREA_CODE not in", values, "userAreaCode");
            return (Criteria) this;
        }

        public Criteria andUserAreaCodeBetween(String value1, String value2) {
            addCriterion("USER_AREA_CODE between", value1, value2, "userAreaCode");
            return (Criteria) this;
        }

        public Criteria andUserAreaCodeNotBetween(String value1, String value2) {
            addCriterion("USER_AREA_CODE not between", value1, value2, "userAreaCode");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("USER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("USER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("USER_ADDRESS =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("USER_ADDRESS <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("USER_ADDRESS >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ADDRESS >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("USER_ADDRESS <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("USER_ADDRESS <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("USER_ADDRESS like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("USER_ADDRESS not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("USER_ADDRESS in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("USER_ADDRESS not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("USER_ADDRESS between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("USER_ADDRESS not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserPostCodeIsNull() {
            addCriterion("USER_POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserPostCodeIsNotNull() {
            addCriterion("USER_POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserPostCodeEqualTo(String value) {
            addCriterion("USER_POST_CODE =", value, "userPostCode");
            return (Criteria) this;
        }

        public Criteria andUserPostCodeNotEqualTo(String value) {
            addCriterion("USER_POST_CODE <>", value, "userPostCode");
            return (Criteria) this;
        }

        public Criteria andUserPostCodeGreaterThan(String value) {
            addCriterion("USER_POST_CODE >", value, "userPostCode");
            return (Criteria) this;
        }

        public Criteria andUserPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_POST_CODE >=", value, "userPostCode");
            return (Criteria) this;
        }

        public Criteria andUserPostCodeLessThan(String value) {
            addCriterion("USER_POST_CODE <", value, "userPostCode");
            return (Criteria) this;
        }

        public Criteria andUserPostCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_POST_CODE <=", value, "userPostCode");
            return (Criteria) this;
        }

        public Criteria andUserPostCodeLike(String value) {
            addCriterion("USER_POST_CODE like", value, "userPostCode");
            return (Criteria) this;
        }

        public Criteria andUserPostCodeNotLike(String value) {
            addCriterion("USER_POST_CODE not like", value, "userPostCode");
            return (Criteria) this;
        }

        public Criteria andUserPostCodeIn(List<String> values) {
            addCriterion("USER_POST_CODE in", values, "userPostCode");
            return (Criteria) this;
        }

        public Criteria andUserPostCodeNotIn(List<String> values) {
            addCriterion("USER_POST_CODE not in", values, "userPostCode");
            return (Criteria) this;
        }

        public Criteria andUserPostCodeBetween(String value1, String value2) {
            addCriterion("USER_POST_CODE between", value1, value2, "userPostCode");
            return (Criteria) this;
        }

        public Criteria andUserPostCodeNotBetween(String value1, String value2) {
            addCriterion("USER_POST_CODE not between", value1, value2, "userPostCode");
            return (Criteria) this;
        }

        public Criteria andUserIsLeaderIsNull() {
            addCriterion("USER_IS_LEADER is null");
            return (Criteria) this;
        }

        public Criteria andUserIsLeaderIsNotNull() {
            addCriterion("USER_IS_LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsLeaderEqualTo(String value) {
            addCriterion("USER_IS_LEADER =", value, "userIsLeader");
            return (Criteria) this;
        }

        public Criteria andUserIsLeaderNotEqualTo(String value) {
            addCriterion("USER_IS_LEADER <>", value, "userIsLeader");
            return (Criteria) this;
        }

        public Criteria andUserIsLeaderGreaterThan(String value) {
            addCriterion("USER_IS_LEADER >", value, "userIsLeader");
            return (Criteria) this;
        }

        public Criteria andUserIsLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("USER_IS_LEADER >=", value, "userIsLeader");
            return (Criteria) this;
        }

        public Criteria andUserIsLeaderLessThan(String value) {
            addCriterion("USER_IS_LEADER <", value, "userIsLeader");
            return (Criteria) this;
        }

        public Criteria andUserIsLeaderLessThanOrEqualTo(String value) {
            addCriterion("USER_IS_LEADER <=", value, "userIsLeader");
            return (Criteria) this;
        }

        public Criteria andUserIsLeaderLike(String value) {
            addCriterion("USER_IS_LEADER like", value, "userIsLeader");
            return (Criteria) this;
        }

        public Criteria andUserIsLeaderNotLike(String value) {
            addCriterion("USER_IS_LEADER not like", value, "userIsLeader");
            return (Criteria) this;
        }

        public Criteria andUserIsLeaderIn(List<String> values) {
            addCriterion("USER_IS_LEADER in", values, "userIsLeader");
            return (Criteria) this;
        }

        public Criteria andUserIsLeaderNotIn(List<String> values) {
            addCriterion("USER_IS_LEADER not in", values, "userIsLeader");
            return (Criteria) this;
        }

        public Criteria andUserIsLeaderBetween(String value1, String value2) {
            addCriterion("USER_IS_LEADER between", value1, value2, "userIsLeader");
            return (Criteria) this;
        }

        public Criteria andUserIsLeaderNotBetween(String value1, String value2) {
            addCriterion("USER_IS_LEADER not between", value1, value2, "userIsLeader");
            return (Criteria) this;
        }

        public Criteria andUserEduLevelIsNull() {
            addCriterion("USER_EDU_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andUserEduLevelIsNotNull() {
            addCriterion("USER_EDU_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andUserEduLevelEqualTo(String value) {
            addCriterion("USER_EDU_LEVEL =", value, "userEduLevel");
            return (Criteria) this;
        }

        public Criteria andUserEduLevelNotEqualTo(String value) {
            addCriterion("USER_EDU_LEVEL <>", value, "userEduLevel");
            return (Criteria) this;
        }

        public Criteria andUserEduLevelGreaterThan(String value) {
            addCriterion("USER_EDU_LEVEL >", value, "userEduLevel");
            return (Criteria) this;
        }

        public Criteria andUserEduLevelGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EDU_LEVEL >=", value, "userEduLevel");
            return (Criteria) this;
        }

        public Criteria andUserEduLevelLessThan(String value) {
            addCriterion("USER_EDU_LEVEL <", value, "userEduLevel");
            return (Criteria) this;
        }

        public Criteria andUserEduLevelLessThanOrEqualTo(String value) {
            addCriterion("USER_EDU_LEVEL <=", value, "userEduLevel");
            return (Criteria) this;
        }

        public Criteria andUserEduLevelLike(String value) {
            addCriterion("USER_EDU_LEVEL like", value, "userEduLevel");
            return (Criteria) this;
        }

        public Criteria andUserEduLevelNotLike(String value) {
            addCriterion("USER_EDU_LEVEL not like", value, "userEduLevel");
            return (Criteria) this;
        }

        public Criteria andUserEduLevelIn(List<String> values) {
            addCriterion("USER_EDU_LEVEL in", values, "userEduLevel");
            return (Criteria) this;
        }

        public Criteria andUserEduLevelNotIn(List<String> values) {
            addCriterion("USER_EDU_LEVEL not in", values, "userEduLevel");
            return (Criteria) this;
        }

        public Criteria andUserEduLevelBetween(String value1, String value2) {
            addCriterion("USER_EDU_LEVEL between", value1, value2, "userEduLevel");
            return (Criteria) this;
        }

        public Criteria andUserEduLevelNotBetween(String value1, String value2) {
            addCriterion("USER_EDU_LEVEL not between", value1, value2, "userEduLevel");
            return (Criteria) this;
        }

        public Criteria andUserSubjectIsNull() {
            addCriterion("USER_SUBJECT is null");
            return (Criteria) this;
        }

        public Criteria andUserSubjectIsNotNull() {
            addCriterion("USER_SUBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andUserSubjectEqualTo(String value) {
            addCriterion("USER_SUBJECT =", value, "userSubject");
            return (Criteria) this;
        }

        public Criteria andUserSubjectNotEqualTo(String value) {
            addCriterion("USER_SUBJECT <>", value, "userSubject");
            return (Criteria) this;
        }

        public Criteria andUserSubjectGreaterThan(String value) {
            addCriterion("USER_SUBJECT >", value, "userSubject");
            return (Criteria) this;
        }

        public Criteria andUserSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SUBJECT >=", value, "userSubject");
            return (Criteria) this;
        }

        public Criteria andUserSubjectLessThan(String value) {
            addCriterion("USER_SUBJECT <", value, "userSubject");
            return (Criteria) this;
        }

        public Criteria andUserSubjectLessThanOrEqualTo(String value) {
            addCriterion("USER_SUBJECT <=", value, "userSubject");
            return (Criteria) this;
        }

        public Criteria andUserSubjectLike(String value) {
            addCriterion("USER_SUBJECT like", value, "userSubject");
            return (Criteria) this;
        }

        public Criteria andUserSubjectNotLike(String value) {
            addCriterion("USER_SUBJECT not like", value, "userSubject");
            return (Criteria) this;
        }

        public Criteria andUserSubjectIn(List<String> values) {
            addCriterion("USER_SUBJECT in", values, "userSubject");
            return (Criteria) this;
        }

        public Criteria andUserSubjectNotIn(List<String> values) {
            addCriterion("USER_SUBJECT not in", values, "userSubject");
            return (Criteria) this;
        }

        public Criteria andUserSubjectBetween(String value1, String value2) {
            addCriterion("USER_SUBJECT between", value1, value2, "userSubject");
            return (Criteria) this;
        }

        public Criteria andUserSubjectNotBetween(String value1, String value2) {
            addCriterion("USER_SUBJECT not between", value1, value2, "userSubject");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserMarkIsNull() {
            addCriterion("USER_MARK is null");
            return (Criteria) this;
        }

        public Criteria andUserMarkIsNotNull() {
            addCriterion("USER_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andUserMarkEqualTo(String value) {
            addCriterion("USER_MARK =", value, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkNotEqualTo(String value) {
            addCriterion("USER_MARK <>", value, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkGreaterThan(String value) {
            addCriterion("USER_MARK >", value, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkGreaterThanOrEqualTo(String value) {
            addCriterion("USER_MARK >=", value, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkLessThan(String value) {
            addCriterion("USER_MARK <", value, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkLessThanOrEqualTo(String value) {
            addCriterion("USER_MARK <=", value, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkLike(String value) {
            addCriterion("USER_MARK like", value, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkNotLike(String value) {
            addCriterion("USER_MARK not like", value, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkIn(List<String> values) {
            addCriterion("USER_MARK in", values, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkNotIn(List<String> values) {
            addCriterion("USER_MARK not in", values, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkBetween(String value1, String value2) {
            addCriterion("USER_MARK between", value1, value2, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkNotBetween(String value1, String value2) {
            addCriterion("USER_MARK not between", value1, value2, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeIsNull() {
            addCriterion("USER_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeIsNotNull() {
            addCriterion("USER_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeEqualTo(Date value) {
            addCriterion("USER_REGTIME =", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeNotEqualTo(Date value) {
            addCriterion("USER_REGTIME <>", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeGreaterThan(Date value) {
            addCriterion("USER_REGTIME >", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_REGTIME >=", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeLessThan(Date value) {
            addCriterion("USER_REGTIME <", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("USER_REGTIME <=", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeIn(List<Date> values) {
            addCriterion("USER_REGTIME in", values, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeNotIn(List<Date> values) {
            addCriterion("USER_REGTIME not in", values, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeBetween(Date value1, Date value2) {
            addCriterion("USER_REGTIME between", value1, value2, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("USER_REGTIME not between", value1, value2, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserScoreIsNull() {
            addCriterion("USER_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andUserScoreIsNotNull() {
            addCriterion("USER_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andUserScoreEqualTo(Integer value) {
            addCriterion("USER_SCORE =", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotEqualTo(Integer value) {
            addCriterion("USER_SCORE <>", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreGreaterThan(Integer value) {
            addCriterion("USER_SCORE >", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_SCORE >=", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreLessThan(Integer value) {
            addCriterion("USER_SCORE <", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreLessThanOrEqualTo(Integer value) {
            addCriterion("USER_SCORE <=", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreIn(List<Integer> values) {
            addCriterion("USER_SCORE in", values, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotIn(List<Integer> values) {
            addCriterion("USER_SCORE not in", values, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreBetween(Integer value1, Integer value2) {
            addCriterion("USER_SCORE between", value1, value2, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_SCORE not between", value1, value2, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserHistoryScoreIsNull() {
            addCriterion("USER_HISTORY_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andUserHistoryScoreIsNotNull() {
            addCriterion("USER_HISTORY_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andUserHistoryScoreEqualTo(Integer value) {
            addCriterion("USER_HISTORY_SCORE =", value, "userHistoryScore");
            return (Criteria) this;
        }

        public Criteria andUserHistoryScoreNotEqualTo(Integer value) {
            addCriterion("USER_HISTORY_SCORE <>", value, "userHistoryScore");
            return (Criteria) this;
        }

        public Criteria andUserHistoryScoreGreaterThan(Integer value) {
            addCriterion("USER_HISTORY_SCORE >", value, "userHistoryScore");
            return (Criteria) this;
        }

        public Criteria andUserHistoryScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_HISTORY_SCORE >=", value, "userHistoryScore");
            return (Criteria) this;
        }

        public Criteria andUserHistoryScoreLessThan(Integer value) {
            addCriterion("USER_HISTORY_SCORE <", value, "userHistoryScore");
            return (Criteria) this;
        }

        public Criteria andUserHistoryScoreLessThanOrEqualTo(Integer value) {
            addCriterion("USER_HISTORY_SCORE <=", value, "userHistoryScore");
            return (Criteria) this;
        }

        public Criteria andUserHistoryScoreIn(List<Integer> values) {
            addCriterion("USER_HISTORY_SCORE in", values, "userHistoryScore");
            return (Criteria) this;
        }

        public Criteria andUserHistoryScoreNotIn(List<Integer> values) {
            addCriterion("USER_HISTORY_SCORE not in", values, "userHistoryScore");
            return (Criteria) this;
        }

        public Criteria andUserHistoryScoreBetween(Integer value1, Integer value2) {
            addCriterion("USER_HISTORY_SCORE between", value1, value2, "userHistoryScore");
            return (Criteria) this;
        }

        public Criteria andUserHistoryScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_HISTORY_SCORE not between", value1, value2, "userHistoryScore");
            return (Criteria) this;
        }

        public Criteria andUserCoinIsNull() {
            addCriterion("USER_COIN is null");
            return (Criteria) this;
        }

        public Criteria andUserCoinIsNotNull() {
            addCriterion("USER_COIN is not null");
            return (Criteria) this;
        }

        public Criteria andUserCoinEqualTo(Integer value) {
            addCriterion("USER_COIN =", value, "userCoin");
            return (Criteria) this;
        }

        public Criteria andUserCoinNotEqualTo(Integer value) {
            addCriterion("USER_COIN <>", value, "userCoin");
            return (Criteria) this;
        }

        public Criteria andUserCoinGreaterThan(Integer value) {
            addCriterion("USER_COIN >", value, "userCoin");
            return (Criteria) this;
        }

        public Criteria andUserCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_COIN >=", value, "userCoin");
            return (Criteria) this;
        }

        public Criteria andUserCoinLessThan(Integer value) {
            addCriterion("USER_COIN <", value, "userCoin");
            return (Criteria) this;
        }

        public Criteria andUserCoinLessThanOrEqualTo(Integer value) {
            addCriterion("USER_COIN <=", value, "userCoin");
            return (Criteria) this;
        }

        public Criteria andUserCoinIn(List<Integer> values) {
            addCriterion("USER_COIN in", values, "userCoin");
            return (Criteria) this;
        }

        public Criteria andUserCoinNotIn(List<Integer> values) {
            addCriterion("USER_COIN not in", values, "userCoin");
            return (Criteria) this;
        }

        public Criteria andUserCoinBetween(Integer value1, Integer value2) {
            addCriterion("USER_COIN between", value1, value2, "userCoin");
            return (Criteria) this;
        }

        public Criteria andUserCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_COIN not between", value1, value2, "userCoin");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdIsNull() {
            addCriterion("USER_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdIsNotNull() {
            addCriterion("USER_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdEqualTo(Integer value) {
            addCriterion("USER_GROUP_ID =", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdNotEqualTo(Integer value) {
            addCriterion("USER_GROUP_ID <>", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdGreaterThan(Integer value) {
            addCriterion("USER_GROUP_ID >", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_GROUP_ID >=", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdLessThan(Integer value) {
            addCriterion("USER_GROUP_ID <", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_GROUP_ID <=", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdIn(List<Integer> values) {
            addCriterion("USER_GROUP_ID in", values, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdNotIn(List<Integer> values) {
            addCriterion("USER_GROUP_ID not in", values, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_GROUP_ID between", value1, value2, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_GROUP_ID not between", value1, value2, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserOnlineIsNull() {
            addCriterion("USER_ONLINE is null");
            return (Criteria) this;
        }

        public Criteria andUserOnlineIsNotNull() {
            addCriterion("USER_ONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andUserOnlineEqualTo(String value) {
            addCriterion("USER_ONLINE =", value, "userOnline");
            return (Criteria) this;
        }

        public Criteria andUserOnlineNotEqualTo(String value) {
            addCriterion("USER_ONLINE <>", value, "userOnline");
            return (Criteria) this;
        }

        public Criteria andUserOnlineGreaterThan(String value) {
            addCriterion("USER_ONLINE >", value, "userOnline");
            return (Criteria) this;
        }

        public Criteria andUserOnlineGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ONLINE >=", value, "userOnline");
            return (Criteria) this;
        }

        public Criteria andUserOnlineLessThan(String value) {
            addCriterion("USER_ONLINE <", value, "userOnline");
            return (Criteria) this;
        }

        public Criteria andUserOnlineLessThanOrEqualTo(String value) {
            addCriterion("USER_ONLINE <=", value, "userOnline");
            return (Criteria) this;
        }

        public Criteria andUserOnlineLike(String value) {
            addCriterion("USER_ONLINE like", value, "userOnline");
            return (Criteria) this;
        }

        public Criteria andUserOnlineNotLike(String value) {
            addCriterion("USER_ONLINE not like", value, "userOnline");
            return (Criteria) this;
        }

        public Criteria andUserOnlineIn(List<String> values) {
            addCriterion("USER_ONLINE in", values, "userOnline");
            return (Criteria) this;
        }

        public Criteria andUserOnlineNotIn(List<String> values) {
            addCriterion("USER_ONLINE not in", values, "userOnline");
            return (Criteria) this;
        }

        public Criteria andUserOnlineBetween(String value1, String value2) {
            addCriterion("USER_ONLINE between", value1, value2, "userOnline");
            return (Criteria) this;
        }

        public Criteria andUserOnlineNotBetween(String value1, String value2) {
            addCriterion("USER_ONLINE not between", value1, value2, "userOnline");
            return (Criteria) this;
        }
        public Criteria andUserLastloginIsNull() {
            addCriterion("USER_LASTLOGIN is null");
            return (Criteria) this;
        }
        public Criteria andUserLastloginIsNotNull() {
            addCriterion("USER_LASTLOGIN is not null");
            return (Criteria) this;
        }
        public Criteria andUserLastloginEqualTo(Date value) {
            addCriterion("USER_LASTLOGIN =", value, "userLastlogin");
            return (Criteria) this;
        }
        public Criteria andUserLastloginNotEqualTo(Date value) {
            addCriterion("USER_LASTLOGIN <>", value, "userLastlogin");
            return (Criteria) this;
        }
        public Criteria andUserLastloginGreaterThan(Date value) {
            addCriterion("USER_LASTLOGIN >", value, "userLastlogin");
            return (Criteria) this;
        }
        public Criteria andUserLastloginGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_LASTLOGIN >=", value, "userLastlogin");
            return (Criteria) this;
        }
        public Criteria andUserLastloginLessThan(Date value) {
            addCriterion("USER_LASTLOGIN <", value, "userLastlogin");
            return (Criteria) this;
        }
        public Criteria andUserLastloginLessThanOrEqualTo(Date value) {
            addCriterion("USER_LASTLOGIN <=", value, "userLastlogin");
            return (Criteria) this;
        }
        public Criteria andUserLastloginIn(List<Date> values) {
            addCriterion("USER_LASTLOGIN in", values, "userLastlogin");
            return (Criteria) this;
        }
        public Criteria andUserLastloginNotIn(List<Date> values) {
            addCriterion("USER_LASTLOGIN not in", values, "userLastlogin");
            return (Criteria) this;
        }
        public Criteria andUserLastloginBetween(Date value1, Date value2) {
            addCriterion("USER_LASTLOGIN between", value1, value2, "userLastlogin");
            return (Criteria) this;
        }
        public Criteria andUserLastloginNotBetween(Date value1, Date value2) {
            addCriterion("USER_LASTLOGIN not between", value1, value2, "userLastlogin");
            return (Criteria) this;
        }
        public Criteria andUserIsactivateIsNull() {
            addCriterion("USER_ISACTIVATE is null");
            return (Criteria) this;
        }
        public Criteria andUserIsactivateIsNotNull() {
            addCriterion("USER_ISACTIVATE is not null");
            return (Criteria) this;
        }
        public Criteria andUserIsactivateEqualTo(Integer value) {
            addCriterion("USER_ISACTIVATE =", value, "userIsactivate");
            return (Criteria) this;
        }
        public Criteria andUserIsactivateNotEqualTo(Integer value) {
            addCriterion("USER_ISACTIVATE <>", value, "userIsactivate");
            return (Criteria) this;
        }
        public Criteria andUserIsactivateGreaterThan(Integer value) {
            addCriterion("USER_ISACTIVATE >", value, "userIsactivate");
            return (Criteria) this;
        }
        public Criteria andUserIsactivateGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ISACTIVATE >=", value, "userIsactivate");
            return (Criteria) this;
        }
        public Criteria andUserIsactivateLessThan(Integer value) {
            addCriterion("USER_ISACTIVATE <", value, "userIsactivate");
            return (Criteria) this;
        }
        public Criteria andUserIsactivateLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ISACTIVATE <=", value, "userIsactivate");
            return (Criteria) this;
        }
        public Criteria andUserIsactivateIn(List<Integer> values) {
            addCriterion("USER_ISACTIVATE in", values, "userIsactivate");
            return (Criteria) this;
        }
        public Criteria andUserIsactivateNotIn(List<Integer> values) {
            addCriterion("USER_ISACTIVATE not in", values, "userIsactivate");
            return (Criteria) this;
        }
        public Criteria andUserIsactivateBetween(Integer value1, Integer value2) {
            addCriterion("USER_ISACTIVATE between", value1, value2, "userIsactivate");
            return (Criteria) this;
        }
        public Criteria andUserIsactivateNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ISACTIVATE not between", value1, value2, "userIsactivate");
            return (Criteria) this;
        }
        public Criteria andUserFlagIsNull() {
            addCriterion("USER_FLAG is null");
            return (Criteria) this;
        }
        public Criteria andUserFlagIsNotNull() {
            addCriterion("USER_FLAG is not null");
            return (Criteria) this;
        }
        public Criteria andUserFlagEqualTo(String value) {
            addCriterion("USER_FLAG =", value, "userFlag");
            return (Criteria) this;
        }
        public Criteria andUserFlagNotEqualTo(String value) {
            addCriterion("USER_FLAG <>", value, "userFlag");
            return (Criteria) this;
        }
        public Criteria andUserFlagGreaterThan(String value) {
            addCriterion("USER_FLAG >", value, "userFlag");
            return (Criteria) this;
        }
        public Criteria andUserFlagGreaterThanOrEqualTo(String value) {
            addCriterion("USER_FLAG >=", value, "userFlag");
            return (Criteria) this;
        }
        public Criteria andUserFlagLessThan(String value) {
            addCriterion("USER_FLAG <", value, "userFlag");
            return (Criteria) this;
        }
        public Criteria andUserFlagLessThanOrEqualTo(String value) {
            addCriterion("USER_FLAG <=", value, "userFlag");
            return (Criteria) this;
        }
        public Criteria andUserFlagLike(String value) {
            addCriterion("USER_FLAG like", value, "userFlag");
            return (Criteria) this;
        }
        public Criteria andUserFlagNotLike(String value) {
            addCriterion("USER_FLAG not like", value, "userFlag");
            return (Criteria) this;
        }
        public Criteria andUserFlagIn(List<String> values) {
            addCriterion("USER_FLAG in", values, "userFlag");
            return (Criteria) this;
        }
        public Criteria andUserFlagNotIn(List<String> values) {
            addCriterion("USER_FLAG not in", values, "userFlag");
            return (Criteria) this;
        }
        public Criteria andUserFlagBetween(String value1, String value2) {
            addCriterion("USER_FLAG between", value1, value2, "userFlag");
            return (Criteria) this;
        }
        public Criteria andUserFlagNotBetween(String value1, String value2) {
            addCriterion("USER_FLAG not between", value1, value2, "userFlag");
            return (Criteria) this;
        }
        public Criteria andUserJobContextIsNull() {
            addCriterion("USER_JOB_CONTEXT is null");
            return (Criteria) this;
        }
        public Criteria andUserJobContextIsNotNull() {
            addCriterion("USER_JOB_CONTEXT is not null");
            return (Criteria) this;
        }
        public Criteria andUserJobContextEqualTo(String value) {
            addCriterion("USER_JOB_CONTEXT =", value, "userJobContext");
            return (Criteria) this;
        }
        public Criteria andUserJobContextNotEqualTo(String value) {
            addCriterion("USER_JOB_CONTEXT <>", value, "userJobContext");
            return (Criteria) this;
        }
        public Criteria andUserJobContextGreaterThan(String value) {
            addCriterion("USER_JOB_CONTEXT >", value, "userJobContext");
            return (Criteria) this;
        }
        public Criteria andUserJobContextGreaterThanOrEqualTo(String value) {
            addCriterion("USER_JOB_CONTEXT >=", value, "userJobContext");
            return (Criteria) this;
        }
        public Criteria andUserJobContextLessThan(String value) {
            addCriterion("USER_JOB_CONTEXT <", value, "userJobContext");
            return (Criteria) this;
        }
        public Criteria andUserJobContextLessThanOrEqualTo(String value) {
            addCriterion("USER_JOB_CONTEXT <=", value, "userJobContext");
            return (Criteria) this;
        }
        public Criteria andUserJobContextLike(String value) {
            addCriterion("USER_JOB_CONTEXT like", value, "userJobContext");
            return (Criteria) this;
        }
        public Criteria andUserJobContextNotLike(String value) {
            addCriterion("USER_JOB_CONTEXT not like", value, "userJobContext");
            return (Criteria) this;
        }
        public Criteria andUserJobContextIn(List<String> values) {
            addCriterion("USER_JOB_CONTEXT in", values, "userJobContext");
            return (Criteria) this;
        }
        public Criteria andUserJobContextNotIn(List<String> values) {
            addCriterion("USER_JOB_CONTEXT not in", values, "userJobContext");
            return (Criteria) this;
        }
        public Criteria andUserJobContextBetween(String value1, String value2) {
            addCriterion("USER_JOB_CONTEXT between", value1, value2, "userJobContext");
            return (Criteria) this;
        }
        public Criteria andUserJobContextNotBetween(String value1, String value2) {
            addCriterion("USER_JOB_CONTEXT not between", value1, value2, "userJobContext");
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