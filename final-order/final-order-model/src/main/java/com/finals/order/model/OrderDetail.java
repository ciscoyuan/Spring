package com.finals.order.model;

public class OrderDetail {
    /**
     * 订单id
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     * 商品id
     *
     * @mbg.generated
     */
    private Long goodsId;

    /**
     * 商品名称
     *
     * @mbg.generated
     */
    private String goodsName;

    /**
     * 商品单价
     *
     * @mbg.generated
     */
    private Long productPrice;

    /**
     * 商品数量
     *
     * @mbg.generated
     */
    private Integer productCount;

    /**
     * 总金额
     *
     * @mbg.generated
     */
    private Long money;

    /**
     * 银行手续费
     *
     * @mbg.generated
     */
    private Long ratecost;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Long getRatecost() {
        return ratecost;
    }

    public void setRatecost(Long ratecost) {
        this.ratecost = ratecost;
    }
}