package xyz.zeling.ssmconfig.common;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import xyz.zeling.ssmconfig.modules.junit.CalculateTest;
import xyz.zeling.ssmconfig.modules.junit.SingularTest;

/**
 * @description junit套件测试，即将多个junit测试类一起测试
 * @author zeling
 * @date 2018年2月25日 下午3:35:41 
 */
@RunWith(Suite.class)
@SuiteClasses({
    CalculateTest.class,
    SingularTest.class
})
public class JunitTestSuite {
}
