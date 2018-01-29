package test;

import service.ISaveService;
import service.SaveServiceXML;

public class Test {

	private ISaveService service = new SaveServiceXML();

	public ISaveService getService() {
		return service;
	}

	public void setService(ISaveService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.getService().saveMethod();
	}

}
