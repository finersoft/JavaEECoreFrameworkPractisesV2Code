package bookservice;

public class Test {
	public static void main(String[] args) {
		JDBook jdBook = new JDBook();
		DangDangBook dangdangBook = new DangDangBook();

		ISendBook sf1 = new SFBookProxy(jdBook);
		sf1.sendBook();

		System.out.println();

		ISendBook sf2 = new SFBookProxy(dangdangBook);
		sf2.sendBook();
	}
}
