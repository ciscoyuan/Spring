/**
 * @author liusy
 * @date 2017年12月18日 下午7:43:21
 * @Description 
 */
package com.finals.common.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author liusy
 * @date 2017年12月18日 下午7:43:21
 * @Description 一个个往上怼...
 */
public class BeanCopyUtil {

	public static void copy(Map<String, Object> source,Object target){
		
		try {
			for (Map.Entry<String, Object> entry : source.entrySet()) {  
			Field[] fields = target.getClass().getDeclaredFields(); 
			List<Field> filedsList = Arrays.asList(fields);
			List<String> filedsNameList=new ArrayList<>();
			for (Field field : filedsList) {
				filedsNameList.add(field.getName());
			}
			if(filedsNameList.contains(entry.getKey())){
				 Field declaredField = filedsList.get(filedsNameList.indexOf(entry.getKey()));
				 declaredField.setAccessible(true);
				 declaredField.set(target, entry.getValue());
			}
		  
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
