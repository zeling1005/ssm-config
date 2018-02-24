package xyz.zeling.ssmconfig.modules.archive;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description 日志类实体
 * @author zeling
 * @date 2018年2月25日 上午12:03:09 
 */
@Getter
@Setter
@ToString
public class SubjectLog implements Serializable {
    private static final long serialVersionUID = -1298312175689975824L;
    
    /**
     * 用户名
     */
    private String username;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 结束时间
     */
    private String finishTime;
    /**
     * 操作类型
     */
    private String operationType;
    /**
     * 操作名称
     */
    private String operationName;
}
