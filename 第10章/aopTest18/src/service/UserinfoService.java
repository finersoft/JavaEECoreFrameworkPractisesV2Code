package service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class UserinfoService {

	public void method1() {
		System.out.println("public void method1()");
	}

	public String method2(int age) {
		System.out.println("public String method2(int age) age=" + age);
		return "我是大中国1";
	}

	public String method3(String username, String password, int age, Date insertdate) {
		System.out.println(
				"method2 username=" + username + " password=" + password + " age=" + age + " insertdate=" + insertdate);
		Integer.parseInt("a");
		return "我是大中国2";
	}
}
