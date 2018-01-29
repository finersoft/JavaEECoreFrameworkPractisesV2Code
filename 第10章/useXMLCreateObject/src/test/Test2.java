package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Userinfo;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ac.xml");
		Userinfo userinfo1 = (Userinfo) context.getBean("userinfo1");
		Userinfo userinfo2 = (Userinfo) context.getBean("userinfo2");
		System.out.println();
		System.out.println(userinfo1.hashCode());
		System.out.println(userinfo2.hashCode());
	}

}
