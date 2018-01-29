package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import service.IUserinfoService;

@Component
public class Test1 {

	public Test1() {
		System.out.println("public Test() " + this.hashCode());
	}

	@Autowired
	private IUserinfoService userinfoService;

	public IUserinfoService getUserinfoService() {
		return userinfoService;
	}

	public void setUserinfoService(IUserinfoService userinfoService) {
		this.userinfoService = userinfoService;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ac.xml");
		Test1 test = (Test1) context.getBean(Test1.class);
		test.getUserinfoService().save();
	}

}
