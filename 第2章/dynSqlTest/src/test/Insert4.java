package test;

import java.io.IOException;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity.Userinfo;
import mapping.UserinfoMapper;

public class Insert4 {

	public static void main(String[] args) throws IOException {

		Userinfo userinfo1 = new Userinfo();
		userinfo1.setUsername("中国");
		userinfo1.setPassword("中国人");
		userinfo1.setAge(100L);
		userinfo1.setInsertdate(new Date());

		Userinfo userinfo2 = new Userinfo();
		userinfo2.setUsername("中国");
		userinfo2.setAge(100L);
		userinfo2.setInsertdate(new Date());

		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		mapper.insertUserinfoIf(userinfo1);
		mapper.insertUserinfoIf(userinfo2);
		session.commit();
		session.close();

	}

}
