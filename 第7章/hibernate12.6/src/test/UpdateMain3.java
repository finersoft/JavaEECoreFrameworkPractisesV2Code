package test;

import orm.Main;
import orm.MainDAO;

public class UpdateMain3 {
	public static void main(String[] args) {

		MainDAO maindao = new MainDAO();
		maindao.getSession().beginTransaction().begin();

		Main main = new Main();// insert
		main.setMainname("xxxxxxxxxxx");
		maindao.getSession().saveOrUpdate(main);

		maindao.getSession().getTransaction().commit();
		maindao.getSession().close();

	}
}
