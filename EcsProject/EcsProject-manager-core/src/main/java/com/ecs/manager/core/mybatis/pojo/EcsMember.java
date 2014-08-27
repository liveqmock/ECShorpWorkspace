package com.ecs.manager.core.mybatis.pojo;

import com.ecs.commons.model.BaseObject;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EcsMember extends BaseObject implements Serializable {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String address;

    private BigDecimal amount;

    private String attributeValue0;

    private String attributeValue1;

    private String attributeValue2;

    private String attributeValue3;

    private String attributeValue4;

    private String attributeValue5;

    private String attributeValue6;

    private String attributeValue7;

    private String attributeValue8;

    private String attributeValue9;

    private BigDecimal balance;

    private Date birth;

    private String email;

    private Integer gender;

    private Boolean isEnabled;

    private Boolean isLocked;

    private Date lockedDate;

    private Date loginDate;

    private Integer loginFailureCount;

    private String loginIp;

    private String mobile;

    private String name;

    private String password;

    private String phone;

    private Long point;

    private String registerIp;

    private Date safeKeyExpire;

    private String safeKeyValue;

    private String username;

    private String zipCode;

    private Long area;

    private Long memberRank;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAttributeValue0() {
        return attributeValue0;
    }

    public void setAttributeValue0(String attributeValue0) {
        this.attributeValue0 = attributeValue0;
    }

    public String getAttributeValue1() {
        return attributeValue1;
    }

    public void setAttributeValue1(String attributeValue1) {
        this.attributeValue1 = attributeValue1;
    }

    public String getAttributeValue2() {
        return attributeValue2;
    }

    public void setAttributeValue2(String attributeValue2) {
        this.attributeValue2 = attributeValue2;
    }

    public String getAttributeValue3() {
        return attributeValue3;
    }

    public void setAttributeValue3(String attributeValue3) {
        this.attributeValue3 = attributeValue3;
    }

    public String getAttributeValue4() {
        return attributeValue4;
    }

    public void setAttributeValue4(String attributeValue4) {
        this.attributeValue4 = attributeValue4;
    }

    public String getAttributeValue5() {
        return attributeValue5;
    }

    public void setAttributeValue5(String attributeValue5) {
        this.attributeValue5 = attributeValue5;
    }

    public String getAttributeValue6() {
        return attributeValue6;
    }

    public void setAttributeValue6(String attributeValue6) {
        this.attributeValue6 = attributeValue6;
    }

    public String getAttributeValue7() {
        return attributeValue7;
    }

    public void setAttributeValue7(String attributeValue7) {
        this.attributeValue7 = attributeValue7;
    }

    public String getAttributeValue8() {
        return attributeValue8;
    }

    public void setAttributeValue8(String attributeValue8) {
        this.attributeValue8 = attributeValue8;
    }

    public String getAttributeValue9() {
        return attributeValue9;
    }

    public void setAttributeValue9(String attributeValue9) {
        this.attributeValue9 = attributeValue9;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Date getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public Date getSafeKeyExpire() {
        return safeKeyExpire;
    }

    public void setSafeKeyExpire(Date safeKeyExpire) {
        this.safeKeyExpire = safeKeyExpire;
    }

    public String getSafeKeyValue() {
        return safeKeyValue;
    }

    public void setSafeKeyValue(String safeKeyValue) {
        this.safeKeyValue = safeKeyValue;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public Long getMemberRank() {
        return memberRank;
    }

    public void setMemberRank(Long memberRank) {
        this.memberRank = memberRank;
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
        EcsMember other = (EcsMember) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getAttributeValue0() == null ? other.getAttributeValue0() == null : this.getAttributeValue0().equals(other.getAttributeValue0()))
            && (this.getAttributeValue1() == null ? other.getAttributeValue1() == null : this.getAttributeValue1().equals(other.getAttributeValue1()))
            && (this.getAttributeValue2() == null ? other.getAttributeValue2() == null : this.getAttributeValue2().equals(other.getAttributeValue2()))
            && (this.getAttributeValue3() == null ? other.getAttributeValue3() == null : this.getAttributeValue3().equals(other.getAttributeValue3()))
            && (this.getAttributeValue4() == null ? other.getAttributeValue4() == null : this.getAttributeValue4().equals(other.getAttributeValue4()))
            && (this.getAttributeValue5() == null ? other.getAttributeValue5() == null : this.getAttributeValue5().equals(other.getAttributeValue5()))
            && (this.getAttributeValue6() == null ? other.getAttributeValue6() == null : this.getAttributeValue6().equals(other.getAttributeValue6()))
            && (this.getAttributeValue7() == null ? other.getAttributeValue7() == null : this.getAttributeValue7().equals(other.getAttributeValue7()))
            && (this.getAttributeValue8() == null ? other.getAttributeValue8() == null : this.getAttributeValue8().equals(other.getAttributeValue8()))
            && (this.getAttributeValue9() == null ? other.getAttributeValue9() == null : this.getAttributeValue9().equals(other.getAttributeValue9()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getBirth() == null ? other.getBirth() == null : this.getBirth().equals(other.getBirth()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getIsEnabled() == null ? other.getIsEnabled() == null : this.getIsEnabled().equals(other.getIsEnabled()))
            && (this.getIsLocked() == null ? other.getIsLocked() == null : this.getIsLocked().equals(other.getIsLocked()))
            && (this.getLockedDate() == null ? other.getLockedDate() == null : this.getLockedDate().equals(other.getLockedDate()))
            && (this.getLoginDate() == null ? other.getLoginDate() == null : this.getLoginDate().equals(other.getLoginDate()))
            && (this.getLoginFailureCount() == null ? other.getLoginFailureCount() == null : this.getLoginFailureCount().equals(other.getLoginFailureCount()))
            && (this.getLoginIp() == null ? other.getLoginIp() == null : this.getLoginIp().equals(other.getLoginIp()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getPoint() == null ? other.getPoint() == null : this.getPoint().equals(other.getPoint()))
            && (this.getRegisterIp() == null ? other.getRegisterIp() == null : this.getRegisterIp().equals(other.getRegisterIp()))
            && (this.getSafeKeyExpire() == null ? other.getSafeKeyExpire() == null : this.getSafeKeyExpire().equals(other.getSafeKeyExpire()))
            && (this.getSafeKeyValue() == null ? other.getSafeKeyValue() == null : this.getSafeKeyValue().equals(other.getSafeKeyValue()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getZipCode() == null ? other.getZipCode() == null : this.getZipCode().equals(other.getZipCode()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getMemberRank() == null ? other.getMemberRank() == null : this.getMemberRank().equals(other.getMemberRank()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getAttributeValue0() == null) ? 0 : getAttributeValue0().hashCode());
        result = prime * result + ((getAttributeValue1() == null) ? 0 : getAttributeValue1().hashCode());
        result = prime * result + ((getAttributeValue2() == null) ? 0 : getAttributeValue2().hashCode());
        result = prime * result + ((getAttributeValue3() == null) ? 0 : getAttributeValue3().hashCode());
        result = prime * result + ((getAttributeValue4() == null) ? 0 : getAttributeValue4().hashCode());
        result = prime * result + ((getAttributeValue5() == null) ? 0 : getAttributeValue5().hashCode());
        result = prime * result + ((getAttributeValue6() == null) ? 0 : getAttributeValue6().hashCode());
        result = prime * result + ((getAttributeValue7() == null) ? 0 : getAttributeValue7().hashCode());
        result = prime * result + ((getAttributeValue8() == null) ? 0 : getAttributeValue8().hashCode());
        result = prime * result + ((getAttributeValue9() == null) ? 0 : getAttributeValue9().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getBirth() == null) ? 0 : getBirth().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getIsEnabled() == null) ? 0 : getIsEnabled().hashCode());
        result = prime * result + ((getIsLocked() == null) ? 0 : getIsLocked().hashCode());
        result = prime * result + ((getLockedDate() == null) ? 0 : getLockedDate().hashCode());
        result = prime * result + ((getLoginDate() == null) ? 0 : getLoginDate().hashCode());
        result = prime * result + ((getLoginFailureCount() == null) ? 0 : getLoginFailureCount().hashCode());
        result = prime * result + ((getLoginIp() == null) ? 0 : getLoginIp().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getPoint() == null) ? 0 : getPoint().hashCode());
        result = prime * result + ((getRegisterIp() == null) ? 0 : getRegisterIp().hashCode());
        result = prime * result + ((getSafeKeyExpire() == null) ? 0 : getSafeKeyExpire().hashCode());
        result = prime * result + ((getSafeKeyValue() == null) ? 0 : getSafeKeyValue().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getZipCode() == null) ? 0 : getZipCode().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getMemberRank() == null) ? 0 : getMemberRank().hashCode());
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
        sb.append(", address=").append(address);
        sb.append(", amount=").append(amount);
        sb.append(", attributeValue0=").append(attributeValue0);
        sb.append(", attributeValue1=").append(attributeValue1);
        sb.append(", attributeValue2=").append(attributeValue2);
        sb.append(", attributeValue3=").append(attributeValue3);
        sb.append(", attributeValue4=").append(attributeValue4);
        sb.append(", attributeValue5=").append(attributeValue5);
        sb.append(", attributeValue6=").append(attributeValue6);
        sb.append(", attributeValue7=").append(attributeValue7);
        sb.append(", attributeValue8=").append(attributeValue8);
        sb.append(", attributeValue9=").append(attributeValue9);
        sb.append(", balance=").append(balance);
        sb.append(", birth=").append(birth);
        sb.append(", email=").append(email);
        sb.append(", gender=").append(gender);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", isLocked=").append(isLocked);
        sb.append(", lockedDate=").append(lockedDate);
        sb.append(", loginDate=").append(loginDate);
        sb.append(", loginFailureCount=").append(loginFailureCount);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", mobile=").append(mobile);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", point=").append(point);
        sb.append(", registerIp=").append(registerIp);
        sb.append(", safeKeyExpire=").append(safeKeyExpire);
        sb.append(", safeKeyValue=").append(safeKeyValue);
        sb.append(", username=").append(username);
        sb.append(", zipCode=").append(zipCode);
        sb.append(", area=").append(area);
        sb.append(", memberRank=").append(memberRank);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}