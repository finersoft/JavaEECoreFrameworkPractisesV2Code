package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserinfoController {
	@RequestMapping(value = "listInfo", params = "type=A")
	public String listInfoAAA() {
		System.out.println("AAA");
		return "index.jsp";
	}

	@RequestMapping(value = "listInfo", params = "type=B")
	public String listInfoBBB() {
		System.out.println("BBB");
		return "index.jsp";
	}
}
