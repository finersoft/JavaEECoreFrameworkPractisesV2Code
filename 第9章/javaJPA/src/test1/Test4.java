package test1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.Userinfo;

public class Test4 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Userinfo userinfo1 = em.find(Userinfo.class, 123456L);
		Userinfo userinfo2 = em.getReference(Userinfo.class, 456123L);

		em.getTransaction().commit();
		em.close();

	}

}
