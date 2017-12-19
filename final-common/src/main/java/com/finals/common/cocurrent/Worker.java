/**
 * @author liusy
 * @date 2017年12月14日 下午4:16:41
 * @Description 
 */
package com.finals.common.cocurrent;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @author liusy
 * @date 2017年12月14日 下午4:16:41
 * @Description 任务消费者.
 */
public class Worker implements Runnable{
	protected static final Integer critical=10000;
	
	protected ConcurrentLinkedQueue<Runnable> queue;
	
	protected CountDownLatch countDownLatch;
	
	protected  AtomicInteger account;
	
	protected AtomicBoolean flag;
	
	public AtomicBoolean getFlag() {
		return flag;
	}

	public void setFlag(AtomicBoolean flag) {
		this.flag = flag;
	}

	public ConcurrentLinkedQueue<Runnable> getQueue() {
		return queue;
	}

	public void setQueue(ConcurrentLinkedQueue<Runnable> queue) {
		this.queue = queue;
	}

	public void setAccount(AtomicInteger account) {
		this.account = account;
	}

	public void setCountDownLatch(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		
		while(account.get()>=0&&Boolean.TRUE==flag.get()){
			if(queue.size()>critical){
					queue.clear();//防止溢出.单词处理记录最多仅支持10000任务.请自行用beanFactory拿几个MultiTaskUtil实例然后分开各跑10000个任务.
			}
		    if(queue!=null&&queue.size()>0){
			    Runnable task=queue.poll();
			    account.decrementAndGet();
				if(task!=null){
					task.run();
				}
			}
		    //当运行完时,关闭当前线程.
		    if(account.get()==0){
		    	try {
					countDownLatch.await(1,TimeUnit.SECONDS);
					flag.set(false);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		    }
		}
		
	}
	
}
