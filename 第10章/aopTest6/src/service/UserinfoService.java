package service;

import org.springframework.stereotype.Service;

@Service
public class UserinfoService {
	public void method1() {
		System.out.println("method1 run !");
	}

	public String method2() {
		System.out.println("method2 run !");
		return "���Ƿ���ֵA";
	}

	public String method3() {
		System.out.println("method3 run !");
		Integer.parseInt("a");
		return "���Ƿ���ֵB";
	}
}
