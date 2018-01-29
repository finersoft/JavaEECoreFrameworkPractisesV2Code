package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import service.AllService;

@Transactional
@Controller
public class UserinfoController {
	
	@Autowired
	private AllService allService;

	public AllService getAllService() {
		return allService;
	}

	public void setAllService(AllService allService) {
		this.allService = allService;
	}

	@RequestMapping(value = "test")
	public String test() {
		this.getAllService().getUserinfoService().saveServiceMethod();
		return "index.jsp";
	}
}
