package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsAdminRoleKey extends BaseObject implements Serializable {
    private Long admins;

    private Long roles;

    private static final long serialVersionUID = 1L;

    public Long getAdmins() {
        return admins;
    }

    public void setAdmins(Long admins) {
        this.admins = admins;
    }

    public Long getRoles() {
        return roles;
    }

    public void setRoles(Long roles) {
        this.roles = roles;
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
        EcsAdminRoleKey other = (EcsAdminRoleKey) that;
        return (this.getAdmins() == null ? other.getAdmins() == null : this.getAdmins().equals(other.getAdmins()))
            && (this.getRoles() == null ? other.getRoles() == null : this.getRoles().equals(other.getRoles()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdmins() == null) ? 0 : getAdmins().hashCode());
        result = prime * result + ((getRoles() == null) ? 0 : getRoles().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", admins=").append(admins);
        sb.append(", roles=").append(roles);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}