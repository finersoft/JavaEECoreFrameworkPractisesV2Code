package service;

import java.util.Date;

public class UserinfoService {

	public void method1(int ageage) {
		System.out.println("method1 age=" + ageage);
	}

	public String method2(String username, String password, int age, Date insertdate) {
		System.out.println(
				"method2 username=" + username + " password=" + password + " age=" + age + " insertdate=" + insertdate);
		return "���Ƿ���ֵmethod2";
	}
}
