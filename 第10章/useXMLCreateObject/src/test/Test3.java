package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Userinfo;

public class Test3 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ac.xml");
		Userinfo userinfo1 = (Userinfo) context.getBean(Userinfo.class);
		// Exception in thread "main"
		// org.springframework.beans.factory.NoUniqueBeanDefinitionException: No
		// qualifying bean of type 'entity.Userinfo' available: expected single
		// matching bean but found 3: userinfo1,userinfo2,userinfo3

	}

}
