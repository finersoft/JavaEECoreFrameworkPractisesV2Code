package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import orm.EntityManagerHelper;
import orm.Userinfo;

public class Test2 {

	public static void main(String[] args) {

		EntityManager em = EntityManagerHelper.getEntityManager();
		EntityManagerHelper.beginTransaction();

		Query query = em.createQuery("select u from Userinfo u where u.username like :username");
		query.setParameter("username", "%жа%");
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
