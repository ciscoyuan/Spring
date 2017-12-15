package com.finals.sys.mapper;

import com.finals.sys.model.SysUser;
import com.finals.sys.model.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface SysUserMapper {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    @Delete({
        "delete from final.sys_user",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userId);

    @Insert({
        "insert into final.sys_user (user_code, user_name, ",
        "user_type, mobile, ",
        "password, account_id, ",
        "create_name, create_code, ",
        "create_date, update_name, ",
        "update_code, update_date, ",
        "status)",
        "values (#{userCode,jdbcType=VARCHAR}, #{userName,jdbcType=VARCHAR}, ",
        "#{userType,jdbcType=TINYINT}, #{mobile,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{accountId,jdbcType=BIGINT}, ",
        "#{createName,jdbcType=VARCHAR}, #{createCode,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateName,jdbcType=VARCHAR}, ",
        "#{updateCode,jdbcType=VARCHAR}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userId", before=false, resultType=Long.class)
    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    @Select({
        "select",
        "user_id, user_code, user_name, user_type, mobile, password, account_id, create_name, ",
        "create_code, create_date, update_name, update_code, update_date, status",
        "from final.sys_user",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.sys.mapper.SysUserMapper.BaseResultMap")
    SysUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    @Update({
        "update final.sys_user",
        "set user_code = #{userCode,jdbcType=VARCHAR},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "user_type = #{userType,jdbcType=TINYINT},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "account_id = #{accountId,jdbcType=BIGINT},",
          "create_name = #{createName,jdbcType=VARCHAR},",
          "create_code = #{createCode,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_name = #{updateName,jdbcType=VARCHAR},",
          "update_code = #{updateCode,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=TINYINT}",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysUser record);
}