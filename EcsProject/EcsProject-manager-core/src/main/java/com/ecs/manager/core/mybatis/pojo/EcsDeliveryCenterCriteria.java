package com.ecs.manager.core.mybatis.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EcsDeliveryCenterCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public EcsDeliveryCenterCriteria() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Boolean value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Boolean value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Boolean value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Boolean value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Boolean> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Boolean> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
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

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("zip_code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("zip_code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("zip_code not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Long value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Long value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Long value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Long value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Long value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Long> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Long> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Long value1, Long value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Long value1, Long value2) {
            addCriterion("area not between", value1, value2, "area");
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