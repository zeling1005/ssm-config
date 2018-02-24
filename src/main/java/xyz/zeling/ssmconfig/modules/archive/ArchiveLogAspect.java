package xyz.zeling.ssmconfig.modules.archive;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description 日志切面类
 * @author zeling
 * @date 2018年2月25日 上午12:17:07
 */
public class ArchiveLogAspect {
    private static Logger log = LoggerFactory.getLogger(ArchiveLogAspect.class);
    /**
     * 日志信息
     */
    private SubjectLog subjectLog = null;

    /**
     * @description 前置通知
     * @date 2018年2月25日 上午12:35:00
     * @param joinPoint 切点
     */
    public void doBefore(JoinPoint joinPoint) {
        LocalDateTime start = LocalDateTime.now();
        subjectLog = new SubjectLog();
        subjectLog.setStartTime(start.toString());
        log.info("do before");
    }

    /**
     * @description 后置通知
     * @date 2018年2月25日 上午12:35:00
     * @param joinPoint 切点
     */
    public void doAfter(JoinPoint joinPoint) {
        LocalDateTime finish = LocalDateTime.now();
        subjectLog.setFinishTime(finish.toString());
        Signature signature = joinPoint.getSignature();
        if (signature instanceof MethodSignature) {
            MethodSignature methodSignature = (MethodSignature) signature;
            Method method = methodSignature.getMethod();
            ArchiveLog archiveLog = method.getAnnotation(ArchiveLog.class);
            subjectLog.setOperationType(archiveLog.operationType());
            subjectLog.setOperationName(archiveLog.operationName());
        }
        log.info("do after");
        log.info(subjectLog.toString());
    }

    /**
     * @description 异常通知
     * @date 2018年2月25日 上午12:35:00
     * @param joinPoint 切点
     * @param e 切点中抛出的异常
     */
    public void doAfterThrowing(JoinPoint joinPoint, Throwable e) {
        log.info("do after throwing");
        log.info(e.toString());
    }
}
