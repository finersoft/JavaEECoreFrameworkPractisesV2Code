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
		returnUserinfo.setUsername("���ص��˺�");
		returnUserinfo.setPassword("���ص�����");

		returnUserinfo.getXxxx().add("�й�1");
		returnUserinfo.getXxxx().add("�й�2");
		returnUserinfo.getXxxx().add("�й�3");

		String jsonString = JSONObject.fromObject(returnUserinfo).toString();
		return jsonString;
	}
}
