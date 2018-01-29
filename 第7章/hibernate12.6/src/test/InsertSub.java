package test;

import orm.Main;
import orm.MainDAO;
import orm.Sub;
import orm.SubDAO;

public class InsertSub {
	public static void main(String[] args) {

		MainDAO maindao = new MainDAO();
		maindao.getSession().beginTransaction().begin();

		SubDAO subdao = new SubDAO();

		Main main = maindao.findById(2232500L);
		Sub sub = new Sub();
		sub.setSubname("ÌÆÉ½ÊÐ");
		sub.setMain(main);
		subdao.save(sub);

		maindao.getSession().getTransaction().commit();
		maindao.getSession().close();

	}
}
