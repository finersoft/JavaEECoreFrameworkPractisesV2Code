package test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ac.xml");
		context.getBean("bookinfo1");
		context.getBean("bookinfo2");
		context.getBean("bookinfo3");
		context.getBean("bookinfo4");

		Date date1 = (Date) context.getBean("date1");
		Date date2 = (Date) context.getBean("date2");
		Date date3 = (Date) context.getBean("date3");
		Date date4 = (Date) context.getBean("date4");

	}
}
