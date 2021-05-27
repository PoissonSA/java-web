package com.gl52.euv.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResponseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResponseExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRcreatedIsNull() {
            addCriterion("rcreated is null");
            return (Criteria) this;
        }

        public Criteria andRcreatedIsNotNull() {
            addCriterion("rcreated is not null");
            return (Criteria) this;
        }

        public Criteria andRcreatedEqualTo(Date value) {
            addCriterion("rcreated =", value, "rcreated");
            return (Criteria) this;
        }

        public Criteria andRcreatedNotEqualTo(Date value) {
            addCriterion("rcreated <>", value, "rcreated");
            return (Criteria) this;
        }

        public Criteria andRcreatedGreaterThan(Date value) {
            addCriterion("rcreated >", value, "rcreated");
            return (Criteria) this;
        }

        public Criteria andRcreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("rcreated >=", value, "rcreated");
            return (Criteria) this;
        }

        public Criteria andRcreatedLessThan(Date value) {
            addCriterion("rcreated <", value, "rcreated");
            return (Criteria) this;
        }

        public Criteria andRcreatedLessThanOrEqualTo(Date value) {
            addCriterion("rcreated <=", value, "rcreated");
            return (Criteria) this;
        }

        public Criteria andRcreatedIn(List<Date> values) {
            addCriterion("rcreated in", values, "rcreated");
            return (Criteria) this;
        }

        public Criteria andRcreatedNotIn(List<Date> values) {
            addCriterion("rcreated not in", values, "rcreated");
            return (Criteria) this;
        }

        public Criteria andRcreatedBetween(Date value1, Date value2) {
            addCriterion("rcreated between", value1, value2, "rcreated");
            return (Criteria) this;
        }

        public Criteria andRcreatedNotBetween(Date value1, Date value2) {
            addCriterion("rcreated not between", value1, value2, "rcreated");
            return (Criteria) this;
        }

        public Criteria andRevaluationIdIsNull() {
            addCriterion("revaluation_id is null");
            return (Criteria) this;
        }

        public Criteria andRevaluationIdIsNotNull() {
            addCriterion("revaluation_id is not null");
            return (Criteria) this;
        }

        public Criteria andRevaluationIdEqualTo(Integer value) {
            addCriterion("revaluation_id =", value, "revaluationId");
            return (Criteria) this;
        }

        public Criteria andRevaluationIdNotEqualTo(Integer value) {
            addCriterion("revaluation_id <>", value, "revaluationId");
            return (Criteria) this;
        }

        public Criteria andRevaluationIdGreaterThan(Integer value) {
            addCriterion("revaluation_id >", value, "revaluationId");
            return (Criteria) this;
        }

        public Criteria andRevaluationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("revaluation_id >=", value, "revaluationId");
            return (Criteria) this;
        }

        public Criteria andRevaluationIdLessThan(Integer value) {
            addCriterion("revaluation_id <", value, "revaluationId");
            return (Criteria) this;
        }

        public Criteria andRevaluationIdLessThanOrEqualTo(Integer value) {
            addCriterion("revaluation_id <=", value, "revaluationId");
            return (Criteria) this;
        }

        public Criteria andRevaluationIdIn(List<Integer> values) {
            addCriterion("revaluation_id in", values, "revaluationId");
            return (Criteria) this;
        }

        public Criteria andRevaluationIdNotIn(List<Integer> values) {
            addCriterion("revaluation_id not in", values, "revaluationId");
            return (Criteria) this;
        }

        public Criteria andRevaluationIdBetween(Integer value1, Integer value2) {
            addCriterion("revaluation_id between", value1, value2, "revaluationId");
            return (Criteria) this;
        }

        public Criteria andRevaluationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("revaluation_id not between", value1, value2, "revaluationId");
            return (Criteria) this;
        }

        public Criteria andRstudentIdIsNull() {
            addCriterion("rstudent_id is null");
            return (Criteria) this;
        }

        public Criteria andRstudentIdIsNotNull() {
            addCriterion("rstudent_id is not null");
            return (Criteria) this;
        }

        public Criteria andRstudentIdEqualTo(Integer value) {
            addCriterion("rstudent_id =", value, "rstudentId");
            return (Criteria) this;
        }

        public Criteria andRstudentIdNotEqualTo(Integer value) {
            addCriterion("rstudent_id <>", value, "rstudentId");
            return (Criteria) this;
        }

        public Criteria andRstudentIdGreaterThan(Integer value) {
            addCriterion("rstudent_id >", value, "rstudentId");
            return (Criteria) this;
        }

        public Criteria andRstudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rstudent_id >=", value, "rstudentId");
            return (Criteria) this;
        }

        public Criteria andRstudentIdLessThan(Integer value) {
            addCriterion("rstudent_id <", value, "rstudentId");
            return (Criteria) this;
        }

        public Criteria andRstudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("rstudent_id <=", value, "rstudentId");
            return (Criteria) this;
        }

        public Criteria andRstudentIdIn(List<Integer> values) {
            addCriterion("rstudent_id in", values, "rstudentId");
            return (Criteria) this;
        }

        public Criteria andRstudentIdNotIn(List<Integer> values) {
            addCriterion("rstudent_id not in", values, "rstudentId");
            return (Criteria) this;
        }

        public Criteria andRstudentIdBetween(Integer value1, Integer value2) {
            addCriterion("rstudent_id between", value1, value2, "rstudentId");
            return (Criteria) this;
        }

        public Criteria andRstudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rstudent_id not between", value1, value2, "rstudentId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private final String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private final String typeHandler;

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