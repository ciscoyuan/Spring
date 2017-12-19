/**
 * @author liusy
 * @date 2017年12月14日 下午4:09:09
 * @Description 
 */
package com.finals.common.cocurrent;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * @author liusy
 * @date 2017年12月14日 下午4:09:09
 * @Description 线程处理类,Excutors老出毛病.然后写了个简单版的,当1000个任务的时候会比较快,100万个任务同时跑效率就会变慢了,后期再优化...
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MultiTaskUtil {

	public ConcurrentLinkedQueue<Runnable> queue=new ConcurrentLinkedQueue<>();
	
	protected HashMap<Integer,Thread> workers=new HashMap<>();
	
	protected AtomicInteger account=new AtomicInteger(0);
	
	protected CountDownLatch countDownLatch=new CountDownLatch(1);
	
	private Worker worker=new Worker();
	
	public Boolean init =init(10);
	
	public Boolean init(int count) {
		
		fillProperty(worker);
		if(count==0){
			throw new RuntimeException("请指定工人数量.");
		}
		for(int i=0;i<count;i++){
			workers.put(i, new Thread(worker));
		}
		
		return Boolean.TRUE;
		
	}
	
	/**
	 * @author liusy
	 * @date 2017年9月6日 下午3:58:34
	 * @Description 提交任务
	 */
	public synchronized void submit(Runnable Task){
		
		queue.add(Task);
		account.incrementAndGet();
		
	}
	
	/**
	 * @author liusy
	 * @date 2017年9月6日 下午3:58:43
	 * @Description 工人开工
	 */
	public synchronized void excuteAll(){
		
		fillProperty(worker);//这里主要是为了将flag刷进worker
		if(workers.size()!=0){
			Set<Integer> set=workers.keySet();
			for (Integer integer : set) {
				if(workers.get(integer).getState().equals(Thread.State.TERMINATED)){
					workers.put(integer, destoryAndCreate());
					workers.get(integer).start();
				}
				if(workers.get(integer).getState().equals(Thread.State.NEW)){
					workers.get(integer).start();
				}
			}
		}
		
	}
	
	/**
	 * @author liusy
	 * @date 2017年9月6日 下午3:59:04
	 * @Description 获得任务总数
	 */
	public int getAccount(){
		
		return account.get();
		
	}
	
	/**
	 * @author liusy
	 * @date 2017年9月6日 下午3:59:13
	 * @Description 重建线程
	 */
	protected Thread destoryAndCreate(){
		
		return new Thread(worker);
		
	}
	
	/**
	 * @author liusy
	 * @date 2017年9月6日 下午3:59:29
	 * @Description 填充工人属性
	 */
	protected void fillProperty(Worker worker){
		
		worker.setAccount(account);
		worker.setCountDownLatch(countDownLatch);
		worker.setQueue(queue);
		worker.setFlag(new AtomicBoolean(true));
		
	}
	
	/**
	 * @author liusy
	 * @date 2017年12月15日 下午4:41:32
	 * @Description 判断里面是否还有任务在跑
	 */
	public Boolean hasStop(){
		return queue.size()==0?true:false;
	}
	
}
