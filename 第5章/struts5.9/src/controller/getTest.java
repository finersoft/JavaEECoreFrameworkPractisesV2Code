package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

public class getTest extends HttpServlet {
	// ˵����
	// ��ʵ����Servlet�н��в��Ժ���Struts2�����в���
	// ������ȫһ����
	// ����ʵ��Ҳ����ˣ�˵��JSON���ּ�����Servlet��Struts2����ͨ�õģ�
	// �������Ա���PHP,asp.net,Python��SQL��֧��JSON
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
