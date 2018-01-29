package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bookservice.ISendBook;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ac1.xml");
		ISendBook sendBook = (ISendBook) context.getBean("proxy");
		sendBook.sendBook();
		System.out.println();
		System.out.println();
		System.out.println();
		sendBook.sendBookError();
	}

}
