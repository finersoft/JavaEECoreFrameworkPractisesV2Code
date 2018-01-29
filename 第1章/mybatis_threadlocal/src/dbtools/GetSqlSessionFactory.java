package dbtools;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GetSqlSessionFactory {

	private static SqlSessionFactory factory;

	private GetSqlSessionFactory() {
	}

	synchronized public static SqlSessionFactory getSqlSessionFactory() throws IOException {
		if (factory == null) {
			String configFile = "mybatis-config.xml";
			InputStream configStream = Resources.getResourceAsStream(configFile);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			factory = builder.build(configStream);
		}
		return factory;
	}

}
