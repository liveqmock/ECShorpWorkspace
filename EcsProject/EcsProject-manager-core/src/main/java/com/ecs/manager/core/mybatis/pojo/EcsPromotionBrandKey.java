package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsPromotionBrandKey extends BaseObject implements Serializable {
    private Long promotions;

    private Long brands;

    private static final long serialVersionUID = 1L;

    public Long getPromotions() {
        return promotions;
    }

    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    public Long getBrands() {
        return brands;
    }

    public void setBrands(Long brands) {
        this.brands = brands;
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
        EcsPromotionBrandKey other = (EcsPromotionBrandKey) that;
        return (this.getPromotions() == null ? other.getPromotions() == null : this.getPromotions().equals(other.getPromotions()))
            && (this.getBrands() == null ? other.getBrands() == null : this.getBrands().equals(other.getBrands()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPromotions() == null) ? 0 : getPromotions().hashCode());
        result = prime * result + ((getBrands() == null) ? 0 : getBrands().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", promotions=").append(promotions);
        sb.append(", brands=").append(brands);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}