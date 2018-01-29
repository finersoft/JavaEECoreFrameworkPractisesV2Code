package test;

import java.lang.reflect.Proxy;

import handler.LogInvocationHandler;
import tvservice.DangDangTV;
import tvservice.ISendTV;
import tvservice.JDTV;


public class Test2 {
	public static void main(String[] args) {
		DangDangTV dangdangTV = new DangDangTV();
		JDTV jdTV = new JDTV();
		LogInvocationHandler handler = new LogInvocationHandler(dangdangTV);

		ISendTV sendTV = (ISendTV) Proxy.newProxyInstance(Test2.class.getClassLoader(),
				dangdangTV.getClass().getInterfaces(), handler);
		sendTV.sendTV();
	}

}
