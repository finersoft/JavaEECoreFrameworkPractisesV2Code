package test;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;

import orm.HibernateSessionFactory;
import orm.Userinfo;

public class Test11 {

	public static void main(String[] args) throws InterruptedException {

		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction().begin();

		Query query = session.createQuery("from Userinfo u order by u.id asc");
		Iterator<Userinfo> iterator = query.iterate();
		while (iterator.hasNext()) {
			Userinfo userinfo = iterator.next();
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
			Thread.sleep(2000);
		}
		session.getTransaction().commit();
		session.close();

	}

}
