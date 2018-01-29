package a.controller;

public class FromA_ToB {

	private String gotoPage = "9999";

	public String getGotoPage() {
		return gotoPage;
	}

	public void setGotoPage(String gotoPage) {
		this.gotoPage = gotoPage;
	}

	public String execute() {
		System.out.println("A");
		return "toBAction";
	}

}
