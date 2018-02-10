package xyz.zeling.ssmconfig.modules.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description TODO
 * @author zeling
 * @date 2018年2月10日 下午10:00:55
 */
@Controller
@RequestMapping("mybatis")
public class MybatisController {
    @Autowired
    private MybatisService service;

    @RequestMapping("main")
    public ModelAndView toMain() {
        return new ModelAndView("mybatis/main");
    }

    @RequestMapping("deleteMybatisModel")
    public ModelAndView deleteMybatisModel() {
        service.deleteMybatisModel();
        return new ModelAndView("mybatis/main");
    }

    @RequestMapping("listMybatisModel")
    public ModelAndView listMybatisModel() {
        service.listMybatisModel();
        return new ModelAndView("mybatis/main");
    }

    @RequestMapping("insertMybatisModel")
    public ModelAndView insertMybatisModel() {
        service.insertMybatisModel();
        return new ModelAndView("mybatis/main");
    }
}
