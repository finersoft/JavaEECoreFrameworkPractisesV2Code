package service;

import org.springframework.stereotype.Component;

@Component(value="serviceB")
public class UserinfoServiceB implements IUserinfoService {
	public UserinfoServiceB() {
		System.out.println("public UserinfoServiceB() " + this.hashCode());
	}

	public void save() {
		System.out.println("�����ݱ��浽B���ݿ���");
	}
}
