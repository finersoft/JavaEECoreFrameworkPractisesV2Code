package test;

import java.util.Iterator;
import java.util.Set;

import orm.Main;
import orm.MainDAO;
import orm.Sub;

public class GetMainPrintSub2 {
	public static void main(String[] args) {

		MainDAO maindao = new MainDAO();
		maindao.getSession().beginTransaction().begin();

		Main main = maindao.findById(2232500L);
		System.out.println(main.getId() + " " + main.getMainname());

		maindao.getSession().getTransaction().commit();
		maindao.getSession().close();

		Set<Sub> set = main.getSubs();
		Iterator<Sub> iterator = set.iterator();
		while (iterator.hasNext()) {
			Sub sub = iterator.next();
			System.out.println(" " + sub.getId() + " " + sub.getSubname());
		}

	}
}
