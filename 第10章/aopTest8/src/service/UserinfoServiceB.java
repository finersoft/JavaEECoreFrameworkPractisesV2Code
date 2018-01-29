package service;

import org.springframework.stereotype.Service;

@Service(value = "service2")
public class UserinfoServiceB {
	public void method1() {
		System.out.println("methodB run !");
	}
}
