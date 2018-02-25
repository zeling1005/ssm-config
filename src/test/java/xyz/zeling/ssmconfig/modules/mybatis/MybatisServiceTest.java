package xyz.zeling.ssmconfig.modules.mybatis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.annotation.Rollback;

import xyz.zeling.ssmconfig.common.BaseSpringTest;

/**
 * @description MybatisService.class测试类
 * @author zeling
 * @date 2018年2月25日 下午5:05:51
 */
public class MybatisServiceTest extends BaseSpringTest {
    @Autowired
    private MybatisService mybatisService;

    /**
     * Test method for
     * {@link xyz.zeling.ssmconfig.modules.mybatis.MybatisService#listMybatisModel()}.
     */
    @Test
    public void testListMybatisModel() {
        mybatisService.listMybatisModel();
    }

    /**
     * Test method for
     * {@link xyz.zeling.ssmconfig.modules.mybatis.MybatisService#deleteMybatisModel()}.
     */
    @Rollback(false)
    @Test
    public void testDeleteMybatisModel() {
        mybatisService.deleteMybatisModel();
    }

    /**
     * Test method for
     * {@link xyz.zeling.ssmconfig.modules.mybatis.MybatisService#insertMybatisModel()}.
     */
    @Repeat(5)
    @Test
    public void testInsertMybatisModel() {
        mybatisService.insertMybatisModel();
    }
}
