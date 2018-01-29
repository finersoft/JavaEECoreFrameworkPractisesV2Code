package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AllDao;
import entity.Userinfo;

@Service
public class UserinfoService {

	@Autowired
	private AllDao allDao;

	public AllDao getAllDao() {
		return allDao;
	}

	public void setAllDao(AllDao allDao) {
		this.allDao = allDao;
	}

	public void saveServiceMethod() {
		Userinfo userinfo1 = new Userinfo();
		userinfo1.setUsername("�й�");

		Userinfo userinfo2 = new Userinfo();
		userinfo2.setUsername(
				"����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");

		allDao.getUserinfoDao().save(userinfo1);
		allDao.getUserinfoDao().save(userinfo2);
	}

}
