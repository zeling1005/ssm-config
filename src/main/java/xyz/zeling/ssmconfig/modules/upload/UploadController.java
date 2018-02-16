package xyz.zeling.ssmconfig.modules.upload;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description TODO
 * @author zeling
 * @date 2018年1月28日 下午6:10:23 
 */
@Controller
@RequestMapping("/upload")
public class UploadController {
    
    @RequestMapping("/main")
    public ModelAndView toMain() {
        return new ModelAndView("/upload/main", "commonFile", new CommonFile());
    }
    
    @RequestMapping("result")
    public ModelAndView uploadResult(CommonFile commonFile) throws IOException {
        ModelAndView result = new ModelAndView("upload/main");
        result.addObject("fileLength", commonFile.getFile().getBytes().length);
        return result;
    }
    
    @RequestMapping("result/one")
    public ModelAndView uploadResultOne(@RequestParam("file") MultipartFile file) throws IOException {
        ModelAndView result = new ModelAndView("upload/main");
        result.addObject("fileLength", file.getBytes().length);
        return result;
    }
    
    @RequestMapping("result/two")
    public ModelAndView uploadResultTwo(@RequestParam("file") MultipartFile file) throws IOException {
        ModelAndView result = new ModelAndView("upload/main");
        result.addObject("commonFile", new CommonFile());
        result.addObject("fileLength", file.getBytes().length);
        return result;
    }
}
