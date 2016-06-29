package com.chinasofti.cetp.practice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeamMemberExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_team_member
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_team_member
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_team_member
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_member
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public TeamMemberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_member
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_member
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_member
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_member
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_member
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_member
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_member
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
     * This method corresponds to the database table tp_team_member
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
     * This method corresponds to the database table tp_team_member
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_member
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
     * This class corresponds to the database table tp_team_member
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

        public Criteria andTmTeamIdIsNull() {
            addCriterion("TM_TEAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andTmTeamIdIsNotNull() {
            addCriterion("TM_TEAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTmTeamIdEqualTo(Integer value) {
            addCriterion("TM_TEAM_ID =", value, "tmTeamId");
            return (Criteria) this;
        }

        public Criteria andTmTeamIdNotEqualTo(Integer value) {
            addCriterion("TM_TEAM_ID <>", value, "tmTeamId");
            return (Criteria) this;
        }

        public Criteria andTmTeamIdGreaterThan(Integer value) {
            addCriterion("TM_TEAM_ID >", value, "tmTeamId");
            return (Criteria) this;
        }

        public Criteria andTmTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TM_TEAM_ID >=", value, "tmTeamId");
            return (Criteria) this;
        }

        public Criteria andTmTeamIdLessThan(Integer value) {
            addCriterion("TM_TEAM_ID <", value, "tmTeamId");
            return (Criteria) this;
        }

        public Criteria andTmTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("TM_TEAM_ID <=", value, "tmTeamId");
            return (Criteria) this;
        }

        public Criteria andTmTeamIdIn(List<Integer> values) {
            addCriterion("TM_TEAM_ID in", values, "tmTeamId");
            return (Criteria) this;
        }

        public Criteria andTmTeamIdNotIn(List<Integer> values) {
            addCriterion("TM_TEAM_ID not in", values, "tmTeamId");
            return (Criteria) this;
        }

        public Criteria andTmTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("TM_TEAM_ID between", value1, value2, "tmTeamId");
            return (Criteria) this;
        }

        public Criteria andTmTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TM_TEAM_ID not between", value1, value2, "tmTeamId");
            return (Criteria) this;
        }

        public Criteria andTmMemberNoIsNull() {
            addCriterion("TM_MEMBER_NO is null");
            return (Criteria) this;
        }

        public Criteria andTmMemberNoIsNotNull() {
            addCriterion("TM_MEMBER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTmMemberNoEqualTo(Integer value) {
            addCriterion("TM_MEMBER_NO =", value, "tmMemberNo");
            return (Criteria) this;
        }

        public Criteria andTmMemberNoNotEqualTo(Integer value) {
            addCriterion("TM_MEMBER_NO <>", value, "tmMemberNo");
            return (Criteria) this;
        }

        public Criteria andTmMemberNoGreaterThan(Integer value) {
            addCriterion("TM_MEMBER_NO >", value, "tmMemberNo");
            return (Criteria) this;
        }

        public Criteria andTmMemberNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("TM_MEMBER_NO >=", value, "tmMemberNo");
            return (Criteria) this;
        }

        public Criteria andTmMemberNoLessThan(Integer value) {
            addCriterion("TM_MEMBER_NO <", value, "tmMemberNo");
            return (Criteria) this;
        }

        public Criteria andTmMemberNoLessThanOrEqualTo(Integer value) {
            addCriterion("TM_MEMBER_NO <=", value, "tmMemberNo");
            return (Criteria) this;
        }

        public Criteria andTmMemberNoIn(List<Integer> values) {
            addCriterion("TM_MEMBER_NO in", values, "tmMemberNo");
            return (Criteria) this;
        }

        public Criteria andTmMemberNoNotIn(List<Integer> values) {
            addCriterion("TM_MEMBER_NO not in", values, "tmMemberNo");
            return (Criteria) this;
        }

        public Criteria andTmMemberNoBetween(Integer value1, Integer value2) {
            addCriterion("TM_MEMBER_NO between", value1, value2, "tmMemberNo");
            return (Criteria) this;
        }

        public Criteria andTmMemberNoNotBetween(Integer value1, Integer value2) {
            addCriterion("TM_MEMBER_NO not between", value1, value2, "tmMemberNo");
            return (Criteria) this;
        }

        public Criteria andTmMemberNameIsNull() {
            addCriterion("TM_MEMBER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTmMemberNameIsNotNull() {
            addCriterion("TM_MEMBER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTmMemberNameEqualTo(String value) {
            addCriterion("TM_MEMBER_NAME =", value, "tmMemberName");
            return (Criteria) this;
        }

        public Criteria andTmMemberNameNotEqualTo(String value) {
            addCriterion("TM_MEMBER_NAME <>", value, "tmMemberName");
            return (Criteria) this;
        }

        public Criteria andTmMemberNameGreaterThan(String value) {
            addCriterion("TM_MEMBER_NAME >", value, "tmMemberName");
            return (Criteria) this;
        }

        public Criteria andTmMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("TM_MEMBER_NAME >=", value, "tmMemberName");
            return (Criteria) this;
        }

        public Criteria andTmMemberNameLessThan(String value) {
            addCriterion("TM_MEMBER_NAME <", value, "tmMemberName");
            return (Criteria) this;
        }

        public Criteria andTmMemberNameLessThanOrEqualTo(String value) {
            addCriterion("TM_MEMBER_NAME <=", value, "tmMemberName");
            return (Criteria) this;
        }

        public Criteria andTmMemberNameLike(String value) {
            addCriterion("TM_MEMBER_NAME like", value, "tmMemberName");
            return (Criteria) this;
        }

        public Criteria andTmMemberNameNotLike(String value) {
            addCriterion("TM_MEMBER_NAME not like", value, "tmMemberName");
            return (Criteria) this;
        }

        public Criteria andTmMemberNameIn(List<String> values) {
            addCriterion("TM_MEMBER_NAME in", values, "tmMemberName");
            return (Criteria) this;
        }

        public Criteria andTmMemberNameNotIn(List<String> values) {
            addCriterion("TM_MEMBER_NAME not in", values, "tmMemberName");
            return (Criteria) this;
        }

        public Criteria andTmMemberNameBetween(String value1, String value2) {
            addCriterion("TM_MEMBER_NAME between", value1, value2, "tmMemberName");
            return (Criteria) this;
        }

        public Criteria andTmMemberNameNotBetween(String value1, String value2) {
            addCriterion("TM_MEMBER_NAME not between", value1, value2, "tmMemberName");
            return (Criteria) this;
        }

        public Criteria andTmMemberRoleIsNull() {
            addCriterion("TM_MEMBER_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andTmMemberRoleIsNotNull() {
            addCriterion("TM_MEMBER_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andTmMemberRoleEqualTo(String value) {
            addCriterion("TM_MEMBER_ROLE =", value, "tmMemberRole");
            return (Criteria) this;
        }

        public Criteria andTmMemberRoleNotEqualTo(String value) {
            addCriterion("TM_MEMBER_ROLE <>", value, "tmMemberRole");
            return (Criteria) this;
        }

        public Criteria andTmMemberRoleGreaterThan(String value) {
            addCriterion("TM_MEMBER_ROLE >", value, "tmMemberRole");
            return (Criteria) this;
        }

        public Criteria andTmMemberRoleGreaterThanOrEqualTo(String value) {
            addCriterion("TM_MEMBER_ROLE >=", value, "tmMemberRole");
            return (Criteria) this;
        }

        public Criteria andTmMemberRoleLessThan(String value) {
            addCriterion("TM_MEMBER_ROLE <", value, "tmMemberRole");
            return (Criteria) this;
        }

        public Criteria andTmMemberRoleLessThanOrEqualTo(String value) {
            addCriterion("TM_MEMBER_ROLE <=", value, "tmMemberRole");
            return (Criteria) this;
        }

        public Criteria andTmMemberRoleLike(String value) {
            addCriterion("TM_MEMBER_ROLE like", value, "tmMemberRole");
            return (Criteria) this;
        }

        public Criteria andTmMemberRoleNotLike(String value) {
            addCriterion("TM_MEMBER_ROLE not like", value, "tmMemberRole");
            return (Criteria) this;
        }

        public Criteria andTmMemberRoleIn(List<String> values) {
            addCriterion("TM_MEMBER_ROLE in", values, "tmMemberRole");
            return (Criteria) this;
        }

        public Criteria andTmMemberRoleNotIn(List<String> values) {
            addCriterion("TM_MEMBER_ROLE not in", values, "tmMemberRole");
            return (Criteria) this;
        }

        public Criteria andTmMemberRoleBetween(String value1, String value2) {
            addCriterion("TM_MEMBER_ROLE between", value1, value2, "tmMemberRole");
            return (Criteria) this;
        }

        public Criteria andTmMemberRoleNotBetween(String value1, String value2) {
            addCriterion("TM_MEMBER_ROLE not between", value1, value2, "tmMemberRole");
            return (Criteria) this;
        }

        public Criteria andTmMemberImgIsNull() {
            addCriterion("TM_MEMBER_IMG is null");
            return (Criteria) this;
        }

        public Criteria andTmMemberImgIsNotNull() {
            addCriterion("TM_MEMBER_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andTmMemberImgEqualTo(String value) {
            addCriterion("TM_MEMBER_IMG =", value, "tmMemberImg");
            return (Criteria) this;
        }

        public Criteria andTmMemberImgNotEqualTo(String value) {
            addCriterion("TM_MEMBER_IMG <>", value, "tmMemberImg");
            return (Criteria) this;
        }

        public Criteria andTmMemberImgGreaterThan(String value) {
            addCriterion("TM_MEMBER_IMG >", value, "tmMemberImg");
            return (Criteria) this;
        }

        public Criteria andTmMemberImgGreaterThanOrEqualTo(String value) {
            addCriterion("TM_MEMBER_IMG >=", value, "tmMemberImg");
            return (Criteria) this;
        }

        public Criteria andTmMemberImgLessThan(String value) {
            addCriterion("TM_MEMBER_IMG <", value, "tmMemberImg");
            return (Criteria) this;
        }

        public Criteria andTmMemberImgLessThanOrEqualTo(String value) {
            addCriterion("TM_MEMBER_IMG <=", value, "tmMemberImg");
            return (Criteria) this;
        }

        public Criteria andTmMemberImgLike(String value) {
            addCriterion("TM_MEMBER_IMG like", value, "tmMemberImg");
            return (Criteria) this;
        }

        public Criteria andTmMemberImgNotLike(String value) {
            addCriterion("TM_MEMBER_IMG not like", value, "tmMemberImg");
            return (Criteria) this;
        }

        public Criteria andTmMemberImgIn(List<String> values) {
            addCriterion("TM_MEMBER_IMG in", values, "tmMemberImg");
            return (Criteria) this;
        }

        public Criteria andTmMemberImgNotIn(List<String> values) {
            addCriterion("TM_MEMBER_IMG not in", values, "tmMemberImg");
            return (Criteria) this;
        }

        public Criteria andTmMemberImgBetween(String value1, String value2) {
            addCriterion("TM_MEMBER_IMG between", value1, value2, "tmMemberImg");
            return (Criteria) this;
        }

        public Criteria andTmMemberImgNotBetween(String value1, String value2) {
            addCriterion("TM_MEMBER_IMG not between", value1, value2, "tmMemberImg");
            return (Criteria) this;
        }

        public Criteria andTmMemberIntroIsNull() {
            addCriterion("TM_MEMBER_INTRO is null");
            return (Criteria) this;
        }

        public Criteria andTmMemberIntroIsNotNull() {
            addCriterion("TM_MEMBER_INTRO is not null");
            return (Criteria) this;
        }

        public Criteria andTmMemberIntroEqualTo(String value) {
            addCriterion("TM_MEMBER_INTRO =", value, "tmMemberIntro");
            return (Criteria) this;
        }

        public Criteria andTmMemberIntroNotEqualTo(String value) {
            addCriterion("TM_MEMBER_INTRO <>", value, "tmMemberIntro");
            return (Criteria) this;
        }

        public Criteria andTmMemberIntroGreaterThan(String value) {
            addCriterion("TM_MEMBER_INTRO >", value, "tmMemberIntro");
            return (Criteria) this;
        }

        public Criteria andTmMemberIntroGreaterThanOrEqualTo(String value) {
            addCriterion("TM_MEMBER_INTRO >=", value, "tmMemberIntro");
            return (Criteria) this;
        }

        public Criteria andTmMemberIntroLessThan(String value) {
            addCriterion("TM_MEMBER_INTRO <", value, "tmMemberIntro");
            return (Criteria) this;
        }

        public Criteria andTmMemberIntroLessThanOrEqualTo(String value) {
            addCriterion("TM_MEMBER_INTRO <=", value, "tmMemberIntro");
            return (Criteria) this;
        }

        public Criteria andTmMemberIntroLike(String value) {
            addCriterion("TM_MEMBER_INTRO like", value, "tmMemberIntro");
            return (Criteria) this;
        }

        public Criteria andTmMemberIntroNotLike(String value) {
            addCriterion("TM_MEMBER_INTRO not like", value, "tmMemberIntro");
            return (Criteria) this;
        }

        public Criteria andTmMemberIntroIn(List<String> values) {
            addCriterion("TM_MEMBER_INTRO in", values, "tmMemberIntro");
            return (Criteria) this;
        }

        public Criteria andTmMemberIntroNotIn(List<String> values) {
            addCriterion("TM_MEMBER_INTRO not in", values, "tmMemberIntro");
            return (Criteria) this;
        }

        public Criteria andTmMemberIntroBetween(String value1, String value2) {
            addCriterion("TM_MEMBER_INTRO between", value1, value2, "tmMemberIntro");
            return (Criteria) this;
        }

        public Criteria andTmMemberIntroNotBetween(String value1, String value2) {
            addCriterion("TM_MEMBER_INTRO not between", value1, value2, "tmMemberIntro");
            return (Criteria) this;
        }

        public Criteria andTmHardScoreIsNull() {
            addCriterion("TM_HARD_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andTmHardScoreIsNotNull() {
            addCriterion("TM_HARD_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andTmHardScoreEqualTo(Integer value) {
            addCriterion("TM_HARD_SCORE =", value, "tmHardScore");
            return (Criteria) this;
        }

        public Criteria andTmHardScoreNotEqualTo(Integer value) {
            addCriterion("TM_HARD_SCORE <>", value, "tmHardScore");
            return (Criteria) this;
        }

        public Criteria andTmHardScoreGreaterThan(Integer value) {
            addCriterion("TM_HARD_SCORE >", value, "tmHardScore");
            return (Criteria) this;
        }

        public Criteria andTmHardScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("TM_HARD_SCORE >=", value, "tmHardScore");
            return (Criteria) this;
        }

        public Criteria andTmHardScoreLessThan(Integer value) {
            addCriterion("TM_HARD_SCORE <", value, "tmHardScore");
            return (Criteria) this;
        }

        public Criteria andTmHardScoreLessThanOrEqualTo(Integer value) {
            addCriterion("TM_HARD_SCORE <=", value, "tmHardScore");
            return (Criteria) this;
        }

        public Criteria andTmHardScoreIn(List<Integer> values) {
            addCriterion("TM_HARD_SCORE in", values, "tmHardScore");
            return (Criteria) this;
        }

        public Criteria andTmHardScoreNotIn(List<Integer> values) {
            addCriterion("TM_HARD_SCORE not in", values, "tmHardScore");
            return (Criteria) this;
        }

        public Criteria andTmHardScoreBetween(Integer value1, Integer value2) {
            addCriterion("TM_HARD_SCORE between", value1, value2, "tmHardScore");
            return (Criteria) this;
        }

        public Criteria andTmHardScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("TM_HARD_SCORE not between", value1, value2, "tmHardScore");
            return (Criteria) this;
        }

        public Criteria andTmSoftScoreIsNull() {
            addCriterion("TM_SOFT_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andTmSoftScoreIsNotNull() {
            addCriterion("TM_SOFT_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andTmSoftScoreEqualTo(Integer value) {
            addCriterion("TM_SOFT_SCORE =", value, "tmSoftScore");
            return (Criteria) this;
        }

        public Criteria andTmSoftScoreNotEqualTo(Integer value) {
            addCriterion("TM_SOFT_SCORE <>", value, "tmSoftScore");
            return (Criteria) this;
        }

        public Criteria andTmSoftScoreGreaterThan(Integer value) {
            addCriterion("TM_SOFT_SCORE >", value, "tmSoftScore");
            return (Criteria) this;
        }

        public Criteria andTmSoftScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("TM_SOFT_SCORE >=", value, "tmSoftScore");
            return (Criteria) this;
        }

        public Criteria andTmSoftScoreLessThan(Integer value) {
            addCriterion("TM_SOFT_SCORE <", value, "tmSoftScore");
            return (Criteria) this;
        }

        public Criteria andTmSoftScoreLessThanOrEqualTo(Integer value) {
            addCriterion("TM_SOFT_SCORE <=", value, "tmSoftScore");
            return (Criteria) this;
        }

        public Criteria andTmSoftScoreIn(List<Integer> values) {
            addCriterion("TM_SOFT_SCORE in", values, "tmSoftScore");
            return (Criteria) this;
        }

        public Criteria andTmSoftScoreNotIn(List<Integer> values) {
            addCriterion("TM_SOFT_SCORE not in", values, "tmSoftScore");
            return (Criteria) this;
        }

        public Criteria andTmSoftScoreBetween(Integer value1, Integer value2) {
            addCriterion("TM_SOFT_SCORE between", value1, value2, "tmSoftScore");
            return (Criteria) this;
        }

        public Criteria andTmSoftScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("TM_SOFT_SCORE not between", value1, value2, "tmSoftScore");
            return (Criteria) this;
        }

        public Criteria andTmRealScoreIsNull() {
            addCriterion("TM_REAL_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andTmRealScoreIsNotNull() {
            addCriterion("TM_REAL_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andTmRealScoreEqualTo(Integer value) {
            addCriterion("TM_REAL_SCORE =", value, "tmRealScore");
            return (Criteria) this;
        }

        public Criteria andTmRealScoreNotEqualTo(Integer value) {
            addCriterion("TM_REAL_SCORE <>", value, "tmRealScore");
            return (Criteria) this;
        }

        public Criteria andTmRealScoreGreaterThan(Integer value) {
            addCriterion("TM_REAL_SCORE >", value, "tmRealScore");
            return (Criteria) this;
        }

        public Criteria andTmRealScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("TM_REAL_SCORE >=", value, "tmRealScore");
            return (Criteria) this;
        }

        public Criteria andTmRealScoreLessThan(Integer value) {
            addCriterion("TM_REAL_SCORE <", value, "tmRealScore");
            return (Criteria) this;
        }

        public Criteria andTmRealScoreLessThanOrEqualTo(Integer value) {
            addCriterion("TM_REAL_SCORE <=", value, "tmRealScore");
            return (Criteria) this;
        }

        public Criteria andTmRealScoreIn(List<Integer> values) {
            addCriterion("TM_REAL_SCORE in", values, "tmRealScore");
            return (Criteria) this;
        }

        public Criteria andTmRealScoreNotIn(List<Integer> values) {
            addCriterion("TM_REAL_SCORE not in", values, "tmRealScore");
            return (Criteria) this;
        }

        public Criteria andTmRealScoreBetween(Integer value1, Integer value2) {
            addCriterion("TM_REAL_SCORE between", value1, value2, "tmRealScore");
            return (Criteria) this;
        }

        public Criteria andTmRealScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("TM_REAL_SCORE not between", value1, value2, "tmRealScore");
            return (Criteria) this;
        }

        public Criteria andTmRegtimeIsNull() {
            addCriterion("TM_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andTmRegtimeIsNotNull() {
            addCriterion("TM_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTmRegtimeEqualTo(Date value) {
            addCriterion("TM_REGTIME =", value, "tmRegtime");
            return (Criteria) this;
        }

        public Criteria andTmRegtimeNotEqualTo(Date value) {
            addCriterion("TM_REGTIME <>", value, "tmRegtime");
            return (Criteria) this;
        }

        public Criteria andTmRegtimeGreaterThan(Date value) {
            addCriterion("TM_REGTIME >", value, "tmRegtime");
            return (Criteria) this;
        }

        public Criteria andTmRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TM_REGTIME >=", value, "tmRegtime");
            return (Criteria) this;
        }

        public Criteria andTmRegtimeLessThan(Date value) {
            addCriterion("TM_REGTIME <", value, "tmRegtime");
            return (Criteria) this;
        }

        public Criteria andTmRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("TM_REGTIME <=", value, "tmRegtime");
            return (Criteria) this;
        }

        public Criteria andTmRegtimeIn(List<Date> values) {
            addCriterion("TM_REGTIME in", values, "tmRegtime");
            return (Criteria) this;
        }

        public Criteria andTmRegtimeNotIn(List<Date> values) {
            addCriterion("TM_REGTIME not in", values, "tmRegtime");
            return (Criteria) this;
        }

        public Criteria andTmRegtimeBetween(Date value1, Date value2) {
            addCriterion("TM_REGTIME between", value1, value2, "tmRegtime");
            return (Criteria) this;
        }

        public Criteria andTmRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("TM_REGTIME not between", value1, value2, "tmRegtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_team_member
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
     * This class corresponds to the database table tp_team_member
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