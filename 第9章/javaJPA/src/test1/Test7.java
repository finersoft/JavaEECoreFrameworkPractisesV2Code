package test1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Test7 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Query query = em.createNativeQuery("select * from userinfo where id=2242446");
		List<Object[]> list = query.getResultList();
		for (int i = 0; i < list.size(); i++) {
			Object[] objectArray = list.get(i);
			System.out.println(objectArray[0] + " " + objectArray[1] + " " + objectArray[2] + " " + objectArray[3] + " "
					+ objectArray[4]);
		}
		System.out.println();
		System.out.println();
		query = em.createNativeQuery("select * from userinfo order by id asc");
		list = query.getResultList();
		for (int i = 0; i < list.size(); i++) {
			Object[] objectArray = list.get(i);
			System.out.println(objectArray[0] + " " + objectArray[1] + " " + objectArray[2] + " " + objectArray[3] + " "
					+ objectArray[4]);
		}
		em.getTransaction().commit();
		em.close();

	}

}
