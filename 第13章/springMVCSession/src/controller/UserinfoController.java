package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(value = "myKey")
public class UserinfoController {
	@RequestMapping(value = "set")
	public String test(Model model) {
		model.addAttribute("myKey", "myValueRequest");
		return "index.jsp";
	}

	@RequestMapping(value = "get")
	public String get(@ModelAttribute(value = "myKey") String sessionValue) {
		System.out.println("sessionValue=" + sessionValue);
		return "index.jsp";
	}
}
