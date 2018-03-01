package xyz.zeling.ssmconfig.modules.shiro;

import org.apache.shiro.SecurityUtils;
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
        // 可使用缓存
        return null;
    }

    /**
     * 验证，比如说用户名和密码是否符合要求
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 可使用缓存
        SimpleAccount accountInfo = new SimpleAccount(token.getPrincipal(), token.getCredentials(), "zeling");
        Object principal = token.getPrincipal();
        if ("zeling".equals(String.valueOf(principal))) {
            accountInfo.setCredentials("1678fff13f3a9b70308bcde3afdad0e8");
        }
        return accountInfo;
    }

    /**
     * 如果用户正常退出，缓存自动清空。 如果用户非正常退出，缓存自动清空。
     * 如果修改了用户的权限，而用户不退出系统，修改的权限无法立即生效，需要手动进行编程实现： 在权限修改后调用realm的clearCache方法清除缓存。
     * 正常开发时要放在service中调用。
     *
     * @date 2018年3月2日 上午1:54:29
     */
    public void clearCached() {
        PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
        super.clearCache(principals);
    }
}
