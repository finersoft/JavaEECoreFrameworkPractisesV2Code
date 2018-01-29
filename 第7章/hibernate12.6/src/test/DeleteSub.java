package test;

import orm.Main;
import orm.MainDAO;
import orm.Sub;
import orm.SubDAO;

public class DeleteSub {
	public static void main(String[] args) {

		MainDAO maindao = new MainDAO();
		maindao.getSession().beginTransaction().begin();

		SubDAO subdao = new SubDAO();

		Sub sub = subdao.findById(2232510L);

		subdao.delete(sub);

		maindao.getSession().getTransaction().commit();
		maindao.getSession().close();

	}
}
