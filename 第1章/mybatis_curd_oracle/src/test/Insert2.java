package test;

import java.io.IOException;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import dbtools.DBTools;
import entity.Userinfo;

public class Insert2 {
	public static void main(String[] args) throws IOException {

		Userinfo userinfo = new Userinfo();
		userinfo.setUsername("中国");
		userinfo.setPassword("中国人");
		userinfo.setAge(100L);
		userinfo.setInsertdate(new Date());

		SqlSession session = DBTools.getSqlSession();
		session.insert("insert2", userinfo);
		session.commit();
		session.close();

		System.out.println(userinfo.getId());
	}
}
