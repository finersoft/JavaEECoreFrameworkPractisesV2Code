package test2;

public class Test1 {

	public static void printInfo(String... usernameList) {
		for (int i = 0; i < usernameList.length; i++) {
			System.out.println(usernameList[i]);
		}
	}

	public static void main(String[] args) {
		printInfo("�й�", "�й���", "������");
	}

}
