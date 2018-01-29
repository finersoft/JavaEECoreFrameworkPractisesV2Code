package dbtools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

	public static Connection getConnectionFromJDBC()
			throws ClassNotFoundException, SQLException {

		String url = "jdbc:sqlserver://localhost:1079;databaseName=ghydb";
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String username = "sa";
		String password = "";

		Class.forName(driverName);
		Connection connection = DriverManager.getConnection(url, username,
				password);
		return connection;
	}

}
