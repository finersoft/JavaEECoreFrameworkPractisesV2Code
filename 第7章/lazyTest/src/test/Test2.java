package test;

import orm.Main;
import orm.MainDAO;

public class Test2 {

	public static void main(String[] args) {
		MainDAO maindao = new MainDAO();
		maindao.getSession().beginTransaction().begin();

		Main main = maindao.getSession().load(Main.class, 2232500L);

		maindao.getSession().getTransaction().commit();
		maindao.getSession().close();
	}

}
