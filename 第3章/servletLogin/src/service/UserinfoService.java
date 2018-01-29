package service;

import java.sql.SQLException;

import dao.UserinfoDao;

public class UserinfoService {

	public boolean login(String username, String password) throws SQLException,
			ClassNotFoundException {
		UserinfoDao userinfoDao = new UserinfoDao();
		if (userinfoDao.findUserinfo(username, password) == null) {
			return false;
		} else {
			return true;
		}
	}

}
