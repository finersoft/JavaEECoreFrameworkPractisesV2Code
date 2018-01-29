package controller;

import org.springframework.transaction.annotation.Transactional;

import service.UserinfoServcie;

@Transactional
public class Test {

	private UserinfoServcie userinfoService;

	public UserinfoServcie getUserinfoService() {
		return userinfoService;
	}

	public void setUserinfoService(UserinfoServcie userinfoService) {
		this.userinfoService = userinfoService;
	}

	public String execute() {
		userinfoService.saveService();
		return null;
	}

}
