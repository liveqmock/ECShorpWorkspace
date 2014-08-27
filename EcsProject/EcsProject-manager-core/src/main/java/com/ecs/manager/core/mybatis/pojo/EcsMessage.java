package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;
import java.util.Date;

public class EcsMessage extends BaseObject implements Serializable {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String ip;

    private Boolean isDraft;

    private Boolean receiverDelete;

    private Boolean receiverRead;

    private Boolean senderDelete;

    private Boolean senderRead;

    private String title;

    private Long forMessage;

    private Long receiver;

    private Long sender;

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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Boolean getIsDraft() {
        return isDraft;
    }

    public void setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
    }

    public Boolean getReceiverDelete() {
        return receiverDelete;
    }

    public void setReceiverDelete(Boolean receiverDelete) {
        this.receiverDelete = receiverDelete;
    }

    public Boolean getReceiverRead() {
        return receiverRead;
    }

    public void setReceiverRead(Boolean receiverRead) {
        this.receiverRead = receiverRead;
    }

    public Boolean getSenderDelete() {
        return senderDelete;
    }

    public void setSenderDelete(Boolean senderDelete) {
        this.senderDelete = senderDelete;
    }

    public Boolean getSenderRead() {
        return senderRead;
    }

    public void setSenderRead(Boolean senderRead) {
        this.senderRead = senderRead;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getForMessage() {
        return forMessage;
    }

    public void setForMessage(Long forMessage) {
        this.forMessage = forMessage;
    }

    public Long getReceiver() {
        return receiver;
    }

    public void setReceiver(Long receiver) {
        this.receiver = receiver;
    }

    public Long getSender() {
        return sender;
    }

    public void setSender(Long sender) {
        this.sender = sender;
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
        EcsMessage other = (EcsMessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getIsDraft() == null ? other.getIsDraft() == null : this.getIsDraft().equals(other.getIsDraft()))
            && (this.getReceiverDelete() == null ? other.getReceiverDelete() == null : this.getReceiverDelete().equals(other.getReceiverDelete()))
            && (this.getReceiverRead() == null ? other.getReceiverRead() == null : this.getReceiverRead().equals(other.getReceiverRead()))
            && (this.getSenderDelete() == null ? other.getSenderDelete() == null : this.getSenderDelete().equals(other.getSenderDelete()))
            && (this.getSenderRead() == null ? other.getSenderRead() == null : this.getSenderRead().equals(other.getSenderRead()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getForMessage() == null ? other.getForMessage() == null : this.getForMessage().equals(other.getForMessage()))
            && (this.getReceiver() == null ? other.getReceiver() == null : this.getReceiver().equals(other.getReceiver()))
            && (this.getSender() == null ? other.getSender() == null : this.getSender().equals(other.getSender()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getIsDraft() == null) ? 0 : getIsDraft().hashCode());
        result = prime * result + ((getReceiverDelete() == null) ? 0 : getReceiverDelete().hashCode());
        result = prime * result + ((getReceiverRead() == null) ? 0 : getReceiverRead().hashCode());
        result = prime * result + ((getSenderDelete() == null) ? 0 : getSenderDelete().hashCode());
        result = prime * result + ((getSenderRead() == null) ? 0 : getSenderRead().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getForMessage() == null) ? 0 : getForMessage().hashCode());
        result = prime * result + ((getReceiver() == null) ? 0 : getReceiver().hashCode());
        result = prime * result + ((getSender() == null) ? 0 : getSender().hashCode());
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
        sb.append(", ip=").append(ip);
        sb.append(", isDraft=").append(isDraft);
        sb.append(", receiverDelete=").append(receiverDelete);
        sb.append(", receiverRead=").append(receiverRead);
        sb.append(", senderDelete=").append(senderDelete);
        sb.append(", senderRead=").append(senderRead);
        sb.append(", title=").append(title);
        sb.append(", forMessage=").append(forMessage);
        sb.append(", receiver=").append(receiver);
        sb.append(", sender=").append(sender);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}