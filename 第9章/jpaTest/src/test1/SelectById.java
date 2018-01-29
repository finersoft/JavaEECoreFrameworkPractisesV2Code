package test1;

import javax.persistence.EntityManager;

import orm.EntityManagerHelper;
import orm.Userinfo;
import orm.UserinfoDAO;

public class SelectById {

	public static void main(String[] args) {

		EntityManager em = EntityManagerHelper.getEntityManager();
		EntityManagerHelper.beginTransaction();

		UserinfoDAO dao = new UserinfoDAO();
		Userinfo userinfo = dao.findById(2242445L);
		System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
				+ userinfo.getAge() + " " + userinfo.getInsertdate());

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

		// Caused by: org.hibernate.id.IdentifierGenerationException: ids for
		// this class must be manually assigned before calling save():
		// orm.Userinfo

	}

}
