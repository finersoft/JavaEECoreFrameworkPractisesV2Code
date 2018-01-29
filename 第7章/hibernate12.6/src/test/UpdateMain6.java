package test;

import orm.Main;
import orm.MainDAO;

public class UpdateMain6 {
	public static void main(String[] args) {

		MainDAO maindao1 = new MainDAO();
		maindao1.getSession().beginTransaction().begin();

		Main main = maindao1.findById(2232503L);

		maindao1.getSession().getTransaction().commit();
		maindao1.getSession().close();
		// close()之后实体类main变成游离状态的!

		main.setMainname("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

		MainDAO maindao2 = new MainDAO();
		maindao2.getSession().beginTransaction().begin();
		// 再使用update()或者saveOrUpdate()方法将游离对象重新纳入到持久化上下文中
		// 在事务commit时提交到数据库
		maindao2.getSession().saveOrUpdate(main);

		maindao2.getSession().getTransaction().commit();
		maindao2.getSession().close();

	}
}
