package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsPluginConfigAttributeKey extends BaseObject implements Serializable {
    private Long pluginConfig;

    private String attributesKey;

    private static final long serialVersionUID = 1L;

    public Long getPluginConfig() {
        return pluginConfig;
    }

    public void setPluginConfig(Long pluginConfig) {
        this.pluginConfig = pluginConfig;
    }

    public String getAttributesKey() {
        return attributesKey;
    }

    public void setAttributesKey(String attributesKey) {
        this.attributesKey = attributesKey;
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
        EcsPluginConfigAttributeKey other = (EcsPluginConfigAttributeKey) that;
        return (this.getPluginConfig() == null ? other.getPluginConfig() == null : this.getPluginConfig().equals(other.getPluginConfig()))
            && (this.getAttributesKey() == null ? other.getAttributesKey() == null : this.getAttributesKey().equals(other.getAttributesKey()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPluginConfig() == null) ? 0 : getPluginConfig().hashCode());
        result = prime * result + ((getAttributesKey() == null) ? 0 : getAttributesKey().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pluginConfig=").append(pluginConfig);
        sb.append(", attributesKey=").append(attributesKey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}