package test;

import orm.EntityManagerHelper;
import orm.Main;
import orm.MainDAO;

public class DeleteMain {

	public static void main(String[] args) {
		MainDAO maindao = new MainDAO();
		EntityManagerHelper.beginTransaction();

		Main main = maindao.findById(2252444L);
		maindao.delete(main);

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

	}

}
