package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class test2 {
	public static void main(String[] args) {
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
