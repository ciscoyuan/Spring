package com.finals.acc.mapper;

import com.finals.acc.model.AccBase;
import com.finals.acc.model.AccBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface AccBaseMapper {
    long countByExample(AccBaseExample example);

    int deleteByExample(AccBaseExample example);

    @Delete({
        "delete from final.acc_base",
        "where account_id = #{accountId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long accountId);

    @Insert({
        "insert into final.acc_base (type, price, ",
        "create_name, create_code, ",
        "create_date, update_name, ",
        "update_code, update_date, ",
        "status)",
        "values (#{type,jdbcType=TINYINT}, #{price,jdbcType=BIGINT}, ",
        "#{createName,jdbcType=VARCHAR}, #{createCode,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateName,jdbcType=VARCHAR}, ",
        "#{updateCode,jdbcType=VARCHAR}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="accountId", before=false, resultType=Long.class)
    int insert(AccBase record);

    int insertSelective(AccBase record);

    List<AccBase> selectByExample(AccBaseExample example);

    @Select({
        "select",
        "account_id, type, price, create_name, create_code, create_date, update_name, ",
        "update_code, update_date, status",
        "from final.acc_base",
        "where account_id = #{accountId,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.acc.mapper.AccBaseMapper.BaseResultMap")
    AccBase selectByPrimaryKey(Long accountId);

    int updateByExampleSelective(@Param("record") AccBase record, @Param("example") AccBaseExample example);

    int updateByExample(@Param("record") AccBase record, @Param("example") AccBaseExample example);

    int updateByPrimaryKeySelective(AccBase record);

    @Update({
        "update final.acc_base",
        "set type = #{type,jdbcType=TINYINT},",
          "price = #{price,jdbcType=BIGINT},",
          "create_name = #{createName,jdbcType=VARCHAR},",
          "create_code = #{createCode,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_name = #{updateName,jdbcType=VARCHAR},",
          "update_code = #{updateCode,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=TINYINT}",
        "where account_id = #{accountId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AccBase record);
}