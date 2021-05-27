package com.gl52.euv.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectExample() {
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

        public Criteria andSubjectidIsNull() {
            addCriterion("subjectId is null");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNotNull() {
            addCriterion("subjectId is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectidEqualTo(Integer value) {
            addCriterion("subjectId =", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotEqualTo(Integer value) {
            addCriterion("subjectId <>", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThan(Integer value) {
            addCriterion("subjectId >", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("subjectId >=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThan(Integer value) {
            addCriterion("subjectId <", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("subjectId <=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidIn(List<Integer> values) {
            addCriterion("subjectId in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotIn(List<Integer> values) {
            addCriterion("subjectId not in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("subjectId between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("subjectId not between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andSubjectnameIsNull() {
            addCriterion("subjectName is null");
            return (Criteria) this;
        }

        public Criteria andSubjectnameIsNotNull() {
            addCriterion("subjectName is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectnameEqualTo(String value) {
            addCriterion("subjectName =", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameNotEqualTo(String value) {
            addCriterion("subjectName <>", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameGreaterThan(String value) {
            addCriterion("subjectName >", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("subjectName >=", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameLessThan(String value) {
            addCriterion("subjectName <", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameLessThanOrEqualTo(String value) {
            addCriterion("subjectName <=", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameLike(String value) {
            addCriterion("subjectName like", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameNotLike(String value) {
            addCriterion("subjectName not like", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameIn(List<String> values) {
            addCriterion("subjectName in", values, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameNotIn(List<String> values) {
            addCriterion("subjectName not in", values, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameBetween(String value1, String value2) {
            addCriterion("subjectName between", value1, value2, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameNotBetween(String value1, String value2) {
            addCriterion("subjectName not between", value1, value2, "subjectname");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andNumberMinIsNull() {
            addCriterion("number_min is null");
            return (Criteria) this;
        }

        public Criteria andNumberMinIsNotNull() {
            addCriterion("number_min is not null");
            return (Criteria) this;
        }

        public Criteria andNumberMinEqualTo(Integer value) {
            addCriterion("number_min =", value, "numberMin");
            return (Criteria) this;
        }

        public Criteria andNumberMinNotEqualTo(Integer value) {
            addCriterion("number_min <>", value, "numberMin");
            return (Criteria) this;
        }

        public Criteria andNumberMinGreaterThan(Integer value) {
            addCriterion("number_min >", value, "numberMin");
            return (Criteria) this;
        }

        public Criteria andNumberMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_min >=", value, "numberMin");
            return (Criteria) this;
        }

        public Criteria andNumberMinLessThan(Integer value) {
            addCriterion("number_min <", value, "numberMin");
            return (Criteria) this;
        }

        public Criteria andNumberMinLessThanOrEqualTo(Integer value) {
            addCriterion("number_min <=", value, "numberMin");
            return (Criteria) this;
        }

        public Criteria andNumberMinIn(List<Integer> values) {
            addCriterion("number_min in", values, "numberMin");
            return (Criteria) this;
        }

        public Criteria andNumberMinNotIn(List<Integer> values) {
            addCriterion("number_min not in", values, "numberMin");
            return (Criteria) this;
        }

        public Criteria andNumberMinBetween(Integer value1, Integer value2) {
            addCriterion("number_min between", value1, value2, "numberMin");
            return (Criteria) this;
        }

        public Criteria andNumberMinNotBetween(Integer value1, Integer value2) {
            addCriterion("number_min not between", value1, value2, "numberMin");
            return (Criteria) this;
        }

        public Criteria andNumberMaxIsNull() {
            addCriterion("number_max is null");
            return (Criteria) this;
        }

        public Criteria andNumberMaxIsNotNull() {
            addCriterion("number_max is not null");
            return (Criteria) this;
        }

        public Criteria andNumberMaxEqualTo(Integer value) {
            addCriterion("number_max =", value, "numberMax");
            return (Criteria) this;
        }

        public Criteria andNumberMaxNotEqualTo(Integer value) {
            addCriterion("number_max <>", value, "numberMax");
            return (Criteria) this;
        }

        public Criteria andNumberMaxGreaterThan(Integer value) {
            addCriterion("number_max >", value, "numberMax");
            return (Criteria) this;
        }

        public Criteria andNumberMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_max >=", value, "numberMax");
            return (Criteria) this;
        }

        public Criteria andNumberMaxLessThan(Integer value) {
            addCriterion("number_max <", value, "numberMax");
            return (Criteria) this;
        }

        public Criteria andNumberMaxLessThanOrEqualTo(Integer value) {
            addCriterion("number_max <=", value, "numberMax");
            return (Criteria) this;
        }

        public Criteria andNumberMaxIn(List<Integer> values) {
            addCriterion("number_max in", values, "numberMax");
            return (Criteria) this;
        }

        public Criteria andNumberMaxNotIn(List<Integer> values) {
            addCriterion("number_max not in", values, "numberMax");
            return (Criteria) this;
        }

        public Criteria andNumberMaxBetween(Integer value1, Integer value2) {
            addCriterion("number_max between", value1, value2, "numberMax");
            return (Criteria) this;
        }

        public Criteria andNumberMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("number_max not between", value1, value2, "numberMax");
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