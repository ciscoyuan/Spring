/**
 * @author liusy
 * @date 2017年12月18日 下午12:28:50
 * @Description 
 */
package com.finals.common.disruptor;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

/**
 * @author liusy
 * @date 2017年12月18日 下午12:28:50
 * @Description 流处理框架 使用时记得把被使用的类的scope也改成原型  @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE),不然spring只加载了一次.所有人都用同一个disruptor里的ringbuffer对象数据就全乱了.
 * 
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DisruptorExample<Event> {
	
	@Autowired
	private BeanFactory beanFactory;
	
	private Disruptor<Event> disruptor=null;
	
	ThreadFactory defaultThreadFactory =null;
	
	private Class<Event> clazz;
	
	private static final String BEANFACTORY="beanFactory";
	
	private ConcurrentLinkedQueue<List<EventHandler<Event>>> exampleQueue=new ConcurrentLinkedQueue<>();
	
	/**
	 * @author liusy
	 * @date 2017年12月18日 下午2:51:43
	 * @Description release resource
	 */
	public void start(List<Event> list){
		
		disruptor.start();
		defaultThreadFactory.newThread(new DisruptorPublisherExample<>(disruptor,list)).start();
		
	}
	
	/**
	 * @author liusy
	 * @date 2017年12月18日 下午2:51:43
	 * @Description release resource
	 */
	public void startMap(List<Map<String, Object>> maplist){
		
		disruptor.start();
		defaultThreadFactory.newThread(new DisruptorPublisherExample<>(disruptor,maplist,null)).start();
		
	}
	
	/**
	 * @author liusy
	 * @date 2017年12月18日 下午12:37:03
	 * @Description 初始化disruptor
	 */
	private Boolean init() {
		
		defaultThreadFactory=Executors.defaultThreadFactory();
		
		disruptor=new Disruptor<>(new EventFactory<Event>() {
	
				@Override
				public Event newInstance() {
					return fillEvent();
				}
			}, 16, defaultThreadFactory, ProducerType.SINGLE, new BlockingWaitStrategy());
		
		return true;
		
	}
	
	public DisruptorExample<Event>  handlerWith(EventHandler<Event> ... handler){
		
		disruptor.handleEventsWith(handler);
		exampleQueue.add(Arrays.asList(handler));
		
		return this;
		
	}
	
	public DisruptorExample<Event>  after(EventHandler<Event> ... handler){
		
		disruptor.after(handler);
		exampleQueue.add(Arrays.asList(handler));
		
		return this;
		
	}
	
	private Event fillEvent(){
		
		Event event = null;
		try {
			event=this.clazz.newInstance();
			Field field=this.clazz.getDeclaredField(BEANFACTORY);
			field.setAccessible(true);
			field.set(event, beanFactory);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return event;
		
	}

	/**
	 * @author liusy
	 * @date 2017年12月18日 下午5:21:07
	 * @Description 初始化泛型类型
	 */
	public void specifiedType(Class<Event> clazz) {
		this.clazz=clazz;
		init();
	}

	/**
	 * @author liusy
	 * @date 2017年12月18日 下午6:03:41
	 * @Description 获取当前这个disruptor实例.
	 */
	public Disruptor<Event> getDisruptor() {
		return disruptor;
	}

}
