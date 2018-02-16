package xyz.zeling.ssmconfig.modules.exception.handling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description 异常处理方式二，使用ControllerAdvice
 * @author zeling
 * @date 2018年1月29日 下午11:43:59
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception e) {
        System.out.println("打印异常信息：");
        e.printStackTrace();
        return new ModelAndView("/exception/handling/errorGlobal");
    }
}
