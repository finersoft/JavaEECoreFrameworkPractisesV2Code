package test;

import java.io.IOException;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import dbtools.DBTools;
import entity.Userinfo;

public class Insert1 {
	public static void main(String[] args) throws IOException {

		// ### Error updating database. Cause:
		// java.lang.IllegalArgumentException: Mapped Statements collection does
		// not contain value for insert1

		Userinfo userinfo = new Userinfo();
		userinfo.setUsername("中国");
		userinfo.setPassword("中国人");
		userinfo.setAge(100L);
		userinfo.setInsertdate(new Date());

		SqlSession session = DBTools.getSqlSession();
		session.insert("insert1", userinfo);
		session.commit();
		session.close();

		System.out.println(userinfo.getId());//序列直接写在sql语句中是不会更新model的主键的。
	}
}
