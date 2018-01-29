package handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import bookservice.DangDangBook;

public class LogInvocationHandler implements InvocationHandler {

	private Object anyObject;

	public LogInvocationHandler(Object anyObject) {
		super();
		this.anyObject = anyObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("log begin time=" + System.currentTimeMillis());
		method.invoke(anyObject);
		System.out.println("log   end time=" + System.currentTimeMillis());
		return null;
	}

}
