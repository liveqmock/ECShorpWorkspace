package com.ecs.manager.core.mybatis.pojo;

import java.io.Serializable;

public class EcsPluginConfigAttribute extends EcsPluginConfigAttributeKey implements Serializable {
    private String attributes;

    private static final long serialVersionUID = 1L;

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
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
        EcsPluginConfigAttribute other = (EcsPluginConfigAttribute) that;
        return (this.getPluginConfig() == null ? other.getPluginConfig() == null : this.getPluginConfig().equals(other.getPluginConfig()))
            && (this.getAttributesKey() == null ? other.getAttributesKey() == null : this.getAttributesKey().equals(other.getAttributesKey()))
            && (this.getAttributes() == null ? other.getAttributes() == null : this.getAttributes().equals(other.getAttributes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPluginConfig() == null) ? 0 : getPluginConfig().hashCode());
        result = prime * result + ((getAttributesKey() == null) ? 0 : getAttributesKey().hashCode());
        result = prime * result + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attributes=").append(attributes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}