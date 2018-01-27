package xyz.zeling.ssmconfig.modules.validator;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description TODO
 * @author zeling
 * @date 2018年1月27日 下午2:29:42
 */
@Controller
@RequestMapping("/validator")
public class ValidatorController {
    @RequestMapping("/main")
    public ModelAndView toMain(HttpServletRequest request) {
        return new ModelAndView("validator/main");
    }

    @RequestMapping(
        value = "/form")
    public ModelAndView user() {
        return new ModelAndView("validator/userForm", "user", new User());
    }

    @RequestMapping(
        value = "/result")
    public ModelAndView processUser(@Valid User user, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("u", user);
        if (result.hasErrors()) {
            modelAndView.setViewName("validator/userForm");
        } else {
            modelAndView.setViewName("validator/userResult");
        }
        return modelAndView;
    }
}
