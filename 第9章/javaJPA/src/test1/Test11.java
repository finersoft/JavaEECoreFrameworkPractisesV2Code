package test1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.Userinfo;

public class Test11 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		List<Userinfo> listUserinfo = em.createQuery("select u from Userinfo u order by u.id asc").getResultList();
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername());
		}

		em.getTransaction().commit();
		em.close();
	}

}
