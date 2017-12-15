package com.finals.quotation.mapper;

import com.finals.quotation.model.QuotationSpotsHalfHour;
import com.finals.quotation.model.QuotationSpotsHalfHourExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface QuotationSpotsHalfHourMapper {
    long countByExample(QuotationSpotsHalfHourExample example);

    int deleteByExample(QuotationSpotsHalfHourExample example);

    @Delete({
        "delete from final.quotation_spots_half_hour",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into final.quotation_spots_half_hour (goods_id, create_date, ",
        "product_price)",
        "values (#{goodsId,jdbcType=BIGINT}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{productPrice,jdbcType=BIGINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(QuotationSpotsHalfHour record);

    int insertSelective(QuotationSpotsHalfHour record);

    List<QuotationSpotsHalfHour> selectByExample(QuotationSpotsHalfHourExample example);

    @Select({
        "select",
        "id, goods_id, create_date, product_price",
        "from final.quotation_spots_half_hour",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.quotation.mapper.QuotationSpotsHalfHourMapper.BaseResultMap")
    QuotationSpotsHalfHour selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QuotationSpotsHalfHour record, @Param("example") QuotationSpotsHalfHourExample example);

    int updateByExample(@Param("record") QuotationSpotsHalfHour record, @Param("example") QuotationSpotsHalfHourExample example);

    int updateByPrimaryKeySelective(QuotationSpotsHalfHour record);

    @Update({
        "update final.quotation_spots_half_hour",
        "set goods_id = #{goodsId,jdbcType=BIGINT},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "product_price = #{productPrice,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(QuotationSpotsHalfHour record);
}