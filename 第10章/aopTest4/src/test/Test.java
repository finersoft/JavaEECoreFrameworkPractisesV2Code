package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javaconfig.MyContext;
import service.UserinfoService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyContext.class);
		UserinfoService service = (UserinfoService) context.getBean(UserinfoService.class);
		service.method1();
		System.out.println();
		System.out.println();
		System.out.println("main get method2 returnValue=" + service.method2());
		System.out.println();
		System.out.println();
		System.out.println("main get method3 returnValue=" + service.method3());

	}

}
