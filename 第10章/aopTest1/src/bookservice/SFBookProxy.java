package bookservice;

//˳����Ǵ����࣬��������ǰ������һЩ����
//�����������DangDangBook

//SFBookProxy.java���Ǵ�����
public class SFBookProxy implements ISendBook {

	private ISendBook sendBook;// JDBook or DangDangBook

	public SFBookProxy(ISendBook sendBook) {
		super();
		this.sendBook = sendBook;
	}

	@Override
	public void sendBook() {
		System.out.println("˳���ռ�-������-���ӿ���-��ǿ��ʼ");
		sendBook.sendBook();
		System.out.println("˳���ʹ�-�����ύ-���ӹر�-��ǿ����");
	}

}
