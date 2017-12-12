package com.finals.bank.mapper;

import com.finals.bank.model.BankBase;
import com.finals.bank.model.BankBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface BankBaseMapper {
    long countByExample(BankBaseExample example);

    int deleteByExample(BankBaseExample example);

    @Delete({
        "delete from final.bank_base",
        "where bank_id = #{bankId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long bankId);

    @Insert({
        "insert into final.bank_base (bank_name, bank_type, ",
        "bank_rate, create_name, ",
        "create_code, create_date, ",
        "update_name, update_code, ",
        "update_date, status)",
        "values (#{bankName,jdbcType=VARCHAR}, #{bankType,jdbcType=TINYINT}, ",
        "#{bankRate,jdbcType=DOUBLE}, #{createName,jdbcType=VARCHAR}, ",
        "#{createCode,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateName,jdbcType=VARCHAR}, #{updateCode,jdbcType=VARCHAR}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{status,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="bankId", before=false, resultType=Long.class)
    int insert(BankBase record);

    int insertSelective(BankBase record);

    List<BankBase> selectByExample(BankBaseExample example);

    @Select({
        "select",
        "bank_id, bank_name, bank_type, bank_rate, create_name, create_code, create_date, ",
        "update_name, update_code, update_date, status",
        "from final.bank_base",
        "where bank_id = #{bankId,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.bank.mapper.BankBaseMapper.BaseResultMap")
    BankBase selectByPrimaryKey(Long bankId);

    int updateByExampleSelective(@Param("record") BankBase record, @Param("example") BankBaseExample example);

    int updateByExample(@Param("record") BankBase record, @Param("example") BankBaseExample example);

    int updateByPrimaryKeySelective(BankBase record);

    @Update({
        "update final.bank_base",
        "set bank_name = #{bankName,jdbcType=VARCHAR},",
          "bank_type = #{bankType,jdbcType=TINYINT},",
          "bank_rate = #{bankRate,jdbcType=DOUBLE},",
          "create_name = #{createName,jdbcType=VARCHAR},",
          "create_code = #{createCode,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_name = #{updateName,jdbcType=VARCHAR},",
          "update_code = #{updateCode,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=TINYINT}",
        "where bank_id = #{bankId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(BankBase record);
}