package curd;

import org.hibernate.Session;

import orm.Userinfo;
import tools.GetSession;

public class Insert {

	public static void main(String[] args) {
		
		Userinfo userinfo = new Userinfo();
		userinfo.setUsername("�й�");
		userinfo.setPassword("�й���");

		Session session = GetSession.getSession();
		session.beginTransaction().begin();

		session.save(userinfo);

		session.getTransaction().commit();
		session.close();

	}

}
