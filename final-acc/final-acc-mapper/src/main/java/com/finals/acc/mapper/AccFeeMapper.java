package com.finals.acc.mapper;

import com.finals.acc.model.AccFee;
import com.finals.acc.model.AccFeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface AccFeeMapper {
    long countByExample(AccFeeExample example);

    int deleteByExample(AccFeeExample example);

    @Delete({
        "delete from final.acc_fee",
        "where fee_id = #{feeId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long feeId);

    @Insert({
        "insert into final.acc_fee (account_id, total_money)",
        "values (#{accountId,jdbcType=BIGINT}, #{totalMoney,jdbcType=BIGINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="feeId", before=false, resultType=Long.class)
    int insert(AccFee record);

    int insertSelective(AccFee record);

    List<AccFee> selectByExample(AccFeeExample example);

    @Select({
        "select",
        "fee_id, account_id, total_money",
        "from final.acc_fee",
        "where fee_id = #{feeId,jdbcType=BIGINT}"
    })
    @ResultMap("com.finals.acc.mapper.AccFeeMapper.BaseResultMap")
    AccFee selectByPrimaryKey(Long feeId);

    int updateByExampleSelective(@Param("record") AccFee record, @Param("example") AccFeeExample example);

    int updateByExample(@Param("record") AccFee record, @Param("example") AccFeeExample example);

    int updateByPrimaryKeySelective(AccFee record);

    @Update({
        "update final.acc_fee",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "total_money = #{totalMoney,jdbcType=BIGINT}",
        "where fee_id = #{feeId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AccFee record);
}