package controller;

import java.util.ArrayList;
import java.util.List;

public class ListUserinfo {

	private List list = new ArrayList();

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public String execute() {
		list.add("�й�1");
		list.add("�й�2");
		list.add("�й�3");
		list.add("�й�4");
		list.add("�й�5");

		return "toListUserinfoJSP";
	}

}
