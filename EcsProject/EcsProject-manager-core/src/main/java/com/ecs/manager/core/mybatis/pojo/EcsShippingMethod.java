package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EcsShippingMethod extends BaseObject implements Serializable {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Integer orders;

    private BigDecimal continuePrice;

    private Integer continueWeight;

    private BigDecimal firstPrice;

    private Integer firstWeight;

    private String icon;

    private String name;

    private Long defaultDeliveryCorp;

    private String description;

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

    public BigDecimal getContinuePrice() {
        return continuePrice;
    }

    public void setContinuePrice(BigDecimal continuePrice) {
        this.continuePrice = continuePrice;
    }

    public Integer getContinueWeight() {
        return continueWeight;
    }

    public void setContinueWeight(Integer continueWeight) {
        this.continueWeight = continueWeight;
    }

    public BigDecimal getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(BigDecimal firstPrice) {
        this.firstPrice = firstPrice;
    }

    public Integer getFirstWeight() {
        return firstWeight;
    }

    public void setFirstWeight(Integer firstWeight) {
        this.firstWeight = firstWeight;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDefaultDeliveryCorp() {
        return defaultDeliveryCorp;
    }

    public void setDefaultDeliveryCorp(Long defaultDeliveryCorp) {
        this.defaultDeliveryCorp = defaultDeliveryCorp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        EcsShippingMethod other = (EcsShippingMethod) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()))
            && (this.getContinuePrice() == null ? other.getContinuePrice() == null : this.getContinuePrice().equals(other.getContinuePrice()))
            && (this.getContinueWeight() == null ? other.getContinueWeight() == null : this.getContinueWeight().equals(other.getContinueWeight()))
            && (this.getFirstPrice() == null ? other.getFirstPrice() == null : this.getFirstPrice().equals(other.getFirstPrice()))
            && (this.getFirstWeight() == null ? other.getFirstWeight() == null : this.getFirstWeight().equals(other.getFirstWeight()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDefaultDeliveryCorp() == null ? other.getDefaultDeliveryCorp() == null : this.getDefaultDeliveryCorp().equals(other.getDefaultDeliveryCorp()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        result = prime * result + ((getContinuePrice() == null) ? 0 : getContinuePrice().hashCode());
        result = prime * result + ((getContinueWeight() == null) ? 0 : getContinueWeight().hashCode());
        result = prime * result + ((getFirstPrice() == null) ? 0 : getFirstPrice().hashCode());
        result = prime * result + ((getFirstWeight() == null) ? 0 : getFirstWeight().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDefaultDeliveryCorp() == null) ? 0 : getDefaultDeliveryCorp().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
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
        sb.append(", continuePrice=").append(continuePrice);
        sb.append(", continueWeight=").append(continueWeight);
        sb.append(", firstPrice=").append(firstPrice);
        sb.append(", firstWeight=").append(firstWeight);
        sb.append(", icon=").append(icon);
        sb.append(", name=").append(name);
        sb.append(", defaultDeliveryCorp=").append(defaultDeliveryCorp);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}