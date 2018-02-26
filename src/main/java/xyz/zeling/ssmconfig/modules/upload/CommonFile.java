package xyz.zeling.ssmconfig.modules.upload;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

/**
 * @description TODO
 * @author zeling
 * @date 2018年1月28日 下午6:09:20 
 */
@Data
public class CommonFile implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 6425092382601043422L;
    private MultipartFile file;
}
