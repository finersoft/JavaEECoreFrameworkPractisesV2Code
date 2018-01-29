package tvservice;

public class SFTVProxy implements ISendTV {

	private ISendTV sendTV;

	public SFTVProxy(ISendTV sendTV) {
		super();
		this.sendTV = sendTV;
	}

	@Override
	public void sendTV() {
		System.out.println("˳���ռ�-������-���ӿ���");
		sendTV.sendTV();
		System.out.println("˳���ʹ�-�����ύ-���ӹر�");
	}

}
