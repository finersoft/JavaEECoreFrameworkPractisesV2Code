package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserinfoController {
	@RequestMapping(value = "test")
	public String loginMethod(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request);
		System.out.println(response);
		request.setAttribute("myKey", "´óÖÐ¹ú");
		System.out.println(request.getSession().getServletContext().getRealPath("/"));
		return "index.jsp";
	}
}
