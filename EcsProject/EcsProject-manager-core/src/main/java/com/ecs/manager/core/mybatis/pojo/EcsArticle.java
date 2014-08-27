package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;
import java.util.Date;

public class EcsArticle extends BaseObject implements Serializable {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String author;

    private Long hits;

    private Boolean isPublication;

    private Boolean isTop;

    private String seoDescription;

    private String seoKeywords;

    private String seoTitle;

    private String title;

    private Long articleCategory;

    private String content;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getHits() {
        return hits;
    }

    public void setHits(Long hits) {
        this.hits = hits;
    }

    public Boolean getIsPublication() {
        return isPublication;
    }

    public void setIsPublication(Boolean isPublication) {
        this.isPublication = isPublication;
    }

    public Boolean getIsTop() {
        return isTop;
    }

    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(Long articleCategory) {
        this.articleCategory = articleCategory;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        EcsArticle other = (EcsArticle) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getHits() == null ? other.getHits() == null : this.getHits().equals(other.getHits()))
            && (this.getIsPublication() == null ? other.getIsPublication() == null : this.getIsPublication().equals(other.getIsPublication()))
            && (this.getIsTop() == null ? other.getIsTop() == null : this.getIsTop().equals(other.getIsTop()))
            && (this.getSeoDescription() == null ? other.getSeoDescription() == null : this.getSeoDescription().equals(other.getSeoDescription()))
            && (this.getSeoKeywords() == null ? other.getSeoKeywords() == null : this.getSeoKeywords().equals(other.getSeoKeywords()))
            && (this.getSeoTitle() == null ? other.getSeoTitle() == null : this.getSeoTitle().equals(other.getSeoTitle()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getArticleCategory() == null ? other.getArticleCategory() == null : this.getArticleCategory().equals(other.getArticleCategory()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getHits() == null) ? 0 : getHits().hashCode());
        result = prime * result + ((getIsPublication() == null) ? 0 : getIsPublication().hashCode());
        result = prime * result + ((getIsTop() == null) ? 0 : getIsTop().hashCode());
        result = prime * result + ((getSeoDescription() == null) ? 0 : getSeoDescription().hashCode());
        result = prime * result + ((getSeoKeywords() == null) ? 0 : getSeoKeywords().hashCode());
        result = prime * result + ((getSeoTitle() == null) ? 0 : getSeoTitle().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getArticleCategory() == null) ? 0 : getArticleCategory().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
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
        sb.append(", author=").append(author);
        sb.append(", hits=").append(hits);
        sb.append(", isPublication=").append(isPublication);
        sb.append(", isTop=").append(isTop);
        sb.append(", seoDescription=").append(seoDescription);
        sb.append(", seoKeywords=").append(seoKeywords);
        sb.append(", seoTitle=").append(seoTitle);
        sb.append(", title=").append(title);
        sb.append(", articleCategory=").append(articleCategory);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}