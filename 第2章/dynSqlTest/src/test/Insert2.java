package test;

import java.io.IOException;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity.Userinfo;
import mapping.UserinfoMapper;

public class Insert2 {

	public static void main(String[] args) throws IOException {

		// Caused by: org.apache.ibatis.type.TypeException: Error setting null
		// for parameter #3 with JdbcType OTHER . Try setting a different
		// JdbcType for this parameter or a different jdbcTypeForNull
		// configuration property. Cause: java.sql.SQLException: 无效的列类型: 1111

		Userinfo userinfo = new Userinfo();
		userinfo.setUsername("中国");
		userinfo.setAge(100L);
		userinfo.setInsertdate(new Date());

		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		mapper.insertUserinfo(userinfo);
		session.commit();
		session.close();

	}

}
