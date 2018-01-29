package test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import orm.HibernateSessionFactory;
import orm.Userinfo;

public class Test20 {

	public static void main(String[] args) throws InterruptedException, ParseException {

		String beginDateString = "2016-12-28 00:00:00";
		String endDateString = "2016-12-28 10:04:11";

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date beginDate = format.parse(beginDateString);
		Date endDate = format.parse(endDateString);

		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction().begin();

		Query query = session.createQuery("from Userinfo u where u.insertdate between :beginDate and :endDate");
		query.setTimestamp("beginDate", new Timestamp(beginDate.getTime()));
		query.setTimestamp("endDate", new Timestamp(endDate.getTime()));

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
