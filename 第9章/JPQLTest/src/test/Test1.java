package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import orm.EntityManagerHelper;
import orm.Userinfo;

public class Test1 {

	public static void main(String[] args) {

		EntityManager em = EntityManagerHelper.getEntityManager();
		EntityManagerHelper.beginTransaction();

		Query query = em.createQuery("select u from Userinfo u where u.id = ?1 or u.id = ?2");
		query.setParameter(1, 1L);
		query.setParameter(2, 2L);
		List<Userinfo> listUserinfo = query.getResultList();
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
		}

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

	}

}
