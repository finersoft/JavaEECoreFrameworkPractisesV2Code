package service;

import org.springframework.stereotype.Component;

@Component
public class UserinfoServiceA implements IUserinfoService {
	public UserinfoServiceA() {
		System.out.println("public Userinfo() " + this.hashCode());
	}

	public void save() {
		System.out.println("�����ݱ��浽A���ݿ���");
	}
}
