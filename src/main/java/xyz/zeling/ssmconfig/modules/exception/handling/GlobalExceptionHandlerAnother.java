package xyz.zeling.ssmconfig.modules.exception.handling;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description 异常处理方式三，继承HandlerExceptionResolver，并使之成为bean
 * @author zeling
 * @date 2018年1月29日 上午1:31:31
 */
// @Component
public class GlobalExceptionHandlerAnother implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
        Exception ex) {
        return new ModelAndView("exception/handle/errorGlobal");
    }
}
