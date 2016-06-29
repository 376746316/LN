package com.chinasofti.cetp.resource.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListVideoExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ListVideoExample() {
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

		public Criteria andLvIdIsNull() {
			addCriterion("LV_ID is null");
			return (Criteria) this;
		}

		public Criteria andLvIdIsNotNull() {
			addCriterion("LV_ID is not null");
			return (Criteria) this;
		}

		public Criteria andLvIdEqualTo(Integer value) {
			addCriterion("LV_ID =", value, "lvId");
			return (Criteria) this;
		}

		public Criteria andLvIdNotEqualTo(Integer value) {
			addCriterion("LV_ID <>", value, "lvId");
			return (Criteria) this;
		}

		public Criteria andLvIdGreaterThan(Integer value) {
			addCriterion("LV_ID >", value, "lvId");
			return (Criteria) this;
		}

		public Criteria andLvIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("LV_ID >=", value, "lvId");
			return (Criteria) this;
		}

		public Criteria andLvIdLessThan(Integer value) {
			addCriterion("LV_ID <", value, "lvId");
			return (Criteria) this;
		}

		public Criteria andLvIdLessThanOrEqualTo(Integer value) {
			addCriterion("LV_ID <=", value, "lvId");
			return (Criteria) this;
		}

		public Criteria andLvIdIn(List<Integer> values) {
			addCriterion("LV_ID in", values, "lvId");
			return (Criteria) this;
		}

		public Criteria andLvIdNotIn(List<Integer> values) {
			addCriterion("LV_ID not in", values, "lvId");
			return (Criteria) this;
		}

		public Criteria andLvIdBetween(Integer value1, Integer value2) {
			addCriterion("LV_ID between", value1, value2, "lvId");
			return (Criteria) this;
		}

		public Criteria andLvIdNotBetween(Integer value1, Integer value2) {
			addCriterion("LV_ID not between", value1, value2, "lvId");
			return (Criteria) this;
		}

		public Criteria andLvListIdIsNull() {
			addCriterion("LV_LIST_ID is null");
			return (Criteria) this;
		}

		public Criteria andLvListIdIsNotNull() {
			addCriterion("LV_LIST_ID is not null");
			return (Criteria) this;
		}

		public Criteria andLvListIdEqualTo(Integer value) {
			addCriterion("LV_LIST_ID =", value, "lvListId");
			return (Criteria) this;
		}

		public Criteria andLvListIdNotEqualTo(Integer value) {
			addCriterion("LV_LIST_ID <>", value, "lvListId");
			return (Criteria) this;
		}

		public Criteria andLvListIdGreaterThan(Integer value) {
			addCriterion("LV_LIST_ID >", value, "lvListId");
			return (Criteria) this;
		}

		public Criteria andLvListIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("LV_LIST_ID >=", value, "lvListId");
			return (Criteria) this;
		}

		public Criteria andLvListIdLessThan(Integer value) {
			addCriterion("LV_LIST_ID <", value, "lvListId");
			return (Criteria) this;
		}

		public Criteria andLvListIdLessThanOrEqualTo(Integer value) {
			addCriterion("LV_LIST_ID <=", value, "lvListId");
			return (Criteria) this;
		}

		public Criteria andLvListIdIn(List<Integer> values) {
			addCriterion("LV_LIST_ID in", values, "lvListId");
			return (Criteria) this;
		}

		public Criteria andLvListIdNotIn(List<Integer> values) {
			addCriterion("LV_LIST_ID not in", values, "lvListId");
			return (Criteria) this;
		}

		public Criteria andLvListIdBetween(Integer value1, Integer value2) {
			addCriterion("LV_LIST_ID between", value1, value2, "lvListId");
			return (Criteria) this;
		}

		public Criteria andLvListIdNotBetween(Integer value1, Integer value2) {
			addCriterion("LV_LIST_ID not between", value1, value2, "lvListId");
			return (Criteria) this;
		}

		public Criteria andLvVideoIdIsNull() {
			addCriterion("LV_VIDEO_ID is null");
			return (Criteria) this;
		}

		public Criteria andLvVideoIdIsNotNull() {
			addCriterion("LV_VIDEO_ID is not null");
			return (Criteria) this;
		}

		public Criteria andLvVideoIdEqualTo(Integer value) {
			addCriterion("LV_VIDEO_ID =", value, "lvVideoId");
			return (Criteria) this;
		}

		public Criteria andLvVideoIdNotEqualTo(Integer value) {
			addCriterion("LV_VIDEO_ID <>", value, "lvVideoId");
			return (Criteria) this;
		}

		public Criteria andLvVideoIdGreaterThan(Integer value) {
			addCriterion("LV_VIDEO_ID >", value, "lvVideoId");
			return (Criteria) this;
		}

		public Criteria andLvVideoIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("LV_VIDEO_ID >=", value, "lvVideoId");
			return (Criteria) this;
		}

		public Criteria andLvVideoIdLessThan(Integer value) {
			addCriterion("LV_VIDEO_ID <", value, "lvVideoId");
			return (Criteria) this;
		}

		public Criteria andLvVideoIdLessThanOrEqualTo(Integer value) {
			addCriterion("LV_VIDEO_ID <=", value, "lvVideoId");
			return (Criteria) this;
		}

		public Criteria andLvVideoIdIn(List<Integer> values) {
			addCriterion("LV_VIDEO_ID in", values, "lvVideoId");
			return (Criteria) this;
		}

		public Criteria andLvVideoIdNotIn(List<Integer> values) {
			addCriterion("LV_VIDEO_ID not in", values, "lvVideoId");
			return (Criteria) this;
		}

		public Criteria andLvVideoIdBetween(Integer value1, Integer value2) {
			addCriterion("LV_VIDEO_ID between", value1, value2, "lvVideoId");
			return (Criteria) this;
		}

		public Criteria andLvVideoIdNotBetween(Integer value1, Integer value2) {
			addCriterion("LV_VIDEO_ID not between", value1, value2, "lvVideoId");
			return (Criteria) this;
		}

		public Criteria andLvSeqIsNull() {
			addCriterion("LV_SEQ is null");
			return (Criteria) this;
		}

		public Criteria andLvSeqIsNotNull() {
			addCriterion("LV_SEQ is not null");
			return (Criteria) this;
		}

		public Criteria andLvSeqEqualTo(Integer value) {
			addCriterion("LV_SEQ =", value, "lvSeq");
			return (Criteria) this;
		}

		public Criteria andLvSeqNotEqualTo(Integer value) {
			addCriterion("LV_SEQ <>", value, "lvSeq");
			return (Criteria) this;
		}

		public Criteria andLvSeqGreaterThan(Integer value) {
			addCriterion("LV_SEQ >", value, "lvSeq");
			return (Criteria) this;
		}

		public Criteria andLvSeqGreaterThanOrEqualTo(Integer value) {
			addCriterion("LV_SEQ >=", value, "lvSeq");
			return (Criteria) this;
		}

		public Criteria andLvSeqLessThan(Integer value) {
			addCriterion("LV_SEQ <", value, "lvSeq");
			return (Criteria) this;
		}

		public Criteria andLvSeqLessThanOrEqualTo(Integer value) {
			addCriterion("LV_SEQ <=", value, "lvSeq");
			return (Criteria) this;
		}

		public Criteria andLvSeqIn(List<Integer> values) {
			addCriterion("LV_SEQ in", values, "lvSeq");
			return (Criteria) this;
		}

		public Criteria andLvSeqNotIn(List<Integer> values) {
			addCriterion("LV_SEQ not in", values, "lvSeq");
			return (Criteria) this;
		}

		public Criteria andLvSeqBetween(Integer value1, Integer value2) {
			addCriterion("LV_SEQ between", value1, value2, "lvSeq");
			return (Criteria) this;
		}

		public Criteria andLvSeqNotBetween(Integer value1, Integer value2) {
			addCriterion("LV_SEQ not between", value1, value2, "lvSeq");
			return (Criteria) this;
		}

		public Criteria andLvUpdatetimeIsNull() {
			addCriterion("LV_UPDATETIME is null");
			return (Criteria) this;
		}

		public Criteria andLvUpdatetimeIsNotNull() {
			addCriterion("LV_UPDATETIME is not null");
			return (Criteria) this;
		}

		public Criteria andLvUpdatetimeEqualTo(Date value) {
			addCriterion("LV_UPDATETIME =", value, "lvUpdatetime");
			return (Criteria) this;
		}

		public Criteria andLvUpdatetimeNotEqualTo(Date value) {
			addCriterion("LV_UPDATETIME <>", value, "lvUpdatetime");
			return (Criteria) this;
		}

		public Criteria andLvUpdatetimeGreaterThan(Date value) {
			addCriterion("LV_UPDATETIME >", value, "lvUpdatetime");
			return (Criteria) this;
		}

		public Criteria andLvUpdatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("LV_UPDATETIME >=", value, "lvUpdatetime");
			return (Criteria) this;
		}

		public Criteria andLvUpdatetimeLessThan(Date value) {
			addCriterion("LV_UPDATETIME <", value, "lvUpdatetime");
			return (Criteria) this;
		}

		public Criteria andLvUpdatetimeLessThanOrEqualTo(Date value) {
			addCriterion("LV_UPDATETIME <=", value, "lvUpdatetime");
			return (Criteria) this;
		}

		public Criteria andLvUpdatetimeIn(List<Date> values) {
			addCriterion("LV_UPDATETIME in", values, "lvUpdatetime");
			return (Criteria) this;
		}

		public Criteria andLvUpdatetimeNotIn(List<Date> values) {
			addCriterion("LV_UPDATETIME not in", values, "lvUpdatetime");
			return (Criteria) this;
		}

		public Criteria andLvUpdatetimeBetween(Date value1, Date value2) {
			addCriterion("LV_UPDATETIME between", value1, value2, "lvUpdatetime");
			return (Criteria) this;
		}

		public Criteria andLvUpdatetimeNotBetween(Date value1, Date value2) {
			addCriterion("LV_UPDATETIME not between", value1, value2, "lvUpdatetime");
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