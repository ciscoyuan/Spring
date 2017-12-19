/**
 * @author liusy
 * @date 2017年12月15日 下午4:55:06
 * @Description 
 */
package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.finals.common.disruptor.DisruptorExample;

/**
 * @author liusy
 * @date 2017年12月15日 下午4:55:06
 * @Description 内存测试类
 */
public class T5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext app= new ClassPathXmlApplicationContext("spring-context.xml","springmvc-context.xml");
		for(int i=0;i<2;i++){
			DisruptorExample<T1> disruptor=app.getBean(DisruptorExample.class);
			System.err.println(disruptor);
		}
	}
	
}
