package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Userinfo;

@Controller
public class UserinfoController {
	@ModelAttribute("x")
	@RequestMapping(value = "listMethod")
	public List<String> listMethodXXXXXXXX() {
		List list = new ArrayList();
		list.add("中国1");
		list.add("中国2");
		list.add("中国3");
		list.add("中国4");
		return list;
	}

	@ModelAttribute("y")
	@RequestMapping(value = "getgetUserinfo")
	public Userinfo getgetUserinfoXXXXXXXXX() {
		Userinfo userinfo = new Userinfo("100", "中国");
		return userinfo;
	}
}
