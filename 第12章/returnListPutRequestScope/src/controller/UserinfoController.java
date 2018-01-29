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
		list.add("�й�1");
		list.add("�й�2");
		list.add("�й�3");
		list.add("�й�4");
		return list;
	}

	@ModelAttribute("y")
	@RequestMapping(value = "getgetUserinfo")
	public Userinfo getgetUserinfoXXXXXXXXX() {
		Userinfo userinfo = new Userinfo("100", "�й�");
		return userinfo;
	}
}
