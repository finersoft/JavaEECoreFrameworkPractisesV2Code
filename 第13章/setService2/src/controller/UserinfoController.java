package controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.IUserinfoService;

@Controller
public class UserinfoController {

	@Resource(name = "serviceB")
	private IUserinfoService userinfoService;

	@RequestMapping(value = "test")
	public String test() {
		System.out.println(userinfoService.getUsername());
		return "index.jsp";
	}
}
