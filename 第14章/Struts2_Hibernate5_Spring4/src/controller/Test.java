package controller;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class Test extends BaseAction {
	public String execute() {
		this.getAllService().getUserinfoService().saveServiceMethod();
		return null;
	}
}
