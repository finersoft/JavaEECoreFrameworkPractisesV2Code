package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springconfig.SpringConfig;

public class Test1 {
	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(SpringConfig.class);
	}
}
