package xyz.zeling.ssmconfig.modules.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @description Calculate测试类
 * @author zeling
 * @date 2018年2月25日 下午3:10:06 
 */
public class CalculateTest {
    /**
     * @description 测试前运行方法，只会运行一次
     * @date 2018年2月25日 下午3:10:06
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }

    /**
     * @description 测试后运行方法，只会运行一次
     * @date 2018年2月25日 下午3:10:06
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("after class");
    }

    /**
     * @description 每个测试方法前运行
     * @date 2018年2月25日 下午3:10:06
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        System.out.println("before test");
    }

    /**
     * @description 每个测试方法后运行
     * @date 2018年2月25日 下午3:10:06
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        System.out.println("after test");
    }

    /**
     * Test method for {@link xyz.zeling.ssmconfig.modules.junit.Calculate#add(int, int)}.
     */
    @Test
    public void testAdd() {
        //fail("Not yet implemented");使用这个方法表明测试失败
        int addResult = new Calculate().add(3, 5);
        // 断言方法还有很多，详情请参考Assert类
        assertEquals(8, addResult);
        System.out.println("test add");
    }

    /**
     * Test method for {@link xyz.zeling.ssmconfig.modules.junit.Calculate#substract(int, int)}.
     * Ignore表明忽略这个方法的测试
     */
    @Ignore
    @Test
    public void testSubstract() {
        System.out.println("test substract");
    }

    /**
     * Test method for {@link xyz.zeling.ssmconfig.modules.junit.Calculate#multiply(int, int)}.
     * timeout=1000表明这个方法需要在1000毫秒内运行完毕
     */
    @Test(timeout=1000)
    public void testMultiply() {
        System.out.println("test multiply");
    }

    /**
     * Test method for {@link xyz.zeling.ssmconfig.modules.junit.Calculate#divide(int, int)}.
     * expected=NullPointerException.class表明需要抛出空指针异常
     */
    @Test(expected=NullPointerException.class)
    public void testDivide() {
        System.out.println("test divide");
        throw new NullPointerException();
    }
}
