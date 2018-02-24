package xyz.zeling.ssmconfig.modules.archive;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

/**
 * @description TODO
 * @author zeling
 * @date 2018年2月25日 上午1:36:40
 */
@Controller
@RequestMapping("/archive")
public class ArchiveController {
    /**
     * @description 测试aop切面
     * @date 2018年2月25日 上午2:19:11
     * @return
     */
    @RequestMapping("/addUser")
    @ResponseBody
    @ArchiveLog(
        operationType = "add",
        operationName = "新增")
    public JSONObject addUser() {
        JSONObject result = new JSONObject();
        result.put("name", "addUser");
        return result;
    }
    
    /**
     * @description 测试切面中异常通知
     * @date 2018年2月25日 上午2:18:55
     * @return
     */
    @RequestMapping("/deleteUser")
    @ResponseBody
    @ArchiveLog(
        operationType = "delete",
        operationName = "删除")
    public JSONObject deleteUser() {
        JSONObject result = new JSONObject();
        result.put("name", "deleteUser");
        throw new NullPointerException();
        // return result;
    }
}
