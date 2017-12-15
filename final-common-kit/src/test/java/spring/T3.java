package spring;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class T3 {
	
	private static Properties result = new Properties();
	
	public static void main(String[] args) throws Exception {
		
		ResourcePatternResolver resourceLoader = new PathMatchingResourcePatternResolver();
		Resource[] resources = resourceLoader.getResources("classpath*:*.properties");
		if(null!=resources){
			for (Resource resource : resources) {
				loadPropertiesResource(resource);
			}
		}
		
		System.err.println(result);
		
	}
	
	 private static  Properties loadPropertiesResource(Resource resource) {
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
}
