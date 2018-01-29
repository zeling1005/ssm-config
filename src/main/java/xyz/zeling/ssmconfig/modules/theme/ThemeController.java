package xyz.zeling.ssmconfig.modules.theme;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description TODO
 * @author zeling
 * @date 2018年1月29日 下午8:32:30
 */
@Controller
// 只要有加一级的路径，主题就死活应用不上，我也很绝望啊
// @RequestMapping("/theme")
public class ThemeController {
    @RequestMapping("/main")
    public ModelAndView main() {
        return new ModelAndView("/theme/main");
    }

    @RequestMapping("/form")
    public ModelAndView user() {
        return new ModelAndView("/theme/form", "user", new User());
    }

    @RequestMapping("/result")
    public ModelAndView processUser(User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("u", user);
        modelAndView.setViewName("/theme/result");
        return modelAndView;
    }
}
