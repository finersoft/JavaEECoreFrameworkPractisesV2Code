package test;

import java.text.ParseException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import orm.HibernateSessionFactory;
import orm.Userinfo;

public class Test22 {

	public static void main(String[] args) throws InterruptedException, ParseException {

		String gotoPage = "3";
		int gotoPageInt = 1;
		try {
			gotoPageInt = Integer.parseInt(gotoPage);
			if (gotoPageInt <= 0) {
				gotoPageInt = 1;
			}
		} catch (NumberFormatException e) {
			gotoPageInt = 1;
		}

		int pageSize = 2;
		int beginPosition = (gotoPageInt - 1) * pageSize;

		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction().begin();

		Query query = session.createQuery("from Userinfo u order by u.id asc");
		query.setFirstResult(beginPosition);
		query.setMaxResults(pageSize);

		// query.setString("username", "%жа%");

		List<Userinfo> listUserinfo = query.list();

		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate() + " code:" + userinfo.hashCode());
		}

		session.getTransaction().commit();
		session.close();

	}

}
