package entity;

public class Userinfo {

	public Userinfo(String username, String password) {
		System.out.println(
				"public Userinfo(String username, String password) username=" + username + " password=" + password);
	}

	public Userinfo(String username, int age) {
		System.out.println("public Userinfo(String username, int age) username=" + username + " age=" + age);
	}

	public Userinfo(String username, Integer age) {
		System.out.println("public Userinfo(String username, Integer age) username=" + username + " age=" + age);
	}
}
