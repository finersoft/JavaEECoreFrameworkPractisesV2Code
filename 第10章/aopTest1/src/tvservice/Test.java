package tvservice;

import bookservice.ISendBook;

public class Test {
	public static void main(String[] args) {
		JDTV jdBook = new JDTV();
		DangDangTV dangdangBook = new DangDangTV();

		ISendTV sf1 = new SFTVProxy(jdBook);
		sf1.sendTV();

		System.out.println();

		ISendTV sf2 = new SFTVProxy(dangdangBook);
		sf2.sendTV();
	}
}
