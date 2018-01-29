package test1;

import javax.persistence.EntityManager;

import orm.EntityManagerHelper;
import orm.Userinfo;
import orm.UserinfoDAO;

public class UpdateById {

	public static void main(String[] args) {

		EntityManager em = EntityManagerHelper.getEntityManager();
		EntityManagerHelper.beginTransaction();

		UserinfoDAO dao = new UserinfoDAO();
		Userinfo userinfo = dao.findById(2242445L);

		userinfo.setUsername("xxxxxxxxxxx");

		dao.update(userinfo);

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();
	}

}
