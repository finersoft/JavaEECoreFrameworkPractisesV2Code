package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entity.Bookinfo;
import entity.Userinfo;
import springconfig.SpringConfig1;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfig1.class);
		System.out.println("context1=" + context1.getBean(Bookinfo.class).hashCode());
		System.out.println("context2=" + context1.getBean(Userinfo.class).hashCode());
	}
}
