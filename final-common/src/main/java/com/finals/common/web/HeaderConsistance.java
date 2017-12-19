/**
 * 
 */
package com.finals.common.web;

/**
 * @author liusy
 * @date 2017年12月18日 上午11:27:15
 * @Description 请求头参数,用来区别请求来源.
 */
public class HeaderConsistance {
	
	
	public static final String HEADER_KEY="final";
	
    /**
     * @Description url source : browser
     */
    public static final String HEADER_PAGE = "page";
    
    /**
     * @Description url source : system inner
     */
    public static final String HEADER_SYSTEM = "system";
    
}
