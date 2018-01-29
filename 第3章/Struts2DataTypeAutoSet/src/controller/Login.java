package controller;

import java.util.Date;

import entity.MyPoint;

public class Login {

	private String username;
	private int age;
	private Date insertdate;
	private MyPoint point;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
		this.insertdate = insertdate;
	}

	public MyPoint getPoint() {
		return point;
	}

	public void setPoint(MyPoint point) {
		this.point = point;
	}

	public String execute() {
		System.out.println(username);
		System.out.println(age + 100);
		System.out.println(insertdate);
		System.out.println(point.getX() + " " + point.getY());
		return null;
	}

}
