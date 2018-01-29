package test;

import java.io.IOException;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity.Userinfo;
import mapping.UserinfoMapper;

public class Insert1 {

	public static void main(String[] args) throws IOException {

		Userinfo userinfo = new Userinfo();
		userinfo.setUsername("�й�");
		userinfo.setPassword("�й���");
		userinfo.setAge(100L);
		userinfo.setInsertdate(new Date());

		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		mapper.insertUserinfo(userinfo);
		session.commit();
		session.close();

	}

}
