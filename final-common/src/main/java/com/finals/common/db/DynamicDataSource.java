package com.finals.common.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author liusy
 * @date 2017年11月19日 下午11:06:28
 * @Description 指定和获取数据源
 */
public class DynamicDataSource extends AbstractRoutingDataSource{

	@Override
	protected Object determineCurrentLookupKey() {
		return DynamicDataSourceHolder.getDataSouce();
	}
	
}

class DynamicDataSourceHolder {  
    public static final ThreadLocal<String> holder = new ThreadLocal<String>();  
  
    public static void putDataSource(String name) {  
        holder.set(name);  
    }  
  
    public static String getDataSouce() {  
        return holder.get();  
    }  
}  