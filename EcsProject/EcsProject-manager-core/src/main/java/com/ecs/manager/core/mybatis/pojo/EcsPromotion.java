package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EcsPromotion extends BaseObject implements Serializable {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Integer orders;

    private Date beginDate;

    private Date endDate;

    private BigDecimal endPrice;

    private Boolean isCouponAllowed;

    private Boolean isFreeShipping;

    private String name;

    private Integer pointOperator;

    private BigDecimal pointValue;

    private Integer priceOperator;

    private BigDecimal priceValue;

    private BigDecimal startPrice;

    private String title;

    private String introduction;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(BigDecimal endPrice) {
        this.endPrice = endPrice;
    }

    public Boolean getIsCouponAllowed() {
        return isCouponAllowed;
    }

    public void setIsCouponAllowed(Boolean isCouponAllowed) {
        this.isCouponAllowed = isCouponAllowed;
    }

    public Boolean getIsFreeShipping() {
        return isFreeShipping;
    }

    public void setIsFreeShipping(Boolean isFreeShipping) {
        this.isFreeShipping = isFreeShipping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPointOperator() {
        return pointOperator;
    }

    public void setPointOperator(Integer pointOperator) {
        this.pointOperator = pointOperator;
    }

    public BigDecimal getPointValue() {
        return pointValue;
    }

    public void setPointValue(BigDecimal pointValue) {
        this.pointValue = pointValue;
    }

    public Integer getPriceOperator() {
        return priceOperator;
    }

    public void setPriceOperator(Integer priceOperator) {
        this.priceOperator = priceOperator;
    }

    public BigDecimal getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(BigDecimal priceValue) {
        this.priceValue = priceValue;
    }

    public BigDecimal getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(BigDecimal startPrice) {
        this.startPrice = startPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EcsPromotion other = (EcsPromotion) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()))
            && (this.getBeginDate() == null ? other.getBeginDate() == null : this.getBeginDate().equals(other.getBeginDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getEndPrice() == null ? other.getEndPrice() == null : this.getEndPrice().equals(other.getEndPrice()))
            && (this.getIsCouponAllowed() == null ? other.getIsCouponAllowed() == null : this.getIsCouponAllowed().equals(other.getIsCouponAllowed()))
            && (this.getIsFreeShipping() == null ? other.getIsFreeShipping() == null : this.getIsFreeShipping().equals(other.getIsFreeShipping()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPointOperator() == null ? other.getPointOperator() == null : this.getPointOperator().equals(other.getPointOperator()))
            && (this.getPointValue() == null ? other.getPointValue() == null : this.getPointValue().equals(other.getPointValue()))
            && (this.getPriceOperator() == null ? other.getPriceOperator() == null : this.getPriceOperator().equals(other.getPriceOperator()))
            && (this.getPriceValue() == null ? other.getPriceValue() == null : this.getPriceValue().equals(other.getPriceValue()))
            && (this.getStartPrice() == null ? other.getStartPrice() == null : this.getStartPrice().equals(other.getStartPrice()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        result = prime * result + ((getBeginDate() == null) ? 0 : getBeginDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getEndPrice() == null) ? 0 : getEndPrice().hashCode());
        result = prime * result + ((getIsCouponAllowed() == null) ? 0 : getIsCouponAllowed().hashCode());
        result = prime * result + ((getIsFreeShipping() == null) ? 0 : getIsFreeShipping().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPointOperator() == null) ? 0 : getPointOperator().hashCode());
        result = prime * result + ((getPointValue() == null) ? 0 : getPointValue().hashCode());
        result = prime * result + ((getPriceOperator() == null) ? 0 : getPriceOperator().hashCode());
        result = prime * result + ((getPriceValue() == null) ? 0 : getPriceValue().hashCode());
        result = prime * result + ((getStartPrice() == null) ? 0 : getStartPrice().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createDate=").append(createDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", orders=").append(orders);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", endPrice=").append(endPrice);
        sb.append(", isCouponAllowed=").append(isCouponAllowed);
        sb.append(", isFreeShipping=").append(isFreeShipping);
        sb.append(", name=").append(name);
        sb.append(", pointOperator=").append(pointOperator);
        sb.append(", pointValue=").append(pointValue);
        sb.append(", priceOperator=").append(priceOperator);
        sb.append(", priceValue=").append(priceValue);
        sb.append(", startPrice=").append(startPrice);
        sb.append(", title=").append(title);
        sb.append(", introduction=").append(introduction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}