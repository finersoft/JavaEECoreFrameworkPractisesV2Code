package b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserinfoControllerB {
	@RequestMapping(value = "testB")
	public String test() {
		System.out.println("testB");
		return "index.jsp";
	}
}
