/**
 * @author liusy
 * @date 2017年12月16日 下午11:54:05
 * @Description 
 */
package com.finals.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author liusy
 * @date 2017年12月16日 下午11:54:05
 * @Description 拦截器
 */
public class SessionInterceptor extends HandlerInterceptorAdapter{
	
	/**
	 * @author liusy
	 * @date 2017年12月16日 下午11:54:32
	 * @Description 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		return true;
	}

	/**
	 * @author liusy
	 * @date 2017年12月16日 下午11:54:32
	 * @Description 
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.err.println(this.getClass().getSimpleName()+"handler");
	}

	/**
	 * @author liusy
	 * @date 2017年12月16日 下午11:54:32
	 * @Description 
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.err.println(this.getClass().getSimpleName()+"after");
	}

}
