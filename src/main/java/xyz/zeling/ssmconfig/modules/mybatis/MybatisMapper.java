package xyz.zeling.ssmconfig.modules.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @description TODO
 * @author zeling
 * @date 2018年2月10日 下午11:41:51
 */
@Repository
public interface MybatisMapper {
    List<MybatisModel> listMybatisModel();
    void deleteMybatisModel(Map<String, Object> deleteCondition);
    void insertMybatisModel(@Param("entity")MybatisModel entity);
}
