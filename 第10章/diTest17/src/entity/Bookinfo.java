package entity;

import java.util.Date;
import java.util.List;

public class Bookinfo {
	private String username;
	private Date nowDate;
	private List<String> listString;
	private List<Date> listDate;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getNowDate() {
		return nowDate;
	}

	public void setNowDate(Date nowDate) {
		this.nowDate = nowDate;
	}

	public List<String> getListString() {
		return listString;
	}

	public void setListString(List<String> listString) {
		this.listString = listString;
	}

	public List<Date> getListDate() {
		return listDate;
	}

	public void setListDate(List<Date> listDate) {
		this.listDate = listDate;
	}
}
