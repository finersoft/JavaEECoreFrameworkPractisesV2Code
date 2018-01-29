package test;

import orm.Main;
import orm.MainDAO;

public class InsertMain {
	public static void main(String[] args) {

		Main main = new Main();
		main.setMainname("ºÓ±±Ê¡");

		MainDAO maindao = new MainDAO();
		maindao.getSession().beginTransaction().begin();

		maindao.save(main);

		maindao.getSession().getTransaction().commit();
		maindao.getSession().close();

	}
}
