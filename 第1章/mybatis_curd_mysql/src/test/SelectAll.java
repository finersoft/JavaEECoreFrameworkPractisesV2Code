package test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dbtools.DBTools;
import entity.Userinfo;

public class SelectAll {
	public static void main(String[] args) throws IOException {
		SqlSession session = DBTools.getSqlSession();
		List<Userinfo> listUserinfo = session.selectList("selectAll");
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
		}
		session.commit();
		session.close();
	}
}
