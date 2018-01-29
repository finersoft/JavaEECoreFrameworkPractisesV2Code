package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Userinfo;
import net.sf.json.JSONObject;

@Controller
public class UserinfoController {
	@RequestMapping(value = "test1")
	public String test1(String jsonString, HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		System.out.println(jsonObject.get("username"));
		System.out.println(jsonObject.get("password"));

		Userinfo userinfo = new Userinfo();
		userinfo.setUsername("返回的账号");
		userinfo.setPassword("返回的密码");

		String returnJSONString = JSONObject.fromObject(userinfo).toString();

		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(returnJSONString);
		out.flush();
		out.close();

		return "index.jsp";
	}
}
