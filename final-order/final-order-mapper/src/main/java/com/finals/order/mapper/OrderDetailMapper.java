package com.finals.order.mapper;

import com.finals.order.model.OrderDetail;
import com.finals.order.model.OrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface OrderDetailMapper {
    long countByExample(OrderDetailExample example);

    int deleteByExample(OrderDetailExample example);

    @Delete({
        "delete from final.order_detail",
        "where order_id = #{orderId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long orderId);

    @Insert({
        "insert into final.order_detail (goods_id, goods_name, ",
        "product_price, product_count, ",
        "money, ratecost)",
        "values (#{goodsId,jdbcType=BIGINT}, #{goodsName,jdbcType=VARCHAR}, ",
        "#{productPrice,jdbcType=BIGINT}, #{productCount,jdbcType=INTEGER}, ",
        "#{money,jdbcType=BIGINT}, #{ratecost,jdbcType=BIGINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="orderId", before=false, resultType=Long.class)
    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    List<OrderDetail> selectByExample(OrderDetailExample example);

    @Select({
        "select",
        "order_id, goods_id, goods_name, product_price, product_count, money, ratecost",
        "from final.order_detail",
        "where order_id = #{orderId,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.order.mapper.OrderDetailMapper.BaseResultMap")
    OrderDetail selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    int updateByExample(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    int updateByPrimaryKeySelective(OrderDetail record);

    @Update({
        "update final.order_detail",
        "set goods_id = #{goodsId,jdbcType=BIGINT},",
          "goods_name = #{goodsName,jdbcType=VARCHAR},",
          "product_price = #{productPrice,jdbcType=BIGINT},",
          "product_count = #{productCount,jdbcType=INTEGER},",
          "money = #{money,jdbcType=BIGINT},",
          "ratecost = #{ratecost,jdbcType=BIGINT}",
        "where order_id = #{orderId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OrderDetail record);
}