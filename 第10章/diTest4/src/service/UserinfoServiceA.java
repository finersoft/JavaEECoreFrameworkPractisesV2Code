package service;

import org.springframework.stereotype.Component;

@Component(value="serviceA")
public class UserinfoServiceA implements IUserinfoService {
	public UserinfoServiceA() {
		System.out.println("public UserinfoServiceA() " + this.hashCode());
	}

	public void save() {
		System.out.println("�����ݱ��浽A���ݿ���");
	}
}
