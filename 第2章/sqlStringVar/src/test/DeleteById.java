package test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import mapping.UserinfoMapper;

public class DeleteById {

	public static void main(String[] args) throws IOException {
		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		mapper.deleteById(2152493L);
		session.commit();
		session.close();
	}

}
