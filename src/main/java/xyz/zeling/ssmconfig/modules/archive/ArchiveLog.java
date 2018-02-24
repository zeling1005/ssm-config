package xyz.zeling.ssmconfig.modules.archive;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description 获取操作信息注解
 * @author zeling
 * @date 2018年2月24日 下午11:51:56
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ArchiveLog {
    /**
     * @description 获取操作类型，如：add
     * @date 2018年2月24日 下午11:56:55
     * @return 操作类型
     */
    public String operationType() default "type";

    /**
     * @description 获取操作名称，如：添加用户
     * @date 2018年2月24日 下午11:57:28
     * @return 操作名称
     */
    public String operationName() default "name";
}
