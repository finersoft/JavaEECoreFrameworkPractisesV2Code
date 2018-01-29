package test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Bookinfo;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ac.xml");

		Bookinfo bookinfo1 = (Bookinfo) context.getBean("bookinfo1");
		System.out.println(bookinfo1.getUsername());
		System.out.println();

		Bookinfo bookinfo2 = (Bookinfo) context.getBean("bookinfo2");
		System.out.println(bookinfo2.getNowDate());
		System.out.println();

		Bookinfo bookinfo3 = (Bookinfo) context.getBean("bookinfo3");
		List<String> listString = bookinfo3.getListString();
		for (int i = 0; i < listString.size(); i++) {
			System.out.println(listString.get(i));
		}
		System.out.println();

		Bookinfo bookinfo4 = (Bookinfo) context.getBean("bookinfo4");
		List<Date> listDate = bookinfo4.getListDate();
		for (int i = 0; i < listDate.size(); i++) {
			System.out.println(listDate.get(i));
		}
		System.out.println();

		System.out.println();
		System.out.println();

		Bookinfo bookinfo5 = (Bookinfo) context.getBean("bookinfo5");
		System.out.println(bookinfo5.getUsername());
		System.out.println();

		Bookinfo bookinfo6 = (Bookinfo) context.getBean("bookinfo6");
		System.out.println(bookinfo6.getNowDate());
		System.out.println();

		Bookinfo bookinfo7 = (Bookinfo) context.getBean("bookinfo7");
		listString = bookinfo7.getListString();
		for (int i = 0; i < listString.size(); i++) {
			System.out.println(listString.get(i));
		}
		System.out.println();

		Bookinfo bookinfo8 = (Bookinfo) context.getBean("bookinfo8");
		listDate = bookinfo8.getListDate();
		for (int i = 0; i < listDate.size(); i++) {
			System.out.println(listDate.get(i));
		}
	}
}
