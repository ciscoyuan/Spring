package com.finals.bank.mapper;

import com.finals.bank.model.BankIcbc;
import com.finals.bank.model.BankIcbcExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface BankIcbcMapper {
    long countByExample(BankIcbcExample example);

    int deleteByExample(BankIcbcExample example);

    @Delete({
        "delete from final.bank_icbc",
        "where bank_id = #{bankId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long bankId);

    @Insert({
        "insert into final.bank_icbc (bank_name, bank_card, ",
        "accredit_name, accredit_card_type, ",
        "accredit_card_number, mobile, ",
        "create_name, create_code, ",
        "create_date, update_name, ",
        "update_code, update_date, ",
        "status)",
        "values (#{bankName,jdbcType=VARCHAR}, #{bankCard,jdbcType=VARCHAR}, ",
        "#{accreditName,jdbcType=VARCHAR}, #{accreditCardType,jdbcType=TINYINT}, ",
        "#{accreditCardNumber,jdbcType=VARCHAR}, #{mobile,jdbcType=BIGINT}, ",
        "#{createName,jdbcType=VARCHAR}, #{createCode,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateName,jdbcType=VARCHAR}, ",
        "#{updateCode,jdbcType=VARCHAR}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="bankId", before=false, resultType=Long.class)
    int insert(BankIcbc record);

    int insertSelective(BankIcbc record);

    List<BankIcbc> selectByExample(BankIcbcExample example);

    @Select({
        "select",
        "bank_id, bank_name, bank_card, accredit_name, accredit_card_type, accredit_card_number, ",
        "mobile, create_name, create_code, create_date, update_name, update_code, update_date, ",
        "status",
        "from final.bank_icbc",
        "where bank_id = #{bankId,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.bank.mapper.BankIcbcMapper.BaseResultMap")
    BankIcbc selectByPrimaryKey(Long bankId);

    int updateByExampleSelective(@Param("record") BankIcbc record, @Param("example") BankIcbcExample example);

    int updateByExample(@Param("record") BankIcbc record, @Param("example") BankIcbcExample example);

    int updateByPrimaryKeySelective(BankIcbc record);

    @Update({
        "update final.bank_icbc",
        "set bank_name = #{bankName,jdbcType=VARCHAR},",
          "bank_card = #{bankCard,jdbcType=VARCHAR},",
          "accredit_name = #{accreditName,jdbcType=VARCHAR},",
          "accredit_card_type = #{accreditCardType,jdbcType=TINYINT},",
          "accredit_card_number = #{accreditCardNumber,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=BIGINT},",
          "create_name = #{createName,jdbcType=VARCHAR},",
          "create_code = #{createCode,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_name = #{updateName,jdbcType=VARCHAR},",
          "update_code = #{updateCode,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=TINYINT}",
        "where bank_id = #{bankId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(BankIcbc record);
}