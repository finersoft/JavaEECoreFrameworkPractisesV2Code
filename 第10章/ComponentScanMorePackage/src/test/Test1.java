package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("createbean");
	}

}
