package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserinfoController {
	@RequestMapping(value = "login")
	public String loginMethod(String username) {
		System.out.println("loginMethod username=" + username);
		return "redirect:/listString.spring";
	}

	@RequestMapping(value = "listString")
	public String listStringMethod(Model model) {
		System.out.println("listStringMethod");
		List list = new ArrayList();
		list.add("中国1");
		list.add("中国2");
		list.add("中国3");
		list.add("中国4");

		model.addAttribute("list", list);

		return "listString.jsp";
	}
}
