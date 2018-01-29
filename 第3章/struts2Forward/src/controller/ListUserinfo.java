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
		list.add("中国1");
		list.add("中国2");
		list.add("中国3");
		list.add("中国4");
		list.add("中国5");

		return "toListUserinfoJSP";
	}

}
