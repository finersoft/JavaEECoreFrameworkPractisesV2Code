package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Bookinfo;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("ac1.xml");
		System.out.println(context1.getBean("userinfo").hashCode());
		System.out.println(context1.getBean("createBookinfo").hashCode());
		System.out.println(context1.getBean(Bookinfo.class).hashCode());
	}
}
