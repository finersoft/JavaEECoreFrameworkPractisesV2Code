package service;

import org.springframework.stereotype.Service;

@Service(value = "serviceA")
public class UserinfoServiceA implements IUserinfoService {
	@Override
	public String getUsername() {
		return "业务逻辑层的大中国A";
	}
}
