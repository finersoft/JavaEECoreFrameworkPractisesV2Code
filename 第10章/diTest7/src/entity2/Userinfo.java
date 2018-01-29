package entity2;

import org.springframework.stereotype.Component;

@Component
public class Userinfo {
	public Userinfo() {
		System.out.println("public Userinfo() " + this.hashCode());
	}
}
