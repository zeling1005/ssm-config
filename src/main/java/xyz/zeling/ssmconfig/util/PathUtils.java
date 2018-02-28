package xyz.zeling.ssmconfig.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @description 路径工具类
 * @author zeling
 * @date 2018年2月24日 下午9:12:34
 */
public class PathUtils {
    
    /**
     * @description 获取项目根路径
     * @date 2018年2月24日 下午9:16:41
     * @return 项目根路径，如：'D:\Programs\workspace\JavaEclipse\ssm-config'
     */
    public static String getProjectPath() {
        return System.getProperty("user.dir");
    }
    
    /**
     * @description 获取项目类路径
     * @date 2018年2月24日 下午9:18:45
     * @return 项目类路径，如：'/D:/Programs/workspace/JavaEclipse/ssm-config/target/classes/'
     */
    public static String getClasspathPath() {
        // PathUtil.class.getClassLoader().getResource("").getPath() 获取项目类路径
        // PathUtil.class.getClassLoader().getResource("/").getPath() 是错误的写法
        return PathUtils.class.getResource("/").getPath();
    }
    
    /**
     * @description 获取指定类的包路径
     * @date 2018年2月24日 下午9:21:13
     * @param clazz 指定类
     * @return 指定类的包路径，如：'/D:/Programs/workspace/JavaEclipse/ssm-config/target/classes/xyz/zeling/ssmconfig/util/'
     */
    public static String getClassPackagePath(Class<?> clazz) {
        return clazz.getResource("").getPath();
    }
    
    /**
     * @description 获取web项目部署目录
     * @date 2018年2月24日 下午9:58:18
     * @param request
     * @return web项目部署目录，如：'D:\Programs\workspace\JavaEclipse\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\ssm-config\'
     */
    public static String getDeployPath(HttpServletRequest request) {
        // OR request.getSession().getServletContext().getRealPath("")
        return request.getSession().getServletContext().getRealPath("/");
    }
    
    /**
     * @description 获取项目访问根路径
     * @date 2018年2月24日 下午9:59:05
     * @param request
     * @return 项目访问根路径，如：'http://localhost:8080'
     */
    public static String getHttpRootPath(HttpServletRequest request) {
        return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + request.getContextPath();
    }
    
    /**
     * @description 获取页面访问绝对路径
     * @date 2018年2月24日 下午9:59:05
     * @param request
     * @return 页面访问绝对路径，如：'http://localhost:8080/welcome/getJson'
     */
    public static String getHttpAbsolutePath(HttpServletRequest request) {
        return request.getRequestURL().toString();
    }
    
    /**
     * @description 获取页面访问相对路径
     * @date 2018年2月24日 下午9:59:05
     * @param request
     * @return 页面访问相对路径，如：'/welcome/getJson'
     */
    public static String getHttpRelativePath(HttpServletRequest request) {
        // OR request.getServletPath().toString()
        return request.getRequestURI().toString();
    }
    
    /**
     * @description 测试
     * @date 2018年2月12日 上午1:19:25
     * @param args
     */
    public static void main(String[] args) {
        // ...
    }
}
