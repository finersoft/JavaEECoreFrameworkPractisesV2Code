package dao;

import org.hibernate.SessionFactory;

import orm.Userinfo;

public class UserinfoDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Userinfo userinfo) {
		sessionFactory.getCurrentSession().save(userinfo);
	}
}
