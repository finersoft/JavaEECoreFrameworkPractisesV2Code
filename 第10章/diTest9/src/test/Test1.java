package test;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import springconfig.SpringConfig;

@Component
public class Test1 {

	@Resource(name = "getDate")
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Test1 test1 = (Test1) context.getBean(Test1.class);
		System.out.println("main date=" + test1.getDate().hashCode());

	}
}
