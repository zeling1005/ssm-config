package xyz.zeling.ssmconfig.modules.shiro;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * session 状态监听
 *
 * @author zeling
 * @date 2018年3月2日 下午8:07:49 
 */
public class WebHttpSessionListener implements HttpSessionListener {
    private static Logger log = LoggerFactory.getLogger(WebHttpSessionListener.class);
    /* (non-Javadoc)
     * @see javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.HttpSessionEvent)
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("web session start.");
    }

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.HttpSessionEvent)
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("web session destroyed.");
    }
}
