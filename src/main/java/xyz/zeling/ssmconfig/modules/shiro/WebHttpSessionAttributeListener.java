package xyz.zeling.ssmconfig.modules.shiro;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * session 属性状态改变监听
 *
 * @author zeling
 * @date 2018年3月2日 下午8:09:46
 */
public class WebHttpSessionAttributeListener implements HttpSessionAttributeListener {
    private static Logger log = LoggerFactory.getLogger(WebHttpSessionAttributeListener.class);

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        log.info("web session attribute added.");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        log.info("web session attribute removed.");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        log.info("web session attribute replaced.");
    }
}
