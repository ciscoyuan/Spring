package com.finals.acc.model;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;

public class AccLog {
    /**
     * 主键id
     *
     * @mbg.generated
     */
    private Long logId;

    /**
     * 账户id
     *
     * @mbg.generated
     */
    private Long accountId;

    /**
     * (1:加钱 2:减钱)
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     * 金额
     *
     * @mbg.generated
     */
    private Long price;

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
    
    private BeanFactory beanFactory;

    /**
     * 更新日期
     *
     * @mbg.generated
     */
    private Date updateDate;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
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

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public void setBeanFactory(BeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}

	/**
	 * @author liusy
	 * @date 2017年12月18日 下午6:27:51
	 * @Description 
	 */
	@Override
	public String toString() {
		return "AccLog [logId=" + logId + ", accountId=" + accountId + ", type=" + type + ", price=" + price
				+ ", createName=" + createName + ", createCode=" + createCode + ", createDate=" + createDate
				+ ", updateName=" + updateName + ", updateCode=" + updateCode + ", beanFactory=" + beanFactory
				+ ", updateDate=" + updateDate + "]";
	}

}