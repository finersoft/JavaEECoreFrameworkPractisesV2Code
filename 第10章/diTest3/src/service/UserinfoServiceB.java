package service;

import org.springframework.stereotype.Component;

@Component
public class UserinfoServiceB implements IUserinfoService {
	public UserinfoServiceB() {
		System.out.println("public Userinfo() " + this.hashCode());
	}

	public void save() {
		System.out.println("�����ݱ��浽B���ݿ���");
	}
}
