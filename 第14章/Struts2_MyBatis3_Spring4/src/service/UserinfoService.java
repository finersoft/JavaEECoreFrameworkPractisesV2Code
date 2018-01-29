package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Userinfo;
import mapping.AllMapping;

@Service
public class UserinfoService {

	@Autowired
	private AllMapping allMapping;

	public AllMapping getAllMapping() {
		return allMapping;
	}

	public void setAllMapping(AllMapping allMapping) {
		this.allMapping = allMapping;
	}

	public void saveServiceMethod() {
		Userinfo userinfo1 = new Userinfo();
		userinfo1.setUsername("中国");

		Userinfo userinfo2 = new Userinfo();
		userinfo2.setUsername("JavaEE课程全部结束，祝同学们有一个新的开始！");

		allMapping.getUserinfoMapping().save(userinfo1);
		allMapping.getUserinfoMapping().save(userinfo2);
	}

}
