package test;

import orm.Main;
import orm.MainDAO;

public class UpdateMain2 {
	public static void main(String[] args) {

		MainDAO maindao = new MainDAO();
		maindao.getSession().beginTransaction().begin();

		Main main = maindao.findById(2232500L);
		main.setMainname("�ºӱ�ʡzzzzzzzzzzz");
		maindao.getSession().update(main);

		maindao.getSession().getTransaction().commit();
		maindao.getSession().close();

	}
}
