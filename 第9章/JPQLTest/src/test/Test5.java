package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.NewUserinfo;
import orm.EntityManagerHelper;

public class Test5 {

	public static void main(String[] args) {

		EntityManager em = EntityManagerHelper.getEntityManager();
		EntityManagerHelper.beginTransaction();

		Query query = em.createQuery(
				"select new entity.NewUserinfo(u.id,u.username,u.insertdate) from Userinfo u order by u.id asc");
		List<NewUserinfo> listUserinfo = query.getResultList();
		for (int i = 0; i < listUserinfo.size(); i++) {
			NewUserinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getInsertdate());
		}

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

	}

}
