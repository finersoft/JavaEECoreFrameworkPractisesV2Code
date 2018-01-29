package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("createbean");
		System.out.println();
		System.out.println(context.getBean("u2").hashCode());
	}

}
