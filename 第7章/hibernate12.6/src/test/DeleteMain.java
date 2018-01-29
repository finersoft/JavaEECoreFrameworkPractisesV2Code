package test;

import orm.Main;
import orm.MainDAO;
import orm.Sub;
import orm.SubDAO;

public class DeleteMain {
	public static void main(String[] args) {

		MainDAO maindao = new MainDAO();
		maindao.getSession().beginTransaction().begin();

		Main main = maindao.findById(2232502L);
		maindao.delete(main);

		maindao.getSession().getTransaction().commit();
		maindao.getSession().close();

	}
}
