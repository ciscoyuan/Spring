package com.finals.common.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 集合、数组操作便捷工具类
 * @author zhangqp 
 * @since 2016年6月2日
 */
public class CollectionExternal {
    
    /**
     * 第一个元素（唯一结果）
     * @param list
     * @return
     */
    public static <T> T uniqueResult(List<T> list) {
        
        return isEmpty(list) ? null : list.get(0);
    }
    
    /**
     * 取唯一结果，传入的集合size集大于1时，抛出异常
     * @param list
     * @return
     */
    public static <T> T uniqueValidResult(List<T> list) {
        
        if (isEmpty(list)) return null;
        
        if (list.size() > 1) 
            throw new RuntimeException("结果集不唯一");
        
        return list.get(0);
    }
    
    /**
     * 取唯一结果，传入的集合size集大于1时，抛出异常
     * @param list
     * @return
     */
    public static <T> T uniqueValidResult(List<T> list, String message) {
        
        if (isEmpty(list)) return null;
        
        if (list.size() > 1) 
            throw new RuntimeException(message);
        
        return list.get(0);
    }
    
    /**
     * java.util.Collections.emptyList()
     * @param coll
     * @return
     * @see java.util.Collections#emptyList()
     */
    public static <T> List<T> emptyList() {
        
        return java.util.Collections.emptyList();
    }
    
	/**
	 * 为null时，返回 Collections.EMPTY_LIST；不为空，返回原值
	 * @param coll
	 * @return
	 */
	public static <T> List<T> emptyIfNull(List<T> coll) {
	    
		if (coll == null) return java.util.Collections.emptyList();
		
		return coll;
	}
	
	public static boolean isEmpty(@SuppressWarnings("rawtypes") Map map) {
        return map == null || map.isEmpty();
    }
    
    public static boolean isNotEmpty(@SuppressWarnings("rawtypes") Map map) {
        return !isEmpty(map);
    }
    
	public static boolean isEmpty(Object[] array) {
		return array == null || array.length == 0;
	}
	
	public static boolean isNotEmpty(Object[] array) {
		return !isEmpty(array);
	}

    @SuppressWarnings("rawtypes")
	public static boolean isEmpty(Collection coll) {
		return coll == null || coll.isEmpty();
	}
	
	@SuppressWarnings("rawtypes")
	public static boolean isNotEmpty(Collection coll) {
		return !isEmpty(coll);
	}
	
	/**
	 * @param array
	 * @param toFind
	 * @param findNull 是否查找null值
	 * @return
	 */
	public static int indexOf(Object[] array, Object toFind, boolean findNull) {
		if (!isEmpty(array)) {
			if (toFind == null) {
				
				if (findNull) {
					for (int i=0; i<array.length; i++) {
						if (array[i] == null) return i;
					}
				}
				
				return -1;
			}
			
			for (int i=0; i<array.length; i++) {
				if (array[i] != null && array[i].equals(toFind)) {
					return i;
				}
			}
		}
		
		return -1;
	}
	
	/**
	 * 不处理null值
	 * @param array
	 * @param toFind
	 * @return
	 */
	public static boolean contains(Object[] array, Object toFind) {
		return indexOf(array, toFind, false) >= 0;
	}

    /**
     * 数组转成ArrayList
     * @param ts
     * @return
     */
//    public static <T> ArrayList<T> newArrayList(T[] ts) {
//        return new ArrayList<T>(Arrays.asList(ts));
//	}
    
    /**
     * 数组转成ArrayList
     * @param ts
     * @return
     */
    @SafeVarargs
    public static <T> ArrayList<T> newArrayList(T... ts) {
        return new ArrayList<T>(Arrays.asList(ts));
    }
    
    /**
     * new ArrayList
     * @param ts
     * @return
     */
    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<T>();
    }
    
    /**
     * new ArrayList
     * @param ts
     * @return
     */
    public static <T> ArrayList<T> newArrayList(int initialCapacity) {
        return new ArrayList<T>(initialCapacity);
    }
    
    /**
     * <pre>
     * 合并数组
     * concat(new Object[]{1,2,3,4}, new Object[]{5,6}) => [1, 2, 3, 4, 5, 6]
     * </pre>
     * @param one
     * @param two
     * @return
     */
    public static Object[] concat(Object[] one, Object[] two) {
        return concat(one, -1, two);
    }
    
    /**
     * <pre>
     * 合并数组：position 为 main 数组的下标位置
     * concat(new Object[]{1,2,3,4}, 1, new Object[]{5,6}) => [1, 5, 6, 2, 3, 4]
     * concat(new Object[]{1,2,3,4}, -1, new Object[]{5,6}) => [1, 2, 3, 4, 5, 6]
     * </pre>
     * @param main
     * @param append
     * @param position base 0
     * @return
     */
    public static Object[] concat(Object[] main, int position, Object... append) {
        Object[] newAry = new Object[main.length + append.length];
       
        if (position >= main.length || position == -1) {
            position = main.length;
        }
        
        System.arraycopy(main, 0, newAry, 0, position);
        System.arraycopy(append, 0, newAry, position, append.length);
        System.arraycopy(main, position, newAry, position + append.length, main.length - position);
        
        return newAry;
    }
}
