package com.chinasofti.cetp.practice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProExample() {
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

        public Criteria andProIdIsNull() {
            addCriterion("PRO_ID is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("PRO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("PRO_ID =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("PRO_ID <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("PRO_ID >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_ID >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("PRO_ID <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_ID <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("PRO_ID in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("PRO_ID not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("PRO_ID between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_ID not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("PRO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("PRO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("PRO_NAME =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("PRO_NAME <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("PRO_NAME >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_NAME >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("PRO_NAME <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("PRO_NAME <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("PRO_NAME like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("PRO_NAME not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("PRO_NAME in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("PRO_NAME not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("PRO_NAME between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("PRO_NAME not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProStyleIsNull() {
            addCriterion("PRO_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andProStyleIsNotNull() {
            addCriterion("PRO_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andProStyleEqualTo(String value) {
            addCriterion("PRO_STYLE =", value, "proStyle");
            return (Criteria) this;
        }

        public Criteria andProStyleNotEqualTo(String value) {
            addCriterion("PRO_STYLE <>", value, "proStyle");
            return (Criteria) this;
        }

        public Criteria andProStyleGreaterThan(String value) {
            addCriterion("PRO_STYLE >", value, "proStyle");
            return (Criteria) this;
        }

        public Criteria andProStyleGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_STYLE >=", value, "proStyle");
            return (Criteria) this;
        }

        public Criteria andProStyleLessThan(String value) {
            addCriterion("PRO_STYLE <", value, "proStyle");
            return (Criteria) this;
        }

        public Criteria andProStyleLessThanOrEqualTo(String value) {
            addCriterion("PRO_STYLE <=", value, "proStyle");
            return (Criteria) this;
        }

        public Criteria andProStyleLike(String value) {
            addCriterion("PRO_STYLE like", value, "proStyle");
            return (Criteria) this;
        }

        public Criteria andProStyleNotLike(String value) {
            addCriterion("PRO_STYLE not like", value, "proStyle");
            return (Criteria) this;
        }

        public Criteria andProStyleIn(List<String> values) {
            addCriterion("PRO_STYLE in", values, "proStyle");
            return (Criteria) this;
        }

        public Criteria andProStyleNotIn(List<String> values) {
            addCriterion("PRO_STYLE not in", values, "proStyle");
            return (Criteria) this;
        }

        public Criteria andProStyleBetween(String value1, String value2) {
            addCriterion("PRO_STYLE between", value1, value2, "proStyle");
            return (Criteria) this;
        }

        public Criteria andProStyleNotBetween(String value1, String value2) {
            addCriterion("PRO_STYLE not between", value1, value2, "proStyle");
            return (Criteria) this;
        }

        public Criteria andProTypeIdIsNull() {
            addCriterion("PRO_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProTypeIdIsNotNull() {
            addCriterion("PRO_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProTypeIdEqualTo(Integer value) {
            addCriterion("PRO_TYPE_ID =", value, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdNotEqualTo(Integer value) {
            addCriterion("PRO_TYPE_ID <>", value, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdGreaterThan(Integer value) {
            addCriterion("PRO_TYPE_ID >", value, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_TYPE_ID >=", value, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdLessThan(Integer value) {
            addCriterion("PRO_TYPE_ID <", value, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_TYPE_ID <=", value, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdIn(List<Integer> values) {
            addCriterion("PRO_TYPE_ID in", values, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdNotIn(List<Integer> values) {
            addCriterion("PRO_TYPE_ID not in", values, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("PRO_TYPE_ID between", value1, value2, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_TYPE_ID not between", value1, value2, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProIsTeamIsNull() {
            addCriterion("PRO_IS_TEAM is null");
            return (Criteria) this;
        }

        public Criteria andProIsTeamIsNotNull() {
            addCriterion("PRO_IS_TEAM is not null");
            return (Criteria) this;
        }

        public Criteria andProIsTeamEqualTo(String value) {
            addCriterion("PRO_IS_TEAM =", value, "proIsTeam");
            return (Criteria) this;
        }

        public Criteria andProIsTeamNotEqualTo(String value) {
            addCriterion("PRO_IS_TEAM <>", value, "proIsTeam");
            return (Criteria) this;
        }

        public Criteria andProIsTeamGreaterThan(String value) {
            addCriterion("PRO_IS_TEAM >", value, "proIsTeam");
            return (Criteria) this;
        }

        public Criteria andProIsTeamGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_IS_TEAM >=", value, "proIsTeam");
            return (Criteria) this;
        }

        public Criteria andProIsTeamLessThan(String value) {
            addCriterion("PRO_IS_TEAM <", value, "proIsTeam");
            return (Criteria) this;
        }

        public Criteria andProIsTeamLessThanOrEqualTo(String value) {
            addCriterion("PRO_IS_TEAM <=", value, "proIsTeam");
            return (Criteria) this;
        }

        public Criteria andProIsTeamLike(String value) {
            addCriterion("PRO_IS_TEAM like", value, "proIsTeam");
            return (Criteria) this;
        }

        public Criteria andProIsTeamNotLike(String value) {
            addCriterion("PRO_IS_TEAM not like", value, "proIsTeam");
            return (Criteria) this;
        }

        public Criteria andProIsTeamIn(List<String> values) {
            addCriterion("PRO_IS_TEAM in", values, "proIsTeam");
            return (Criteria) this;
        }

        public Criteria andProIsTeamNotIn(List<String> values) {
            addCriterion("PRO_IS_TEAM not in", values, "proIsTeam");
            return (Criteria) this;
        }

        public Criteria andProIsTeamBetween(String value1, String value2) {
            addCriterion("PRO_IS_TEAM between", value1, value2, "proIsTeam");
            return (Criteria) this;
        }

        public Criteria andProIsTeamNotBetween(String value1, String value2) {
            addCriterion("PRO_IS_TEAM not between", value1, value2, "proIsTeam");
            return (Criteria) this;
        }

        public Criteria andProDomainIsNull() {
            addCriterion("PRO_DOMAIN is null");
            return (Criteria) this;
        }

        public Criteria andProDomainIsNotNull() {
            addCriterion("PRO_DOMAIN is not null");
            return (Criteria) this;
        }

        public Criteria andProDomainEqualTo(String value) {
            addCriterion("PRO_DOMAIN =", value, "proDomain");
            return (Criteria) this;
        }

        public Criteria andProDomainNotEqualTo(String value) {
            addCriterion("PRO_DOMAIN <>", value, "proDomain");
            return (Criteria) this;
        }

        public Criteria andProDomainGreaterThan(String value) {
            addCriterion("PRO_DOMAIN >", value, "proDomain");
            return (Criteria) this;
        }

        public Criteria andProDomainGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_DOMAIN >=", value, "proDomain");
            return (Criteria) this;
        }

        public Criteria andProDomainLessThan(String value) {
            addCriterion("PRO_DOMAIN <", value, "proDomain");
            return (Criteria) this;
        }

        public Criteria andProDomainLessThanOrEqualTo(String value) {
            addCriterion("PRO_DOMAIN <=", value, "proDomain");
            return (Criteria) this;
        }

        public Criteria andProDomainLike(String value) {
            addCriterion("PRO_DOMAIN like", value, "proDomain");
            return (Criteria) this;
        }

        public Criteria andProDomainNotLike(String value) {
            addCriterion("PRO_DOMAIN not like", value, "proDomain");
            return (Criteria) this;
        }

        public Criteria andProDomainIn(List<String> values) {
            addCriterion("PRO_DOMAIN in", values, "proDomain");
            return (Criteria) this;
        }

        public Criteria andProDomainNotIn(List<String> values) {
            addCriterion("PRO_DOMAIN not in", values, "proDomain");
            return (Criteria) this;
        }

        public Criteria andProDomainBetween(String value1, String value2) {
            addCriterion("PRO_DOMAIN between", value1, value2, "proDomain");
            return (Criteria) this;
        }

        public Criteria andProDomainNotBetween(String value1, String value2) {
            addCriterion("PRO_DOMAIN not between", value1, value2, "proDomain");
            return (Criteria) this;
        }

        public Criteria andProLanguageIsNull() {
            addCriterion("PRO_LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andProLanguageIsNotNull() {
            addCriterion("PRO_LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andProLanguageEqualTo(String value) {
            addCriterion("PRO_LANGUAGE =", value, "proLanguage");
            return (Criteria) this;
        }

        public Criteria andProLanguageNotEqualTo(String value) {
            addCriterion("PRO_LANGUAGE <>", value, "proLanguage");
            return (Criteria) this;
        }

        public Criteria andProLanguageGreaterThan(String value) {
            addCriterion("PRO_LANGUAGE >", value, "proLanguage");
            return (Criteria) this;
        }

        public Criteria andProLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_LANGUAGE >=", value, "proLanguage");
            return (Criteria) this;
        }

        public Criteria andProLanguageLessThan(String value) {
            addCriterion("PRO_LANGUAGE <", value, "proLanguage");
            return (Criteria) this;
        }

        public Criteria andProLanguageLessThanOrEqualTo(String value) {
            addCriterion("PRO_LANGUAGE <=", value, "proLanguage");
            return (Criteria) this;
        }

        public Criteria andProLanguageLike(String value) {
            addCriterion("PRO_LANGUAGE like", value, "proLanguage");
            return (Criteria) this;
        }

        public Criteria andProLanguageNotLike(String value) {
            addCriterion("PRO_LANGUAGE not like", value, "proLanguage");
            return (Criteria) this;
        }

        public Criteria andProLanguageIn(List<String> values) {
            addCriterion("PRO_LANGUAGE in", values, "proLanguage");
            return (Criteria) this;
        }

        public Criteria andProLanguageNotIn(List<String> values) {
            addCriterion("PRO_LANGUAGE not in", values, "proLanguage");
            return (Criteria) this;
        }

        public Criteria andProLanguageBetween(String value1, String value2) {
            addCriterion("PRO_LANGUAGE between", value1, value2, "proLanguage");
            return (Criteria) this;
        }

        public Criteria andProLanguageNotBetween(String value1, String value2) {
            addCriterion("PRO_LANGUAGE not between", value1, value2, "proLanguage");
            return (Criteria) this;
        }

        public Criteria andProTimeIsNull() {
            addCriterion("PRO_TIME is null");
            return (Criteria) this;
        }

        public Criteria andProTimeIsNotNull() {
            addCriterion("PRO_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andProTimeEqualTo(Integer value) {
            addCriterion("PRO_TIME =", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeNotEqualTo(Integer value) {
            addCriterion("PRO_TIME <>", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeGreaterThan(Integer value) {
            addCriterion("PRO_TIME >", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_TIME >=", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeLessThan(Integer value) {
            addCriterion("PRO_TIME <", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_TIME <=", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeIn(List<Integer> values) {
            addCriterion("PRO_TIME in", values, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeNotIn(List<Integer> values) {
            addCriterion("PRO_TIME not in", values, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeBetween(Integer value1, Integer value2) {
            addCriterion("PRO_TIME between", value1, value2, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_TIME not between", value1, value2, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeSuffixIsNull() {
            addCriterion("PRO_TIME_SUFFIX is null");
            return (Criteria) this;
        }

        public Criteria andProTimeSuffixIsNotNull() {
            addCriterion("PRO_TIME_SUFFIX is not null");
            return (Criteria) this;
        }

        public Criteria andProTimeSuffixEqualTo(String value) {
            addCriterion("PRO_TIME_SUFFIX =", value, "proTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andProTimeSuffixNotEqualTo(String value) {
            addCriterion("PRO_TIME_SUFFIX <>", value, "proTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andProTimeSuffixGreaterThan(String value) {
            addCriterion("PRO_TIME_SUFFIX >", value, "proTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andProTimeSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_TIME_SUFFIX >=", value, "proTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andProTimeSuffixLessThan(String value) {
            addCriterion("PRO_TIME_SUFFIX <", value, "proTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andProTimeSuffixLessThanOrEqualTo(String value) {
            addCriterion("PRO_TIME_SUFFIX <=", value, "proTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andProTimeSuffixLike(String value) {
            addCriterion("PRO_TIME_SUFFIX like", value, "proTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andProTimeSuffixNotLike(String value) {
            addCriterion("PRO_TIME_SUFFIX not like", value, "proTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andProTimeSuffixIn(List<String> values) {
            addCriterion("PRO_TIME_SUFFIX in", values, "proTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andProTimeSuffixNotIn(List<String> values) {
            addCriterion("PRO_TIME_SUFFIX not in", values, "proTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andProTimeSuffixBetween(String value1, String value2) {
            addCriterion("PRO_TIME_SUFFIX between", value1, value2, "proTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andProTimeSuffixNotBetween(String value1, String value2) {
            addCriterion("PRO_TIME_SUFFIX not between", value1, value2, "proTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andProDiffcultIsNull() {
            addCriterion("PRO_DIFFCULT is null");
            return (Criteria) this;
        }

        public Criteria andProDiffcultIsNotNull() {
            addCriterion("PRO_DIFFCULT is not null");
            return (Criteria) this;
        }

        public Criteria andProDiffcultEqualTo(String value) {
            addCriterion("PRO_DIFFCULT =", value, "proDiffcult");
            return (Criteria) this;
        }

        public Criteria andProDiffcultNotEqualTo(String value) {
            addCriterion("PRO_DIFFCULT <>", value, "proDiffcult");
            return (Criteria) this;
        }

        public Criteria andProDiffcultGreaterThan(String value) {
            addCriterion("PRO_DIFFCULT >", value, "proDiffcult");
            return (Criteria) this;
        }

        public Criteria andProDiffcultGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_DIFFCULT >=", value, "proDiffcult");
            return (Criteria) this;
        }

        public Criteria andProDiffcultLessThan(String value) {
            addCriterion("PRO_DIFFCULT <", value, "proDiffcult");
            return (Criteria) this;
        }

        public Criteria andProDiffcultLessThanOrEqualTo(String value) {
            addCriterion("PRO_DIFFCULT <=", value, "proDiffcult");
            return (Criteria) this;
        }

        public Criteria andProDiffcultLike(String value) {
            addCriterion("PRO_DIFFCULT like", value, "proDiffcult");
            return (Criteria) this;
        }

        public Criteria andProDiffcultNotLike(String value) {
            addCriterion("PRO_DIFFCULT not like", value, "proDiffcult");
            return (Criteria) this;
        }

        public Criteria andProDiffcultIn(List<String> values) {
            addCriterion("PRO_DIFFCULT in", values, "proDiffcult");
            return (Criteria) this;
        }

        public Criteria andProDiffcultNotIn(List<String> values) {
            addCriterion("PRO_DIFFCULT not in", values, "proDiffcult");
            return (Criteria) this;
        }

        public Criteria andProDiffcultBetween(String value1, String value2) {
            addCriterion("PRO_DIFFCULT between", value1, value2, "proDiffcult");
            return (Criteria) this;
        }

        public Criteria andProDiffcultNotBetween(String value1, String value2) {
            addCriterion("PRO_DIFFCULT not between", value1, value2, "proDiffcult");
            return (Criteria) this;
        }

        public Criteria andProPersonNumIsNull() {
            addCriterion("PRO_PERSON_NUM is null");
            return (Criteria) this;
        }

        public Criteria andProPersonNumIsNotNull() {
            addCriterion("PRO_PERSON_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andProPersonNumEqualTo(Integer value) {
            addCriterion("PRO_PERSON_NUM =", value, "proPersonNum");
            return (Criteria) this;
        }

        public Criteria andProPersonNumNotEqualTo(Integer value) {
            addCriterion("PRO_PERSON_NUM <>", value, "proPersonNum");
            return (Criteria) this;
        }

        public Criteria andProPersonNumGreaterThan(Integer value) {
            addCriterion("PRO_PERSON_NUM >", value, "proPersonNum");
            return (Criteria) this;
        }

        public Criteria andProPersonNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_PERSON_NUM >=", value, "proPersonNum");
            return (Criteria) this;
        }

        public Criteria andProPersonNumLessThan(Integer value) {
            addCriterion("PRO_PERSON_NUM <", value, "proPersonNum");
            return (Criteria) this;
        }

        public Criteria andProPersonNumLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_PERSON_NUM <=", value, "proPersonNum");
            return (Criteria) this;
        }

        public Criteria andProPersonNumIn(List<Integer> values) {
            addCriterion("PRO_PERSON_NUM in", values, "proPersonNum");
            return (Criteria) this;
        }

        public Criteria andProPersonNumNotIn(List<Integer> values) {
            addCriterion("PRO_PERSON_NUM not in", values, "proPersonNum");
            return (Criteria) this;
        }

        public Criteria andProPersonNumBetween(Integer value1, Integer value2) {
            addCriterion("PRO_PERSON_NUM between", value1, value2, "proPersonNum");
            return (Criteria) this;
        }

        public Criteria andProPersonNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_PERSON_NUM not between", value1, value2, "proPersonNum");
            return (Criteria) this;
        }

        public Criteria andProOwnerFlagIsNull() {
            addCriterion("PRO_OWNER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andProOwnerFlagIsNotNull() {
            addCriterion("PRO_OWNER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andProOwnerFlagEqualTo(String value) {
            addCriterion("PRO_OWNER_FLAG =", value, "proOwnerFlag");
            return (Criteria) this;
        }

        public Criteria andProOwnerFlagNotEqualTo(String value) {
            addCriterion("PRO_OWNER_FLAG <>", value, "proOwnerFlag");
            return (Criteria) this;
        }

        public Criteria andProOwnerFlagGreaterThan(String value) {
            addCriterion("PRO_OWNER_FLAG >", value, "proOwnerFlag");
            return (Criteria) this;
        }

        public Criteria andProOwnerFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_OWNER_FLAG >=", value, "proOwnerFlag");
            return (Criteria) this;
        }

        public Criteria andProOwnerFlagLessThan(String value) {
            addCriterion("PRO_OWNER_FLAG <", value, "proOwnerFlag");
            return (Criteria) this;
        }

        public Criteria andProOwnerFlagLessThanOrEqualTo(String value) {
            addCriterion("PRO_OWNER_FLAG <=", value, "proOwnerFlag");
            return (Criteria) this;
        }

        public Criteria andProOwnerFlagLike(String value) {
            addCriterion("PRO_OWNER_FLAG like", value, "proOwnerFlag");
            return (Criteria) this;
        }

        public Criteria andProOwnerFlagNotLike(String value) {
            addCriterion("PRO_OWNER_FLAG not like", value, "proOwnerFlag");
            return (Criteria) this;
        }

        public Criteria andProOwnerFlagIn(List<String> values) {
            addCriterion("PRO_OWNER_FLAG in", values, "proOwnerFlag");
            return (Criteria) this;
        }

        public Criteria andProOwnerFlagNotIn(List<String> values) {
            addCriterion("PRO_OWNER_FLAG not in", values, "proOwnerFlag");
            return (Criteria) this;
        }

        public Criteria andProOwnerFlagBetween(String value1, String value2) {
            addCriterion("PRO_OWNER_FLAG between", value1, value2, "proOwnerFlag");
            return (Criteria) this;
        }

        public Criteria andProOwnerFlagNotBetween(String value1, String value2) {
            addCriterion("PRO_OWNER_FLAG not between", value1, value2, "proOwnerFlag");
            return (Criteria) this;
        }

        public Criteria andProKrywordIsNull() {
            addCriterion("PRO_KRYWORD is null");
            return (Criteria) this;
        }

        public Criteria andProKrywordIsNotNull() {
            addCriterion("PRO_KRYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andProKrywordEqualTo(String value) {
            addCriterion("PRO_KRYWORD =", value, "proKryword");
            return (Criteria) this;
        }

        public Criteria andProKrywordNotEqualTo(String value) {
            addCriterion("PRO_KRYWORD <>", value, "proKryword");
            return (Criteria) this;
        }

        public Criteria andProKrywordGreaterThan(String value) {
            addCriterion("PRO_KRYWORD >", value, "proKryword");
            return (Criteria) this;
        }

        public Criteria andProKrywordGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_KRYWORD >=", value, "proKryword");
            return (Criteria) this;
        }

        public Criteria andProKrywordLessThan(String value) {
            addCriterion("PRO_KRYWORD <", value, "proKryword");
            return (Criteria) this;
        }

        public Criteria andProKrywordLessThanOrEqualTo(String value) {
            addCriterion("PRO_KRYWORD <=", value, "proKryword");
            return (Criteria) this;
        }

        public Criteria andProKrywordLike(String value) {
            addCriterion("PRO_KRYWORD like", value, "proKryword");
            return (Criteria) this;
        }

        public Criteria andProKrywordNotLike(String value) {
            addCriterion("PRO_KRYWORD not like", value, "proKryword");
            return (Criteria) this;
        }

        public Criteria andProKrywordIn(List<String> values) {
            addCriterion("PRO_KRYWORD in", values, "proKryword");
            return (Criteria) this;
        }

        public Criteria andProKrywordNotIn(List<String> values) {
            addCriterion("PRO_KRYWORD not in", values, "proKryword");
            return (Criteria) this;
        }

        public Criteria andProKrywordBetween(String value1, String value2) {
            addCriterion("PRO_KRYWORD between", value1, value2, "proKryword");
            return (Criteria) this;
        }

        public Criteria andProKrywordNotBetween(String value1, String value2) {
            addCriterion("PRO_KRYWORD not between", value1, value2, "proKryword");
            return (Criteria) this;
        }

        public Criteria andProPreCondIsNull() {
            addCriterion("PRO_PRE_COND is null");
            return (Criteria) this;
        }

        public Criteria andProPreCondIsNotNull() {
            addCriterion("PRO_PRE_COND is not null");
            return (Criteria) this;
        }

        public Criteria andProPreCondEqualTo(String value) {
            addCriterion("PRO_PRE_COND =", value, "proPreCond");
            return (Criteria) this;
        }

        public Criteria andProPreCondNotEqualTo(String value) {
            addCriterion("PRO_PRE_COND <>", value, "proPreCond");
            return (Criteria) this;
        }

        public Criteria andProPreCondGreaterThan(String value) {
            addCriterion("PRO_PRE_COND >", value, "proPreCond");
            return (Criteria) this;
        }

        public Criteria andProPreCondGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_PRE_COND >=", value, "proPreCond");
            return (Criteria) this;
        }

        public Criteria andProPreCondLessThan(String value) {
            addCriterion("PRO_PRE_COND <", value, "proPreCond");
            return (Criteria) this;
        }

        public Criteria andProPreCondLessThanOrEqualTo(String value) {
            addCriterion("PRO_PRE_COND <=", value, "proPreCond");
            return (Criteria) this;
        }

        public Criteria andProPreCondLike(String value) {
            addCriterion("PRO_PRE_COND like", value, "proPreCond");
            return (Criteria) this;
        }

        public Criteria andProPreCondNotLike(String value) {
            addCriterion("PRO_PRE_COND not like", value, "proPreCond");
            return (Criteria) this;
        }

        public Criteria andProPreCondIn(List<String> values) {
            addCriterion("PRO_PRE_COND in", values, "proPreCond");
            return (Criteria) this;
        }

        public Criteria andProPreCondNotIn(List<String> values) {
            addCriterion("PRO_PRE_COND not in", values, "proPreCond");
            return (Criteria) this;
        }

        public Criteria andProPreCondBetween(String value1, String value2) {
            addCriterion("PRO_PRE_COND between", value1, value2, "proPreCond");
            return (Criteria) this;
        }

        public Criteria andProPreCondNotBetween(String value1, String value2) {
            addCriterion("PRO_PRE_COND not between", value1, value2, "proPreCond");
            return (Criteria) this;
        }

        public Criteria andProTechIsNull() {
            addCriterion("PRO_TECH is null");
            return (Criteria) this;
        }

        public Criteria andProTechIsNotNull() {
            addCriterion("PRO_TECH is not null");
            return (Criteria) this;
        }

        public Criteria andProTechEqualTo(String value) {
            addCriterion("PRO_TECH =", value, "proTech");
            return (Criteria) this;
        }

        public Criteria andProTechNotEqualTo(String value) {
            addCriterion("PRO_TECH <>", value, "proTech");
            return (Criteria) this;
        }

        public Criteria andProTechGreaterThan(String value) {
            addCriterion("PRO_TECH >", value, "proTech");
            return (Criteria) this;
        }

        public Criteria andProTechGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_TECH >=", value, "proTech");
            return (Criteria) this;
        }

        public Criteria andProTechLessThan(String value) {
            addCriterion("PRO_TECH <", value, "proTech");
            return (Criteria) this;
        }

        public Criteria andProTechLessThanOrEqualTo(String value) {
            addCriterion("PRO_TECH <=", value, "proTech");
            return (Criteria) this;
        }

        public Criteria andProTechLike(String value) {
            addCriterion("PRO_TECH like", value, "proTech");
            return (Criteria) this;
        }

        public Criteria andProTechNotLike(String value) {
            addCriterion("PRO_TECH not like", value, "proTech");
            return (Criteria) this;
        }

        public Criteria andProTechIn(List<String> values) {
            addCriterion("PRO_TECH in", values, "proTech");
            return (Criteria) this;
        }

        public Criteria andProTechNotIn(List<String> values) {
            addCriterion("PRO_TECH not in", values, "proTech");
            return (Criteria) this;
        }

        public Criteria andProTechBetween(String value1, String value2) {
            addCriterion("PRO_TECH between", value1, value2, "proTech");
            return (Criteria) this;
        }

        public Criteria andProTechNotBetween(String value1, String value2) {
            addCriterion("PRO_TECH not between", value1, value2, "proTech");
            return (Criteria) this;
        }

        public Criteria andProUserNoIsNull() {
            addCriterion("PRO_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andProUserNoIsNotNull() {
            addCriterion("PRO_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProUserNoEqualTo(Integer value) {
            addCriterion("PRO_USER_NO =", value, "proUserNo");
            return (Criteria) this;
        }

        public Criteria andProUserNoNotEqualTo(Integer value) {
            addCriterion("PRO_USER_NO <>", value, "proUserNo");
            return (Criteria) this;
        }

        public Criteria andProUserNoGreaterThan(Integer value) {
            addCriterion("PRO_USER_NO >", value, "proUserNo");
            return (Criteria) this;
        }

        public Criteria andProUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_USER_NO >=", value, "proUserNo");
            return (Criteria) this;
        }

        public Criteria andProUserNoLessThan(Integer value) {
            addCriterion("PRO_USER_NO <", value, "proUserNo");
            return (Criteria) this;
        }

        public Criteria andProUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_USER_NO <=", value, "proUserNo");
            return (Criteria) this;
        }

        public Criteria andProUserNoIn(List<Integer> values) {
            addCriterion("PRO_USER_NO in", values, "proUserNo");
            return (Criteria) this;
        }

        public Criteria andProUserNoNotIn(List<Integer> values) {
            addCriterion("PRO_USER_NO not in", values, "proUserNo");
            return (Criteria) this;
        }

        public Criteria andProUserNoBetween(Integer value1, Integer value2) {
            addCriterion("PRO_USER_NO between", value1, value2, "proUserNo");
            return (Criteria) this;
        }

        public Criteria andProUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_USER_NO not between", value1, value2, "proUserNo");
            return (Criteria) this;
        }

        public Criteria andProRegtimeIsNull() {
            addCriterion("PRO_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andProRegtimeIsNotNull() {
            addCriterion("PRO_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andProRegtimeEqualTo(Date value) {
            addCriterion("PRO_REGTIME =", value, "proRegtime");
            return (Criteria) this;
        }

        public Criteria andProRegtimeNotEqualTo(Date value) {
            addCriterion("PRO_REGTIME <>", value, "proRegtime");
            return (Criteria) this;
        }

        public Criteria andProRegtimeGreaterThan(Date value) {
            addCriterion("PRO_REGTIME >", value, "proRegtime");
            return (Criteria) this;
        }

        public Criteria andProRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PRO_REGTIME >=", value, "proRegtime");
            return (Criteria) this;
        }

        public Criteria andProRegtimeLessThan(Date value) {
            addCriterion("PRO_REGTIME <", value, "proRegtime");
            return (Criteria) this;
        }

        public Criteria andProRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("PRO_REGTIME <=", value, "proRegtime");
            return (Criteria) this;
        }

        public Criteria andProRegtimeIn(List<Date> values) {
            addCriterion("PRO_REGTIME in", values, "proRegtime");
            return (Criteria) this;
        }

        public Criteria andProRegtimeNotIn(List<Date> values) {
            addCriterion("PRO_REGTIME not in", values, "proRegtime");
            return (Criteria) this;
        }

        public Criteria andProRegtimeBetween(Date value1, Date value2) {
            addCriterion("PRO_REGTIME between", value1, value2, "proRegtime");
            return (Criteria) this;
        }

        public Criteria andProRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("PRO_REGTIME not between", value1, value2, "proRegtime");
            return (Criteria) this;
        }

        public Criteria andProCostIsNull() {
            addCriterion("PRO_COST is null");
            return (Criteria) this;
        }

        public Criteria andProCostIsNotNull() {
            addCriterion("PRO_COST is not null");
            return (Criteria) this;
        }

        public Criteria andProCostEqualTo(Integer value) {
            addCriterion("PRO_COST =", value, "proCost");
            return (Criteria) this;
        }

        public Criteria andProCostNotEqualTo(Integer value) {
            addCriterion("PRO_COST <>", value, "proCost");
            return (Criteria) this;
        }

        public Criteria andProCostGreaterThan(Integer value) {
            addCriterion("PRO_COST >", value, "proCost");
            return (Criteria) this;
        }

        public Criteria andProCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_COST >=", value, "proCost");
            return (Criteria) this;
        }

        public Criteria andProCostLessThan(Integer value) {
            addCriterion("PRO_COST <", value, "proCost");
            return (Criteria) this;
        }

        public Criteria andProCostLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_COST <=", value, "proCost");
            return (Criteria) this;
        }

        public Criteria andProCostIn(List<Integer> values) {
            addCriterion("PRO_COST in", values, "proCost");
            return (Criteria) this;
        }

        public Criteria andProCostNotIn(List<Integer> values) {
            addCriterion("PRO_COST not in", values, "proCost");
            return (Criteria) this;
        }

        public Criteria andProCostBetween(Integer value1, Integer value2) {
            addCriterion("PRO_COST between", value1, value2, "proCost");
            return (Criteria) this;
        }

        public Criteria andProCostNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_COST not between", value1, value2, "proCost");
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