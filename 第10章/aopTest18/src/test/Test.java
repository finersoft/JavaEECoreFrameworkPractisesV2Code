package test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserinfoService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ac1.xml");
		UserinfoService service = (UserinfoService) context.getBean(UserinfoService.class);
		service.method1();
		System.out.println();
		System.out.println();
		System.out.println("main get valueA =" + service.method2(100));
		System.out.println();
		System.out.println();
		System.out.println("main get valueB =" + service.method3("中国", "中国人", 100, new Date()));
	}
}
