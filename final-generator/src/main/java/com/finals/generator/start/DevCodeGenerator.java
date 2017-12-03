package com.finals.generator.start;

import java.util.Properties;

import com.finals.generator.component.GeneratorCaller;

/**
 * 代码生成类 Created by ZhangShuzheng on 2017/1/10.
 */
public class DevCodeGenerator {

    /**
     * 自动代码生成
     * 
     * @param args
     */
    public static void main(String[] args) {

        try {
        	
            String config = "order.properties";
            
            Properties properties = new Properties();

            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(config));

            System.out.println(properties);

            System.out.println("================  Run "+config+" ================");
            
            GeneratorCaller.generator(properties);
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
