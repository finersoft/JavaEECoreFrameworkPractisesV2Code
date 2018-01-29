package service;

import org.springframework.stereotype.Component;

@Component(value="serviceDB")
public class SaveService_DB implements ISaveService {
	@Override
	public void saveMethod() {
		System.out.println("将数据保存进数据库！");
	}
}
