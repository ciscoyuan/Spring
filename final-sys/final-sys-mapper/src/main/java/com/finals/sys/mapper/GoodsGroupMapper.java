package com.finals.sys.mapper;

import com.finals.sys.model.GoodsGroup;
import com.finals.sys.model.GoodsGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface GoodsGroupMapper {
    long countByExample(GoodsGroupExample example);

    int deleteByExample(GoodsGroupExample example);

    @Delete({
        "delete from final.goods_group",
        "where group_id = #{groupId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long groupId);

    @Insert({
        "insert into final.goods_group (group_name, create_name, ",
        "create_code, create_date, ",
        "update_name, update_code, ",
        "update_date, status)",
        "values (#{groupName,jdbcType=VARCHAR}, #{createName,jdbcType=VARCHAR}, ",
        "#{createCode,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateName,jdbcType=VARCHAR}, #{updateCode,jdbcType=VARCHAR}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{status,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="groupId", before=false, resultType=Long.class)
    int insert(GoodsGroup record);

    int insertSelective(GoodsGroup record);

    List<GoodsGroup> selectByExample(GoodsGroupExample example);

    @Select({
        "select",
        "group_id, group_name, create_name, create_code, create_date, update_name, update_code, ",
        "update_date, status",
        "from final.goods_group",
        "where group_id = #{groupId,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.sys.mapper.GoodsGroupMapper.BaseResultMap")
    GoodsGroup selectByPrimaryKey(Long groupId);

    int updateByExampleSelective(@Param("record") GoodsGroup record, @Param("example") GoodsGroupExample example);

    int updateByExample(@Param("record") GoodsGroup record, @Param("example") GoodsGroupExample example);

    int updateByPrimaryKeySelective(GoodsGroup record);

    @Update({
        "update final.goods_group",
        "set group_name = #{groupName,jdbcType=VARCHAR},",
          "create_name = #{createName,jdbcType=VARCHAR},",
          "create_code = #{createCode,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_name = #{updateName,jdbcType=VARCHAR},",
          "update_code = #{updateCode,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=TINYINT}",
        "where group_id = #{groupId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GoodsGroup record);
}