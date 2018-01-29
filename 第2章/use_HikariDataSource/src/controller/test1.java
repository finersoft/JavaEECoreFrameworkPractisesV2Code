package controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Userinfo;
import mapping.UserinfoMapper;

public class test1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String configFile = "mybatis-config.xml";
			InputStream configStream = Resources.getResourceAsStream(configFile);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(configStream);
			SqlSession session = factory.openSession();

			UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);

			Userinfo userinfo1 = mapper.selectById(1L);
			Userinfo userinfo2 = mapper.selectById(2L);
			Userinfo userinfo3 = mapper.selectById(3L);
			Userinfo userinfo4 = mapper.selectById(4L);

			System.out.println(userinfo1.getId() + " " + userinfo1.getUsername());
			System.out.println(userinfo2.getId() + " " + userinfo1.getUsername());
			System.out.println(userinfo3.getId() + " " + userinfo1.getUsername());
			System.out.println(userinfo4.getId() + " " + userinfo1.getUsername());

			session.commit();
			session.close();

			DataSource ds = factory.getConfiguration().getEnvironment().getDataSource();
			for (int i = 0; i < 15; i++) {
				Connection connection = ds.getConnection();
				System.out.println(connection);
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
