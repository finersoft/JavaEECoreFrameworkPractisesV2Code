package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bookinfo {
	@Autowired
	public Bookinfo(Userinfo userinfo) {
		System.out.println("public Bookinfo(Userinfo userinfo) userinfo=" + userinfo.hashCode());
	}
}
