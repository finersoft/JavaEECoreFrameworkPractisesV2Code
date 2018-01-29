package bookservice;

public class DangDangBook implements ISendBook {
	@Override
	public void sendBook() {
		System.out.println("当当网书籍部门知道你的地址，电话，备注，要给你送书了！");
	}

	@Override
	public void sendBookError() {
		System.out.println("当当网书籍部门知道你的地址，电话，备注，要给你送书了！");
		Integer.parseInt("a");
	}
}
