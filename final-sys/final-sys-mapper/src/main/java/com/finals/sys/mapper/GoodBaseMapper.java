package com.finals.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.finals.sys.model.GoodBase;
import com.finals.sys.model.GoodBaseExample;


public interface GoodBaseMapper {
    long countByExample(GoodBaseExample example);

    int deleteByExample(GoodBaseExample example);

    @Delete({
        "delete from home.good_base",
        "where goods_id = #{goodsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer goodsId);

    @Insert({
        "insert into home.good_base (goods_name, goods_code, ",
        "mno_type, goods_type, ",
        "cycle, cycle_unit, ",
        "flow, flow_unit, month_flag, ",
        "pre_flow, pre_flow_unit, ",
        "goods_status, goods_desc, ",
        "cust_id, effective_time, ",
        "failure_time, goods_sort, ",
        "created_code, created_name, ",
        "created_dt, updated_code, ",
        "updated_name, updated_dt)",
        "values (#{goodsName,jdbcType=VARCHAR}, #{goodsCode,jdbcType=VARCHAR}, ",
        "#{mnoType,jdbcType=CHAR}, #{goodsType,jdbcType=VARCHAR}, ",
        "#{cycle,jdbcType=INTEGER}, #{cycleUnit,jdbcType=TINYINT}, ",
        "#{flow,jdbcType=BIGINT}, #{flowUnit,jdbcType=CHAR}, #{monthFlag,jdbcType=TINYINT}, ",
        "#{preFlow,jdbcType=BIGINT}, #{preFlowUnit,jdbcType=CHAR}, ",
        "#{goodsStatus,jdbcType=TINYINT}, #{goodsDesc,jdbcType=VARCHAR}, ",
        "#{custId,jdbcType=INTEGER}, #{effectiveTime,jdbcType=TIMESTAMP}, ",
        "#{failureTime,jdbcType=TIMESTAMP}, #{goodsSort,jdbcType=INTEGER}, ",
        "#{createdCode,jdbcType=VARCHAR}, #{createdName,jdbcType=VARCHAR}, ",
        "#{createdDt,jdbcType=TIMESTAMP}, #{updatedCode,jdbcType=VARCHAR}, ",
        "#{updatedName,jdbcType=VARCHAR}, #{updatedDt,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsId", before=false, resultType=Integer.class)
    int insert(GoodBase record);

    int insertSelective(GoodBase record);

    List<GoodBase> selectByExample(GoodBaseExample example);

    @Select({
        "select",
        "goods_id, goods_name, goods_code, mno_type, goods_type, cycle, cycle_unit, flow, ",
        "flow_unit, month_flag, pre_flow, pre_flow_unit, goods_status, goods_desc, cust_id, ",
        "effective_time, failure_time, goods_sort, created_code, created_name, created_dt, ",
        "updated_code, updated_name, updated_dt",
        "from home.good_base",
        "where goods_id = #{goodsId,jdbcType=INTEGER}"
    })
    @ResultMap("com.finals.sys.mapper.GoodBaseMapper.BaseResultMap")
    GoodBase selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") GoodBase record, @Param("example") GoodBaseExample example);

    int updateByExample(@Param("record") GoodBase record, @Param("example") GoodBaseExample example);

    int updateByPrimaryKeySelective(GoodBase record);

    @Update({
        "update home.good_base",
        "set goods_name = #{goodsName,jdbcType=VARCHAR},",
          "goods_code = #{goodsCode,jdbcType=VARCHAR},",
          "mno_type = #{mnoType,jdbcType=CHAR},",
          "goods_type = #{goodsType,jdbcType=VARCHAR},",
          "cycle = #{cycle,jdbcType=INTEGER},",
          "cycle_unit = #{cycleUnit,jdbcType=TINYINT},",
          "flow = #{flow,jdbcType=BIGINT},",
          "flow_unit = #{flowUnit,jdbcType=CHAR},",
          "month_flag = #{monthFlag,jdbcType=TINYINT},",
          "pre_flow = #{preFlow,jdbcType=BIGINT},",
          "pre_flow_unit = #{preFlowUnit,jdbcType=CHAR},",
          "goods_status = #{goodsStatus,jdbcType=TINYINT},",
          "goods_desc = #{goodsDesc,jdbcType=VARCHAR},",
          "cust_id = #{custId,jdbcType=INTEGER},",
          "effective_time = #{effectiveTime,jdbcType=TIMESTAMP},",
          "failure_time = #{failureTime,jdbcType=TIMESTAMP},",
          "goods_sort = #{goodsSort,jdbcType=INTEGER},",
          "created_code = #{createdCode,jdbcType=VARCHAR},",
          "created_name = #{createdName,jdbcType=VARCHAR},",
          "created_dt = #{createdDt,jdbcType=TIMESTAMP},",
          "updated_code = #{updatedCode,jdbcType=VARCHAR},",
          "updated_name = #{updatedName,jdbcType=VARCHAR},",
          "updated_dt = #{updatedDt,jdbcType=TIMESTAMP}",
        "where goods_id = #{goodsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GoodBase record);
}