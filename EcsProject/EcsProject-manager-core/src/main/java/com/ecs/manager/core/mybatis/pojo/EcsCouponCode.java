package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;
import java.util.Date;

public class EcsCouponCode extends BaseObject implements Serializable {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String code;

    private Boolean isUsed;

    private Date usedDate;

    private Long coupon;

    private Long member;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    public Date getUsedDate() {
        return usedDate;
    }

    public void setUsedDate(Date usedDate) {
        this.usedDate = usedDate;
    }

    public Long getCoupon() {
        return coupon;
    }

    public void setCoupon(Long coupon) {
        this.coupon = coupon;
    }

    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
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
        EcsCouponCode other = (EcsCouponCode) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getIsUsed() == null ? other.getIsUsed() == null : this.getIsUsed().equals(other.getIsUsed()))
            && (this.getUsedDate() == null ? other.getUsedDate() == null : this.getUsedDate().equals(other.getUsedDate()))
            && (this.getCoupon() == null ? other.getCoupon() == null : this.getCoupon().equals(other.getCoupon()))
            && (this.getMember() == null ? other.getMember() == null : this.getMember().equals(other.getMember()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getIsUsed() == null) ? 0 : getIsUsed().hashCode());
        result = prime * result + ((getUsedDate() == null) ? 0 : getUsedDate().hashCode());
        result = prime * result + ((getCoupon() == null) ? 0 : getCoupon().hashCode());
        result = prime * result + ((getMember() == null) ? 0 : getMember().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createDate=").append(createDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", code=").append(code);
        sb.append(", isUsed=").append(isUsed);
        sb.append(", usedDate=").append(usedDate);
        sb.append(", coupon=").append(coupon);
        sb.append(", member=").append(member);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}