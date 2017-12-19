package com.finals.quotation.mapper;

import com.finals.quotation.model.QuotationSaleFiveMinute;
import com.finals.quotation.model.QuotationSaleFiveMinuteExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface QuotationSaleFiveMinuteMapper {
    long countByExample(QuotationSaleFiveMinuteExample example);

    int deleteByExample(QuotationSaleFiveMinuteExample example);

    @Delete({
        "delete from final.quotation_sale_five_minute",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into final.quotation_sale_five_minute (goods_id, create_date, ",
        "product_price)",
        "values (#{goodsId,jdbcType=BIGINT}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{productPrice,jdbcType=BIGINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(QuotationSaleFiveMinute record);

    int insertSelective(QuotationSaleFiveMinute record);

    List<QuotationSaleFiveMinute> selectByExample(QuotationSaleFiveMinuteExample example);

    @Select({
        "select",
        "id, goods_id, create_date, product_price",
        "from final.quotation_sale_five_minute",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.quotation.mapper.QuotationSaleFiveMinuteMapper.BaseResultMap")
    QuotationSaleFiveMinute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QuotationSaleFiveMinute record, @Param("example") QuotationSaleFiveMinuteExample example);

    int updateByExample(@Param("record") QuotationSaleFiveMinute record, @Param("example") QuotationSaleFiveMinuteExample example);

    int updateByPrimaryKeySelective(QuotationSaleFiveMinute record);

    @Update({
        "update final.quotation_sale_five_minute",
        "set goods_id = #{goodsId,jdbcType=BIGINT},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "product_price = #{productPrice,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(QuotationSaleFiveMinute record);
}