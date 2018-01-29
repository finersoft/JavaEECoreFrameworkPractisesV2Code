package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("ac1.xml");
		ApplicationContext context2 = new ClassPathXmlApplicationContext("ac2.xml");
		System.out.println(context1.getBean("userinfo").hashCode());
		System.out.println(context2.getBean("bookinfo").hashCode());
	}
}
