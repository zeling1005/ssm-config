package xyz.zeling.ssmconfig.modules.mybatis;

import lombok.Data;

/**
 * @description TODO
 * @author zeling
 * @date 2018年2月10日 下午10:11:59
 */
@Data
public class MybatisModel {
    /**
     * <pre>
     *  `id` int(11) NOT NULL AUTO_INCREMENT,
     *  `rtxno` int(11) NOT NULL,
     *  `username` varchar(64) NOT NULL,
     *  `password` varchar(128) NOT NULL,
     *  `email` varchar(64) NOT NULL,
     *  `realname` varchar(128) NOT NULL,
     * </pre>
     */
    private Integer id;
    private Integer rtxno;
    private String username;
    private String password;
    private String email;
    private String realname;
}
