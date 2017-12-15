package com.finals.common.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 工具类：数字对象工具
 * @author zhangqp
 * @version 1.0, 14/03/21
 */
public class NumberUtils {
	
	/**
	 * Long 对象是否为空或0
	 * @param num
	 * @return
	 */
	public static boolean isNullOrZero(Long num) {
		return num == null || num.longValue() == 0L;
	}

	/**
	 * Integer 对象不为空且不为0
	 * @param num
	 * @return
	 */
	public static boolean isNotNullOrZero(Long num) {
		return !isNullOrZero(num);
	}
	
	/**
     * Integer 对象是否为空或0
     * @param num
     * @return
     */
    public static boolean isNullOrZero(Integer num) {
        return num == null || num.intValue() == 0;
    }
    
    /**
     * Integer 对象不为空且不为0
     * @param num
     * @return
     */
    public static boolean isNotNullOrZero(Integer num) {
        return !isNullOrZero(num);
    }
    
    /**
     * Double 对象是否为空或0
     * @param num
     * @return
     */
    public static boolean isNullOrZero(Double num) {
        return num == null || num.doubleValue() == 0D;
    }

    /**
     * Double 对象不为空且不为0
     * @param num
     * @return
     */
    public static boolean isNotNullOrZero(Double num) {
        return !isNullOrZero(num);
    }
	
    
	/**
	 * String 为空或等于“0”时，返回true
	 * @param num
	 * @return
	 */
	public static boolean isNotNullOrZero(String num) {
	    num = StringUtils.trim(num);
		return StringUtils.isEmpty(num) || "0".equals(num);
	}
	
	/**
	 * 转换为Long
	 * @param s
	 * @return
	 */
	public static Long longValue(String s) {
	    if (StringUtils.isBlank(s)) return null;
		return Long.valueOf(s.trim());
	}

	/**
	 * 转换为Integer
	 * @param s
	 * @return
	 */
	public static Integer intValue(String s) {
		if (StringUtils.isBlank(s)) return null;
		return Integer.valueOf(s.trim());
	}

	/**
	 * Long.valueOf(object.toString())， 为空时，返回null
	 * @param object
	 * @return
	 */
	public static Long createLong(Object object) {
		return object == null || StringUtils.isEmpty(object.toString()) ? null : Long.valueOf(object.toString());
	}
	
	/**
     * @param object
     * @return
     */
    public static Long createLong(Object object, Long v) {
        return object == null || StringUtils.isEmpty(object.toString()) ? v : Long.valueOf(object.toString());
    }
	
	public static Integer createInteger(Object object, Integer v) {
		return object == null || StringUtils.isEmpty(object.toString()) ? v : Integer.valueOf(object.toString());
	}

	public static Integer createInteger(Object object) {
		return createInteger(object, null);
	}
	
	public static List<Integer> createInteger(Object[] objects) {
		if (objects == null || objects.length == 0) {
			return new ArrayList<>(0);
		}
		List<Integer> list = new ArrayList<>(objects.length);
		for (Object obj : objects) {
			list.add(createInteger(obj, null));
		}
		return list;
	}
	
	public static Double createDouble(Object object) {
		return object == null || StringUtils.isEmpty(object.toString()) ? null : Double.valueOf(object.toString());
	}

	/**
	 * 同时为空则相等
	 * @param i1
	 * @param i2
	 * @return
	 */
	public static boolean equals(Number n1, Number n2) {
		return n1 == null && n2 == null ? true : n1 != null ? n1.equals(n2) : false;
	}

	/**
	 * 如果传入的对象obj为null，则返回对象defaultValue
	 * <pre>
	 * nullAs(longObj, 0L);
	 * </pre>
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static <T> T nullAs(T obj, T defaultValue) {
        return obj == null ? defaultValue : obj;
    }
}