package test;

import orm.Main;
import orm.MainDAO;
import orm.Sub;
import orm.SubDAO;

public class TestSessionSame {
	public static void main(String[] args) {

		MainDAO maindao = new MainDAO();
		maindao.getSession().beginTransaction().begin();
		
		SubDAO subdao = new SubDAO();
		
		System.out.println(maindao.getSession());
		System.out.println(subdao.getSession());
		
		System.out.println(maindao.getSession().hashCode());
		System.out.println(subdao.getSession().hashCode());
		
		maindao.getSession().getTransaction().commit();
		maindao.getSession().close();

	}
}
