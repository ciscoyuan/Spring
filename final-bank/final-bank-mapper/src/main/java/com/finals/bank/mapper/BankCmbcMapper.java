package com.finals.bank.mapper;

import com.finals.bank.model.BankCmbc;
import com.finals.bank.model.BankCmbcExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface BankCmbcMapper {
    long countByExample(BankCmbcExample example);

    int deleteByExample(BankCmbcExample example);

    @Delete({
        "delete from final.bank_cmbc",
        "where cmbc_id = #{cmbcId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long cmbcId);

    @Insert({
        "insert into final.bank_cmbc (bank_id, bank_name, ",
        "bank_card, charge_no, ",
        "protocal_no, bank_branch, ",
        "create_name, create_code, ",
        "create_date, update_name, ",
        "update_code, update_date, ",
        "status)",
        "values (#{bankId,jdbcType=BIGINT}, #{bankName,jdbcType=VARCHAR}, ",
        "#{bankCard,jdbcType=VARCHAR}, #{chargeNo,jdbcType=VARCHAR}, ",
        "#{protocalNo,jdbcType=VARCHAR}, #{bankBranch,jdbcType=VARCHAR}, ",
        "#{createName,jdbcType=VARCHAR}, #{createCode,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateName,jdbcType=VARCHAR}, ",
        "#{updateCode,jdbcType=VARCHAR}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="cmbcId", before=false, resultType=Long.class)
    int insert(BankCmbc record);

    int insertSelective(BankCmbc record);

    List<BankCmbc> selectByExample(BankCmbcExample example);

    @Select({
        "select",
        "cmbc_id, bank_id, bank_name, bank_card, charge_no, protocal_no, bank_branch, ",
        "create_name, create_code, create_date, update_name, update_code, update_date, ",
        "status",
        "from final.bank_cmbc",
        "where cmbc_id = #{cmbcId,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.bank.mapper.BankCmbcMapper.BaseResultMap")
    BankCmbc selectByPrimaryKey(Long cmbcId);

    int updateByExampleSelective(@Param("record") BankCmbc record, @Param("example") BankCmbcExample example);

    int updateByExample(@Param("record") BankCmbc record, @Param("example") BankCmbcExample example);

    int updateByPrimaryKeySelective(BankCmbc record);

    @Update({
        "update final.bank_cmbc",
        "set bank_id = #{bankId,jdbcType=BIGINT},",
          "bank_name = #{bankName,jdbcType=VARCHAR},",
          "bank_card = #{bankCard,jdbcType=VARCHAR},",
          "charge_no = #{chargeNo,jdbcType=VARCHAR},",
          "protocal_no = #{protocalNo,jdbcType=VARCHAR},",
          "bank_branch = #{bankBranch,jdbcType=VARCHAR},",
          "create_name = #{createName,jdbcType=VARCHAR},",
          "create_code = #{createCode,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_name = #{updateName,jdbcType=VARCHAR},",
          "update_code = #{updateCode,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=TINYINT}",
        "where cmbc_id = #{cmbcId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(BankCmbc record);
}