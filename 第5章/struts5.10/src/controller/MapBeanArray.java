package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import entity.Userinfo;
import net.sf.json.JSONArray;

public class MapBeanArray {

	public String execute() throws IOException {

		Map map = new HashMap();
		map.put("key1", new Userinfo("�й�1", "�й���1"));
		map.put("key2", new Userinfo("�й�2", "�й���2"));
		map.put("key3", new Userinfo("�й�3", "�й���3"));

		String jsonString = JSONArray.fromObject(map).toString();
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
