package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;

public class EcsMemberFavoriteProductKey extends BaseObject implements Serializable {
    private Long favoriteMembers;

    private Long favoriteProducts;

    private static final long serialVersionUID = 1L;

    public Long getFavoriteMembers() {
        return favoriteMembers;
    }

    public void setFavoriteMembers(Long favoriteMembers) {
        this.favoriteMembers = favoriteMembers;
    }

    public Long getFavoriteProducts() {
        return favoriteProducts;
    }

    public void setFavoriteProducts(Long favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
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
        EcsMemberFavoriteProductKey other = (EcsMemberFavoriteProductKey) that;
        return (this.getFavoriteMembers() == null ? other.getFavoriteMembers() == null : this.getFavoriteMembers().equals(other.getFavoriteMembers()))
            && (this.getFavoriteProducts() == null ? other.getFavoriteProducts() == null : this.getFavoriteProducts().equals(other.getFavoriteProducts()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFavoriteMembers() == null) ? 0 : getFavoriteMembers().hashCode());
        result = prime * result + ((getFavoriteProducts() == null) ? 0 : getFavoriteProducts().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", favoriteMembers=").append(favoriteMembers);
        sb.append(", favoriteProducts=").append(favoriteProducts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}