package test;

import org.hibernate.Query;
import org.hibernate.Session;

import orm.HibernateSessionFactory;

public class Test1 {

	public static void main(String[] args) {

		// Exception in thread "main"
		// org.hibernate.hql.internal.ast.QuerySyntaxException: unexpected
		// token: * near line 1, column 8 [select * from userinfo]

		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction().begin();

		Query query = session.createQuery("select * from userinfo");

		session.getTransaction().commit();
		session.close();

	}

}
