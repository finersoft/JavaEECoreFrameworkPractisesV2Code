package tvservice;

public class SFTVProxy implements ISendTV {

	private ISendTV sendTV;

	public SFTVProxy(ISendTV sendTV) {
		super();
		this.sendTV = sendTV;
	}

	@Override
	public void sendTV() {
		System.out.println("顺风收件-事务开启-连接开启");
		sendTV.sendTV();
		System.out.println("顺风送达-事务提交-连接关闭");
	}

}
