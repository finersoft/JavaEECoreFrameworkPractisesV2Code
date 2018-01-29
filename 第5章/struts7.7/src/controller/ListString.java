package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONArray;

public class ListString {

	public String execute() throws IOException {

		List list = new ArrayList();
		list.add("中国1");
		list.add("中国2");
		list.add("中国3");
		list.add("中国4");
		list.add("中国5");

		String jsonString = JSONArray.fromObject(list).toString();
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
