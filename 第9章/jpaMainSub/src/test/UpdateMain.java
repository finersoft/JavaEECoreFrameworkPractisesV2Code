package test;

import orm.EntityManagerHelper;
import orm.Main;
import orm.MainDAO;
import orm.Sub;
import orm.SubDAO;

public class UpdateMain {

	public static void main(String[] args) {

		MainDAO maindao = new MainDAO();
		SubDAO subdao = new SubDAO();
		EntityManagerHelper.beginTransaction();

		Main main = maindao.findById(2252444L);
		main.setMainname(main.getMainname() + "  new");

		maindao.update(main);

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

	}

}
