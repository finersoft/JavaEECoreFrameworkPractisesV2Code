package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import orm.EntityManagerHelper;

public class Test4 {

	public static void main(String[] args) {

		EntityManager em = EntityManagerHelper.getEntityManager();
		EntityManagerHelper.beginTransaction();

		Query query = em.createQuery("select u.id,u.username,u.password from Userinfo u order by u.id asc");
		List<Object[]> listUserinfo = query.getResultList();
		for (int i = 0; i < listUserinfo.size(); i++) {
			Object[] objectArray = listUserinfo.get(i);
			System.out.println(objectArray[0] + " " + objectArray[1] + " " + objectArray[2]);
		}

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

	}

}
