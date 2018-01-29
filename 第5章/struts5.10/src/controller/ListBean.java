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
		list.add(new Userinfo("�й�1", "�й���1"));
		list.add(new Userinfo("�й�2", "�й���2"));
		list.add(new Userinfo("�й�3", "�й���3"));
		list.add(new Userinfo("�й�4", "�й���4"));

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
