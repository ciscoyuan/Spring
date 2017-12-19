package com.finals.common.db;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
/**
 * @author liusy
 * @date 2017年12月3日 下午3:30:13
 * @Description 获取method的工具类
 */
public class JoinPointUtil {
	
	public static Method getMethod(JoinPoint joinPoint){
		try {
			return joinPoint.getTarget().getClass().getInterfaces()[0].getMethod(joinPoint.getSignature().getName(), ((MethodSignature) joinPoint.getSignature()).getMethod().getParameterTypes());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
