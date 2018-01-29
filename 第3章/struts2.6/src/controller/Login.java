package controller;

import java.io.UnsupportedEncodingException;

public class Login {

	private String loginPage = "100";
	private String loginChinese = "中国%%%%%中国人";

	public String getLoginPage() {
		return loginPage;
	}

	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}

	public String getLoginChinese() {
		return loginChinese;
	}

	public void setLoginChinese(String loginChinese) {
		this.loginChinese = loginChinese;
	}

	public String execute() throws UnsupportedEncodingException {
		System.out.println("login");

		loginChinese = java.net.URLEncoder.encode(loginChinese, "utf-8");
		loginChinese = loginChinese.replace("%", "_");
		System.out.println(loginChinese);
		return "toLstUserinfoAction";
	}
}
