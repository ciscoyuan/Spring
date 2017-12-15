package com.finals.order.mapper;

import com.finals.order.model.OrderBase;
import com.finals.order.model.OrderBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface OrderBaseMapper {
    long countByExample(OrderBaseExample example);

    int deleteByExample(OrderBaseExample example);

    @Delete({
        "delete from final.order_base",
        "where order_id = #{orderId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long orderId);

    @Insert({
        "insert into final.order_base (order_type, action, ",
        "fee_status, user_id, ",
        "create_name, create_code, ",
        "create_date, update_name, ",
        "update_code, update_date, ",
        "status, error_desc)",
        "values (#{orderType,jdbcType=TINYINT}, #{action,jdbcType=TINYINT}, ",
        "#{feeStatus,jdbcType=TINYINT}, #{userId,jdbcType=BIGINT}, ",
        "#{createName,jdbcType=VARCHAR}, #{createCode,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateName,jdbcType=VARCHAR}, ",
        "#{updateCode,jdbcType=VARCHAR}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=TINYINT}, #{errorDesc,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="orderId", before=false, resultType=Long.class)
    int insert(OrderBase record);

    int insertSelective(OrderBase record);

    List<OrderBase> selectByExample(OrderBaseExample example);

    @Select({
        "select",
        "order_id, order_type, action, fee_status, user_id, create_name, create_code, ",
        "create_date, update_name, update_code, update_date, status, error_desc",
        "from final.order_base",
        "where order_id = #{orderId,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.order.mapper.OrderBaseMapper.BaseResultMap")
    OrderBase selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") OrderBase record, @Param("example") OrderBaseExample example);

    int updateByExample(@Param("record") OrderBase record, @Param("example") OrderBaseExample example);

    int updateByPrimaryKeySelective(OrderBase record);

    @Update({
        "update final.order_base",
        "set order_type = #{orderType,jdbcType=TINYINT},",
          "action = #{action,jdbcType=TINYINT},",
          "fee_status = #{feeStatus,jdbcType=TINYINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "create_name = #{createName,jdbcType=VARCHAR},",
          "create_code = #{createCode,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_name = #{updateName,jdbcType=VARCHAR},",
          "update_code = #{updateCode,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=TINYINT},",
          "error_desc = #{errorDesc,jdbcType=VARCHAR}",
        "where order_id = #{orderId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OrderBase record);
}