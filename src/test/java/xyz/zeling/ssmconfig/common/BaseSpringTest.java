package xyz.zeling.ssmconfig.common;

import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description junit集成spring基类
 * @author zeling
 * @date 2018年2月25日 下午4:51:11 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-test.xml"})
// 开启事务并指定事务处理器
@Transactional("transactionManager")
// 事务默认回滚
@Rollback(true)
public class BaseSpringTest {
}
