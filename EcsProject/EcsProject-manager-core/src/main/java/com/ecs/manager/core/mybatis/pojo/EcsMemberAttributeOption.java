package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsMemberAttributeOption extends BaseObject implements Serializable {
    private Long memberAttribute;

    private String options;

    private static final long serialVersionUID = 1L;

    public Long getMemberAttribute() {
        return memberAttribute;
    }

    public void setMemberAttribute(Long memberAttribute) {
        this.memberAttribute = memberAttribute;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
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
        EcsMemberAttributeOption other = (EcsMemberAttributeOption) that;
        return (this.getMemberAttribute() == null ? other.getMemberAttribute() == null : this.getMemberAttribute().equals(other.getMemberAttribute()))
            && (this.getOptions() == null ? other.getOptions() == null : this.getOptions().equals(other.getOptions()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberAttribute() == null) ? 0 : getMemberAttribute().hashCode());
        result = prime * result + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", memberAttribute=").append(memberAttribute);
        sb.append(", options=").append(options);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}