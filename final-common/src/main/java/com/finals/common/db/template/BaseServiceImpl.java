/**
 * @author liusy
 * @date 2017年11月24日 下午4:22:48
 * @Description 
 */
package com.finals.common.db.template;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.finals.common.util.CollectionExternal;
import com.finals.common.util.NumberUtils;
import com.finals.common.util.PageObject;


/**
 * @author liusy
 * @date 2017年11月24日 下午4:22:48
 * @Description 
 */
public abstract class BaseServiceImpl<Mapper, Record, Example> implements BaseService<Record, Example>{

	@Autowired
	protected Mapper mapper;

	@Override
	public PageObject listPageByExample(Example example) {
		
		List<?> list=selectByExample(example);
		if(CollectionExternal.isNotEmpty(list)){
			PageObject pageObject=new PageObject();
			pageObject.setRows(list);
			pageObject.setTotal(NumberUtils.createLong(list.size()));
			return pageObject;
		}
		return null;
		
	}
	
	@Override
	public long countByExample(Example example) {
		return invoke("countByExample", example);
	}

	@Override
	public int deleteByExample(Example example) {
		return invoke("deleteByExample", example);
	}

	@Override
	public int deleteByPrimaryKey(Number key) {
		return invoke("deleteByPrimaryKey", key);
	}

	@Override
	public int insert(Example record) {
		return invoke("insert", record);
	}

	@Override
	public int insertSelective(Example record) {
		return invoke("insertSelective", record);
	}

	@Override
	public List<Record> selectByExample(Example example) {
		return invoke("selectByExample", example);
	}

	@Override
	public Record selectByPrimaryKey(Number key) {
		return invoke("selectByPrimaryKey", key);
	}

	@Override
	public int updateByExampleSelective(Record record, Example example) {
		return invoke("updateByExampleSelective", record,example);
	}

	@Override
	public int updateByExample(Record record, Example example) {
		return invoke("updateByExample", example);
	}

	@Override
	public int updateByPrimaryKeySelective(Record record) {
		return invoke("updateByPrimaryKeySelective", record);
	}

	@Override
	public int updateByPrimaryKey(Record record) {
		return invoke("updateByPrimaryKey", record);
	}
	
	private <T> T invoke(String method,Object ... args){
		try {
			 Method instance=mapper.getClass().getDeclaredMethod(method, getClasses(args));
			 return (T)instance.invoke(mapper, args);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		
	}
	
	@SuppressWarnings("rawtypes")
	private Class[] getClasses(Object ... args){
		Class[] classs=new Class[args.length];
		for(int i=0;i<args.length;i++){
			classs[i]=args[i].getClass();
		}
		return classs;
	}
	
}
