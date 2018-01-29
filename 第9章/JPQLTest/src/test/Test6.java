package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.sun.jmx.snmp.Timestamp;

import orm.EntityManagerHelper;
import orm.Userinfo;

public class Test6 {

	public static void main(String[] args) throws ParseException {
		String beginDateString = "2016-12-29";
		String endDateString = "2017-1-3";

		beginDateString = beginDateString + " 00:00:00";
		endDateString = endDateString + " 23:59:59";

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date beginDate = format.parse(beginDateString);
		Date endDate = format.parse(endDateString);

		EntityManager em = EntityManagerHelper.getEntityManager();
		EntityManagerHelper.beginTransaction();

		Query query = em
				.createQuery("select u from Userinfo u where u.insertdate between :beginDate and :endDate");
		query.setParameter("beginDate", beginDate);
		query.setParameter("endDate", endDate);
		List<Userinfo> listUserinfo = query.getResultList();
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getInsertdate());
		}

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

	}

}
