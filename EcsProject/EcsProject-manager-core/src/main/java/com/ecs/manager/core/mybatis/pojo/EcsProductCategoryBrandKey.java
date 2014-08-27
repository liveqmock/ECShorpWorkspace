package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsProductCategoryBrandKey extends BaseObject implements Serializable {
    private Long productCategories;

    private Long brands;

    private static final long serialVersionUID = 1L;

    public Long getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(Long productCategories) {
        this.productCategories = productCategories;
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
        EcsProductCategoryBrandKey other = (EcsProductCategoryBrandKey) that;
        return (this.getProductCategories() == null ? other.getProductCategories() == null : this.getProductCategories().equals(other.getProductCategories()))
            && (this.getBrands() == null ? other.getBrands() == null : this.getBrands().equals(other.getBrands()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductCategories() == null) ? 0 : getProductCategories().hashCode());
        result = prime * result + ((getBrands() == null) ? 0 : getBrands().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productCategories=").append(productCategories);
        sb.append(", brands=").append(brands);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}