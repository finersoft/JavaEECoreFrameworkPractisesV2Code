package service;

import org.springframework.stereotype.Service;

@Service(value = "service1")
public class UserinfoServiceA {
	public void method1() {
		System.out.println("methodA run !");
	}
}
