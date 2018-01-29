package curd;

import org.hibernate.Session;

import orm.Userinfo;
import tools.GetSession;

public class SelectById {

	public static void main(String[] args) {
		Session session = GetSession.getSession();
		session.beginTransaction().begin();

		Userinfo userinfo = (Userinfo) session.load(Userinfo.class, 2222499L);
		System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
				+ userinfo.getAge() + " " + userinfo.getInsertdate());

		session.getTransaction().commit();
		session.close();

	}

}
