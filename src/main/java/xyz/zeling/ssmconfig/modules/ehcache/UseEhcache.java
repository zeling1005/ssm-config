package xyz.zeling.ssmconfig.modules.ehcache;

import java.net.URL;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.Configuration;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.xml.XmlConfiguration;

/**
 * @description ehcache3使用范例
 * @author zeling
 * @date 2018年2月25日 下午11:05:25 
 */
public class UseEhcache {
    /**
     * @description TODO
     * @date 2018年2月25日 下午11:05:25
     * @param args
     */
    public static void main(String[] args) {
        // 初始化
        URL ehcacheUrl = UseEhcache.class.getResource("/ehcache/ehcache-config.xml"); 
        Configuration ehcacheXmlConfig = new XmlConfiguration(ehcacheUrl); 
        CacheManager ehcacheCacheManager = CacheManagerBuilder.newCacheManager(ehcacheXmlConfig);
        ehcacheCacheManager.init();
        
        // 获取缓存实例
        Cache<String, String> defaultCache = ehcacheCacheManager.getCache("defaultCache", String.class, String.class);
        // 存
        defaultCache.put("one", "one");
        // 取
        System.out.println(defaultCache.get("one"));
        // 磁盘中有缓存two对应的value
        System.out.println(defaultCache.get("two"));
        
        // 释放空间
        ehcacheCacheManager.close();
    }
}
