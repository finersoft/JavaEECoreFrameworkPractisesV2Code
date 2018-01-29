package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "login")
public class UserinfoController {

	@RequestMapping(method = RequestMethod.POST)
	public String loginPostMethod() {
		System.out.println("post");
		return "index.jsp";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String loginGetMethod() {
		System.out.println("get");
		return "index.jsp";
	}
}
