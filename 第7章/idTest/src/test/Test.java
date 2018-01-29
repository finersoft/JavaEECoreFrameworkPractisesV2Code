package test;

import java.util.List;

import orm.Userinfo;
import orm.UserinfoDAO;

public class Test {

	// Hibernate中的1级缓存里存放的实体类是占用内存的，但由于执行了session.close()这些实体类随时就被GC垃圾回收以释放内存资源，但如果在执行session.close()之前操作了海量的实体类，完全有可能会出现内存溢出，所以这时可以使用session.clear()方法来除持久化上下文，也就是缓存来释放内存。

	public static void main(String[] args) {

		UserinfoDAO dao = new UserinfoDAO();
		dao.getSession().beginTransaction().begin();

		List<Userinfo> list = dao.findAll();
		for (int i = 0; i < list.size(); i++) {
			Userinfo userinfo = list.get(i);
			// 操作userinfo的代码
			if (i % 1000 == 0) {
				dao.getSession().clear();
			}
		}

		dao.findById(2222496L);
		dao.findById(2222497L);
		dao.findById(2222496L);

		dao.getSession().getTransaction().commit();
		dao.getSession().close();

	}

}
