package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

public class getTest extends HttpServlet {
	// 说明：
	// 本实验在Servlet中进行测试和在Struts2环境中测试
	// 代码完全一样！
	// 其它实验也是如此！说明JSON这种技术在Servlet和Struts2中是通用的！
	// 其它语言比如PHP,asp.net,Python，SQL都支持JSON
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String jsonString = request.getParameter("jsonString");
		jsonString = new String(jsonString.getBytes("iso-8859-1"), "utf-8");
		JSONArray jsonArray = JSONArray.fromObject(jsonString);
		for (int i = 0; i < jsonArray.size(); i++) {
			System.out.println(jsonArray.get(i));
		}
	}

}
