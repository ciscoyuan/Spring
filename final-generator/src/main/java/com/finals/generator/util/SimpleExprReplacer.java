/**
 * 
 */
package com.finals.generator.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

/**
 * @author zhangqp
 * @version 1.0, 2017年4月10日
 */
public class SimpleExprReplacer {
    
    /**
     * 是否含${}表达式
     * @param s
     * @return
     */
    public static final boolean isSupport(String s) {
        
        return new SimpleExprMatcher(s).find();
    }
    
    /**
     * 替换${}表达式
     * <pre>
     * String s = "hello, ${name}!";
     * 
     * Map<String,String> params = new HashMap<>();
     * params.put("name", "zhangsan");
     * System.out.println(replace(s, params));
     * 
     * => hello, zhangsan!
     * </pre>
     * @param s
     * @param context
     * @return
     */
    public static final String replace(String s, Map<?, ?> context) {
        
        return replace(s, (value)->{return Objects.toString(context.get(value), "");});
    }
    
    /**
     * 替换${}表达式
     * <pre>
     * String s = "hello, ${name}!";
     * 
     * Map<String,String> params = new HashMap<>();
     * params.put("name", "zhangsan");
     * System.out.println(replace(s, (value)->{return Objects.toString(context.get(value), "");}));
     * 
     * => hello, zhangsan!
     * </pre>
     * @param s
     * @param callback
     * @return
     */
    public static final String replace(String s, Function<String, String> callback) {
        SimpleExprMatcher matcher = new SimpleExprMatcher(s);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, callback.apply(matcher.getMatchedField()));
        }
        matcher.appendTail(sb);
        
        return sb.toString();
    }
    
    /**
     * 替换#{}表达式
     * <pre>
     * String s = "hello, #{name}!";
     * 
     * Map<String,String> params = new HashMap<>();
     * params.put("name", "zhangsan");
     * System.out.println(hashReplace(s, (value)->{return Objects.toString(context.get(value), "");}));
     * 
     * => hello, zhangsan!
     * </pre>
     * @param s
     * @param callback
     * @return
     */
    public static final String hashReplace(String s, Function<String, String> callback) {
        SimpleExprMatcher matcher = new SimpleExprMatcher(s, "#{", "}");
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, callback.apply(matcher.getMatchedField()));
        }
        matcher.appendTail(sb);
        
        return sb.toString();
    }
    
    /**
     * 替换#{}表达式
     * <pre>
     * String s = "hello, #{name}!";
     * 
     * Map<String,String> params = new HashMap<>();
     * params.put("name", "zhangsan");
     * System.out.println(hashReplace(s, params));
     * 
     * => hello, zhangsan!
     * </pre>
     * @param s
     * @param context
     * @return
     */
    public static final String hashReplace(String s, Map<?, ?> context) {
        
        return hashReplace(s, (value)->{return Objects.toString(context.get(value), "");});
    }
    
    /**
     * 替换#{}表达式
     * <pre>
     * String s = "hello, #{name}!";
     * 
     * Map<String,String> params = new HashMap<>();
     * params.put("name", "zhangsan");
     * System.out.println(hashReplace(s, (value)->{return Objects.toString(context.get(value), "");}));
     * 
     * => hello, zhangsan!
     * </pre>
     * @param s
     * @param callback
     * @return
     */
    public static final String replace(String exprStart, String exprEnd, String s, Function<String, String> callback) {
        SimpleExprMatcher matcher = new SimpleExprMatcher(s, exprStart, exprEnd);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, callback.apply(matcher.getMatchedField()));
        }
        matcher.appendTail(sb);
        
        return sb.toString();
    }
    
    
    public static void main(String[] args) {
        String s = "hello, #{name}1,${name},${!name2}2!";
        
        Map<Object,Object> context = new HashMap<>();
        context.put("name", "zhangsan");
        
        System.out.println(replace(s, context));
        
        SimpleExprMatcher matcher = new SimpleExprMatcher(s,"#{","}");
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "小明");
        }
        matcher.appendTail(sb);
        
        System.out.println(sb);
    }
    
}
