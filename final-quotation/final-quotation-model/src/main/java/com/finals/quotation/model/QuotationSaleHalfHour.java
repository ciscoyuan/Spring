package com.finals.quotation.model;

import java.util.Date;

public class QuotationSaleHalfHour {
    /**
     * 单表主键
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 商品主键
     *
     * @mbg.generated
     */
    private Long goodsId;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * 商品价格
     *
     * @mbg.generated
     */
    private Long productPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
    }
}