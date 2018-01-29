package orm;

import java.util.Date;

public class Userinfo implements java.io.Serializable {

	private Long id;
	private String username;
	private String password;
	private Long age;
	private Date insertdate;

	public Userinfo() {
	}

	public Userinfo(String username, String password, Long age, Date insertdate) {
		this.username = username;
		this.password = password;
		this.age = age;
		this.insertdate = insertdate;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getAge() {
		return this.age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Date getInsertdate() {
		return this.insertdate;
	}

	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}

}