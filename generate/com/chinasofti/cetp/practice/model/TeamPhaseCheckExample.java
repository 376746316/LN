package com.chinasofti.cetp.practice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeamPhaseCheckExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_team_phase_check
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_team_phase_check
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_team_phase_check
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_phase_check
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public TeamPhaseCheckExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_phase_check
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_phase_check
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_phase_check
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_phase_check
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_phase_check
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_phase_check
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_phase_check
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
     * This method corresponds to the database table tp_team_phase_check
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
     * This method corresponds to the database table tp_team_phase_check
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_team_phase_check
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
     * This class corresponds to the database table tp_team_phase_check
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

        public Criteria andTpcTeamIdIsNull() {
            addCriterion("TPC_TEAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andTpcTeamIdIsNotNull() {
            addCriterion("TPC_TEAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTpcTeamIdEqualTo(Integer value) {
            addCriterion("TPC_TEAM_ID =", value, "tpcTeamId");
            return (Criteria) this;
        }

        public Criteria andTpcTeamIdNotEqualTo(Integer value) {
            addCriterion("TPC_TEAM_ID <>", value, "tpcTeamId");
            return (Criteria) this;
        }

        public Criteria andTpcTeamIdGreaterThan(Integer value) {
            addCriterion("TPC_TEAM_ID >", value, "tpcTeamId");
            return (Criteria) this;
        }

        public Criteria andTpcTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPC_TEAM_ID >=", value, "tpcTeamId");
            return (Criteria) this;
        }

        public Criteria andTpcTeamIdLessThan(Integer value) {
            addCriterion("TPC_TEAM_ID <", value, "tpcTeamId");
            return (Criteria) this;
        }

        public Criteria andTpcTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPC_TEAM_ID <=", value, "tpcTeamId");
            return (Criteria) this;
        }

        public Criteria andTpcTeamIdIn(List<Integer> values) {
            addCriterion("TPC_TEAM_ID in", values, "tpcTeamId");
            return (Criteria) this;
        }

        public Criteria andTpcTeamIdNotIn(List<Integer> values) {
            addCriterion("TPC_TEAM_ID not in", values, "tpcTeamId");
            return (Criteria) this;
        }

        public Criteria andTpcTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("TPC_TEAM_ID between", value1, value2, "tpcTeamId");
            return (Criteria) this;
        }

        public Criteria andTpcTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPC_TEAM_ID not between", value1, value2, "tpcTeamId");
            return (Criteria) this;
        }

        public Criteria andTpcTaskIdIsNull() {
            addCriterion("TPC_TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTpcTaskIdIsNotNull() {
            addCriterion("TPC_TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTpcTaskIdEqualTo(Integer value) {
            addCriterion("TPC_TASK_ID =", value, "tpcTaskId");
            return (Criteria) this;
        }

        public Criteria andTpcTaskIdNotEqualTo(Integer value) {
            addCriterion("TPC_TASK_ID <>", value, "tpcTaskId");
            return (Criteria) this;
        }

        public Criteria andTpcTaskIdGreaterThan(Integer value) {
            addCriterion("TPC_TASK_ID >", value, "tpcTaskId");
            return (Criteria) this;
        }

        public Criteria andTpcTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPC_TASK_ID >=", value, "tpcTaskId");
            return (Criteria) this;
        }

        public Criteria andTpcTaskIdLessThan(Integer value) {
            addCriterion("TPC_TASK_ID <", value, "tpcTaskId");
            return (Criteria) this;
        }

        public Criteria andTpcTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPC_TASK_ID <=", value, "tpcTaskId");
            return (Criteria) this;
        }

        public Criteria andTpcTaskIdIn(List<Integer> values) {
            addCriterion("TPC_TASK_ID in", values, "tpcTaskId");
            return (Criteria) this;
        }

        public Criteria andTpcTaskIdNotIn(List<Integer> values) {
            addCriterion("TPC_TASK_ID not in", values, "tpcTaskId");
            return (Criteria) this;
        }

        public Criteria andTpcTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("TPC_TASK_ID between", value1, value2, "tpcTaskId");
            return (Criteria) this;
        }

        public Criteria andTpcTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPC_TASK_ID not between", value1, value2, "tpcTaskId");
            return (Criteria) this;
        }

        public Criteria andTpcScoreIsNull() {
            addCriterion("TPC_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andTpcScoreIsNotNull() {
            addCriterion("TPC_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andTpcScoreEqualTo(Integer value) {
            addCriterion("TPC_SCORE =", value, "tpcScore");
            return (Criteria) this;
        }

        public Criteria andTpcScoreNotEqualTo(Integer value) {
            addCriterion("TPC_SCORE <>", value, "tpcScore");
            return (Criteria) this;
        }

        public Criteria andTpcScoreGreaterThan(Integer value) {
            addCriterion("TPC_SCORE >", value, "tpcScore");
            return (Criteria) this;
        }

        public Criteria andTpcScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPC_SCORE >=", value, "tpcScore");
            return (Criteria) this;
        }

        public Criteria andTpcScoreLessThan(Integer value) {
            addCriterion("TPC_SCORE <", value, "tpcScore");
            return (Criteria) this;
        }

        public Criteria andTpcScoreLessThanOrEqualTo(Integer value) {
            addCriterion("TPC_SCORE <=", value, "tpcScore");
            return (Criteria) this;
        }

        public Criteria andTpcScoreIn(List<Integer> values) {
            addCriterion("TPC_SCORE in", values, "tpcScore");
            return (Criteria) this;
        }

        public Criteria andTpcScoreNotIn(List<Integer> values) {
            addCriterion("TPC_SCORE not in", values, "tpcScore");
            return (Criteria) this;
        }

        public Criteria andTpcScoreBetween(Integer value1, Integer value2) {
            addCriterion("TPC_SCORE between", value1, value2, "tpcScore");
            return (Criteria) this;
        }

        public Criteria andTpcScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("TPC_SCORE not between", value1, value2, "tpcScore");
            return (Criteria) this;
        }

        public Criteria andTpcAddScoreIsNull() {
            addCriterion("TPC_ADD_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andTpcAddScoreIsNotNull() {
            addCriterion("TPC_ADD_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andTpcAddScoreEqualTo(Integer value) {
            addCriterion("TPC_ADD_SCORE =", value, "tpcAddScore");
            return (Criteria) this;
        }

        public Criteria andTpcAddScoreNotEqualTo(Integer value) {
            addCriterion("TPC_ADD_SCORE <>", value, "tpcAddScore");
            return (Criteria) this;
        }

        public Criteria andTpcAddScoreGreaterThan(Integer value) {
            addCriterion("TPC_ADD_SCORE >", value, "tpcAddScore");
            return (Criteria) this;
        }

        public Criteria andTpcAddScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPC_ADD_SCORE >=", value, "tpcAddScore");
            return (Criteria) this;
        }

        public Criteria andTpcAddScoreLessThan(Integer value) {
            addCriterion("TPC_ADD_SCORE <", value, "tpcAddScore");
            return (Criteria) this;
        }

        public Criteria andTpcAddScoreLessThanOrEqualTo(Integer value) {
            addCriterion("TPC_ADD_SCORE <=", value, "tpcAddScore");
            return (Criteria) this;
        }

        public Criteria andTpcAddScoreIn(List<Integer> values) {
            addCriterion("TPC_ADD_SCORE in", values, "tpcAddScore");
            return (Criteria) this;
        }

        public Criteria andTpcAddScoreNotIn(List<Integer> values) {
            addCriterion("TPC_ADD_SCORE not in", values, "tpcAddScore");
            return (Criteria) this;
        }

        public Criteria andTpcAddScoreBetween(Integer value1, Integer value2) {
            addCriterion("TPC_ADD_SCORE between", value1, value2, "tpcAddScore");
            return (Criteria) this;
        }

        public Criteria andTpcAddScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("TPC_ADD_SCORE not between", value1, value2, "tpcAddScore");
            return (Criteria) this;
        }

        public Criteria andTpcAddReasonIsNull() {
            addCriterion("TPC_ADD_REASON is null");
            return (Criteria) this;
        }

        public Criteria andTpcAddReasonIsNotNull() {
            addCriterion("TPC_ADD_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andTpcAddReasonEqualTo(String value) {
            addCriterion("TPC_ADD_REASON =", value, "tpcAddReason");
            return (Criteria) this;
        }

        public Criteria andTpcAddReasonNotEqualTo(String value) {
            addCriterion("TPC_ADD_REASON <>", value, "tpcAddReason");
            return (Criteria) this;
        }

        public Criteria andTpcAddReasonGreaterThan(String value) {
            addCriterion("TPC_ADD_REASON >", value, "tpcAddReason");
            return (Criteria) this;
        }

        public Criteria andTpcAddReasonGreaterThanOrEqualTo(String value) {
            addCriterion("TPC_ADD_REASON >=", value, "tpcAddReason");
            return (Criteria) this;
        }

        public Criteria andTpcAddReasonLessThan(String value) {
            addCriterion("TPC_ADD_REASON <", value, "tpcAddReason");
            return (Criteria) this;
        }

        public Criteria andTpcAddReasonLessThanOrEqualTo(String value) {
            addCriterion("TPC_ADD_REASON <=", value, "tpcAddReason");
            return (Criteria) this;
        }

        public Criteria andTpcAddReasonLike(String value) {
            addCriterion("TPC_ADD_REASON like", value, "tpcAddReason");
            return (Criteria) this;
        }

        public Criteria andTpcAddReasonNotLike(String value) {
            addCriterion("TPC_ADD_REASON not like", value, "tpcAddReason");
            return (Criteria) this;
        }

        public Criteria andTpcAddReasonIn(List<String> values) {
            addCriterion("TPC_ADD_REASON in", values, "tpcAddReason");
            return (Criteria) this;
        }

        public Criteria andTpcAddReasonNotIn(List<String> values) {
            addCriterion("TPC_ADD_REASON not in", values, "tpcAddReason");
            return (Criteria) this;
        }

        public Criteria andTpcAddReasonBetween(String value1, String value2) {
            addCriterion("TPC_ADD_REASON between", value1, value2, "tpcAddReason");
            return (Criteria) this;
        }

        public Criteria andTpcAddReasonNotBetween(String value1, String value2) {
            addCriterion("TPC_ADD_REASON not between", value1, value2, "tpcAddReason");
            return (Criteria) this;
        }

        public Criteria andTpcUserNoIsNull() {
            addCriterion("TPC_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andTpcUserNoIsNotNull() {
            addCriterion("TPC_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTpcUserNoEqualTo(Integer value) {
            addCriterion("TPC_USER_NO =", value, "tpcUserNo");
            return (Criteria) this;
        }

        public Criteria andTpcUserNoNotEqualTo(Integer value) {
            addCriterion("TPC_USER_NO <>", value, "tpcUserNo");
            return (Criteria) this;
        }

        public Criteria andTpcUserNoGreaterThan(Integer value) {
            addCriterion("TPC_USER_NO >", value, "tpcUserNo");
            return (Criteria) this;
        }

        public Criteria andTpcUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPC_USER_NO >=", value, "tpcUserNo");
            return (Criteria) this;
        }

        public Criteria andTpcUserNoLessThan(Integer value) {
            addCriterion("TPC_USER_NO <", value, "tpcUserNo");
            return (Criteria) this;
        }

        public Criteria andTpcUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("TPC_USER_NO <=", value, "tpcUserNo");
            return (Criteria) this;
        }

        public Criteria andTpcUserNoIn(List<Integer> values) {
            addCriterion("TPC_USER_NO in", values, "tpcUserNo");
            return (Criteria) this;
        }

        public Criteria andTpcUserNoNotIn(List<Integer> values) {
            addCriterion("TPC_USER_NO not in", values, "tpcUserNo");
            return (Criteria) this;
        }

        public Criteria andTpcUserNoBetween(Integer value1, Integer value2) {
            addCriterion("TPC_USER_NO between", value1, value2, "tpcUserNo");
            return (Criteria) this;
        }

        public Criteria andTpcUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("TPC_USER_NO not between", value1, value2, "tpcUserNo");
            return (Criteria) this;
        }

        public Criteria andTpcRegtimeIsNull() {
            addCriterion("TPC_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andTpcRegtimeIsNotNull() {
            addCriterion("TPC_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTpcRegtimeEqualTo(Date value) {
            addCriterion("TPC_REGTIME =", value, "tpcRegtime");
            return (Criteria) this;
        }

        public Criteria andTpcRegtimeNotEqualTo(Date value) {
            addCriterion("TPC_REGTIME <>", value, "tpcRegtime");
            return (Criteria) this;
        }

        public Criteria andTpcRegtimeGreaterThan(Date value) {
            addCriterion("TPC_REGTIME >", value, "tpcRegtime");
            return (Criteria) this;
        }

        public Criteria andTpcRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TPC_REGTIME >=", value, "tpcRegtime");
            return (Criteria) this;
        }

        public Criteria andTpcRegtimeLessThan(Date value) {
            addCriterion("TPC_REGTIME <", value, "tpcRegtime");
            return (Criteria) this;
        }

        public Criteria andTpcRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("TPC_REGTIME <=", value, "tpcRegtime");
            return (Criteria) this;
        }

        public Criteria andTpcRegtimeIn(List<Date> values) {
            addCriterion("TPC_REGTIME in", values, "tpcRegtime");
            return (Criteria) this;
        }

        public Criteria andTpcRegtimeNotIn(List<Date> values) {
            addCriterion("TPC_REGTIME not in", values, "tpcRegtime");
            return (Criteria) this;
        }

        public Criteria andTpcRegtimeBetween(Date value1, Date value2) {
            addCriterion("TPC_REGTIME between", value1, value2, "tpcRegtime");
            return (Criteria) this;
        }

        public Criteria andTpcRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("TPC_REGTIME not between", value1, value2, "tpcRegtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_team_phase_check
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
     * This class corresponds to the database table tp_team_phase_check
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