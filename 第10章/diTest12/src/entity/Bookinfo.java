package entity;

public class Bookinfo {
	public Bookinfo(Userinfo userinfo) {
		System.out.println("public Bookinfo(Userinfo userinfo) userinfo=" + userinfo.hashCode());
	}

	public Bookinfo(Userinfo userinfo1, Userinfo userinfo2) {
		System.out.println("public Bookinfo(Userinfo userinfo1, Userinfo userinfo2) userinfo1=" + userinfo1.hashCode()
				+ " userinfo2=" + userinfo2.hashCode());
	}
}
