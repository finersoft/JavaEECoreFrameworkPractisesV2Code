package test;

import java.io.IOException;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity1.Userinfo;
import mapping.UserinfoMapper;

public class Insert {
	// Spring的DI容器里面不允许存放不同包中相同的类名
	public static void main(String[] args) throws IOException {
		Userinfo userinfo = new Userinfo();
		userinfo.setUsername("中国");
		userinfo.setPassword("中国人");
		userinfo.setAge(100L);
		userinfo.setInsertdate(new Date());

		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		mapper.insertUserinfo(userinfo);
		session.commit();
		session.close();

	}

}
