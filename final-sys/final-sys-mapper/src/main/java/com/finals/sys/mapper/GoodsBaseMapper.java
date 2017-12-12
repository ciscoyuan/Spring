package com.finals.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.finals.sys.model.GoodsBase;
import com.finals.sys.model.GoodsBaseExample;

public interface GoodsBaseMapper {
    long countByExample(GoodsBaseExample example);

    int deleteByExample(GoodsBaseExample example);

    @Delete({
        "delete from final.goods_base",
        "where goods_id = #{goodsId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long goodsId);

    @Insert({
        "insert into final.goods_base (goods_name, goods_groupId, ",
        "start_price, create_name, ",
        "create_code, create_date, ",
        "update_name, update_code, ",
        "update_date, status)",
        "values (#{goodsName,jdbcType=VARCHAR}, #{goodsGroupid,jdbcType=BIGINT}, ",
        "#{startPrice,jdbcType=BIGINT}, #{createName,jdbcType=VARCHAR}, ",
        "#{createCode,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateName,jdbcType=VARCHAR}, #{updateCode,jdbcType=VARCHAR}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{status,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="goodsId", before=false, resultType=Long.class)
    int insert(GoodsBase record);

    int insertSelective(GoodsBase record);

    List<GoodsBase> selectByExample(GoodsBaseExample example);

    @Select({
        "select",
        "goods_id, goods_name, goods_groupId, start_price, create_name, create_code, ",
        "create_date, update_name, update_code, update_date, status",
        "from final.goods_base",
        "where goods_id = #{goodsId,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.sys.mapper.GoodsBaseMapper.BaseResultMap")
    GoodsBase selectByPrimaryKey(Long goodsId);

    int updateByExampleSelective(@Param("record") GoodsBase record, @Param("example") GoodsBaseExample example);

    int updateByExample(@Param("record") GoodsBase record, @Param("example") GoodsBaseExample example);

    int updateByPrimaryKeySelective(GoodsBase record);

    @Update({
        "update final.goods_base",
        "set goods_name = #{goodsName,jdbcType=VARCHAR},",
          "goods_groupId = #{goodsGroupid,jdbcType=BIGINT},",
          "start_price = #{startPrice,jdbcType=BIGINT},",
          "create_name = #{createName,jdbcType=VARCHAR},",
          "create_code = #{createCode,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_name = #{updateName,jdbcType=VARCHAR},",
          "update_code = #{updateCode,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=TINYINT}",
        "where goods_id = #{goodsId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GoodsBase record);
}