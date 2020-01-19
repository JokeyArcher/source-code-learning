package site.kycer.learning.source;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * 加载Bean过程
 *
 * @author Kycer
 * @version 1.0.0
 * @date 2020-01-18
 */
public class LoadBeanMain {
	public static void main(String[] args) {
		// 获取资源
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		// 获取 BeanFactory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		// 根据新建的 BeanFactory 创建一个BeanDefinitionReader对象，该Reader 对象为资源的解析器
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		// 装载资源 整个过程就分为三个步骤：资源定位、装载、注册，
		reader.loadBeanDefinitions(resource);
	}
}
