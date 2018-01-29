package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javaconfig.MyContext;
import service.UserinfoServiceA;
import service.UserinfoServiceB;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyContext.class);
		UserinfoServiceA serviceA = (UserinfoServiceA) context.getBean(UserinfoServiceA.class);
		serviceA.method1();
		System.out.println();
		UserinfoServiceB serviceB = (UserinfoServiceB) context.getBean(UserinfoServiceB.class);
		serviceB.method1();
	}
}
