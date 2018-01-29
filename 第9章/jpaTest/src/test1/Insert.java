package test1;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.EntityManager;

import orm.EntityManagerHelper;
import orm.Userinfo;
import orm.UserinfoDAO;

public class Insert {

	public static void main(String[] args) {

		Userinfo userinfo = new Userinfo();
		userinfo.setUsername("中国");
		userinfo.setPassword("中国人");
		userinfo.setAge(100L);
		userinfo.setInsertdate(new Timestamp(new Date().getTime()));

		EntityManager em = EntityManagerHelper.getEntityManager();
		EntityManagerHelper.beginTransaction();

		UserinfoDAO dao = new UserinfoDAO();
		dao.save(userinfo);

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

		// Caused by: org.hibernate.id.IdentifierGenerationException: ids for
		// this class must be manually assigned before calling save():
		// orm.Userinfo

	}

}
