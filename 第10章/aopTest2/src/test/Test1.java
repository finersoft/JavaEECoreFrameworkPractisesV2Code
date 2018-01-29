package test;

import java.lang.reflect.Proxy;

import bookservice.DangDangBook;
import bookservice.ISendBook;
import bookservice.JDBook;
import handler.LogInvocationHandler;

public class Test1 {

	public static void main(String[] args) {
		DangDangBook dangdangBook = new DangDangBook();
		JDBook jdBook = new JDBook();
		LogInvocationHandler handler = 
				new LogInvocationHandler(dangdangBook);

		ISendBook sendBook = 
				(ISendBook) Proxy.newProxyInstance(
				Test1.class.getClassLoader(),
				dangdangBook.getClass().getInterfaces(), 
				handler
				);
		sendBook.sendBook();
	}

}
