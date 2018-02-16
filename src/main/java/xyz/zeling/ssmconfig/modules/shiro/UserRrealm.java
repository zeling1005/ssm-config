package xyz.zeling.ssmconfig.modules.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAccount;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @description 自定义realm
 * @author zeling
 * @date 2018年2月12日 上午12:14:05
 */
public class UserRrealm extends AuthorizingRealm {
    /**
     * 验证通过后，这里进行授权认证
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * 验证，比如说用户名和密码是否符合要求
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        SimpleAccount accountInfo = new SimpleAccount(token.getPrincipal(), token.getCredentials(), "zeling");
        Object principal = token.getPrincipal();
        if("zeling".equals(String.valueOf(principal))) {
            accountInfo.setCredentials("1678fff13f3a9b70308bcde3afdad0e8");
        }
        return accountInfo;
    }
}
