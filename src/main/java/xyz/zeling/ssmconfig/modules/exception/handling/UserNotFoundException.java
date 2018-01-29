package xyz.zeling.ssmconfig.modules.exception.handling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @description 使用@ResponseStatus可以返回自定义状态码，注意这个如果用在Controller层的方法上，则一定会执行，即返回错误码界面
 * @author zeling
 * @date 2018年1月29日 下午11:48:44
 */
@ResponseStatus(
    value = HttpStatus.BAD_REQUEST,
    reason = "测试自定义返回码")
public class UserNotFoundException extends Exception {
    private static final long serialVersionUID = -8695002135215307249L;

    public UserNotFoundException(String name) {
        super("User not found with name: " + name);
    }
}
