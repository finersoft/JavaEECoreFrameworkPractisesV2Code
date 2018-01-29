package test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity.Userinfo;
import mapping.UserinfoMapper;

public class UpdateById {

	public static void main(String[] args) throws IOException {
		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		Userinfo userinfo = mapper.selectById(2142502L);

		userinfo.setUsername("xxxxxxxxxxxx");

		mapper.updateById(userinfo);

		session.commit();
		session.close();
	}

}
