package entity1;

import entity2.Userinfo;

public class Bookinfo {
	public Bookinfo(Userinfo userinfo) {
		System.out.println("public Bookinfo(Userinfo userinfo) userinfo=" + userinfo.hashCode());
	}
}
