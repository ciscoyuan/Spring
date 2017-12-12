package com.finals.sys.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GoodBaseExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andMnoTypeIsNull() {
            addCriterion("mno_type is null");
            return (Criteria) this;
        }

        public Criteria andMnoTypeIsNotNull() {
            addCriterion("mno_type is not null");
            return (Criteria) this;
        }

        public Criteria andMnoTypeEqualTo(String value) {
            addCriterion("mno_type =", value, "mnoType");
            return (Criteria) this;
        }

        public Criteria andMnoTypeNotEqualTo(String value) {
            addCriterion("mno_type <>", value, "mnoType");
            return (Criteria) this;
        }

        public Criteria andMnoTypeGreaterThan(String value) {
            addCriterion("mno_type >", value, "mnoType");
            return (Criteria) this;
        }

        public Criteria andMnoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mno_type >=", value, "mnoType");
            return (Criteria) this;
        }

        public Criteria andMnoTypeLessThan(String value) {
            addCriterion("mno_type <", value, "mnoType");
            return (Criteria) this;
        }

        public Criteria andMnoTypeLessThanOrEqualTo(String value) {
            addCriterion("mno_type <=", value, "mnoType");
            return (Criteria) this;
        }

        public Criteria andMnoTypeLike(String value) {
            addCriterion("mno_type like", value, "mnoType");
            return (Criteria) this;
        }

        public Criteria andMnoTypeNotLike(String value) {
            addCriterion("mno_type not like", value, "mnoType");
            return (Criteria) this;
        }

        public Criteria andMnoTypeIn(List<String> values) {
            addCriterion("mno_type in", values, "mnoType");
            return (Criteria) this;
        }

        public Criteria andMnoTypeNotIn(List<String> values) {
            addCriterion("mno_type not in", values, "mnoType");
            return (Criteria) this;
        }

        public Criteria andMnoTypeBetween(String value1, String value2) {
            addCriterion("mno_type between", value1, value2, "mnoType");
            return (Criteria) this;
        }

        public Criteria andMnoTypeNotBetween(String value1, String value2) {
            addCriterion("mno_type not between", value1, value2, "mnoType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("goods_type like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("goods_type not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andCycleIsNull() {
            addCriterion("cycle is null");
            return (Criteria) this;
        }

        public Criteria andCycleIsNotNull() {
            addCriterion("cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEqualTo(Integer value) {
            addCriterion("cycle =", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotEqualTo(Integer value) {
            addCriterion("cycle <>", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThan(Integer value) {
            addCriterion("cycle >", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle >=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThan(Integer value) {
            addCriterion("cycle <", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThanOrEqualTo(Integer value) {
            addCriterion("cycle <=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleIn(List<Integer> values) {
            addCriterion("cycle in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotIn(List<Integer> values) {
            addCriterion("cycle not in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleBetween(Integer value1, Integer value2) {
            addCriterion("cycle between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle not between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIsNull() {
            addCriterion("cycle_unit is null");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIsNotNull() {
            addCriterion("cycle_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCycleUnitEqualTo(Integer value) {
            addCriterion("cycle_unit =", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotEqualTo(Integer value) {
            addCriterion("cycle_unit <>", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitGreaterThan(Integer value) {
            addCriterion("cycle_unit >", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle_unit >=", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitLessThan(Integer value) {
            addCriterion("cycle_unit <", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitLessThanOrEqualTo(Integer value) {
            addCriterion("cycle_unit <=", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIn(List<Integer> values) {
            addCriterion("cycle_unit in", values, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotIn(List<Integer> values) {
            addCriterion("cycle_unit not in", values, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitBetween(Integer value1, Integer value2) {
            addCriterion("cycle_unit between", value1, value2, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle_unit not between", value1, value2, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andFlowIsNull() {
            addCriterion("flow is null");
            return (Criteria) this;
        }

        public Criteria andFlowIsNotNull() {
            addCriterion("flow is not null");
            return (Criteria) this;
        }

        public Criteria andFlowEqualTo(Long value) {
            addCriterion("flow =", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotEqualTo(Long value) {
            addCriterion("flow <>", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowGreaterThan(Long value) {
            addCriterion("flow >", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowGreaterThanOrEqualTo(Long value) {
            addCriterion("flow >=", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowLessThan(Long value) {
            addCriterion("flow <", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowLessThanOrEqualTo(Long value) {
            addCriterion("flow <=", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowIn(List<Long> values) {
            addCriterion("flow in", values, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotIn(List<Long> values) {
            addCriterion("flow not in", values, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowBetween(Long value1, Long value2) {
            addCriterion("flow between", value1, value2, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotBetween(Long value1, Long value2) {
            addCriterion("flow not between", value1, value2, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowUnitIsNull() {
            addCriterion("flow_unit is null");
            return (Criteria) this;
        }

        public Criteria andFlowUnitIsNotNull() {
            addCriterion("flow_unit is not null");
            return (Criteria) this;
        }

        public Criteria andFlowUnitEqualTo(String value) {
            addCriterion("flow_unit =", value, "flowUnit");
            return (Criteria) this;
        }

        public Criteria andFlowUnitNotEqualTo(String value) {
            addCriterion("flow_unit <>", value, "flowUnit");
            return (Criteria) this;
        }

        public Criteria andFlowUnitGreaterThan(String value) {
            addCriterion("flow_unit >", value, "flowUnit");
            return (Criteria) this;
        }

        public Criteria andFlowUnitGreaterThanOrEqualTo(String value) {
            addCriterion("flow_unit >=", value, "flowUnit");
            return (Criteria) this;
        }

        public Criteria andFlowUnitLessThan(String value) {
            addCriterion("flow_unit <", value, "flowUnit");
            return (Criteria) this;
        }

        public Criteria andFlowUnitLessThanOrEqualTo(String value) {
            addCriterion("flow_unit <=", value, "flowUnit");
            return (Criteria) this;
        }

        public Criteria andFlowUnitLike(String value) {
            addCriterion("flow_unit like", value, "flowUnit");
            return (Criteria) this;
        }

        public Criteria andFlowUnitNotLike(String value) {
            addCriterion("flow_unit not like", value, "flowUnit");
            return (Criteria) this;
        }

        public Criteria andFlowUnitIn(List<String> values) {
            addCriterion("flow_unit in", values, "flowUnit");
            return (Criteria) this;
        }

        public Criteria andFlowUnitNotIn(List<String> values) {
            addCriterion("flow_unit not in", values, "flowUnit");
            return (Criteria) this;
        }

        public Criteria andFlowUnitBetween(String value1, String value2) {
            addCriterion("flow_unit between", value1, value2, "flowUnit");
            return (Criteria) this;
        }

        public Criteria andFlowUnitNotBetween(String value1, String value2) {
            addCriterion("flow_unit not between", value1, value2, "flowUnit");
            return (Criteria) this;
        }

        public Criteria andMonthFlagIsNull() {
            addCriterion("month_flag is null");
            return (Criteria) this;
        }

        public Criteria andMonthFlagIsNotNull() {
            addCriterion("month_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMonthFlagEqualTo(Integer value) {
            addCriterion("month_flag =", value, "monthFlag");
            return (Criteria) this;
        }

        public Criteria andMonthFlagNotEqualTo(Integer value) {
            addCriterion("month_flag <>", value, "monthFlag");
            return (Criteria) this;
        }

        public Criteria andMonthFlagGreaterThan(Integer value) {
            addCriterion("month_flag >", value, "monthFlag");
            return (Criteria) this;
        }

        public Criteria andMonthFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_flag >=", value, "monthFlag");
            return (Criteria) this;
        }

        public Criteria andMonthFlagLessThan(Integer value) {
            addCriterion("month_flag <", value, "monthFlag");
            return (Criteria) this;
        }

        public Criteria andMonthFlagLessThanOrEqualTo(Integer value) {
            addCriterion("month_flag <=", value, "monthFlag");
            return (Criteria) this;
        }

        public Criteria andMonthFlagIn(List<Integer> values) {
            addCriterion("month_flag in", values, "monthFlag");
            return (Criteria) this;
        }

        public Criteria andMonthFlagNotIn(List<Integer> values) {
            addCriterion("month_flag not in", values, "monthFlag");
            return (Criteria) this;
        }

        public Criteria andMonthFlagBetween(Integer value1, Integer value2) {
            addCriterion("month_flag between", value1, value2, "monthFlag");
            return (Criteria) this;
        }

        public Criteria andMonthFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("month_flag not between", value1, value2, "monthFlag");
            return (Criteria) this;
        }

        public Criteria andPreFlowIsNull() {
            addCriterion("pre_flow is null");
            return (Criteria) this;
        }

        public Criteria andPreFlowIsNotNull() {
            addCriterion("pre_flow is not null");
            return (Criteria) this;
        }

        public Criteria andPreFlowEqualTo(Long value) {
            addCriterion("pre_flow =", value, "preFlow");
            return (Criteria) this;
        }

        public Criteria andPreFlowNotEqualTo(Long value) {
            addCriterion("pre_flow <>", value, "preFlow");
            return (Criteria) this;
        }

        public Criteria andPreFlowGreaterThan(Long value) {
            addCriterion("pre_flow >", value, "preFlow");
            return (Criteria) this;
        }

        public Criteria andPreFlowGreaterThanOrEqualTo(Long value) {
            addCriterion("pre_flow >=", value, "preFlow");
            return (Criteria) this;
        }

        public Criteria andPreFlowLessThan(Long value) {
            addCriterion("pre_flow <", value, "preFlow");
            return (Criteria) this;
        }

        public Criteria andPreFlowLessThanOrEqualTo(Long value) {
            addCriterion("pre_flow <=", value, "preFlow");
            return (Criteria) this;
        }

        public Criteria andPreFlowIn(List<Long> values) {
            addCriterion("pre_flow in", values, "preFlow");
            return (Criteria) this;
        }

        public Criteria andPreFlowNotIn(List<Long> values) {
            addCriterion("pre_flow not in", values, "preFlow");
            return (Criteria) this;
        }

        public Criteria andPreFlowBetween(Long value1, Long value2) {
            addCriterion("pre_flow between", value1, value2, "preFlow");
            return (Criteria) this;
        }

        public Criteria andPreFlowNotBetween(Long value1, Long value2) {
            addCriterion("pre_flow not between", value1, value2, "preFlow");
            return (Criteria) this;
        }

        public Criteria andPreFlowUnitIsNull() {
            addCriterion("pre_flow_unit is null");
            return (Criteria) this;
        }

        public Criteria andPreFlowUnitIsNotNull() {
            addCriterion("pre_flow_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPreFlowUnitEqualTo(String value) {
            addCriterion("pre_flow_unit =", value, "preFlowUnit");
            return (Criteria) this;
        }

        public Criteria andPreFlowUnitNotEqualTo(String value) {
            addCriterion("pre_flow_unit <>", value, "preFlowUnit");
            return (Criteria) this;
        }

        public Criteria andPreFlowUnitGreaterThan(String value) {
            addCriterion("pre_flow_unit >", value, "preFlowUnit");
            return (Criteria) this;
        }

        public Criteria andPreFlowUnitGreaterThanOrEqualTo(String value) {
            addCriterion("pre_flow_unit >=", value, "preFlowUnit");
            return (Criteria) this;
        }

        public Criteria andPreFlowUnitLessThan(String value) {
            addCriterion("pre_flow_unit <", value, "preFlowUnit");
            return (Criteria) this;
        }

        public Criteria andPreFlowUnitLessThanOrEqualTo(String value) {
            addCriterion("pre_flow_unit <=", value, "preFlowUnit");
            return (Criteria) this;
        }

        public Criteria andPreFlowUnitLike(String value) {
            addCriterion("pre_flow_unit like", value, "preFlowUnit");
            return (Criteria) this;
        }

        public Criteria andPreFlowUnitNotLike(String value) {
            addCriterion("pre_flow_unit not like", value, "preFlowUnit");
            return (Criteria) this;
        }

        public Criteria andPreFlowUnitIn(List<String> values) {
            addCriterion("pre_flow_unit in", values, "preFlowUnit");
            return (Criteria) this;
        }

        public Criteria andPreFlowUnitNotIn(List<String> values) {
            addCriterion("pre_flow_unit not in", values, "preFlowUnit");
            return (Criteria) this;
        }

        public Criteria andPreFlowUnitBetween(String value1, String value2) {
            addCriterion("pre_flow_unit between", value1, value2, "preFlowUnit");
            return (Criteria) this;
        }

        public Criteria andPreFlowUnitNotBetween(String value1, String value2) {
            addCriterion("pre_flow_unit not between", value1, value2, "preFlowUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(Integer value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(Integer value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(Integer value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(Integer value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<Integer> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<Integer> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(Integer value1, Integer value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIsNull() {
            addCriterion("goods_desc is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIsNotNull() {
            addCriterion("goods_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescEqualTo(String value) {
            addCriterion("goods_desc =", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotEqualTo(String value) {
            addCriterion("goods_desc <>", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescGreaterThan(String value) {
            addCriterion("goods_desc >", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescGreaterThanOrEqualTo(String value) {
            addCriterion("goods_desc >=", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLessThan(String value) {
            addCriterion("goods_desc <", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLessThanOrEqualTo(String value) {
            addCriterion("goods_desc <=", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLike(String value) {
            addCriterion("goods_desc like", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotLike(String value) {
            addCriterion("goods_desc not like", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIn(List<String> values) {
            addCriterion("goods_desc in", values, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotIn(List<String> values) {
            addCriterion("goods_desc not in", values, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescBetween(String value1, String value2) {
            addCriterion("goods_desc between", value1, value2, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotBetween(String value1, String value2) {
            addCriterion("goods_desc not between", value1, value2, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIsNull() {
            addCriterion("effective_time is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIsNotNull() {
            addCriterion("effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEqualTo(Date value) {
            addCriterion("effective_time =", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotEqualTo(Date value) {
            addCriterion("effective_time <>", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeGreaterThan(Date value) {
            addCriterion("effective_time >", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("effective_time >=", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLessThan(Date value) {
            addCriterion("effective_time <", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("effective_time <=", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIn(List<Date> values) {
            addCriterion("effective_time in", values, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotIn(List<Date> values) {
            addCriterion("effective_time not in", values, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeBetween(Date value1, Date value2) {
            addCriterion("effective_time between", value1, value2, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("effective_time not between", value1, value2, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeIsNull() {
            addCriterion("failure_time is null");
            return (Criteria) this;
        }

        public Criteria andFailureTimeIsNotNull() {
            addCriterion("failure_time is not null");
            return (Criteria) this;
        }

        public Criteria andFailureTimeEqualTo(Date value) {
            addCriterion("failure_time =", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeNotEqualTo(Date value) {
            addCriterion("failure_time <>", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeGreaterThan(Date value) {
            addCriterion("failure_time >", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("failure_time >=", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeLessThan(Date value) {
            addCriterion("failure_time <", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeLessThanOrEqualTo(Date value) {
            addCriterion("failure_time <=", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeIn(List<Date> values) {
            addCriterion("failure_time in", values, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeNotIn(List<Date> values) {
            addCriterion("failure_time not in", values, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeBetween(Date value1, Date value2) {
            addCriterion("failure_time between", value1, value2, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeNotBetween(Date value1, Date value2) {
            addCriterion("failure_time not between", value1, value2, "failureTime");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIsNull() {
            addCriterion("goods_sort is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIsNotNull() {
            addCriterion("goods_sort is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortEqualTo(Integer value) {
            addCriterion("goods_sort =", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotEqualTo(Integer value) {
            addCriterion("goods_sort <>", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortGreaterThan(Integer value) {
            addCriterion("goods_sort >", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sort >=", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortLessThan(Integer value) {
            addCriterion("goods_sort <", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sort <=", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIn(List<Integer> values) {
            addCriterion("goods_sort in", values, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotIn(List<Integer> values) {
            addCriterion("goods_sort not in", values, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortBetween(Integer value1, Integer value2) {
            addCriterion("goods_sort between", value1, value2, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sort not between", value1, value2, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andCreatedCodeIsNull() {
            addCriterion("created_code is null");
            return (Criteria) this;
        }

        public Criteria andCreatedCodeIsNotNull() {
            addCriterion("created_code is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedCodeEqualTo(String value) {
            addCriterion("created_code =", value, "createdCode");
            return (Criteria) this;
        }

        public Criteria andCreatedCodeNotEqualTo(String value) {
            addCriterion("created_code <>", value, "createdCode");
            return (Criteria) this;
        }

        public Criteria andCreatedCodeGreaterThan(String value) {
            addCriterion("created_code >", value, "createdCode");
            return (Criteria) this;
        }

        public Criteria andCreatedCodeGreaterThanOrEqualTo(String value) {
            addCriterion("created_code >=", value, "createdCode");
            return (Criteria) this;
        }

        public Criteria andCreatedCodeLessThan(String value) {
            addCriterion("created_code <", value, "createdCode");
            return (Criteria) this;
        }

        public Criteria andCreatedCodeLessThanOrEqualTo(String value) {
            addCriterion("created_code <=", value, "createdCode");
            return (Criteria) this;
        }

        public Criteria andCreatedCodeLike(String value) {
            addCriterion("created_code like", value, "createdCode");
            return (Criteria) this;
        }

        public Criteria andCreatedCodeNotLike(String value) {
            addCriterion("created_code not like", value, "createdCode");
            return (Criteria) this;
        }

        public Criteria andCreatedCodeIn(List<String> values) {
            addCriterion("created_code in", values, "createdCode");
            return (Criteria) this;
        }

        public Criteria andCreatedCodeNotIn(List<String> values) {
            addCriterion("created_code not in", values, "createdCode");
            return (Criteria) this;
        }

        public Criteria andCreatedCodeBetween(String value1, String value2) {
            addCriterion("created_code between", value1, value2, "createdCode");
            return (Criteria) this;
        }

        public Criteria andCreatedCodeNotBetween(String value1, String value2) {
            addCriterion("created_code not between", value1, value2, "createdCode");
            return (Criteria) this;
        }

        public Criteria andCreatedNameIsNull() {
            addCriterion("created_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatedNameIsNotNull() {
            addCriterion("created_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedNameEqualTo(String value) {
            addCriterion("created_name =", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameNotEqualTo(String value) {
            addCriterion("created_name <>", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameGreaterThan(String value) {
            addCriterion("created_name >", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameGreaterThanOrEqualTo(String value) {
            addCriterion("created_name >=", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameLessThan(String value) {
            addCriterion("created_name <", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameLessThanOrEqualTo(String value) {
            addCriterion("created_name <=", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameLike(String value) {
            addCriterion("created_name like", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameNotLike(String value) {
            addCriterion("created_name not like", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameIn(List<String> values) {
            addCriterion("created_name in", values, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameNotIn(List<String> values) {
            addCriterion("created_name not in", values, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameBetween(String value1, String value2) {
            addCriterion("created_name between", value1, value2, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameNotBetween(String value1, String value2) {
            addCriterion("created_name not between", value1, value2, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedDtIsNull() {
            addCriterion("created_dt is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDtIsNotNull() {
            addCriterion("created_dt is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDtEqualTo(Date value) {
            addCriterion("created_dt =", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtNotEqualTo(Date value) {
            addCriterion("created_dt <>", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtGreaterThan(Date value) {
            addCriterion("created_dt >", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_dt >=", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtLessThan(Date value) {
            addCriterion("created_dt <", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtLessThanOrEqualTo(Date value) {
            addCriterion("created_dt <=", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtIn(List<Date> values) {
            addCriterion("created_dt in", values, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtNotIn(List<Date> values) {
            addCriterion("created_dt not in", values, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtBetween(Date value1, Date value2) {
            addCriterion("created_dt between", value1, value2, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtNotBetween(Date value1, Date value2) {
            addCriterion("created_dt not between", value1, value2, "createdDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedCodeIsNull() {
            addCriterion("updated_code is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedCodeIsNotNull() {
            addCriterion("updated_code is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedCodeEqualTo(String value) {
            addCriterion("updated_code =", value, "updatedCode");
            return (Criteria) this;
        }

        public Criteria andUpdatedCodeNotEqualTo(String value) {
            addCriterion("updated_code <>", value, "updatedCode");
            return (Criteria) this;
        }

        public Criteria andUpdatedCodeGreaterThan(String value) {
            addCriterion("updated_code >", value, "updatedCode");
            return (Criteria) this;
        }

        public Criteria andUpdatedCodeGreaterThanOrEqualTo(String value) {
            addCriterion("updated_code >=", value, "updatedCode");
            return (Criteria) this;
        }

        public Criteria andUpdatedCodeLessThan(String value) {
            addCriterion("updated_code <", value, "updatedCode");
            return (Criteria) this;
        }

        public Criteria andUpdatedCodeLessThanOrEqualTo(String value) {
            addCriterion("updated_code <=", value, "updatedCode");
            return (Criteria) this;
        }

        public Criteria andUpdatedCodeLike(String value) {
            addCriterion("updated_code like", value, "updatedCode");
            return (Criteria) this;
        }

        public Criteria andUpdatedCodeNotLike(String value) {
            addCriterion("updated_code not like", value, "updatedCode");
            return (Criteria) this;
        }

        public Criteria andUpdatedCodeIn(List<String> values) {
            addCriterion("updated_code in", values, "updatedCode");
            return (Criteria) this;
        }

        public Criteria andUpdatedCodeNotIn(List<String> values) {
            addCriterion("updated_code not in", values, "updatedCode");
            return (Criteria) this;
        }

        public Criteria andUpdatedCodeBetween(String value1, String value2) {
            addCriterion("updated_code between", value1, value2, "updatedCode");
            return (Criteria) this;
        }

        public Criteria andUpdatedCodeNotBetween(String value1, String value2) {
            addCriterion("updated_code not between", value1, value2, "updatedCode");
            return (Criteria) this;
        }

        public Criteria andUpdatedNameIsNull() {
            addCriterion("updated_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedNameIsNotNull() {
            addCriterion("updated_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedNameEqualTo(String value) {
            addCriterion("updated_name =", value, "updatedName");
            return (Criteria) this;
        }

        public Criteria andUpdatedNameNotEqualTo(String value) {
            addCriterion("updated_name <>", value, "updatedName");
            return (Criteria) this;
        }

        public Criteria andUpdatedNameGreaterThan(String value) {
            addCriterion("updated_name >", value, "updatedName");
            return (Criteria) this;
        }

        public Criteria andUpdatedNameGreaterThanOrEqualTo(String value) {
            addCriterion("updated_name >=", value, "updatedName");
            return (Criteria) this;
        }

        public Criteria andUpdatedNameLessThan(String value) {
            addCriterion("updated_name <", value, "updatedName");
            return (Criteria) this;
        }

        public Criteria andUpdatedNameLessThanOrEqualTo(String value) {
            addCriterion("updated_name <=", value, "updatedName");
            return (Criteria) this;
        }

        public Criteria andUpdatedNameLike(String value) {
            addCriterion("updated_name like", value, "updatedName");
            return (Criteria) this;
        }

        public Criteria andUpdatedNameNotLike(String value) {
            addCriterion("updated_name not like", value, "updatedName");
            return (Criteria) this;
        }

        public Criteria andUpdatedNameIn(List<String> values) {
            addCriterion("updated_name in", values, "updatedName");
            return (Criteria) this;
        }

        public Criteria andUpdatedNameNotIn(List<String> values) {
            addCriterion("updated_name not in", values, "updatedName");
            return (Criteria) this;
        }

        public Criteria andUpdatedNameBetween(String value1, String value2) {
            addCriterion("updated_name between", value1, value2, "updatedName");
            return (Criteria) this;
        }

        public Criteria andUpdatedNameNotBetween(String value1, String value2) {
            addCriterion("updated_name not between", value1, value2, "updatedName");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtIsNull() {
            addCriterion("updated_dt is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtIsNotNull() {
            addCriterion("updated_dt is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtEqualTo(Date value) {
            addCriterion("updated_dt =", value, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtNotEqualTo(Date value) {
            addCriterion("updated_dt <>", value, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtGreaterThan(Date value) {
            addCriterion("updated_dt >", value, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_dt >=", value, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtLessThan(Date value) {
            addCriterion("updated_dt <", value, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtLessThanOrEqualTo(Date value) {
            addCriterion("updated_dt <=", value, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtIn(List<Date> values) {
            addCriterion("updated_dt in", values, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtNotIn(List<Date> values) {
            addCriterion("updated_dt not in", values, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtBetween(Date value1, Date value2) {
            addCriterion("updated_dt between", value1, value2, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtNotBetween(Date value1, Date value2) {
            addCriterion("updated_dt not between", value1, value2, "updatedDt");
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