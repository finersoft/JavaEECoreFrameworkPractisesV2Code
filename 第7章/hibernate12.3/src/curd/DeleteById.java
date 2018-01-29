package curd;

import org.hibernate.Session;

import orm.Userinfo;
import tools.GetSession;

public class DeleteById {

	public static void main(String[] args) {
		Session session = GetSession.getSession();
		session.beginTransaction().begin();

		Userinfo userinfo = (Userinfo) session.load(Userinfo.class, 2222499L);

		session.delete(userinfo);

		session.getTransaction().commit();
		session.close();

	}

}
