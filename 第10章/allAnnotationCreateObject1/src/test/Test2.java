package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entity.Userinfo;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("createbean");
		context.getBean(Userinfo.class);
	}

}
