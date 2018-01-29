package entity;

import java.util.Date;

public class Userinfo {

	private int id;
	private String username;
	private String password;
	private int age;
	private Date insertdate;

	public Userinfo() {
		System.out.println("public Userinfo()");
		id = 1;
		username = "username1";
		password = "password";
		age = 11;
		insertdate = new Date();
	}

	public Userinfo(int id, String username, String password, int age, Date insertdate) {
		System.out.println("public Userinfo(int id, String username, String password, int age, Date insertdate)");
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.insertdate = insertdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getInsertdate() {
		return insertdate;
	}

	public void setInsertdate(Date insertdate) {
		System.out.println("setInsertdate insertdate=" + insertdate);
		this.insertdate = insertdate;
	}

	public void printAll1() {
		System.out.println("printAll1()");
	}

	public void printAll2(String username) {
		System.out.println("printAll2() username=" + username);
	}

	public int printAll3(String username) {
		System.out.println("printAll3() username=" + username);
		return 123;
	}

}
