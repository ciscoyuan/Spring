/**
 * @author liusy
 * @date 2017年11月24日 下午4:18:14
 * @Description 
 */
package com.finals.common.db.template;

import java.util.List;

import javax.ws.rs.GET;

import org.apache.ibatis.annotations.Param;

import com.finals.common.util.PageObject;


/**
 * @author liusy
 * @date 2017年11月24日 下午4:18:14
 * @Description 
 */
public interface BaseService<Record, Example> {
	
	@GET
	PageObject listPageByExample(Example example);
	
	@GET
    long countByExample(Example example);

	@GET
    int deleteByExample(Example example);

	@GET
    int deleteByPrimaryKey(Number key);
    
	@GET
    int insert(Example record);

	@GET
    int insertSelective(Example record);
    
	@GET
    List<Record> selectByExample(Example example);

	@GET
    Record selectByPrimaryKey(Number key);

	@GET
    int updateByExampleSelective(@Param("record") Record record, @Param("example") Example example);

	@GET
    int updateByExample(@Param("record") Record record, @Param("example") Example example);

	@GET
    int updateByPrimaryKeySelective(Record record);

	@GET
    int updateByPrimaryKey(Record record);
    
}
