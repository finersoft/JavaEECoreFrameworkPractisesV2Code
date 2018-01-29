package test;

import org.hibernate.Query;
import org.hibernate.Session;

import orm.HibernateSessionFactory;

public class Test2 {

	// Caused by: org.hibernate.hql.internal.ast.QuerySyntaxException: userinfo
	// is not mapped

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction().begin();

		Query query = session.createQuery("from userinfo");

		session.getTransaction().commit();
		session.close();

	}

}
