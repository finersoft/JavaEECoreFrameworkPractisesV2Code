package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserinfoController {
	@RequestMapping(value = "test")
	public String test() {
		System.out.println("mvc1");
		return "index.jsp";
	}
}
