package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import entity.Userinfo;
import net.sf.json.JSONArray;

public class ListBean {

	public String execute() throws IOException {

		List list = new ArrayList();
		list.add(new Userinfo("中国1", "中国人1"));
		list.add(new Userinfo("中国2", "中国人2"));
		list.add(new Userinfo("中国3", "中国人3"));
		list.add(new Userinfo("中国4", "中国人4"));

		String jsonString = JSONArray.fromObject(list).toString();

		System.out.println(jsonString);

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(jsonString);
		out.flush();
		out.close();

		return null;
	}

}
