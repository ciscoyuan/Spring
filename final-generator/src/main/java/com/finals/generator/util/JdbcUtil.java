package com.finals.generator.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JDBC工具类
 * Created by ZhangShuzheng on 2017/1/10.
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class JdbcUtil {

	// 定义数据库的链接
	private Connection conn;
	// 定义sql语句的执行对象
	private PreparedStatement pstmt;
	// 定义查询返回的结果集合
	private ResultSet rs;

	// 初始化
	public JdbcUtil(String driver, String url, String username, String password) {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 更新数据
	public boolean updateByParams(String sql, List params) throws SQLException {
		// 影响行数
		int result = -1;
		pstmt = conn.prepareStatement(sql);
		int index = 1;
		// 填充sql语句中的占位符
		if (null != params && !params.isEmpty()) {
			for (int i = 0; i < params.size(); i ++) {
				pstmt.setObject(index ++, params.get(i));
			}
		}
		result = pstmt.executeUpdate();
		return result > 0 ? true : false;
	}

	// 查询多条记录
    public List<Map> selectByParams(String sql, List params) throws SQLException {
		List<Map> list = new ArrayList<> ();
		int index = 1;
		pstmt = conn.prepareStatement(sql);
		if (null != params && !params.isEmpty()) {
			for (int i = 0; i < params.size(); i ++) {
				pstmt.setObject(index++, params.get(i));
			}
		}
		rs = pstmt.executeQuery();
		ResultSetMetaData metaData = rs.getMetaData();
		int cols_len = metaData.getColumnCount();
		while (rs.next()) {
			Map map = new HashMap();
			for (int i = 0; i < cols_len; i ++) {
				String cols_name = metaData.getColumnName(i + 1);
				Object cols_value = rs.getObject(cols_name);
				if (null == cols_value) {
					cols_value = "";
				}
				map.put(cols_name, cols_value);
			}
			list.add(map);
		}
		return list;
	}
    
    public List<Map> findPrimaryKeyInfo(String tableName, String schema) throws SQLException {
       String sql = "SELECT\n" +
               "   c.COLUMN_NAME,\n" +
               "   t.TABLE_NAME,\n" +
               "   CASE when ts.AUTO_INCREMENT is null then '0' else '1' end as IS_AUTO_INCREMENT\n" + //0:FASLE 1:TRUE
               "FROM\n" +
               "   INFORMATION_SCHEMA.TABLE_CONSTRAINTS AS t,\n" +
               "   information_schema. TABLES AS ts,\n" +
               "   information_schema.KEY_COLUMN_USAGE AS c\n" +
               "WHERE\n" +
               "   t.TABLE_NAME = ? \n" +
               "AND t.TABLE_SCHEMA = ? \n" +
               "AND t.TABLE_NAME = ts.TABLE_NAME\n" +
               "AND ts.TABLE_NAME = c.TABLE_NAME\n" +
               "AND t.CONSTRAINT_TYPE = 'PRIMARY KEY' \n" + //-- 唯一索引也是这个类型。。。
               "AND c.CONSTRAINT_NAME = 'PRIMARY'";
       
       List<Object> params = new ArrayList<>();
       params.add(tableName);
       params.add(schema);
       
       return selectByParams(sql, params);
    }

	// 释放连接
	public void release() {
		try {
			if (null != rs) rs.close();
			if (null != pstmt) pstmt.close();
			if (null != conn) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("释放数据库连接");
	}

}
