package test;

import java.util.Iterator;
import java.util.Set;

import orm.EntityManagerHelper;
import orm.Main;
import orm.MainDAO;
import orm.Sub;

public class MainSubLazy {

	public static void main(String[] args) {
		MainDAO maindao = new MainDAO();
		EntityManagerHelper.beginTransaction();

		Main main = maindao.findById(2252446L);
		System.out.println(main.getId() + " " + main.getMainname());

		Set<Sub> setSub = main.getSubs();
		Iterator<Sub> iterator = setSub.iterator();
		while (iterator.hasNext()) {
			Sub sub = iterator.next();
			System.out.println(sub.getId() + " " + sub.getSubname());
		}
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();

	}

}
