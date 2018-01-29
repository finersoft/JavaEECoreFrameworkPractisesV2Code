package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entity.QueryUserinfoEntity;
import orm.HibernateSessionFactory;
import orm.Userinfo;

public class Test16 {

	public static void main(String[] args) throws InterruptedException {

		QueryUserinfoEntity entity = new QueryUserinfoEntity();
		entity.setId(2222496L);
		entity.setPassword("%¹ú%");

		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction().begin();

		Query query = session.createQuery("from Userinfo u where u.id=:id and u.password like :password");
		query.setProperties(entity);

		List<Userinfo> list = query.list();
		for (int i = 0; i < list.size(); i++) {
			Userinfo userinfo = list.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate() + " code:" + userinfo.hashCode());
		}

		session.getTransaction().commit();
		session.close();

	}

}
