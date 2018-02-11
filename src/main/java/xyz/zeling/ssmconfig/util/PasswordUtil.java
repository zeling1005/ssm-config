package xyz.zeling.ssmconfig.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @description 密码工具
 * @author zeling
 * @date 2018年2月12日 上午1:05:29
 */
public class PasswordUtil {
    /**
     * @description 密码使用MD5盐值加密
     * @date 2018年2月12日 上午1:14:17
     * @param source 需要加密的字符串，也就是原始密码
     * @param salt 原始盐值，可以用用户名
     * @return
     */
    public static String encryptByMD5AndSalt(String source, String salt) {
        ByteSource credentialsSalt = ByteSource.Util.bytes(salt);
        return new SimpleHash("MD5", source, credentialsSalt, 1024).toString();
    }
    
    /**
     * @description 测试
     * @date 2018年2月12日 上午1:19:25
     * @param args
     */
    public static void main(String[] args) {
        // System.out.println(encryptByMD5AndSalt("123456", "admin"));
        char[] sdj = {'1','2','3','4'};
        System.out.println(String.valueOf(sdj));
    }
}
