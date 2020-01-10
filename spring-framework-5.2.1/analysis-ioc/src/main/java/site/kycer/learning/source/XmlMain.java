package site.kycer.learning.source;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.kycer.learning.source.model.User;

/**
 * 测试
 *
 * @author Kycer
 * @version 1.0.0
 * @date 2020-01-10
 */
public class XmlMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) applicationContext.getBean("user");
		Assert.assertNotNull("容器初始化异常！", user);
		System.out.println(user);
	}

}
