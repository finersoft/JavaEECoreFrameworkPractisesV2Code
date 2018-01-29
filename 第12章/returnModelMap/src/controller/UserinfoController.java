package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserinfoController {
	@RequestMapping(value = "modelMapTest")
	public ModelMap modelMapTest() {
		List list = new ArrayList();
		list.add("�й�1");
		list.add("�й�2");
		list.add("�й�3");
		list.add("�й�4");

		ModelMap map = new ModelMap();
		map.addAttribute("xxxxxxxxxxxxxx", list);

		return map;
	}
}
