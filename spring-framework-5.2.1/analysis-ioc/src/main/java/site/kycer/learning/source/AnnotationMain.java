package site.kycer.learning.source;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import site.kycer.learning.source.model.User;

/**
 * @author Kycer
 * @version 1.0.0
 * @date 2020-01-10
 */
@Configuration
@ComponentScan(basePackages = "site.kycer.learning.source")
public class AnnotationMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationMain.class);
		User user = (User) applicationContext.getBean("user");
		Assert.assertNotNull("容器初始化异常！", user);
		System.out.println(user);
	}

	@Bean(name = "user")
	public User getUser() {
		User user = new User();
		user.setUsername("kycer");
		user.setPassword("321@123.com");
		user.setEmail("321@123.com");
		user.setAge(25);
		return user;
	}
}
