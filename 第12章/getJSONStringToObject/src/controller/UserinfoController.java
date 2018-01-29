package controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Userinfo;

@Controller
public class UserinfoController {
	@RequestMapping(value = "test1")
	public String test1(@RequestBody Userinfo userinfo) {
		System.out.println(userinfo.getUsername());
		System.out.println(userinfo.getPassword());
		return "index.jsp";
	}

	@RequestMapping(value = "test2")
	public String test2(@RequestBody List<String> listData) {
		for (int i = 0; i < listData.size(); i++) {
			System.out.println(listData.get(i));
		}
		return "index.jsp";
	}

	@RequestMapping(value = "test3")
	public String test3(@RequestBody List<LinkedHashMap> listData) {
		for (int i = 0; i < listData.size(); i++) {
			Map map = listData.get(i);
			System.out.println(map.get("username") + " " + map.get("password"));
		}
		return "index.jsp";
	}

	@RequestMapping(value = "test4")
	public String test4(@RequestBody Map map) {
		System.out.println(map.get("username"));
		List<Map> workList = (List) map.get("work");
		for (int i = 0; i < workList.size(); i++) {
			Map eachWorkMap = workList.get(i);
			System.out.println(eachWorkMap.get("address"));

		}
		Map schoolMap = (Map) map.get("school");
		System.out.println(schoolMap.get("name"));
		System.out.println(schoolMap.get("address"));
		return "index.jsp";
	}

	@RequestMapping(value = "test5")
	public String test5(@RequestBody Map map) {
		List list1 = (List) map.get("myArray");
		System.out.println(((Map) list1.get(0)).get("username1"));
		System.out.println(((Map) list1.get(1)).get("username2"));
		List list2 = (List) list1.get(2);
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));

		List list3 = (List) list2.get(3);
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}

		System.out.println(((Map) map.get("myObject")).get("username"));

		List<Map> list4 = (List) ((Map) map.get("myObject1")).get("address");
		for (int i = 0; i < list4.size(); i++) {
			Map eachMap = list4.get(i);
			System.out.println(eachMap.get("name"));

		}
		return "index.jsp";
	}

}
