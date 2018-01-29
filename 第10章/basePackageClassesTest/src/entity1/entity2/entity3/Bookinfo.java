package entity1.entity2.entity3;

import org.springframework.stereotype.Component;

@Component
public class Bookinfo {
	public Bookinfo() {
		System.out.println("public Bookinfo() " + this.hashCode());
	}
}
