package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsProductSpecificationValueKey extends BaseObject implements Serializable {
    private Long products;

    private Long specificationValues;

    private static final long serialVersionUID = 1L;

    public Long getProducts() {
        return products;
    }

    public void setProducts(Long products) {
        this.products = products;
    }

    public Long getSpecificationValues() {
        return specificationValues;
    }

    public void setSpecificationValues(Long specificationValues) {
        this.specificationValues = specificationValues;
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
        EcsProductSpecificationValueKey other = (EcsProductSpecificationValueKey) that;
        return (this.getProducts() == null ? other.getProducts() == null : this.getProducts().equals(other.getProducts()))
            && (this.getSpecificationValues() == null ? other.getSpecificationValues() == null : this.getSpecificationValues().equals(other.getSpecificationValues()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProducts() == null) ? 0 : getProducts().hashCode());
        result = prime * result + ((getSpecificationValues() == null) ? 0 : getSpecificationValues().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", products=").append(products);
        sb.append(", specificationValues=").append(specificationValues);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}