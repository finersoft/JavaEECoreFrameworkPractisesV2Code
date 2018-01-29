package test;

import orm.EntityManagerHelper;
import orm.Main;
import orm.MainDAO;
import orm.Sub;
import orm.SubDAO;

public class InsertSub {

	public static void main(String[] args) {

		MainDAO maindao = new MainDAO();
		SubDAO subdao = new SubDAO();
		EntityManagerHelper.beginTransaction();

		Main main = maindao.findById(2252446L);

		Sub sub = new Sub();
		sub.setSubname("ÑÌÌ¨ÊÐ");
		sub.setMain(main);

		subdao.save(sub);

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

	}

}
