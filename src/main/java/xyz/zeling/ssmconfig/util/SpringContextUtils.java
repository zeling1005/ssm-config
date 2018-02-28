package xyz.zeling.ssmconfig.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * spring context 工具类
 * 
 * @author zeling
 * @date 2018年3月1日 上午12:52:35
 */
@Component
@Lazy(false)
public class SpringContextUtils implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    /**
     * spring初始化时，会调用这个方法，设置spring context
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtils.applicationContext = applicationContext;
    }

    /**
     * 获取spring context
     *
     * @return the application context {@code ApplicationContext}
     * @date 2018年3月1日 上午12:57:17
     */
    public static ApplicationContext getApplicationContext() {
        isInjected();
        return applicationContext;
    }

    /**
     * 判断是否注入spring context
     *
     * @date 2018年3月1日 上午1:17:17
     */
    private static void isInjected() {
        if (SpringContextUtils.applicationContext == null) {
            throw new RuntimeException("SpringContextUtils applicationContext is not injected!");
        }
    }

    /**
     * 测试
     * 
     * @param args
     * @date 2018年3月1日 上午12:52:35
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
}
