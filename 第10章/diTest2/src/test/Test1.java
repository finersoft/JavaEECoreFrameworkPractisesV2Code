package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import entity.Userinfo;

@Component
public class Test1 {

	public Test1() {
		System.out.println("public Test() " + this.hashCode());
	}

	@Autowired
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
		Test1 test = (Test1) context.getBean(Test1.class);
		System.out.println("main test " + test.hashCode());
		System.out.println(test.getUserinfo().hashCode());
	}

}
