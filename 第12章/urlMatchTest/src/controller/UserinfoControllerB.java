package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "findUserinfo4/username/{username}")
public class UserinfoControllerB {
	@RequestMapping(value = "address/{address}")
	public String findUserinfo1(@PathVariable String username, @PathVariable String address) {
		System.out.println(username + " " + address);
		return "index.jsp";
	}
}
