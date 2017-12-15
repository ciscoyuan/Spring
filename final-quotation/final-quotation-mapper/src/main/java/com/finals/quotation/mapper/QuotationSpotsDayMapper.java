package com.finals.quotation.mapper;

import com.finals.quotation.model.QuotationSpotsDay;
import com.finals.quotation.model.QuotationSpotsDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface QuotationSpotsDayMapper {
    long countByExample(QuotationSpotsDayExample example);

    int deleteByExample(QuotationSpotsDayExample example);

    @Delete({
        "delete from final.quotation_spots_day",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into final.quotation_spots_day (goods_id, create_date, ",
        "product_price)",
        "values (#{goodsId,jdbcType=BIGINT}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{productPrice,jdbcType=BIGINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(QuotationSpotsDay record);

    int insertSelective(QuotationSpotsDay record);

    List<QuotationSpotsDay> selectByExample(QuotationSpotsDayExample example);

    @Select({
        "select",
        "id, goods_id, create_date, product_price",
        "from final.quotation_spots_day",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.quotation.mapper.QuotationSpotsDayMapper.BaseResultMap")
    QuotationSpotsDay selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QuotationSpotsDay record, @Param("example") QuotationSpotsDayExample example);

    int updateByExample(@Param("record") QuotationSpotsDay record, @Param("example") QuotationSpotsDayExample example);

    int updateByPrimaryKeySelective(QuotationSpotsDay record);

    @Update({
        "update final.quotation_spots_day",
        "set goods_id = #{goodsId,jdbcType=BIGINT},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "product_price = #{productPrice,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(QuotationSpotsDay record);
}