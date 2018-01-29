package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mymvc.www.core.IAction;

public class Login implements IAction {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("login controller! ");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equals("a") && password.equals("aa")) {
			return "toListUserinfoAction";
		} else {
			request.setAttribute("loginResult", "µ«¬Ω ß∞‹£¨«Î÷ÿ–¬ ‰»Î£°");
			return "toIndexJSP";
		}
	}

}
