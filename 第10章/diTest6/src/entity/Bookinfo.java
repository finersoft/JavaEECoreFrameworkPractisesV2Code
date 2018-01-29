package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bookinfo {
	@Autowired
	public void setUserinfo(Userinfo userinfo) {
		System.out.println("public void setUserinfo(Userinfo userinfo) userinfo=" + userinfo.hashCode());
	}
}
