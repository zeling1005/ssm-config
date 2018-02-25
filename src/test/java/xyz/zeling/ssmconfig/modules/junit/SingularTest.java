package xyz.zeling.ssmconfig.modules.junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * @description Singular测试类，参数化测试，还有使用构造器的参数化测试，如果需要重复测试的话，可以使用RepeatedTest.class
 * @author zeling
 * @date 2018年2月25日 下午3:45:05
 */
@RunWith(Parameterized.class)
public class SingularTest {
    /**
     * 期望结果 Parameter(0)表示获取参数位置0的参数
     */
    @Parameter(0)
    public boolean expectedResult;
    /**
     * 每次测试输入数字
     */
    @Parameter(1)
    public int inputFigure;

    /**
     * @description 构造参数
     * @date 2018年2月25日 下午4:03:18
     * @return
     */
    @Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] { { true, 1 }, { false, 2 }, { true, 3 } });
    }

    /**
     * Test method for
     * {@link xyz.zeling.ssmconfig.modules.junit.Singular#isSingular(int)}.
     */
    @Test
    public void testIsSingular() {
        assertEquals(expectedResult, new Singular().isSingular(inputFigure));
    }
}
