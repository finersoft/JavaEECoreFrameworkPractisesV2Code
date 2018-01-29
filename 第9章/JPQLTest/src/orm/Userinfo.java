package orm;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "USERINFO", schema = "Y2")

public class Userinfo implements java.io.Serializable {

	// Fields

	private Long id;
	private String username;
	private String password;
	private Long age;
	private Timestamp insertdate;

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** minimal constructor */
	public Userinfo(Long id) {
		this.id = id;
	}

	/** full constructor */
	public Userinfo(Long id, String username, String password, Long age, Timestamp insertdate) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.insertdate = insertdate;
	}

	// Property accessors
	@Id

	@Column(name = "ID", unique = true, nullable = false, precision = 18, scale = 0)

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "USERNAME", length = 50)

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", length = 50)

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "AGE", precision = 18, scale = 0)

	public Long getAge() {
		return this.age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	@Column(name = "INSERTDATE", length = 7)

	public Timestamp getInsertdate() {
		return this.insertdate;
	}

	public void setInsertdate(Timestamp insertdate) {
		this.insertdate = insertdate;
	}

}