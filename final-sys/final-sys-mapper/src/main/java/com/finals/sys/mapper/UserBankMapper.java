package com.finals.sys.mapper;

import com.finals.sys.model.UserBank;
import com.finals.sys.model.UserBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface UserBankMapper {
    long countByExample(UserBankExample example);

    int deleteByExample(UserBankExample example);

    @Delete({
        "delete from final.user_bank",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userId);

    @Insert({
        "insert into final.user_bank (bank_id, create_name, ",
        "create_code, create_date, ",
        "update_name, update_code, ",
        "update_date, status)",
        "values (#{bankId,jdbcType=BIGINT}, #{createName,jdbcType=VARCHAR}, ",
        "#{createCode,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateName,jdbcType=VARCHAR}, #{updateCode,jdbcType=VARCHAR}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{status,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userId", before=false, resultType=Long.class)
    int insert(UserBank record);

    int insertSelective(UserBank record);

    List<UserBank> selectByExample(UserBankExample example);

    @Select({
        "select",
        "user_id, bank_id, create_name, create_code, create_date, update_name, update_code, ",
        "update_date, status",
        "from final.user_bank",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.sys.mapper.UserBankMapper.BaseResultMap")
    UserBank selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserBank record, @Param("example") UserBankExample example);

    int updateByExample(@Param("record") UserBank record, @Param("example") UserBankExample example);

    int updateByPrimaryKeySelective(UserBank record);

    @Update({
        "update final.user_bank",
        "set bank_id = #{bankId,jdbcType=BIGINT},",
          "create_name = #{createName,jdbcType=VARCHAR},",
          "create_code = #{createCode,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_name = #{updateName,jdbcType=VARCHAR},",
          "update_code = #{updateCode,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=TINYINT}",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserBank record);
}