package test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import dbtools.DBTools;
import entity.Userinfo;

public class SelectById {
	public static void main(String[] args) throws IOException {
		SqlSession session = DBTools.getSqlSession();
		Userinfo userinfo = session.selectOne("selectById", 31L);
		System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
				+ userinfo.getAge() + " " + userinfo.getInsertdate());
		session.commit();
		session.close();
	}
}
