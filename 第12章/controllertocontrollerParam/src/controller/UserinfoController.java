package controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserinfoController {
	@RequestMapping(value = "login")
	public String loginMethod(String username) throws UnsupportedEncodingException {
		System.out.println("loginMethod username=" + username);
		username = java.net.URLEncoder.encode(username, "utf-8");
		username = username.replace("%", "_");
		return "redirect:/listString.spring?xxxxxxxxxx=" + username;
	}

	@RequestMapping(value = "listString")
	public String listStringMethod(String xxxxxxxxxx, Model model) throws UnsupportedEncodingException {
		xxxxxxxxxx = xxxxxxxxxx.replace("_", "%");
		xxxxxxxxxx = java.net.URLDecoder.decode(xxxxxxxxxx, "utf-8");
		System.out.println("listStringMethod xxxxxxxxxx=" + xxxxxxxxxx);
		List list = new ArrayList();
		list.add("�й�1");
		list.add("�й�2");
		list.add("�й�3");
		list.add("�й�4");

		model.addAttribute("list", list);

		return "listString.jsp";
	}
}
