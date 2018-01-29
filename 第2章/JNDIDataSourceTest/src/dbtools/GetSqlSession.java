package dbtools;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GetSqlSession {
	public static SqlSession getSqlSession() throws IOException {
		String configFile = "mybatis-config.xml";
		InputStream configStream = Resources.getResourceAsStream(configFile);
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(configStream);

		// 在默认环境下，MyBatis使用的连接池是DBCP！
		System.out.println(factory.getConfiguration().getEnvironment().getDataSource());
		org.apache.tomcat.dbcp.dbcp.BasicDataSource abc;
		//

		return factory.openSession();
	}
}
