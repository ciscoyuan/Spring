package com.finals.bank.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankIcbcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BankIcbcExample() {
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

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Long value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Long value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Long value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Long value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Long value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Long> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Long> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Long value1, Long value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Long value1, Long value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNull() {
            addCriterion("bank_card is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNotNull() {
            addCriterion("bank_card is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardEqualTo(String value) {
            addCriterion("bank_card =", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotEqualTo(String value) {
            addCriterion("bank_card <>", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThan(String value) {
            addCriterion("bank_card >", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card >=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThan(String value) {
            addCriterion("bank_card <", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThanOrEqualTo(String value) {
            addCriterion("bank_card <=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLike(String value) {
            addCriterion("bank_card like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotLike(String value) {
            addCriterion("bank_card not like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardIn(List<String> values) {
            addCriterion("bank_card in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotIn(List<String> values) {
            addCriterion("bank_card not in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardBetween(String value1, String value2) {
            addCriterion("bank_card between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotBetween(String value1, String value2) {
            addCriterion("bank_card not between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andAccreditNameIsNull() {
            addCriterion("accredit_name is null");
            return (Criteria) this;
        }

        public Criteria andAccreditNameIsNotNull() {
            addCriterion("accredit_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditNameEqualTo(String value) {
            addCriterion("accredit_name =", value, "accreditName");
            return (Criteria) this;
        }

        public Criteria andAccreditNameNotEqualTo(String value) {
            addCriterion("accredit_name <>", value, "accreditName");
            return (Criteria) this;
        }

        public Criteria andAccreditNameGreaterThan(String value) {
            addCriterion("accredit_name >", value, "accreditName");
            return (Criteria) this;
        }

        public Criteria andAccreditNameGreaterThanOrEqualTo(String value) {
            addCriterion("accredit_name >=", value, "accreditName");
            return (Criteria) this;
        }

        public Criteria andAccreditNameLessThan(String value) {
            addCriterion("accredit_name <", value, "accreditName");
            return (Criteria) this;
        }

        public Criteria andAccreditNameLessThanOrEqualTo(String value) {
            addCriterion("accredit_name <=", value, "accreditName");
            return (Criteria) this;
        }

        public Criteria andAccreditNameLike(String value) {
            addCriterion("accredit_name like", value, "accreditName");
            return (Criteria) this;
        }

        public Criteria andAccreditNameNotLike(String value) {
            addCriterion("accredit_name not like", value, "accreditName");
            return (Criteria) this;
        }

        public Criteria andAccreditNameIn(List<String> values) {
            addCriterion("accredit_name in", values, "accreditName");
            return (Criteria) this;
        }

        public Criteria andAccreditNameNotIn(List<String> values) {
            addCriterion("accredit_name not in", values, "accreditName");
            return (Criteria) this;
        }

        public Criteria andAccreditNameBetween(String value1, String value2) {
            addCriterion("accredit_name between", value1, value2, "accreditName");
            return (Criteria) this;
        }

        public Criteria andAccreditNameNotBetween(String value1, String value2) {
            addCriterion("accredit_name not between", value1, value2, "accreditName");
            return (Criteria) this;
        }

        public Criteria andAccreditCardTypeIsNull() {
            addCriterion("accredit_card_type is null");
            return (Criteria) this;
        }

        public Criteria andAccreditCardTypeIsNotNull() {
            addCriterion("accredit_card_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditCardTypeEqualTo(Integer value) {
            addCriterion("accredit_card_type =", value, "accreditCardType");
            return (Criteria) this;
        }

        public Criteria andAccreditCardTypeNotEqualTo(Integer value) {
            addCriterion("accredit_card_type <>", value, "accreditCardType");
            return (Criteria) this;
        }

        public Criteria andAccreditCardTypeGreaterThan(Integer value) {
            addCriterion("accredit_card_type >", value, "accreditCardType");
            return (Criteria) this;
        }

        public Criteria andAccreditCardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("accredit_card_type >=", value, "accreditCardType");
            return (Criteria) this;
        }

        public Criteria andAccreditCardTypeLessThan(Integer value) {
            addCriterion("accredit_card_type <", value, "accreditCardType");
            return (Criteria) this;
        }

        public Criteria andAccreditCardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("accredit_card_type <=", value, "accreditCardType");
            return (Criteria) this;
        }

        public Criteria andAccreditCardTypeIn(List<Integer> values) {
            addCriterion("accredit_card_type in", values, "accreditCardType");
            return (Criteria) this;
        }

        public Criteria andAccreditCardTypeNotIn(List<Integer> values) {
            addCriterion("accredit_card_type not in", values, "accreditCardType");
            return (Criteria) this;
        }

        public Criteria andAccreditCardTypeBetween(Integer value1, Integer value2) {
            addCriterion("accredit_card_type between", value1, value2, "accreditCardType");
            return (Criteria) this;
        }

        public Criteria andAccreditCardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("accredit_card_type not between", value1, value2, "accreditCardType");
            return (Criteria) this;
        }

        public Criteria andAccreditCardNumberIsNull() {
            addCriterion("accredit_card_number is null");
            return (Criteria) this;
        }

        public Criteria andAccreditCardNumberIsNotNull() {
            addCriterion("accredit_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditCardNumberEqualTo(String value) {
            addCriterion("accredit_card_number =", value, "accreditCardNumber");
            return (Criteria) this;
        }

        public Criteria andAccreditCardNumberNotEqualTo(String value) {
            addCriterion("accredit_card_number <>", value, "accreditCardNumber");
            return (Criteria) this;
        }

        public Criteria andAccreditCardNumberGreaterThan(String value) {
            addCriterion("accredit_card_number >", value, "accreditCardNumber");
            return (Criteria) this;
        }

        public Criteria andAccreditCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("accredit_card_number >=", value, "accreditCardNumber");
            return (Criteria) this;
        }

        public Criteria andAccreditCardNumberLessThan(String value) {
            addCriterion("accredit_card_number <", value, "accreditCardNumber");
            return (Criteria) this;
        }

        public Criteria andAccreditCardNumberLessThanOrEqualTo(String value) {
            addCriterion("accredit_card_number <=", value, "accreditCardNumber");
            return (Criteria) this;
        }

        public Criteria andAccreditCardNumberLike(String value) {
            addCriterion("accredit_card_number like", value, "accreditCardNumber");
            return (Criteria) this;
        }

        public Criteria andAccreditCardNumberNotLike(String value) {
            addCriterion("accredit_card_number not like", value, "accreditCardNumber");
            return (Criteria) this;
        }

        public Criteria andAccreditCardNumberIn(List<String> values) {
            addCriterion("accredit_card_number in", values, "accreditCardNumber");
            return (Criteria) this;
        }

        public Criteria andAccreditCardNumberNotIn(List<String> values) {
            addCriterion("accredit_card_number not in", values, "accreditCardNumber");
            return (Criteria) this;
        }

        public Criteria andAccreditCardNumberBetween(String value1, String value2) {
            addCriterion("accredit_card_number between", value1, value2, "accreditCardNumber");
            return (Criteria) this;
        }

        public Criteria andAccreditCardNumberNotBetween(String value1, String value2) {
            addCriterion("accredit_card_number not between", value1, value2, "accreditCardNumber");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(Long value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(Long value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(Long value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(Long value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(Long value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(Long value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<Long> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<Long> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(Long value1, Long value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(Long value1, Long value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateCodeIsNull() {
            addCriterion("create_code is null");
            return (Criteria) this;
        }

        public Criteria andCreateCodeIsNotNull() {
            addCriterion("create_code is not null");
            return (Criteria) this;
        }

        public Criteria andCreateCodeEqualTo(String value) {
            addCriterion("create_code =", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeNotEqualTo(String value) {
            addCriterion("create_code <>", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeGreaterThan(String value) {
            addCriterion("create_code >", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("create_code >=", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeLessThan(String value) {
            addCriterion("create_code <", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeLessThanOrEqualTo(String value) {
            addCriterion("create_code <=", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeLike(String value) {
            addCriterion("create_code like", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeNotLike(String value) {
            addCriterion("create_code not like", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeIn(List<String> values) {
            addCriterion("create_code in", values, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeNotIn(List<String> values) {
            addCriterion("create_code not in", values, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeBetween(String value1, String value2) {
            addCriterion("create_code between", value1, value2, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeNotBetween(String value1, String value2) {
            addCriterion("create_code not between", value1, value2, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNull() {
            addCriterion("update_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNotNull() {
            addCriterion("update_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameEqualTo(String value) {
            addCriterion("update_name =", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotEqualTo(String value) {
            addCriterion("update_name <>", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThan(String value) {
            addCriterion("update_name >", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_name >=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThan(String value) {
            addCriterion("update_name <", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThanOrEqualTo(String value) {
            addCriterion("update_name <=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLike(String value) {
            addCriterion("update_name like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotLike(String value) {
            addCriterion("update_name not like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIn(List<String> values) {
            addCriterion("update_name in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotIn(List<String> values) {
            addCriterion("update_name not in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameBetween(String value1, String value2) {
            addCriterion("update_name between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotBetween(String value1, String value2) {
            addCriterion("update_name not between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateCodeIsNull() {
            addCriterion("update_code is null");
            return (Criteria) this;
        }

        public Criteria andUpdateCodeIsNotNull() {
            addCriterion("update_code is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateCodeEqualTo(String value) {
            addCriterion("update_code =", value, "updateCode");
            return (Criteria) this;
        }

        public Criteria andUpdateCodeNotEqualTo(String value) {
            addCriterion("update_code <>", value, "updateCode");
            return (Criteria) this;
        }

        public Criteria andUpdateCodeGreaterThan(String value) {
            addCriterion("update_code >", value, "updateCode");
            return (Criteria) this;
        }

        public Criteria andUpdateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("update_code >=", value, "updateCode");
            return (Criteria) this;
        }

        public Criteria andUpdateCodeLessThan(String value) {
            addCriterion("update_code <", value, "updateCode");
            return (Criteria) this;
        }

        public Criteria andUpdateCodeLessThanOrEqualTo(String value) {
            addCriterion("update_code <=", value, "updateCode");
            return (Criteria) this;
        }

        public Criteria andUpdateCodeLike(String value) {
            addCriterion("update_code like", value, "updateCode");
            return (Criteria) this;
        }

        public Criteria andUpdateCodeNotLike(String value) {
            addCriterion("update_code not like", value, "updateCode");
            return (Criteria) this;
        }

        public Criteria andUpdateCodeIn(List<String> values) {
            addCriterion("update_code in", values, "updateCode");
            return (Criteria) this;
        }

        public Criteria andUpdateCodeNotIn(List<String> values) {
            addCriterion("update_code not in", values, "updateCode");
            return (Criteria) this;
        }

        public Criteria andUpdateCodeBetween(String value1, String value2) {
            addCriterion("update_code between", value1, value2, "updateCode");
            return (Criteria) this;
        }

        public Criteria andUpdateCodeNotBetween(String value1, String value2) {
            addCriterion("update_code not between", value1, value2, "updateCode");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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