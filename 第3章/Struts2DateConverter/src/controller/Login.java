package controller;

import java.util.Date;

import entity.MyPoint;

public class Login {

	private Date insertdate;

	public Date getInsertdate() {
		return insertdate;
	}

	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}

	public String execute() {
		System.out.println(insertdate);
		return null;
	}

}
