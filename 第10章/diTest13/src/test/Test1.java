package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ac.xml");
		context.getBean("bookinfo1");
		context.getBean("bookinfo2");
		context.getBean("bookinfo3");
	}
}
