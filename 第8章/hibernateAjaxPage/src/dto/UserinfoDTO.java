package dto;

public class UserinfoDTO {
	private String id;
	private String username;
	private String password;
	private String age;
	private String insertdate;

	public UserinfoDTO() {
	}

	public UserinfoDTO(String id, String username, String password, String age, String insertdate) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.insertdate = insertdate;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getInsertdate() {
		return insertdate;
	}

	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}

}
