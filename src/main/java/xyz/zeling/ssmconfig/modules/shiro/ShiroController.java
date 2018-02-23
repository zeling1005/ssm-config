package xyz.zeling.ssmconfig.modules.shiro;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description TODO
 * @author zeling
 * @date 2018年2月13日 上午1:18:14
 */
@Controller
@RequestMapping("/shiro")
public class ShiroController {
    @RequestMapping("/main")
    public ModelAndView toMain() {
        return new ModelAndView("/shiro/main");
    }
    
    @RequestMapping("/user")
    @ResponseBody
    public ModelAndView user() {
        return new ModelAndView("/shiro/user");
    }

    @RequestMapping("login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
        boolean rememberMe = false;
        String username = String.valueOf(request.getParameter("username"));
        String password = String.valueOf(request.getParameter("password"));
        String rememberMeStr = String.valueOf(request.getParameter("rememberMe"));
        if ("true".equals(rememberMeStr)) {
            rememberMe = true;
        }
        UsernamePasswordToken loginToken = new UsernamePasswordToken(username, password, rememberMe);
        Subject current = SecurityUtils.getSubject();
        try {
            current.login(loginToken);
        } catch (UnknownAccountException uae) {
            // username wasn't in the system, show them an error message?
            return new ModelAndView("shiro/login");
        } catch (IncorrectCredentialsException ice) {
            // password didn't match, try again?
            return new ModelAndView("shiro/login");
        } catch (LockedAccountException lae) {
            // account for that username is locked - can't login. Show them a message?
            return new ModelAndView("shiro/login");
        } catch (AuthenticationException ae) {
            // unexpected condition - error?
            return new ModelAndView("shiro/login");
        }
        return new ModelAndView("shiro/loginSucc");
    }

    @RequestMapping("logout")
    public ModelAndView logout() {
        Subject current = SecurityUtils.getSubject();
        current.logout();
        return new ModelAndView("shiro/login");
    }
}
