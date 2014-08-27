package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsOrderCoupon extends BaseObject implements Serializable {
    private Long orders;

    private Long coupons;

    private static final long serialVersionUID = 1L;

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getCoupons() {
        return coupons;
    }

    public void setCoupons(Long coupons) {
        this.coupons = coupons;
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
        EcsOrderCoupon other = (EcsOrderCoupon) that;
        return (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()))
            && (this.getCoupons() == null ? other.getCoupons() == null : this.getCoupons().equals(other.getCoupons()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        result = prime * result + ((getCoupons() == null) ? 0 : getCoupons().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orders=").append(orders);
        sb.append(", coupons=").append(coupons);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}