package com.finals.quotation.mapper;

import com.finals.quotation.model.QuotationSpotsFiveMinute;
import com.finals.quotation.model.QuotationSpotsFiveMinuteExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface QuotationSpotsFiveMinuteMapper {
    long countByExample(QuotationSpotsFiveMinuteExample example);

    int deleteByExample(QuotationSpotsFiveMinuteExample example);

    @Delete({
        "delete from final.quotation_spots_five_minute",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into final.quotation_spots_five_minute (goods_id, create_date, ",
        "product_price)",
        "values (#{goodsId,jdbcType=BIGINT}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{productPrice,jdbcType=BIGINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(QuotationSpotsFiveMinute record);

    int insertSelective(QuotationSpotsFiveMinute record);

    List<QuotationSpotsFiveMinute> selectByExample(QuotationSpotsFiveMinuteExample example);

    @Select({
        "select",
        "id, goods_id, create_date, product_price",
        "from final.quotation_spots_five_minute",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.quotation.mapper.QuotationSpotsFiveMinuteMapper.BaseResultMap")
    QuotationSpotsFiveMinute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QuotationSpotsFiveMinute record, @Param("example") QuotationSpotsFiveMinuteExample example);

    int updateByExample(@Param("record") QuotationSpotsFiveMinute record, @Param("example") QuotationSpotsFiveMinuteExample example);

    int updateByPrimaryKeySelective(QuotationSpotsFiveMinute record);

    @Update({
        "update final.quotation_spots_five_minute",
        "set goods_id = #{goodsId,jdbcType=BIGINT},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "product_price = #{productPrice,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(QuotationSpotsFiveMinute record);
}