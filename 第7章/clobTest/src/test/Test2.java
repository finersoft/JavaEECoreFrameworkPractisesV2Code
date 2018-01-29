package test;

import orm.Bigtext;
import orm.BigtextDAO;

public class Test2 {

	public static void main(String[] args) {
		BigtextDAO dao = new BigtextDAO();
		dao.getSession().beginTransaction().begin();

		Bigtext btRef = dao.findById(1445484L);
		Bigtext newBigtext = new Bigtext();
		newBigtext.setBigtext(btRef.getBigtext());

		dao.save(newBigtext);

		dao.getSession().getTransaction().commit();
		dao.getSession().close();

	}

}
