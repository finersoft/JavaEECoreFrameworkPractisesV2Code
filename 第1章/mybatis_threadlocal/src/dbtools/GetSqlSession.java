package dbtools;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

public class GetSqlSession {

	private static ThreadLocal<SqlSession> tl = new ThreadLocal<>();

	public static SqlSession getSqlSession() throws IOException {
		SqlSession session = tl.get();
		if (session == null) {
			session = GetSqlSessionFactory.getSqlSessionFactory().openSession();
			tl.set(session);
		} else {
		}
		return session;
	}

	public static void commit() {
		if (tl.get() != null) {
			tl.get().commit();
			tl.get().close();
			tl.set(null);
		}
	}

	public static void rollback() {
		if (tl.get() != null) {
			tl.get().rollback();
			tl.get().close();
			tl.set(null);
		}
	}

}
