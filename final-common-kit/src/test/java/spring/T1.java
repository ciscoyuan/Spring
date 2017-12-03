package spring;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T1 {
	public static void main(String[] args) throws IOException {
		
		try {
			ApplicationContext app= new ClassPathXmlApplicationContext("spring-context.xml","springmvc-context.xml"); 
			System.err.println(app);
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
