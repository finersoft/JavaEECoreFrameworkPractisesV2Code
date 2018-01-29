package entity2;

import org.springframework.stereotype.Component;

@Component
public class Bookinfo {
	public Bookinfo() {
		System.out.println("public Bookinfo() " + this.hashCode());
	}
}
