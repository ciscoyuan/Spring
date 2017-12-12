package com.finals.order.model;

import java.util.Date;

public class OrderBase {
    /**
     * 订单id
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     * (1:实际2:委托)
     *
     * @mbg.generated
     */
    private Integer orderType;

    /**
     * (1:买2:卖)
     *
     * @mbg.generated
     */
    private Integer action;

    /**
     * 1:成功 0:失败
     *
     * @mbg.generated
     */
    private Integer feeStatus;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    private Long userId;

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
     * 订单状态(1:成功 0:失败)
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * 错误描述
     *
     * @mbg.generated
     */
    private String errorDesc;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public Integer getFeeStatus() {
        return feeStatus;
    }

    public void setFeeStatus(Integer feeStatus) {
        this.feeStatus = feeStatus;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }
}