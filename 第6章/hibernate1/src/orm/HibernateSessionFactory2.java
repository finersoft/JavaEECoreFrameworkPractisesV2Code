package orm;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory2 {
	// 0.1版本
	// new版本
	public static SessionFactory getSessionFactory() {
		Configuration config = new Configuration();
		config.configure("hibernateABCABC.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		return factory;
	}
}

// (1)hibernate在3.0(包括3.0)版本之前使用3行代码获得工厂
// (2)hibernate在4.0使用3行代码获得工厂时
// 使用buildSessionhFactory()方法在此版本中被作废
// (3)所以要使用很多行来获得工厂，造成使用Hibernate程序员API过于复杂
// (4)官方收到请求，在最新版本的jar中支持旧版本3行的写法
