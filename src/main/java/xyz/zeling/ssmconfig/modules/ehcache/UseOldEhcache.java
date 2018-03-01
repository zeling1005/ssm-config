package xyz.zeling.ssmconfig.modules.ehcache;

import java.net.URL;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * @description ehcache2简单使用
 * @author zeling
 * @date 2018年2月28日 下午10:19:34 
 */
public class UseOldEhcache {
    /**
     * @description TODO
     * @date 2018年2月28日 下午10:19:34
     * @param args
     */
    public static void main(String[] args) {
        // 初始化
        URL url = UseOldEhcache.class.getResource("/cache/ehcache-config.xml");
        CacheManager ehcacheManager = CacheManager.create(url);
        
        // 获取缓存对象
        Cache defaultEhcache = ehcacheManager.getCache("shiroSessionDaoCache");
        
        // System.out.println("oneKey:" + defaultEhcache.get("oneKey").getObjectValue());
        
        // 存
        Element addElement = new Element("oneKey", "oneValue");
        defaultEhcache.put(addElement);
        
        // 取
        Element targetElement = defaultEhcache.get("oneKey");
        System.out.println(targetElement.getObjectValue());
        
        // 删
        defaultEhcache.remove("oneKey");
        
        // 清空内存中的缓存，并将之存储到磁盘中
        defaultEhcache.put(addElement);
        Element twoElement = new Element("twoKey", "twoValue");
        defaultEhcache.put(twoElement);
        System.out.println();
        defaultEhcache.flush();
        
        // 关闭
        ehcacheManager.shutdown();
    }
}
