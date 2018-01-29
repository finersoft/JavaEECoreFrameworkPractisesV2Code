package bookservice;

//顺风就是代理类，代理类就是帮别人做一些事情
//被代理类就是DangDangBook

//SFBookProxy.java就是代理类
public class SFBookProxy implements ISendBook {

	private ISendBook sendBook;// JDBook or DangDangBook

	public SFBookProxy(ISendBook sendBook) {
		super();
		this.sendBook = sendBook;
	}

	@Override
	public void sendBook() {
		System.out.println("顺风收件-事务开启-连接开启-增强开始");
		sendBook.sendBook();
		System.out.println("顺风送达-事务提交-连接关闭-增强结束");
	}

}
