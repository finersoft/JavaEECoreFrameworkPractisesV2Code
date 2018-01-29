package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//SpringMVC

@Controller
public class UserinfoController {

	public Map loginValidateMethod(String username, String password) {
		Map map = new HashMap();

		if (username == null || "".equals(username)) {
			map.put("usernameisnull", "ÕËºÅÎª¿Õ£¡");
		}
		if (password == null || "".equals(password)) {
			map.put("passwordisnull", "ÃÜÂëÎª¿Õ£¡");
		}

		return map;
	}

	@RequestMapping(value = "login")
	public String loginMethod(String username, String password, Model model) {
		Map map = loginValidateMethod(username, password);
		if (map.size() > 0) {
			model.addAttribute("message", map);
			return "index.jsp";
		} else {
			return "redirect:/listUserinfo.spring";
		}

	}
}
