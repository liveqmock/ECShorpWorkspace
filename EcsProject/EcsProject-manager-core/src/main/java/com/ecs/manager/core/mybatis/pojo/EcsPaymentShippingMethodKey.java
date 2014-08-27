package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsPaymentShippingMethodKey extends BaseObject implements Serializable {
    private Long paymentMethods;

    private Long shippingMethods;

    private static final long serialVersionUID = 1L;

    public Long getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(Long paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public Long getShippingMethods() {
        return shippingMethods;
    }

    public void setShippingMethods(Long shippingMethods) {
        this.shippingMethods = shippingMethods;
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
        EcsPaymentShippingMethodKey other = (EcsPaymentShippingMethodKey) that;
        return (this.getPaymentMethods() == null ? other.getPaymentMethods() == null : this.getPaymentMethods().equals(other.getPaymentMethods()))
            && (this.getShippingMethods() == null ? other.getShippingMethods() == null : this.getShippingMethods().equals(other.getShippingMethods()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPaymentMethods() == null) ? 0 : getPaymentMethods().hashCode());
        result = prime * result + ((getShippingMethods() == null) ? 0 : getShippingMethods().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paymentMethods=").append(paymentMethods);
        sb.append(", shippingMethods=").append(shippingMethods);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}