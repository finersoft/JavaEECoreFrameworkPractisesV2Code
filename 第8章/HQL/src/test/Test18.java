package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import orm.HibernateSessionFactory;
import orm.Userinfo;

public class Test18 {

	public static void main(String[] args) throws InterruptedException {

		Map map = new HashMap();
		map.put("id", 2222495L);
		map.put("password", "%¹ú%");

		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction().begin();

		Query query;

		List<Userinfo> list = session.createQuery("from Userinfo u where u.id=:id and u.password like :password")
				.setProperties(map).list();
		for (int i = 0; i < list.size(); i++) {
			Userinfo userinfo = list.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate() + " code:" + userinfo.hashCode());
		}

		session.getTransaction().commit();
		session.close();

	}

}
