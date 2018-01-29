package test;

import java.io.IOException;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity1.Userinfo;
import mapping.UserinfoMapper;

public class Insert {
	// Spring��DI�������治�����Ų�ͬ������ͬ������
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
