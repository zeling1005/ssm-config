package xyz.zeling.ssmconfig.modules.exception.handling;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description TODO
 * @author zeling
 * @date 2018年1月29日 上午12:44:51
 */
@Controller
@RequestMapping("exception/handling")
public class ExceptionHandleController {
    private Map<String, User> users = new HashMap<String, User>();

    @PostConstruct
    public void setup() {
        users.put("mert", new User("Mert", "Caliskan"));
        users.put("kenan", new User("Kenan", "Sevindik"));
    }

    @RequestMapping("main")
    public ModelAndView toMain() {
        return new ModelAndView("/exception/handling/main");
    }

    @RequestMapping("form")
    public ModelAndView user() {
        return new ModelAndView("exception/handling/userForm", "user", new User());
    }

    @RequestMapping("result")
    public ModelAndView processUser(String name) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        User user = users.get(name);
        if ("johndoe".equals(name)) {
            throw new Exception();
        }
        if (user == null) {
            throw new UserNotFoundException(name);
        }
        modelAndView.addObject("u", user);
        modelAndView.setViewName("exception/handling/userResult");
        return modelAndView;
    }
    
    /**
     * @description TODO
     * @date 2018年1月29日 下午11:50:58
     * @param e 注解使用的异常，可以当作参数
     * @return
     * @throws Exception
     */
    /*@ExceptionHandler(UserNotFoundException.class)
    public ModelAndView handleException(UserNotFoundException e) {
        ModelAndView modelAndView = new ModelAndView("exception/handling/errorUser");
        modelAndView.addObject("errorMessage", e.getMessage());
        return modelAndView;
    }*/
}
