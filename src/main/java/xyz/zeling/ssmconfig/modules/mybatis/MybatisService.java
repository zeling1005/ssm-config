package xyz.zeling.ssmconfig.modules.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description TODO
 * @author zeling
 * @date 2018年2月10日 下午11:24:48
 */
@Service
public class MybatisService {
    @Autowired
    private MybatisMapper mapper;

    public void listMybatisModel() {
        List<MybatisModel> mybatisModels = mapper.listMybatisModel();
        System.out.println("list count: " + mybatisModels.size());
    }

    public void deleteMybatisModel() {
        Map<String, Object> deleteCondition = new HashMap<>();
        deleteCondition.put("username", "zeling");
        mapper.deleteMybatisModel(deleteCondition);
    }

    public void insertMybatisModel() {
        MybatisModel entity = new MybatisModel();
        entity.setRtxno(100);
        entity.setUsername("zeling");
        entity.setPassword("zeling");
        entity.setEmail("zeling");
        entity.setRealname("zeling");
        mapper.insertMybatisModel(entity);
        System.out.println("after insert: " + entity.getId());
        // 测试事务回滚
        // throw new NullPointerException();
    }
}
