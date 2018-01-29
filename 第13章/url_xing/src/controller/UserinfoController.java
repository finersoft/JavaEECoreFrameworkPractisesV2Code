package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserinfoController {
	@RequestMapping(value = "findById_*")
	public String test(HttpServletRequest request, HttpServletResponse response) {
		String servletPath = request.getServletPath();
		servletPath = servletPath.substring(1);
		int beginIndex = servletPath.indexOf("_");
		int ebdIndex = servletPath.indexOf(".");
		servletPath = servletPath.substring(beginIndex + 1, ebdIndex);
		System.out.println(servletPath);
		return "index.jsp";
	}
}
