package xyz.zeling.ssmconfig.modules.shiro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description TODO
 * @author zeling
 * @date 2018年2月13日 上午1:18:14 
 */
@Controller
@RequestMapping("shiro")
public class ShiroController {
    @RequestMapping("main")
    public ModelAndView toMain() {
        return new ModelAndView("shiro/main");
    }
    
    @RequestMapping("login")
    public ModelAndView login() {
        return new ModelAndView("shiro/login");
    }
    
    @RequestMapping("logout")
    public ModelAndView logout() {
        return new ModelAndView("shiro/logout");
    }
}
