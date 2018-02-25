package xyz.zeling.ssmconfig.common;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

/**
 * @description junit测试controller方法基类
 * @author zeling
 * @date 2018年2月25日 下午8:16:48 
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 表示这是测试web应用
@WebAppConfiguration
@ContextConfiguration({"classpath:spring/spring.xml", "classpath:spring/spring-mvc.xml"})
// 开启事务并指定事务处理器
@Transactional("transactionManager")
// 事务默认回滚
@Rollback(true)
public class BaseSpringWebTest {
    
    @Autowired
    private WebApplicationContext wac;
    /**
     * 模拟http请求
     */
    private MockMvc mockMvc;
    
    /**
     * @description 如果子类有@Before注解的方法，这个方法将会失效
     * @date 2018年2月25日 下午8:46:14
     */
    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    
    /**
     * @description 子类没有实现@Before方法时，可用这个方法获取MockMvc
     * @date 2018年2月25日 下午8:47:13
     * @return
     */
    public MockMvc getMockMvc() {
        return mockMvc;
    }
}
