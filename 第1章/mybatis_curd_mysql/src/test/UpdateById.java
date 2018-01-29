package test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import dbtools.DBTools;
import entity.Userinfo;

public class UpdateById {
	public static void main(String[] args) throws IOException {
		SqlSession session = DBTools.getSqlSession();
		Userinfo userinfo = session.selectOne("selectById", 32L);
		userinfo.setUsername("xxxxxx");
		userinfo.setPassword("xxxxxxxxxxxxx");
		userinfo.setAge(200L);
		session.update("updateById", userinfo);
		session.commit();
		session.close();
	}
}
