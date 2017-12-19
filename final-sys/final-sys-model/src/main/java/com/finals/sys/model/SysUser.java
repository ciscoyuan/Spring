package com.finals.sys.model;

import java.util.Date;

public class SysUser {
    /**
     * 用户id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * 用户账号
     *
     * @mbg.generated
     */
    private String userCode;

    /**
     * 用户昵称
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * 用户类型
     *
     * @mbg.generated
     */
    private Integer userType;

    /**
     * 手机号
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 登录密码
     *
     * @mbg.generated
     */
    private String password;

    /**
     * 账户id
     *
     * @mbg.generated
     */
    private Long accountId;

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
     * (1:在用2:强制封停3:冻结4:注销)
     *
     * @mbg.generated
     */
    private Integer status;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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