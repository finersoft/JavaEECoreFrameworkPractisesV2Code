package controller;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
		System.out.println("setUsername");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("setPassword");
	}

	@Override
	public void validate() {
		System.out.println("validate");
		if (username == null || "".equals(username)) {
			this.addFieldError("username", "�˺Ų�����Ϊ�գ�");
		}
		if (password == null || "".equals(password)) {
			this.addFieldError("password", "���벻����Ϊ�գ�");
		}
	}

	public String execute() {
		System.out.println("execute");
		if (username.equals("a") && password.equals("aa")) {
			return "toOKJSP";
		} else {
			return "toNOJSP";
		}
	}

}
