package com.finals.acc.mapper;

import com.finals.acc.model.AccLog;
import com.finals.acc.model.AccLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface AccLogMapper {
    long countByExample(AccLogExample example);

    int deleteByExample(AccLogExample example);

    @Delete({
        "delete from final.acc_log",
        "where log_id = #{logId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long logId);

    @Insert({
        "insert into final.acc_log (account_id, type, ",
        "price, create_name, ",
        "create_code, create_date, ",
        "update_name, update_code, ",
        "update_date)",
        "values (#{accountId,jdbcType=BIGINT}, #{type,jdbcType=TINYINT}, ",
        "#{price,jdbcType=BIGINT}, #{createName,jdbcType=VARCHAR}, ",
        "#{createCode,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateName,jdbcType=VARCHAR}, #{updateCode,jdbcType=VARCHAR}, ",
        "#{updateDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="logId", before=false, resultType=Long.class)
    int insert(AccLog record);

    int insertSelective(AccLog record);

    List<AccLog> selectByExample(AccLogExample example);

    @Select({
        "select",
        "log_id, account_id, type, price, create_name, create_code, create_date, update_name, ",
        "update_code, update_date",
        "from final.acc_log",
        "where log_id = #{logId,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.acc.mapper.AccLogMapper.BaseResultMap")
    AccLog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") AccLog record, @Param("example") AccLogExample example);

    int updateByExample(@Param("record") AccLog record, @Param("example") AccLogExample example);

    int updateByPrimaryKeySelective(AccLog record);

    @Update({
        "update final.acc_log",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "type = #{type,jdbcType=TINYINT},",
          "price = #{price,jdbcType=BIGINT},",
          "create_name = #{createName,jdbcType=VARCHAR},",
          "create_code = #{createCode,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_name = #{updateName,jdbcType=VARCHAR},",
          "update_code = #{updateCode,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP}",
        "where log_id = #{logId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AccLog record);
}