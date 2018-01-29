package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.UserinfoService;

@Controller
public class UserinfoController {

	@Autowired
	private UserinfoService userinfoService;

	@RequestMapping(value = "test")
	public String test() {
		System.out.println(userinfoService.getUsername());
		return "index.jsp";
	}
}
