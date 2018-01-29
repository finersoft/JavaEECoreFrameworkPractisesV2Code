package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class test extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			// 从JNDI树中取得DataSource
			// 从DataSource中取得Connection
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:/comp/env/jdbc/myOracle");

			System.out.println(ds);

			Connection connection = ds.getConnection();
			PreparedStatement ps = connection.prepareStatement("select * from userinfo");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("id") + " " + rs.getString("username"));
			}
			rs.close();
			ps.close();
			connection.close();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}
	}

}
