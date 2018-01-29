package service;

import org.springframework.stereotype.Component;

@Component
public class UserinfoServiceA implements IUserinfoService {
	public UserinfoServiceA() {
		System.out.println("public Userinfo() " + this.hashCode());
	}

	public void save() {
		System.out.println("将数据保存到A数据库中");
	}
}
