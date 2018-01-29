package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Userinfo;

public class Test2 {

	public Test2() {
		System.out.println("public Test() " + this.hashCode());
	}

	private Userinfo userinfo;

	public Userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
		System.out.println("public void setUserinfo(Userinfo userinfo) userinfo=" + userinfo);
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ac.xml");
		Test2 test = (Test2) context.getBean("test2");
		System.out.println("main test " + test.hashCode());
		System.out.println(test.getUserinfo().hashCode());
	}

}
