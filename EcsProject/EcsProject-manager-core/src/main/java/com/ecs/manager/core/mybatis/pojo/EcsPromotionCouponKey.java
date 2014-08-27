package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsPromotionCouponKey extends BaseObject implements Serializable {
    private Long promotions;

    private Long coupons;

    private static final long serialVersionUID = 1L;

    public Long getPromotions() {
        return promotions;
    }

    public void setPromotions(Long promotions) {
        this.promotions = promotions;
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
        EcsPromotionCouponKey other = (EcsPromotionCouponKey) that;
        return (this.getPromotions() == null ? other.getPromotions() == null : this.getPromotions().equals(other.getPromotions()))
            && (this.getCoupons() == null ? other.getCoupons() == null : this.getCoupons().equals(other.getCoupons()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPromotions() == null) ? 0 : getPromotions().hashCode());
        result = prime * result + ((getCoupons() == null) ? 0 : getCoupons().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", promotions=").append(promotions);
        sb.append(", coupons=").append(coupons);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}