package com.finals.bank.model;

import java.util.Date;

public class BankCmbc {
    /**
     * 主键id
     *
     * @mbg.generated
     */
    private Long cmbcId;

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
     * 缴费编号
     *
     * @mbg.generated
     */
    private String chargeNo;

    /**
     * 协议编号
     *
     * @mbg.generated
     */
    private String protocalNo;

    /**
     * 开户支行
     *
     * @mbg.generated
     */
    private String bankBranch;

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

    public Long getCmbcId() {
        return cmbcId;
    }

    public void setCmbcId(Long cmbcId) {
        this.cmbcId = cmbcId;
    }

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

    public String getChargeNo() {
        return chargeNo;
    }

    public void setChargeNo(String chargeNo) {
        this.chargeNo = chargeNo;
    }

    public String getProtocalNo() {
        return protocalNo;
    }

    public void setProtocalNo(String protocalNo) {
        this.protocalNo = protocalNo;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
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