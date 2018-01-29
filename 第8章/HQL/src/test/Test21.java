package test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import orm.HibernateSessionFactory;
import orm.Userinfo;

public class Test21 {

	public static void main(String[] args) throws InterruptedException, ParseException {

		Calendar beginCalendar = Calendar.getInstance();
		beginCalendar.set(Calendar.YEAR, 2016);
		beginCalendar.set(Calendar.MONTH, 11);
		beginCalendar.set(Calendar.DAY_OF_MONTH, 28);

		beginCalendar.set(Calendar.HOUR_OF_DAY, 0);
		beginCalendar.set(Calendar.MINUTE, 0);
		beginCalendar.set(Calendar.SECOND, 0);
		beginCalendar.set(Calendar.MILLISECOND, 0);

		Calendar endCalendar = Calendar.getInstance();
		endCalendar.set(Calendar.YEAR, 2016);
		endCalendar.set(Calendar.MONTH, 11);
		endCalendar.set(Calendar.DAY_OF_MONTH, 28);

		endCalendar.set(Calendar.HOUR_OF_DAY, 10);
		endCalendar.set(Calendar.MINUTE, 4);
		endCalendar.set(Calendar.SECOND, 11);
		endCalendar.set(Calendar.MILLISECOND, 0);

		Date beginDate = beginCalendar.getTime();
		Date endDate = endCalendar.getTime();

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
