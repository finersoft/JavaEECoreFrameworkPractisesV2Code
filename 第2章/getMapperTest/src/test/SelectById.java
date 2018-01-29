package test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity.Userinfo;
import mapping.UserinfoMapper;

public class SelectById {

	public static void main(String[] args) throws IOException {
		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		Userinfo userinfo = mapper.selectById(2152493L);
		System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
				+ userinfo.getAge() + " " + userinfo.getInsertdate());
		session.commit();
		session.close();
	}

}
