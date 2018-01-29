package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserinfoController {
	@RequestMapping(value = "test")
	public String test() {
		System.out.println("mvc2");
		return "index.jsp";
	}
}
