package spring;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.finals.common.redis.RedisExample;

import redis.clients.jedis.JedisCluster;

public class T1 {
	
	public static void main(String[] args) throws IOException {
		
		try {
			ApplicationContext app= new ClassPathXmlApplicationContext("spring-context.xml","springmvc-context.xml"); 
			RedisExample redisExample=app.getBean(RedisExample.class);
			System.err.println(redisExample.keys(""));
			JedisCluster jedisCluster=app.getBean(JedisCluster.class);
			jedisCluster.get("name");
			System.err.println(app);
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
