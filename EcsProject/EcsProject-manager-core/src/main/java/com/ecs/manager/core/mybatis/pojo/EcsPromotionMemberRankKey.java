package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsPromotionMemberRankKey extends BaseObject implements Serializable {
    private Long promotions;

    private Long memberRanks;

    private static final long serialVersionUID = 1L;

    public Long getPromotions() {
        return promotions;
    }

    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    public Long getMemberRanks() {
        return memberRanks;
    }

    public void setMemberRanks(Long memberRanks) {
        this.memberRanks = memberRanks;
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
        EcsPromotionMemberRankKey other = (EcsPromotionMemberRankKey) that;
        return (this.getPromotions() == null ? other.getPromotions() == null : this.getPromotions().equals(other.getPromotions()))
            && (this.getMemberRanks() == null ? other.getMemberRanks() == null : this.getMemberRanks().equals(other.getMemberRanks()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPromotions() == null) ? 0 : getPromotions().hashCode());
        result = prime * result + ((getMemberRanks() == null) ? 0 : getMemberRanks().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", promotions=").append(promotions);
        sb.append(", memberRanks=").append(memberRanks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}