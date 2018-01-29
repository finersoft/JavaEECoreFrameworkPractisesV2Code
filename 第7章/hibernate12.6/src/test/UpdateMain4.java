package test;

import orm.Main;
import orm.MainDAO;

public class UpdateMain4 {
	public static void main(String[] args) {

		MainDAO maindao = new MainDAO();
		maindao.getSession().beginTransaction().begin();

		Main main = maindao.findById(2232503L);
		main.setMainname("xxxxxxxxxxx");
		maindao.getSession().saveOrUpdate(main);

		maindao.getSession().getTransaction().commit();
		maindao.getSession().close();

	}
}
