package site.kycer.learning.source.model;

/**
 * 用户模型
 *
 * @author Kycer
 * @version 1.0.0
 * @date 2020-01-10
 */
public class User {

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;


	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 年龄
	 */
	private Integer age;


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", age=" + age +
				'}';
	}
}
