package com.finals.sys.mapper;

import com.finals.sys.model.Users;
import com.finals.sys.model.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    @Delete({
        "delete from home.users",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into home.users (user_code, password)",
        "values (#{userCode,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    @Select({
        "select",
        "id, user_code, password",
        "from home.users",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.finals.sys.mapper.UsersMapper.BaseResultMap")
    Users selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    @Update({
        "update home.users",
        "set user_code = #{userCode,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Users record);
}