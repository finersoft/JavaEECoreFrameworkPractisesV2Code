package test;

import java.util.Iterator;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private Properties prop;

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ac1.xml");
		Test test = context.getBean(Test.class);
		Iterator iterator = test.getProp().keySet().iterator();
		while (iterator.hasNext()) {
			String key = "" + iterator.next();
			System.out.println(key + " " + test.getProp().getProperty(key));
		}
		System.out.println();
		System.out.println();
		System.out.println("a1" + " " + test.getProp().get("a1"));
		System.out.println("a2" + " " + test.getProp().get("a2"));
		System.out.println("a3" + " " + test.getProp().get("a3"));
		System.out.println("a4" + " " + test.getProp().get("a4"));
	}

}
