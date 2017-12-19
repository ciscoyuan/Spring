package spring;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.finals.common.cocurrent.MultiTaskUtil;

public class T4 {
	
	
	private AtomicInteger count=new AtomicInteger(0);
	
	public static void main(String[] args) throws IOException {

		new T4().zdd();
		
	}
	
	private void zdd(){
		
		try {
			@SuppressWarnings("resource")
			ApplicationContext app= new ClassPathXmlApplicationContext("spring-context.xml","springmvc-context.xml");
			for(int j=0;j<3;j++){
				MultiTaskUtil multiTaskUtil=app.getBean(MultiTaskUtil.class);
				long start,end;
				start = System.currentTimeMillis();
				for(int i=0;i<10;i++){
					multiTaskUtil.submit(new Runnable() {
						
						@Override
						public void run() {
							handler(count);
						}
					});
				}
				multiTaskUtil.excuteAll();
				while(multiTaskUtil.queue.size()>0){
					System.err.println(multiTaskUtil);
				}
				end = System.currentTimeMillis();
				System.err.println("spend:"+(end-start)+"ms");
			}
			System.in.read();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private synchronized void handler(AtomicInteger count){
		
		System.err.println(count.getAndIncrement());
		
	}
	
	
}
