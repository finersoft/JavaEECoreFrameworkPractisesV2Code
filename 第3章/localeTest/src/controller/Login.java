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
		System.out.println("setUsername username=" + username);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("setPassword password=" + password);
	}

	@Override
	public void validate() {
		if (username == null || "".equals(username)) {
			this.addFieldError("username", this.getText("usernameisnull"));
		}
		if (password == null || "".equals(password)) {
			this.addFieldError("password", this.getText("passwordisnull"));
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
