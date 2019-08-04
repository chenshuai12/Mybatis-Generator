package com.csvideo.pojo;

import java.util.ArrayList;
import java.util.List;

public class VideosReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideosReportExample() {
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

        public Criteria andVideoReportIdIsNull() {
            addCriterion("video_report_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoReportIdIsNotNull() {
            addCriterion("video_report_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoReportIdEqualTo(String value) {
            addCriterion("video_report_id =", value, "videoReportId");
            return (Criteria) this;
        }

        public Criteria andVideoReportIdNotEqualTo(String value) {
            addCriterion("video_report_id <>", value, "videoReportId");
            return (Criteria) this;
        }

        public Criteria andVideoReportIdGreaterThan(String value) {
            addCriterion("video_report_id >", value, "videoReportId");
            return (Criteria) this;
        }

        public Criteria andVideoReportIdGreaterThanOrEqualTo(String value) {
            addCriterion("video_report_id >=", value, "videoReportId");
            return (Criteria) this;
        }

        public Criteria andVideoReportIdLessThan(String value) {
            addCriterion("video_report_id <", value, "videoReportId");
            return (Criteria) this;
        }

        public Criteria andVideoReportIdLessThanOrEqualTo(String value) {
            addCriterion("video_report_id <=", value, "videoReportId");
            return (Criteria) this;
        }

        public Criteria andVideoReportIdLike(String value) {
            addCriterion("video_report_id like", value, "videoReportId");
            return (Criteria) this;
        }

        public Criteria andVideoReportIdNotLike(String value) {
            addCriterion("video_report_id not like", value, "videoReportId");
            return (Criteria) this;
        }

        public Criteria andVideoReportIdIn(List<String> values) {
            addCriterion("video_report_id in", values, "videoReportId");
            return (Criteria) this;
        }

        public Criteria andVideoReportIdNotIn(List<String> values) {
            addCriterion("video_report_id not in", values, "videoReportId");
            return (Criteria) this;
        }

        public Criteria andVideoReportIdBetween(String value1, String value2) {
            addCriterion("video_report_id between", value1, value2, "videoReportId");
            return (Criteria) this;
        }

        public Criteria andVideoReportIdNotBetween(String value1, String value2) {
            addCriterion("video_report_id not between", value1, value2, "videoReportId");
            return (Criteria) this;
        }

        public Criteria andDealVedeoIdIsNull() {
            addCriterion("deal_vedeo_id is null");
            return (Criteria) this;
        }

        public Criteria andDealVedeoIdIsNotNull() {
            addCriterion("deal_vedeo_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealVedeoIdEqualTo(String value) {
            addCriterion("deal_vedeo_id =", value, "dealVedeoId");
            return (Criteria) this;
        }

        public Criteria andDealVedeoIdNotEqualTo(String value) {
            addCriterion("deal_vedeo_id <>", value, "dealVedeoId");
            return (Criteria) this;
        }

        public Criteria andDealVedeoIdGreaterThan(String value) {
            addCriterion("deal_vedeo_id >", value, "dealVedeoId");
            return (Criteria) this;
        }

        public Criteria andDealVedeoIdGreaterThanOrEqualTo(String value) {
            addCriterion("deal_vedeo_id >=", value, "dealVedeoId");
            return (Criteria) this;
        }

        public Criteria andDealVedeoIdLessThan(String value) {
            addCriterion("deal_vedeo_id <", value, "dealVedeoId");
            return (Criteria) this;
        }

        public Criteria andDealVedeoIdLessThanOrEqualTo(String value) {
            addCriterion("deal_vedeo_id <=", value, "dealVedeoId");
            return (Criteria) this;
        }

        public Criteria andDealVedeoIdLike(String value) {
            addCriterion("deal_vedeo_id like", value, "dealVedeoId");
            return (Criteria) this;
        }

        public Criteria andDealVedeoIdNotLike(String value) {
            addCriterion("deal_vedeo_id not like", value, "dealVedeoId");
            return (Criteria) this;
        }

        public Criteria andDealVedeoIdIn(List<String> values) {
            addCriterion("deal_vedeo_id in", values, "dealVedeoId");
            return (Criteria) this;
        }

        public Criteria andDealVedeoIdNotIn(List<String> values) {
            addCriterion("deal_vedeo_id not in", values, "dealVedeoId");
            return (Criteria) this;
        }

        public Criteria andDealVedeoIdBetween(String value1, String value2) {
            addCriterion("deal_vedeo_id between", value1, value2, "dealVedeoId");
            return (Criteria) this;
        }

        public Criteria andDealVedeoIdNotBetween(String value1, String value2) {
            addCriterion("deal_vedeo_id not between", value1, value2, "dealVedeoId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCauseIsNull() {
            addCriterion("cause is null");
            return (Criteria) this;
        }

        public Criteria andCauseIsNotNull() {
            addCriterion("cause is not null");
            return (Criteria) this;
        }

        public Criteria andCauseEqualTo(String value) {
            addCriterion("cause =", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotEqualTo(String value) {
            addCriterion("cause <>", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThan(String value) {
            addCriterion("cause >", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThanOrEqualTo(String value) {
            addCriterion("cause >=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThan(String value) {
            addCriterion("cause <", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThanOrEqualTo(String value) {
            addCriterion("cause <=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLike(String value) {
            addCriterion("cause like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotLike(String value) {
            addCriterion("cause not like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseIn(List<String> values) {
            addCriterion("cause in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotIn(List<String> values) {
            addCriterion("cause not in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseBetween(String value1, String value2) {
            addCriterion("cause between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotBetween(String value1, String value2) {
            addCriterion("cause not between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
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