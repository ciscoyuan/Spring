package com.finals.acc.model;

public class AccFee {
    /**
     * 主键id
     *
     * @mbg.generated
     */
    private Long feeId;

    /**
     * 账户id
     *
     * @mbg.generated
     */
    private Long accountId;

    /**
     * 总金额
     *
     * @mbg.generated
     */
    private Long totalMoney;

    public Long getFeeId() {
        return feeId;
    }

    public void setFeeId(Long feeId) {
        this.feeId = feeId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Long totalMoney) {
        this.totalMoney = totalMoney;
    }
}