package entity;

public class Bookinfo {
	public Bookinfo(String username) {
		System.out.println("public Bookinfo(String username) username=" + username);
	}
	public Bookinfo(String username, int age) {
		System.out.println("public Bookinfo(String username, int age) username=" + username + " age=" + age);
	}
}
