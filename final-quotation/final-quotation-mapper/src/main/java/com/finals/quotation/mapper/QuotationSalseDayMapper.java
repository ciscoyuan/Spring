package com.finals.quotation.mapper;

import com.finals.quotation.model.QuotationSalseDay;
import com.finals.quotation.model.QuotationSalseDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface QuotationSalseDayMapper {
    long countByExample(QuotationSalseDayExample example);

    int deleteByExample(QuotationSalseDayExample example);

    @Delete({
        "delete from final.quotation_salse_day",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into final.quotation_salse_day (goods_id, create_date, ",
        "product_price)",
        "values (#{goodsId,jdbcType=BIGINT}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{productPrice,jdbcType=BIGINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(QuotationSalseDay record);

    int insertSelective(QuotationSalseDay record);

    List<QuotationSalseDay> selectByExample(QuotationSalseDayExample example);

    @Select({
        "select",
        "id, goods_id, create_date, product_price",
        "from final.quotation_salse_day",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.quotation.mapper.QuotationSalseDayMapper.BaseResultMap")
    QuotationSalseDay selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QuotationSalseDay record, @Param("example") QuotationSalseDayExample example);

    int updateByExample(@Param("record") QuotationSalseDay record, @Param("example") QuotationSalseDayExample example);

    int updateByPrimaryKeySelective(QuotationSalseDay record);

    @Update({
        "update final.quotation_salse_day",
        "set goods_id = #{goodsId,jdbcType=BIGINT},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "product_price = #{productPrice,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(QuotationSalseDay record);
}