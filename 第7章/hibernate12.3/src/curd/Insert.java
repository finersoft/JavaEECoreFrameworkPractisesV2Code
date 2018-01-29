package curd;

import org.hibernate.Session;

import orm.Userinfo;
import tools.GetSession;

public class Insert {

	public static void main(String[] args) {
		
		Userinfo userinfo = new Userinfo();
		userinfo.setUsername("中国");
		userinfo.setPassword("中国人");

		Session session = GetSession.getSession();
		session.beginTransaction().begin();

		session.save(userinfo);

		session.getTransaction().commit();
		session.close();

	}

}
