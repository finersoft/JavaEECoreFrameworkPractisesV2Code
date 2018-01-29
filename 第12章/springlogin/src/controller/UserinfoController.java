package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//SpringMVC

@Controller
public class UserinfoController {
	@RequestMapping(value = "login")
	public String loginMethod(@RequestParam("username") String u, @RequestParam("password") String p, Model model) {
		if (u.equals("a") && p.equals("aa")) {
			model.addAttribute("usernameKey", u);
			return "ok.jsp";
		} else {
			return "no.jsp";
		}
	}
}
