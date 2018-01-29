package test;

import java.util.Date;

import orm.Userinfo;
import orm.UserinfoDAO;

public class Insert {

	public static void main(String[] args) {

		Userinfo userinfo = new Userinfo();
		userinfo.setUsername("中国");
		userinfo.setPassword("中国人");
		userinfo.setAge(100L);
		userinfo.setInsertdate(new Date());

		UserinfoDAO dao = new UserinfoDAO();
		dao.getSession().beginTransaction();

		dao.attachDirty(userinfo);

		dao.getSession().getTransaction().commit();
		dao.getSession().close();

	}

}
