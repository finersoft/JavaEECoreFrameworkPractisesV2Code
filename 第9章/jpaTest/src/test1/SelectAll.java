package test1;

import java.util.List;

import javax.persistence.EntityManager;

import orm.EntityManagerHelper;
import orm.Userinfo;
import orm.UserinfoDAO;

public class SelectAll {

	public static void main(String[] args) {

		EntityManager em = EntityManagerHelper.getEntityManager();
		EntityManagerHelper.beginTransaction();

		UserinfoDAO dao = new UserinfoDAO();
		List<Userinfo> listUserinfo = dao.findAll(0, 100);
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
		}

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

	}

}
