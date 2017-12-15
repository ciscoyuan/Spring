/**
 * @author liusy
 * @date 2017年12月15日 下午5:05:10
 * @Description 
 */
package com.finals.common.memory;

import com.finals.common.util.NumberUtils;

public class MomeryUtil {

	public static Boolean getRate() {
		return NumberUtils.createDouble(Runtime.getRuntime().freeMemory())/NumberUtils.createDouble(Runtime.getRuntime().maxMemory())<0.8?true:false;
	}
	
}