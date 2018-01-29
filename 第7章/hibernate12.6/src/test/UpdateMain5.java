package test;

import orm.Main;
import orm.MainDAO;

public class UpdateMain5 {
	public static void main(String[] args) {

		MainDAO maindao1 = new MainDAO();
		maindao1.getSession().beginTransaction().begin();

		Main main = maindao1.findById(2232503L);

		maindao1.getSession().getTransaction().commit();
		maindao1.getSession().close();

		main.setMainname("xxxxxxxxxxxxxxxxxxxxxxxxxx");

		MainDAO maindao2 = new MainDAO();
		maindao2.getSession().beginTransaction().begin();

		maindao2.getSession().update(main);

		maindao2.getSession().getTransaction().commit();
		maindao2.getSession().close();

	}
}
