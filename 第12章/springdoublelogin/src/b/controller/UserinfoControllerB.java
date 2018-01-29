package b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/b")
public class UserinfoControllerB {
	@RequestMapping(value = "login")
	public String listStringMethod() {
		System.out.println("b login new");
		return "index.jsp";
	}
}
