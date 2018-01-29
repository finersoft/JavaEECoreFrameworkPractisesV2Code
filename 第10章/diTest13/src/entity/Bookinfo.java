package entity;

public class Bookinfo {
	public Bookinfo(Userinfo xxxxxx) {
		System.out.println("public Bookinfo(Userinfo xxxxxx) userinfo=" + xxxxxx.hashCode());
	}

	public Bookinfo(Userinfo userinfo1, Userinfo userinfo2) {
		System.out.println("public Bookinfo(Userinfo userinfo1, Userinfo userinfo2) userinfo1=" + userinfo1.hashCode()
				+ " userinfo2=" + userinfo2.hashCode());
	}
}
