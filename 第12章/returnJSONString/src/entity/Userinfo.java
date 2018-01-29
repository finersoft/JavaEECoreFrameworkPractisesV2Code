package entity;

import java.util.ArrayList;
import java.util.List;

public class Userinfo {
	private String username;
	private String password;
	private List xxxx = new ArrayList();

	public Userinfo() {
		super();
	}

	public Userinfo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List getXxxx() {
		return xxxx;
	}

	public void setXxxx(List xxxx) {
		this.xxxx = xxxx;
	}

}
