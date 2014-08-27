package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsProductParameterValueKey extends BaseObject implements Serializable {
    private Long product;

    private Long parameterValueKey;

    private static final long serialVersionUID = 1L;

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    public Long getParameterValueKey() {
        return parameterValueKey;
    }

    public void setParameterValueKey(Long parameterValueKey) {
        this.parameterValueKey = parameterValueKey;
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
        EcsProductParameterValueKey other = (EcsProductParameterValueKey) that;
        return (this.getProduct() == null ? other.getProduct() == null : this.getProduct().equals(other.getProduct()))
            && (this.getParameterValueKey() == null ? other.getParameterValueKey() == null : this.getParameterValueKey().equals(other.getParameterValueKey()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProduct() == null) ? 0 : getProduct().hashCode());
        result = prime * result + ((getParameterValueKey() == null) ? 0 : getParameterValueKey().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", product=").append(product);
        sb.append(", parameterValueKey=").append(parameterValueKey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}