/**
 * 
 */
package com.finals.generator.component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.log.NullLogChute;

/**
 * 
 * @author zhangqp
 * @version 1.0, 2017年4月6日
 */
public class VelocityFactory {
    
    static {
        Velocity.setProperty(RuntimeConstants.RUNTIME_LOG_LOGSYSTEM, new NullLogChute());
        Velocity.init();
    }

    /**
     * UTF-8, 没有日志
     * 
     * @param vmpath
     * @return
     */
    public static Template getTemplate(String vmpath) {
        return Velocity.getTemplate(vmpath, "utf-8");
    }
    
    /**
     * UTF-8, 没有日志
     * @param vmpath
     * @param context
     * @param writer
     */
    public static void merge(String vmpath, VelocityContext context, File file) {
        try (FileWriter writer = new FileWriter(file)) {
            merge(vmpath, context, writer);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * UTF-8, 没有日志
     * @param vmpath
     * @param context
     * @param writer
     */
    public static void merge(String vmpath, VelocityContext context, Writer writer) {
        
        getTemplate(vmpath).merge(context, writer);
        
        flushWriter(writer);
    }

    private static void flushWriter(Writer writer) {
        try {
            writer.flush();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void merge(Template template, VelocityContext context, Writer writer) {
        template.merge(context, writer);
        flushWriter(writer);
    }
}
