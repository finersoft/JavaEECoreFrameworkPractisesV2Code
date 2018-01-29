package service;

import org.springframework.stereotype.Service;

@Service(value = "serviceB")
public class UserinfoServiceB implements IUserinfoService {
	public String getUsername() {
		return "业务逻辑层的大中国B";
	}
}
