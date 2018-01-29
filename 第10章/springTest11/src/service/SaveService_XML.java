package service;

import org.springframework.stereotype.Component;

@Component(value="serviceXML")
public class SaveService_XML implements ISaveService {
	@Override
	public void saveMethod() {
		System.out.println("将数据保存进XML！");
	}
}
