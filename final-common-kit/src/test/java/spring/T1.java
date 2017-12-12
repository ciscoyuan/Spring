package spring;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.finals.api.service.UsersService;

public class T1 {
	public static void main(String[] args) throws IOException {
		
		try {
			ApplicationContext app= new ClassPathXmlApplicationContext("spring-context.xml","springmvc-context.xml"); 
			UsersService service=app.getBean(UsersService.class);
			System.err.println(service);
			System.err.println(app);
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
