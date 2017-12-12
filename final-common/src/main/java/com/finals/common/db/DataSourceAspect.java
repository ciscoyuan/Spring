package com.finals.common.db;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;

/**
 * @author liusy
 * @date 2017年11月20日 上午10:00:41
 * @Description 数据源切面
 */
public class DataSourceAspect {
	
	public void before(JoinPoint joinPoint) throws NoSuchMethodException, SecurityException{
		
		Method method=JoinPointUtil.getMethod(joinPoint);
		
		if (null!=method && method.isAnnotationPresent(DataSource.class)) {  
            DataSource data = method.getAnnotation(DataSource.class);  
            DynamicDataSourceHolder.putDataSource(data.value());  
        }  
        
    }  
	
}
