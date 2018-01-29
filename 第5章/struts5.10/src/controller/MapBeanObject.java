package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import entity.Userinfo;
import net.sf.json.JSONObject;

public class MapBeanObject {

	public String execute() throws IOException {

		Map map = new HashMap();
		map.put("key1", new Userinfo("中国1", "中国人1"));
		map.put("key2", new Userinfo("中国2", "中国人2"));
		map.put("key3", new Userinfo("中国3", "中国人3"));

		String jsonString = JSONObject.fromObject(map).toString();
		System.out.println(jsonString);

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(jsonString);
		out.flush();
		out.close();

		return null;
	}
}
