package test;

import orm.Main;
import orm.MainDAO;
import orm.Sub;
import orm.SubDAO;

public class UpdateSub {
	public static void main(String[] args) {

		MainDAO maindao = new MainDAO();
		maindao.getSession().beginTransaction().begin();

		SubDAO subdao = new SubDAO();

		Main main = maindao.findById(2232502L);
		Sub sub = subdao.findById(2232505L);
		sub.setSubname("我是主表502的子数据");
		sub.setMain(main);

		subdao.attachDirty(sub);

		maindao.getSession().getTransaction().commit();
		maindao.getSession().close();

	}
}
