package curd;

import org.hibernate.Session;

import orm.Userinfo;
import tools.GetSession;

public class UpdateById {

	public static void main(String[] args) {
		Session session = GetSession.getSession();
		session.beginTransaction().begin();

		Userinfo userinfo = (Userinfo) session.load(Userinfo.class, 2222499L);
		userinfo.setUsername("�µĴ��й�");

		session.update(userinfo);

		session.getTransaction().commit();
		session.close();

	}

}
