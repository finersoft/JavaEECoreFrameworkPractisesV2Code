package test;

import java.util.List;

import orm.Userinfo;
import orm.UserinfoDAO;

public class Test {

	// Hibernate�е�1���������ŵ�ʵ������ռ���ڴ�ģ�������ִ����session.close()��Щʵ������ʱ�ͱ�GC�����������ͷ��ڴ���Դ���������ִ��session.close()֮ǰ�����˺�����ʵ���࣬��ȫ�п��ܻ�����ڴ������������ʱ����ʹ��session.clear()���������־û������ģ�Ҳ���ǻ������ͷ��ڴ档

	public static void main(String[] args) {

		UserinfoDAO dao = new UserinfoDAO();
		dao.getSession().beginTransaction().begin();

		List<Userinfo> list = dao.findAll();
		for (int i = 0; i < list.size(); i++) {
			Userinfo userinfo = list.get(i);
			// ����userinfo�Ĵ���
			if (i % 1000 == 0) {
				dao.getSession().clear();
			}
		}

		dao.findById(2222496L);
		dao.findById(2222497L);
		dao.findById(2222496L);

		dao.getSession().getTransaction().commit();
		dao.getSession().close();

	}

}
