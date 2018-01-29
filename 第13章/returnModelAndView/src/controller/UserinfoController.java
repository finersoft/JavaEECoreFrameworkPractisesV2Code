package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserinfoController {
	// org.springframework.web.servlet.ModelAndView
	@RequestMapping(value = "test")
	public ModelAndView test() {
		ModelAndView view = new ModelAndView();
		view.setViewName("index.jsp");
		view.addObject("myKey", "´óÖÐ¹ú");
		return view;
	}
}
