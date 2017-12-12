package com.finals.bank.model;

import java.util.Date;

public class BankIcbc {
    /**
     * 银行编号
     *
     * @mbg.generated
     */
    private Long bankId;

    /**
     * 开户行
     *
     * @mbg.generated
     */
    private String bankName;

    /**
     * 银行卡号
     *
     * @mbg.generated
     */
    private String bankCard;

    /**
     * 授权人姓名
     *
     * @mbg.generated
     */
    private String accreditName;

    /**
     * 授权代理人证件类型
     *
     * @mbg.generated
     */
    private Integer accreditCardType;

    /**
     * 授权代理人证件号
     *
     * @mbg.generated
     */
    private String accreditCardNumber;

    /**
     * 移动号
     *
     * @mbg.generated
     */
    private Long mobile;

    /**
     * 创建人名称
     *
     * @mbg.generated
     */
    private String createName;

    /**
     * 创建人编码
     *
     * @mbg.generated
     */
    private String createCode;

    /**
     * 创建日期
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * 更新人名称
     *
     * @mbg.generated
     */
    private String updateName;

    /**
     * 更新人编号
     *
     * @mbg.generated
     */
    private String updateCode;

    /**
     * 更新日期
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * (1:生效 0:失效)
     *
     * @mbg.generated
     */
    private Integer status;

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getAccreditName() {
        return accreditName;
    }

    public void setAccreditName(String accreditName) {
        this.accreditName = accreditName;
    }

    public Integer getAccreditCardType() {
        return accreditCardType;
    }

    public void setAccreditCardType(Integer accreditCardType) {
        this.accreditCardType = accreditCardType;
    }

    public String getAccreditCardNumber() {
        return accreditCardNumber;
    }

    public void setAccreditCardNumber(String accreditCardNumber) {
        this.accreditCardNumber = accreditCardNumber;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getCreateCode() {
        return createCode;
    }

    public void setCreateCode(String createCode) {
        this.createCode = createCode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public String getUpdateCode() {
        return updateCode;
    }

    public void setUpdateCode(String updateCode) {
        this.updateCode = updateCode;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}