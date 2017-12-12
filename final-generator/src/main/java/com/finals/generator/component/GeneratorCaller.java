package com.finals.generator.component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.apache.velocity.VelocityContext;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import com.finals.generator.util.JdbcUtil;
import com.finals.generator.util.SimpleExprReplacer;
import com.finals.generator.util.StringUtil;
import com.finals.generator.util.VelocityUtil;


/**
 * 代码生成类 Created by ZhangShuzheng on 2017/1/10.
 */
@SuppressWarnings("rawtypes")
public class GeneratorCaller {

    /**
     * 根据模板生成generatorConfig.xml文件
     * 
     * @param module_prefix_name
     */
    public static void generator(Properties conf) {
        System.out.println("========== 开始生成 ==========");
        File mbgConfigPath = null;
        try {
            Properties properties = prepareGenOptions(prepare(conf));

            List<Map<String, String>> tables = determineTables(properties);
            
            if (tables == null || tables.isEmpty()) {
                System.out.println("开始完成，没有找到符合条件的表");
                return;
            }
            
            List<String> segments = properties.getProperty("module.segment") == null ? new ArrayList<>(0)
                                                                                     : Arrays.asList(properties.getProperty("module.segment").replaceAll(" ", "").toLowerCase().split(","));

            boolean daoOn = (!segments.isEmpty() && segments.contains("dao") && properties.getProperty("dao.location.model") != null);
            
            if (daoOn) {
                System.out.println("========== 开始生成generatorConfig.xml文件 ==========");
                
                mbgConfigPath = generateMbgConfigFile(properties, tables);

                System.out.println(mbgConfigPath);

                System.out.println("========== 结束生成generatorConfig.xml文件 ==========");
                
                System.out.println("========== 开始运行MybatisGenerator ==========");
                
             // // 删除旧代码
                
                String modelLocation = properties.getProperty("targetProject_model")+"/src/main/java/"+properties.getProperty("dao.pkg.model").replaceAll("\\.", "/");
                String mapperLocation = properties.getProperty("targetProject_mapper")+"/src/main/java/"+properties.getProperty("dao.pkg.mapper").replaceAll("\\.", "/");
                String xmlLocation = properties.getProperty("targetProject_xml")+"/src/main/java/"+properties.getProperty("dao.pkg.xml").replaceAll("\\.", "/");
                
                boolean cleanDao = "clean".equalsIgnoreCase(properties.getProperty("dao.laidoff", properties.getProperty("laidoff", "override")));
                
                if (cleanDao) {
                    System.out.println("delete dir: "+modelLocation);
                    deleteDir(new File(modelLocation));
                    
                    System.out.println("delete dir: "+mapperLocation);
                    deleteDir(new File(mapperLocation));
                    
                    System.out.println("delete dir: "+xmlLocation);
                    deleteDir(new File(xmlLocation));
                }
                else {
                    List<String> excludes = properties.getProperty("dao.excludes") == null ? new ArrayList<>(0)
                                                                                           : Arrays.asList(properties.getProperty("dao.excludes").replaceAll(" ", "").toLowerCase().split(","));
                    List<String> includes = properties.getProperty("dao.includes") == null ? new ArrayList<>(0)
                                                                                           : Arrays.asList(properties.getProperty("dao.includes").replaceAll(" ", "").toLowerCase().split(","));
                    for (Map<String, String> table : tables) {
                        if (gen(table.get("table_name"), excludes, includes)) {
                            System.out.println();
                            File modelFile = new File(modelLocation, table.get("model_name")+".java");
                            File modelExampleFile = new File(modelLocation, table.get("model_name")+"Example.java");
                            File mapperFile = new File(mapperLocation, table.get("model_name")+"Mapper.java");
                            File xmlFile = new File(xmlLocation, table.get("model_name")+"Mapper.xml");
                            
                            System.out.println("delete file: "+modelFile);
                            deleteDir(modelFile);
                            System.out.println("delete file: "+modelExampleFile);
                            deleteDir(modelExampleFile);
                            
                            System.out.println("delete file: "+mapperFile);
                            deleteDir(mapperFile);
                            
                            System.out.println("delete file: "+xmlFile);
                            deleteDir(xmlFile);
                        }
                    }
                }
                
                // 生成代码
                List<String> warnings = new ArrayList<>();
                ConfigurationParser cp = new ConfigurationParser(warnings);
                Configuration config = cp.parseConfiguration(mbgConfigPath);
                DefaultShellCallback callback = new DefaultShellCallback(true);
                MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
                myBatisGenerator.generate(null);
                for (String warning : warnings) {
                    System.out.println(warning);
                }
                
                mbgConfigPath.delete();
                System.out.println("========== 结束运行MybatisGenerator ==========");
            }
            
            System.out.println("========== 开始运行Service Controller ==========");
            
            List<String> serviceExcludes = properties.getProperty("service.excludes") == null ? new ArrayList<>(0)
                                                                                   : Arrays.asList(properties.getProperty("service.excludes").replaceAll(" ", "").toLowerCase().split(","));
            List<String> serviceIncludes = properties.getProperty("service.includes") == null ? new ArrayList<>(0)
                                                                                   : Arrays.asList(properties.getProperty("service.includes").replaceAll(" ", "").toLowerCase().split(","));
            List<String> controllerExcludes = properties.getProperty("controller.excludes") == null ? new ArrayList<>(0)
                                                                                              : Arrays.asList(properties.getProperty("controller.excludes").replaceAll(" ", "").toLowerCase().split(","));
            List<String> controllerIncludes = properties.getProperty("controller.includes") == null ? new ArrayList<>(0)
                                                                                              : Arrays.asList(properties.getProperty("controller.includes").replaceAll(" ", "").toLowerCase().split(","));
            boolean serviceOn = (!segments.isEmpty() && segments.contains("service") && properties.getProperty("service.location") != null);
            boolean controllerOn = (!segments.isEmpty() && segments.contains("controller") && properties.getProperty("controller.location") != null);
            
            if (serviceOn) {
                boolean cleanService = "clean".equalsIgnoreCase(properties.getProperty("service.laidoff", properties.getProperty("laidoff", "override")));
                if (cleanService) {
                    File serviceLocation = new File(getFilePath(properties,"service.location")+"/src/main/java/"+properties.getProperty("service.pkg").replaceAll("\\.", "/"));
                    File serviceImplLocation = new File(getFilePath(properties,"service.location")+"/src/main/java/"+properties.getProperty("service.pkg").replaceAll("\\.", "/")+"/impl");
                    System.out.println("delete dir: "+serviceLocation);
                    deleteDir(serviceLocation);
                    
                    System.out.println("delete dir: "+serviceImplLocation);
                    deleteDir(serviceImplLocation);
                }
            }
            
            if (controllerOn) {
                boolean cleanControll= "clean".equalsIgnoreCase(properties.getProperty("controller.laidoff", properties.getProperty("laidoff", "override")));
                if (cleanControll) {
                    File ctrlOutFile = new File(getFilePath(properties,"controller.location")+"/src/main/java/"+properties.getProperty("controller.pkg").replaceAll("\\.", "/"));
                    
                    System.out.println("delete dir: "+ctrlOutFile);
                    deleteDir(ctrlOutFile);
                }
            }
            
            for (Map<String, String> table : tables) {
                VelocityContext context = new VelocityContext();

                for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                    context.put(Objects.toString(entry.getKey()).replaceAll("\\.", "_"), entry.getValue());
                }
                String model = Objects.toString(table.get("model_name"));
                String tableName = Objects.toString(table.get("table_name"));
                
                context.put("model",model);
                context.put("table_name", tableName);
                context.put("model_path", table.get("model_path"));
//                context.put("tables", tables);
                context.put("util", StringUtil.class);
                
                if (serviceOn && gen(tableName, serviceExcludes, serviceIncludes)) {
                    System.out.println();
                    System.out.print("----gen service ");
                    
                    File outFile = new File(getFilePath(properties,"service.location")+"/src/main/java/"+properties.getProperty("service.pkg").replaceAll("\\.", "/")
                                        +"/"+model+"Service.java");
                     
                     outFile.getParentFile().mkdirs();
                     outFile.createNewFile();
                     
                     VelocityUtil.generate("tpl/" + properties.getProperty("service.vm", "Service.vm"), outFile, context, false);
                     
                     File implOutFile = new File(getFilePath(properties,"service.location")+"/src/main/java/"+properties.getProperty("service.pkg").replaceAll("\\.", "/")
                                             +"/impl/"+model+"ServiceImpl.java");
                          
                     implOutFile.getParentFile().mkdirs();
                     implOutFile.createNewFile();
                          
                     VelocityUtil.generate("tpl/" + properties.getProperty("service.impl.vm", "ServiceImpl.vm"), implOutFile, context, false);
                }
                
                if (controllerOn && gen(tableName, controllerExcludes, controllerIncludes)) {
                    System.out.println();
                    System.out.print("----gen controller ");
                    
                    File ctrlOutFile = new File(getFilePath(properties,"controller.location")+"/src/main/java/"+properties.getProperty("controller.pkg").replaceAll("\\.", "/")
                                                +"/"+model+"Controller.java");
                    
                    ctrlOutFile.getParentFile().mkdirs();
                    ctrlOutFile.createNewFile();
                    
                    VelocityUtil.generate("tpl/" + properties.getProperty("controller.vm", "Controller.vm"), ctrlOutFile, context, false);
                }
            }
            System.out.println();
            System.out.println("========== 结束运行Service Controller ==========");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (mbgConfigPath != null) mbgConfigPath.delete();
        }
        System.out.println("========== 结束生成 ==========");
    }

    private static boolean gen(String tableName, List<String> excludes, List<String> includes) {
        System.out.print(tableName);
        
        if (!includes.isEmpty() && !includes.contains(tableName)) {
            System.out.println(" not include ...=> ignore");
            return false;
        }
        
        if (excludes.contains(tableName)) {
            System.out.println(" exclude ...=> ignore");
            return false;
        }
        
        return true;
    }

    private static Properties prepare(Properties conf) throws IOException {
        //处理引用  ${}
        for (String properyName : conf.stringPropertyNames()) {
            conf.setProperty(properyName, SimpleExprReplacer.replace(conf.getProperty(properyName), conf));
        }
        
        Properties properties = new Properties();
        properties.putAll(conf);

        String userDir = System.getProperty("user.dir");

        String basePath = properties.getProperty("base.path", userDir);

        basePath = ".".equals(basePath) ? userDir : basePath;

        properties.put("base.path", basePath);

        System.out.println(basePath);

        if (properties.get("dao.jdbc.resource") != null) {
            Properties jdbc = new Properties();
            jdbc.load(new FileInputStream(getPathFile(properties, "dao.jdbc.resource")));

            for (Map.Entry<Object, Object> entry : jdbc.entrySet()) {
                properties.put("dao." + entry.getKey(), entry.getValue());
            }
        }

        return properties;
    }

    /**
     * <pre>
     * vmConfigPath
     * 
     * generator_javaModelGenerator_targetPackage
     * generator_sqlMapGenerator_targetPackage
     * generator_javaClientGenerator_targetPackage
     * targetProject
     * jdbc.driver
     * jdbc.url
     * jdbc.username
     * jdbc.password
     * 
     * others...
     * </pre>
     * 
     * @param properties
     * @return
     */
    private static Properties prepareGenOptions(Properties properties) {

        Properties options = new Properties();

        options.putAll(properties);

        options.put("ctime", LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        options.put("gen_version", "1.0");

        assertNull(properties.getProperty("dao.jdbc.driver"), "dao.jdbc.driver property is null");
        options.put("jdbc_driver", properties.get("dao.jdbc.driver"));
        assertNull(properties.getProperty("dao.jdbc.url"), "dao.jdbc.url property is null");
        options.put("jdbc_url", properties.get("dao.jdbc.url"));
        assertNull(properties.getProperty("dao.jdbc.username"), "dao.jdbc.username property is null");
        options.put("jdbc_username", properties.get("dao.jdbc.username"));
        assertNull(properties.getProperty("dao.jdbc.password"), "dao.jdbc.password property is null");
        options.put("jdbc_password", properties.get("dao.jdbc.password"));

        if (!"false".equals(properties.getProperty("dao.jdbc.schema"))) {
            String jdbc_schema = properties.getProperty("dao.jdbc.schema");
            if (StringUtils.isEmpty(jdbc_schema) || "true".equals(jdbc_schema) || "y".equals(jdbc_schema)) {
                jdbc_schema = getJdbcSchema(properties.getProperty("dao.jdbc.url"));
            }
            options.put("jdbc_schema", jdbc_schema);
        }

        options.put("dao.vm", "tpl/" + properties.getProperty("dao.vm", "generatorConfig.vm"));

        String targetProject = getFilePath(properties, "dao.location");
        options.put("targetProject", targetProject);

        options.put("targetProject_model", getFilePath(properties, "dao.location.model", targetProject));
        assertNull(options.getProperty("targetProject_model"), "dao.location or dao.location.model property is null");
        assertNull(properties.getProperty("dao.pkg.model"), "dao.pkg.model property is null");
        options.put("generator_javaModelGenerator_targetPackage", properties.getProperty("dao.pkg.model"));

        options.put("targetProject_mapper", getFilePath(properties, "dao.location.mapper", targetProject));
        assertNull(options.getProperty("targetProject_mapper"), "dao.location or dao.location.mapper property is null");
        assertNull(properties.getProperty("dao.pkg.mapper"), "dao.pkg.mapper property is null");
        options.put("generator_javaClientGenerator_targetPackage", properties.getProperty("dao.pkg.mapper"));
        
        options.put("targetProject_xml", getFilePath(properties, "dao.location.xml", targetProject));
        assertNull(options.getProperty("targetProject_xml"), "dao.location or dao.location.xml property is null");
        assertNull(properties.getProperty("dao.pkg.xml"), "dao.pkg.xml property is null");
        options.put("generator_sqlMapGenerator_targetPackage", properties.getProperty("dao.pkg.xml"));

        System.out.println(options);

        return options;
    }

    /**
     * @param tables
     * @param options
     * @throws Exception
     */
    private static File generateMbgConfigFile(Properties options, List<Map<String, String>> tables) throws Exception {
        VelocityContext context = new VelocityContext();

        for (Map.Entry<Object, Object> entry : options.entrySet()) {
            context.put(Objects.toString(entry.getKey()), entry.getValue());
        }
        context.put("tables", tables);

        File mbgConfigPath = new File(options.getProperty("base.path"), UUID.randomUUID().toString());
        mbgConfigPath.createNewFile();

        VelocityUtil.generate(Objects.toString(options.get("dao.vm"), null), mbgConfigPath, context, true);

        return mbgConfigPath;
    }

    private static List<Map<String, String>> determineTables(Properties properties) throws SQLException {
        String sql = "SELECT table_name FROM INFORMATION_SCHEMA.TABLES WHERE table_schema = '" + properties.getProperty("jdbc_schema") + "';";
        // 查询定制前缀项目的所有表
        JdbcUtil jdbcUtil = new JdbcUtil(properties.getProperty("jdbc_driver"),
                                         properties.getProperty("jdbc_url"),
                                         properties.getProperty("jdbc_username"),
                                         properties.getProperty("jdbc_password"));
        List<String> excludes = properties.getProperty("dao.excludes") == null ? new ArrayList<>(0)
                                                                           : Arrays.asList(properties.getProperty("dao.excludes").replaceAll(" ", "").toLowerCase().split(","));
        List<String> includes = properties.getProperty("dao.includes") == null ? new ArrayList<>(0)
                                                                           : Arrays.asList(properties.getProperty("dao.includes").replaceAll(" ", "").toLowerCase().split(","));
        boolean genPrimaryKey = "true".equalsIgnoreCase(properties.getProperty("dao.gen.primarykey", "true")) || 
                                "y".equalsIgnoreCase(properties.getProperty("dao.gen.primarykey", "y"));
        boolean genOnlyautoPrimaryKey = "true".equalsIgnoreCase(properties.getProperty("dao.gen.primarykey.onlyauto", "false")) || 
                "y".equalsIgnoreCase(properties.getProperty("dao.gen.primarykey.onlyauto", "n"));
        
        Map<String, String> table;
        List<Map<String, String>> tables = new ArrayList<>();
        List<Map> result = jdbcUtil.selectByParams(sql, null);
        
        String tableName = null;
        String module= properties.getProperty("module");
        assertNull(module, "module property is null");
        
        for (Map map : result) {
            tableName = Objects.toString(map.get("TABLE_NAME")).toLowerCase();
            
            if (gen(tableName, excludes, includes)) {
                System.out.println();
                table = new HashMap<>();
                table.put("table_name", tableName);
                table.put("model_name", StringUtil.lineToHump(Objects.toString(map.get("TABLE_NAME"))));
                table.put("model_path", getModelPath(module, tableName));//controll url
                List<Map> primaryKeys = jdbcUtil.findPrimaryKeyInfo(tableName, properties.getProperty("jdbc_schema"));
                if (primaryKeys != null && primaryKeys.size() == 1) {
                    if (genPrimaryKey) {
                        if (genOnlyautoPrimaryKey && primaryKeys.get(0).get("IS_AUTO_INCREMENT").equals("0")) {
                            System.out.println("!!!!!!!! WARN: 主键不是AUTO_INCREMENT 类型，不自动生成主键 :" + tableName);
                        } else {
                            table.put("model_primaryKey", Objects.toString(primaryKeys.get(0).get("COLUMN_NAME")).toLowerCase());
                        }
                    }
                }
                else if (primaryKeys == null || primaryKeys.isEmpty()){
                    System.out.println("!!!!!!!! WARN: Can not find primary key in table :" + tableName);
                    continue;
                } else {
                    System.out.println("!!!!!!!! WARN: Too many primary key in table :" + tableName);
                    continue;
                }
                tables.add(table);
            }
        }
        jdbcUtil.release();
        return tables;
    }

    // 递归删除非空文件夹
    public static void deleteDir(File dir) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (int i = 0; i < files.length; i++) {
                deleteDir(files[i]);
            }
        }
        dir.delete();
    }

    private static String getJdbcSchema(String s) {
        int end = s.indexOf('?');
        String url = end == -1 ? s : s.substring(0, end);
        return url.substring(url.lastIndexOf('/') + 1);
    }

    private static void assertNull(String property, String string) {
        if (StringUtils.isEmpty(property)) {
            throw new NullPointerException(string);
        }
    }

    private static boolean isRelativePath(String path) {
        return path.startsWith("./") || path.startsWith("../") || path.startsWith(".\\") || path.startsWith("..\\");
    }

    private static File getPathFile(Properties properties, String pathKey) {
        String path = properties.getProperty(pathKey);

        if (StringUtils.isEmpty(path))
            return null;

        if (".".equals(path)) {
            return new File(properties.getProperty("base.path"));
        }

        if (isRelativePath(path)) {
            return new File(properties.getProperty("base.path"), path);
        }

        return new File(path);
    }

    private static String getFilePath(Properties properties, String pathKey) {
        return getFilePath(properties, pathKey, "");
    }

    private static String getFilePath(Properties properties, String pathKey, String defaultValue) {
        File path = getPathFile(properties, pathKey);
        return path == null ? defaultValue : path.getAbsolutePath().replaceAll("\\\\", "/");
    }
    
    private static String getModelPath(String module, String tableName) {
       String path = tableName.replaceAll("_", "/");
       return  path.startsWith(module) ? path : module+"/"+path;
    }
}
