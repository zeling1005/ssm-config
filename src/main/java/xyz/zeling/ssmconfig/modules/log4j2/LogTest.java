package xyz.zeling.ssmconfig.modules.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description TODO
 * @author zeling
 * @date 2018年2月11日 下午10:44:46
 */
public class LogTest {
    /**
     * 日志输出
     */
    private static Logger log = LoggerFactory.getLogger(LogTest.class);

    /**
     * @description TODO
     * @date 2018年2月11日 下午10:44:52
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        log.trace("trace");
        log.debug("debug");
        log.warn("warn");
        log.info("info");
        log.error("error");
    }
}
