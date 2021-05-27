package com.gl52.euv.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluationExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEtitleIsNull() {
            addCriterion("etitle is null");
            return (Criteria) this;
        }

        public Criteria andEtitleIsNotNull() {
            addCriterion("etitle is not null");
            return (Criteria) this;
        }

        public Criteria andEtitleEqualTo(String value) {
            addCriterion("etitle =", value, "etitle");
            return (Criteria) this;
        }

        public Criteria andEtitleNotEqualTo(String value) {
            addCriterion("etitle <>", value, "etitle");
            return (Criteria) this;
        }

        public Criteria andEtitleGreaterThan(String value) {
            addCriterion("etitle >", value, "etitle");
            return (Criteria) this;
        }

        public Criteria andEtitleGreaterThanOrEqualTo(String value) {
            addCriterion("etitle >=", value, "etitle");
            return (Criteria) this;
        }

        public Criteria andEtitleLessThan(String value) {
            addCriterion("etitle <", value, "etitle");
            return (Criteria) this;
        }

        public Criteria andEtitleLessThanOrEqualTo(String value) {
            addCriterion("etitle <=", value, "etitle");
            return (Criteria) this;
        }

        public Criteria andEtitleLike(String value) {
            addCriterion("etitle like", value, "etitle");
            return (Criteria) this;
        }

        public Criteria andEtitleNotLike(String value) {
            addCriterion("etitle not like", value, "etitle");
            return (Criteria) this;
        }

        public Criteria andEtitleIn(List<String> values) {
            addCriterion("etitle in", values, "etitle");
            return (Criteria) this;
        }

        public Criteria andEtitleNotIn(List<String> values) {
            addCriterion("etitle not in", values, "etitle");
            return (Criteria) this;
        }

        public Criteria andEtitleBetween(String value1, String value2) {
            addCriterion("etitle between", value1, value2, "etitle");
            return (Criteria) this;
        }

        public Criteria andEtitleNotBetween(String value1, String value2) {
            addCriterion("etitle not between", value1, value2, "etitle");
            return (Criteria) this;
        }

        public Criteria andEdespIsNull() {
            addCriterion("edesp is null");
            return (Criteria) this;
        }

        public Criteria andEdespIsNotNull() {
            addCriterion("edesp is not null");
            return (Criteria) this;
        }

        public Criteria andEdespEqualTo(String value) {
            addCriterion("edesp =", value, "edesp");
            return (Criteria) this;
        }

        public Criteria andEdespNotEqualTo(String value) {
            addCriterion("edesp <>", value, "edesp");
            return (Criteria) this;
        }

        public Criteria andEdespGreaterThan(String value) {
            addCriterion("edesp >", value, "edesp");
            return (Criteria) this;
        }

        public Criteria andEdespGreaterThanOrEqualTo(String value) {
            addCriterion("edesp >=", value, "edesp");
            return (Criteria) this;
        }

        public Criteria andEdespLessThan(String value) {
            addCriterion("edesp <", value, "edesp");
            return (Criteria) this;
        }

        public Criteria andEdespLessThanOrEqualTo(String value) {
            addCriterion("edesp <=", value, "edesp");
            return (Criteria) this;
        }

        public Criteria andEdespLike(String value) {
            addCriterion("edesp like", value, "edesp");
            return (Criteria) this;
        }

        public Criteria andEdespNotLike(String value) {
            addCriterion("edesp not like", value, "edesp");
            return (Criteria) this;
        }

        public Criteria andEdespIn(List<String> values) {
            addCriterion("edesp in", values, "edesp");
            return (Criteria) this;
        }

        public Criteria andEdespNotIn(List<String> values) {
            addCriterion("edesp not in", values, "edesp");
            return (Criteria) this;
        }

        public Criteria andEdespBetween(String value1, String value2) {
            addCriterion("edesp between", value1, value2, "edesp");
            return (Criteria) this;
        }

        public Criteria andEdespNotBetween(String value1, String value2) {
            addCriterion("edesp not between", value1, value2, "edesp");
            return (Criteria) this;
        }

        public Criteria andEdurationIsNull() {
            addCriterion("eduration is null");
            return (Criteria) this;
        }

        public Criteria andEdurationIsNotNull() {
            addCriterion("eduration is not null");
            return (Criteria) this;
        }

        public Criteria andEdurationEqualTo(Date value) {
            addCriterion("eduration =", value, "eduration");
            return (Criteria) this;
        }

        public Criteria andEdurationNotEqualTo(Date value) {
            addCriterion("eduration <>", value, "eduration");
            return (Criteria) this;
        }

        public Criteria andEdurationGreaterThan(Date value) {
            addCriterion("eduration >", value, "eduration");
            return (Criteria) this;
        }

        public Criteria andEdurationGreaterThanOrEqualTo(Date value) {
            addCriterion("eduration >=", value, "eduration");
            return (Criteria) this;
        }

        public Criteria andEdurationLessThan(Date value) {
            addCriterion("eduration <", value, "eduration");
            return (Criteria) this;
        }

        public Criteria andEdurationLessThanOrEqualTo(Date value) {
            addCriterion("eduration <=", value, "eduration");
            return (Criteria) this;
        }

        public Criteria andEdurationIn(List<Date> values) {
            addCriterion("eduration in", values, "eduration");
            return (Criteria) this;
        }

        public Criteria andEdurationNotIn(List<Date> values) {
            addCriterion("eduration not in", values, "eduration");
            return (Criteria) this;
        }

        public Criteria andEdurationBetween(Date value1, Date value2) {
            addCriterion("eduration between", value1, value2, "eduration");
            return (Criteria) this;
        }

        public Criteria andEdurationNotBetween(Date value1, Date value2) {
            addCriterion("eduration not between", value1, value2, "eduration");
            return (Criteria) this;
        }

        public Criteria andEcreatedIsNull() {
            addCriterion("ecreated is null");
            return (Criteria) this;
        }

        public Criteria andEcreatedIsNotNull() {
            addCriterion("ecreated is not null");
            return (Criteria) this;
        }

        public Criteria andEcreatedEqualTo(Date value) {
            addCriterion("ecreated =", value, "ecreated");
            return (Criteria) this;
        }

        public Criteria andEcreatedNotEqualTo(Date value) {
            addCriterion("ecreated <>", value, "ecreated");
            return (Criteria) this;
        }

        public Criteria andEcreatedGreaterThan(Date value) {
            addCriterion("ecreated >", value, "ecreated");
            return (Criteria) this;
        }

        public Criteria andEcreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("ecreated >=", value, "ecreated");
            return (Criteria) this;
        }

        public Criteria andEcreatedLessThan(Date value) {
            addCriterion("ecreated <", value, "ecreated");
            return (Criteria) this;
        }

        public Criteria andEcreatedLessThanOrEqualTo(Date value) {
            addCriterion("ecreated <=", value, "ecreated");
            return (Criteria) this;
        }

        public Criteria andEcreatedIn(List<Date> values) {
            addCriterion("ecreated in", values, "ecreated");
            return (Criteria) this;
        }

        public Criteria andEcreatedNotIn(List<Date> values) {
            addCriterion("ecreated not in", values, "ecreated");
            return (Criteria) this;
        }

        public Criteria andEcreatedBetween(Date value1, Date value2) {
            addCriterion("ecreated between", value1, value2, "ecreated");
            return (Criteria) this;
        }

        public Criteria andEcreatedNotBetween(Date value1, Date value2) {
            addCriterion("ecreated not between", value1, value2, "ecreated");
            return (Criteria) this;
        }

        public Criteria andEvaildIsNull() {
            addCriterion("evaild is null");
            return (Criteria) this;
        }

        public Criteria andEvaildIsNotNull() {
            addCriterion("evaild is not null");
            return (Criteria) this;
        }

        public Criteria andEvaildEqualTo(Boolean value) {
            addCriterion("evaild =", value, "evaild");
            return (Criteria) this;
        }

        public Criteria andEvaildNotEqualTo(Boolean value) {
            addCriterion("evaild <>", value, "evaild");
            return (Criteria) this;
        }

        public Criteria andEvaildGreaterThan(Boolean value) {
            addCriterion("evaild >", value, "evaild");
            return (Criteria) this;
        }

        public Criteria andEvaildGreaterThanOrEqualTo(Boolean value) {
            addCriterion("evaild >=", value, "evaild");
            return (Criteria) this;
        }

        public Criteria andEvaildLessThan(Boolean value) {
            addCriterion("evaild <", value, "evaild");
            return (Criteria) this;
        }

        public Criteria andEvaildLessThanOrEqualTo(Boolean value) {
            addCriterion("evaild <=", value, "evaild");
            return (Criteria) this;
        }

        public Criteria andEvaildIn(List<Boolean> values) {
            addCriterion("evaild in", values, "evaild");
            return (Criteria) this;
        }

        public Criteria andEvaildNotIn(List<Boolean> values) {
            addCriterion("evaild not in", values, "evaild");
            return (Criteria) this;
        }

        public Criteria andEvaildBetween(Boolean value1, Boolean value2) {
            addCriterion("evaild between", value1, value2, "evaild");
            return (Criteria) this;
        }

        public Criteria andEvaildNotBetween(Boolean value1, Boolean value2) {
            addCriterion("evaild not between", value1, value2, "evaild");
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