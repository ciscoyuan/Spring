package com.finals.quotation.model;

public class Quotation {
    /**
     * 行情id
     *
     * @mbg.generated
     */
    private Long quotationId;

    /**
     * 商品id
     *
     * @mbg.generated
     */
    private Long goodsId;

    /**
     * 商品组id(1:发售商品2:现货商品)
     *
     * @mbg.generated
     */
    private Long goodsGroupid;

    /**
     * 行情类型(1:5分钟线 2:30分钟线 3：日线)
     *
     * @mbg.generated
     */
    private Integer quotationType;

    public Long getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(Long quotationId) {
        this.quotationId = quotationId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getGoodsGroupid() {
        return goodsGroupid;
    }

    public void setGoodsGroupid(Long goodsGroupid) {
        this.goodsGroupid = goodsGroupid;
    }

    public Integer getQuotationType() {
        return quotationType;
    }

    public void setQuotationType(Integer quotationType) {
        this.quotationType = quotationType;
    }
}