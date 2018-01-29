package test;

import orm.Main;
import orm.MainDAO;

public class Test5 {

	public static void main(String[] args) {
		MainDAO maindao = new MainDAO();
		maindao.getSession().beginTransaction().begin();

		Main main = maindao.getSession().get(Main.class, 9999999999L);

		maindao.getSession().getTransaction().commit();
		maindao.getSession().close();
	}

}
