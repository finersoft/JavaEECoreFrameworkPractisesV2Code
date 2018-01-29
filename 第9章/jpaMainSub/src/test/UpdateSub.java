package test;

import orm.EntityManagerHelper;
import orm.Main;
import orm.MainDAO;
import orm.Sub;
import orm.SubDAO;

public class UpdateSub {

	public static void main(String[] args) {

		MainDAO maindao = new MainDAO();
		SubDAO subdao = new SubDAO();
		EntityManagerHelper.beginTransaction();

		Sub sub = subdao.findById(2252445L);
		sub.setSubname(sub.getSubname() + " new");

		subdao.update(sub);

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

	}

}
