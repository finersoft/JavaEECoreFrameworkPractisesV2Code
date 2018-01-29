package service;

import dao.UserinfoDao;
import orm.Userinfo;

public class UserinfoServcie {

	private UserinfoDao userinfoDao;

	public UserinfoDao getUserinfoDao() {
		return userinfoDao;
	}

	public void setUserinfoDao(UserinfoDao userinfoDao) {
		this.userinfoDao = userinfoDao;
	}

	public void saveService() {
		Userinfo userinfo1 = new Userinfo();
		userinfo1.setUsername("中国1");

		Userinfo userinfo2 = new Userinfo();
		userinfo2.setUsername(
				"中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2中国2");

		userinfoDao.save(userinfo1);
		userinfoDao.save(userinfo2);
	}

}
