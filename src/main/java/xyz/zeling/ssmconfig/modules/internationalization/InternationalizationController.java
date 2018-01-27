package xyz.zeling.ssmconfig.modules.internationalization;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description TODO
 * @author zeling
 * @date 2018年1月27日 下午3:08:35 
 */
@Controller
@RequestMapping("/internationalization")
public class InternationalizationController {
    
    @RequestMapping("/main")
    public ModelAndView toMain() {
        return new ModelAndView("internationalization/main");
    }
}
