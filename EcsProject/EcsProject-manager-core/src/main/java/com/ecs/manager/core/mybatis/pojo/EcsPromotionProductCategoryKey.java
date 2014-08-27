package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsPromotionProductCategoryKey extends BaseObject implements Serializable {
    private Long promotions;

    private Long productCategories;

    private static final long serialVersionUID = 1L;

    public Long getPromotions() {
        return promotions;
    }

    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    public Long getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(Long productCategories) {
        this.productCategories = productCategories;
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
        EcsPromotionProductCategoryKey other = (EcsPromotionProductCategoryKey) that;
        return (this.getPromotions() == null ? other.getPromotions() == null : this.getPromotions().equals(other.getPromotions()))
            && (this.getProductCategories() == null ? other.getProductCategories() == null : this.getProductCategories().equals(other.getProductCategories()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPromotions() == null) ? 0 : getPromotions().hashCode());
        result = prime * result + ((getProductCategories() == null) ? 0 : getProductCategories().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", promotions=").append(promotions);
        sb.append(", productCategories=").append(productCategories);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}