package test;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import service.ISaveService;

@Component
public class Test {

	@Resource(name = "serviceXML")
	private ISaveService service;

	public ISaveService getService() {
		return service;
	}

	public void setService(ISaveService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ac1.xml");
		Test test = context.getBean(Test.class);
		test.getService().saveMethod();
	}

}
