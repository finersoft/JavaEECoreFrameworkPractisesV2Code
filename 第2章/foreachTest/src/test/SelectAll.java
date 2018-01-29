package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity.Userinfo;
import mapping.UserinfoMapper;
import queryentity.QueryEntity;

public class SelectAll {

	public static void main(String[] args) throws IOException {
		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);

		List idList = new ArrayList();
		idList.add(1);
		idList.add(2);

		List<Userinfo> listUserinfo = mapper.selectAll1(idList);
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
		}
		System.out.println();
		QueryEntity entity = new QueryEntity();
		idList.add(3);
		entity.setXxxxxxxxx(idList);
		listUserinfo = mapper.selectAll2(entity);
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
		}
		System.out.println();
		HashMap map = new HashMap();
		idList.add(4);
		map.put("yyyyyyyyyyyy", idList);
		listUserinfo = mapper.selectAll3(map);
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
		}
		System.out.println();
		HashMap map4 = new HashMap();
		map4.put("username", "ÖÐ¹ú");
		listUserinfo = mapper.selectAll4(map4);
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
		}
		session.commit();
		session.close();
	}

}
