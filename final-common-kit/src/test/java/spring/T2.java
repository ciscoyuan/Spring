//package spring;
//
//import java.io.IOException;
//import java.util.concurrent.ConcurrentLinkedQueue;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.locks.ReentrantLock;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//
//
//public class T2 {
//	
//	private ConcurrentLinkedQueue<Integer> queue=new ConcurrentLinkedQueue<>();
//	
//	ReentrantLock lock=new ReentrantLock();
//	
//	public static void main(String[] args) throws IOException {
//		new T2().run();
//	}
//	
//	private void run(){
//		ExecutorService executorService=Executors.newFixedThreadPool(50);
//		for(int i=0;i<50;i++){
//			executorService.execute(new Runnable() {
//				
//				@Override
//				public void run() {
//					ApplicationContext app= new ClassPathXmlApplicationContext("dubbox-consumer.xml"); 
//					System.err.println(app);
//					AccBaseService userService=app.getBean(AccBaseService.class);
//					excute(userService);
//				}
//			});
//		}
//		executorService.shutdown();
//		
//	}
//	
//	private void excute(AccBaseService userService){
//		try {
//			lock.lock();
//			queue.add(0);
//			System.err.println("password "+queue.size()+" : "+userService.testApi(1l).getCreateDate());
//		} finally {
//			lock.unlock();
//		}
//	}
//	
//}
