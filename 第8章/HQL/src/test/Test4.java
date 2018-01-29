package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import orm.HibernateSessionFactory;
import orm.Userinfo;

public class Test4 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction().begin();
		
		// select��ֻ��1��ʱ��List�洢���ǵ�ǰ�е���������
		
		Query query = session.createQuery("select id from Userinfo");
		List<Long> list = query.list();
		for (int i = 0; i < list.size(); i++) {
			long idValue = list.get(i);
			System.out.println(idValue);
		}

		session.getTransaction().commit();
		session.close();

	}

}
