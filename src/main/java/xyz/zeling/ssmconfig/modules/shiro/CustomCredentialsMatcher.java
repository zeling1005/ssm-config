package xyz.zeling.ssmconfig.modules.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

import xyz.zeling.ssmconfig.util.PasswordUtils;

/**
 * @description 自定义加密
 * @author zeling
 * @date 2018年2月12日 上午12:36:20 
 */
public class CustomCredentialsMatcher extends SimpleCredentialsMatcher {
    
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        if (token instanceof UsernamePasswordToken) {
            UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;  
            String username = usernamePasswordToken.getUsername();
            String password = String.valueOf(usernamePasswordToken.getPassword());
            Object tokenCredentials = PasswordUtils.encryptByMD5AndSalt(password, username); 
            Object accountCredentials = getCredentials(info);  
            return equals(tokenCredentials, accountCredentials);  
        }
        return false;
    }
}
