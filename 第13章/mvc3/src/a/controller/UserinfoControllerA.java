package a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserinfoControllerA {
	@RequestMapping(value = "testA")
	public String test() {
		System.out.println("testA");
		return "index.jsp";
	}
}
