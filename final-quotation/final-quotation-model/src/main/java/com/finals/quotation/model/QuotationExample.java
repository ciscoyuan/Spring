package com.finals.quotation.model;

import java.util.ArrayList;
import java.util.List;

public class QuotationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public QuotationExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andQuotationIdIsNull() {
            addCriterion("quotation_id is null");
            return (Criteria) this;
        }

        public Criteria andQuotationIdIsNotNull() {
            addCriterion("quotation_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuotationIdEqualTo(Long value) {
            addCriterion("quotation_id =", value, "quotationId");
            return (Criteria) this;
        }

        public Criteria andQuotationIdNotEqualTo(Long value) {
            addCriterion("quotation_id <>", value, "quotationId");
            return (Criteria) this;
        }

        public Criteria andQuotationIdGreaterThan(Long value) {
            addCriterion("quotation_id >", value, "quotationId");
            return (Criteria) this;
        }

        public Criteria andQuotationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("quotation_id >=", value, "quotationId");
            return (Criteria) this;
        }

        public Criteria andQuotationIdLessThan(Long value) {
            addCriterion("quotation_id <", value, "quotationId");
            return (Criteria) this;
        }

        public Criteria andQuotationIdLessThanOrEqualTo(Long value) {
            addCriterion("quotation_id <=", value, "quotationId");
            return (Criteria) this;
        }

        public Criteria andQuotationIdIn(List<Long> values) {
            addCriterion("quotation_id in", values, "quotationId");
            return (Criteria) this;
        }

        public Criteria andQuotationIdNotIn(List<Long> values) {
            addCriterion("quotation_id not in", values, "quotationId");
            return (Criteria) this;
        }

        public Criteria andQuotationIdBetween(Long value1, Long value2) {
            addCriterion("quotation_id between", value1, value2, "quotationId");
            return (Criteria) this;
        }

        public Criteria andQuotationIdNotBetween(Long value1, Long value2) {
            addCriterion("quotation_id not between", value1, value2, "quotationId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupidIsNull() {
            addCriterion("goods_groupId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupidIsNotNull() {
            addCriterion("goods_groupId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupidEqualTo(Long value) {
            addCriterion("goods_groupId =", value, "goodsGroupid");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupidNotEqualTo(Long value) {
            addCriterion("goods_groupId <>", value, "goodsGroupid");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupidGreaterThan(Long value) {
            addCriterion("goods_groupId >", value, "goodsGroupid");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupidGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_groupId >=", value, "goodsGroupid");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupidLessThan(Long value) {
            addCriterion("goods_groupId <", value, "goodsGroupid");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupidLessThanOrEqualTo(Long value) {
            addCriterion("goods_groupId <=", value, "goodsGroupid");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupidIn(List<Long> values) {
            addCriterion("goods_groupId in", values, "goodsGroupid");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupidNotIn(List<Long> values) {
            addCriterion("goods_groupId not in", values, "goodsGroupid");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupidBetween(Long value1, Long value2) {
            addCriterion("goods_groupId between", value1, value2, "goodsGroupid");
            return (Criteria) this;
        }

        public Criteria andGoodsGroupidNotBetween(Long value1, Long value2) {
            addCriterion("goods_groupId not between", value1, value2, "goodsGroupid");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeIsNull() {
            addCriterion("quotation_type is null");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeIsNotNull() {
            addCriterion("quotation_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeEqualTo(Integer value) {
            addCriterion("quotation_type =", value, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeNotEqualTo(Integer value) {
            addCriterion("quotation_type <>", value, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeGreaterThan(Integer value) {
            addCriterion("quotation_type >", value, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("quotation_type >=", value, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeLessThan(Integer value) {
            addCriterion("quotation_type <", value, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("quotation_type <=", value, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeIn(List<Integer> values) {
            addCriterion("quotation_type in", values, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeNotIn(List<Integer> values) {
            addCriterion("quotation_type not in", values, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeBetween(Integer value1, Integer value2) {
            addCriterion("quotation_type between", value1, value2, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("quotation_type not between", value1, value2, "quotationType");
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