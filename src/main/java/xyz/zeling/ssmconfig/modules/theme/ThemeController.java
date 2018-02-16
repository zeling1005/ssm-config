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
@RequestMapping("/theme")
public class ThemeController {
    @RequestMapping("/main")
    public ModelAndView toMain() {
        return new ModelAndView("/theme/main");
    }
}
