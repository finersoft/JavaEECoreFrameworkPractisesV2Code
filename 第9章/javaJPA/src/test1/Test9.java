package test1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.Userinfo;

public class Test9 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Userinfo userinfo = em.find(Userinfo.class, 2242446L);
		System.out.println(em.contains(userinfo));
		em.clear();// 清除1级缓存中的数据
		System.out.println(em.contains(userinfo));
		em.getTransaction().commit();
		em.close();
	}

}
