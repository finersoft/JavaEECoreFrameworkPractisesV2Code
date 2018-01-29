package entity;

import java.util.Date;

public class NewUserinfo implements java.io.Serializable {
	private Long id;
	private String username;
	private java.util.Date insertdate;

	public NewUserinfo() {
	}

	public NewUserinfo(Long id, String username, Date insertdate) {
		super();
		this.id = id;
		this.username = username;
		this.insertdate = insertdate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public java.util.Date getInsertdate() {
		return insertdate;
	}

	public void setInsertdate(java.util.Date insertdate) {
		this.insertdate = insertdate;
	}

}