package test;

import java.util.Date;

import orm.Userinfo;
import orm.UserinfoDAO;

public class Insert {

	public static void main(String[] args) {

		Userinfo userinfo = new Userinfo();
		userinfo.setUsername("�й�");
		userinfo.setPassword("�й���");
		userinfo.setAge(100L);
		userinfo.setInsertdate(new Date());

		UserinfoDAO dao = new UserinfoDAO();
		dao.getSession().beginTransaction();

		dao.attachDirty(userinfo);

		dao.getSession().getTransaction().commit();
		dao.getSession().close();

	}

}
