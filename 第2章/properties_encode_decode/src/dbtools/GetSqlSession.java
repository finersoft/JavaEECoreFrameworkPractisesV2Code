package dbtools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import tools.Tools;

public class GetSqlSession {
	public static SqlSession getSqlSession() throws IOException {
		String configFile = "mybatis-config.xml";
		String dbProperties = "db.properties";
		InputStream configStream = Resources.getResourceAsStream(configFile);
		InputStream propStream = Resources.getResourceAsStream(dbProperties);
		Properties prop = new Properties();
		prop.load(propStream);

		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");

		System.out.println("解密之前 begin");
		System.out.println("driver=" + driver);
		System.out.println("url=" + url);
		System.out.println("username=" + username);
		System.out.println("password=" + password);
		System.out.println("解密之前   end");

		driver = Tools.decodeString(driver);
		url = Tools.decodeString(url);
		username = Tools.decodeString(username);
		password = Tools.decodeString(password);

		System.out.println();

		System.out.println("解密之后 begin");
		System.out.println("driver=" + driver);
		System.out.println("url=" + url);
		System.out.println("username=" + username);
		System.out.println("password=" + password);
		System.out.println("解密之后   end");

		prop.setProperty("driver", driver);
		prop.setProperty("url", url);
		prop.setProperty("username", username);
		prop.setProperty("password", password);

		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(configStream, prop);
		return factory.openSession();
	}
}
