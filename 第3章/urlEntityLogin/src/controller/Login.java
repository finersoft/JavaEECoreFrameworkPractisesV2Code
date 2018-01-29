package controller;

import com.opensymphony.xwork2.ActionSupport;

import entity.UserinfoWeb;

public class Login extends ActionSupport {

	private UserinfoWeb userinfo = new UserinfoWeb();

	public UserinfoWeb getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserinfoWeb userinfo) {
		this.userinfo = userinfo;
	}

	@Override
	public void validate() {
		System.out.println("validate");
		if (userinfo.getUsername() == null || "".equals(userinfo.getUsername())) {
			this.addFieldError("username", this.getText("usernameisnull"));
		}
		if (userinfo.getPassword() == null || "".equals(userinfo.getPassword())) {
			this.addFieldError("password", this.getText("passwordisnull"));
		}
	}

	public String execute() {
		System.out.println("execute");
		if (userinfo.getUsername().equals("a") && userinfo.getPassword().equals("aa")) {
			return "toOKJSP";
		} else {
			return "toNOJSP";
		}
	}

}
