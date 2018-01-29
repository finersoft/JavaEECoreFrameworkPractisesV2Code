package test1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.Userinfo;

public class Test6 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Userinfo userinfo1 = em.find(Userinfo.class, 2242444L);
		System.out.println(userinfo1.getUsername());
		Userinfo userinfo2 = em.getReference(Userinfo.class, 2242446L);
		System.out.println(userinfo2.getUsername());

		em.getTransaction().commit();
		em.close();

	}

}
