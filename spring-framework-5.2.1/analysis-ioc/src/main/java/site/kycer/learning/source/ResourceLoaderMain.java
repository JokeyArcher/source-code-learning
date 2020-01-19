package site.kycer.learning.source;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;

import java.io.IOException;

/**
 * 测试资源加载
 *
 * @author Kycer
 * @version 1.0.0
 * @date 2020-01-18
 */
public class ResourceLoaderMain {

	public static void main(String[] args) throws IOException {
		ResourceLoader loader = new DefaultResourceLoader();
		Resource urlResource = loader.getResource("http://www.baidu.com");
		// InputStream inputStream = urlResource.getInputStream();
		// String str = new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.joining(System.lineSeparator()));
		// System.out.println(str);
		System.out.println(urlResource instanceof UrlResource);

		Resource classPathResource = loader.getResource("applicationContext.xml");
		System.out.println(classPathResource instanceof ClassPathResource);

		Resource fileResource = loader.getResource("C:\\Kycer\\Code\\Java\\learning\\source-code-learning\\spring-framework-5.2.1\\analysis-ioc\\src\\main\\resources\\applicationContext.xml");
		System.out.println(fileResource instanceof ClassPathResource);
		System.out.println(fileResource instanceof FileSystemResource);

	}
}
