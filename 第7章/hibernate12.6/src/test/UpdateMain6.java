package test;

import orm.Main;
import orm.MainDAO;

public class UpdateMain6 {
	public static void main(String[] args) {

		MainDAO maindao1 = new MainDAO();
		maindao1.getSession().beginTransaction().begin();

		Main main = maindao1.findById(2232503L);

		maindao1.getSession().getTransaction().commit();
		maindao1.getSession().close();
		// close()֮��ʵ����main�������״̬��!

		main.setMainname("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

		MainDAO maindao2 = new MainDAO();
		maindao2.getSession().beginTransaction().begin();
		// ��ʹ��update()����saveOrUpdate()��������������������뵽�־û���������
		// ������commitʱ�ύ�����ݿ�
		maindao2.getSession().saveOrUpdate(main);

		maindao2.getSession().getTransaction().commit();
		maindao2.getSession().close();

	}
}
