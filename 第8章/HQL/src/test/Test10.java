package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import orm.HibernateSessionFactory;
import orm.Userinfo;

public class Test10 {

	public static void main(String[] args) {

		// list()使用1条SQL查询出所有的数据
		// Hibernate: select userinfo0_.ID as col_0_0_, userinfo0_.USERNAME as
		// col_1_0_ from Y2.USERINFO userinfo0_ order by userinfo0_.ID asc

		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction().begin();

		Query query = session.createQuery("from Userinfo u order by u.id asc");
		List<Userinfo> list = query.list();
		for (int i = 0; i < list.size(); i++) {
			Userinfo userinfo = list.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
		}

		session.getTransaction().commit();
		session.close();

	}

}
