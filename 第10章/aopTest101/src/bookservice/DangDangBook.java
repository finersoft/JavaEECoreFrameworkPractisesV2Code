package bookservice;

import java.util.Date;

public class DangDangBook implements ISendBook {
	@Override
	public String sendBook(Date date, int age) {
		System.out.println("�������鼮����֪����ĵ�ַ���绰����ע��Ҫ���������ˣ�date=" + date + " age=" + age);
		return "�����й���";
	}
}
