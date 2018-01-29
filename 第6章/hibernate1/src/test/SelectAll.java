package test;

import java.util.List;

import orm.Userinfo;
import orm.UserinfoDAO;

public class SelectAll {

	public static void main(String[] args) {

		UserinfoDAO dao = new UserinfoDAO();
		dao.getSession().beginTransaction();

		List<Userinfo> listUserinfo = dao.findAll();
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
		}

		dao.getSession().getTransaction().commit();
		dao.getSession().close();

	}

}
