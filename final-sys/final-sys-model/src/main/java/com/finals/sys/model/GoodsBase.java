package com.finals.sys.model;

import java.util.Date;

public class GoodsBase {
    /**
     * 商品唯一标识
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
     * 商品组id
     *
     * @mbg.generated
     */
    private Long goodsGroupid;

    /**
     * 初始价格
     *
     * @mbg.generated
     */
    private Long startPrice;

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
     * (1:上架2:下架0:新建)
     *
     * @mbg.generated
     */
    private Integer status;

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

    public Long getGoodsGroupid() {
        return goodsGroupid;
    }

    public void setGoodsGroupid(Long goodsGroupid) {
        this.goodsGroupid = goodsGroupid;
    }

    public Long getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Long startPrice) {
        this.startPrice = startPrice;
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