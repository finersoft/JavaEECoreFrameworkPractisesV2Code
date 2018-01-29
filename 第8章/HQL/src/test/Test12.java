package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import orm.HibernateSessionFactory;
import orm.Userinfo;

public class Test12 {

	public static void main(String[] args) throws InterruptedException {

		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction().begin();

		Query query = session.createQuery("from Userinfo u order by u.id asc");
		List<Userinfo> list = query.list();
		for (int i = 0; i < list.size(); i++) {
			Userinfo userinfo = list.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate() + " code:" + userinfo.hashCode());
		}

		query = session.createQuery("from Userinfo u order by u.id asc");
		Iterator<Userinfo> iterator = query.iterate();
		while (iterator.hasNext()) {
			Userinfo userinfo = iterator.next();
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate() + " code:" + userinfo.hashCode());
		}
		session.getTransaction().commit();
		session.close();

	}

}
