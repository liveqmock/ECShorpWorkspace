package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsProductMemberPriceKey extends BaseObject implements Serializable {
    private Long product;

    private Long memberPriceKey;

    private static final long serialVersionUID = 1L;

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    public Long getMemberPriceKey() {
        return memberPriceKey;
    }

    public void setMemberPriceKey(Long memberPriceKey) {
        this.memberPriceKey = memberPriceKey;
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
        EcsProductMemberPriceKey other = (EcsProductMemberPriceKey) that;
        return (this.getProduct() == null ? other.getProduct() == null : this.getProduct().equals(other.getProduct()))
            && (this.getMemberPriceKey() == null ? other.getMemberPriceKey() == null : this.getMemberPriceKey().equals(other.getMemberPriceKey()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProduct() == null) ? 0 : getProduct().hashCode());
        result = prime * result + ((getMemberPriceKey() == null) ? 0 : getMemberPriceKey().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", product=").append(product);
        sb.append(", memberPriceKey=").append(memberPriceKey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}