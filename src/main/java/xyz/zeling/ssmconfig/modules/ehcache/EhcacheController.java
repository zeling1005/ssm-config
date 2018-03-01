package xyz.zeling.ssmconfig.modules.ehcache;

import org.springframework.cache.Cache;
import org.springframework.cache.support.CompositeCacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import xyz.zeling.ssmconfig.util.SpringContextUtils;

/**
 * @description TODO
 * @author zeling
 * @date 2018年2月28日 下午11:21:38 
 */
@Controller
@RequestMapping("/ehcache")
public class EhcacheController {
    
    @RequestMapping("/test")
    @ResponseBody
    public Object test() {
        CompositeCacheManager cacheManagers = SpringContextUtils.getApplicationContext().getBean(CompositeCacheManager.class);
        Cache cache = cacheManagers.getCache("default");
        cache.put("oneKey", "oneValue");
        return cache.get("oneKey").get();
    }
}
