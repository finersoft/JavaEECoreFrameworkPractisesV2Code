package test1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.Userinfo;

public class Test10 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Userinfo userinfo1 = em.find(Userinfo.class, 2242446L);
		Userinfo userinfo2 = em.find(Userinfo.class, 2242446L);
		em.clear();// 清除1级缓存中的数据
		Userinfo userinfo3 = em.find(Userinfo.class, 2242446L);
		em.getTransaction().commit();
		em.close();
	}

}
