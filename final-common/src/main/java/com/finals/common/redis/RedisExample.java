/**
 * @author liusy
 * @date 2017年12月13日 下午3:33:04
 * @Description 
 */
package com.finals.common.redis;

import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.common.utils.ConcurrentHashSet;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

/**
 * @author liusy
 * @date 2017年12月13日 下午3:33:04
 * @Description redis cluster 扩展工具类
 */
@Component
public class RedisExample {
	
	private static Log log=LogFactory.getLog(RedisExample.class);
	
	@Autowired
	private JedisCluster jedisCluster;
	
	/**
	 * @author liusy
	 * @date 2017年12月13日 下午5:18:05
	 * @Description 因为cluster会有hash切片处理,所以只能一个节点一个节点拿连接然后返回回去.
	 */
	public Set<String> keys(String pattern){
		Map<String, JedisPool> clusterNodes = jedisCluster.getClusterNodes();
		ConcurrentHashSet<String> keys=new ConcurrentHashSet<>();
		for (String key : clusterNodes.keySet()) {
			Jedis conn=null;
			try {
				JedisPool jedisPool = clusterNodes.get(key);
				conn=jedisPool.getResource();
				keys.addAll(conn.keys(pattern+"*"));
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				log.debug("close redis node...");
				conn.close();
			}
		}
		return keys;
	}
	
}

