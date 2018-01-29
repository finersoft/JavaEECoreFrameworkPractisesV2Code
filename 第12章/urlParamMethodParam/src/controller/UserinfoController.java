package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserinfoController {
	@RequestMapping(value = "login")
	public String loginMethod(String username, String password, Model model) {
		if (username.equals("a") && password.equals("aa")) {
			model.addAttribute("usernameKey", username);
			return "ok.jsp";
		} else {
			return "no.jsp";
		}
	}
}
