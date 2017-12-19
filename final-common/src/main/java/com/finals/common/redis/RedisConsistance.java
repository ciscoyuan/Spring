/**
 * @author liusy
 * @date 2017年12月14日 下午3:02:55
 * @Description 
 */
package com.finals.common.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.finals.common.util.PropertiesUtil;

/**
 * @author liusy
 * @date 2017年12月14日 下午3:02:55
 * @Description redis常量类
 */
@Component
public class RedisConsistance {
	
	@Autowired
	private PropertiesUtil propertiesUtil;

	public static final String HOST1="host1";
	
	public static final String HOST2="host2";
	
	public static final String HOST3="host3";
	
	public static final String HOST4="host4";
	
	public static final String HOST5="host5";
	
	public static final String HOST6="host6";
	
	public static final String PORT1="port1";
	
	public static final String PORT2="port2";
	
	public static final String PORT3="port3";
	
	public static final String PORT4="port4";
	
	public static final String PORT5="port5";
	
	public static final String PORT6="port6";
	
	public String getAddress(Integer index){
		switch (index) {
		case 1:
			return propertiesUtil.get(HOST1)+":"+propertiesUtil.get(PORT1);
		case 2:
			return propertiesUtil.get(HOST2)+":"+propertiesUtil.get(PORT2);
		case 3:
			return propertiesUtil.get(HOST3)+":"+propertiesUtil.get(PORT3);
		case 4:
			return propertiesUtil.get(HOST4)+":"+propertiesUtil.get(PORT4);
		case 5:
			return propertiesUtil.get(HOST5)+":"+propertiesUtil.get(PORT5);
		case 6:
			return propertiesUtil.get(HOST6)+":"+propertiesUtil.get(PORT6);
		}
		return null;
	}
	
}
