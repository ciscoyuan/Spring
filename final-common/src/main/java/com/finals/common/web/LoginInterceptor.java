/**
 * @author liusy
 * @date 2017年12月16日 下午11:54:05
 * @Description 
 */
package com.finals.common.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import redis.clients.jedis.Jedis;

/**
 * @author liusy
 * @date 2017年12月16日 下午11:54:05
 * @Description 拦截器
 */
public class LoginInterceptor extends HandlerInterceptorAdapter{
	
	@Autowired
	private Jedis jedis;
	
	@Autowired
	private BeanFactory beanFactory;
	
	/**
	 * @author liusy
	 * @date 2017年12月16日 下午11:54:32
	 * @Description 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		//拿出所有的handler url,当发现访问的url不是mapping且又有sessionId,则表示用户手残,然后重定向主页面吧
		List<String> urList = new ArrayList<String>();//存储所有url集合  
		RequestMappingHandlerMapping bean = beanFactory.getBean(RequestMappingHandlerMapping.class);
		Map<RequestMappingInfo, HandlerMethod> handlerMethods = bean.getHandlerMethods();
	    for (RequestMappingInfo rmi : handlerMethods.keySet()) {  
		        PatternsRequestCondition prc = rmi.getPatternsCondition();  
		        Set<String> patterns = prc.getPatterns();  
		        for (String uStr : patterns) {  
		            urList.add(uStr);  
		        }  
		    }
		String url=request.getRequestURI().substring(request.getContextPath().length());
		
		Boolean exist=false;
		Cookie[] cookies = request.getCookies();
		List<Cookie> asList = Arrays.asList(cookies);
		k: for (Cookie cookie : asList) {
			if(cookie.getName().equals(HeaderConsistance.HEADER_KEY)){
				exist=true;
				String sessionId=cookie.getValue().substring(5);
				if(jedis.exists(sessionId)){
					if(urList.contains(url)){
						return true;
					}else {
						//重定向到主页面
						response.sendRedirect(request.getContextPath()+"/main");
						return false;
					}
				}
				break k;
			}
		}
		if(false==exist){
			if(jedis.exists(request.getSession().getId())){
				if(urList.contains(url)){
					return true;
				}else {
					//重定向到主页面
					response.sendRedirect(request.getContextPath()+"/main");
					return false;
				}
			}
		}
		if("/main".equals(url)) return true;
		response.sendRedirect(request.getContextPath()+"/login");
		return false;
		
	}

	/**
	 * @author liusy
	 * @date 2017年12月16日 下午11:54:32
	 * @Description 
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		Boolean exist=false;
		Cookie[] cookies = request.getCookies();
		List<Cookie> asList = Arrays.asList(cookies);
		k: for (Cookie cookie : asList) {
			if(cookie.getName().equals(HeaderConsistance.HEADER_KEY)){
				if(jedis.exists(cookie.getValue().substring(5))){
					exist=true;
				}
				break k;
			}
			System.err.println("name: "+cookie.getName()+" ,value:"+cookie.getValue());
		}
		if(false==exist){
			response.addCookie(new Cookie(HeaderConsistance.HEADER_KEY, HeaderConsistance.HEADER_PAGE+"_"+request.getSession().getId()));
		}
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
