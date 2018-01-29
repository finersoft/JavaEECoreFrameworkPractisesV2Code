package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.sf.json.JSONObject;

@Controller
public class UserinfoController {
	@RequestMapping(value = "test")
	public String loginMethod(String jsonString) {
		JSONObject object = JSONObject.fromObject(jsonString);
		System.out.println(object.get("username"));
		System.out.println(object.get("password"));
		return "index.jsp";
	}
}
