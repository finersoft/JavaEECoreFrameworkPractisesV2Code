package service;

import org.springframework.stereotype.Service;

@Service(value = "serviceB")
public class UserinfoServiceB implements IUserinfoService {
	public String getUsername() {
		return "ҵ���߼���Ĵ��й�B";
	}
}
