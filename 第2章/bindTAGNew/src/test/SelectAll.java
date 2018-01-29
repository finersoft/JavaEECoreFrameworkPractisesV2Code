package test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity.Userinfo;
import mapping.UserinfoMapper;

public class SelectAll {

	public static void main(String[] args) throws IOException {
		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		List<Userinfo> listUserinfo = mapper.selectAll1("中国");
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
		}
		System.out.println();
		System.out.println();
		Userinfo userinfo = new Userinfo();
		userinfo.setUsername("中国");
		listUserinfo = mapper.selectAll2(userinfo);
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo eachUserinfo = listUserinfo.get(i);
			System.out.println(eachUserinfo.getId() + " " + eachUserinfo.getUsername() + " "
					+ eachUserinfo.getPassword() + " " + eachUserinfo.getAge() + " " + eachUserinfo.getInsertdate());
		}
		System.out.println();
		System.out.println();
		listUserinfo = mapper.selectAll3(userinfo);
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo eachUserinfo = listUserinfo.get(i);
			System.out.println(eachUserinfo.getId() + " " + eachUserinfo.getUsername() + " "
					+ eachUserinfo.getPassword() + " " + eachUserinfo.getAge() + " " + eachUserinfo.getInsertdate());
		}
		System.out.println();
		System.out.println();
		listUserinfo = mapper.selectAll4(userinfo);
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo eachUserinfo = listUserinfo.get(i);
			System.out.println(eachUserinfo.getId() + " " + eachUserinfo.getUsername() + " "
					+ eachUserinfo.getPassword() + " " + eachUserinfo.getAge() + " " + eachUserinfo.getInsertdate());
		}
		System.out.println();
		System.out.println();
		listUserinfo = mapper.selectAll5(userinfo);
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo eachUserinfo = listUserinfo.get(i);
			System.out.println(eachUserinfo.getId() + " " + eachUserinfo.getUsername() + " "
					+ eachUserinfo.getPassword() + " " + eachUserinfo.getAge() + " " + eachUserinfo.getInsertdate());
		}
		System.out.println();
		System.out.println();
		Map map = new HashMap();
		map.put("username", "中国");
		listUserinfo = mapper.selectAll6(map);
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo eachUserinfo = listUserinfo.get(i);
			System.out.println(eachUserinfo.getId() + " " + eachUserinfo.getUsername() + " "
					+ eachUserinfo.getPassword() + " " + eachUserinfo.getAge() + " " + eachUserinfo.getInsertdate());
		}
		session.commit();
		session.close();
	}

}
