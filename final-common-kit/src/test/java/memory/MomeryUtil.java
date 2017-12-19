///**
// * @author liusy
// * @date 2017年12月15日 下午5:05:10
// * @Description 
// */
//package memory;
//
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;
//
//import org.springframework.stereotype.Component;
//
///**
// * @author liusy
// * @date 2017年12月15日 下午5:05:31
// * @Description 获取内存使用率.每200毫秒刷新一次.
// */
//@Component
//public class MomeryUtil {
//	
//	Boolean init=init();
//	
//	ScheduledExecutorService schedule=Executors.newScheduledThreadPool(3);
//	
//	private Boolean init() {
//		
//		schedule.schedule(new Runnable() {
//			
//			@Override
//			public void run() {
//				
//				totalMemory=Runtime.getRuntime().totalMemory();
//				freeMemory=Runtime.getRuntime().freeMemory();
//				maxMemory=Runtime.getRuntime().maxMemory();
//				
//			}
//		}, 200, TimeUnit.MILLISECONDS);
//		return Boolean.TRUE;
//		
//	}
//	
//	/** 可使用内存. */
//	private long totalMemory;
//
//	/** 剩余内存. */
//	private long freeMemory;
//
//	/** 最大可使用内存. */
//	private long maxMemory;
//
//	/**使用利率*/
//	private double rate;
//	
//	/**最大内存时的使用利率*/
//	private double maxRate;
//
//	public long getTotalMemory() {
//		return totalMemory;
//	}
//
//	public long getFreeMemory() {
//		return freeMemory;
//	}
//
//	public long getMaxMemory() {
//		return maxMemory;
//	}
//
//	public double getRate() {
//		return rate;
//	}
//
//	public double getMaxRate() {
//		return maxRate;
//	}
//	
//}