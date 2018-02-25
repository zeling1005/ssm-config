package xyz.zeling.ssmconfig.modules.junit;

/**
 * @description 单数类
 * @author zeling
 * @date 2018年2月25日 下午3:39:05
 */
public class Singular {
    /**
     * @description 根据输入的正整数返回true或者false
     * @date 2018年2月25日 下午3:41:49
     * @param figure 正整数
     * @return 单数就返回true，双数就返回false
     */
    public boolean isSingular(int figure) {
        if (figure > 0 && figure % 2 != 0)
            return true;
        return false;
    }
}
