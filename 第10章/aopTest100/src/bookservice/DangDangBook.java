package bookservice;

import java.util.Date;

public class DangDangBook implements ISendBook {
	@Override
	public void sendBook(Date date, int age) {
		System.out.println("当当网书籍部门知道你的地址，电话，备注，要给你送书了！date=" + date + " age=" + age);
	}
}
