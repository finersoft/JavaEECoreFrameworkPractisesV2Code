package controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class ListUserinfo {
	public String execute() {
		System.out.println("ListUserinfo");

		HttpServletRequest requeset = ServletActionContext.getRequest();
		HttpSession session;
		ServletContext application;

		ServletActionContext.getRequest().setAttribute("requestKey", "requestValue");
		ServletActionContext.getRequest().getSession().setAttribute("sessionKey", "sessionValue");
		ServletActionContext.getRequest().getServletContext().setAttribute("applicationKey", "applicationValue");

		return "toListUserinfoJSP";
	}
}
