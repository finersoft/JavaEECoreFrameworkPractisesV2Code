package test;

import org.hibernate.Session;

import orm.HibernateSessionFactory;
import orm.Main;
import orm.Sub;

public class Test1 {

	public static void main(String[] args) {

		Main main = new Main();
		main.setMainname("mainname");

		Sub sub = new Sub();
		sub.setSubname("submain");
		sub.setMain(main);

		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction().begin();

		session.save(main);
		session.save(sub);

		session.getTransaction().commit();
		session.close();

	}

}
