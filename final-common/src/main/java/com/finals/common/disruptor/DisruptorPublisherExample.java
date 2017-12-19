package com.finals.common.disruptor;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;

import com.finals.common.util.BeanCopyUtil;
import com.lmax.disruptor.EventTranslator;
import com.lmax.disruptor.dsl.Disruptor;

public class DisruptorPublisherExample<Event> implements Runnable,EventTranslator<Event>{  
	
	private Disruptor<Event> disruptor;  
	
	private List<Event> dataSource;
	
	private List<Map<String, Object>> dataSourceMap;	
	
	private Event currentEvent;
	
	private Map<String, Object> currentEventMap;
	
    public DisruptorPublisherExample(Disruptor<Event> disruptor,List<Event> dataSource) {
    	this.dataSource=dataSource;
        this.disruptor=disruptor;  
        
    }  
    
    public DisruptorPublisherExample(Disruptor<Event> disruptor,List<Map<String, Object>> dataSourceMap,String empty) {
    	this.dataSourceMap=dataSourceMap;
        this.disruptor=disruptor;  
        
    } 
  
    @Override  
    public void run() {
    	
    	if(null!=dataSource){
    		for(int i=0;i<dataSource.size();i++){
    		    currentEvent=dataSource.get(i);
    		    disruptor.publishEvent(this);  
    	    }
    	}else {
    		for(int i=0;i<dataSourceMap.size();i++){
    			currentEventMap=dataSourceMap.get(i);
    			disruptor.publishEvent(this);
    		}
		}
          
    }

	@Override
	public void translateTo(Event event, long sequence) {
		try {
			//当传进来的是event的list,用这个来注入
			if (null != dataSource) {
				Field field = event.getClass().getDeclaredField("beanFactory");
				field.setAccessible(true);
				Object beanfactory = field.get(event);
				BeanUtils.copyProperties(currentEvent,event);
				field.set(event, beanfactory);
				//当传进来的是个List<Map<String,Object>>,用这个来注入
			} else {
				Field field = event.getClass().getDeclaredField("beanFactory");
				field.setAccessible(true);
				Object beanfactory = field.get(event);
				BeanCopyUtil.copy(currentEventMap, event);
				field.set(event, beanfactory);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}  
      
}  
