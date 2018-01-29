package test;

import orm.Userinfo;
import orm.UserinfoDAO;

public class SelectById {

	public static void main(String[] args) {

		UserinfoDAO dao = new UserinfoDAO();
		dao.getSession().beginTransaction();

		Userinfo userinfo = dao.findById(2222498L);
		System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
				+ userinfo.getAge() + " " + userinfo.getInsertdate());

		dao.getSession().getTransaction().commit();
		dao.getSession().close();

	}

}
