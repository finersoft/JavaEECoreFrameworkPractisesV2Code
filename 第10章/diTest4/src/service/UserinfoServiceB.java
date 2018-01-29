package service;

import org.springframework.stereotype.Component;

@Component(value="serviceB")
public class UserinfoServiceB implements IUserinfoService {
	public UserinfoServiceB() {
		System.out.println("public UserinfoServiceB() " + this.hashCode());
	}

	public void save() {
		System.out.println("将数据保存到B数据库中");
	}
}
