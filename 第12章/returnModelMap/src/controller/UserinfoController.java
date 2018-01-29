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
		list.add("中国1");
		list.add("中国2");
		list.add("中国3");
		list.add("中国4");

		ModelMap map = new ModelMap();
		map.addAttribute("xxxxxxxxxxxxxx", list);

		return map;
	}
}
