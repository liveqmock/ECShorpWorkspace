package com.ecs.manager.core.mybatis.pojo;

import java.io.Serializable;

public class EcsProductParameterValue extends EcsProductParameterValueKey implements Serializable {
    private String parameterValue;

    private static final long serialVersionUID = 1L;

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
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
        EcsProductParameterValue other = (EcsProductParameterValue) that;
        return (this.getProduct() == null ? other.getProduct() == null : this.getProduct().equals(other.getProduct()))
            && (this.getParameterValueKey() == null ? other.getParameterValueKey() == null : this.getParameterValueKey().equals(other.getParameterValueKey()))
            && (this.getParameterValue() == null ? other.getParameterValue() == null : this.getParameterValue().equals(other.getParameterValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProduct() == null) ? 0 : getProduct().hashCode());
        result = prime * result + ((getParameterValueKey() == null) ? 0 : getParameterValueKey().hashCode());
        result = prime * result + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", parameterValue=").append(parameterValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}