package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbtools.GetConnection;
import entity.Userinfo;

public class UserinfoDao {

	public Userinfo findUserinfo(String username, String password)
			throws SQLException, ClassNotFoundException {
		Userinfo userinfo = null;
		String sql = "select * from userinfo where username=? and password=?";
		Connection connection = GetConnection.getConnectionFromJDBC();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String iddb = rs.getString("id");
			String usernamedb = rs.getString("username");
			String passworddb = rs.getString("password");

			userinfo = new Userinfo();
			userinfo.setId(iddb);
			userinfo.setUsername(usernamedb);
			userinfo.setPassword(passworddb);

		}
		rs.close();
		ps.close();
		connection.close();

		return userinfo;
	}
}
