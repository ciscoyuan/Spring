package com.finals.sys.model;

import java.util.Date;

public class GoodBase {
    /**
     * 套餐主键
     *
     * @mbg.generated
     */
    private Integer goodsId;

    /**
     * 套餐名称
     *
     * @mbg.generated
     */
    private String goodsName;

    /**
     * 套餐代码
     *
     * @mbg.generated
     */
    private String goodsCode;

    /**
     * 运营商类型:CT电信,CU联通,CM移动
     *
     * @mbg.generated
     */
    private String mnoType;

    /**
     * 套餐类型:100000基础包,200000加餐包
     *
     * @mbg.generated
     */
    private String goodsType;

    /**
     * 周期
     *
     * @mbg.generated
     */
    private Integer cycle;

    /**
     * 周期类型:1月3季6半年12年
     *
     * @mbg.generated
     */
    private Integer cycleUnit;

    /**
     * 流量,按Bytes保存
     *
     * @mbg.generated
     */
    private Long flow;

    /**
     * 流量单位:MB,GB
     *
     * @mbg.generated
     */
    private String flowUnit;

    /**
     * 单周期控制:0否1是
     *
     * @mbg.generated
     */
    private Integer monthFlag;

    /**
     * 单周期流量,按Bytes保存
     *
     * @mbg.generated
     */
    private Long preFlow;

    /**
     * 单周期流量单位:MB,GB
     *
     * @mbg.generated
     */
    private String preFlowUnit;

    /**
     * 套餐状态:-1下架,0新建,1上架
     *
     * @mbg.generated
     */
    private Integer goodsStatus;

    /**
     * 套餐说明
     *
     * @mbg.generated
     */
    private String goodsDesc;

    /**
     * 创建客户
     *
     * @mbg.generated
     */
    private Integer custId;

    /**
     * 生效时间
     *
     * @mbg.generated
     */
    private Date effectiveTime;

    /**
     * 失效时间,下架时置上,上架时清空
     *
     * @mbg.generated
     */
    private Date failureTime;

    /**
     * 套餐顺序
     *
     * @mbg.generated
     */
    private Integer goodsSort;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String createdCode;

    /**
     * 创建姓名
     *
     * @mbg.generated
     */
    private String createdName;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createdDt;

    /**
     * 修改人
     *
     * @mbg.generated
     */
    private String updatedCode;

    /**
     * 修改姓名
     *
     * @mbg.generated
     */
    private String updatedName;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    private Date updatedDt;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getMnoType() {
        return mnoType;
    }

    public void setMnoType(String mnoType) {
        this.mnoType = mnoType;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public Integer getCycleUnit() {
        return cycleUnit;
    }

    public void setCycleUnit(Integer cycleUnit) {
        this.cycleUnit = cycleUnit;
    }

    public Long getFlow() {
        return flow;
    }

    public void setFlow(Long flow) {
        this.flow = flow;
    }

    public String getFlowUnit() {
        return flowUnit;
    }

    public void setFlowUnit(String flowUnit) {
        this.flowUnit = flowUnit;
    }

    public Integer getMonthFlag() {
        return monthFlag;
    }

    public void setMonthFlag(Integer monthFlag) {
        this.monthFlag = monthFlag;
    }

    public Long getPreFlow() {
        return preFlow;
    }

    public void setPreFlow(Long preFlow) {
        this.preFlow = preFlow;
    }

    public String getPreFlowUnit() {
        return preFlowUnit;
    }

    public void setPreFlowUnit(String preFlowUnit) {
        this.preFlowUnit = preFlowUnit;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public Date getFailureTime() {
        return failureTime;
    }

    public void setFailureTime(Date failureTime) {
        this.failureTime = failureTime;
    }

    public Integer getGoodsSort() {
        return goodsSort;
    }

    public void setGoodsSort(Integer goodsSort) {
        this.goodsSort = goodsSort;
    }

    public String getCreatedCode() {
        return createdCode;
    }

    public void setCreatedCode(String createdCode) {
        this.createdCode = createdCode;
    }

    public String getCreatedName() {
        return createdName;
    }

    public void setCreatedName(String createdName) {
        this.createdName = createdName;
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public String getUpdatedCode() {
        return updatedCode;
    }

    public void setUpdatedCode(String updatedCode) {
        this.updatedCode = updatedCode;
    }

    public String getUpdatedName() {
        return updatedName;
    }

    public void setUpdatedName(String updatedName) {
        this.updatedName = updatedName;
    }

    public Date getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }
}