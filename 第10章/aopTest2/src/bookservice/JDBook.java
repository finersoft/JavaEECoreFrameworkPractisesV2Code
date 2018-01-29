package bookservice;

public class JDBook implements ISendBook {
	@Override
	public void sendBook() {
		System.out.println("京东网书籍部门知道你的地址，电话，备注，要给你送书了！");
	}
}
