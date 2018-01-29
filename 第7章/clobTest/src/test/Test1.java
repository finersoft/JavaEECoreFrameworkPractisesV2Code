package test;

import orm.Bigtext;
import orm.BigtextDAO;

public class Test1 {

	public static void main(String[] args) {
		BigtextDAO dao = new BigtextDAO();
		dao.getSession().beginTransaction().begin();

		Bigtext btRef = dao.findById(1445484L);
		System.out.println(btRef.getBigtext());

		dao.getSession().getTransaction().commit();
		dao.getSession().close();

	}

}
