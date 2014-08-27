package com.ecs.manager.core.mybatis.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class EcsProductMemberPrice extends EcsProductMemberPriceKey implements Serializable {
    private BigDecimal memberPrice;

    private static final long serialVersionUID = 1L;

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
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
        EcsProductMemberPrice other = (EcsProductMemberPrice) that;
        return (this.getProduct() == null ? other.getProduct() == null : this.getProduct().equals(other.getProduct()))
            && (this.getMemberPriceKey() == null ? other.getMemberPriceKey() == null : this.getMemberPriceKey().equals(other.getMemberPriceKey()))
            && (this.getMemberPrice() == null ? other.getMemberPrice() == null : this.getMemberPrice().equals(other.getMemberPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProduct() == null) ? 0 : getProduct().hashCode());
        result = prime * result + ((getMemberPriceKey() == null) ? 0 : getMemberPriceKey().hashCode());
        result = prime * result + ((getMemberPrice() == null) ? 0 : getMemberPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", memberPrice=").append(memberPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}