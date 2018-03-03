package xyz.zeling.ssmconfig.modules.shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListenerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * shiro session 监听
 *
 * @author zeling
 * @date 2018年3月2日 下午7:58:21 
 */
public class ShiroSessionListener extends SessionListenerAdapter {
    private static Logger log = LoggerFactory.getLogger(ShiroSessionListener.class);
    /* (non-Javadoc)
     * @see org.apache.shiro.session.SessionListener#onStart(org.apache.shiro.session.Session)
     */
    @Override
    public void onStart(Session session) {
        log.info("shiro session start.");
    }

    /* (non-Javadoc)
     * @see org.apache.shiro.session.SessionListener#onStop(org.apache.shiro.session.Session)
     */
    @Override
    public void onStop(Session session) {
        log.info("shiro session stop.");
    }
}
