package xyz.zeling.ssmconfig.modules.welcome;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description TODO
 * @author zeling
 * @date 2018年2月10日 上午12:27:34 
 */
@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    
    @RequestMapping("/main")
    public ModelAndView toMain() {
        return new ModelAndView("/welcome/main");
    }
    
    @RequestMapping("/getJson")
    @ResponseBody
    public Map<String, Object> getJson() {
        Map<String, Object> result = new HashMap<>();
        result.put("name", "zeling");
        result.put("age", "25");
        return result;
    }
}
