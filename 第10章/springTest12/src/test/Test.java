package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private String username = "���Ǵ��й�";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ac1.xml");
		Test test = context.getBean(Test.class);
		System.out.println(test.getUsername());
		System.out.println(test.getUsername() == null);
	}

}
