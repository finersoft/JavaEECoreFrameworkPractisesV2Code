package test;

import java.text.ParseException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import orm.EntityManagerHelper;
import orm.Userinfo;

public class Test8 {

	public static void main(String[] args) throws ParseException {

		EntityManager em = EntityManagerHelper.getEntityManager();
		EntityManagerHelper.beginTransaction();

		Query query = em.createQuery("select u from Userinfo u order by u.id asc");
		query.setFirstResult(5);
		query.setMaxResults(6);

		List<Userinfo> listUserinfo = query.getResultList();
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getInsertdate());
		}

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

	}

}
