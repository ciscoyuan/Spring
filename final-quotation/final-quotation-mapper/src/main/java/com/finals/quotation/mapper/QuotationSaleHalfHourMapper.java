package com.finals.quotation.mapper;

import com.finals.quotation.model.QuotationSaleHalfHour;
import com.finals.quotation.model.QuotationSaleHalfHourExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface QuotationSaleHalfHourMapper {
    long countByExample(QuotationSaleHalfHourExample example);

    int deleteByExample(QuotationSaleHalfHourExample example);

    @Delete({
        "delete from final.quotation_sale_half_hour",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into final.quotation_sale_half_hour (goods_id, create_date, ",
        "product_price)",
        "values (#{goodsId,jdbcType=BIGINT}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{productPrice,jdbcType=BIGINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(QuotationSaleHalfHour record);

    int insertSelective(QuotationSaleHalfHour record);

    List<QuotationSaleHalfHour> selectByExample(QuotationSaleHalfHourExample example);

    @Select({
        "select",
        "id, goods_id, create_date, product_price",
        "from final.quotation_sale_half_hour",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.quotation.mapper.QuotationSaleHalfHourMapper.BaseResultMap")
    QuotationSaleHalfHour selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QuotationSaleHalfHour record, @Param("example") QuotationSaleHalfHourExample example);

    int updateByExample(@Param("record") QuotationSaleHalfHour record, @Param("example") QuotationSaleHalfHourExample example);

    int updateByPrimaryKeySelective(QuotationSaleHalfHour record);

    @Update({
        "update final.quotation_sale_half_hour",
        "set goods_id = #{goodsId,jdbcType=BIGINT},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "product_price = #{productPrice,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(QuotationSaleHalfHour record);
}