package test3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.Userinfo;

public class Test1 {

	// JPA原生API的使用
	public static void main(String[] args) {
		Userinfo userinfo = new Userinfo();
		userinfo.setUsername("中国");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		em.persist(userinfo);

		em.getTransaction().commit();
		em.close();

	}

}
