package xyz.zeling.ssmconfig.modules.ehcache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.support.CompositeCacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import xyz.zeling.ssmconfig.modules.mybatis.MybatisModel;
import xyz.zeling.ssmconfig.util.SpringContextUtils;

/**
 * @description spring缓存模块控制层
 * @author zeling
 * @date 2018年2月28日 下午11:21:38 
 */
@Controller
@RequestMapping("/ehcache")
public class EhcacheController {
    @Autowired
    private EhcacheService ehcacheService;
    
    /**
     * 测试缓存
     *
     * @return 缓存中{@code oneKey}对应的{@code oneValue}
     * @date 2018年3月5日 下午11:59:20
     */
    @RequestMapping("/test")
    @ResponseBody
    public Object test() {
        CompositeCacheManager cacheManagers = SpringContextUtils.getApplicationContext().getBean(CompositeCacheManager.class);
        Cache cache = cacheManagers.getCache("simpleEhcacheCache");
        cache.put("oneKey", "oneValue");
        return cache.get("oneKey").get();
    }
    
    /**
     * 测试spring cache的注解使用
     *
     * @return 查询到的数据
     * @date 2018年3月6日 上午12:00:51
     */
    @RequestMapping("/testCacheAnnotation")
    @ResponseBody
    public JSONObject testCacheAnnotation() {
        JSONObject result = new JSONObject();
        List<MybatisModel> mybatisModels = ehcacheService.listMybatisModel("233");
        result.put("mybatisModels", mybatisModels);
        return result;
    }
}
