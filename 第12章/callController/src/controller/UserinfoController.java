package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserinfoController {
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginMethod(String username, String password, Model model) {
		if (username.equals("a") && password.equals("aa")) {
			model.addAttribute("usernameKey", username);
			return "ok.jsp";
		} else {
			return "no.jsp";
		}
	}

	@RequestMapping(value = "listString")
	public String listStringMethod(Model model) {
		List list = new ArrayList();
		list.add("�й�1");
		list.add("�й�2");
		list.add("�й�3");
		list.add("�й�4");

		model.addAttribute("list", list);

		return "listString.jsp";
	}
}
