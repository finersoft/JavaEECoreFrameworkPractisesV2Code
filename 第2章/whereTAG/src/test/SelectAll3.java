package test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity.Userinfo;
import mapping.UserinfoMapper;

public class SelectAll3 {

	public static void main(String[] args) throws IOException {
		Map map1 = new HashMap();
		map1.put("username", "%中国%");

		Map map2 = new HashMap();
		map2.put("password", "%中国人%");

		Map map3 = new HashMap();

		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		List<Userinfo> listUserinfo = mapper.selectAll2(map1);
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
		}
		System.out.println();
		listUserinfo = mapper.selectAll2(map2);
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
		}
		System.out.println();
		listUserinfo = mapper.selectAll2(map3);
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
		}
		session.commit();
		session.close();
	}

}
