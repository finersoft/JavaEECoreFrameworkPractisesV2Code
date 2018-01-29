package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entity.Bookinfo;
import entity.Userinfo;
import springconfig.SpringConfig1;
import springconfig.SpringConfig2;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfig1.class);
		ApplicationContext context2 = new AnnotationConfigApplicationContext(SpringConfig2.class);

		System.out.println("context1=" + context1.getBean(Bookinfo.class).hashCode());
		System.out.println("context2=" + context2.getBean(Userinfo.class).hashCode());
	}
}
