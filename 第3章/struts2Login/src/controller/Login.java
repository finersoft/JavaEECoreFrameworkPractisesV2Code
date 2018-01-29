package controller;

public class Login {

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

	public String execute() {
		System.out.println("execute");
		if (username.equals("a") && password.equals("aa")) {
			return "toOKJSP";
		} else {
			return "toNOJSP";
		}
	}

}
