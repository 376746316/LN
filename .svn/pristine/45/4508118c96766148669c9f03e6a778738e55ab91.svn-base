package com.chinasofti.cetp.practice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProTaskExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskProIdIsNull() {
            addCriterion("TASK_PRO_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskProIdIsNotNull() {
            addCriterion("TASK_PRO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskProIdEqualTo(Integer value) {
            addCriterion("TASK_PRO_ID =", value, "taskProId");
            return (Criteria) this;
        }

        public Criteria andTaskProIdNotEqualTo(Integer value) {
            addCriterion("TASK_PRO_ID <>", value, "taskProId");
            return (Criteria) this;
        }

        public Criteria andTaskProIdGreaterThan(Integer value) {
            addCriterion("TASK_PRO_ID >", value, "taskProId");
            return (Criteria) this;
        }

        public Criteria andTaskProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_PRO_ID >=", value, "taskProId");
            return (Criteria) this;
        }

        public Criteria andTaskProIdLessThan(Integer value) {
            addCriterion("TASK_PRO_ID <", value, "taskProId");
            return (Criteria) this;
        }

        public Criteria andTaskProIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_PRO_ID <=", value, "taskProId");
            return (Criteria) this;
        }

        public Criteria andTaskProIdIn(List<Integer> values) {
            addCriterion("TASK_PRO_ID in", values, "taskProId");
            return (Criteria) this;
        }

        public Criteria andTaskProIdNotIn(List<Integer> values) {
            addCriterion("TASK_PRO_ID not in", values, "taskProId");
            return (Criteria) this;
        }

        public Criteria andTaskProIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_PRO_ID between", value1, value2, "taskProId");
            return (Criteria) this;
        }

        public Criteria andTaskProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_PRO_ID not between", value1, value2, "taskProId");
            return (Criteria) this;
        }

        public Criteria andTaskParentIsNull() {
            addCriterion("TASK_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andTaskParentIsNotNull() {
            addCriterion("TASK_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andTaskParentEqualTo(Integer value) {
            addCriterion("TASK_PARENT =", value, "taskParent");
            return (Criteria) this;
        }

        public Criteria andTaskParentNotEqualTo(Integer value) {
            addCriterion("TASK_PARENT <>", value, "taskParent");
            return (Criteria) this;
        }

        public Criteria andTaskParentGreaterThan(Integer value) {
            addCriterion("TASK_PARENT >", value, "taskParent");
            return (Criteria) this;
        }

        public Criteria andTaskParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_PARENT >=", value, "taskParent");
            return (Criteria) this;
        }

        public Criteria andTaskParentLessThan(Integer value) {
            addCriterion("TASK_PARENT <", value, "taskParent");
            return (Criteria) this;
        }

        public Criteria andTaskParentLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_PARENT <=", value, "taskParent");
            return (Criteria) this;
        }

        public Criteria andTaskParentIn(List<Integer> values) {
            addCriterion("TASK_PARENT in", values, "taskParent");
            return (Criteria) this;
        }

        public Criteria andTaskParentNotIn(List<Integer> values) {
            addCriterion("TASK_PARENT not in", values, "taskParent");
            return (Criteria) this;
        }

        public Criteria andTaskParentBetween(Integer value1, Integer value2) {
            addCriterion("TASK_PARENT between", value1, value2, "taskParent");
            return (Criteria) this;
        }

        public Criteria andTaskParentNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_PARENT not between", value1, value2, "taskParent");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("TASK_NAME =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("TASK_NAME <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("TASK_NAME >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NAME >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("TASK_NAME <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_NAME <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("TASK_NAME like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("TASK_NAME not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("TASK_NAME in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("TASK_NAME not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("TASK_NAME between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("TASK_NAME not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskTimeIsNull() {
            addCriterion("TASK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeIsNotNull() {
            addCriterion("TASK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEqualTo(Integer value) {
            addCriterion("TASK_TIME =", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeNotEqualTo(Integer value) {
            addCriterion("TASK_TIME <>", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeGreaterThan(Integer value) {
            addCriterion("TASK_TIME >", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_TIME >=", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeLessThan(Integer value) {
            addCriterion("TASK_TIME <", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_TIME <=", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeIn(List<Integer> values) {
            addCriterion("TASK_TIME in", values, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeNotIn(List<Integer> values) {
            addCriterion("TASK_TIME not in", values, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeBetween(Integer value1, Integer value2) {
            addCriterion("TASK_TIME between", value1, value2, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_TIME not between", value1, value2, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeSuffixIsNull() {
            addCriterion("TASK_TIME_SUFFIX is null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeSuffixIsNotNull() {
            addCriterion("TASK_TIME_SUFFIX is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeSuffixEqualTo(String value) {
            addCriterion("TASK_TIME_SUFFIX =", value, "taskTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andTaskTimeSuffixNotEqualTo(String value) {
            addCriterion("TASK_TIME_SUFFIX <>", value, "taskTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andTaskTimeSuffixGreaterThan(String value) {
            addCriterion("TASK_TIME_SUFFIX >", value, "taskTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andTaskTimeSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TIME_SUFFIX >=", value, "taskTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andTaskTimeSuffixLessThan(String value) {
            addCriterion("TASK_TIME_SUFFIX <", value, "taskTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andTaskTimeSuffixLessThanOrEqualTo(String value) {
            addCriterion("TASK_TIME_SUFFIX <=", value, "taskTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andTaskTimeSuffixLike(String value) {
            addCriterion("TASK_TIME_SUFFIX like", value, "taskTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andTaskTimeSuffixNotLike(String value) {
            addCriterion("TASK_TIME_SUFFIX not like", value, "taskTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andTaskTimeSuffixIn(List<String> values) {
            addCriterion("TASK_TIME_SUFFIX in", values, "taskTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andTaskTimeSuffixNotIn(List<String> values) {
            addCriterion("TASK_TIME_SUFFIX not in", values, "taskTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andTaskTimeSuffixBetween(String value1, String value2) {
            addCriterion("TASK_TIME_SUFFIX between", value1, value2, "taskTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andTaskTimeSuffixNotBetween(String value1, String value2) {
            addCriterion("TASK_TIME_SUFFIX not between", value1, value2, "taskTimeSuffix");
            return (Criteria) this;
        }

        public Criteria andTaskDiffcultIsNull() {
            addCriterion("TASK_DIFFCULT is null");
            return (Criteria) this;
        }

        public Criteria andTaskDiffcultIsNotNull() {
            addCriterion("TASK_DIFFCULT is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDiffcultEqualTo(String value) {
            addCriterion("TASK_DIFFCULT =", value, "taskDiffcult");
            return (Criteria) this;
        }

        public Criteria andTaskDiffcultNotEqualTo(String value) {
            addCriterion("TASK_DIFFCULT <>", value, "taskDiffcult");
            return (Criteria) this;
        }

        public Criteria andTaskDiffcultGreaterThan(String value) {
            addCriterion("TASK_DIFFCULT >", value, "taskDiffcult");
            return (Criteria) this;
        }

        public Criteria andTaskDiffcultGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_DIFFCULT >=", value, "taskDiffcult");
            return (Criteria) this;
        }

        public Criteria andTaskDiffcultLessThan(String value) {
            addCriterion("TASK_DIFFCULT <", value, "taskDiffcult");
            return (Criteria) this;
        }

        public Criteria andTaskDiffcultLessThanOrEqualTo(String value) {
            addCriterion("TASK_DIFFCULT <=", value, "taskDiffcult");
            return (Criteria) this;
        }

        public Criteria andTaskDiffcultLike(String value) {
            addCriterion("TASK_DIFFCULT like", value, "taskDiffcult");
            return (Criteria) this;
        }

        public Criteria andTaskDiffcultNotLike(String value) {
            addCriterion("TASK_DIFFCULT not like", value, "taskDiffcult");
            return (Criteria) this;
        }

        public Criteria andTaskDiffcultIn(List<String> values) {
            addCriterion("TASK_DIFFCULT in", values, "taskDiffcult");
            return (Criteria) this;
        }

        public Criteria andTaskDiffcultNotIn(List<String> values) {
            addCriterion("TASK_DIFFCULT not in", values, "taskDiffcult");
            return (Criteria) this;
        }

        public Criteria andTaskDiffcultBetween(String value1, String value2) {
            addCriterion("TASK_DIFFCULT between", value1, value2, "taskDiffcult");
            return (Criteria) this;
        }

        public Criteria andTaskDiffcultNotBetween(String value1, String value2) {
            addCriterion("TASK_DIFFCULT not between", value1, value2, "taskDiffcult");
            return (Criteria) this;
        }

        public Criteria andTaskScoreIsNull() {
            addCriterion("TASK_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andTaskScoreIsNotNull() {
            addCriterion("TASK_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskScoreEqualTo(Integer value) {
            addCriterion("TASK_SCORE =", value, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreNotEqualTo(Integer value) {
            addCriterion("TASK_SCORE <>", value, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreGreaterThan(Integer value) {
            addCriterion("TASK_SCORE >", value, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_SCORE >=", value, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreLessThan(Integer value) {
            addCriterion("TASK_SCORE <", value, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_SCORE <=", value, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreIn(List<Integer> values) {
            addCriterion("TASK_SCORE in", values, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreNotIn(List<Integer> values) {
            addCriterion("TASK_SCORE not in", values, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreBetween(Integer value1, Integer value2) {
            addCriterion("TASK_SCORE between", value1, value2, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_SCORE not between", value1, value2, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskIsMilestoneIsNull() {
            addCriterion("TASK_IS_MILESTONE is null");
            return (Criteria) this;
        }

        public Criteria andTaskIsMilestoneIsNotNull() {
            addCriterion("TASK_IS_MILESTONE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIsMilestoneEqualTo(String value) {
            addCriterion("TASK_IS_MILESTONE =", value, "taskIsMilestone");
            return (Criteria) this;
        }

        public Criteria andTaskIsMilestoneNotEqualTo(String value) {
            addCriterion("TASK_IS_MILESTONE <>", value, "taskIsMilestone");
            return (Criteria) this;
        }

        public Criteria andTaskIsMilestoneGreaterThan(String value) {
            addCriterion("TASK_IS_MILESTONE >", value, "taskIsMilestone");
            return (Criteria) this;
        }

        public Criteria andTaskIsMilestoneGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_IS_MILESTONE >=", value, "taskIsMilestone");
            return (Criteria) this;
        }

        public Criteria andTaskIsMilestoneLessThan(String value) {
            addCriterion("TASK_IS_MILESTONE <", value, "taskIsMilestone");
            return (Criteria) this;
        }

        public Criteria andTaskIsMilestoneLessThanOrEqualTo(String value) {
            addCriterion("TASK_IS_MILESTONE <=", value, "taskIsMilestone");
            return (Criteria) this;
        }

        public Criteria andTaskIsMilestoneLike(String value) {
            addCriterion("TASK_IS_MILESTONE like", value, "taskIsMilestone");
            return (Criteria) this;
        }

        public Criteria andTaskIsMilestoneNotLike(String value) {
            addCriterion("TASK_IS_MILESTONE not like", value, "taskIsMilestone");
            return (Criteria) this;
        }

        public Criteria andTaskIsMilestoneIn(List<String> values) {
            addCriterion("TASK_IS_MILESTONE in", values, "taskIsMilestone");
            return (Criteria) this;
        }

        public Criteria andTaskIsMilestoneNotIn(List<String> values) {
            addCriterion("TASK_IS_MILESTONE not in", values, "taskIsMilestone");
            return (Criteria) this;
        }

        public Criteria andTaskIsMilestoneBetween(String value1, String value2) {
            addCriterion("TASK_IS_MILESTONE between", value1, value2, "taskIsMilestone");
            return (Criteria) this;
        }

        public Criteria andTaskIsMilestoneNotBetween(String value1, String value2) {
            addCriterion("TASK_IS_MILESTONE not between", value1, value2, "taskIsMilestone");
            return (Criteria) this;
        }

        public Criteria andTaskPreIdIsNull() {
            addCriterion("TASK_PRE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskPreIdIsNotNull() {
            addCriterion("TASK_PRE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPreIdEqualTo(String value) {
            addCriterion("TASK_PRE_ID =", value, "taskPreId");
            return (Criteria) this;
        }

        public Criteria andTaskPreIdNotEqualTo(String value) {
            addCriterion("TASK_PRE_ID <>", value, "taskPreId");
            return (Criteria) this;
        }

        public Criteria andTaskPreIdGreaterThan(String value) {
            addCriterion("TASK_PRE_ID >", value, "taskPreId");
            return (Criteria) this;
        }

        public Criteria andTaskPreIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_PRE_ID >=", value, "taskPreId");
            return (Criteria) this;
        }

        public Criteria andTaskPreIdLessThan(String value) {
            addCriterion("TASK_PRE_ID <", value, "taskPreId");
            return (Criteria) this;
        }

        public Criteria andTaskPreIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_PRE_ID <=", value, "taskPreId");
            return (Criteria) this;
        }

        public Criteria andTaskPreIdLike(String value) {
            addCriterion("TASK_PRE_ID like", value, "taskPreId");
            return (Criteria) this;
        }

        public Criteria andTaskPreIdNotLike(String value) {
            addCriterion("TASK_PRE_ID not like", value, "taskPreId");
            return (Criteria) this;
        }

        public Criteria andTaskPreIdIn(List<String> values) {
            addCriterion("TASK_PRE_ID in", values, "taskPreId");
            return (Criteria) this;
        }

        public Criteria andTaskPreIdNotIn(List<String> values) {
            addCriterion("TASK_PRE_ID not in", values, "taskPreId");
            return (Criteria) this;
        }

        public Criteria andTaskPreIdBetween(String value1, String value2) {
            addCriterion("TASK_PRE_ID between", value1, value2, "taskPreId");
            return (Criteria) this;
        }

        public Criteria andTaskPreIdNotBetween(String value1, String value2) {
            addCriterion("TASK_PRE_ID not between", value1, value2, "taskPreId");
            return (Criteria) this;
        }

        public Criteria andTaskPriorIsNull() {
            addCriterion("TASK_PRIOR is null");
            return (Criteria) this;
        }

        public Criteria andTaskPriorIsNotNull() {
            addCriterion("TASK_PRIOR is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPriorEqualTo(String value) {
            addCriterion("TASK_PRIOR =", value, "taskPrior");
            return (Criteria) this;
        }

        public Criteria andTaskPriorNotEqualTo(String value) {
            addCriterion("TASK_PRIOR <>", value, "taskPrior");
            return (Criteria) this;
        }

        public Criteria andTaskPriorGreaterThan(String value) {
            addCriterion("TASK_PRIOR >", value, "taskPrior");
            return (Criteria) this;
        }

        public Criteria andTaskPriorGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_PRIOR >=", value, "taskPrior");
            return (Criteria) this;
        }

        public Criteria andTaskPriorLessThan(String value) {
            addCriterion("TASK_PRIOR <", value, "taskPrior");
            return (Criteria) this;
        }

        public Criteria andTaskPriorLessThanOrEqualTo(String value) {
            addCriterion("TASK_PRIOR <=", value, "taskPrior");
            return (Criteria) this;
        }

        public Criteria andTaskPriorLike(String value) {
            addCriterion("TASK_PRIOR like", value, "taskPrior");
            return (Criteria) this;
        }

        public Criteria andTaskPriorNotLike(String value) {
            addCriterion("TASK_PRIOR not like", value, "taskPrior");
            return (Criteria) this;
        }

        public Criteria andTaskPriorIn(List<String> values) {
            addCriterion("TASK_PRIOR in", values, "taskPrior");
            return (Criteria) this;
        }

        public Criteria andTaskPriorNotIn(List<String> values) {
            addCriterion("TASK_PRIOR not in", values, "taskPrior");
            return (Criteria) this;
        }

        public Criteria andTaskPriorBetween(String value1, String value2) {
            addCriterion("TASK_PRIOR between", value1, value2, "taskPrior");
            return (Criteria) this;
        }

        public Criteria andTaskPriorNotBetween(String value1, String value2) {
            addCriterion("TASK_PRIOR not between", value1, value2, "taskPrior");
            return (Criteria) this;
        }

        public Criteria andTaskTargetIsNull() {
            addCriterion("TASK_TARGET is null");
            return (Criteria) this;
        }

        public Criteria andTaskTargetIsNotNull() {
            addCriterion("TASK_TARGET is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTargetEqualTo(String value) {
            addCriterion("TASK_TARGET =", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetNotEqualTo(String value) {
            addCriterion("TASK_TARGET <>", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetGreaterThan(String value) {
            addCriterion("TASK_TARGET >", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TARGET >=", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetLessThan(String value) {
            addCriterion("TASK_TARGET <", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetLessThanOrEqualTo(String value) {
            addCriterion("TASK_TARGET <=", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetLike(String value) {
            addCriterion("TASK_TARGET like", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetNotLike(String value) {
            addCriterion("TASK_TARGET not like", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetIn(List<String> values) {
            addCriterion("TASK_TARGET in", values, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetNotIn(List<String> values) {
            addCriterion("TASK_TARGET not in", values, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetBetween(String value1, String value2) {
            addCriterion("TASK_TARGET between", value1, value2, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetNotBetween(String value1, String value2) {
            addCriterion("TASK_TARGET not between", value1, value2, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskContentIsNull() {
            addCriterion("TASK_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andTaskContentIsNotNull() {
            addCriterion("TASK_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andTaskContentEqualTo(String value) {
            addCriterion("TASK_CONTENT =", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotEqualTo(String value) {
            addCriterion("TASK_CONTENT <>", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentGreaterThan(String value) {
            addCriterion("TASK_CONTENT >", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_CONTENT >=", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentLessThan(String value) {
            addCriterion("TASK_CONTENT <", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentLessThanOrEqualTo(String value) {
            addCriterion("TASK_CONTENT <=", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentLike(String value) {
            addCriterion("TASK_CONTENT like", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotLike(String value) {
            addCriterion("TASK_CONTENT not like", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentIn(List<String> values) {
            addCriterion("TASK_CONTENT in", values, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotIn(List<String> values) {
            addCriterion("TASK_CONTENT not in", values, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentBetween(String value1, String value2) {
            addCriterion("TASK_CONTENT between", value1, value2, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotBetween(String value1, String value2) {
            addCriterion("TASK_CONTENT not between", value1, value2, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskPonitIsNull() {
            addCriterion("TASK_PONIT is null");
            return (Criteria) this;
        }

        public Criteria andTaskPonitIsNotNull() {
            addCriterion("TASK_PONIT is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPonitEqualTo(String value) {
            addCriterion("TASK_PONIT =", value, "taskPonit");
            return (Criteria) this;
        }

        public Criteria andTaskPonitNotEqualTo(String value) {
            addCriterion("TASK_PONIT <>", value, "taskPonit");
            return (Criteria) this;
        }

        public Criteria andTaskPonitGreaterThan(String value) {
            addCriterion("TASK_PONIT >", value, "taskPonit");
            return (Criteria) this;
        }

        public Criteria andTaskPonitGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_PONIT >=", value, "taskPonit");
            return (Criteria) this;
        }

        public Criteria andTaskPonitLessThan(String value) {
            addCriterion("TASK_PONIT <", value, "taskPonit");
            return (Criteria) this;
        }

        public Criteria andTaskPonitLessThanOrEqualTo(String value) {
            addCriterion("TASK_PONIT <=", value, "taskPonit");
            return (Criteria) this;
        }

        public Criteria andTaskPonitLike(String value) {
            addCriterion("TASK_PONIT like", value, "taskPonit");
            return (Criteria) this;
        }

        public Criteria andTaskPonitNotLike(String value) {
            addCriterion("TASK_PONIT not like", value, "taskPonit");
            return (Criteria) this;
        }

        public Criteria andTaskPonitIn(List<String> values) {
            addCriterion("TASK_PONIT in", values, "taskPonit");
            return (Criteria) this;
        }

        public Criteria andTaskPonitNotIn(List<String> values) {
            addCriterion("TASK_PONIT not in", values, "taskPonit");
            return (Criteria) this;
        }

        public Criteria andTaskPonitBetween(String value1, String value2) {
            addCriterion("TASK_PONIT between", value1, value2, "taskPonit");
            return (Criteria) this;
        }

        public Criteria andTaskPonitNotBetween(String value1, String value2) {
            addCriterion("TASK_PONIT not between", value1, value2, "taskPonit");
            return (Criteria) this;
        }

        public Criteria andTaskLevelIsNull() {
            addCriterion("TASK_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andTaskLevelIsNotNull() {
            addCriterion("TASK_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andTaskLevelEqualTo(Integer value) {
            addCriterion("TASK_LEVEL =", value, "taskLevel");
            return (Criteria) this;
        }

        public Criteria andTaskLevelNotEqualTo(Integer value) {
            addCriterion("TASK_LEVEL <>", value, "taskLevel");
            return (Criteria) this;
        }

        public Criteria andTaskLevelGreaterThan(Integer value) {
            addCriterion("TASK_LEVEL >", value, "taskLevel");
            return (Criteria) this;
        }

        public Criteria andTaskLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_LEVEL >=", value, "taskLevel");
            return (Criteria) this;
        }

        public Criteria andTaskLevelLessThan(Integer value) {
            addCriterion("TASK_LEVEL <", value, "taskLevel");
            return (Criteria) this;
        }

        public Criteria andTaskLevelLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_LEVEL <=", value, "taskLevel");
            return (Criteria) this;
        }

        public Criteria andTaskLevelIn(List<Integer> values) {
            addCriterion("TASK_LEVEL in", values, "taskLevel");
            return (Criteria) this;
        }

        public Criteria andTaskLevelNotIn(List<Integer> values) {
            addCriterion("TASK_LEVEL not in", values, "taskLevel");
            return (Criteria) this;
        }

        public Criteria andTaskLevelBetween(Integer value1, Integer value2) {
            addCriterion("TASK_LEVEL between", value1, value2, "taskLevel");
            return (Criteria) this;
        }

        public Criteria andTaskLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_LEVEL not between", value1, value2, "taskLevel");
            return (Criteria) this;
        }

        public Criteria andTaskSeqIsNull() {
            addCriterion("TASK_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andTaskSeqIsNotNull() {
            addCriterion("TASK_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andTaskSeqEqualTo(Integer value) {
            addCriterion("TASK_SEQ =", value, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNotEqualTo(Integer value) {
            addCriterion("TASK_SEQ <>", value, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqGreaterThan(Integer value) {
            addCriterion("TASK_SEQ >", value, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_SEQ >=", value, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqLessThan(Integer value) {
            addCriterion("TASK_SEQ <", value, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_SEQ <=", value, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqIn(List<Integer> values) {
            addCriterion("TASK_SEQ in", values, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNotIn(List<Integer> values) {
            addCriterion("TASK_SEQ not in", values, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqBetween(Integer value1, Integer value2) {
            addCriterion("TASK_SEQ between", value1, value2, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_SEQ not between", value1, value2, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskIsCommitIsNull() {
            addCriterion("TASK_IS_COMMIT is null");
            return (Criteria) this;
        }

        public Criteria andTaskIsCommitIsNotNull() {
            addCriterion("TASK_IS_COMMIT is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIsCommitEqualTo(String value) {
            addCriterion("TASK_IS_COMMIT =", value, "taskIsCommit");
            return (Criteria) this;
        }

        public Criteria andTaskIsCommitNotEqualTo(String value) {
            addCriterion("TASK_IS_COMMIT <>", value, "taskIsCommit");
            return (Criteria) this;
        }

        public Criteria andTaskIsCommitGreaterThan(String value) {
            addCriterion("TASK_IS_COMMIT >", value, "taskIsCommit");
            return (Criteria) this;
        }

        public Criteria andTaskIsCommitGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_IS_COMMIT >=", value, "taskIsCommit");
            return (Criteria) this;
        }

        public Criteria andTaskIsCommitLessThan(String value) {
            addCriterion("TASK_IS_COMMIT <", value, "taskIsCommit");
            return (Criteria) this;
        }

        public Criteria andTaskIsCommitLessThanOrEqualTo(String value) {
            addCriterion("TASK_IS_COMMIT <=", value, "taskIsCommit");
            return (Criteria) this;
        }

        public Criteria andTaskIsCommitLike(String value) {
            addCriterion("TASK_IS_COMMIT like", value, "taskIsCommit");
            return (Criteria) this;
        }

        public Criteria andTaskIsCommitNotLike(String value) {
            addCriterion("TASK_IS_COMMIT not like", value, "taskIsCommit");
            return (Criteria) this;
        }

        public Criteria andTaskIsCommitIn(List<String> values) {
            addCriterion("TASK_IS_COMMIT in", values, "taskIsCommit");
            return (Criteria) this;
        }

        public Criteria andTaskIsCommitNotIn(List<String> values) {
            addCriterion("TASK_IS_COMMIT not in", values, "taskIsCommit");
            return (Criteria) this;
        }

        public Criteria andTaskIsCommitBetween(String value1, String value2) {
            addCriterion("TASK_IS_COMMIT between", value1, value2, "taskIsCommit");
            return (Criteria) this;
        }

        public Criteria andTaskIsCommitNotBetween(String value1, String value2) {
            addCriterion("TASK_IS_COMMIT not between", value1, value2, "taskIsCommit");
            return (Criteria) this;
        }

        public Criteria andTaskUserNoIsNull() {
            addCriterion("TASK_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andTaskUserNoIsNotNull() {
            addCriterion("TASK_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTaskUserNoEqualTo(Integer value) {
            addCriterion("TASK_USER_NO =", value, "taskUserNo");
            return (Criteria) this;
        }

        public Criteria andTaskUserNoNotEqualTo(Integer value) {
            addCriterion("TASK_USER_NO <>", value, "taskUserNo");
            return (Criteria) this;
        }

        public Criteria andTaskUserNoGreaterThan(Integer value) {
            addCriterion("TASK_USER_NO >", value, "taskUserNo");
            return (Criteria) this;
        }

        public Criteria andTaskUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_USER_NO >=", value, "taskUserNo");
            return (Criteria) this;
        }

        public Criteria andTaskUserNoLessThan(Integer value) {
            addCriterion("TASK_USER_NO <", value, "taskUserNo");
            return (Criteria) this;
        }

        public Criteria andTaskUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_USER_NO <=", value, "taskUserNo");
            return (Criteria) this;
        }

        public Criteria andTaskUserNoIn(List<Integer> values) {
            addCriterion("TASK_USER_NO in", values, "taskUserNo");
            return (Criteria) this;
        }

        public Criteria andTaskUserNoNotIn(List<Integer> values) {
            addCriterion("TASK_USER_NO not in", values, "taskUserNo");
            return (Criteria) this;
        }

        public Criteria andTaskUserNoBetween(Integer value1, Integer value2) {
            addCriterion("TASK_USER_NO between", value1, value2, "taskUserNo");
            return (Criteria) this;
        }

        public Criteria andTaskUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_USER_NO not between", value1, value2, "taskUserNo");
            return (Criteria) this;
        }

        public Criteria andTaskRegtimeIsNull() {
            addCriterion("TASK_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskRegtimeIsNotNull() {
            addCriterion("TASK_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskRegtimeEqualTo(Date value) {
            addCriterion("TASK_REGTIME =", value, "taskRegtime");
            return (Criteria) this;
        }

        public Criteria andTaskRegtimeNotEqualTo(Date value) {
            addCriterion("TASK_REGTIME <>", value, "taskRegtime");
            return (Criteria) this;
        }

        public Criteria andTaskRegtimeGreaterThan(Date value) {
            addCriterion("TASK_REGTIME >", value, "taskRegtime");
            return (Criteria) this;
        }

        public Criteria andTaskRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TASK_REGTIME >=", value, "taskRegtime");
            return (Criteria) this;
        }

        public Criteria andTaskRegtimeLessThan(Date value) {
            addCriterion("TASK_REGTIME <", value, "taskRegtime");
            return (Criteria) this;
        }

        public Criteria andTaskRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("TASK_REGTIME <=", value, "taskRegtime");
            return (Criteria) this;
        }

        public Criteria andTaskRegtimeIn(List<Date> values) {
            addCriterion("TASK_REGTIME in", values, "taskRegtime");
            return (Criteria) this;
        }

        public Criteria andTaskRegtimeNotIn(List<Date> values) {
            addCriterion("TASK_REGTIME not in", values, "taskRegtime");
            return (Criteria) this;
        }

        public Criteria andTaskRegtimeBetween(Date value1, Date value2) {
            addCriterion("TASK_REGTIME between", value1, value2, "taskRegtime");
            return (Criteria) this;
        }

        public Criteria andTaskRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("TASK_REGTIME not between", value1, value2, "taskRegtime");
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