package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("ac2.xml");
		System.out.println(context.getBean("mydate"));
		Thread.sleep(3000);
		System.out.println(context.getBean("mydate"));
		Thread.sleep(3000);
		System.out.println(context.getBean("mydate"));
		Thread.sleep(3000);
		System.out.println(context.getBean("mydate"));
		context.getBean("mydate");
	}

}
