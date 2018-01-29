package test;

import orm.Userinfo;
import orm.UserinfoDAO;

public class DeleteById {

	public static void main(String[] args) {

		UserinfoDAO dao = new UserinfoDAO();
		dao.getSession().beginTransaction();

		Userinfo userinfo = dao.findById(2222498L);

		dao.delete(userinfo);

		dao.getSession().getTransaction().commit();
		dao.getSession().close();

	}

}
