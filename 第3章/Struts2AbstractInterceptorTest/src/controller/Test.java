package controller;

public class Test {

	// test.action?username=abc

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String execute() {
		System.out.println("new execute run username=" + username);
		return null;
	}
}
