package com.finals.common.util;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Component;

/**
 * @author liusy
 * @date 2017年12月13日 下午6:24:38
 * @Description 配置文件键值对工具类,注入到Spring的目的是Spring初始化时就会把属性弄进去.避免第一次获取键值对时还要先加载一遍.费时长.
 */
@Component
public class PropertiesUtil {

	public volatile Properties result = new Properties();
	
	public Boolean status = init();
	
	public Boolean init() {

		ResourcePatternResolver resourceLoader = new PathMatchingResourcePatternResolver();
		Resource[] resources;
		try {
			resources = resourceLoader.getResources("classpath*:*.properties");
			if (null != resources) {
				for (Resource resource : resources) {
					loadPropertiesResource(resource);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.err.println(result);
		
		return Boolean.TRUE;
		
	}

	private  Properties loadPropertiesResource(Resource resource) {
		try {
			if (resource.getFilename().endsWith(".xml")) {
				result.loadFromXML(resource.getInputStream());
			} else {
				result.load(resource.getInputStream());
			}
			return result;
		} catch (IOException e) {
			throw new RuntimeException("Resource to properties fail.", e);
		}
	}
	
	/**
	 * @author liusy
	 * @date 2017年12月13日 下午6:27:48
	 * @Description 根据key返回value.
	 */
	public  String get(String key){
		return result.getProperty(key);
	}

}
