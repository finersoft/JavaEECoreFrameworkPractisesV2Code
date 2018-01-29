package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.PageEntity;
import service.UserinfoService;

public class test extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String beginAge = request.getParameter("beginAge");
		String endAge = request.getParameter("endAge");
		String beginDate = request.getParameter("beginDate");
		String endDate = request.getParameter("endDate");
		String gotoPage = request.getParameter("gotoPage");

		if (username != null && !"".equals(username)) {
			username = new String(username.getBytes("iso-8859-1"), "utf-8");
		}
		if (password != null && !"".equals(password)) {
			password = new String(password.getBytes("iso-8859-1"), "utf-8");
		}

		long beginAgeInt = -1;
		long endAgeInt = -1;
		try {
			if (beginAge != null && !"".equals(beginAge)) {
				beginAgeInt = Integer.parseInt(beginAge);
			}
		} catch (NumberFormatException e) {
		}
		try {
			if (endAge != null && !"".equals(endAge)) {
				endAgeInt = Integer.parseInt(endAge);
			}
		} catch (NumberFormatException e) {
		}

		Date beginDateObject = null;
		Date endDateObject = null;

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		if (beginDate != null && !"".equals(beginDate)) {
			beginDate = beginDate + " 00:00:00";
			try {
				beginDateObject = format.parse(beginDate);
			} catch (ParseException e) {
			}
		}
		if (endDate != null && !"".equals(endDate)) {
			endDate = endDate + " 23:59:59";
			try {
				endDateObject = format.parse(endDate);
			} catch (ParseException e) {
			}
		}

		int gotoPageInt = 1;
		try {
			if (gotoPage != null && !"".equals(gotoPage)) {
				gotoPageInt = Integer.parseInt(gotoPage);
				if (gotoPageInt <= 0) {
					gotoPageInt = 1;
				}
			}
		} catch (NumberFormatException e) {
			gotoPageInt = 1;
		}

		UserinfoService service = new UserinfoService();
		PageEntity pageEntity = service.getUserinfoPageData(username, password, beginAgeInt, endAgeInt, beginDateObject,
				endDateObject, gotoPageInt);
		request.setAttribute("pageEntity", pageEntity);
		request.getRequestDispatcher("index.jsp").forward(request, response);

	}

}
