package service;

import org.springframework.stereotype.Service;

@Service(value = "serviceA")
public class UserinfoServiceA implements IUserinfoService {
	@Override
	public String getUsername() {
		return "ҵ���߼���Ĵ��й�A";
	}
}
