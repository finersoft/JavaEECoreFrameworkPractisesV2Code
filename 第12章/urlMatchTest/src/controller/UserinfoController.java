package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserinfoController {
	@RequestMapping(value = "findUserinfo1/{userId}")
	public String findUserinfo1(@PathVariable("userId") String xxxxxx) {
		System.out.println(xxxxxx);
		return "index.jsp";
	}

	@RequestMapping(value = "findUserinfo2/{userId}")
	public String findUserinfo2(@PathVariable String userId) {
		System.out.println(userId);
		return "index.jsp";
	}

	@RequestMapping(value = "findUserinfo3/username/{username}/age/{age}")
	public String findUserinfo2(@PathVariable String username, @PathVariable String age) {
		System.out.println(username + " " + age);
		return "index.jsp";
	}
}
