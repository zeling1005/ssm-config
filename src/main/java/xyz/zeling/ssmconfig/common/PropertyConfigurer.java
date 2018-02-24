package xyz.zeling.ssmconfig.common;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

/**
 * @description 自定义PropertyPlaceholderConfigurer类，操作properties文件
 * @author zeling
 * @date 2018年2月24日 下午8:04:49
 */
public class PropertyConfigurer extends PropertyPlaceholderConfigurer {
    /**
     * 存储properties文件的key-value结果
     */
    private Properties props;

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props)
        throws BeansException {
        super.processProperties(beanFactoryToProcess, props);
        this.props = props;
    }

    /**
     * @description 添加属性文件的key-value
     * @date 2018年2月24日 下午8:42:50
     * @param path 属性文件路径
     * @param encoding 属性文件编码
     * @throws IOException
     */
    public void fillProperties(String path, String encoding) throws IOException {
        if (props == null) {
            props = new Properties();
        }
        PropertiesLoaderUtils.fillProperties(props, new EncodedResource(new FileSystemResource(path), encoding));
    }

    /**
     * @description 根据key获取value，没找到则返回null
     * @date 2018年2月24日 下午8:09:05
     * @param key
     * @return key对应的value或者null
     */
    public String getProperty(String key) {
        return this.props.getProperty(key);
    }

    /**
     * @description 根据key获取value，没找到则返回默认的value
     * @date 2018年2月24日 下午8:10:30
     * @param key
     * @param defaultValue 默认的value
     * @return 返回key对应的value或者defaultValue
     */
    public String getProperty(String key, String defaultValue) {
        return this.props.getProperty(key, defaultValue);
    }

    /**
     * @description 给key设置value
     * @date 2018年2月24日 下午8:11:43
     * @param key
     * @param value 新value
     * @return 返回之前的value，或者返回null
     */
    public Object setProperty(String key, String value) {
        return this.props.setProperty(key, value);
    }
}
