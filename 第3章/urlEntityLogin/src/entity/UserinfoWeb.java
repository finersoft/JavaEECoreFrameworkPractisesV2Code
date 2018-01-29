package entity;

public class UserinfoWeb {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
		System.out.println("UserinfoWeb setUsername username=" + username);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("UserinfoWeb setPassword password=" + password);
	}
}
