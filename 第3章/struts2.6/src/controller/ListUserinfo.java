package controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class ListUserinfo {
	private String xxxxxxxxxxxxx;
	private String yyyyyyyyyyyyy;
	private List list = new ArrayList();

	public String getXxxxxxxxxxxxx() {
		return xxxxxxxxxxxxx;
	}

	public void setXxxxxxxxxxxxx(String xxxxxxxxxxxxx) {
		this.xxxxxxxxxxxxx = xxxxxxxxxxxxx;
	}

	public String getYyyyyyyyyyyyy() {
		return yyyyyyyyyyyyy;
	}

	public void setYyyyyyyyyyyyy(String yyyyyyyyyyyyy) {
		this.yyyyyyyyyyyyy = yyyyyyyyyyyyy;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public String execute() throws UnsupportedEncodingException {
		yyyyyyyyyyyyy = yyyyyyyyyyyyy.replace("_", "%");
		yyyyyyyyyyyyy = java.net.URLDecoder.decode(yyyyyyyyyyyyy, "utf-8");
		
		System.out.println("ListUserinfo xxxxxxxxxxxxx=" + xxxxxxxxxxxxx + " yyyyyyyyyyyyy=" + yyyyyyyyyyyyy);

		list.add("�й�1");
		list.add("�й�2");
		list.add("�й�3");
		list.add("�й�4");
		list.add("�й�5");

		return "toListUserinfoJSP";
	}

}
