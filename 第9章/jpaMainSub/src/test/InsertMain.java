package test;

import orm.EntityManagerHelper;
import orm.Main;
import orm.MainDAO;

public class InsertMain {

	public static void main(String[] args) {
		Main main = new Main();
		main.setMainname("ɽ��");

		MainDAO maindao = new MainDAO();
		EntityManagerHelper.beginTransaction();

		maindao.save(main);

		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

	}

}
