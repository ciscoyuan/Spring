/**
 * @author liusy
 * @date 2017年12月18日 下午2:46:00
 * @Description 
 */
package com.finals.acc.web.controller;

import com.finals.acc.model.AccLog;
import com.lmax.disruptor.EventHandler;

/**
 * @author liusy
 * @date 2017年12月18日 下午2:46:00
 * @Description 
 */
public class HandlerB implements EventHandler<AccLog>{

	/**
	 * @author liusy
	 * @date 2017年12月18日 下午2:46:42
	 * @Description 
	 */
	@Override
	public void onEvent(AccLog event, long sequence, boolean endOfBatch) throws Exception {
		System.err.println("event B :"+event);
	}

}
