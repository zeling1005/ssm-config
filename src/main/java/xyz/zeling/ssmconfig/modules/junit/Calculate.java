package xyz.zeling.ssmconfig.modules.junit;

/**
 * @description junit测试类，一般来说，使用junit测试需要有被测试类，测试类以及运行junit测试类，不过有了类似eclipse的ide可以省略运行类
 * @author zeling
 * @date 2018年2月25日 下午3:08:49
 */
public class Calculate {
    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        // 这里只是最简单的测试demo，暂不做容错处理
        return a / b;
    }
}
