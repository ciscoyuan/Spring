/**
 * 
 */
package com.finals.generator.component;

import java.sql.Types;
import java.util.Properties;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;
import org.mybatis.generator.internal.util.StringUtility;

/**
 * tinyint解析为integer类型
 * 
 * @author zhangqp
 * @version 1.0, 2017年3月8日
 */
public class TinyIntJavaTypeResolver extends JavaTypeResolverDefaultImpl {
    private boolean tinyintAsInt;

    public void addConfigurationProperties(Properties properties) {
        super.addConfigurationProperties(properties);
        tinyintAsInt = StringUtility.isTrue(properties.getProperty("tinyintAsInt"));
        
        if (tinyintAsInt) {
            typeMap.put(Types.TINYINT,
                        new JdbcTypeInformation("TINYINT", //$NON-NLS-1$
                                                new FullyQualifiedJavaType(Integer.class.getName())));
        }
    }

}
