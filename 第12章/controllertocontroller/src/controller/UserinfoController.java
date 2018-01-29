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
		list.add("�й�1");
		list.add("�й�2");
		list.add("�й�3");
		list.add("�й�4");

		model.addAttribute("list", list);

		return "listString.jsp";
	}
}
