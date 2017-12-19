package com.finals.generator.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

import org.apache.velocity.VelocityContext;

import com.finals.generator.component.VelocityFactory;


/**
 * 
 * @author zhangqp
 * @version 1.0, 2017年4月6日
 */
public class VelocityUtil {

    /**
     * 根据模板生成文件
     * 
     * @param inputVmFilePath
     *            模板路径
     * @param outputFilePath
     *            输出文件路径
     * @param context
     * @throws Exception
     */
    public static void generate(String inputVmFilePath, File outputFile, VelocityContext context, boolean appearContent) throws Exception {
        try (Writer writer = new FileWriter(outputFile)) {
            VelocityFactory.merge(inputVmFilePath, context, writer);

            if (appearContent) {
                VelocityFactory.merge(inputVmFilePath, context, new OutputStreamWriter(new BufferedOutputStream(System.out), StandardCharsets.UTF_8));
            }
        }
    }

}
