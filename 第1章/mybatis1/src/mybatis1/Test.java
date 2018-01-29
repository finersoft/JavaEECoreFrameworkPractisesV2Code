package mybatis1;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {
	public static void main(String[] args) throws IOException {
		String configFile = "mybatis-config.xml";
		InputStream configStream = 
				Resources.getResourceAsStream(configFile);
		SqlSessionFactoryBuilder builder = 
				new SqlSessionFactoryBuilder();
		// org.apache.ibatis.session.SqlSessionFactory
		// org.apache.ibatis.session.defaults.DefaultSqlSessionFactory@17f6480
		SqlSessionFactory factory = builder.build(configStream);
		System.out.println(factory);
	}
}
