package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Userinfo;

@Controller
public class UserinfoController {
	@RequestMapping(value = "login")
	public String loginMethod(Userinfo userinfo) {
		System.out.println(userinfo.getUsername());
		System.out.println(userinfo.getPassword());
		return "index.jsp";
	}
}
