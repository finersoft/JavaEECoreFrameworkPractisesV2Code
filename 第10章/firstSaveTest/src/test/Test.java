package test;

import service.SaveService;

public class Test {

	private SaveService service = new SaveService();

	public SaveService getService() {
		return service;
	}

	public void setService(SaveService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.getService().saveMethod();
	}

}
