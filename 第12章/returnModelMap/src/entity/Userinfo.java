package entity;

public class Userinfo {

	private String id;
	private String username;

	public Userinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Userinfo(String id, String username) {
		super();
		this.id = id;
		this.username = username;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
