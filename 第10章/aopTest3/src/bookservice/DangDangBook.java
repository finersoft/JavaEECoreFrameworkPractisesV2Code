package bookservice;

public class DangDangBook implements ISendBook {
	@Override
	public void sendBook() {
		System.out.println("�������鼮����֪����ĵ�ַ���绰����ע��Ҫ���������ˣ�");
	}

	@Override
	public void sendBookError() {
		System.out.println("�������鼮����֪����ĵ�ַ���绰����ע��Ҫ���������ˣ�");
		Integer.parseInt("a");
	}
}
