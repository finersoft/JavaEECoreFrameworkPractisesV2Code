package test1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.Userinfo;

public class Test3 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Userinfo userinfo = em.find(Userinfo.class, 2242447L);
		
		em.remove(userinfo);
		
		em.getTransaction().commit();
		em.close();

	}

}
