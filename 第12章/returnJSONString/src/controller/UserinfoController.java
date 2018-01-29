package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Userinfo;
import net.sf.json.JSONObject;

@Controller
public class UserinfoController {
	@RequestMapping(value = "test1", produces = "text/html;charset=utf-8")
	@ResponseBody
	public String test1() {
		Userinfo returnUserinfo = new Userinfo();
		returnUserinfo.setUsername("返回的账号");
		returnUserinfo.setPassword("返回的密码");

		returnUserinfo.getXxxx().add("中国1");
		returnUserinfo.getXxxx().add("中国2");
		returnUserinfo.getXxxx().add("中国3");

		String jsonString = JSONObject.fromObject(returnUserinfo).toString();
		return jsonString;
	}
}
