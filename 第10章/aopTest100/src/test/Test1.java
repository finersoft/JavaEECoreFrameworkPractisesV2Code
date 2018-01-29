package test;

import java.lang.reflect.Proxy;
import java.util.Date;

import bookservice.DangDangBook;
import bookservice.ISendBook;
import handler.LogInvocationHandler;

public class Test1 {

	public static void main(String[] args) {
		DangDangBook dangdangBook = new DangDangBook();
		LogInvocationHandler handler = new LogInvocationHandler(dangdangBook);
		ISendBook sendBook = (ISendBook) Proxy.newProxyInstance(Test1.class.getClassLoader(),
				dangdangBook.getClass().getInterfaces(), handler);
		Object a = sendBook;
		sendBook.sendBook(new Date(), 123);
	}

}
