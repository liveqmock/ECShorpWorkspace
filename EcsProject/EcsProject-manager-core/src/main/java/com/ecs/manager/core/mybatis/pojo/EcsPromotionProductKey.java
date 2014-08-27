package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsPromotionProductKey extends BaseObject implements Serializable {
    private Long promotions;

    private Long products;

    private static final long serialVersionUID = 1L;

    public Long getPromotions() {
        return promotions;
    }

    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    public Long getProducts() {
        return products;
    }

    public void setProducts(Long products) {
        this.products = products;
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
        EcsPromotionProductKey other = (EcsPromotionProductKey) that;
        return (this.getPromotions() == null ? other.getPromotions() == null : this.getPromotions().equals(other.getPromotions()))
            && (this.getProducts() == null ? other.getProducts() == null : this.getProducts().equals(other.getProducts()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPromotions() == null) ? 0 : getPromotions().hashCode());
        result = prime * result + ((getProducts() == null) ? 0 : getProducts().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", promotions=").append(promotions);
        sb.append(", products=").append(products);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}