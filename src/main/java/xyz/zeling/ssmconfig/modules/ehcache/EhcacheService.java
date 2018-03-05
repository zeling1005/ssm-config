package xyz.zeling.ssmconfig.modules.ehcache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import xyz.zeling.ssmconfig.modules.mybatis.MybatisMapper;
import xyz.zeling.ssmconfig.modules.mybatis.MybatisModel;

/**
 * TODO
 *
 * @author zeling
 * @date 2018年3月5日 下午10:14:59 
 */
@Service
public class EhcacheService {
    @Autowired
    private MybatisMapper mapper;

    @Cacheable("simpleEhcacheCache")
    public List<MybatisModel> listMybatisModel(String key) {
        List<MybatisModel> mybatisModels = mapper.listMybatisModel();
        System.out.println("list count: " + mybatisModels.size());
        return mybatisModels;
    }
}
