package test;

import java.util.Iterator;
import java.util.Set;

import orm.Main;
import orm.MainDAO;
import orm.Sub;

public class GetMainPrintSub {
	public static void main(String[] args) {

		MainDAO maindao = new MainDAO();
		maindao.getSession().beginTransaction().begin();

		Main main = maindao.findById(2232500L);
		System.out.println(main.getId() + " " + main.getMainname());

		Set<Sub> set = main.getSubs();
		Iterator<Sub> iterator = set.iterator();
		while (iterator.hasNext()) {
			Sub sub = iterator.next();
			System.out.println(" " + sub.getId() + " " + sub.getSubname());
		}

		maindao.getSession().getTransaction().commit();
		maindao.getSession().close();

	}
}
