package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import orm.HibernateSessionFactory;
import orm.Userinfo;

public class Test7 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction().begin();

		Query query = session.createQuery("select u.id,u.username from Userinfo u");
		List<Object[]> list = query.list();
		for (int i = 0; i < list.size(); i++) {
			Object[] objectArray = list.get(i);
			System.out.println(objectArray[0] + " " + objectArray[1]);
		}

		session.getTransaction().commit();
		session.close();

	}

}
