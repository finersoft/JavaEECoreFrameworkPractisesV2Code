package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import orm.EntityManagerHelper;
import orm.Userinfo;

public class Test7 {

	public static void main(String[] args) throws ParseException {

		Calendar beginDate = Calendar.getInstance();
		beginDate.set(Calendar.YEAR, 2016);
		beginDate.set(Calendar.MONTH, 11);
		beginDate.set(Calendar.DAY_OF_MONTH, 29);
		beginDate.set(Calendar.HOUR_OF_DAY, 0);
		beginDate.set(Calendar.MINUTE, 0);
		beginDate.set(Calendar.SECOND, 0);
		beginDate.set(Calendar.MILLISECOND, 0);

		Calendar endDate = Calendar.getInstance();
		endDate.set(Calendar.YEAR, 2017);
		endDate.set(Calendar.MONTH, 0);
		endDate.set(Calendar.DAY_OF_MONTH, 3);
		endDate.set(Calendar.HOUR_OF_DAY, 23);
		endDate.set(Calendar.MINUTE, 59);
		endDate.set(Calendar.SECOND, 59);
		endDate.set(Calendar.MILLISECOND, 0);

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date beginDateObject = beginDate.getTime();
		Date endDateObject = endDate.getTime();
		
		System.out.println(beginDateObject.toLocaleString());
		System.out.println(endDateObject.toLocaleString());

		EntityManager em = EntityManagerHelper.getEntityManager();
		EntityManagerHelper.beginTransaction();

		Query query = em.createQuery("select u from Userinfo u where u.insertdate between :beginDate and :endDate");
		query.setParameter("beginDate", beginDateObject);
		query.setParameter("endDate", endDateObject);
		List<Userinfo> listUserinfo = query.getResultList();
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getInsertdate());
		}

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

	}

}
