package com.finals.quotation.mapper;

import com.finals.quotation.model.Quotation;
import com.finals.quotation.model.QuotationExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface QuotationMapper {
    long countByExample(QuotationExample example);

    int deleteByExample(QuotationExample example);

    @Delete({
        "delete from final.quotation",
        "where quotation_id = #{quotationId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long quotationId);

    @Insert({
        "insert into final.quotation (goods_id, goods_groupId, ",
        "quotation_type)",
        "values (#{goodsId,jdbcType=BIGINT}, #{goodsGroupid,jdbcType=BIGINT}, ",
        "#{quotationType,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="quotationId", before=false, resultType=Long.class)
    int insert(Quotation record);

    int insertSelective(Quotation record);

    List<Quotation> selectByExample(QuotationExample example);

    @Select({
        "select",
        "quotation_id, goods_id, goods_groupId, quotation_type",
        "from final.quotation",
        "where quotation_id = #{quotationId,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.quotation.mapper.QuotationMapper.BaseResultMap")
    Quotation selectByPrimaryKey(Long quotationId);

    int updateByExampleSelective(@Param("record") Quotation record, @Param("example") QuotationExample example);

    int updateByExample(@Param("record") Quotation record, @Param("example") QuotationExample example);

    int updateByPrimaryKeySelective(Quotation record);

    @Update({
        "update final.quotation",
        "set goods_id = #{goodsId,jdbcType=BIGINT},",
          "goods_groupId = #{goodsGroupid,jdbcType=BIGINT},",
          "quotation_type = #{quotationType,jdbcType=TINYINT}",
        "where quotation_id = #{quotationId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Quotation record);
}